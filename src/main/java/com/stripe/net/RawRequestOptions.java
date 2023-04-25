package com.stripe.net;

import com.stripe.Stripe;
import java.net.PasswordAuthentication;
import java.net.Proxy;

public class RawRequestOptions extends RequestOptions {
  private Encoding encoding;

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
      Encoding encoding) {
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
  }

  public Encoding getEncoding() {
    return encoding;
  }

  public static RawRequestOptionsBuilder builder() {
    return new RawRequestOptionsBuilder();
  }

  public static final class RawRequestOptionsBuilder extends RequestOptions.RequestOptionsBuilder {
    private Encoding encoding;

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
          encoding);
    }
  }
}
