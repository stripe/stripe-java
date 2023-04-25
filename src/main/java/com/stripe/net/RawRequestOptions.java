package com.stripe.net;

import com.stripe.Stripe;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Map;

public class RawRequestOptions extends RequestOptions {
  private Encoding encoding;

  private Map<String, String> additionalHeaders;

  public enum Encoding {
    FORM,
    JSON
  }

  public RawRequestOptions(
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
      PasswordAuthentication proxyCredential,
      Encoding encoding,
      Map<String, String> additionalHeaders) {
    super(
        apiKey,
        clientId,
        idempotencyKey,
        stripeAccount,
        stripeVersionOverride,
        baseUrl,
        connectTimeout,
        readTimeout,
        maxNetworkRetries,
        connectionProxy,
        proxyCredential);
    this.encoding = encoding;
    this.additionalHeaders = additionalHeaders;
  }

  public Encoding getEncoding() {
    return encoding;
  }

  public Map<String, String> getAdditionalHeaders() {
    return additionalHeaders;
  }

  public static RawRequestOptionsBuilder builder() {
    return new RawRequestOptionsBuilder();
  }

  public static final class RawRequestOptionsBuilder extends RequestOptions.RequestOptionsBuilder {
    private Encoding encoding;

    private Map<String, String> additionalHeaders;

    /**
     * Constructs a raw request options builder with the global parameters (API key and client ID)
     * as default values.
     */
    public RawRequestOptionsBuilder() {
      super();
      encoding = Stripe.getEncoding();
    }

    public Encoding getEncoding() {
      return this.encoding;
    }

    public RawRequestOptionsBuilder setEncoding(Encoding encoding) {
      this.encoding = encoding;
      return this;
    }

    public Map<String, String> getAdditionalHeaders() {
      return this.additionalHeaders;
    }

    public RawRequestOptionsBuilder setAdditionalHeaders(Map<String, String> additionalHeaders) {
      this.additionalHeaders = additionalHeaders;
      return this;
    }

    @Override
    public RawRequestOptions build() {
      return new RawRequestOptions(
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
          proxyCredential,
          encoding,
          additionalHeaders);
    }
  }
}
