package com.stripe;

import com.google.gson.JsonObject;
import com.stripe.exception.*;
import com.stripe.model.*;
import com.stripe.net.*;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

public abstract class Stripe {
  public static final int DEFAULT_CONNECT_TIMEOUT = 30 * 1000;
  public static final int DEFAULT_READ_TIMEOUT = 80 * 1000;

  public static final String API_VERSION = ApiVersion.CURRENT;
  public static final String PREVIEW_API_VERSION = ApiVersion.PREVIEW_CURRENT;
  public static final String CONNECT_API_BASE = "https://connect.stripe.com";
  public static final String LIVE_API_BASE = "https://api.stripe.com";
  public static final String UPLOAD_API_BASE = "https://files.stripe.com";
  public static final String VERSION = "26.7.0-beta.1";

  public static volatile String apiKey;
  public static volatile String clientId;
  public static volatile boolean enableTelemetry = true;
  public static volatile String partnerId;

  /**
   * Stripe API version which is sent by default on requests. This can be updated to include beta
   * headers.
   *
   * <p>Pointing to different API versions than {@code API_VERSION} can lead to deserialziation
   * errors and should be avoided.
   */
  public static volatile String stripeVersion = API_VERSION;

  /** Add a specified beta to the global Stripe API Version. Only call this method once per beta. */
  public static void addBetaVersion(String betaName, String betaVersion) {
    if (stripeVersion.indexOf("; " + betaName + "=") >= 0) {
      throw new RuntimeException(
          String.format(
              "Stripe version header %s already contains entry for beta %s",
              stripeVersion, betaName));
    }

    stripeVersion = String.format("%s; %s=%s", stripeVersion, betaName, betaVersion);
  }

  // Note that URLConnection reserves the value of 0 to mean "infinite
  // timeout", so we use -1 here to represent an unset value which should
  // fall back to a default.
  private static volatile int connectTimeout = -1;
  private static volatile int readTimeout = -1;

  private static volatile int maxNetworkRetries = 0;

  private static volatile String apiBase = LIVE_API_BASE;
  private static volatile String connectBase = CONNECT_API_BASE;
  private static volatile String uploadBase = UPLOAD_API_BASE;
  private static volatile Proxy connectionProxy = null;
  private static volatile PasswordAuthentication proxyCredential = null;

  private static volatile Map<String, String> appInfo = null;

  /**
   * (FOR TESTING ONLY) If you'd like your API requests to hit your own (mocked) server, you can set
   * this up here by overriding the base api URL.
   */
  public static void overrideApiBase(final String overriddenApiBase) {
    apiBase = overriddenApiBase;
  }

  public static String getApiBase() {
    return apiBase;
  }

  /**
   * (FOR TESTING ONLY) If you'd like your OAuth requests to hit your own (mocked) server, you can
   * set this up here by overriding the base Connect URL.
   */
  public static void overrideConnectBase(final String overriddenConnectBase) {
    connectBase = overriddenConnectBase;
  }

  public static String getConnectBase() {
    return connectBase;
  }

  /**
   * (FOR TESTING ONLY) If you'd like your upload requests to hit your own (mocked) server, you can
   * set this up here by overriding the base api URL.
   */
  public static void overrideUploadBase(final String overriddenUploadBase) {
    uploadBase = overriddenUploadBase;
  }

  public static String getUploadBase() {
    return uploadBase;
  }

  /**
   * Set proxy to tunnel all Stripe connections.
   *
   * @param proxy proxy host and port setting
   */
  public static void setConnectionProxy(final Proxy proxy) {
    connectionProxy = proxy;
  }

  public static Proxy getConnectionProxy() {
    return connectionProxy;
  }

  /**
   * Returns the connection timeout.
   *
   * @return timeout value in milliseconds
   */
  public static int getConnectTimeout() {
    if (connectTimeout == -1) {
      return DEFAULT_CONNECT_TIMEOUT;
    }
    return connectTimeout;
  }

  /**
   * Sets the timeout value that will be used for making new connections to the Stripe API (in
   * milliseconds).
   *
   * @param timeout timeout value in milliseconds
   */
  public static void setConnectTimeout(final int timeout) {
    connectTimeout = timeout;
  }

