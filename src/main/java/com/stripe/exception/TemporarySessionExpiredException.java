// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class TemporarySessionExpiredException extends ApiException {
  private static final long serialVersionUID = 2L;

  private TemporarySessionExpiredException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static TemporarySessionExpiredException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    TemporarySessionExpiredException.TemporarySessionExpiredError error =
        (TemporarySessionExpiredException.TemporarySessionExpiredError)
            StripeObject.deserializeStripeObject(
                body,
                TemporarySessionExpiredException.TemporarySessionExpiredError.class,
                responseGetter);
    TemporarySessionExpiredException exception =
        new TemporarySessionExpiredException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class TemporarySessionExpiredError extends StripeError {}
}
