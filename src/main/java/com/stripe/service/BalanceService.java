// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceRetrieveParams;

public final class BalanceService extends ApiService {
  public BalanceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public Balance retrieve(BalanceRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve((BalanceRetrieveParams) null, options);
  }
  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public Balance retrieve() throws StripeException {
    return retrieve((BalanceRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public Balance retrieve(BalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Balance.class);
  }
}
