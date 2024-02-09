// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCollectionCreateParams;
import com.stripe.param.CustomerCollectionListParams;
import com.stripe.param.CustomerCollectionRetrieveParams;
import java.util.Map;

public class CustomerCollection extends StripeCollection<Customer> {
  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
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
  public CustomerBalanceTransaction create(CustomerCollectionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(
      CustomerCollectionCreateParams params, RequestOptions options) throws StripeException {
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
  public PaymentSource create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
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
  public PaymentSource create(Map<String, Object> params, RequestOptions options)
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
  public PaymentSource create(CustomerCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
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
  public PaymentSource create(CustomerCollectionCreateParams params, RequestOptions options)
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
  public TaxId create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(CustomerCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(CustomerCollectionCreateParams params, RequestOptions options)
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
  public CustomerBalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection list(
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
  public CustomerBalanceTransactionCollection list(CustomerCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection list(
      CustomerCollectionListParams params, RequestOptions options) throws StripeException {
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
  public CustomerCashBalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection list(
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
  public CustomerCashBalanceTransactionCollection list(CustomerCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection list(
      CustomerCollectionListParams params, RequestOptions options) throws StripeException {
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
  public PaymentSourceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PaymentSourceCollection.class);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(CustomerCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(CustomerCollectionListParams params, RequestOptions options)
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
  public TaxIdCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxIdCollection.class);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(CustomerCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(CustomerCollectionListParams params, RequestOptions options)
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

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(
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
  public CustomerBalanceTransaction retrieve(
      String id, CustomerCollectionRetrieveParams params, RequestOptions options)
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
  public CustomerCashBalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransaction retrieve(
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
  public CustomerCashBalanceTransaction retrieve(
      String id, CustomerCollectionRetrieveParams params, RequestOptions options)
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
  public PaymentSource retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PaymentSource.class);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(
      String id, CustomerCollectionRetrieveParams params, RequestOptions options)
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
  public TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TaxId.class);
  }

  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String id, CustomerCollectionRetrieveParams params, RequestOptions options)
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
}
