// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.EventNotification;

public final class V2CoreHealthPaymentMethodErrorFiringEventNotification extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2CoreHealthPaymentMethodErrorFiringEvent fetchEvent() throws StripeException {
    return (V2CoreHealthPaymentMethodErrorFiringEvent) super.fetchEvent();
  }
}
