// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.EventNotification;

public final class V2CoreHealthElementsErrorResolvedEventNotification extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2CoreHealthElementsErrorResolvedEvent fetchEvent() throws StripeException {
    return (V2CoreHealthElementsErrorResolvedEvent) super.fetchEvent();
  }
}
