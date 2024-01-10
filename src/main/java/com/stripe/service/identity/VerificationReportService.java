// File generated from our OpenAPI spec
package com.stripe.service.identity;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.identity.VerificationReport;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.identity.VerificationReportListParams;
import com.stripe.param.identity.VerificationReportRetrieveParams;

public final class VerificationReportService extends ApiService {
  public VerificationReportService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an existing VerificationReport. */
  public VerificationReport retrieve(String report, VerificationReportRetrieveParams params)
      throws StripeException {
    return retrieve(report, params, (RequestOptions) null);
  }
  /** Retrieves an existing VerificationReport. */
  public VerificationReport retrieve(String report, RequestOptions options) throws StripeException {
    return retrieve(report, (VerificationReportRetrieveParams) null, options);
  }
  /** Retrieves an existing VerificationReport. */
  public VerificationReport retrieve(String report) throws StripeException {
    return retrieve(report, (VerificationReportRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing VerificationReport. */
  public VerificationReport retrieve(
      String report, VerificationReportRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_reports/%s", ApiResource.urlEncodeId(report));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, VerificationReport.class);
  }
  /** List all verification reports. */
  public StripeCollection<VerificationReport> list(VerificationReportListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all verification reports. */
  public StripeCollection<VerificationReport> list(RequestOptions options) throws StripeException {
    return list((VerificationReportListParams) null, options);
  }
  /** List all verification reports. */
  public StripeCollection<VerificationReport> list() throws StripeException {
    return list((VerificationReportListParams) null, (RequestOptions) null);
  }
  /** List all verification reports. */
  public StripeCollection<VerificationReport> list(
      VerificationReportListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_reports";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<VerificationReport>>() {}.getType());
  }
}
