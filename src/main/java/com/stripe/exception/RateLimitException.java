package com.stripe.exception;

public class RateLimitException extends InvalidRequestException {
  private static final long serialVersionUID = 2L;

  public RateLimitException(String message, String param, String requestId, String code,
      Integer statusCode, Throwable e) {
    super(message, param, requestId, code, statusCode, e);
  }
}
