// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class SharedPaymentService extends ApiService {
  public SharedPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.sharedpayment.GrantedTokenService grantedTokens() {
    return new com.stripe.service.testhelpers.sharedpayment.GrantedTokenService(
        this.getResponseGetter());
  }
}
