// File generated from our OpenAPI spec
package com.stripe.model.sigma;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sigma.ScheduledQueryRunListParams;
import com.stripe.param.sigma.ScheduledQueryRunRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * If you have <a href="https://docs.stripe.com/sigma/scheduled-queries">scheduled a Sigma
 * query</a>, you'll receive a {@code sigma.scheduled_query_run.created} webhook each time the query
 * runs. The webhook contains a {@code ScheduledQueryRun} object, which you can use to retrieve the
 * query results.
 */
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
  Errors error;

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
    String path = "/v1/sigma/scheduled_query_runs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ScheduledQueryRunCollection.class);
  }

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(ScheduledQueryRunListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of scheduled query runs. */
  public static ScheduledQueryRunCollection list(
      ScheduledQueryRunListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/sigma/scheduled_query_runs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ScheduledQueryRunCollection.class);
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
    String path =
        String.format(
            "/v1/sigma/scheduled_query_runs/%s", ApiResource.urlEncodeId(scheduledQueryRun));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ScheduledQueryRun.class);
  }

  /** Retrieves the details of an scheduled query run. */
  public static ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/sigma/scheduled_query_runs/%s", ApiResource.urlEncodeId(scheduledQueryRun));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ScheduledQueryRun.class);
  }

  /**
   * For more details about Errors, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Errors extends StripeObject {
    /** Information about the run failure. */
    @SerializedName("message")
    String message;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(error, responseGetter);
    trySetResponseGetter(file, responseGetter);
  }
}
