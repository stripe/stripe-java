package com.stripe.net;

import com.stripe.exception.StripeException;

/** * Represents a request authentication mechanism. */
public interface Authenticator {
  /**
   * * Authenticate the request
   *
   * @param request the request that need authentication.
   * @return the request with authentication headers applied.
   * @throws StripeException on authentication errors.
   */
  StripeRequest authenticate(StripeRequest request) throws StripeException;
}
