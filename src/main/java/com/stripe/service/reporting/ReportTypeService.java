// File generated from our OpenAPI spec
package com.stripe.service.reporting;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.reporting.ReportType;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reporting.ReportTypeListParams;
import com.stripe.param.reporting.ReportTypeRetrieveParams;

public final class ReportTypeService extends ApiService {
  public ReportTypeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a full list of Report Types. */
  public StripeCollection<ReportType> list(ReportTypeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a full list of Report Types. */
  public StripeCollection<ReportType> list(RequestOptions options) throws StripeException {
    return list((ReportTypeListParams) null, options);
  }
  /** Returns a full list of Report Types. */
  public StripeCollection<ReportType> list() throws StripeException {
    return list((ReportTypeListParams) null, (RequestOptions) null);
  }
  /** Returns a full list of Report Types. */
  public StripeCollection<ReportType> list(ReportTypeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reporting/report_types";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<ReportType>>() {}.getType());
  }
  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportType retrieve(String reportType, ReportTypeRetrieveParams params)
      throws StripeException {
    return retrieve(reportType, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportType retrieve(String reportType, RequestOptions options) throws StripeException {
    return retrieve(reportType, (ReportTypeRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportType retrieve(String reportType) throws StripeException {
    return retrieve(reportType, (ReportTypeRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a Report Type. (Certain report types require a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public ReportType retrieve(
      String reportType, ReportTypeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ReportType.class);
  }
}
