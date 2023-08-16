// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class GiftCardsService extends ApiService {
  public GiftCardsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.giftcards.CardService cards() {
    return new com.stripe.service.giftcards.CardService(this.getResponseGetter());
  }

  public com.stripe.service.giftcards.TransactionService transactions() {
    return new com.stripe.service.giftcards.TransactionService(this.getResponseGetter());
  }
}