  /**
   * Returns the read timeout.
   *
   * @return timeout value in milliseconds
   */
  public static int getReadTimeout() {
    if (readTimeout == -1) {
      return DEFAULT_READ_TIMEOUT;
    }
    return readTimeout;
  }

  /**
   * Sets the timeout value that will be used when reading data from an established connection to
   * the Stripe API (in milliseconds).
   *
   * <p>Note that this value should be set conservatively because some API requests can take time
   * and a short timeout increases the likelihood of causing a problem in the backend.
   *
   * @param timeout timeout value in milliseconds
   */
  public static void setReadTimeout(final int timeout) {
    readTimeout = timeout;
  }

  /**
   * Returns the maximum number of times requests will be retried.
   *
   * @return the maximum number of times requests will be retried
   */
  public static int getMaxNetworkRetries() {
    return maxNetworkRetries;
  }

  /**
   * Sets the maximum number of times requests will be retried.
   *
   * @param numRetries the maximum number of times requests will be retried
   */
  public static void setMaxNetworkRetries(final int numRetries) {
    maxNetworkRetries = numRetries;
  }

  /**
   * Provide credential for proxy authorization if required.
   *
   * @param auth proxy required userName and password
   */
  public static void setProxyCredential(final PasswordAuthentication auth) {
    proxyCredential = auth;
  }

  public static PasswordAuthentication getProxyCredential() {
    return proxyCredential;
  }

  public static void setAppInfo(String name) {
    setAppInfo(name, null, null, null);
  }

  public static void setAppInfo(String name, String version) {
    setAppInfo(name, version, null, null);
  }

  public static void setAppInfo(String name, String version, String url) {
    setAppInfo(name, version, url, null);
  }

  /**
   * Sets information about your application. The information is passed along to Stripe.
   *
   * @param name Name of your application (e.g. "MyAwesomeApp")
   * @param version Version of your application (e.g. "1.2.34")
   * @param url Website for your application (e.g. "https://myawesomeapp.info")
   * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
   */
  public static void setAppInfo(String name, String version, String url, String partnerId) {
    if (appInfo == null) {
      appInfo = new HashMap<String, String>();
    }

    appInfo.put("name", name);
    appInfo.put("version", version);
    appInfo.put("url", url);
    appInfo.put("partner_id", partnerId);
  }

  public static Map<String, String> getAppInfo() {
    return appInfo;
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @return the JSON response as a string
   * @deprecated Use {@link com.stripe.StripeClient#rawRequest(ApiResource.RequestMethod, String,
   *     String)} instead.
   */
  @Deprecated
  public static StripeResponse rawRequest(
      final ApiResource.RequestMethod method, final String relativeUrl, final String content)
      throws StripeException {
    return rawRequest(method, relativeUrl, content, null);
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @param options the special modifiers of the request
   * @return the JSON response as a string
   * @deprecated Use {@link com.stripe.StripeClient#rawRequest(ApiResource.RequestMethod, String,
   *     String, RawRequestOptions)} instead.
   */
  @Deprecated
  public static StripeResponse rawRequest(
      final ApiResource.RequestMethod method,
      final String relativeUrl,
      final String content,
      RawRequestOptions options)
      throws StripeException {
    if (options == null) {
      options = RawRequestOptions.builder().build();
    }
    if (method != ApiResource.RequestMethod.POST && content != null && !content.equals("")) {
      throw new IllegalArgumentException(
          "content is not allowed for non-POST requests. Please pass null and add request parameters to the query string of the URL.");
    }
    return ApiResource.rawRequest(method, relativeUrl, content, options);
  }

  /** Deserializes StripeResponse returned by rawRequest into a similar class. */
  @Deprecated
  public static StripeObject deserialize(String rawJson) throws StripeException {
    if (rawJson == null) {
      throw new IllegalArgumentException("rawJson cannot be null");
    }

    return StripeObject.deserializeStripeObject(
        ApiResource.GSON.fromJson(rawJson, JsonObject.class));
  }
}
