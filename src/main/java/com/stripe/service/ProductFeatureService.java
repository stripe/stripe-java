// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ProductFeature;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ProductFeatureCreateParams;
import com.stripe.param.ProductFeatureListParams;
import com.stripe.param.ProductFeatureRetrieveParams;

public final class ProductFeatureService extends ApiService {
  public ProductFeatureService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId, String id) throws StripeException {
    return delete(productId, id, (RequestOptions) null);
  }
  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(productId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, ProductFeature.class);
  }
  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public ProductFeature retrieve(String productId, String id, ProductFeatureRetrieveParams params)
      throws StripeException {
    return retrieve(productId, id, params, (RequestOptions) null);
  }
  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public ProductFeature retrieve(String productId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(productId, id, (ProductFeatureRetrieveParams) null, options);
  }
  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public ProductFeature retrieve(String productId, String id) throws StripeException {
    return retrieve(productId, id, (ProductFeatureRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public ProductFeature retrieve(
      String productId, String id, ProductFeatureRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(productId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ProductFeature.class);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String id, ProductFeatureListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (ProductFeatureListParams) null, options);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String id) throws StripeException {
    return list(id, (ProductFeatureListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(
      String id, ProductFeatureListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ProductFeature>>() {}.getType());
  }
  /** Creates a product_feature, which represents a feature attachment to a product. */
  public ProductFeature create(String id, ProductFeatureCreateParams params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }
  /** Creates a product_feature, which represents a feature attachment to a product. */
  public ProductFeature create(String id, ProductFeatureCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ProductFeature.class);
  }
  /** Serializes a ProductFeature delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String productId, String id) throws StripeException {
    return serializeBatchDelete(productId, id, (RequestOptions) null);
  }
  /** Serializes a ProductFeature delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String productId, String id, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("product_id", productId);
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
  /** Serializes a ProductFeature create request into a batch job JSONL line. */
  public String serializeBatchCreate(String id, ProductFeatureCreateParams params)
      throws StripeException {
    return serializeBatchCreate(id, params, (RequestOptions) null);
  }
  /** Serializes a ProductFeature create request into a batch job JSONL line. */
  public String serializeBatchCreate(
      String id, ProductFeatureCreateParams params, RequestOptions options) throws StripeException {
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
