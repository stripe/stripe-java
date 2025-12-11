// File generated from our OpenAPI spec
package com.stripe.model.reserve;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reserve.PlanRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * ReservePlans are used to automatically place holds on a merchant's funds until the plan expires.
 * It takes a portion of each incoming Charge (including those resulting from a Transfer from a
 * platform account).
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Plan extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Indicates which party created this ReservePlan.
   *
   * <p>One of {@code application}, or {@code stripe}.
   */
  @SerializedName("created_by")
  String createdBy;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>. An
   * unset currency indicates that the plan applies to all currencies.
   */
  @SerializedName("currency")
  String currency;

  /** Time at which the ReservePlan was disabled. */
  @SerializedName("disabled_at")
  Long disabledAt;

  @SerializedName("fixed_release")
  FixedRelease fixedRelease;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code reserve.plan}.
   */
  @SerializedName("object")
  String object;

  /** The percent of each Charge to reserve. */
  @SerializedName("percent")
  Long percent;

  @SerializedName("rolling_release")
  RollingRelease rollingRelease;

  /**
   * The current status of the ReservePlan. The ReservePlan only affects charges if it is {@code
   * active}.
   *
   * <p>One of {@code active}, {@code disabled}, or {@code expired}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the ReservePlan.
   *
   * <p>One of {@code fixed_release}, or {@code rolling_release}.
   */
  @SerializedName("type")
  String type;

  /** Retrieve a ReservePlan. */
  public static Plan retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a ReservePlan. */
  public static Plan retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a ReservePlan. */
  public static Plan retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/plans/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /** Retrieve a ReservePlan. */
  public static Plan retrieve(String id, PlanRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/plans/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Plan.class);
  }

  /**
   * For more details about FixedRelease, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FixedRelease extends StripeObject {
    /** The time after which all reserved funds are requested for release. */
    @SerializedName("release_after")
    Long releaseAfter;

    /**
     * The time at which reserved funds are scheduled for release, automatically set to midnight UTC
     * of the day after {@code release_after}.
     */
    @SerializedName("scheduled_release")
    Long scheduledRelease;
  }

  /**
   * For more details about RollingRelease, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RollingRelease extends StripeObject {
    /** The number of days to reserve funds before releasing. */
    @SerializedName("days_after_charge")
    Long daysAfterCharge;

    /** The time at which the ReservePlan expires. */
    @SerializedName("expires_on")
    Long expiresOn;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(fixedRelease, responseGetter);
    trySetResponseGetter(rollingRelease, responseGetter);
  }
}
