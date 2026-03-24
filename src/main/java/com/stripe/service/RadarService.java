// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class RadarService extends ApiService {
  public RadarService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.radar.EarlyFraudWarningService earlyFraudWarnings() {
    return new com.stripe.service.radar.EarlyFraudWarningService(this.getResponseGetter());
  }

  public com.stripe.service.radar.PaymentEvaluationService paymentEvaluations() {
    return new com.stripe.service.radar.PaymentEvaluationService(this.getResponseGetter());
  }

  public com.stripe.service.radar.ValueListItemService valueListItems() {
    return new com.stripe.service.radar.ValueListItemService(this.getResponseGetter());
  }

  public com.stripe.service.radar.ValueListService valueLists() {
    return new com.stripe.service.radar.ValueListService(this.getResponseGetter());
  }
}
