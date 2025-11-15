// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class PrivacyService extends ApiService {
  public PrivacyService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.privacy.RedactionJobService redactionJobs() {
    return new com.stripe.service.privacy.RedactionJobService(this.getResponseGetter());
  }
}
