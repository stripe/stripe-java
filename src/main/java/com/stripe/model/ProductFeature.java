// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.entitlements.Feature;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ProductFeatureCreateParams;
import com.stripe.param.ProductFeatureListParams;
import com.stripe.param.ProductFeatureRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A product_feature represents an attachment between a feature and a product. When a product is
 * purchased that has a feature attached, Stripe will create an entitlement to the feature for the
 * purchasing customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProductFeature extends ApiResource implements HasId {
  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * A feature represents a monetizable ability or functionality in your system. Features can be
   * assigned to products, and when those products are purchased, Stripe will create an entitlement
   * to the feature for the purchasing customer.
   */
  @SerializedName("entitlement_feature")
  Feature entitlementFeature;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code product_feature}.
   */
  @SerializedName("object")
  String object;

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(String id, Map<String, Object> params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(String id, ProductFeatureCreateParams params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(
      String id, ProductFeatureCreateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId) throws StripeException {
    return delete(productId, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId, RequestOptions options) throws StripeException {
    return delete(productId, (Map<String, Object>) null, options);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId, Map<String, Object> params)
      throws StripeException {
    return delete(productId, params, (RequestOptions) null);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String productId, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(productId), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, ProductFeature.class);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(String id, Map<String, Object> params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeatureCollection.class);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(String id, ProductFeatureListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(
      String id, ProductFeatureListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ProductFeatureCollection.class);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(String productId, String id) throws StripeException {
    return retrieve(productId, id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(String productId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(productId, id, (Map<String, Object>) null, options);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(
      String productId, String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(productId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(
      String productId, String id, ProductFeatureRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(productId), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(entitlementFeature, responseGetter);
  }
}
