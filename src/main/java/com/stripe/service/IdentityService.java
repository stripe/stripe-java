// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class IdentityService extends ApiService {
  public IdentityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.identity.BlocklistEntryService blocklistEntries() {
    return new com.stripe.service.identity.BlocklistEntryService(this.getResponseGetter());
  }

  public com.stripe.service.identity.VerificationReportService verificationReports() {
    return new com.stripe.service.identity.VerificationReportService(this.getResponseGetter());
  }

  public com.stripe.service.identity.VerificationSessionService verificationSessions() {
    return new com.stripe.service.identity.VerificationSessionService(this.getResponseGetter());
  }
}
