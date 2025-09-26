package com.stripe.net;

import com.stripe.StripeContext;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Map;

public class RawRequestOptions extends RequestOptions {
  private Map<String, String> additionalHeaders;

  public RawRequestOptions(
      Authenticator authenticator,
      String clientId,
      String idempotencyKey,
      String stripeContext,
      String stripeAccount,
      String stripeVersionOverride,
      String baseUrl,
      Integer connectTimeout,
      Integer readTimeout,
      Integer maxNetworkRetries,
      Proxy connectionProxy,
      PasswordAuthentication proxyCredential,
      Map<String, String> additionalHeaders) {
    super(
        authenticator,
        clientId,
        idempotencyKey,
        stripeContext,
        stripeAccount,
        stripeVersionOverride,
        baseUrl,
        connectTimeout,
        readTimeout,
        maxNetworkRetries,
        connectionProxy,
        proxyCredential);
    this.additionalHeaders = additionalHeaders;
  }

  public Map<String, String> getAdditionalHeaders() {
    return additionalHeaders;
  }

  public static RawRequestOptionsBuilder builder() {
    return new RawRequestOptionsBuilder();
  }

  public static final class RawRequestOptionsBuilder extends RequestOptions.RequestOptionsBuilder {
    private Map<String, String> additionalHeaders;

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
    public RawRequestOptionsBuilder setStripeContext(String stripeContext) {
      super.setStripeContext(stripeContext);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setStripeContext(StripeContext stripeContext) {
      super.setStripeContext(stripeContext);
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
    public RawRequestOptionsBuilder setConnectTimeout(Integer timeout) {
      super.setConnectTimeout(timeout);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setReadTimeout(Integer timeout) {
      super.setReadTimeout(timeout);
      return this;
    }

    @Override
    public RawRequestOptionsBuilder setMaxNetworkRetries(Integer maxNetworkRetries) {
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
          authenticator,
          normalizeClientId(this.clientId),
          normalizeIdempotencyKey(this.idempotencyKey),
          normalizeStripeContext(this.stripeContext),
          normalizeStripeAccount(this.stripeAccount),
          normalizeStripeVersion(this.stripeVersionOverride),
          normalizeBaseUrl(this.baseUrl),
          connectTimeout,
          readTimeout,
          maxNetworkRetries,
          connectionProxy,
          proxyCredential,
          additionalHeaders);
    }
  }
}
