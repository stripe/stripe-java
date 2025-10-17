// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class DelegatedCheckoutService extends ApiService {
  public DelegatedCheckoutService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.delegatedcheckout.RequestedSessionService requestedSessions() {
    return new com.stripe.service.delegatedcheckout.RequestedSessionService(
        this.getResponseGetter());
  }
}
