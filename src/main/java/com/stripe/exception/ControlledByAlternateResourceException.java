// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/**
 * Returned when the PayoutMethod object is controlled by an alternate resource so cannot be
 * archived.
 */
public final class ControlledByAlternateResourceException extends ApiException {
  private static final long serialVersionUID = 2L;

  private ControlledByAlternateResourceException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static ControlledByAlternateResourceException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    ControlledByAlternateResourceException.ControlledByAlternateResourceError error =
        (ControlledByAlternateResourceException.ControlledByAlternateResourceError)
            StripeObject.deserializeStripeObject(
                body,
                ControlledByAlternateResourceException.ControlledByAlternateResourceError.class,
                responseGetter);
    ControlledByAlternateResourceException exception =
        new ControlledByAlternateResourceException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class ControlledByAlternateResourceError extends StripeError {}
}
