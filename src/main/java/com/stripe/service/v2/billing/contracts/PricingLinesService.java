// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class PricingLinesService extends ApiService {
  public PricingLinesService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.billing.contracts.pricinglines.QuantityChangeService
      quantityChanges() {
    return new com.stripe.service.v2.billing.contracts.pricinglines.QuantityChangeService(
        this.getResponseGetter());
  }
}
