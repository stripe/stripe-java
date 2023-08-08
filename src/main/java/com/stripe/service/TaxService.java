// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TaxService extends ApiService {
  public TaxService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.tax.CalculationService calculations() {
    return new com.stripe.service.tax.CalculationService(this.getResponseGetter());
  }

  public com.stripe.service.tax.SettingsService settings() {
    return new com.stripe.service.tax.SettingsService(this.getResponseGetter());
  }

  public com.stripe.service.tax.TransactionService transactions() {
    return new com.stripe.service.tax.TransactionService(this.getResponseGetter());
  }
}
