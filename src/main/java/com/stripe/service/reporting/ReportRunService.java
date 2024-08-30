// File generated from our OpenAPI spec
package com.stripe.service.reporting;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.reporting.ReportRun;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reporting.ReportRunCreateParams;
import com.stripe.param.reporting.ReportRunListParams;
import com.stripe.param.reporting.ReportRunRetrieveParams;

public final class ReportRunService extends ApiService {
  public ReportRunService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Report Runs, with the most recent appearing first. */
  public StripeCollection<ReportRun> list(ReportRunListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Report Runs, with the most recent appearing first. */
  public StripeCollection<ReportRun> list(RequestOptions options) throws StripeException {
    return list((ReportRunListParams) null, options);
  }
  /** Returns a list of Report Runs, with the most recent appearing first. */
  public StripeCollection<ReportRun> list() throws StripeException {
    return list((ReportRunListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Report Runs, with the most recent appearing first. */
  public StripeCollection<ReportRun> list(ReportRunListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reporting/report_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ReportRun>>() {}.getType());
  }
  /**
   * Creates a new object and begin running the report. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportRun create(ReportRunCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new object and begin running the report. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportRun create(ReportRunCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reporting/report_runs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ReportRun.class);
  }
  /** Retrieves the details of an existing Report Run. */
  public ReportRun retrieve(String reportRun, ReportRunRetrieveParams params)
      throws StripeException {
    return retrieve(reportRun, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing Report Run. */
  public ReportRun retrieve(String reportRun, RequestOptions options) throws StripeException {
    return retrieve(reportRun, (ReportRunRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing Report Run. */
  public ReportRun retrieve(String reportRun) throws StripeException {
    return retrieve(reportRun, (ReportRunRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing Report Run. */
  public ReportRun retrieve(
      String reportRun, ReportRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reporting/report_runs/%s", ApiResource.urlEncodeId(reportRun));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ReportRun.class);
  }
}
