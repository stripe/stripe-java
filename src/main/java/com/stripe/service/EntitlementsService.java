// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class EntitlementsService extends ApiService {
  public EntitlementsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.entitlements.FeatureService features() {
    return new com.stripe.service.entitlements.FeatureService(this.getResponseGetter());
  }
}
