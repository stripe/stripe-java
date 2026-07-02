// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CryptoService extends ApiService {
  public CryptoService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.crypto.CustomerService customers() {
    return new com.stripe.service.crypto.CustomerService(this.getResponseGetter());
  }

  public com.stripe.service.crypto.OnrampSessionService onrampSessions() {
    return new com.stripe.service.crypto.OnrampSessionService(this.getResponseGetter());
  }

  public com.stripe.service.crypto.OnrampTransactionLimitsService onrampTransactionLimits() {
    return new com.stripe.service.crypto.OnrampTransactionLimitsService(this.getResponseGetter());
  }
}
