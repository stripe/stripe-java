// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TestHelperService extends ApiService {
  public TestHelperService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.testhelpers.FinancialAddressService financialAddresses() {
    return new com.stripe.service.v2.testhelpers.FinancialAddressService(this.getResponseGetter());
  }

  public com.stripe.service.v2.testhelpers.MoneyManagementService moneyManagement() {
    return new com.stripe.service.v2.testhelpers.MoneyManagementService(this.getResponseGetter());
  }
}
