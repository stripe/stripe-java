// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class QuotaExceededException extends ApiException {
  private static final long serialVersionUID = 2L;

  private QuotaExceededException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static QuotaExceededException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    QuotaExceededException.QuotaExceededError error =
        (QuotaExceededException.QuotaExceededError)
            StripeObject.deserializeStripeObject(
                body, QuotaExceededException.QuotaExceededError.class, responseGetter);
    QuotaExceededException exception =
        new QuotaExceededException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class QuotaExceededError extends StripeError {}
}
