// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCollectionCreateCustomerBalanceTransactionParams;
import com.stripe.param.CustomerCollectionCreatePaymentSourceParams;
import com.stripe.param.CustomerCollectionCreateTaxIdParams;
import com.stripe.param.CustomerCollectionCustomerBalanceTransactionsParams;
import com.stripe.param.CustomerCollectionCustomerCashBalanceTransactionsParams;
import com.stripe.param.CustomerCollectionPaymentSourcesParams;
import com.stripe.param.CustomerCollectionRetrieveCustomerBalanceTransactionParams;
import com.stripe.param.CustomerCollectionRetrieveCustomerCashBalanceTransactionParams;
import com.stripe.param.CustomerCollectionRetrievePaymentSourceParams;
import com.stripe.param.CustomerCollectionRetrieveTaxIdParams;
import com.stripe.param.CustomerCollectionTaxIdsParams;
import java.util.Map;

public class CustomerCollection extends StripeCollection<Customer> {
  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction createCustomerBalanceTransaction(Map<String, Object> params)
      throws StripeException {
    return createCustomerBalanceTransaction(params, (RequestOptions) null);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction createCustomerBalanceTransaction(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransaction.class);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction createCustomerBalanceTransaction(
      CustomerCollectionCreateCustomerBalanceTransactionParams params) throws StripeException {
    return createCustomerBalanceTransaction(params, (RequestOptions) null);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction createCustomerBalanceTransaction(
      CustomerCollectionCreateCustomerBalanceTransactionParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransaction.class);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource createPaymentSource(Map<String, Object> params) throws StripeException {
    return createPaymentSource(params, (RequestOptions) null);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource createPaymentSource(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource createPaymentSource(CustomerCollectionCreatePaymentSourceParams params)
      throws StripeException {
    return createPaymentSource(params, (RequestOptions) null);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/docs/api#update_customer">update the customer</a> to have a new
   * {@code default_source}.
   */
  public PaymentSource createPaymentSource(
      CustomerCollectionCreatePaymentSourceParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId createTaxId(Map<String, Object> params) throws StripeException {
    return createTaxId(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId createTaxId(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId createTaxId(CustomerCollectionCreateTaxIdParams params) throws StripeException {
    return createTaxId(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId createTaxId(CustomerCollectionCreateTaxIdParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
  }

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

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieveCustomerBalanceTransaction(String id)
      throws StripeException {
    return retrieveCustomerBalanceTransaction(
        id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieveCustomerBalanceTransaction(
      String id, RequestOptions options) throws StripeException {
    return retrieveCustomerBalanceTransaction(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieveCustomerBalanceTransaction(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransaction.class);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieveCustomerBalanceTransaction(
      String id,
      CustomerCollectionRetrieveCustomerBalanceTransactionParams params,
      RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CustomerBalanceTransaction.class);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieveCustomerCashBalanceTransaction(String id)
      throws StripeException {
    return retrieveCustomerCashBalanceTransaction(
        id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieveCustomerCashBalanceTransaction(
      String id, RequestOptions options) throws StripeException {
    return retrieveCustomerCashBalanceTransaction(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieveCustomerCashBalanceTransaction(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CustomerCashBalanceTransaction.class);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieveCustomerCashBalanceTransaction(
      String id,
      CustomerCollectionRetrieveCustomerCashBalanceTransactionParams params,
      RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CustomerCashBalanceTransaction.class);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrievePaymentSource(String id) throws StripeException {
    return retrievePaymentSource(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrievePaymentSource(String id, RequestOptions options)
      throws StripeException {
    return retrievePaymentSource(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrievePaymentSource(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrievePaymentSource(
      String id, CustomerCollectionRetrievePaymentSourceParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieveTaxId(String id) throws StripeException {
    return retrieveTaxId(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieveTaxId(String id, RequestOptions options) throws StripeException {
    return retrieveTaxId(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieveTaxId(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieveTaxId(
      String id, CustomerCollectionRetrieveTaxIdParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
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
