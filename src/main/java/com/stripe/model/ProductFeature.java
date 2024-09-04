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
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
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
  public static ProductFeature create(String product, Map<String, Object> params)
      throws StripeException {
    return create(product, params, (RequestOptions) null);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(
      String product, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(String product, ProductFeatureCreateParams params)
      throws StripeException {
    return create(product, params, (RequestOptions) null);
  }

  /** Creates a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature create(
      String product, ProductFeatureCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
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
  public ProductFeature delete(String product) throws StripeException {
    return delete(product, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String product, RequestOptions options) throws StripeException {
    return delete(product, (Map<String, Object>) null, options);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String product, Map<String, Object> params) throws StripeException {
    return delete(product, params, (RequestOptions) null);
  }

  /** Deletes the feature attachment to a product. */
  public ProductFeature delete(String product, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(product), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, ProductFeature.class);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(String product, Map<String, Object> params)
      throws StripeException {
    return list(product, params, (RequestOptions) null);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(
      String product, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeatureCollection.class);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(String product, ProductFeatureListParams params)
      throws StripeException {
    return list(product, params, (RequestOptions) null);
  }

  /** Retrieve a list of features for a product. */
  public static ProductFeatureCollection list(
      String product, ProductFeatureListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/products/%s/features", ApiResource.urlEncodeId(product));
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
  public static ProductFeature retrieve(String product, String id) throws StripeException {
    return retrieve(product, id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(String product, String id, RequestOptions options)
      throws StripeException {
    return retrieve(product, id, (Map<String, Object>) null, options);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(
      String product, String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(product), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ProductFeature.class);
  }

  /** Retrieves a product_feature, which represents a feature attachment to a product. */
  public static ProductFeature retrieve(
      String product, String id, ProductFeatureRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/products/%s/features/%s",
            ApiResource.urlEncodeId(product), ApiResource.urlEncodeId(id));
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
