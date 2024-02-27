// File generated from our OpenAPI spec
package com.stripe.model.entitlements;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.entitlements.FeatureCreateParams;
import com.stripe.param.entitlements.FeatureListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A feature represents a monetizable ability or functionality in your system. Features can be
 * assigned to products, and when those products are purchased, Stripe will create an entitlement to
 * the feature for the purchasing customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Feature extends ApiResource implements HasId {
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

  /** A unique key you provide as your own system identifier. This may be up to 80 characters. */
  @SerializedName("lookup_key")
  String lookupKey;

  /** The feature's name, for your own purpose, not meant to be displayable to the customer. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code entitlements.feature}.
   */
  @SerializedName("object")
  String object;

  /** Creates a feature. */
  public static Feature create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a feature. */
  public static Feature create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/features";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Feature.class);
  }

  /** Creates a feature. */
  public static Feature create(FeatureCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a feature. */
  public static Feature create(FeatureCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/features";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Feature.class);
  }

  /** Retrieve a list of features. */
  public static FeatureCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of features. */
  public static FeatureCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/features";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, FeatureCollection.class);
  }

  /** Retrieve a list of features. */
  public static FeatureCollection list(FeatureListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of features. */
  public static FeatureCollection list(FeatureListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/features";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, FeatureCollection.class);
  }
}
