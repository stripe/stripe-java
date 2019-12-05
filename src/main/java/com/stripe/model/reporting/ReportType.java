package com.stripe.model.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.reporting.ReportTypeListParams;
import com.stripe.param.reporting.ReportTypeRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReportType extends ApiResource implements HasId {
  /**
   * Most recent time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("data_available_end")
  Long dataAvailableEnd;

  /**
   * Earliest time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("data_available_start")
  Long dataAvailableStart;

  /**
   * List of column names that are included by default when this Report Type gets run. (If the
   * Report Type doesn't support the `columns` parameter, this will be null.)
   */
  @SerializedName("default_columns")
  List<String> defaultColumns;

  /**
   * The [ID of the Report
   * Type](https://stripe.com/docs/reporting/statements/api#available-report-types), such as
   * `balance.summary.1`.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Human-readable name of the Report Type. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `reporting.report_type`.
   */
  @SerializedName("object")
  String object;

  /** When this Report Type was latest updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /**
   * Version of the Report Type. Different versions report with the same ID will have the same
   * purpose, but may take different run parameters or have different result schemas.
   */
  @SerializedName("version")
  Long version;

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType) throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType, RequestOptions options)
      throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(
      String reportType, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReportType.class, options);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(
      String reportType, ReportTypeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReportType.class, options);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_types");
    return ApiResource.requestCollection(url, params, ReportTypeCollection.class, options);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(ReportTypeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(ReportTypeListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_types");
    return ApiResource.requestCollection(url, params, ReportTypeCollection.class, options);
  }
}
