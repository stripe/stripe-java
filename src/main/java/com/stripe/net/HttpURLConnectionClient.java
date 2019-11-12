package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.util.Stopwatch;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lombok.Cleanup;

public class HttpURLConnectionClient extends HttpClient {
  /*
   * Set this property to override your environment's default
   * URLStreamHandler; Settings the property should not be needed in most
   * environments.
   */
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME =
      "com.stripe.net.customURLStreamHandler";

  private static final RequestTelemetry requestTelemetry = new RequestTelemetry();

  /**
   * Sends the given request to Stripe's API.
   *
   * @param request the request
   * @return the response
   * @throws AuthenticationException If no API key is provided
   * @throws InvalidRequestException If the request's type is MULTIPART but the method is not POST.
   * @throws ApiConnectionException If an error occurs when sending or receiving
   */
  @Override
  public StripeResponse request(StripeRequest request)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException {
    String apiKey = request.options().getApiKey();
    if (apiKey == null || apiKey.trim().isEmpty()) {
      throw new AuthenticationException(
          "No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. "
              + "You can generate API keys from the Stripe web interface. "
              + "See https://stripe.com/api for details or email support@stripe.com if you have "
              + "questions.",
          null,
          null,
          0);
    }

    StripeResponse response;

    Stopwatch stopwatch = Stopwatch.startNew();

    switch (request.type()) {
      case NORMAL:
        response =
            getStripeResponse(request.method(), request.url(), request.params(), request.options());
        break;
      case MULTIPART:
        response =
            getMultipartStripeResponse(
                request.method(), request.url(), request.params(), request.options());
        break;
      default:
        throw new RuntimeException(
            "Invalid APIResource request type. "
                + "This indicates a bug in the Stripe bindings. Please contact "
                + "support@stripe.com for assistance.");
    }

    stopwatch.stop();

    requestTelemetry.MaybeEnqueueMetrics(response, stopwatch.getElapsed());

    return response;
  }

