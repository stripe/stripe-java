package com.stripe.net;

import java.net.PasswordAuthentication;
import java.net.Proxy;

/** Controls how the request is sent by {@link StripeResponseGetter} */
public abstract class StripeResponseGetterOptions {
  // When adding settings here keep them in sync with settings in RequestOptions and
  // in the RequestOptions.merge method
  public abstract Authenticator getAuthenticator();

  public abstract String getClientId();

  public abstract int getConnectTimeout();

  public abstract Proxy getConnectionProxy();

  public abstract int getMaxNetworkRetries();

  public abstract PasswordAuthentication getProxyCredential();

  public abstract String getApiBase();

  public abstract String getFilesBase();

  public abstract String getConnectBase();

  public abstract String getEventsBase();

  public abstract int getReadTimeout();

  public abstract String getStripeContext();
}
