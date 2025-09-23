// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class ControlledByDashboardException extends ApiException {
  private static final long serialVersionUID = 2L;

  private ControlledByDashboardException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static ControlledByDashboardException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    ControlledByDashboardException.ControlledByDashboardError error =
        (ControlledByDashboardException.ControlledByDashboardError)
            StripeObject.deserializeStripeObject(
                body,
                ControlledByDashboardException.ControlledByDashboardError.class,
                responseGetter);
    ControlledByDashboardException exception =
        new ControlledByDashboardException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class ControlledByDashboardError extends StripeError {}
}