  private static StripeResponse getStripeResponse(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws ApiConnectionException {
    return makeUrlConnectionRequest(method, url, params, options);
  }

  private static StripeResponse getMultipartStripeResponse(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws InvalidRequestException, ApiConnectionException {

    if (method != ApiResource.RequestMethod.POST) {
      throw new InvalidRequestException(
          "Multipart requests for HTTP methods other than POST " + "are currently not supported.",
          null,
          null,
          null,
          0,
          null);
    }

    java.net.HttpURLConnection conn = null;
    try {
      conn = createStripeConnection(url, options);

      HttpContent httpContent = FormEncoder.createHttpContent(params);

      conn.setDoOutput(true);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", httpContent.contentType());

      @Cleanup OutputStream output = conn.getOutputStream();
      output.write(httpContent.byteArrayContent());

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

  static String formatAppInfo(Map<String, String> info) {
    String str = info.get("name");
    if (info.get("version") != null) {
      str += String.format("/%s", info.get("version"));
    }
    if (info.get("url") != null) {
      str += String.format(" (%s)", info.get("url"));
    }
    return str;
  }

  static Map<String, String> getHeaders(RequestOptions options) {
    Map<String, String> headers = new HashMap<>();

    String userAgent = String.format("Stripe/v1 JavaBindings/%s", Stripe.VERSION);
    if (Stripe.getAppInfo() != null) {
      userAgent += " " + formatAppInfo(Stripe.getAppInfo());
    }
    headers.put("User-Agent", userAgent);

    headers.put("Accept-Charset", ApiResource.CHARSET);
    headers.put("Accept", "application/json");

    headers.put("Authorization", String.format("Bearer %s", options.getApiKey()));

    // debug headers
    String[] propertyNames = {
      "os.name",
      "os.version",
      "os.arch",
      "java.version",
      "java.vendor",
      "java.vm.version",
      "java.vm.vendor"
    };
    Map<String, String> propertyMap = new HashMap<>();
    for (String propertyName : propertyNames) {
      propertyMap.put(propertyName, System.getProperty(propertyName));
    }
    propertyMap.put("bindings.version", Stripe.VERSION);
    propertyMap.put("lang", "Java");
    propertyMap.put("publisher", "Stripe");
    if (Stripe.getAppInfo() != null) {
      propertyMap.put("application", ApiResource.GSON.toJson(Stripe.getAppInfo()));
    }
    headers.put("X-Stripe-Client-User-Agent", ApiResource.GSON.toJson(propertyMap));

    // for some APIs, the client is making request on behalf of other clients
    // (like mobile for ephemeral key), so Stripe-Version is override instead of the pinned value.
    if (options.getStripeVersionOverride() != null) {
      headers.put("Stripe-Version", options.getStripeVersionOverride());
    } else if (options.getStripeVersion() != null) {
      headers.put("Stripe-Version", options.getStripeVersion());
    } else {
      throw new IllegalStateException(
          "Either `stripeVersion`, or `stripeVersionOverride` " + "value must be set.");
    }
    if (options.getIdempotencyKey() != null) {
      headers.put("Idempotency-Key", options.getIdempotencyKey());
    }
    if (options.getStripeAccount() != null) {
      headers.put("Stripe-Account", options.getStripeAccount());
    }

    requestTelemetry.MaybeAddTelemetryHeader(headers);

    return headers;
  }

  @SuppressWarnings("unchecked")
  private static HttpURLConnection createStripeConnection(String url, RequestOptions options)
      throws IOException {
    URL stripeUrl;
    String customUrlStreamHandlerClassName =
        System.getProperty(CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME, null);
    if (customUrlStreamHandlerClassName != null) {
      // instantiate the custom handler provided
      try {
        Class<URLStreamHandler> clazz =
            (Class<URLStreamHandler>) Class.forName(customUrlStreamHandlerClassName);
        Constructor<URLStreamHandler> constructor = clazz.getConstructor();
        URLStreamHandler customHandler = constructor.newInstance();
        stripeUrl = new URL(null, url, customHandler);
      } catch (ClassNotFoundException e) {
        throw new IOException(e);
      } catch (SecurityException e) {
        throw new IOException(e);
      } catch (NoSuchMethodException e) {
        throw new IOException(e);
      } catch (IllegalArgumentException e) {
        throw new IOException(e);
      } catch (InstantiationException e) {
        throw new IOException(e);
      } catch (IllegalAccessException e) {
        throw new IOException(e);
      } catch (InvocationTargetException e) {
        throw new IOException(e);
      }
    } else {
      stripeUrl = new URL(url);
    }
    HttpURLConnection conn;
    if (Stripe.getConnectionProxy() != null) {
      conn = (HttpURLConnection) stripeUrl.openConnection(Stripe.getConnectionProxy());
      Authenticator.setDefault(
          new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
              return Stripe.getProxyCredential();
            }
          });
    } else {
      conn = (HttpURLConnection) stripeUrl.openConnection();
    }
    conn.setConnectTimeout(options.getConnectTimeout());
    conn.setReadTimeout(options.getReadTimeout());
    conn.setUseCaches(false);
    for (Map.Entry<String, String> header : getHeaders(options).entrySet()) {
      conn.setRequestProperty(header.getKey(), header.getValue());
    }

    return conn;
  }

  private static String formatUrl(String url, String query) {
    if (query == null || query.isEmpty()) {
      return url;
    } else {
      // In some cases, URL can already contain a question mark (eg, upcoming invoice lines)
      String separator = url.contains("?") ? "&" : "?";
      return String.format("%s%s%s", url, separator, query);
    }
  }

  private static HttpURLConnection createGetConnection(
      String url, Map<String, Object> params, RequestOptions options) throws IOException {
    String getUrl = formatUrl(url, FormEncoder.createQueryString(params));
    HttpURLConnection conn = createStripeConnection(getUrl, options);
    conn.setRequestMethod("GET");

    return conn;
  }

  private static HttpURLConnection createPostConnection(
      String url, Map<String, Object> params, RequestOptions options) throws IOException {
    HttpURLConnection conn = createStripeConnection(url, options);

    HttpContent httpContent = FormEncoder.createHttpContent(params);

    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", httpContent.contentType());

    @Cleanup OutputStream output = conn.getOutputStream();
    output.write(httpContent.byteArrayContent());

    return conn;
  }

  private static HttpURLConnection createDeleteConnection(
      String url, Map<String, Object> params, RequestOptions options) throws IOException {
    String deleteUrl = formatUrl(url, FormEncoder.createQueryString(params));
    HttpURLConnection conn = createStripeConnection(deleteUrl, options);
    conn.setRequestMethod("DELETE");

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

  private static StripeResponse makeUrlConnectionRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws ApiConnectionException {
    HttpURLConnection conn = null;
    try {
      switch (method) {
        case GET:
          conn = createGetConnection(url, params, options);
          break;
        case POST:
          conn = createPostConnection(url, params, options);
          break;
        case DELETE:
          conn = createDeleteConnection(url, params, options);
          break;
        default:
          throw new ApiConnectionException(
              String.format(
                  "Unrecognized HTTP method %s. "
                      + "This indicates a bug in the Stripe bindings. Please contact "
                      + "support@stripe.com for assistance.",
                  method));
      }
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
}
