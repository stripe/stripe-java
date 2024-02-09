// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCollectionCustomerBalanceTransactionsParams;
import com.stripe.param.CustomerCollectionCustomerCashBalanceTransactionsParams;
import com.stripe.param.CustomerCollectionPaymentSourcesParams;
import com.stripe.param.CustomerCollectionTaxIdsParams;
import java.util.Map;

public class CustomerCollection extends StripeCollection<Customer> {
  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection customerBalanceTransactions(
      Map<String, Object> params) throws StripeException {
    return customerBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection customerBalanceTransactions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection customerBalanceTransactions(
      CustomerCollectionCustomerBalanceTransactionsParams params) throws StripeException {
    return customerBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection customerBalanceTransactions(
      CustomerCollectionCustomerBalanceTransactionsParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection customerCashBalanceTransactions(
      Map<String, Object> params) throws StripeException {
    return customerCashBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection customerCashBalanceTransactions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CustomerCashBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection customerCashBalanceTransactions(
      CustomerCollectionCustomerCashBalanceTransactionsParams params) throws StripeException {
    return customerCashBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection customerCashBalanceTransactions(
      CustomerCollectionCustomerCashBalanceTransactionsParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CustomerCashBalanceTransactionCollection.class);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection paymentSources(Map<String, Object> params) throws StripeException {
    return paymentSources(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection paymentSources(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PaymentSourceCollection.class);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection paymentSources(CustomerCollectionPaymentSourcesParams params)
      throws StripeException {
    return paymentSources(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection paymentSources(
      CustomerCollectionPaymentSourcesParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentSourceCollection.class);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection taxIds(Map<String, Object> params) throws StripeException {
    return taxIds(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection taxIds(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection taxIds(CustomerCollectionTaxIdsParams params) throws StripeException {
    return taxIds(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection taxIds(CustomerCollectionTaxIdsParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TaxIdCollection.class);
  }
}
