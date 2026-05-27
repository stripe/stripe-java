// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.CashBalance;
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
            options);
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
            options);
    return this.request(request, CashBalance.class);
  }
  /** Serializes a CustomerCashBalance update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String customer, CustomerCashBalanceUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(customer, params, (RequestOptions) null);
  }
  /** Serializes a CustomerCashBalance update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String customer, CustomerCashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("customer", customer);
    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("path_params", pathParams);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
}
