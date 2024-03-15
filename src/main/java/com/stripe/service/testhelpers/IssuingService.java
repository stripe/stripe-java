// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class IssuingService extends ApiService {
  public IssuingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.testhelpers.issuing.AuthorizationService authorizations() {
    return new com.stripe.service.testhelpers.issuing.AuthorizationService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.issuing.CardService cards() {
    return new com.stripe.service.testhelpers.issuing.CardService(this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.issuing.PersonalizationDesignService
      personalizationDesigns() {
    return new com.stripe.service.testhelpers.issuing.PersonalizationDesignService(
        this.getResponseGetter());
  }

  public com.stripe.service.testhelpers.issuing.TransactionService transactions() {
    return new com.stripe.service.testhelpers.issuing.TransactionService(this.getResponseGetter());
  }
}
