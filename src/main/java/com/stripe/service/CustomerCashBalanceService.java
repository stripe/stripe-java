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
  public CashBalance retrieve(String id, CustomerCashBalanceRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (CustomerCashBalanceRetrieveParams) null, options);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String id) throws StripeException {
    return retrieve(id, (CustomerCashBalanceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(
      String id, CustomerCashBalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(id));
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
  public CashBalance update(String id, CustomerCashBalanceUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(String id, RequestOptions options) throws StripeException {
    return update(id, (CustomerCashBalanceUpdateParams) null, options);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(String id) throws StripeException {
    return update(id, (CustomerCashBalanceUpdateParams) null, (RequestOptions) null);
  }
  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(
      String id, CustomerCashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(id));
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
  public String serializeBatchUpdate(String id, CustomerCashBalanceUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(id, params, (RequestOptions) null);
  }
  /** Serializes a CustomerCashBalance update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String id, CustomerCashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("id", id);
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
