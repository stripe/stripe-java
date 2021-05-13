
package com.stripe.service.issuing;

import com.stripe.net.StripeClient;
import com.stripe.util.Lazy;

public class IssuingServices {
  private StripeClient client = null;

  public IssuingServices(StripeClient client) {
    this.client = client;
  }

  private final Lazy<CardService> cardService = new Lazy<>(() -> new CardService(this.client));

  public CardService cards() {
    return this.cardService.get();
  }
}
