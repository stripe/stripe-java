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
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerEntitlementSummaryRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A summary of a customer's entitlements. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerEntitlementSummary extends ApiResource {
  /** The customer that is entitled to this feature. */
  @SerializedName("customer")
  String customer;

  /** The list of entitlements this customer has. */
  @SerializedName("entitlements")
  CustomerEntitlementCollection entitlements;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer_entitlement_summary}.
   */
  @SerializedName("object")
  String object;

  /** Retrieve the entitlement summary for a customer. */
  public static CustomerEntitlementSummary retrieve(String customer) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve the entitlement summary for a customer. */
  public static CustomerEntitlementSummary retrieve(String customer, RequestOptions options)
      throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, options);
  }

  /** Retrieve the entitlement summary for a customer. */
  public static CustomerEntitlementSummary retrieve(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/customers/%s/entitlement_summary", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerEntitlementSummary.class);
  }

  /** Retrieve the entitlement summary for a customer. */
  public static CustomerEntitlementSummary retrieve(
      String customer, CustomerEntitlementSummaryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/entitlement_summary", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, CustomerEntitlementSummary.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(entitlements, responseGetter);
  }
}
