// File generated from our OpenAPI spec
package com.stripe.service.v2.data;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class AnalyticsService extends ApiService {
  public AnalyticsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.data.analytics.MetricQueryService metricQuery() {
    return new com.stripe.service.v2.data.analytics.MetricQueryService(this.getResponseGetter());
  }
}
