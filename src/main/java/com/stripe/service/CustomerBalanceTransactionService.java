// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerBalanceTransaction;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerBalanceTransactionCreateParams;
import com.stripe.param.CustomerBalanceTransactionListParams;
import com.stripe.param.CustomerBalanceTransactionRetrieveParams;
import com.stripe.param.CustomerBalanceTransactionUpdateParams;

public final class CustomerBalanceTransactionService extends ApiService {
  public CustomerBalanceTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public StripeCollection<CustomerBalanceTransaction> list(
      String customer, CustomerBalanceTransactionListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public StripeCollection<CustomerBalanceTransaction> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerBalanceTransactionListParams) null, options);
  }
  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public StripeCollection<CustomerBalanceTransaction> list(String customer) throws StripeException {
    return list(customer, (CustomerBalanceTransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public StripeCollection<CustomerBalanceTransaction> list(
      String customer, CustomerBalanceTransactionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(
        request, new TypeToken<StripeCollection<CustomerBalanceTransaction>>() {}.getType());
  }
  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(
      String customer, CustomerBalanceTransactionCreateParams params) throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(
      String customer, CustomerBalanceTransactionCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CustomerBalanceTransaction.class);
  }
  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(
      String customer, String transaction, CustomerBalanceTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(customer, transaction, params, (RequestOptions) null);
  }
  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(
      String customer, String transaction, RequestOptions options) throws StripeException {
    return retrieve(
        customer, transaction, (CustomerBalanceTransactionRetrieveParams) null, options);
  }
  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(String customer, String transaction)
      throws StripeException {
    return retrieve(
        customer,
        transaction,
        (CustomerBalanceTransactionRetrieveParams) null,
        (RequestOptions) null);
  }
  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(
      String customer,
      String transaction,
      CustomerBalanceTransactionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/balance_transactions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CustomerBalanceTransaction.class);
  }
  /**
   * Most credit balance transaction fields are immutable, but you may update its {@code
   * description} and {@code metadata}.
   */
  public CustomerBalanceTransaction update(
      String customer, String transaction, CustomerBalanceTransactionUpdateParams params)
      throws StripeException {
    return update(customer, transaction, params, (RequestOptions) null);
  }
  /**
   * Most credit balance transaction fields are immutable, but you may update its {@code
   * description} and {@code metadata}.
   */
  public CustomerBalanceTransaction update(
      String customer, String transaction, RequestOptions options) throws StripeException {
    return update(customer, transaction, (CustomerBalanceTransactionUpdateParams) null, options);
  }
  /**
   * Most credit balance transaction fields are immutable, but you may update its {@code
   * description} and {@code metadata}.
   */
  public CustomerBalanceTransaction update(String customer, String transaction)
      throws StripeException {
    return update(
        customer,
        transaction,
        (CustomerBalanceTransactionUpdateParams) null,
        (RequestOptions) null);
  }
  /**
   * Most credit balance transaction fields are immutable, but you may update its {@code
   * description} and {@code metadata}.
   */
  public CustomerBalanceTransaction update(
      String customer,
      String transaction,
      CustomerBalanceTransactionUpdateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/balance_transactions/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, CustomerBalanceTransaction.class);
  }
}
