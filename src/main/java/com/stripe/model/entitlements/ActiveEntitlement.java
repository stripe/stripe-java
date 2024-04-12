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
import com.stripe.param.entitlements.ActiveEntitlementListParams;
import com.stripe.param.entitlements.ActiveEntitlementRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An active entitlement describes access to a feature for a customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ActiveEntitlement extends ApiResource implements HasId {
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
   * <p>Equal to {@code entitlements.active_entitlement}.
   */
  @SerializedName("object")
  String object;

  /** Retrieve a list of active entitlements for a customer. */
  public static ActiveEntitlementCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of active entitlements for a customer. */
  public static ActiveEntitlementCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/entitlements/active_entitlements";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ActiveEntitlementCollection.class);
  }

  /** Retrieve a list of active entitlements for a customer. */
  public static ActiveEntitlementCollection list(ActiveEntitlementListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of active entitlements for a customer. */
  public static ActiveEntitlementCollection list(
      ActiveEntitlementListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/entitlements/active_entitlements";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ActiveEntitlementCollection.class);
  }

  /** Retrieve an active entitlement. */
  public static ActiveEntitlement retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve an active entitlement. */
  public static ActiveEntitlement retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve an active entitlement. */
  public static ActiveEntitlement retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/entitlements/active_entitlements/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, ActiveEntitlement.class);
  }

  /** Retrieve an active entitlement. */
  public static ActiveEntitlement retrieve(
      String id, ActiveEntitlementRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/entitlements/active_entitlements/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, ActiveEntitlement.class);
  }
}
