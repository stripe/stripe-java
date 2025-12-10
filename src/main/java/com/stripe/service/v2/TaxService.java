// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TaxService extends ApiService {
  public TaxService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.tax.ManualRuleService manualRules() {
    return new com.stripe.service.v2.tax.ManualRuleService(this.getResponseGetter());
  }
}
