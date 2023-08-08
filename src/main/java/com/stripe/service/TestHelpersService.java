// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TestHelpersService extends ApiService {
  public TestHelpersService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.CustomerService customers() {
    return new com.stripe.service.testhelpers.CustomerService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.IssuingService issuing() {
    return new com.stripe.service.testhelpers.IssuingService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.RefundService refunds() {
    return new com.stripe.service.testhelpers.RefundService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.TerminalService terminal() {
    return new com.stripe.service.testhelpers.TerminalService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.TestClockService testClocks() {
    return new com.stripe.service.testhelpers.TestClockService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.TreasuryService treasury() {
    return new com.stripe.service.testhelpers.TreasuryService(this.getResponseGetter());
  }
}
