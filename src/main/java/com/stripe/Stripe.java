package com.stripe;

import java.net.PasswordAuthentication;
import java.net.Proxy;

public abstract class Stripe {
	public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
	public static final String LIVE_API_BASE = "https://api.stripe.com";
	public static final String VERSION = "4.0.0";
	public static volatile String apiKey;
	public static volatile String apiVersion;

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
