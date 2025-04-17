package com.stripe;

import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public abstract class Stripe {
  public static final int DEFAULT_CONNECT_TIMEOUT = 30 * 1000;
  public static final int DEFAULT_READ_TIMEOUT = 80 * 1000;

  public static final String API_VERSION = ApiVersion.CURRENT;
  public static final String CONNECT_API_BASE = "https://connect.stripe.com";
  public static final String LIVE_API_BASE = "https://api.stripe.com";
  public static final String UPLOAD_API_BASE = "https://files.stripe.com";
  public static final String METER_EVENTS_API_BASE = "https://meter-events.stripe.com";
  public static final String VERSION = "29.1.0-beta.3";

  public static volatile String apiKey;
  public static volatile String clientId;
  public static volatile boolean enableTelemetry = true;

  /**
   * Stripe API version which is sent by default on requests. This is set to the API version that is
   * linked to this SDK version. Call {@link Stripe#addBetaVersion(String,String)} to add beta
   * version information.
   */
  public static final String stripeVersion = API_VERSION;

  // Used to set the default version in RequestOptions
  @Getter private static String stripeVersionWithBetaHeaders = stripeVersion;

  /**
   * Add a specified beta to the global Stripe API Version. If the betaName already exists, the
   * higher version will be used.
   *
   * @throws IllegalArgumentException if the betaVersion is not in the format 'v' + number (e.g.
   *     "v3")
   */
  public static void addBetaVersion(String betaName, String betaVersion) {
    if (!betaVersion.matches("v\\d+")) {
      throw new IllegalArgumentException(
          String.format(
              "Invalid beta version format: %s. Expected format is 'v<number>'.", betaVersion));
    }

    int incomingVersion =
        Integer.parseInt(betaVersion.substring(1)); // Extract the number after 'v'

    String existingEntry = "; " + betaName + "=";
    int existingIndex = stripeVersionWithBetaHeaders.indexOf(existingEntry);

    if (existingIndex >= 0) {
      int startIndex = existingIndex + existingEntry.length();
      int endIndex = stripeVersionWithBetaHeaders.indexOf(";", startIndex);
      endIndex = (endIndex == -1) ? stripeVersionWithBetaHeaders.length() : endIndex;

      String existingVersionStr = stripeVersionWithBetaHeaders.substring(startIndex, endIndex);
      int existingVersion =
          Integer.parseInt(existingVersionStr.substring(1)); // Extract the number after 'v'

      if (incomingVersion <= existingVersion) {
        return; // Keep the higher version (existing one)
      }

      // Remove the existing entry
      stripeVersionWithBetaHeaders =
          stripeVersionWithBetaHeaders.substring(0, existingIndex)
              + stripeVersionWithBetaHeaders.substring(endIndex);
    }

    // Add the new beta version
    stripeVersionWithBetaHeaders =
        String.format("%s; %s=%s", stripeVersionWithBetaHeaders, betaName, betaVersion);
  }

  // For testing only.  This is not part of a stable API and could change in non-major versions.
  public static void clearBetaVersion() {
    stripeVersionWithBetaHeaders = stripeVersion;
  }

  // Note that URLConnection reserves the value of 0 to mean "infinite
  // timeout", so we use -1 here to represent an unset value which should
  // fall back to a default.
  private static volatile int connectTimeout = -1;
  private static volatile int readTimeout = -1;

  private static volatile int maxNetworkRetries = 2;

  private static volatile String apiBase = LIVE_API_BASE;
  private static volatile String connectBase = CONNECT_API_BASE;
  private static volatile String uploadBase = UPLOAD_API_BASE;
  private static volatile String meterEventsBase = METER_EVENTS_API_BASE;
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
   * (FOR TESTING ONLY) If you'd like your events requests to hit your own (mocked) server, you can
   * set this up here by overriding the base api URL.
   */
  public static void overrideMeterEventsBase(final String overriddenMeterEventsBase) {
    meterEventsBase = overriddenMeterEventsBase;
  }

  public static String getMeterEventsBase() {
    return meterEventsBase;
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
}
