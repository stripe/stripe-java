// File generated from our OpenAPI spec
package com.stripe.service.v2.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.FinancialAddressCreditSimulation;
import com.stripe.model.v2.FinancialAddressGeneratedMicrodeposits;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.testhelpers.FinancialAddressCreditParams;

public final class FinancialAddressService extends ApiService {
  public FinancialAddressService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Simulate crediting a FinancialAddress in a Sandbox environment. This can be used to add virtual
   * funds and increase your balance for testing.
   */
  public FinancialAddressCreditSimulation credit(String id, FinancialAddressCreditParams params)
      throws StripeException {
    return credit(id, params, (RequestOptions) null);
  }
  /**
   * Simulate crediting a FinancialAddress in a Sandbox environment. This can be used to add virtual
   * funds and increase your balance for testing.
   */
  public FinancialAddressCreditSimulation credit(
      String id, FinancialAddressCreditParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/test_helpers/financial_addresses/%s/credit", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAddressCreditSimulation.class);
  }
  /** Generates microdeposits for a FinancialAddress in a Sandbox environment. */
  public FinancialAddressGeneratedMicrodeposits generateMicrodeposits(String id)
      throws StripeException {
    return generateMicrodeposits(id, (RequestOptions) null);
  }
  /** Generates microdeposits for a FinancialAddress in a Sandbox environment. */
  public FinancialAddressGeneratedMicrodeposits generateMicrodeposits(
      String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/test_helpers/financial_addresses/%s/generate_microdeposits",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, FinancialAddressGeneratedMicrodeposits.class);
  }
}
