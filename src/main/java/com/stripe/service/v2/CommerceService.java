// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CommerceService extends ApiService {
  public CommerceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.commerce.ProductCatalogService productCatalog() {
    return new com.stripe.service.v2.commerce.ProductCatalogService(this.getResponseGetter());
  }
}
