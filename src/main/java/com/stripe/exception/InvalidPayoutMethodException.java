// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class InvalidPayoutMethodException extends ApiException {
  private static final long serialVersionUID = 2L;

  private InvalidPayoutMethodException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static InvalidPayoutMethodException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    InvalidPayoutMethodException.InvalidPayoutMethodError error =
        (InvalidPayoutMethodException.InvalidPayoutMethodError)
            StripeObject.deserializeStripeObject(
                body, InvalidPayoutMethodException.InvalidPayoutMethodError.class, responseGetter);
    InvalidPayoutMethodException exception =
        new InvalidPayoutMethodException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class InvalidPayoutMethodError extends StripeError {}
}
