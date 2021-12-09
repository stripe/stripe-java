// File generated from our OpenAPI spec
package com.stripe.model.sigma;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.sigma.ScheduledQueryRunListParams;
import com.stripe.param.sigma.ScheduledQueryRunRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ScheduledQueryRun extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** When the query was run, Sigma contained a snapshot of your Stripe data at this time. */
  @SerializedName("data_load_time")
  Long dataLoadTime;

  @SerializedName("error")
  RunError error;

  /** The file object representing the results of the query. */
  @SerializedName("file")
  File file;

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
   * <p>Equal to {@code scheduled_query_run}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the result expires and is no longer available for download. */
  @SerializedName("result_available_until")
  Long resultAvailableUntil;

  /** SQL for the query. */
  @SerializedName("sql")
  String sql;

  /**
   * The query's execution status, which will be {@code completed} for successful runs, and {@code
   * canceled}, {@code failed}, or {@code timed_out} otherwise.
   */
  @SerializedName("status")
  String status;

  /** Title of the query. */
  @SerializedName("title")
  String title;

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/sigma/scheduled_query_runs");
    return ApiResource.requestCollection(url, params, ScheduledQueryRunCollection.class, options);
  }

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(ScheduledQueryRunListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(
      ScheduledQueryRunListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/sigma/scheduled_query_runs");
    return ApiResource.requestCollection(url, params, ScheduledQueryRunCollection.class, options);
  }

  /** Retrieves the details of an scheduled query run. */
  public static ScheduledQueryRun retrieve(String scheduledQueryRun) throws StripeException {
    return retrieve(scheduledQueryRun, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an scheduled query run. */
  public static ScheduledQueryRun retrieve(String scheduledQueryRun, RequestOptions options)
      throws StripeException {
    return retrieve(scheduledQueryRun, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an scheduled query run. */
  public static ScheduledQueryRun retrieve(
      String scheduledQueryRun, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/sigma/scheduled_query_runs/%s", ApiResource.urlEncodeId(scheduledQueryRun)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ScheduledQueryRun.class, options);
  }

  /** Retrieves the details of an scheduled query run. */
  public static ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/sigma/scheduled_query_runs/%s", ApiResource.urlEncodeId(scheduledQueryRun)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ScheduledQueryRun.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RunError extends StripeObject {
    /** Information about the run failure. */
    @SerializedName("message")
    String message;
  }
}
