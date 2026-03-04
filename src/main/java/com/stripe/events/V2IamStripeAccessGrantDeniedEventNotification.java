// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.EventNotification;

public final class V2IamStripeAccessGrantDeniedEventNotification extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2IamStripeAccessGrantDeniedEvent fetchEvent() throws StripeException {
    return (V2IamStripeAccessGrantDeniedEvent) super.fetchEvent();
  }
}
