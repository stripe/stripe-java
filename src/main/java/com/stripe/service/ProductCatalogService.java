// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ProductCatalogService extends ApiService {
  public ProductCatalogService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.productcatalog.TrialOfferService trialOffers() {
    return new com.stripe.service.productcatalog.TrialOfferService(this.getResponseGetter());
  }
}
