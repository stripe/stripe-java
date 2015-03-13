package com.stripe;

public abstract class Stripe {
	public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
	public static final String LIVE_API_BASE = "https://api.stripe.com";
	public static final String VERSION = "1.26.0";
	public static volatile String apiKey;
	public static volatile String apiVersion;

	private static volatile boolean verifySSL = true;
	private static volatile String apiBase = LIVE_API_BASE;


	/**
	 * FOR TESTING AND NON-SSL INTERNAL NETWORKS:
	 * If you'd like your API requests to hit your own (mocked) server, you can set this up here by overriding the base api URL.
	 * Also, if you are on a non-SSL network that needs all outgoing traffic to be HTTP, you can override it here
	 * but be sure to converted to HTTPS when leaving your network.
	 */
	public static void overrideApiBase(final String overriddenApiBase) {
		apiBase = overriddenApiBase;
	}

	/**
	 * FOR TESTING AND NON-SSL INTERNAL NETWORKS:
	 * Only disable SSL verification if you're using your own (mocked) server (testing) or
	 * if you are on a non-SSL network that needs all outgoing traffic to be HTTP
	 * (assumes the traffic to be converted to HTTPS when leaving your network)
	 */
	public static void setVerifySSL(boolean verify) {
		verifySSL = verify;
	}

	public static boolean getVerifySSL() {
		return verifySSL;
	}

	public static String getApiBase() {
		return apiBase;
	}
}
