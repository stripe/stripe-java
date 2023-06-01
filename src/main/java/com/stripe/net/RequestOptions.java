package com.stripe.net;

import com.stripe.Stripe;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Map;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class RequestOptions {
  private final String apiKey;
  private final String clientId;
  private final String idempotencyKey;
  private final String stripeAccount;

  private final String baseUrl;
  /** Uses the globally set version by defaeult, unless an override is provided. */
  private final String stripeVersion = Stripe.stripeVersion;

  /**
   * Stripe version override when made on behalf of others. This can be used when the returned
   * response will not be deserialized into the current classes pinned to {@link Stripe#VERSION}.
   */
  private final String stripeVersionOverride;

  private final int connectTimeout;
  private final int readTimeout;

  private final int maxNetworkRetries;
  private final Proxy connectionProxy;
  private final PasswordAuthentication proxyCredential;

  public static RequestOptions getDefault() {
    return new RequestOptions(
        Stripe.apiKey,
        Stripe.clientId,
        null,
        null,
        null,
        null,
        Stripe.getConnectTimeout(),
        Stripe.getReadTimeout(),
        Stripe.getMaxNetworkRetries(),
        Stripe.getConnectionProxy(),
        Stripe.getProxyCredential());
  }

  protected RequestOptions(
      String apiKey,
      String clientId,
      String idempotencyKey,
      String stripeAccount,
      String stripeVersionOverride,
      String baseUrl,
      int connectTimeout,
      int readTimeout,
      int maxNetworkRetries,
      Proxy connectionProxy,
      PasswordAuthentication proxyCredential) {
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.idempotencyKey = idempotencyKey;
    this.stripeAccount = stripeAccount;
    this.stripeVersionOverride = stripeVersionOverride;
    this.baseUrl = baseUrl;
    this.connectTimeout = connectTimeout;
    this.readTimeout = readTimeout;
    this.maxNetworkRetries = maxNetworkRetries;
    this.connectionProxy = connectionProxy;
    this.proxyCredential = proxyCredential;
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

  public static String unsafeGetStripeVersionOverride(RequestOptions options) {
    return options.stripeVersionOverride;
  }

  public int getReadTimeout() {
    return readTimeout;
  }

  public int getConnectTimeout() {
    return connectTimeout;
  }

  public int getMaxNetworkRetries() {
    return maxNetworkRetries;
  }

  public Proxy getConnectionProxy() {
    return connectionProxy;
  }

  public PasswordAuthentication getProxyCredential() {
    return proxyCredential;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public static RequestOptionsBuilder builder() {
    return new RequestOptionsBuilder();
  }

  /**
   * Convert request options to builder, retaining invariant values for the integration.
   *
   * @deprecated prefer {@link toBuilderFullCopy} which fully copies the request options instead of
   *     a subset of its options.
   * @return option builder.
   */
  @Deprecated
  public RequestOptionsBuilder toBuilder() {
    return new RequestOptionsBuilder().setApiKey(this.apiKey).setStripeAccount(this.stripeAccount);
  }

  /**
   * Convert request options to builder, copying all options.
   *
   * @return option builder.
   */
  public RequestOptionsBuilder toBuilderFullCopy() {
    return RequestOptionsBuilder.unsafeSetStripeVersionOverride(
        new RequestOptionsBuilder()
            .setApiKey(this.apiKey)
            .setBaseUrl(this.baseUrl)
            .setClientId(this.clientId)
            .setIdempotencyKey(this.idempotencyKey)
            .setStripeAccount(this.stripeAccount)
            .setConnectTimeout(this.connectTimeout)
            .setReadTimeout(this.readTimeout)
            .setMaxNetworkRetries(this.maxNetworkRetries)
            .setConnectionProxy(this.connectionProxy)
            .setProxyCredential(this.proxyCredential),
        stripeVersionOverride);
  }

  public static class RequestOptionsBuilder {
    protected String apiKey;
    protected String clientId;
    protected String idempotencyKey;
    protected String stripeAccount;
    protected String stripeVersionOverride;
    protected int connectTimeout;
    protected int readTimeout;
    protected int maxNetworkRetries;
    protected Proxy connectionProxy;
    protected PasswordAuthentication proxyCredential;
    protected String baseUrl;

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public RequestOptionsBuilder() {
      this.apiKey = Stripe.apiKey;
      this.clientId = Stripe.clientId;
      this.connectTimeout = Stripe.getConnectTimeout();
      this.readTimeout = Stripe.getReadTimeout();
      this.maxNetworkRetries = Stripe.getMaxNetworkRetries();
      this.connectionProxy = Stripe.getConnectionProxy();
      this.proxyCredential = Stripe.getProxyCredential();
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

    public int getMaxNetworkRetries() {
      return maxNetworkRetries;
    }

    /**
     * Sets the maximum number of times the request will be retried in the event of a failure.
     *
     * @param maxNetworkRetries the number of times to retry the request
     */
    public RequestOptionsBuilder setMaxNetworkRetries(int maxNetworkRetries) {
      this.maxNetworkRetries = maxNetworkRetries;
      return this;
    }

    public Proxy getConnectionProxy() {
      return connectionProxy;
    }

    public RequestOptionsBuilder setConnectionProxy(Proxy connectionProxy) {
      this.connectionProxy = connectionProxy;
      return this;
    }

    public PasswordAuthentication getProxyCredential() {
      return proxyCredential;
    }

    public RequestOptionsBuilder setProxyCredential(PasswordAuthentication proxyCredential) {
      this.proxyCredential = proxyCredential;
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
     * This is for internal use only. See {@link com.stripe.model.EphemeralKey#create(Map,
     * RequestOptions)}. Setting this yourself will result in a version mismatch between your
     * request and this library's types, which can result in missing data and deserialization
     * errors.
     *
     * <p>Static, so that it doesn't appear in IDE auto-completion alongside the other setters.
     *
     * @return option builder
     */
    public static RequestOptionsBuilder unsafeSetStripeVersionOverride(
        RequestOptionsBuilder builder, String stripeVersionOverride) {
      builder.stripeVersionOverride = normalizeStripeVersion(stripeVersionOverride);
      return builder;
    }

    public RequestOptionsBuilder setBaseUrl(final String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    /** Constructs a {@link RequestOptions} with the specified values. */
    public RequestOptions build() {
      return new RequestOptions(
          normalizeApiKey(this.apiKey),
          normalizeClientId(this.clientId),
          normalizeIdempotencyKey(this.idempotencyKey),
          normalizeStripeAccount(this.stripeAccount),
          normalizeStripeVersion(this.stripeVersionOverride),
          normalizeBaseUrl(this.baseUrl),
          connectTimeout,
          readTimeout,
          maxNetworkRetries,
          connectionProxy,
          proxyCredential);
    }
  }

  protected static String normalizeApiKey(String apiKey) {
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

  protected static String normalizeClientId(String clientId) {
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

  protected static String normalizeStripeVersion(String stripeVersion) {
    // null stripeVersions are considered "valid" and use Stripe.stripeVersion
    if (stripeVersion == null) {
      return null;
    }
    String normalized = stripeVersion.trim();
    if (normalized.isEmpty()) {
      throw new InvalidRequestOptionsException("Empty Stripe version specified!");
    }
    return normalized;
  }

  protected static String normalizeBaseUrl(String baseUrl) {
    // null baseUrl is valid, and will fall back to e.g. Stripe.apiBase or Stripe.connectBase
    // (depending on the method)
    if (baseUrl == null) {
      return null;
    }
    String normalized = baseUrl.trim();
    if (normalized.isEmpty()) {
      throw new InvalidRequestOptionsException("Empty baseUrl specified!");
    }
    return normalized;
  }

  protected static String normalizeIdempotencyKey(String idempotencyKey) {
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

  protected static String normalizeStripeAccount(String stripeAccount) {
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
