// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class HealthService extends ApiService {
  public HealthService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.core.health.AlertService alerts() {
    return new com.stripe.service.v2.core.health.AlertService(this.getResponseGetter());
  }
}
