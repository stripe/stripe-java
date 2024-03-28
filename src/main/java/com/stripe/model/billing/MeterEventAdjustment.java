// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.billing.MeterEventAdjustmentCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A billing meter event adjustment represents the status of a meter event adjustment. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEventAdjustment extends ApiResource {
  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_event_adjustment}.
   */
  @SerializedName("object")
  String object;

  /**
   * The meter event adjustment's status.
   *
   * <p>One of {@code complete}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meter_event_adjustments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, MeterEventAdjustment.class);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(MeterEventAdjustmentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(
      MeterEventAdjustmentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/meter_event_adjustments";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, MeterEventAdjustment.class);
  }
}
