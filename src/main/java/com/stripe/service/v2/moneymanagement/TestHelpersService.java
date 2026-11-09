// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TestHelpersService extends ApiService {
  public TestHelpersService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.moneymanagement.testhelpers.FinancialAddressService
      financialAddresses() {
    return new com.stripe.service.v2.moneymanagement.testhelpers.FinancialAddressService(
        this.getResponseGetter());
  }
}
