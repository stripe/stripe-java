package com.stripe.exception;

public class AuthenticationException extends StripeException {
  private static final long serialVersionUID = 2L;

  /**
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public AuthenticationException(String message, String requestId, Integer statusCode) {
    this(message, requestId, null, statusCode);
  }

  public AuthenticationException(String message, String requestId, String code,
      Integer statusCode) {
    super(message, requestId, code, statusCode);
  }
}
