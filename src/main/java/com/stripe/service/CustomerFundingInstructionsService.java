// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.FundingInstructions;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerFundingInstructionsCreateParams;

public final class CustomerFundingInstructionsService extends ApiService {
  public CustomerFundingInstructionsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions create(String customer, CustomerFundingInstructionsCreateParams params)
      throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions create(
      String customer, CustomerFundingInstructionsCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/funding_instructions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, FundingInstructions.class);
  }
}
