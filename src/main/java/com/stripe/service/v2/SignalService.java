// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class SignalService extends ApiService {
  public SignalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.signals.AccountSignalService accountSignals() {
    return new com.stripe.service.v2.signals.AccountSignalService(this.getResponseGetter());
  }
}
