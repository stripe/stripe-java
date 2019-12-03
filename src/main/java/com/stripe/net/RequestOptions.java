package com.stripe.net;

import com.stripe.Stripe;
import java.util.Map;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class RequestOptions {
  private final String apiKey;
  private final String clientId;
  private final String idempotencyKey;
  private final String stripeAccount;
  /** Stripe version always set at {@link Stripe#API_VERSION}. */
  private final String stripeVersion = Stripe.API_VERSION;
  /**
   * Stripe version override when made on behalf of others. This can be used when the returned
   * response will not be deserialized into the current classes pinned to {@link Stripe#VERSION}.
   */
  private final String stripeVersionOverride;

  private final int connectTimeout;
  private final int readTimeout;

  public static RequestOptions getDefault() {
    return new RequestOptions(
        Stripe.apiKey,
        Stripe.clientId,
        null,
        null,
        null,
        Stripe.getConnectTimeout(),
        Stripe.getReadTimeout());
  }

  private RequestOptions(
      String apiKey,
      String clientId,
      String idempotencyKey,
      String stripeAccount,
      String stripeVersionOverride,
      int connectTimeout,
      int readTimeout) {
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.idempotencyKey = idempotencyKey;
    this.stripeAccount = stripeAccount;
    this.stripeVersionOverride = stripeVersionOverride;
    this.connectTimeout = connectTimeout;
    this.readTimeout = readTimeout;
  }

  public String getApiKey() {
    return apiKey;
  }

  public String getClientId() {
    return clientId;
  }

  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public String getStripeAccount() {
    return stripeAccount;
  }

  public String getStripeVersion() {
    return stripeVersion;
  }

  public String getStripeVersionOverride() {
    return stripeVersionOverride;
  }

  public int getReadTimeout() {
    return readTimeout;
  }

  public int getConnectTimeout() {
    return connectTimeout;
  }

  public static RequestOptionsBuilder builder() {
    return new RequestOptionsBuilder();
  }

  /**
   * Convert request options to builder, retaining invariant values for the integration.
   *
   * @return option builder.
   */
  public RequestOptionsBuilder toBuilder() {
    return new RequestOptionsBuilder().setApiKey(this.apiKey).setStripeAccount(this.stripeAccount);
  }

  public static final class RequestOptionsBuilder {
    private String apiKey;
    private String clientId;
    private String idempotencyKey;
    private String stripeAccount;
    private String stripeVersionOverride;
    private int connectTimeout;
    private int readTimeout;

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public RequestOptionsBuilder() {
      this.apiKey = Stripe.apiKey;
      this.clientId = Stripe.clientId;
      this.connectTimeout = Stripe.getConnectTimeout();
      this.readTimeout = Stripe.getReadTimeout();
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

    public RequestOptionsBuilder setIdempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    public int getConnectTimeout() {
      return connectTimeout;
    }

    /**
     * Sets the timeout value that will be used for making new connections to the Stripe API (in
     * milliseconds).
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
     * Sets the timeout value that will be used when reading data from an established connection to
     * the Stripe API (in milliseconds).
     *
     * <p>Note that this value should be set conservatively because some API requests can take time
     * and a short timeout increases the likelihood of causing a problem in the backend.
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

    public String getStripeVersionOverride() {
      return this.stripeVersionOverride;
    }

    /**
     * Do not use this except for in API where JSON response is not fully deserialized into explicit
     * Stripe classes, but only passed to other clients as raw data -- essentially making request on
     * behalf of others with their API version. One example is in {@link
     * com.stripe.model.EphemeralKey#create(Map, RequestOptions)}. Setting this value in a typical
     * scenario will result in deserialization error as the model classes have schema according to
     * the pinned {@link Stripe#API_VERSION} and not the {@code stripeVersionOverride}
     *
     * @param stripeVersionOverride stripe version override which belongs to the client to make
     *     request on behalf of.
     * @return option builder
     */
    public RequestOptionsBuilder setStripeVersionOverride(String stripeVersionOverride) {
      this.stripeVersionOverride = normalizeStripeVersion(stripeVersionOverride);
      return this;
    }

    public RequestOptionsBuilder clearStripeVersionOverride() {
      return setStripeVersionOverride(null);
    }

    /** Constructs a {@link RequestOptions} with the specified values. */
    public RequestOptions build() {
      return new RequestOptions(
          normalizeApiKey(this.apiKey),
          normalizeClientId(this.clientId),
          normalizeIdempotencyKey(this.idempotencyKey),
          normalizeStripeAccount(this.stripeAccount),
          normalizeStripeVersion(this.stripeVersionOverride),
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
          String.format(
              "Idempotency Key length was %d, which is larger than the 255 character " + "maximum!",
              normalized.length()));
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
