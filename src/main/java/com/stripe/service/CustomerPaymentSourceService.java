// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.PaymentSource;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerPaymentSourceCreateParams;
import com.stripe.param.CustomerPaymentSourceDeleteParams;
import com.stripe.param.CustomerPaymentSourceListParams;
import com.stripe.param.CustomerPaymentSourceRetrieveParams;
import com.stripe.param.CustomerPaymentSourceUpdateParams;
import com.stripe.param.CustomerPaymentSourceVerifyParams;

public final class CustomerPaymentSourceService extends ApiService {
  public CustomerPaymentSourceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(
      String customer, CustomerPaymentSourceListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerPaymentSourceListParams) null, options);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(String customer) throws StripeException {
    return list(customer, (CustomerPaymentSourceListParams) null, (RequestOptions) null);
  }
  /** List sources for a specified customer. */
  public StripeCollection<PaymentSource> list(
      String customer, CustomerPaymentSourceListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/sources", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PaymentSource>>() {}.getType());
  }
  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/api/customers/update">update the customer</a> to have a new {@code
   * default_source}.
   */
  public PaymentSource create(String customer, CustomerPaymentSourceCreateParams params)
      throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="https://stripe.com/api/customers/update">update the customer</a> to have a new {@code
   * default_source}.
   */
  public PaymentSource create(
      String customer, CustomerPaymentSourceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/sources", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentSource.class);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(
      String customer, String id, CustomerPaymentSourceRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String customer, String id, RequestOptions options)
      throws StripeException {
    return retrieve(customer, id, (CustomerPaymentSourceRetrieveParams) null, options);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String customer, String id) throws StripeException {
    return retrieve(
        customer, id, (CustomerPaymentSourceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(
      String customer,
      String id,
      CustomerPaymentSourceRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentSource.class);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id, CustomerPaymentSourceUpdateParams params)
      throws StripeException {
    return update(customer, id, params, (RequestOptions) null);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id, RequestOptions options)
      throws StripeException {
    return update(customer, id, (CustomerPaymentSourceUpdateParams) null, options);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(String customer, String id) throws StripeException {
    return update(customer, id, (CustomerPaymentSourceUpdateParams) null, (RequestOptions) null);
  }
  /** Update a specified source for a given customer. */
  public PaymentSource update(
      String customer, String id, CustomerPaymentSourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentSource.class);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id, CustomerPaymentSourceDeleteParams params)
      throws StripeException {
    return delete(customer, id, params, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id, RequestOptions options)
      throws StripeException {
    return delete(customer, id, (CustomerPaymentSourceDeleteParams) null, options);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(String customer, String id) throws StripeException {
    return delete(customer, id, (CustomerPaymentSourceDeleteParams) null, (RequestOptions) null);
  }
  /** Delete a specified source for a given customer. */
  public PaymentSource delete(
      String customer, String id, CustomerPaymentSourceDeleteParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentSource.class);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id, CustomerPaymentSourceVerifyParams params)
      throws StripeException {
    return verify(customer, id, params, (RequestOptions) null);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id, RequestOptions options)
      throws StripeException {
    return verify(customer, id, (CustomerPaymentSourceVerifyParams) null, options);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(String customer, String id) throws StripeException {
    return verify(customer, id, (CustomerPaymentSourceVerifyParams) null, (RequestOptions) null);
  }
  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(
      String customer, String id, CustomerPaymentSourceVerifyParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s/verify",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BankAccount.class);
  }
  /** Serializes a CustomerPaymentSource create request into a batch job JSONL line. */
  public String serializeBatchCreate(String customer, CustomerPaymentSourceCreateParams params)
      throws StripeException {
    return serializeBatchCreate(customer, params, (RequestOptions) null);
  }
  /** Serializes a CustomerPaymentSource create request into a batch job JSONL line. */
  public String serializeBatchCreate(
      String customer, CustomerPaymentSourceCreateParams params, RequestOptions options)
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
  /** Serializes a CustomerPaymentSource update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String customer, String id, CustomerPaymentSourceUpdateParams params) throws StripeException {
    return serializeBatchUpdate(customer, id, params, (RequestOptions) null);
  }
  /** Serializes a CustomerPaymentSource update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String customer, String id, CustomerPaymentSourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("customer", customer);
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
  /** Serializes a CustomerPaymentSource delete request into a batch job JSONL line. */
  public String serializeBatchDelete(
      String customer, String id, CustomerPaymentSourceDeleteParams params) throws StripeException {
    return serializeBatchDelete(customer, id, params, (RequestOptions) null);
  }
  /** Serializes a CustomerPaymentSource delete request into a batch job JSONL line. */
  public String serializeBatchDelete(
      String customer, String id, CustomerPaymentSourceDeleteParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("customer", customer);
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
  /** Serializes a CustomerPaymentSource verify request into a batch job JSONL line. */
  public String serializeBatchVerify(
      String customer, String id, CustomerPaymentSourceVerifyParams params) throws StripeException {
    return serializeBatchVerify(customer, id, params, (RequestOptions) null);
  }
  /** Serializes a CustomerPaymentSource verify request into a batch job JSONL line. */
  public String serializeBatchVerify(
      String customer, String id, CustomerPaymentSourceVerifyParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("customer", customer);
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
