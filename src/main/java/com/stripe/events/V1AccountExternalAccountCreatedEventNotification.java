// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.EventNotification;

public final class V1AccountExternalAccountCreatedEventNotification extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V1AccountExternalAccountCreatedEvent fetchEvent() throws StripeException {
    return (V1AccountExternalAccountCreatedEvent) super.fetchEvent();
  }
}
