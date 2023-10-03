// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class IssuingService extends ApiService {
  public IssuingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.issuing.AuthorizationService authorizations() {
    return new com.stripe.service.issuing.AuthorizationService(this.getResponseGetter());
  }

  public com.stripe.service.issuing.CardholderService cardholders() {
    return new com.stripe.service.issuing.CardholderService(this.getResponseGetter());
  }

  public com.stripe.service.issuing.CardService cards() {
    return new com.stripe.service.issuing.CardService(this.getResponseGetter());
  }

  public com.stripe.service.issuing.DisputeService disputes() {
    return new com.stripe.service.issuing.DisputeService(this.getResponseGetter());
  }

  public com.stripe.service.issuing.TokenService tokens() {
    return new com.stripe.service.issuing.TokenService(this.getResponseGetter());
  }

  public com.stripe.service.issuing.TransactionService transactions() {
    return new com.stripe.service.issuing.TransactionService(this.getResponseGetter());
  }
}
