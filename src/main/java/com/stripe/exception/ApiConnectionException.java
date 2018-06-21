package com.stripe.exception;

public class ApiConnectionException extends StripeException {
  private static final long serialVersionUID = 2L;

  public ApiConnectionException(String message) {
    this(message, null);
  }

  public ApiConnectionException(String message, Throwable e) {
    super(message, null, null, 0, e);
  }
}
