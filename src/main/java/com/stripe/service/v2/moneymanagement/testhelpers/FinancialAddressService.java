// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.testhelpers;

import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.FinancialAddressCreditSimulation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.testhelpers.FinancialAddressCreditParams;

public final class FinancialAddressService extends ApiService {
  public FinancialAddressService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Simulate crediting a FinancialAddress in a Sandbox environment. This can be used to add virtual
   * funds and increase your balance for testing.
   */
  public FinancialAddressCreditSimulation credit(String id, FinancialAddressCreditParams params)
      throws StripeException, FeatureNotEnabledException {
    return credit(id, params, (RequestOptions) null);
  }
  /**
   * Simulate crediting a FinancialAddress in a Sandbox environment. This can be used to add virtual
   * funds and increase your balance for testing.
   */
  public FinancialAddressCreditSimulation credit(
      String id, FinancialAddressCreditParams params, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    String path =
        String.format(
            "/v2/money_management/test_helpers/financial_addresses/%s/credit",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAddressCreditSimulation.class);
  }
}
