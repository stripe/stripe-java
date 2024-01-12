// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.Discount;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.param.CustomerSearchParams;
import com.stripe.param.CustomerUpdateParams;

public final class CustomerService extends ApiService {
  public CustomerService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(String customer) throws StripeException {
    return delete(customer, (RequestOptions) null);
  }
  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(String customer, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return getResponseGetter().request(request, Customer.class);
  }
  /** Retrieves a Customer object. */
  public Customer retrieve(String customer, CustomerRetrieveParams params) throws StripeException {
    return retrieve(customer, params, (RequestOptions) null);
  }
  /** Retrieves a Customer object. */
  public Customer retrieve(String customer, RequestOptions options) throws StripeException {
    return retrieve(customer, (CustomerRetrieveParams) null, options);
  }
  /** Retrieves a Customer object. */
  public Customer retrieve(String customer) throws StripeException {
    return retrieve(customer, (CustomerRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a Customer object. */
  public Customer retrieve(String customer, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Customer.class);
  }
  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer, CustomerUpdateParams params) throws StripeException {
    return update(customer, params, (RequestOptions) null);
  }
  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer, RequestOptions options) throws StripeException {
    return update(customer, (CustomerUpdateParams) null, options);
  }
  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer) throws StripeException {
    return update(customer, (CustomerUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer, CustomerUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Customer.class);
  }
  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(String customer) throws StripeException {
    return deleteDiscount(customer, (RequestOptions) null);
  }
  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(String customer, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s/discount", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return getResponseGetter().request(request, Discount.class);
  }
  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public StripeCollection<Customer> list(CustomerListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public StripeCollection<Customer> list(RequestOptions options) throws StripeException {
    return list((CustomerListParams) null, options);
  }
  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public StripeCollection<Customer> list() throws StripeException {
    return list((CustomerListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public StripeCollection<Customer> list(CustomerListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Customer>>() {}.getType());
  }
  /** Creates a new customer object. */
  public Customer create(CustomerCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new customer object. */
  public Customer create(RequestOptions options) throws StripeException {
    return create((CustomerCreateParams) null, options);
  }
  /** Creates a new customer object. */
  public Customer create() throws StripeException {
    return create((CustomerCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new customer object. */
  public Customer create(CustomerCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Customer.class);
  }
  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Customer> search(CustomerSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Customer> search(CustomerSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeSearchResult<Customer>>() {}.getType());
  }

  public com.stripe.service.CustomerBalanceTransactionService balanceTransactions() {
    return new com.stripe.service.CustomerBalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.CashBalanceService cashBalance() {
    return new com.stripe.service.CashBalanceService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerCashBalanceTransactionService cashBalanceTransactions() {
    return new com.stripe.service.CustomerCashBalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerFundingInstructionsService fundingInstructions() {
    return new com.stripe.service.CustomerFundingInstructionsService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerPaymentMethodService paymentMethods() {
    return new com.stripe.service.CustomerPaymentMethodService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentSourceService paymentSources() {
    return new com.stripe.service.PaymentSourceService(this.getResponseGetter());
  }

  public com.stripe.service.TaxIdService taxIds() {
    return new com.stripe.service.TaxIdService(this.getResponseGetter());
  }
}
