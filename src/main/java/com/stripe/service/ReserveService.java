// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ReserveService extends ApiService {
  public ReserveService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.reserve.HoldService holds() {
    return new com.stripe.service.reserve.HoldService(this.getResponseGetter());
  }

  public com.stripe.service.reserve.PlanService plans() {
    return new com.stripe.service.reserve.PlanService(this.getResponseGetter());
  }

  public com.stripe.service.reserve.ReleaseService releases() {
    return new com.stripe.service.reserve.ReleaseService(this.getResponseGetter());
  }
}
