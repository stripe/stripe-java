package com.stripe.net;

import com.stripe.exception.StripeException;

/**
 * Functional interface for sending a StripeRequest and returning a response.
 *
 * This interface defines a single abstract method that takes a StripeRequest and returns
 * a response of type R. It's designed to abstract the process of sending a StripeRequest,
 * allowing for different implementations of request sending mechanisms. Implementations
 * of this function might throw a StripeException, which should be handled by the caller.
 *
 * @param <R> The type of response expected from the StripeRequest.
 */
@FunctionalInterface
interface RequestSendFunction<R> {
  /**
   * Applies this function to the given StripeRequest.
   *
   * @param request The StripeRequest to be sent.
   * @return The response of type R from the StripeRequest.
   * @throws StripeException If an error occurs in the implementation during request processing.
   */
  R apply(StripeRequest request) throws StripeException;
}
