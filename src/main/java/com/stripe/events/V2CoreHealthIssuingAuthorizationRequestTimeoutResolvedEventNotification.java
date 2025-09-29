// File generated from our OpenAPI spec
package com.stripe.events;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.EventNotification;

public final class V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification
    extends EventNotification {
  /** Retrieve the corresponding full event from the Stripe API. */
  @Override
  public V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent fetchEvent()
      throws StripeException {
    return (V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent) super.fetchEvent();
  }
}
