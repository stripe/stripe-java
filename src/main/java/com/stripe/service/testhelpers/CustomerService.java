// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.CustomerCashBalanceTransaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerFundCashBalanceParams;

public final class CustomerService extends ApiService {
  public CustomerService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create an incoming testmode bank transfer. */
  public CustomerCashBalanceTransaction fundCashBalance(
      String customer, CustomerFundCashBalanceParams params) throws StripeException {
    return fundCashBalance(customer, params, (RequestOptions) null);
  }
  /** Create an incoming testmode bank transfer. */
  public CustomerCashBalanceTransaction fundCashBalance(
      String customer, CustomerFundCashBalanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/customers/%s/fund_cash_balance", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, CustomerCashBalanceTransaction.class);
  }
}
