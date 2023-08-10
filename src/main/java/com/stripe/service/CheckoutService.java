// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CheckoutService extends ApiService {
  public CheckoutService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.checkout.SessionService sessions() {
    return new com.stripe.service.checkout.SessionService(this.getResponseGetter());
  }
}
