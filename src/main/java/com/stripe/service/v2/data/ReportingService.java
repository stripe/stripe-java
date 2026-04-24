// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class ReportingService extends ApiService {
  public ReportingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.data.reporting.QueryRunService queryRuns() {
    return new com.stripe.service.v2.data.reporting.QueryRunService(this.getResponseGetter());
  }
}
