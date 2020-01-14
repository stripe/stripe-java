package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lombok.Cleanup;

public class HttpURLConnectionClient extends HttpClient {
  /**
   * Initializes a new instance of the {@link HttpURLConnectionClient} class with default
   * parameters.
   */
  public HttpURLConnectionClient() {
    super();
  }

  /**
   * Initializes a new instance of the {@link HttpURLConnectionClient} class.
   *
   * @param maxNetworkRetries the maximum number of times the client will retry requests that fail
   *     due to an intermittent problem.
   */
  public HttpURLConnectionClient(int maxNetworkRetries) {
    super(maxNetworkRetries);
  }

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
      HttpHeaders headers = HttpHeaders.of(conn.getHeaderFields());
      String responseBody;

      if (responseCode >= 200 && responseCode < 300) {
        responseBody = getResponseBody(conn.getInputStream());
      } else {
        responseBody = getResponseBody(conn.getErrorStream());
      }

      return new StripeResponse(responseCode, headers, responseBody);

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

  static HttpHeaders getHeaders(StripeRequest request) {
    Map<String, List<String>> userAgentHeadersMap = new HashMap<>();

    userAgentHeadersMap.put("User-Agent", Arrays.asList(buildUserAgentString()));
    userAgentHeadersMap.put(
        "X-Stripe-Client-User-Agent", Arrays.asList(buildXStripeClientUserAgentString()));

    return request.headers().withAdditionalHeaders(userAgentHeadersMap);
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
    for (Map.Entry<String, List<String>> entry : getHeaders(request).map().entrySet()) {
      conn.setRequestProperty(entry.getKey(), String.join(",", entry.getValue()));
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
