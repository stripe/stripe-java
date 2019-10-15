package com.stripe.net;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.IdempotencyException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.PermissionException;
import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.exception.oauth.InvalidClientException;
import com.stripe.exception.oauth.InvalidGrantException;
import com.stripe.exception.oauth.InvalidScopeException;
import com.stripe.exception.oauth.OAuthException;
import com.stripe.exception.oauth.UnsupportedGrantTypeException;
import com.stripe.exception.oauth.UnsupportedResponseTypeException;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.model.oauth.OAuthError;
import java.io.File;
import java.io.FileInputStream;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Cleanup;

public class LiveStripeResponseGetter implements StripeResponseGetter {
  private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
  private static final int MAX_REQUEST_METRICS_BUFFER_SIZE = 100;

  private static final class Parameter {
    public final String key;
    public final String value;

    public Parameter(String key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  /*
   * Set this property to override your environment's default
   * URLStreamHandler; Settings the property should not be needed in most
   * environments.
   */
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME =
      "com.stripe.net.customURLStreamHandler";

  @Override
  public <T> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException {
    return staticRequest(method, url, params, clazz, type, options);
  }

  @Override
  public <T> T oauthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException {
    return staticOAuthRequest(method, url, params, clazz, type, options);
  }

  private static String urlEncodePair(String k, String v) {
    return String.format("%s=%s", ApiResource.urlEncode(k), ApiResource.urlEncode(v));
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

    RequestMetrics lastRequestMetrics = prevRequestMetrics.poll();
    if (Stripe.enableTelemetry && lastRequestMetrics != null) {
      headers.put(
          "X-Stripe-Client-Telemetry", ApiResource.GSON.toJson(lastRequestMetrics.payload()));
    }

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

  static String createQuery(Map<String, Object> params) throws InvalidRequestException {
    StringBuilder queryStringBuffer = new StringBuilder();
    List<Parameter> flatParams = flattenParams(params);
    Iterator<Parameter> it = flatParams.iterator();

    while (it.hasNext()) {
      if (queryStringBuffer.length() > 0) {
        queryStringBuffer.append("&");
      }
      Parameter param = it.next();
      queryStringBuffer.append(urlEncodePair(param.key, param.value));
    }

    return queryStringBuffer.toString();
  }

  private static List<Parameter> flattenParams(Map<String, Object> params)
      throws InvalidRequestException {
    return flattenParamsMap(params, null);
  }

  private static List<Parameter> flattenParamsCollection(
      Collection<Object> params, String keyPrefix) throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<>();
    // Rely on the collection specific implementation for iterator to provide the order and the
    // indices of elements in the array encoding
    Iterator<?> it = params.iterator();
    // Because application/x-www-form-urlencoded cannot represent an empty
    // list, convention is to take the list parameter and just set it to an
    // empty string. (e.g. A regular list might look like `a[0]=1&b[1]=2`.
    // Emptying it would look like `a=`.)
    if (params.isEmpty()) {
      flatParams.add(new Parameter(keyPrefix, ""));
    } else {
      int index = 0;
      while (it.hasNext()) {
        String newPrefix = String.format("%s[%d]", keyPrefix, index++);
        flatParams.addAll(flattenParamsValue(it.next(), newPrefix));
      }
    }

    return flatParams;
  }

  private static List<Parameter> flattenParamsArray(Object[] params, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<>();

    // Because application/x-www-form-urlencoded cannot represent an empty
    // list, convention is to take the list parameter and just set it to an
    // empty string. (e.g. A regular list might look like `a[0]=1&b[1]=2`.
    // Emptying it would look like `a=`.)
    if (params.length == 0) {
      flatParams.add(new Parameter(keyPrefix, ""));
    } else {
      for (int i = 0; i < params.length; i++) {
        String newPrefix = String.format("%s[%d]", keyPrefix, i);
        flatParams.addAll(flattenParamsValue(params[i], newPrefix));
      }
    }

    return flatParams;
  }

  private static List<Parameter> flattenParamsMap(Map<String, Object> params, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<>();
    if (params == null) {
      return flatParams;
    }

    for (Map.Entry<String, Object> entry : params.entrySet()) {
      String key = entry.getKey();
      Object value = entry.getValue();

      String newPrefix = key;
      if (keyPrefix != null) {
        newPrefix = String.format("%s[%s]", keyPrefix, key);
      }

      flatParams.addAll(flattenParamsValue(value, newPrefix));
    }

    return flatParams;
  }

  @SuppressWarnings("unchecked")
  private static List<Parameter> flattenParamsValue(Object value, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams;

    if (value instanceof Map<?, ?>) {
      flatParams = flattenParamsMap((Map<String, Object>) value, keyPrefix);
    } else if (value instanceof Collection<?>) {
      flatParams = flattenParamsCollection((Collection<Object>) value, keyPrefix);
    } else if (value instanceof Object[]) {
      flatParams = flattenParamsArray((Object[]) value, keyPrefix);
    } else if ("".equals(value)) {
      throw new InvalidRequestException(
          "You cannot set '"
              + keyPrefix
              + "' to an empty string. "
              + "We interpret empty strings as null in requests. "
              + "You may set '"
              + keyPrefix
              + "' to null to delete the property.",
          keyPrefix,
          null,
          null,
          0,
          null);
    } else if (value == null) {
      flatParams = new ArrayList<>();
      flatParams.add(new Parameter(keyPrefix, ""));
    } else if ((value instanceof File) || (value instanceof InputStream)) {
      throw new InvalidRequestException(
          String.format(
              "java.io.File or java.io.InputStream %s is not supported at '%s' parameter. "
                  + "Please check our API reference for the parameter type, "
                  + "or use the provided parameter class instead.",
              value, keyPrefix),
          keyPrefix,
          null,
          null,
          0,
          null);
    } else {
      flatParams = new ArrayList<>();
      flatParams.add(new Parameter(keyPrefix, value.toString()));
    }

    return flatParams;
  }

  private static ConcurrentLinkedQueue<RequestMetrics> prevRequestMetrics =
      new ConcurrentLinkedQueue<RequestMetrics>();

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

  private static StripeResponse rawRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      ApiResource.RequestType type,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
          ApiException {
    if (options == null) {
      options = RequestOptions.getDefault();
    }
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

    String apiKey = options.getApiKey();
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
      switch (type) {
        case NORMAL:
          response = getStripeResponse(method, url, params, options);
          break;
        case MULTIPART:
          response = getMultipartStripeResponse(method, url, params, options);
          break;
        default:
          throw new RuntimeException(
              "Invalid APIResource request type. "
                  + "This indicates a bug in the Stripe bindings. Please contact "
                  + "support@stripe.com for assistance.");
      }
      return response;
    } finally {
      if (allowedToSetTtl && originalDnsCacheTtl != null) {
        java.security.Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
      }
    }
  }

