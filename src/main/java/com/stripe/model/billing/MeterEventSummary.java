// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.billing.MeterEventSummaryListParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing meter event summary represents an aggregated view of a customer's billing meter events
 * within a specified timeframe. It indicates how much usage was accrued by a customer for that
 * period.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEventSummary extends ApiResource implements HasId {
  /**
   * Aggregated value of all the events within {@code start_time} (inclusive) and {@code end_time}
   * (inclusive). The aggregation strategy is defined on meter via {@code default_aggregation}.
   */
  @SerializedName("aggregated_value")
  BigDecimal aggregatedValue;

  /** End timestamp for this event summary (exclusive). Must be aligned with minute boundaries. */
  @SerializedName("end_time")
  Long endTime;

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

  /** The meter associated with this event summary. */
  @SerializedName("meter")
  String meter;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_event_summary}.
   */
  @SerializedName("object")
  String object;

  /** Start timestamp for this event summary (inclusive). Must be aligned with minute boundaries. */
  @SerializedName("start_time")
  Long startTime;

  /** Retrieve a list of billing meter event summaries. */
  public static MeterEventSummaryCollection list(String id, Map<String, Object> params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meter event summaries. */
  public static MeterEventSummaryCollection list(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/event_summaries", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, MeterEventSummaryCollection.class);
  }

  /** Retrieve a list of billing meter event summaries. */
  public static MeterEventSummaryCollection list(String id, MeterEventSummaryListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meter event summaries. */
  public static MeterEventSummaryCollection list(
      String id, MeterEventSummaryListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/event_summaries", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, MeterEventSummaryCollection.class);
  }
}
