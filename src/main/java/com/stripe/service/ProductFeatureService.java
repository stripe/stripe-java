// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ProductFeature;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ProductFeatureCreateParams;
import com.stripe.param.ProductFeatureListParams;

public final class ProductFeatureService extends ApiService {
  public ProductFeatureService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String product, String id) throws StripeException {
    return delete(product, id, (RequestOptions) null);
  }
  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String product, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(product), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, ProductFeature.class);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String product, ProductFeatureListParams params)
      throws StripeException {
    return list(product, params, (RequestOptions) null);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String product, RequestOptions options)
      throws StripeException {
    return list(product, (ProductFeatureListParams) null, options);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(String product) throws StripeException {
    return list(product, (ProductFeatureListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of features for a product. */
  public StripeCollection<ProductFeature> list(
      String product, ProductFeatureListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<ProductFeature>>() {}.getType());
  }
  /** Creates a product_feature, which represents a feature attachment to a product. */
  public ProductFeature create(String product, ProductFeatureCreateParams params)
      throws StripeException {
    return create(product, params, (RequestOptions) null);
  }
  /** Creates a product_feature, which represents a feature attachment to a product. */
  public ProductFeature create(
      String product, ProductFeatureCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ProductFeature.class);
  }
}
