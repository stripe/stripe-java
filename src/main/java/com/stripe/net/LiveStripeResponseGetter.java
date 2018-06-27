package com.stripe.net;

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
import com.stripe.model.StripeObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class LiveStripeResponseGetter implements StripeResponseGetter {
  private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";

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
  private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME
      = "com.stripe.net.customURLStreamHandler";

  private static final SSLSocketFactory socketFactory = new StripeSslSocketFactory();

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

  private static String urlEncodePair(String k, String v)
      throws UnsupportedEncodingException {
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
    Map<String, String> headers = new HashMap<String, String>();

    String userAgent = String.format("Stripe/v1 JavaBindings/%s", Stripe.VERSION);
    if (Stripe.getAppInfo() != null) {
      userAgent += " " + formatAppInfo(Stripe.getAppInfo());
    }
    headers.put("User-Agent", userAgent);

    headers.put("Accept-Charset", ApiResource.CHARSET);
    headers.put("Accept", "application/json");

    headers.put("Authorization", String.format("Bearer %s", options.getApiKey()));

    // debug headers
    String[] propertyNames = {"os.name", "os.version", "os.arch",
        "java.version", "java.vendor", "java.vm.version",
        "java.vm.vendor"};
    Map<String, String> propertyMap = new HashMap<String, String>();
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
    if (options.getStripeVersion() != null) {
      headers.put("Stripe-Version", options.getStripeVersion());
    }
    if (options.getIdempotencyKey() != null) {
      headers.put("Idempotency-Key", options.getIdempotencyKey());
    }
    if (options.getStripeAccount() != null) {
      headers.put("Stripe-Account", options.getStripeAccount());
    }
    return headers;
  }

  @SuppressWarnings("unchecked")
  private static java.net.HttpURLConnection createStripeConnection(
      String url, RequestOptions options) throws IOException {
    URL stripeUrl;
    String customUrlStreamHandlerClassName = System.getProperty(
        CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME, null);
    if (customUrlStreamHandlerClassName != null) {
      // instantiate the custom handler provided
      try {
        Class<URLStreamHandler> clazz = (Class<URLStreamHandler>) Class
            .forName(customUrlStreamHandlerClassName);
        Constructor<URLStreamHandler> constructor = clazz
            .getConstructor();
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
      Authenticator.setDefault(new Authenticator() {
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
    if (conn instanceof HttpsURLConnection) {
      ((HttpsURLConnection) conn).setSSLSocketFactory(socketFactory);
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

  private static java.net.HttpURLConnection createGetConnection(
      String url, String query, RequestOptions options) throws IOException {
    String getUrl = formatUrl(url, query);
    java.net.HttpURLConnection conn = createStripeConnection(getUrl, options);
    conn.setRequestMethod("GET");

    return conn;
  }

  private static java.net.HttpURLConnection createPostConnection(
      String url, String query, RequestOptions options) throws IOException {
    java.net.HttpURLConnection conn = createStripeConnection(url, options);

    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", String.format(
        "application/x-www-form-urlencoded;charset=%s", ApiResource.CHARSET));

    OutputStream output = null;
    try {
      output = conn.getOutputStream();
      output.write(query.getBytes(ApiResource.CHARSET));
    } finally {
      if (output != null) {
        output.close();
      }
    }
    return conn;
  }

  private static java.net.HttpURLConnection createDeleteConnection(
      String url, String query, RequestOptions options) throws IOException {
    String deleteUrl = formatUrl(url, query);
    java.net.HttpURLConnection conn = createStripeConnection(
        deleteUrl, options);
    conn.setRequestMethod("DELETE");

    return conn;
  }

  static String createQuery(Map<String, Object> params)
      throws UnsupportedEncodingException, InvalidRequestException {
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

  private static List<Parameter> flattenParamsList(List<Object> params, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<Parameter>();
    Iterator<?> it = ((List<?>) params).iterator();
    String newPrefix = String.format("%s[]", keyPrefix);

    // Because application/x-www-form-urlencoded cannot represent an empty
    // list, convention is to take the list parameter and just set it to an
    // empty string. (e.g. A regular list might look like `a[]=1&b[]=2`.
    // Emptying it would look like `a=`.)
    if (params.isEmpty()) {
      flatParams.add(new Parameter(keyPrefix, ""));
    } else {
      while (it.hasNext()) {
        flatParams.addAll(flattenParamsValue(it.next(), newPrefix));
      }
    }

    return flatParams;
  }

  private static List<Parameter> flattenParamsArray(Object[] params, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<Parameter>();
    String newPrefix = String.format("%s[]", keyPrefix);

    // Because application/x-www-form-urlencoded cannot represent an empty
    // list, convention is to take the list parameter and just set it to an
    // empty string. (e.g. A regular list might look like `a[]=1&b[]=2`.
    // Emptying it would look like `a=`.)
    if (params.length == 0) {
      flatParams.add(new Parameter(keyPrefix, ""));
    } else {
      for (Object item : params) {
        flatParams.addAll(flattenParamsValue(item, newPrefix));
      }
    }

    return flatParams;
  }

  private static List<Parameter> flattenParamsMap(Map<String, Object> params, String keyPrefix)
      throws InvalidRequestException {
    List<Parameter> flatParams = new ArrayList<Parameter>();
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
    List<Parameter> flatParams = new ArrayList<Parameter>();

    if (value instanceof Map<?, ?>) {
      flatParams = flattenParamsMap((Map<String, Object>) value, keyPrefix);
    } else if (value instanceof List<?>) {
      flatParams = flattenParamsList((List<Object>) value, keyPrefix);
    } else if (value instanceof Object[]) {
      flatParams = flattenParamsArray((Object[]) value, keyPrefix);
    } else if ("".equals(value)) {
      throw new InvalidRequestException("You cannot set '" + keyPrefix + "' to an empty string. "
          + "We interpret empty strings as null in requests. "
          + "You may set '" + keyPrefix + "' to null to delete the property.",
          keyPrefix, null, null, 0, null);
    } else if (value == null) {
      flatParams = new ArrayList<Parameter>();
      flatParams.add(new Parameter(keyPrefix, ""));
    } else {
      flatParams = new ArrayList<Parameter>();
      flatParams.add(new Parameter(keyPrefix, value.toString()));
    }

    return flatParams;
  }

  // represents regular API errors returned as JSON
  // handleAPIError uses this class to raise the appropriate StripeException
  private static class StripeErrorContainer {
    private StripeError error;
  }

  private static class StripeError {
    String type;

    String message;

    String code;

    String param;

    String declineCode;

    String charge;
  }

  // represents OAuth API errors returned as JSON
  // handleOAuthError uses this class to raise the appropriate OAuthException
  private static class StripeOAuthError {
    String error;

    String errorDescription;
  }

  private static String getResponseBody(InputStream responseStream)
      throws IOException {
    try (final Scanner scanner = new Scanner(responseStream, ApiResource.CHARSET)) {
      // \A is the beginning of the stream boundary
      final String responseBody = scanner.useDelimiter("\\A").next();
      responseStream.close();
      return responseBody;
    }
  }

  private static StripeResponse makeUrlConnectionRequest(
      ApiResource.RequestMethod method, String url, String query,
      RequestOptions options) throws ApiConnectionException {
    java.net.HttpURLConnection conn = null;
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
              Stripe.getApiBase(), e.getMessage()), e);
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
    }
  }

  private static StripeResponse rawRequest(
      ApiResource.RequestMethod method, String url, Map<String, Object> params,
      ApiResource.RequestType type, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      ApiException {
    if (options == null) {
      options = RequestOptions.getDefault();
    }
    String originalDnsCacheTtl = null;
    Boolean allowedToSetTtl = true;

    try {
      originalDnsCacheTtl = java.security.Security
          .getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
      // Disable the DNS cache.
      //
      // Unfortunately the original author of this change didn't leave a
      // comment explaining why it was required, but presumably the worry
      // was that cache times were being expanded to a point that was
      // problematic for proper resolution. Various JVM's have pretty
      // good defaults though, so if the user hasn't touched this value,
      // don't touch it either.
      if (originalDnsCacheTtl != null) {
        java.security.Security
            .setProperty(DNS_CACHE_TTL_PROPERTY_NAME, "0");
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
          null, null, 0);
    }

    try {
      StripeResponse response;
      switch (type) {
        case NORMAL:
          response = getStripeResponse(method, url, params, options);
          break;
        case MULTIPART:
          response = getMultipartStripeResponse(method, url, params,
              options);
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
        java.security.Security.setProperty(
            DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
      }
    }
  }

  private static <T> T staticRequest(
      ApiResource.RequestMethod method, String url, Map<String, Object> params,
      Class<T> clazz, ApiResource.RequestType type, RequestOptions options)
      throws StripeException {
    StripeResponse response = rawRequest(method, url, params, type, options);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleApiError(responseBody, responseCode, requestId);
    }

    T resource = ApiResource.GSON.fromJson(responseBody, clazz);

    if (resource instanceof StripeObject) {
      StripeObject obj = (StripeObject)resource;
      obj.setLastResponse(response);
    }
    return resource;
  }

  private static <T> T staticOAuthRequest(
      ApiResource.RequestMethod method, String url, Map<String, Object> params,
      Class<T> clazz, ApiResource.RequestType type, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, ApiException, OAuthException {
    StripeResponse response = rawRequest(method, url, params, type, options);

    int responseCode = response.code();
    String responseBody = response.body();
    String requestId = response.requestId();

    if (responseCode < 200 || responseCode >= 300) {
      handleOAuthError(responseBody, responseCode, requestId);
    }

    T resource = ApiResource.GSON.fromJson(responseBody, clazz);

    return resource;
  }

  private static StripeResponse getStripeResponse(
      ApiResource.RequestMethod method, String url,
      Map<String, Object> params, RequestOptions options)
      throws InvalidRequestException, ApiConnectionException,
      ApiException {
    String query;
    try {
      query = createQuery(params);
    } catch (UnsupportedEncodingException e) {
      throw new InvalidRequestException("Unable to encode parameters to "
          + ApiResource.CHARSET
          + ". Please contact support@stripe.com for assistance.",
          null, null, null, 0, e);
    }

    try {
      // HTTPSURLConnection verifies SSL cert by default
      return makeUrlConnectionRequest(method, url, query, options);
    } catch (ClassCastException ce) {
      // appengine doesn't have HTTPSConnection, use URLFetch API
      String appEngineEnv = System.getProperty(
          "com.google.appengine.runtime.environment", null);
      if (appEngineEnv != null) {
        return makeAppEngineRequest(method, url, query, options);
      } else {
        // non-appengine ClassCastException
        throw ce;
      }
    }
  }

  private static StripeResponse getMultipartStripeResponse(
      ApiResource.RequestMethod method, String url,
      Map<String, Object> params, RequestOptions options)
      throws InvalidRequestException, ApiConnectionException,
      ApiException {

    if (method != ApiResource.RequestMethod.POST) {
      throw new InvalidRequestException(
          "Multipart requests for HTTP methods other than POST "
              + "are currently not supported.", null, null, null, 0, null);
    }

    java.net.HttpURLConnection conn = null;
    try {
      conn = createStripeConnection(url, options);

      String boundary = MultipartProcessor.getBoundary();
      conn.setDoOutput(true);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", String.format(
          "multipart/form-data; boundary=%s", boundary));

      MultipartProcessor multipartProcessor = null;
      try {
        multipartProcessor = new MultipartProcessor(
            conn, boundary, ApiResource.CHARSET);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
          String key = entry.getKey();
          Object value = entry.getValue();

          if (value instanceof File) {
            File currentFile = (File) value;
            if (!currentFile.exists()) {
              throw new InvalidRequestException("File for key "
                  + key + " must exist.", null, null, null, 0, null);
            } else if (!currentFile.isFile()) {
              throw new InvalidRequestException("File for key "
                  + key
                  + " must be a file and not a directory.",
                  null, null, null, 0, null);
            } else if (!currentFile.canRead()) {
              throw new InvalidRequestException(
                  "Must have read permissions on file for key "
                      + key + ".", null, null, null, 0, null);
            }
            multipartProcessor.addFileField(key, currentFile.getName(), 
                new FileInputStream(currentFile));
          } else if (value instanceof InputStream) {
            InputStream inputStream = (InputStream) value;
            if (inputStream.available() == 0) {
              throw new InvalidRequestException(
                "Must have available bytes to read on InputStream for key "
                  + key + ".", null, null, null, 0, null
              );
            }
            multipartProcessor.addFileField(key, "blob", inputStream);
          } else {
            // We only allow a single level of nesting for params
            // for multipart
            multipartProcessor.addFormField(key, (String) value);
          }
        }

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
              Stripe.getApiBase(), e.getMessage()), e);
    } finally {
      if (conn != null) {
        conn.disconnect();
      }
    }

  }

  private static void handleApiError(String responseBody, int responseCode, String requestId)
      throws ApiException, AuthenticationException, CardException, IdempotencyException,
      InvalidRequestException {
    LiveStripeResponseGetter.StripeError error = ApiResource.GSON.fromJson(responseBody,
        LiveStripeResponseGetter.StripeErrorContainer.class).error;
    switch (responseCode) {
      case 400:
      case 404:
        if (error.type.equals("idempotency_error")) {
          throw new IdempotencyException(error.message, requestId, error.code, responseCode);
        } else {
          throw new InvalidRequestException(error.message, error.param, requestId, error.code,
          responseCode, null);
        }
      case 401:
        throw new AuthenticationException(error.message, requestId, error.code, responseCode);
      case 402:
        throw new CardException(error.message, requestId, error.code, error.param,
            error.declineCode, error.charge, responseCode, null);
      case 403:
        throw new PermissionException(error.message, requestId, error.code, responseCode);
      case 429:
        throw new RateLimitException(error.message, error.param, requestId, error.code,
            responseCode, null);
      default:
        throw new ApiException(error.message, requestId, error.code, responseCode, null);
    }
  }

  private static void handleOAuthError(String responseBody, int responseCode, String requestId)
      throws InvalidClientException, InvalidGrantException,
      com.stripe.exception.oauth.InvalidRequestException, InvalidScopeException,
      UnsupportedGrantTypeException, UnsupportedResponseTypeException, ApiException {
    LiveStripeResponseGetter.StripeOAuthError error = ApiResource.GSON.fromJson(responseBody,
        LiveStripeResponseGetter.StripeOAuthError.class);
    String code = error.error;
    String description = (error.errorDescription != null) ? error.errorDescription : code;

    switch (code) {
      case "invalid_client":
        throw new InvalidClientException(code, description, requestId, responseCode, null);
      case "invalid_grant":
        throw new InvalidGrantException(code, description, requestId, responseCode, null);
      case "invalid_request":
        throw new com.stripe.exception.oauth.InvalidRequestException(code, description, requestId,
        responseCode, null);
      case "invalid_scope":
        throw new InvalidScopeException(code, description, requestId, responseCode, null);
      case "unsupported_grant_type":
        throw new UnsupportedGrantTypeException(code, description, requestId, responseCode, null);
      case "unsupported_response_type":
        throw new UnsupportedResponseTypeException(code, description, requestId, responseCode,
            null);
      default:
        throw new ApiException(code, requestId, null, responseCode, null);
    }
  }

  /*
   * This is slower than usual because of reflection but avoids having to
   * maintain AppEngine-specific JAR
   */
  private static StripeResponse makeAppEngineRequest(ApiResource.RequestMethod method,
                             String url, String query, RequestOptions options) throws ApiException {
    String unknownErrorMessage = "Sorry, an unknown error occurred while trying to use the "
        + "Google App Engine runtime. Please contact support@stripe.com for assistance.";
    try {
      if (method == ApiResource.RequestMethod.GET || method == ApiResource.RequestMethod.DELETE) {
        url = String.format("%s?%s", url, query);
      }
      URL fetchUrl = new URL(url);

      Class<?> requestMethodClass = Class
          .forName("com.google.appengine.api.urlfetch.HTTPMethod");
      Object httpMethod = requestMethodClass.getDeclaredField(
          method.name()).get(null);

      Class<?> fetchOptionsBuilderClass = Class
          .forName("com.google.appengine.api.urlfetch.FetchOptions$Builder");
      Object fetchOptions;
      try {
        fetchOptions = fetchOptionsBuilderClass.getDeclaredMethod(
            "validateCertificate").invoke(null);
      } catch (NoSuchMethodException e) {
        System.err
            .println("Warning: this App Engine SDK version does not allow verification of SSL "
                + "certificates; this exposes you to a MITM attack. Please upgrade your App Engine "
                + "SDK to >=1.5.0. If you have questions, contact support@stripe.com.");
        fetchOptions = fetchOptionsBuilderClass.getDeclaredMethod(
            "withDefaults").invoke(null);
      }

      Class<?> fetchOptionsClass = Class
          .forName("com.google.appengine.api.urlfetch.FetchOptions");

      // GAE requests can time out after 60 seconds, so make sure we leave
      // some time for the application to handle a slow Stripe
      fetchOptionsClass.getDeclaredMethod("setDeadline",
          java.lang.Double.class)
          .invoke(fetchOptions, Double.valueOf(55));

      Class<?> requestClass = Class
          .forName("com.google.appengine.api.urlfetch.HTTPRequest");

      Object request = requestClass.getDeclaredConstructor(URL.class,
          requestMethodClass, fetchOptionsClass).newInstance(
          fetchUrl, httpMethod, fetchOptions);

      if (method == ApiResource.RequestMethod.POST) {
        requestClass.getDeclaredMethod("setPayload", byte[].class)
            .invoke(request, query.getBytes(StandardCharsets.UTF_8));
      }

      for (Map.Entry<String, String> header : getHeaders(options)
          .entrySet()) {
        Class<?> httpHeaderClass = Class
            .forName("com.google.appengine.api.urlfetch.HTTPHeader");
        Object reqHeader = httpHeaderClass.getDeclaredConstructor(
            String.class, String.class).newInstance(
            header.getKey(), header.getValue());
        requestClass.getDeclaredMethod("setHeader", httpHeaderClass)
            .invoke(request, reqHeader);
      }

      Class<?> urlFetchFactoryClass = Class
          .forName("com.google.appengine.api.urlfetch.URLFetchServiceFactory");
      Object urlFetchService = urlFetchFactoryClass.getDeclaredMethod(
          "getURLFetchService").invoke(null);

      Method fetchMethod = urlFetchService.getClass().getDeclaredMethod(
          "fetch", requestClass);
      fetchMethod.setAccessible(true);
      Object response = fetchMethod.invoke(urlFetchService, request);

      int responseCode = (Integer) response.getClass()
          .getDeclaredMethod("getResponseCode").invoke(response);
      String body = new String((byte[]) response.getClass()
          .getDeclaredMethod("getContent").invoke(response), ApiResource.CHARSET);
      return new StripeResponse(responseCode, body);
    } catch (InvocationTargetException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (MalformedURLException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (NoSuchFieldException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (SecurityException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (NoSuchMethodException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (ClassNotFoundException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (IllegalArgumentException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (IllegalAccessException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (InstantiationException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    } catch (UnsupportedEncodingException e) {
      throw new ApiException(unknownErrorMessage, null, null, 0, e);
    }
  }
}
