package com.stripe.exception;

public class AuthenticationException extends StripeException {
  private static final long serialVersionUID = 2L;

  public AuthenticationException(String message, String requestId, String code,
      Integer statusCode) {
    super(message, requestId, code, statusCode);
  }
}
