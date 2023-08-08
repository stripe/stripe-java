// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TerminalService extends ApiService {
  public TerminalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.terminal.ReaderService readers() {
    return new com.stripe.service.testhelpers.terminal.ReaderService(this.getResponseGetter());
  }
}
