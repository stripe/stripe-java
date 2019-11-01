package com.stripe.net;

import com.stripe.exception.StripeException;

/** Base abstract class for HTTP clients used to send requests to Stripe's API. */
public abstract class HttpClient {
  /**
   * Sends the given request to Stripe's API.
   *
   * @param request the request
   * @return the response
   * @throws StripeException If the request fails for any reason
   */
  public abstract StripeResponse request(StripeRequest request) throws StripeException;
}
