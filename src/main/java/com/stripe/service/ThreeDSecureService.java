// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ThreeDSecureService extends ApiService {
  public ThreeDSecureService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.threedsecure.AuthenticationService authentications() {
    return new com.stripe.service.threedsecure.AuthenticationService(this.getResponseGetter());
  }
}
