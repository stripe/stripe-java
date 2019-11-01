package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.InvalidRequestException;
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
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lombok.Cleanup;

public class HttpClient {
  private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";

  /*
   * Set this property to override your environment's default
   * URLStreamHandler; Settings the property should not be needed in most
   * environments.
   */
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME =
      "com.stripe.net.customURLStreamHandler";

  private static final RequestTelemetry requestTelemetry = new RequestTelemetry();

  public StripeResponse request(StripeRequest request)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
          ApiException {
    String originalDnsCacheTtl = null;
    Boolean allowedToSetTtl = true;

    try {
      originalDnsCacheTtl = java.security.Security.getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
      // Disable the DNS cache.
      //
      // Unfortunately the original author of this change didn't leave a
      // comment explaining why it was required, but presumably the worry
      // was that cache times were being expanded to a point that was
      // problematic for proper resolution. Various JVM's have pretty
      // good defaults though, so if the user hasn't touched this value,
      // don't touch it either.
      if (originalDnsCacheTtl != null) {
        java.security.Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, "0");
      }
    } catch (SecurityException se) {
      allowedToSetTtl = false;
    }

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

    try {
      StripeResponse response;

      long requestStartNanos = System.nanoTime();

      switch (request.type()) {
        case NORMAL:
          response =
              getStripeResponse(
                  request.method(), request.url(), request.params(), request.options());
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

      Duration requestDuration = Duration.ofNanos(System.nanoTime() - requestStartNanos);

      requestTelemetry.MaybeEnqueueMetrics(response, requestDuration);

      return response;
    } finally {
      if (allowedToSetTtl && originalDnsCacheTtl != null) {
        java.security.Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
      }
    }
  }

  private static StripeResponse getStripeResponse(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws InvalidRequestException, ApiConnectionException, ApiException {
    String query = FormEncoder.createQueryString(params);
    return makeUrlConnectionRequest(method, url, query, options);
  }

  private static StripeResponse getMultipartStripeResponse(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws InvalidRequestException, ApiConnectionException, ApiException {

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

      String boundary = MultipartProcessor.getBoundary();
      conn.setDoOutput(true);
      conn.setRequestMethod("POST");
      conn.setRequestProperty(
          "Content-Type", String.format("multipart/form-data; boundary=%s", boundary));

      MultipartProcessor multipartProcessor = null;
      try {
        multipartProcessor = new MultipartProcessor(conn, boundary, ApiResource.CHARSET);
        FormEncoder.encodeMultipartParams(multipartProcessor, params);
      } finally {
        if (multipartProcessor != null) {
          multipartProcessor.finish();
        }
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
      String url, String query, RequestOptions options) throws IOException {
    String getUrl = formatUrl(url, query);
    HttpURLConnection conn = createStripeConnection(getUrl, options);
    conn.setRequestMethod("GET");

    return conn;
  }

  private static HttpURLConnection createPostConnection(
      String url, String query, RequestOptions options) throws IOException {
    HttpURLConnection conn = createStripeConnection(url, options);

    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty(
        "Content-Type",
        String.format("application/x-www-form-urlencoded;charset=%s", ApiResource.CHARSET));

    @Cleanup OutputStream output = conn.getOutputStream();
    output.write(query.getBytes(ApiResource.CHARSET));

    return conn;
  }

  private static HttpURLConnection createDeleteConnection(
      String url, String query, RequestOptions options) throws IOException {
    String deleteUrl = formatUrl(url, query);
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
      ApiResource.RequestMethod method, String url, String query, RequestOptions options)
      throws ApiConnectionException {
    HttpURLConnection conn = null;
    try {
      switch (method) {
        case GET:
          conn = createGetConnection(url, query, options);
          break;
        case POST:
          conn = createPostConnection(url, query, options);
          break;
        case DELETE:
          conn = createDeleteConnection(url, query, options);
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
