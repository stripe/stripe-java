// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class BillingService extends ApiService {
  public BillingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.billing.MeterEventAdjustmentService meterEventAdjustments() {
    return new com.stripe.service.billing.MeterEventAdjustmentService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterEventService meterEvents() {
    return new com.stripe.service.billing.MeterEventService(this.getResponseGetter());
  }

  public com.stripe.service.billing.MeterService meters() {
    return new com.stripe.service.billing.MeterService(this.getResponseGetter());
  }
}
