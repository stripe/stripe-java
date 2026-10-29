// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.data.Report;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.data.ReportListParams;
import com.stripe.param.v2.data.ReportRetrieveParams;

public final class ReportService extends ApiService {
  public ReportService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Stripe-defined reports that the caller can create a {@code ReportRun} for.
   */
  public StripeCollection<Report> list(ReportListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Stripe-defined reports that the caller can create a {@code ReportRun} for.
   */
  public StripeCollection<Report> list(RequestOptions options) throws StripeException {
    return list((ReportListParams) null, options);
  }
  /**
   * Returns a list of Stripe-defined reports that the caller can create a {@code ReportRun} for.
   */
  public StripeCollection<Report> list() throws StripeException {
    return list((ReportListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Stripe-defined reports that the caller can create a {@code ReportRun} for.
   */
  public StripeCollection<Report> list(ReportListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/data/reports";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Report>>() {}.getType());
  }
  /**
   * Retrieves metadata about a specific {@code Report}, including its name, description, and the
   * parameters it accepts. It's useful for understanding the capabilities and requirements of a
   * particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id, ReportRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves metadata about a specific {@code Report}, including its name, description, and the
   * parameters it accepts. It's useful for understanding the capabilities and requirements of a
   * particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReportRetrieveParams) null, options);
  }
  /**
   * Retrieves metadata about a specific {@code Report}, including its name, description, and the
   * parameters it accepts. It's useful for understanding the capabilities and requirements of a
   * particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id) throws StripeException {
    return retrieve(id, (ReportRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves metadata about a specific {@code Report}, including its name, description, and the
   * parameters it accepts. It's useful for understanding the capabilities and requirements of a
   * particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id, ReportRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/data/reports/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Report.class);
  }
}
