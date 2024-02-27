// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerEntitlementListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A entitlement for a customer describes access to a feature. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerEntitlement extends ApiResource implements HasId {
  /** The feature that the customer is entitled to. */
  @SerializedName("feature")
  String feature;

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

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer_entitlement}.
   */
  @SerializedName("object")
  String object;

  /** Retrieve a list of entitlements for a customer. */
  public static CustomerEntitlementCollection list(String customer, Map<String, Object> params)
      throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }

  /** Retrieve a list of entitlements for a customer. */
  public static CustomerEntitlementCollection list(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s/entitlements", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerEntitlementCollection.class);
  }

  /** Retrieve a list of entitlements for a customer. */
  public static CustomerEntitlementCollection list(
      String customer, CustomerEntitlementListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }

  /** Retrieve a list of entitlements for a customer. */
  public static CustomerEntitlementCollection list(
      String customer, CustomerEntitlementListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/entitlements", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerEntitlementCollection.class);
  }
}
