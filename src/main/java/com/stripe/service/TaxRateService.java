// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TaxRate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TaxRateCreateParams;
import com.stripe.param.TaxRateListParams;
import com.stripe.param.TaxRateRetrieveParams;
import com.stripe.param.TaxRateUpdateParams;

public final class TaxRateService extends ApiService {
  public TaxRateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public StripeCollection<TaxRate> list(TaxRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public StripeCollection<TaxRate> list(RequestOptions options) throws StripeException {
    return list((TaxRateListParams) null, options);
  }
  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public StripeCollection<TaxRate> list() throws StripeException {
    return list((TaxRateListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public StripeCollection<TaxRate> list(TaxRateListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax_rates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<TaxRate>>() {}.getType());
  }
  /** Creates a new tax rate. */
  public TaxRate create(TaxRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new tax rate. */
  public TaxRate create(TaxRateCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/tax_rates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxRate.class);
  }
  /** Retrieves a tax rate with the given ID. */
  public TaxRate retrieve(String taxRate, TaxRateRetrieveParams params) throws StripeException {
    return retrieve(taxRate, params, (RequestOptions) null);
  }
  /** Retrieves a tax rate with the given ID. */
  public TaxRate retrieve(String taxRate, RequestOptions options) throws StripeException {
    return retrieve(taxRate, (TaxRateRetrieveParams) null, options);
  }
  /** Retrieves a tax rate with the given ID. */
  public TaxRate retrieve(String taxRate) throws StripeException {
    return retrieve(taxRate, (TaxRateRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a tax rate with the given ID. */
  public TaxRate retrieve(String taxRate, TaxRateRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxRate.class);
  }
  /** Updates an existing tax rate. */
  public TaxRate update(String taxRate, TaxRateUpdateParams params) throws StripeException {
    return update(taxRate, params, (RequestOptions) null);
  }
  /** Updates an existing tax rate. */
  public TaxRate update(String taxRate, RequestOptions options) throws StripeException {
    return update(taxRate, (TaxRateUpdateParams) null, options);
  }
  /** Updates an existing tax rate. */
  public TaxRate update(String taxRate) throws StripeException {
    return update(taxRate, (TaxRateUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing tax rate. */
  public TaxRate update(String taxRate, TaxRateUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, TaxRate.class);
  }
  /** Serializes a TaxRate create request into a batch job JSONL line. */
  public String serializeBatchCreate(TaxRateCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a TaxRate create request into a batch job JSONL line. */
  public String serializeBatchCreate(TaxRateCreateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
  /** Serializes a TaxRate update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String taxRate, TaxRateUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(taxRate, params, (RequestOptions) null);
  }
  /** Serializes a TaxRate update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String taxRate, TaxRateUpdateParams params, RequestOptions options) throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("tax_rate", taxRate);
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
