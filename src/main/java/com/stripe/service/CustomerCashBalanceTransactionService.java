// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerCashBalanceTransaction;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customer, String transaction, CustomerCashBalanceTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(customer, transaction, params, (RequestOptions) null);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customer, String transaction, RequestOptions options) throws StripeException {
    return retrieve(
        customer, transaction, (CustomerCashBalanceTransactionRetrieveParams) null, options);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(String customer, String transaction)
      throws StripeException {
    return retrieve(
        customer,
        transaction,
        (CustomerCashBalanceTransactionRetrieveParams) null,
        (RequestOptions) null);
  }
  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
      String customer,
      String transaction,
      CustomerCashBalanceTransactionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/cash_balance_transactions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(transaction));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CustomerCashBalanceTransaction.class,
            options,
            ApiMode.V1);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(
      String customer, CustomerCashBalanceTransactionListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(
      String customer, RequestOptions options) throws StripeException {
    return list(customer, (CustomerCashBalanceTransactionListParams) null, options);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(String customer)
      throws StripeException {
    return list(customer, (CustomerCashBalanceTransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public StripeCollection<CustomerCashBalanceTransaction> list(
      String customer, CustomerCashBalanceTransactionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/cash_balance_transactions", ApiResource.urlEncodeId(customer));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<CustomerCashBalanceTransaction>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
