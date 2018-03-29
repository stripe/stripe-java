package com.stripe.exception;

public class APIConnectionException extends StripeException {
  private static final long serialVersionUID = 2L;

  public APIConnectionException(String message) {
    this(message, null);
  }

  public APIConnectionException(String message, Throwable e) {
    super(message, null, null, 0, e);
  }
}
