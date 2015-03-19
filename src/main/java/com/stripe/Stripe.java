package com.stripe;

public abstract class Stripe {
	public static final String UPLOAD_API_BASE = "https://uploads.stripe.com";
	public static final String LIVE_API_BASE = "https://api.stripe.com";
	public static final String VERSION = "1.27.0";
	public static volatile String apiKey;
	public static volatile String apiVersion;

	private static volatile boolean verifySSL = true;
	private static volatile String apiBase = LIVE_API_BASE;


	/**
	 * (FOR TESTING ONLY) If you'd like your API requests to hit your own
	 * (mocked) server, you can set this up here by overriding the base api URL.
	 */
	public static void overrideApiBase(final String overriddenApiBase) {
		apiBase = overriddenApiBase;
	}

	/**
	 * (FOR TESTING ONLY) Only disable SSL verification if you're using your own
	 * (mocked) server. Disabling verification on stripe.com is not supported
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
