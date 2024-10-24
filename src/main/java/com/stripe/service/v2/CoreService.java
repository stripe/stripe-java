// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CoreService extends ApiService {
  public CoreService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.core.EventDestinationService eventDestinations() {
    return new com.stripe.service.v2.core.EventDestinationService(this.getResponseGetter());
  }

  public com.stripe.service.v2.core.EventService events() {
    return new com.stripe.service.v2.core.EventService(this.getResponseGetter());
  }
}
