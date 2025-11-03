// File generated from our OpenAPI spec
package com.stripe.service.v2.reporting;

import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.reporting.ReportRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.reporting.ReportRunCreateParams;

public final class ReportRunService extends ApiService {
  public ReportRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Initiates the generation of a {@code ReportRun} based on the specified report template and
   * user-provided parameters. It's the starting point for obtaining report data, and returns a
   * {@code ReportRun} object which can be used to track the progress and retrieve the results of
   * the report.
   */
  public ReportRun create(ReportRunCreateParams params) throws StripeException, RateLimitException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Initiates the generation of a {@code ReportRun} based on the specified report template and
   * user-provided parameters. It's the starting point for obtaining report data, and returns a
   * {@code ReportRun} object which can be used to track the progress and retrieve the results of
   * the report.
   */
  public ReportRun create(ReportRunCreateParams params, RequestOptions options)
      throws StripeException, RateLimitException {
    String path = "/v2/reporting/report_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ReportRun.class);
  }
  /**
   * Fetches the current state and details of a previously created {@code ReportRun}. If the {@code
   * ReportRun} has succeeded, the endpoint will provide details for how to retrieve the results.
   */
  public ReportRun retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Fetches the current state and details of a previously created {@code ReportRun}. If the {@code
   * ReportRun} has succeeded, the endpoint will provide details for how to retrieve the results.
   */
  public ReportRun retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/reporting/report_runs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ReportRun.class);
  }
}
