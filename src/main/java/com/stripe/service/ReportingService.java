// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ReportingService extends ApiService {
  public ReportingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.reporting.ReportRunService reportRuns() {
    return new com.stripe.service.reporting.ReportRunService(this.getResponseGetter());
  }

  public com.stripe.service.reporting.ReportTypeService reportTypes() {
    return new com.stripe.service.reporting.ReportTypeService(this.getResponseGetter());
  }
}
