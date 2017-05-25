package com.stripe;

import java.net.PasswordAuthentication;
import java.net.Proxy;

public abstract class Stripe {
	private final static int DEFAULT_CONNECT_TIMEOUT = 30 * 1000;
	private final static int DEFAULT_READ_TIMEOUT = 80 * 1000;

	public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
	public static final String LIVE_API_BASE = "https://api.stripe.com";
	public static final String VERSION = "4.9.0";

	public static volatile String apiKey;
	public static volatile String apiVersion;

	// Note that URLConnection reserves the value of 0 to mean "infinite
	// timeout", so we use -1 here to represent an unset value which should
	// fall back to a default.
	private static volatile int connectTimeout = -1;
	private static volatile int readTimeout = -1;

	private static volatile String apiBase = LIVE_API_BASE;
	private static volatile Proxy connectionProxy = null;
	private static volatile PasswordAuthentication proxyCredential = null;


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
	 * Set proxy to tunnel all Stripe connections
	 *
	 * @param proxy proxy host and port setting
	 */
	public static void setConnectionProxy(final Proxy proxy) {
		connectionProxy = proxy;
	}

	public static Proxy getConnectionProxy() {
		return connectionProxy;
	}
	
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
	 * Note that this value should be set conservatively because some API
	 * requests can take time and a short timeout increases the likelihood of
	 * causing a problem in the backend.
	 *
	 * @param timeout timeout value in milliseconds
	 */
	public static void setReadTimeout(final int timeout) {
		readTimeout = timeout;
	}

	/**
	 * Provide credential for proxy authorization if required
	 *
	 * @param auth proxy required userName and password
	 */
	public static void setProxyCredential(final PasswordAuthentication auth) {
		proxyCredential = auth;
	}

	public static PasswordAuthentication getProxyCredential() {
		return proxyCredential;
	}
}
