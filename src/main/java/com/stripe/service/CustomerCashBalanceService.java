// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.CashBalance;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerCashBalanceRetrieveParams;
import com.stripe.param.CustomerCashBalanceUpdateParams;

public final class CustomerCashBalanceService extends ApiService {
  public CustomerCashBalanceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer, CustomerCashBalanceRetrieveParams params)
      throws StripeException {
    return retrieve(customer, params, (RequestOptions) null);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer, RequestOptions options) throws StripeException {
    return retrieve(customer, (CustomerCashBalanceRetrieveParams) null, options);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer) throws StripeException {
    return retrieve(customer, (CustomerCashBalanceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(
      String customer, CustomerCashBalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CashBalance.class);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(String customer, CustomerCashBalanceUpdateParams params)
      throws StripeException {
    return update(customer, params, (RequestOptions) null);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(String customer, RequestOptions options) throws StripeException {
    return update(customer, (CustomerCashBalanceUpdateParams) null, options);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(String customer) throws StripeException {
    return update(customer, (CustomerCashBalanceUpdateParams) null, (RequestOptions) null);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(
      String customer, CustomerCashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CashBalance.class);
  }
}
