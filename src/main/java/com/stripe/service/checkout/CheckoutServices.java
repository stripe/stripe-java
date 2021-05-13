
package com.stripe.service.checkout;

import com.stripe.net.StripeClient;
import com.stripe.util.Lazy;

public class CheckoutServices {
  private StripeClient client = null;

  public CheckoutServices(StripeClient client) {
    this.client = client;
  }

  private final Lazy<SessionService> sessionService = new Lazy<>(() -> new SessionService(this.client));

  public SessionService sessions() {
    return this.sessionService.get();
  }
}
