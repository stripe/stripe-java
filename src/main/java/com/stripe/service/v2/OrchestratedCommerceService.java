// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class OrchestratedCommerceService extends ApiService {
  public OrchestratedCommerceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.orchestratedcommerce.AgreementService agreements() {
    return new com.stripe.service.v2.orchestratedcommerce.AgreementService(
        this.getResponseGetter());
  }
}
