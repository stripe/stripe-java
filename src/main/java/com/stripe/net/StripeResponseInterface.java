package com.stripe.net;

import java.time.Instant;

/** Common interface representing an HTTP response from Stripe. */
interface StripeResponseInterface {
  /** The HTTP status code of the response. */
  public int code();

  /** The HTTP headers of the response. */
  public HttpHeaders headers();

  /**
   * Gets the date of the request, as returned by Stripe.
   *
   * @return the date of the request, as returned by Stripe
   */
  public Instant date();
  /**
   * Gets the idempotency key of the request, as returned by Stripe.
   *
   * @return the idempotency key of the request, as returned by Stripe
   */
  public String idempotencyKey();
  /**
   * Gets the ID of the request, as returned by Stripe.
   *
   * @return the ID of the request, as returned by Stripe
   */
  public String requestId();

  /** Get number of times the request was retried. Used for internal tests only. */
  public int numRetries();

  /** Set number of times the request was retried. Used for internal tests only. */
  public StripeResponseInterface numRetries(int numRetries);
}
