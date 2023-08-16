// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class AppsService extends ApiService {
  public AppsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.apps.SecretService secrets() {
    return new com.stripe.service.apps.SecretService(this.getResponseGetter());
  }
}
