package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lombok.Cleanup;

public class HttpURLConnectionClient extends HttpClient {
  /**
   * Sends the given request to Stripe's API.
   *
   * @param request the request
   * @return the response
   * @throws ApiConnectionException if an error occurs when sending or receiving
   */
  @Override
  public StripeResponse request(StripeRequest request) throws ApiConnectionException {
    HttpURLConnection conn = null;

    try {
      conn = createStripeConnection(request);

      // trigger the request
      int responseCode = conn.getResponseCode();
      String responseBody;
      Map<String, List<String>> headers;

      if (responseCode >= 200 && responseCode < 300) {
        responseBody = getResponseBody(conn.getInputStream());
      } else {
        responseBody = getResponseBody(conn.getErrorStream());
      }

      headers = conn.getHeaderFields();

      return new StripeResponse(responseCode, responseBody, headers);

    } catch (IOException e) {
      throw new ApiConnectionException(
          String.format(
              "IOException during API request to Stripe (%s): %s "
                  + "Please check your internet connection and try again. If this problem persists,"
                  + "you should check Stripe's service status at https://twitter.com/stripestatus,"
                  + " or let us know at support@stripe.com.",
              Stripe.getApiBase(), e.getMessage()),
          e);
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
    }
  }

  static Map<String, String> getHeaders(StripeRequest request) {
    Map<String, String> headers = new HashMap<>();

    headers.putAll(request.headers());

    headers.put("Accept-Charset", ApiResource.CHARSET);
    headers.put("Accept", "application/json");

    headers.put("User-Agent", buildUserAgentString());
    headers.put("X-Stripe-Client-User-Agent", buildXStripeClientUserAgentString());

    return headers;
  }

  private static HttpURLConnection createStripeConnection(StripeRequest request)
      throws IOException, ApiConnectionException {
    HttpURLConnection conn = null;

    if (Stripe.getConnectionProxy() != null) {
      conn = (HttpURLConnection) request.url().openConnection(Stripe.getConnectionProxy());
      Authenticator.setDefault(
          new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
              return Stripe.getProxyCredential();
            }
          });
    } else {
      conn = (HttpURLConnection) request.url().openConnection();
    }

    conn.setConnectTimeout(request.options().getConnectTimeout());
    conn.setReadTimeout(request.options().getReadTimeout());
    conn.setUseCaches(false);
    for (Map.Entry<String, String> header : getHeaders(request).entrySet()) {
      conn.setRequestProperty(header.getKey(), header.getValue());
    }

    conn.setRequestMethod(request.method().name());

    if (request.content() != null) {
      conn.setDoOutput(true);
      conn.setRequestProperty("Content-Type", request.content().contentType());

      @Cleanup OutputStream output = conn.getOutputStream();
      output.write(request.content().byteArrayContent());
    }

    return conn;
  }

  private static String getResponseBody(InputStream responseStream) throws IOException {
    try (final Scanner scanner = new Scanner(responseStream, ApiResource.CHARSET)) {
      // \A is the beginning of the stream boundary
      final String responseBody = scanner.useDelimiter("\\A").next();
      responseStream.close();
      return responseBody;
    }
  }
}
