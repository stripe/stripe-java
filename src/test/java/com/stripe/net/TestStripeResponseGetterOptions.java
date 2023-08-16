package com.stripe.net;

import java.net.PasswordAuthentication;
import java.net.Proxy;
import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "set")
@Getter(onMethod_ = {@Override})
public class TestStripeResponseGetterOptions extends StripeResponseGetterOptions {
  // When adding setting here keep them in sync with settings in RequestOptions and
  // in the RequestOptions.merge method
  private final String apiKey;
  private final String clientId;
  private final int connectTimeout;
  private final int readTimeout;
  private final int maxNetworkRetries;
  private final Proxy connectionProxy;
  private final PasswordAuthentication proxyCredential;
  private final String apiBase;
  private final String filesBase;
  private final String connectBase;

  public TestStripeResponseGetterOptions(
      String apiKey,
      String clientId,
      int connectTimeout,
      int readTimeout,
      int maxNetworkRetries,
      Proxy connectionProxy,
      PasswordAuthentication proxyCredential,
      String apiBase,
      String filesBase,
      String connectBase) {
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.connectTimeout = connectTimeout;
    this.readTimeout = readTimeout;
    this.maxNetworkRetries = maxNetworkRetries;
    this.connectionProxy = connectionProxy;
    this.proxyCredential = proxyCredential;
    this.apiBase = apiBase;
    this.filesBase = filesBase;
    this.connectBase = connectBase;
  }
}
