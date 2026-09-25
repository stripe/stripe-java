// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.EarnedCreditSimulation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.TestHelperEarnedCreditsParams;

public final class TestHelperService extends ApiService {
  public TestHelperService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates an EarnedCredit in a Sandbox environment for testing purposes. */
  public EarnedCreditSimulation earnedCredits(TestHelperEarnedCreditsParams params)
      throws StripeException {
    return earnedCredits(params, (RequestOptions) null);
  }
  /** Creates an EarnedCredit in a Sandbox environment for testing purposes. */
  public EarnedCreditSimulation earnedCredits(
      TestHelperEarnedCreditsParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/test_helpers/earned_credits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, EarnedCreditSimulation.class);
  }

  public com.stripe.service.v2.moneymanagement.testhelpers.FinancialAddressService
      financialAddresses() {
    return new com.stripe.service.v2.moneymanagement.testhelpers.FinancialAddressService(
        this.getResponseGetter());
  }
}
