// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class InsufficientFundsException extends ApiException {
  private static final long serialVersionUID = 2L;

  private InsufficientFundsException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static InsufficientFundsException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    InsufficientFundsException.InsufficientFundsError error =
        (InsufficientFundsException.InsufficientFundsError)
            StripeObject.deserializeStripeObject(
                body, InsufficientFundsException.InsufficientFundsError.class, responseGetter);
    InsufficientFundsException exception =
        new InsufficientFundsException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class InsufficientFundsError extends StripeError {}
}
