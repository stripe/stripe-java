// File generated from our OpenAPI spec
package com.stripe.model.billing.analytics;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.analytics.MeterUsageRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing meter usage event represents an aggregated view of a customer’s billing meter events
 * within a specified timeframe.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterUsage extends ApiResource {
  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.analytics.meter_usage}.
   */
  @SerializedName("object")
  String object;

  /** The timestamp to indicate data freshness, measured in seconds since the Unix epoch. */
  @SerializedName("refreshed_at")
  Long refreshedAt;

  @SerializedName("rows")
  MeterUsageRowCollection rows;

  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public static MeterUsage retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public static MeterUsage retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public static MeterUsage retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/analytics/meter_usage";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, MeterUsage.class);
  }

  /**
   * Returns aggregated meter usage data for a customer within a specified time interval. The data
   * can be grouped by various dimensions and can include multiple meters if specified.
   */
  public static MeterUsage retrieve(MeterUsageRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/analytics/meter_usage";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, MeterUsage.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(rows, responseGetter);
  }
}
