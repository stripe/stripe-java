package com.stripe;

public abstract class Stripe
{
	public static final String LIVE_API_BASE = "https://api.stripe.com";
	public static final String VERSION = "1.6.3";
	public static String apiKey;
	public static String apiVersion;

	private static String apiBase = LIVE_API_BASE;

	/**
	 * (FOR TESTING ONLY)
	 * If you'd like your API requests to hit your own (mocked) server,
	 * you can set this up here by overriding the base api URL.
	 */
	public static void overrideApiBase(final String overriddenApiBase) {
		apiBase = overriddenApiBase;
	}

	public static String getApiBase() {
		return apiBase;
	}
}
