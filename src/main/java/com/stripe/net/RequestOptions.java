package com.stripe.net;

import com.stripe.Stripe;

public class RequestOptions {
	
	private final static int DEFAULT_CONNECTION_TIMEOUT = 30 * 1000;    	
	
	private final static int DEFAULT_READ_TIMEOUT = 80 * 1000;
    
	public static RequestOptions getDefault() {
		return new RequestOptions(Stripe.apiKey, Stripe.apiVersion, null, null, DEFAULT_CONNECTION_TIMEOUT, DEFAULT_READ_TIMEOUT);
	}

	private final String apiKey;
	private final String stripeVersion;
	private final String idempotencyKey;
	private final String stripeAccount;
	private final int connectTimeout;
	private final int readTimeout;

	private RequestOptions(String apiKey, String stripeVersion, String idempotencyKey, String stripeAccount, int connectTimeout, int readTimeout) {
		this.apiKey = apiKey;
		this.stripeVersion = stripeVersion;
		this.idempotencyKey = idempotencyKey;
		this.stripeAccount = stripeAccount;
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getStripeVersion() {
		return stripeVersion;
	}

	public String getIdempotencyKey() {
		return idempotencyKey;
	}

	public String getStripeAccount() {
		return stripeAccount;
	}
	
	public int getReadTimeout() {
	    return readTimeout;
	}
	
	public int getConnectTimeout() {
	    return connectTimeout;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RequestOptions that = (RequestOptions) o;

		if (apiKey != null ? !apiKey.equals(that.apiKey) : that.apiKey != null) {
			return false;
		}
		if (idempotencyKey != null ? !idempotencyKey.equals(that.idempotencyKey) : that.idempotencyKey != null) {
			return false;
		}
		if (stripeVersion != null ? !stripeVersion.equals(that.stripeVersion) : that.stripeVersion != null) {
			return false;
		}
		
		if (connectTimeout != that.connectTimeout) {
			return false;
		}
		
		if (readTimeout != that.readTimeout) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = apiKey != null ? apiKey.hashCode() : 0;
		result = 31 * result + (stripeVersion != null ? stripeVersion.hashCode() : 0);
		result = 31 * result + (idempotencyKey != null ? idempotencyKey.hashCode() : 0);
		result = 31 * result + readTimeout;
		result = 31 * result + connectTimeout;
		return result;
	}

	public static RequestOptionsBuilder builder() {
		return new RequestOptionsBuilder();
	}

	public RequestOptionsBuilder toBuilder() {
		return new RequestOptionsBuilder().setApiKey(this.apiKey).setStripeVersion(this.stripeVersion).setStripeAccount(this.stripeAccount);
	}

	public static final class RequestOptionsBuilder {
		private String apiKey;
		private String stripeVersion;
		private String idempotencyKey;
		private String stripeAccount;
		private int connectTimeout;
		private int readTimeout;

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

		public RequestOptionsBuilder setIdempotencyKey(String idempotencyKey) {
			this.idempotencyKey = idempotencyKey;
			return this;
		}
		
		public RequestOptionsBuilder setConnectTimeout(int connectTimeout) {
		    this.connectTimeout = connectTimeout;
		    return this;
		}
		
		public RequestOptionsBuilder setReadTimeout(int readTimeout) {
		    this.readTimeout = readTimeout;
		    return this;
		}
		
		public int getConnectTimeout() {
		    return connectTimeout;
		}
		
		public int getReadTimeout() {
		    return readTimeout;
		}

		public RequestOptionsBuilder clearIdempotencyKey() {
			this.idempotencyKey = null;
			return this;
		}

		public String getIdempotencyKey() {
			return this.idempotencyKey;
		}

		public String getStripeAccount() {
			return this.stripeAccount;
		}

		public RequestOptionsBuilder setStripeAccount(String stripeAccount) {
			this.stripeAccount = stripeAccount;
			return this;
		}

		public RequestOptionsBuilder clearStripeAccount() {
			return setStripeAccount(null);
		}

		public RequestOptions build() {
			return new RequestOptions(
				normalizeApiKey(this.apiKey),
				normalizeStripeVersion(this.stripeVersion),
				normalizeIdempotencyKey(this.idempotencyKey),
				normalizeStripeAccount(this.stripeAccount),
				connectTimeout,
				readTimeout);
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

	private static String normalizeIdempotencyKey(String idempotencyKey) {
		if (idempotencyKey == null) {
			return null;
		}
		String normalized = idempotencyKey.trim();
		if (normalized.isEmpty()) {
			throw new InvalidRequestOptionsException("Empty Idempotency Key Specified!");
		}
		if (normalized.length() > 255) {
			throw new InvalidRequestOptionsException(String.format("Idempotency Key length was %d, which is larger than the 255 character maximum!", normalized.length()));
		}
		return normalized;
	}

	private static String normalizeStripeAccount(String stripeAccount) {
		if (stripeAccount == null) {
			return null;
		}
		String normalized = stripeAccount.trim();
		if (normalized.isEmpty()) {
			throw new InvalidRequestOptionsException("Empty stripe account specified!");
		}
		return normalized;
	}

	public static class InvalidRequestOptionsException extends RuntimeException {
		public InvalidRequestOptionsException(String message) {
			super(message);
		}
	}
}
