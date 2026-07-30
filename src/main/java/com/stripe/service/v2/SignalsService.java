// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class SignalsService extends ApiService {
  public SignalsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.signals.AccountActivityService accountActivity() {
    return new com.stripe.service.v2.signals.AccountActivityService(this.getResponseGetter());
  }

  public com.stripe.service.v2.signals.AccountEvaluationService accountEvaluations() {
    return new com.stripe.service.v2.signals.AccountEvaluationService(this.getResponseGetter());
  }

  public com.stripe.service.v2.signals.AccountSignalService accountSignals() {
    return new com.stripe.service.v2.signals.AccountSignalService(this.getResponseGetter());
  }
}
