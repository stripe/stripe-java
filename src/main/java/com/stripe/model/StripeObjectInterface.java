package com.stripe.model;

import com.stripe.net.StripeResponse;

public interface StripeObjectInterface {
  public StripeResponse getLastResponse();

  public void setLastResponse(StripeResponse response);
}
