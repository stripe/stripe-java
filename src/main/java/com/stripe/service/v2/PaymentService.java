// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class PaymentService extends ApiService {
  public PaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.payments.OffSessionPaymentService offSessionPayments() {
    return new com.stripe.service.v2.payments.OffSessionPaymentService(this.getResponseGetter());
  }
}
