package com.stripe.net;

import com.stripe.Stripe;
import java.util.Map;

public class RequestOptions {
  public static RequestOptions getDefault() {
    return new RequestOptions(Stripe.apiKey, Stripe.clientId, null, null, null,
        Stripe.getConnectTimeout(), Stripe.getReadTimeout());
  }

  private final String apiKey;
  private final String clientId;
  /**
   * Stripe version always set at {@link Stripe#API_VERSION}.
   */
  private final String stripeVersion = Stripe.API_VERSION;
  /**
   * Stripe version when made on behalf of others. This can be used when the returned response
   * will not be deserialized into the current classes pinned to {@link Stripe#VERSION}.
   */
  private final String stripeVersionOnBehalfOf;
  private final String idempotencyKey;
  private final String stripeAccount;
  private final int connectTimeout;
  private final int readTimeout;

  private RequestOptions(String apiKey, String clientId, String stripeVersionOnBehalfOf,
      String idempotencyKey, String stripeAccount, int connectTimeout, int readTimeout) {
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.stripeVersionOnBehalfOf = stripeVersionOnBehalfOf;
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

  public String getStripeVersionOnBehalfOf() {
    return stripeVersionOnBehalfOf;
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
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    RequestOptions that = (RequestOptions) o;

    if (apiKey != null ? !apiKey.equals(that.apiKey) : that.apiKey != null) {
      return false;
    }
    if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) {
      return false;
    }
    if (idempotencyKey != null ? !idempotencyKey.equals(that.idempotencyKey)
        : that.idempotencyKey != null) {
      return false;
    }
    if (stripeVersion != null ? !stripeVersion.equals(that.stripeVersion)
        : that.stripeVersion != null) {
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
    result = 31 * result + (stripeVersionOnBehalfOf != null ? stripeVersionOnBehalfOf.hashCode()
        : 0);
    result = 31 * result + (idempotencyKey != null ? idempotencyKey.hashCode() : 0);
    result = 31 * result + (stripeAccount != null ? stripeAccount.hashCode() : 0);
    result = 31 * result + connectTimeout;
    result = 31 * result + readTimeout;
    return result;
  }

  public static RequestOptionsBuilder builder() {
    return new RequestOptionsBuilder();
  }

  public RequestOptionsBuilder toBuilder() {
    return new RequestOptionsBuilder()
        .setApiKey(this.apiKey)
        .setStripeVersionOnBehalfOf(this.stripeVersionOnBehalfOf)
        .setStripeAccount(this.stripeAccount);
  }

  public static final class RequestOptionsBuilder {
    private String apiKey;
    private String clientId;
    private String stripeVersionOnBehalfOf;
    private String idempotencyKey;
    private String stripeAccount;
    private int connectTimeout;
    private int readTimeout;

    /**
     * Constructs a request options builder with the global parameters (API key, client ID and
     * API version) as default values.
     */
    public RequestOptionsBuilder() {
      this.apiKey = Stripe.apiKey;
      this.clientId = Stripe.clientId;
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

    public String getClientId() {
      return clientId;
    }

    public RequestOptionsBuilder setClientId(String clientId) {
      this.clientId = normalizeClientId(clientId);
      return this;
    }

    public RequestOptionsBuilder clearClientId() {
      this.clientId = null;
      return this;
    }

    /**
     * Do not use this except for in API where JSON response is not fully deserialize into
     * to explicit Stripe resources -- it intends to make request on behalf of others, makes
     * request with their API version, and simply passes the raw values along. Example for this is
     * {@link com.stripe.model.EphemeralKey#create(Map, RequestOptions)}.
     *
     * Setting this value in typical scenario will result in deserialization error
     * as the model classes has schema according to the pinned {@link Stripe#API_VERSION} and not
     * the {@code stripeVersionOnBehalfOf}
     * @param stripeVersionOnBehalfOf stripe version of the client to make request on behalf of
     * @return option builder
     */
    public RequestOptionsBuilder setStripeVersionOnBehalfOf(String stripeVersionOnBehalfOf) {
      this.stripeVersionOnBehalfOf = normalizeStripeVersion(stripeVersionOnBehalfOf);
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
     *
     * <p>Note that this value should be set conservatively because some API
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

    /**
     * Constructs a {@link RequestOptions} with the specified values.
     */
    public RequestOptions build() {
      return new RequestOptions(
          normalizeApiKey(this.apiKey),
          normalizeClientId(this.clientId),
          normalizeStripeVersion(this.stripeVersionOnBehalfOf),
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
      throw new InvalidRequestOptionsException(
          String.format("Idempotency Key length was %d, which is larger than the 255 character "
              + "maximum!", normalized.length()));
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
    private static final long serialVersionUID = 1L;

    public InvalidRequestOptionsException(String message) {
      super(message);
    }
  }
}
