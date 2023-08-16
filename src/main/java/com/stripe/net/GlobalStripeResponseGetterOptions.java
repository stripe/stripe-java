package com.stripe.net;

import com.stripe.Stripe;
import java.net.PasswordAuthentication;
import java.net.Proxy;

/**
 * The {@link StripeResponseGetterOptions} implementation that pulls values from the global options
 * in the Stripe class
 */
public class GlobalStripeResponseGetterOptions extends StripeResponseGetterOptions {
  public static final GlobalStripeResponseGetterOptions INSTANCE =
      new GlobalStripeResponseGetterOptions();

  private GlobalStripeResponseGetterOptions() {}

  @Override
  public String getApiKey() {
    return Stripe.apiKey;
  }

  @Override
  public int getReadTimeout() {
    return Stripe.getReadTimeout();
  }

  @Override
  public int getConnectTimeout() {
    return Stripe.getConnectTimeout();
  }

  @Override
  public int getMaxNetworkRetries() {
    return Stripe.getMaxNetworkRetries();
  }

  @Override
  public PasswordAuthentication getProxyCredential() {
    return Stripe.getProxyCredential();
  }

  @Override
  public Proxy getConnectionProxy() {
    return Stripe.getConnectionProxy();
  }

  @Override
  public String getClientId() {
    return Stripe.clientId;
  }

  @Override
  public String getApiBase() {
    return Stripe.getApiBase();
  }

  @Override
  public String getFilesBase() {
    return Stripe.getUploadBase();
  }

  @Override
  public String getConnectBase() {
    return Stripe.getConnectBase();
  }
}
