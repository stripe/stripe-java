// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/**
 * Returned when the number of country bank accounts has exceeded the limit in a given workspace.
 * PayoutMethodBankAccount objects may be archived with the /archive API, at which point they will
 * not count against the limit. If you are not passing a V2 Account ID in the Stripe-Context header
 * you may receive this error since you are creating all your bank account objects in your own
 * workspace.
 */
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
