// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerCashBalanceTransaction;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerCashBalanceTransactionListParams;
import com.stripe.param.CustomerCashBalanceTransactionRetrieveParams;

public final class CustomerCashBalanceTransactionService extends ApiService {
  public CustomerCashBalanceTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(
      String id, CustomerCashBalanceTransactionListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (CustomerCashBalanceTransactionListParams) null, options);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(String id) throws StripeException {
    return list(id, (CustomerCashBalanceTransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(
      String id, CustomerCashBalanceTransactionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/cash_balance_transactions", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CustomerCashBalanceTransaction>>() {}.getType());
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customerId, String id, CustomerCashBalanceTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(customerId, id, params, (RequestOptions) null);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customerId, String id, RequestOptions options) throws StripeException {
    return retrieve(customerId, id, (CustomerCashBalanceTransactionRetrieveParams) null, options);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(String customerId, String id)
      throws StripeException {
    return retrieve(
        customerId, id, (CustomerCashBalanceTransactionRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customerId,
      String id,
      CustomerCashBalanceTransactionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/cash_balance_transactions/%s",
            ApiResource.urlEncodeId(customerId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CustomerCashBalanceTransaction.class);
  }
}
