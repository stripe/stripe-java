// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Price;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PriceCreateParams;
import com.stripe.param.PriceListParams;
import com.stripe.param.PriceRetrieveParams;
import com.stripe.param.PriceSearchParams;
import com.stripe.param.PriceUpdateParams;

public final class PriceService extends ApiService {
  public PriceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of your active prices, excluding <a
   * href="https://stripe.com/docs/products-prices/pricing-models#inline-pricing">inline prices</a>.
   * For the list of inactive prices, set {@code active} to false.
   */
  public StripeCollection<Price> list(PriceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your active prices, excluding <a
   * href="https://stripe.com/docs/products-prices/pricing-models#inline-pricing">inline prices</a>.
   * For the list of inactive prices, set {@code active} to false.
   */
  public StripeCollection<Price> list(RequestOptions options) throws StripeException {
    return list((PriceListParams) null, options);
  }
  /**
   * Returns a list of your active prices, excluding <a
   * href="https://stripe.com/docs/products-prices/pricing-models#inline-pricing">inline prices</a>.
   * For the list of inactive prices, set {@code active} to false.
   */
  public StripeCollection<Price> list() throws StripeException {
    return list((PriceListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your active prices, excluding <a
   * href="https://stripe.com/docs/products-prices/pricing-models#inline-pricing">inline prices</a>.
   * For the list of inactive prices, set {@code active} to false.
   */
  public StripeCollection<Price> list(PriceListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Price>>() {}.getType());
  }
  /**
   * Creates a new <a href="https://docs.stripe.com/api/prices">Price</a> for an existing <a
   * href="https://docs.stripe.com/api/products">Product</a>. The Price can be recurring or
   * one-time.
   */
  public Price create(PriceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new <a href="https://docs.stripe.com/api/prices">Price</a> for an existing <a
   * href="https://docs.stripe.com/api/products">Product</a>. The Price can be recurring or
   * one-time.
   */
  public Price create(PriceCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/prices";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Price.class);
  }
  /** Retrieves the price with the given ID. */
  public Price retrieve(String id, PriceRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the price with the given ID. */
  public Price retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PriceRetrieveParams) null, options);
  }
  /** Retrieves the price with the given ID. */
  public Price retrieve(String id) throws StripeException {
    return retrieve(id, (PriceRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the price with the given ID. */
  public Price retrieve(String id, PriceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Price.class);
  }
  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(String id, PriceUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(String id, RequestOptions options) throws StripeException {
    return update(id, (PriceUpdateParams) null, options);
  }
  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(String id) throws StripeException {
    return update(id, (PriceUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified price by setting the values of the parameters passed. Any parameters not
   * provided are left unchanged.
   */
  public Price update(String id, PriceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/prices/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Price.class);
  }
  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Price> search(PriceSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for prices you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Price> search(PriceSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/prices/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeSearchResult<Price>>() {}.getType());
  }
  /** Serializes a Price create request into a batch job JSONL line. */
  public String serializeBatchCreate(PriceCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a Price create request into a batch job JSONL line. */
  public String serializeBatchCreate(PriceCreateParams params, RequestOptions options)
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
  /** Serializes a Price update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String id, PriceUpdateParams params) throws StripeException {
    return serializeBatchUpdate(id, params, (RequestOptions) null);
  }
  /** Serializes a Price update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String id, PriceUpdateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
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
