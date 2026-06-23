package com.stripe.net;

import com.stripe.exception.StripeException;

/**
 * Interface for applying authentication to a request. This is used by {@link StripeResponseGetter}
 * to apply authentication to requests before they are sent. Implementations of this interface
 * should not modify the request in-place, but should instead return a new request with the
 * appropriate authentication headers applied. The default implementation of this interface is
 * {@link BearerTokenAuthenticator}, which applies the API key as a Bearer token in the
 * Authorization header. Users can also implement this interface to provide custom authentication
 * logic, often by wrapping the BearerTokenAuthenticator and applying additional headers or logic as
 * needed.
 */
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
