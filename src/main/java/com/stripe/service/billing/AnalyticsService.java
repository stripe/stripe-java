// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class AnalyticsService extends ApiService {
  public AnalyticsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.billing.analytics.MeterUsageService meterUsage() {
    return new com.stripe.service.billing.analytics.MeterUsageService(this.getResponseGetter());
  }
}
