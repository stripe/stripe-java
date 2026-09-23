// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class CatalogService extends ApiService {
  public CatalogService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.provisioning.catalog.ProviderService providers() {
    return new com.stripe.service.v2.provisioning.catalog.ProviderService(this.getResponseGetter());
  }

  public com.stripe.service.v2.provisioning.catalog.ServiceService services() {
    return new com.stripe.service.v2.provisioning.catalog.ServiceService(this.getResponseGetter());
  }
}
