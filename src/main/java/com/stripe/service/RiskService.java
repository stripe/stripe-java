// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class RiskService extends ApiService {
  public RiskService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.risk.FormService forms() {
    return new com.stripe.service.risk.FormService(this.getResponseGetter());
  }
}