  private static <T> T staticRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException {
    long requestStartMs = System.currentTimeMillis();

    StripeResponse response = rawRequest(method, url, params, type, options);

    long requestDurationMs = System.currentTimeMillis() - requestStartMs;

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleApiError(response);
    }

    T resource = null;
    try {
      resource = ApiResource.GSON.fromJson(responseBody, clazz);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(responseBody, responseCode, requestId);
    }

    if (resource instanceof StripeObject) {
      StripeObject obj = (StripeObject) resource;
      obj.setLastResponse(response);
    }

    if (Stripe.enableTelemetry && prevRequestMetrics.size() < MAX_REQUEST_METRICS_BUFFER_SIZE) {
      prevRequestMetrics.add(new RequestMetrics(requestId, requestDurationMs));
    }

    return resource;
  }

  private static <T> T staticOAuthRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      ApiResource.RequestType type,
      RequestOptions options)
      throws StripeException {
    StripeResponse response = rawRequest(method, url, params, type, options);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleOAuthError(response);
    }

    T resource = null;
    try {
      resource = ApiResource.GSON.fromJson(responseBody, clazz);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(responseBody, responseCode, requestId);
    }

    return resource;
  }

  private static StripeResponse getStripeResponse(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options)
      throws InvalidRequestException, ApiConnectionException, ApiException {
    String query = createQuery(params);
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
        encodeMultipartParams(multipartProcessor, params);
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

  /**
   * Encode multipart params as a counter-part method to {@link this#createQuery(Map)} for encoding
   * params for non-multipart request.
   *
   * @param multipartProcessor multi-part processor handling encoding of input stream and basic
   *     key-value forms.
   * @param params parameter map that can contain file or input stream.
   */
  static void encodeMultipartParams(
      MultipartProcessor multipartProcessor, Map<String, Object> params)
      throws InvalidRequestException, IOException {

    for (Map.Entry<String, Object> entry : params.entrySet()) {
      String key = entry.getKey();
      Object value = entry.getValue();

      if (value instanceof File) {
        File currentFile = (File) value;
        if (!currentFile.exists()) {
          throw new InvalidRequestException(
              "File for key " + key + " must exist.", null, null, null, 0, null);
        } else if (!currentFile.isFile()) {
          throw new InvalidRequestException(
              "File for key " + key + " must be a file and not a directory.",
              null,
              null,
              null,
              0,
              null);
        } else if (!currentFile.canRead()) {
          throw new InvalidRequestException(
              "Must have read permissions on file for key " + key + ".", null, null, null, 0, null);
        }
        multipartProcessor.addFileField(
            key, currentFile.getName(), new FileInputStream(currentFile));
      } else if (value instanceof InputStream) {
        @Cleanup InputStream inputStream = (InputStream) value;
        if (inputStream.available() == 0) {
          throw new InvalidRequestException(
              "Must have available bytes to read on InputStream for key " + key + ".",
              null,
              null,
              null,
              0,
              null);
        }
        multipartProcessor.addFileField(key, "blob", inputStream);
      } else {
        List<Parameter> parameters = flattenParamsValue(value, key);
        for (Parameter parameter : parameters) {
          multipartProcessor.addFormField(parameter.key, parameter.value);
        }
      }
    }
  }

  private static void raiseMalformedJsonError(
      String responseBody, int responseCode, String requestId) throws ApiException {
    throw new ApiException(
        String.format(
            "Invalid response object from API: %s. (HTTP response code was %d)",
            responseBody, responseCode),
        requestId,
        null,
        responseCode,
        null);
  }

  private static void handleApiError(StripeResponse response) throws StripeException {
    StripeError error = null;
    StripeException exception = null;

    try {
      JsonObject jsonObject =
          ApiResource.GSON.fromJson(response.body(), JsonObject.class).getAsJsonObject("error");
      error = ApiResource.GSON.fromJson(jsonObject, StripeError.class);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }
    if (error == null) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }

    error.setLastResponse(response);

    switch (response.code()) {
      case 400:
      case 404:
        if ("idempotency_error".equals(error.getType())) {
          exception =
              new IdempotencyException(
                  error.getMessage(), response.requestId(), error.getCode(), response.code());
        } else {
          exception =
              new InvalidRequestException(
                  error.getMessage(),
                  error.getParam(),
                  response.requestId(),
                  error.getCode(),
                  response.code(),
                  null);
        }
        break;
      case 401:
        exception =
            new AuthenticationException(
                error.getMessage(), response.requestId(), error.getCode(), response.code());
        break;
      case 402:
        exception =
            new CardException(
                error.getMessage(),
                response.requestId(),
                error.getCode(),
                error.getParam(),
                error.getDeclineCode(),
                error.getCharge(),
                response.code(),
                null);
        break;
      case 403:
        exception =
            new PermissionException(
                error.getMessage(), response.requestId(), error.getCode(), response.code());
        break;
      case 429:
        exception =
            new RateLimitException(
                error.getMessage(),
                error.getParam(),
                response.requestId(),
                error.getCode(),
                response.code(),
                null);
        break;
      default:
        exception =
            new ApiException(
                error.getMessage(), response.requestId(), error.getCode(), response.code(), null);
        break;
    }

    exception.setStripeError(error);

    throw exception;
  }

  private static void handleOAuthError(StripeResponse response) throws StripeException {
    OAuthError error = null;
    StripeException exception = null;

    try {
      error = ApiResource.GSON.fromJson(response.body(), OAuthError.class);
    } catch (JsonSyntaxException e) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }
    if (error == null) {
      raiseMalformedJsonError(response.body(), response.code(), response.requestId());
    }

    error.setLastResponse(response);

    String code = error.getError();
    String description = (error.getErrorDescription() != null) ? error.getErrorDescription() : code;

    switch (code) {
      case "invalid_client":
        exception =
            new InvalidClientException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_grant":
        exception =
            new InvalidGrantException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_request":
        exception =
            new com.stripe.exception.oauth.InvalidRequestException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "invalid_scope":
        exception =
            new InvalidScopeException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "unsupported_grant_type":
        exception =
            new UnsupportedGrantTypeException(
                code, description, response.requestId(), response.code(), null);
        break;
      case "unsupported_response_type":
        exception =
            new UnsupportedResponseTypeException(
                code, description, response.requestId(), response.code(), null);
        break;
      default:
        exception = new ApiException(code, response.requestId(), null, response.code(), null);
        break;
    }

    if (exception instanceof OAuthException) {
      ((OAuthException) exception).setOauthError(error);
    }

    throw exception;
  }
}
