// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Error returned when the FX quote rate lock for a PayoutIntent has expired. */
public final class FxQuoteNeedsRefreshException extends ApiException {
  private static final long serialVersionUID = 2L;

  private FxQuoteNeedsRefreshException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static FxQuoteNeedsRefreshException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    FxQuoteNeedsRefreshException.FxQuoteNeedsRefreshError error =
        StripeObject.deserializeStripeObject(
            body, FxQuoteNeedsRefreshException.FxQuoteNeedsRefreshError.class, responseGetter);
    FxQuoteNeedsRefreshException exception =
        new FxQuoteNeedsRefreshException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class FxQuoteNeedsRefreshError extends StripeError {}
}
