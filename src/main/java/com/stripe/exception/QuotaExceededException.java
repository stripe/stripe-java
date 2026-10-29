// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/**
 * Returned when the number of GBBankAccount objects on a given V2 Account has exceeded the limit of
 * 10. GBBankAccount objects may be archived with /archive, at which point they will not count
 * against the limit. If you are not passing a V2 Account ID in the Stripe-Context header you may
 * receive this error since you are creating all your GBBankAccount objects in your own workspace.
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
