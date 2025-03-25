// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Error returned when user tries to cancel an OutboundPayment that is not cancelable. */
public final class NotCancelableException extends ApiException {
  private static final long serialVersionUID = 2L;

  private NotCancelableException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static NotCancelableException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    NotCancelableException.NotCancelableError error =
        (NotCancelableException.NotCancelableError)
            StripeObject.deserializeStripeObject(
                body, NotCancelableException.NotCancelableError.class, responseGetter);
    NotCancelableException exception =
        new NotCancelableException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class NotCancelableError extends StripeError {}
}
