package com.stripe.exception;

public class RateLimitException extends InvalidRequestException {

  public RateLimitException(String message, String param, String requestId, Throwable e) {
    super(message, param, requestId, e);
  }

}
