// File generated from our OpenAPI spec
package com.stripe.service.v2.commerce;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ProductCatalogService extends ApiService {
  public ProductCatalogService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.commerce.productcatalog.ImportService imports() {
    return new com.stripe.service.v2.commerce.productcatalog.ImportService(
        this.getResponseGetter());
  }
}
