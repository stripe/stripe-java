// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.ThinEvent;

public final class PushedV1BillingMeterNoMeterFoundEvent extends ThinEvent {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V1BillingMeterNoMeterFoundEvent pull() throws StripeException {
    return (V1BillingMeterNoMeterFoundEvent) super.pull();
  }
}
