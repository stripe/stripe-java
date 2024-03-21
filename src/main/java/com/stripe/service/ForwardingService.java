// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ForwardingService extends ApiService {
  public ForwardingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.forwarding.RequestService requests() {
    return new com.stripe.service.forwarding.RequestService(this.getResponseGetter());
  }
}
