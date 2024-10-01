// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class BillingService extends ApiService {
  public BillingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.billing.MeterEventAdjustmentService meterEventAdjustments() {
    return new com.stripe.service.v2.billing.MeterEventAdjustmentService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventSessionService meterEventSession() {
    return new com.stripe.service.v2.billing.MeterEventSessionService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventStreamService meterEventStream() {
    return new com.stripe.service.v2.billing.MeterEventStreamService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.MeterEventService meterEvents() {
    return new com.stripe.service.v2.billing.MeterEventService(this.getResponseGetter());
  }
}
