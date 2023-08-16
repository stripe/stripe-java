// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class BillingPortalService extends ApiService {
  public BillingPortalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.billingportal.ConfigurationService configurations() {
    return new com.stripe.service.billingportal.ConfigurationService(this.getResponseGetter());
  }

  public com.stripe.service.billingportal.SessionService sessions() {
    return new com.stripe.service.billingportal.SessionService(this.getResponseGetter());
  }
}
