// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CapitalService extends ApiService {
  public CapitalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.capital.FinancingOfferService financingOffers() {
    return new com.stripe.service.testhelpers.capital.FinancingOfferService(
        this.getResponseGetter());
  }
}
