// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.FinancialAddressDebitSimulation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.testhelpers.FinancialAddressDebitParams;

public final class FinancialAddressService extends ApiService {
  public FinancialAddressService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Simulate debiting a FinancialAddress in a Sandbox environment. This can be used to remove
   * virtual funds and decrease your balance for testing.
   */
  public FinancialAddressDebitSimulation debit(String id, FinancialAddressDebitParams params)
      throws StripeException {
    return debit(id, params, (RequestOptions) null);
  }
  /**
   * Simulate debiting a FinancialAddress in a Sandbox environment. This can be used to remove
   * virtual funds and decrease your balance for testing.
   */
  public FinancialAddressDebitSimulation debit(
      String id, FinancialAddressDebitParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/test_helpers/financial_addresses/%s/debit",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAddressDebitSimulation.class);
  }
}
