// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerTaxIdCreateParams;
import com.stripe.param.CustomerTaxIdListParams;
import com.stripe.param.CustomerTaxIdRetrieveParams;

public final class CustomerTaxIdService extends ApiService {
  public CustomerTaxIdService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes an existing {@code tax_id} object. */
  public TaxId delete(String customer, String id) throws StripeException {
    return delete(customer, id, (RequestOptions) null);
  }
  /** Deletes an existing {@code tax_id} object. */
  public TaxId delete(String customer, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_ids/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, TaxId.class);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id, CustomerTaxIdRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id, RequestOptions options) throws StripeException {
    return retrieve(customer, id, (CustomerTaxIdRetrieveParams) null, options);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(String customer, String id) throws StripeException {
    return retrieve(customer, id, (CustomerTaxIdRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the {@code tax_id} object with the given identifier. */
  public TaxId retrieve(
      String customer, String id, CustomerTaxIdRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/tax_ids/%s",
            ApiResource.urlEncodeId(customer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxId.class);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer, CustomerTaxIdListParams params)
      throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer, RequestOptions options)
      throws StripeException {
    return list(customer, (CustomerTaxIdListParams) null, options);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(String customer) throws StripeException {
    return list(customer, (CustomerTaxIdListParams) null, (RequestOptions) null);
  }
  /** Returns a list of tax IDs for a customer. */
  public StripeCollection<TaxId> list(
      String customer, CustomerTaxIdListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/tax_ids", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TaxId>>() {}.getType());
  }
  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(String customer, CustomerTaxIdCreateParams params) throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }
  /** Creates a new {@code tax_id} object for a customer. */
  public TaxId create(String customer, CustomerTaxIdCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/tax_ids", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxId.class);
  }
  /** Serializes a CustomerTaxId delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String customer, String id) throws StripeException {
    return serializeBatchDelete(customer, id, (RequestOptions) null);
  }
  /** Serializes a CustomerTaxId delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String customer, String id, RequestOptions options)
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
    requestBody.put("params", null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
  /** Serializes a CustomerTaxId create request into a batch job JSONL line. */
  public String serializeBatchCreateForCustomer(String customer, CustomerTaxIdCreateParams params)
      throws StripeException {
    return serializeBatchCreateForCustomer(customer, params, (RequestOptions) null);
  }
  /** Serializes a CustomerTaxId create request into a batch job JSONL line. */
  public String serializeBatchCreateForCustomer(
      String customer, CustomerTaxIdCreateParams params, RequestOptions options)
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
}
