package com.stripe.net;

import lombok.AccessLevel;
import lombok.Getter;

/** The base class for all services. */
public abstract class ApiService {
  @Getter(AccessLevel.PROTECTED)
  private final StripeResponseGetter responseGetter;

  protected ApiService(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }
}
