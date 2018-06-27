package com.stripe.exception;

public class InvalidRequestException extends StripeException {
  private static final long serialVersionUID = 2L;

  private final String param;

  public InvalidRequestException(String message, String param, String requestId, String code,
      Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
    this.param = param;
  }

  public String getParam() {
    return param;
  }
}
