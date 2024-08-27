// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class TerminalService extends ApiService {
  public TerminalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.terminal.ConfigurationService configurations() {
    return new com.stripe.service.terminal.ConfigurationService(this.getResponseGetter());
  }

  public com.stripe.service.terminal.ConnectionTokenService connectionTokens() {
    return new com.stripe.service.terminal.ConnectionTokenService(this.getResponseGetter());
  }

  public com.stripe.service.terminal.LocationService locations() {
    return new com.stripe.service.terminal.LocationService(this.getResponseGetter());
  }

  public com.stripe.service.terminal.ReaderCollectedDataService readerCollectedData() {
    return new com.stripe.service.terminal.ReaderCollectedDataService(this.getResponseGetter());
  }

  public com.stripe.service.terminal.ReaderService readers() {
    return new com.stripe.service.terminal.ReaderService(this.getResponseGetter());
  }
}
