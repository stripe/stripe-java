package com.stripe;

import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public abstract class Stripe {
  private static final int DEFAULT_CONNECT_TIMEOUT = 30 * 1000;
  private static final int DEFAULT_READ_TIMEOUT = 80 * 1000;
  
  public static final Charset UTF_8 = Charset.forName("UTF-8");

  public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
  public static final String LIVE_API_BASE = "https://api.stripe.com";
  public static final String CONNECT_API_BASE = "https://connect.stripe.com";
  public static final String VERSION = "5.35.0";

  public static volatile String apiKey;
  public static volatile String apiVersion;
  public static volatile String clientId;

  // Note that URLConnection reserves the value of 0 to mean "infinite
  // timeout", so we use -1 here to represent an unset value which should
  // fall back to a default.
  private static volatile int connectTimeout = -1;
  private static volatile int readTimeout = -1;

  private static volatile String apiBase = LIVE_API_BASE;
  private static volatile String connectBase = CONNECT_API_BASE;
  private static volatile Proxy connectionProxy = null;
  private static volatile PasswordAuthentication proxyCredential = null;

  private static volatile Map<String, String> appInfo = null;


  /**
   * (FOR TESTING ONLY) If you'd like your API requests to hit your own
   * (mocked) server, you can set this up here by overriding the base api URL.
   */
  public static void overrideApiBase(final String overriddenApiBase) {
    apiBase = overriddenApiBase;
  }

  public static String getApiBase() {
    return apiBase;
  }

  /**
   * (FOR TESTING ONLY) If you'd like your OAuth requests to hit your own
   * (mocked) server, you can set this up here by overriding the base Connect
   * URL.
   */
  public static void overrideConnectBase(final String overriddenConnectBase) {
    connectBase = overriddenConnectBase;
  }

  public static String getConnectBase() {
    return connectBase;
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
   * Sets the timeout value that will be used for making new connections to
   * the Stripe API (in milliseconds).
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
   * Sets the timeout value that will be used when reading data from an
   * established connection to the Stripe API (in milliseconds).
   *
   * <p>Note that this value should be set conservatively because some API
   * requests can take time and a short timeout increases the likelihood of
   * causing a problem in the backend.
   *
   * @param timeout timeout value in milliseconds
   */
  public static void setReadTimeout(final int timeout) {
    readTimeout = timeout;
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
    setAppInfo(name, null, null);
  }

  public static void setAppInfo(String name, String version) {
    setAppInfo(name, version, null);
  }

  /**
   * Sets information about your application. The information is passed along to Stripe.
   *
   * @param name Name of your application (e.g. "MyAwesomeApp")
   * @param version Version of your application (e.g. "1.2.34")
   * @param url Website for your application (e.g. "https://myawesomeapp.info")
   */
  public static void setAppInfo(String name, String version, String url) {
    if (appInfo == null) {
      appInfo = new HashMap<String, String>();
    }

    appInfo.put("name", name);
    appInfo.put("version", version);
    appInfo.put("url", url);
  }

  public static Map<String, String> getAppInfo() {
    return appInfo;
  }
}
