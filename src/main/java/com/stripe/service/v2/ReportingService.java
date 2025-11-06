// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ReportingService extends ApiService {
  public ReportingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.reporting.ReportRunService reportRuns() {
    return new com.stripe.service.v2.reporting.ReportRunService(this.getResponseGetter());
  }

  public com.stripe.service.v2.reporting.ReportService reports() {
    return new com.stripe.service.v2.reporting.ReportService(this.getResponseGetter());
  }
}
