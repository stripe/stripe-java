package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

@Getter
public class RateLimitException extends ApiException {
  private static final long serialVersionUID = 2L;

  private final String param;

  public RateLimitException(
      String message,
      String param,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e) {
    super(message, requestId, code, statusCode, e);
    this.param = param;
  }

  static RateLimitException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    RateLimitException.RateLimitError error =
        (RateLimitException.RateLimitError)
            StripeObject.deserializeStripeObject(
                body, RateLimitException.RateLimitError.class, responseGetter);
    RateLimitException exception =
        new RateLimitException(
            error.getMessage(), error.getParam(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class RateLimitError extends StripeError {}
}
