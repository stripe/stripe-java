// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class LicensePricingService extends ApiService {
  public LicensePricingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.billing.contracts.licensepricing.QuantityChangeService
      quantityChanges() {
    return new com.stripe.service.v2.billing.contracts.licensepricing.QuantityChangeService(
        this.getResponseGetter());
  }
}
