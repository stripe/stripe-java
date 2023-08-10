// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerBalanceTransactionCollectionCreateParams;
import com.stripe.param.CustomerBalanceTransactionCollectionListParams;
import com.stripe.param.CustomerBalanceTransactionCollectionRetrieveParams;
import java.util.Map;

public class CustomerBalanceTransactionCollection
    extends StripeCollection<CustomerBalanceTransaction> {
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CustomerBalanceTransaction.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(CustomerBalanceTransactionCollectionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an immutable transaction that updates the customer’s credit <a
   * href="https://stripe.com/docs/billing/customer/balance">balance</a>.
   */
  public CustomerBalanceTransaction create(
      CustomerBalanceTransactionCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CustomerBalanceTransaction.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CustomerBalanceTransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection list(
      CustomerBalanceTransactionCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection list(
      CustomerBalanceTransactionCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CustomerBalanceTransactionCollection.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CustomerBalanceTransaction.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransaction retrieve(
      String id, CustomerBalanceTransactionCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CustomerBalanceTransaction.class,
            options,
            ApiMode.V1);
  }
}
