// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class OrchestrationService extends ApiService {
  public OrchestrationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.orchestration.PaymentAttemptService paymentAttempts() {
    return new com.stripe.service.orchestration.PaymentAttemptService(this.getResponseGetter());
  }
}
