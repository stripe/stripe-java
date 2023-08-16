// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class SigmaService extends ApiService {
  public SigmaService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.sigma.ScheduledQueryRunService scheduledQueryRuns() {
    return new com.stripe.service.sigma.ScheduledQueryRunService(this.getResponseGetter());
  }
}
