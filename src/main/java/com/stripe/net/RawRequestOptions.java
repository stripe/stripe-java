package com.stripe.net;

import com.stripe.StripeContext;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Map;

public class RawRequestOptions extends RequestOptions {
  private Map<String, String> additionalHeaders;

  private RawRequestOptions(RawRequestOptionsBuilder builder) {
    super(builder);
    this.additionalHeaders = builder.additionalHeaders;
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
    public RawRequestOptionsBuilder setStripeRequestTrigger(String stripeRequestTrigger) {
      super.setStripeRequestTrigger(stripeRequestTrigger);
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
      return new RawRequestOptions(this);
    }
  }
}
