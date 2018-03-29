package com.stripe.exception;

public class RateLimitException extends InvalidRequestException {
  private static final long serialVersionUID = 2L;

  /**
   * @deprecated Use new constructor with `code` argument instead.
   */
  @Deprecated
  // TODO: remove this constructor in next major version bump
  public RateLimitException(String message, String param, String requestId, Integer statusCode,
      Throwable e) {
    this(message, param, null, requestId, statusCode, e);
  }

  public RateLimitException(String message, String param, String requestId, String code,
      Integer statusCode, Throwable e) {
    super(message, param, code, requestId, statusCode, e);
  }
}
