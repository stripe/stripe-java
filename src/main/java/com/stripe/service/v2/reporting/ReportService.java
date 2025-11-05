// File generated from our OpenAPI spec
package com.stripe.service.v2.reporting;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.reporting.Report;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class ReportService extends ApiService {
  public ReportService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves metadata about a specific {@code Report} template, including its name, description,
   * and the parameters it accepts. It's useful for understanding the capabilities and requirements
   * of a particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves metadata about a specific {@code Report} template, including its name, description,
   * and the parameters it accepts. It's useful for understanding the capabilities and requirements
   * of a particular {@code Report} before requesting a {@code ReportRun}.
   */
  public Report retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/reporting/reports/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Report.class);
  }
}
