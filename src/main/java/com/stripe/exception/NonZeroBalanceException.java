// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Error thrown if a user tries to close an account that has non-zero balances. */
public final class NonZeroBalanceException extends ApiException {
  private static final long serialVersionUID = 2L;

  private NonZeroBalanceException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static NonZeroBalanceException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    NonZeroBalanceException.NonZeroBalanceError error =
        (NonZeroBalanceException.NonZeroBalanceError)
            StripeObject.deserializeStripeObject(
                body, NonZeroBalanceException.NonZeroBalanceError.class, responseGetter);
    NonZeroBalanceException exception =
        new NonZeroBalanceException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class NonZeroBalanceError extends StripeError {}
}
