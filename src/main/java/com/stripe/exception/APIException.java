package com.stripe.exception;

public class APIException extends StripeException {
  private static final long serialVersionUID = 2L;

  /**
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public APIException(String message, String requestId, Integer statusCode, Throwable e) {
    this(message, requestId, null, statusCode, e);
  }

  public APIException(String message, String requestId, String code, Integer statusCode,
      Throwable e) {
    super(message, requestId, code, statusCode, e);
  }
}
