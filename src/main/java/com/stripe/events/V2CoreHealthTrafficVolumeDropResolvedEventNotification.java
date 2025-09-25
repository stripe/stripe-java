// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.EventNotification;

public final class V2CoreHealthTrafficVolumeDropResolvedEventNotification
    extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2CoreHealthTrafficVolumeDropResolvedEvent fetchEvent() throws StripeException {
    return (V2CoreHealthTrafficVolumeDropResolvedEvent) super.fetchEvent();
  }
}
