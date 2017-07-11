package com.stripe.net;

import com.stripe.Stripe;

public class RequestOptions {
	public static RequestOptions getDefault() {
		return new RequestOptions(Stripe.apiKey, Stripe.clientId, Stripe.apiVersion, null, null, Stripe.getConnectTimeout(), Stripe.getReadTimeout());
	}

	private final String apiKey;
	private final String clientId;
	private final String stripeVersion;
	private final String idempotencyKey;
	private final String stripeAccount;
	private final int connectTimeout;
	private final int readTimeout;

	private RequestOptions(String apiKey, String clientId, String stripeVersion, String idempotencyKey, String stripeAccount, int connectTimeout, int readTimeout) {
		this.apiKey = apiKey;
		this.clientId = clientId;
		this.stripeVersion = stripeVersion;
		this.idempotencyKey = idempotencyKey;
		this.stripeAccount = stripeAccount;
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getClientId() {
		return clientId;
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
		if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) {
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

		return readTimeout == that.readTimeout;
	}

	@Override
	public int hashCode() {
		int result = apiKey != null ? apiKey.hashCode() : 0;
		result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
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
		private String clientId;
		private String stripeVersion;
		private String idempotencyKey;
		private String stripeAccount;
		private int connectTimeout;
		private int readTimeout;

		public RequestOptionsBuilder() {
			this.apiKey = Stripe.apiKey;
			this.clientId = Stripe.clientId;
			this.stripeVersion = Stripe.apiVersion;
		}

		public String getApiKey() {
			return apiKey;
		}

		public String getClientId() {
			return clientId;
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

		public int getConnectTimeout() {
			return connectTimeout;
		}

		/**
		 * Sets the timeout value that will be used for making new connections to
		 * the Stripe API (in milliseconds).
		 *
		 * @param timeout timeout value in milliseconds
		 */
		public RequestOptionsBuilder setConnectTimeout(int timeout) {
			this.connectTimeout = timeout;
			return this;
		}

		public int getReadTimeout() {
			return readTimeout;
		}

		/**
		 * Sets the timeout value that will be used when reading data from an
		 * established connection to the Stripe API (in milliseconds).
		 * <p>
		 * Note that this value should be set conservatively because some API
		 * requests can take time and a short timeout increases the likelihood
		 * of causing a problem in the backend.
		 *
		 * @param timeout timeout value in milliseconds
		 */
		public RequestOptionsBuilder setReadTimeout(int timeout) {
			this.readTimeout = timeout;
			return this;
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
					normalizeClientId(this.clientId),
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

	private static String normalizeClientId(String clientId) {
		// null client_ids are considered "valid"
		if (clientId == null) {
			return null;
		}
		String normalized = clientId.trim();
		if (normalized.isEmpty()) {
			throw new InvalidRequestOptionsException("Empty client_id specified!");
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
