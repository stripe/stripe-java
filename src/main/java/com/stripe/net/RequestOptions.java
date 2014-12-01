package com.stripe.net;

import com.stripe.Stripe;

public class RequestOptions {
	public static RequestOptions getDefault() {
		return new RequestOptions(Stripe.apiKey, Stripe.apiVersion);
	}

	private final String apiKey;
	private final String stripeVersion;

	private RequestOptions(String apiKey, String stripeVersion) {
		this.apiKey = apiKey;
		this.stripeVersion = stripeVersion;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getStripeVersion() {
		return stripeVersion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RequestOptions that = (RequestOptions) o;

		return apiKey.equals(that.apiKey) && stripeVersion.equals(that.stripeVersion);
	}

	@Override
	public int hashCode() {
		int result = apiKey.hashCode();
		result = 31 * result + stripeVersion.hashCode();
		return result;
	}

	public static RequestOptionsBuilder builder() {
		return new RequestOptionsBuilder();
	}

	public RequestOptionsBuilder toBuilder() {
		return new RequestOptionsBuilder().setApiKey(this.apiKey).setStripeVersion(this.stripeVersion);
	}

	public static final class RequestOptionsBuilder {
		private String apiKey;
		private String stripeVersion;

		public RequestOptionsBuilder() {
			this.apiKey = Stripe.apiKey;
			this.stripeVersion = Stripe.apiVersion;
		}

		public String getApiKey() {
			return apiKey;
		}

		public RequestOptionsBuilder setApiKey(String apiKey) {
			this.apiKey = normalizeApiKey(apiKey);
			return this;
		}

		public RequestOptionsBuilder clearApiKey() {
			this.apiKey = null;
			return this;
		}

		public RequestOptionsBuilder setStripeVersion(String stripeVersion) {
			this.stripeVersion = normalizeStripeVersion(stripeVersion);
			return this;
		}

		public RequestOptionsBuilder clearStripeVersion() {
			this.stripeVersion = null;
			return this;
		}

		public RequestOptions build() {
			return new RequestOptions(normalizeApiKey(this.apiKey), normalizeStripeVersion(this.stripeVersion));
		}
	}

	private static String normalizeApiKey(String apiKey) {
		// null apiKeys are considered "valid"
		if (apiKey == null) {
			return null;
		}
		String normalized = apiKey.trim();
		if (normalized.isEmpty()) {
			throw new InvalidRequestOptionsException("Empty API key specified!");
		}
		return normalized;
	}

	private static String normalizeStripeVersion(String stripeVersion) {
		// null stripeVersions are considered "valid" and use Stripe.apiVersion
		if (stripeVersion == null) {
			return null;
		}
		String normalized = stripeVersion.trim();
		if (normalized.isEmpty()) {
			throw new InvalidRequestOptionsException("Empty Stripe version specified!");
		}
		return normalized;
	}

	public static class InvalidRequestOptionsException extends RuntimeException {
		public InvalidRequestOptionsException(String message) {
			super(message);
		}
	}
}
