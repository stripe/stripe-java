package com.stripe.model.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.reporting.ReportRunCreateParams;
import com.stripe.param.reporting.ReportRunListParams;
import com.stripe.param.reporting.ReportRunRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReportRun extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * If something should go wrong during the run, a message about the failure (populated when
   * `status=failed`).
   */
  @SerializedName("error")
  String error;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Always `true`: reports can only be run on live-mode data. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `reporting.report_run`.
   */
  @SerializedName("object")
  String object;

  @SerializedName("parameters")
  Parameters parameters;

  /**
   * The ID of the [report type](https://stripe.com/docs/reporting/statements/api#report-types) to
   * run, such as `"balance.summary.1"`.
   */
  @SerializedName("report_type")
  String reportType;

  /**
   * The file object representing the result of the report run (populated when `status=succeeded`).
   */
  @SerializedName("result")
  File result;

  /**
   * Status of this report run. This will be `pending` when the run is initially created. When the
   * run finishes, this will be set to `succeeded` and the `result` field will be populated. Rarely,
   * we may encounter an error, at which point this will be set to `failed` and the `error` field
   * will be populated.
   */
  @SerializedName("status")
  String status;

  /**
   * Timestamp at which this run successfully finished (populated when `status=succeeded`). Measured
   * in seconds since the Unix epoch.
   */
  @SerializedName("succeeded_at")
  Long succeededAt;

  /**
   * Retrieves the details of an existing Report Run. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun retrieve(String reportRun) throws StripeException {
    return retrieve(reportRun, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing Report Run. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun retrieve(String reportRun, RequestOptions options)
      throws StripeException {
    return retrieve(reportRun, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing Report Run. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun retrieve(
      String reportRun, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reporting/report_runs/%s", ApiResource.urlEncodeId(reportRun)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReportRun.class, options);
  }

  /**
   * Retrieves the details of an existing Report Run. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun retrieve(
      String reportRun, ReportRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reporting/report_runs/%s", ApiResource.urlEncodeId(reportRun)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReportRun.class, options);
  }

  /**
   * Creates a new object and begin running the report. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new object and begin running the report. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_runs");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ReportRun.class, options);
  }

  /**
   * Creates a new object and begin running the report. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun create(ReportRunCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new object and begin running the report. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRun create(ReportRunCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_runs");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ReportRun.class, options);
  }

  /**
   * Returns a list of Report Runs, with the most recent appearing first. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRunCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Report Runs, with the most recent appearing first. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRunCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_runs");
    return ApiResource.requestCollection(url, params, ReportRunCollection.class, options);
  }

  /**
   * Returns a list of Report Runs, with the most recent appearing first. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRunCollection list(ReportRunListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Report Runs, with the most recent appearing first. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportRunCollection list(ReportRunListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_runs");
    return ApiResource.requestCollection(url, params, ReportRunCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Parameters extends StripeObject {
    /** The set of output columns requested for inclusion in the report run. */
    @SerializedName("columns")
    List<String> columns;

    /** Connected account ID by which to filter the report run. */
    @SerializedName("connected_account")
    String connectedAccount;

    /** Currency of objects to be included in the report run. */
    @SerializedName("currency")
    String currency;

    /** Ending timestamp of data to be included in the report run (exclusive). */
    @SerializedName("interval_end")
    Long intervalEnd;

    /** Starting timestamp of data to be included in the report run. */
    @SerializedName("interval_start")
    Long intervalStart;

    /** Payout ID by which to filter the report run. */
    @SerializedName("payout")
    String payout;

    /** Category of balance transactions to be included in the report run. */
    @SerializedName("reporting_category")
    String reportingCategory;
  }
}
