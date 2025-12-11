// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class SharedPaymentService extends ApiService {
  public SharedPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.sharedpayment.GrantedTokenService grantedTokens() {
    return new com.stripe.service.sharedpayment.GrantedTokenService(this.getResponseGetter());
  }
}
