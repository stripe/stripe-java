package com.stripe.exception;

public class ApiException extends StripeException {
  private static final long serialVersionUID = 2L;

  /**
   * Constructs a new API exception with the specified details.
   *
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public ApiException(String message, String requestId, Integer statusCode, Throwable e) {
    this(message, requestId, null, statusCode, e);
  }

  public ApiException(String message, String requestId, String code, Integer statusCode,
      Throwable e) {
    super(message, requestId, code, statusCode, e);
  }
}
