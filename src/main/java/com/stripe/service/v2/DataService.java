// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class DataService extends ApiService {
  public DataService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.data.AnalyticsService analytics() {
    return new com.stripe.service.v2.data.AnalyticsService(this.getResponseGetter());
  }

  public com.stripe.service.v2.data.QueryRunService queryRuns() {
    return new com.stripe.service.v2.data.QueryRunService(this.getResponseGetter());
  }

  public com.stripe.service.v2.data.ReportRunService reportRuns() {
    return new com.stripe.service.v2.data.ReportRunService(this.getResponseGetter());
  }

  public com.stripe.service.v2.data.ReportingService reporting() {
    return new com.stripe.service.v2.data.ReportingService(this.getResponseGetter());
  }

  public com.stripe.service.v2.data.ReportService reports() {
    return new com.stripe.service.v2.data.ReportService(this.getResponseGetter());
  }

  public com.stripe.service.v2.data.SchemaService schemas() {
    return new com.stripe.service.v2.data.SchemaService(this.getResponseGetter());
  }
}
