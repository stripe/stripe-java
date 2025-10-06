// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/**
 * Error returned when the user enables notifications in the OutboundPayment request, but an email
 * is not set up on the recipient account.
 */
public final class RecipientNotNotifiableException extends ApiException {
  private static final long serialVersionUID = 2L;

  private RecipientNotNotifiableException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static RecipientNotNotifiableException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    RecipientNotNotifiableException.RecipientNotNotifiableError error =
        (RecipientNotNotifiableException.RecipientNotNotifiableError)
            StripeObject.deserializeStripeObject(
                body,
                RecipientNotNotifiableException.RecipientNotNotifiableError.class,
                responseGetter);
    RecipientNotNotifiableException exception =
        new RecipientNotNotifiableException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class RecipientNotNotifiableError extends StripeError {}
}
