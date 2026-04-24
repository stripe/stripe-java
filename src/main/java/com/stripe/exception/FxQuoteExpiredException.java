// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Returned when the provided FX quote has already expired. */
public final class FxQuoteExpiredException extends ApiException {
  private static final long serialVersionUID = 2L;

  private FxQuoteExpiredException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static FxQuoteExpiredException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    FxQuoteExpiredException.FxQuoteExpiredError error =
        (FxQuoteExpiredException.FxQuoteExpiredError)
            StripeObject.deserializeStripeObject(
                body, FxQuoteExpiredException.FxQuoteExpiredError.class, responseGetter);
    FxQuoteExpiredException exception =
        new FxQuoteExpiredException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class FxQuoteExpiredError extends StripeError {}
}
