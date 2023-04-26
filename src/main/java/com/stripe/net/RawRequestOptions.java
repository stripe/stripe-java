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
     * Constructs a raw request options builder with default values. Encoding is set to {@code
     * Encoding.FORM} by default.
     */
    public RawRequestOptionsBuilder() {
      super();
      encoding = Encoding.FORM;
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
    public RawRequestOptionsBuilder setApiKey(String apiKey) {
      super.setApiKey(apiKey);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setClientId(String clientId) {
      super.setClientId(clientId);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setIdempotencyKey(String idempotencyKey) {
      super.setIdempotencyKey(idempotencyKey);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setStripeAccount(String stripeAccount) {
      super.setStripeAccount(stripeAccount);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setBaseUrl(String baseUrl) {
      super.setBaseUrl(baseUrl);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setConnectTimeout(int timeout) {
      super.setConnectTimeout(timeout);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setReadTimeout(int timeout) {
      super.setReadTimeout(timeout);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setMaxNetworkRetries(int maxNetworkRetries) {
      super.setMaxNetworkRetries(maxNetworkRetries);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setConnectionProxy(Proxy connectionProxy) {
      super.setConnectionProxy(connectionProxy);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setProxyCredential(PasswordAuthentication proxyCredential) {
      super.setProxyCredential(proxyCredential);
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
