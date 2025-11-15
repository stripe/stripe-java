// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Error returned when user tries to cancel an OutboundPayment that was already canceled. */
public final class AlreadyCanceledException extends ApiException {
  private static final long serialVersionUID = 2L;

  private AlreadyCanceledException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static AlreadyCanceledException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    AlreadyCanceledException.AlreadyCanceledError error =
        (AlreadyCanceledException.AlreadyCanceledError)
            StripeObject.deserializeStripeObject(
                body, AlreadyCanceledException.AlreadyCanceledError.class, responseGetter);
    AlreadyCanceledException exception =
        new AlreadyCanceledException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class AlreadyCanceledError extends StripeError {}
}
