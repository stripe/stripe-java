// File generated from our OpenAPI spec
package com.stripe.model.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.reporting.ReportTypeListParams;
import com.stripe.param.reporting.ReportTypeRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Report Type resource corresponds to a particular type of report, such as the &quot;Activity
 * summary&quot; or &quot;Itemized payouts&quot; reports. These objects are identified by an ID
 * belonging to a set of enumerated values. See <a
 * href="https://stripe.com/docs/reporting/statements/api">API Access to Reports documentation</a>
 * for those Report Type IDs, along with required and optional parameters.
 *
 * <p>Note that certain report types can only be run based on your live-mode data (not test-mode
 * data), and will error when queried without a <a
 * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.
 */
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
   * Report Type doesn't support the {@code columns} parameter, this will be null.)
   */
  @SerializedName("default_columns")
  List<String> defaultColumns;

  /**
   * The <a href="https://stripe.com/docs/reporting/statements/api#available-report-types">ID of the
   * Report Type</a>, such as {@code balance.summary.1}.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Human-readable name of the Report Type. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code reporting.report_type}.
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

  /** Returns a full list of Report Types. */
  public static ReportTypeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a full list of Report Types. */
  public static ReportTypeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reporting/report_types";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ReportTypeCollection.class);
  }

  /** Returns a full list of Report Types. */
  public static ReportTypeCollection list(ReportTypeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a full list of Report Types. */
  public static ReportTypeCollection list(ReportTypeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reporting/report_types";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ReportTypeCollection.class);
  }

  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType) throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType, RequestOptions options)
      throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(
      String reportType, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ReportType.class);
  }

  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(
      String reportType, ReportTypeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ReportType.class);
  }
}
