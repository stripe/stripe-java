// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** The resource already exists. */
public final class AlreadyExistsException extends ApiException {
  private static final long serialVersionUID = 2L;

  private AlreadyExistsException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static AlreadyExistsException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    AlreadyExistsException.AlreadyExistsError error =
        (AlreadyExistsException.AlreadyExistsError)
            StripeObject.deserializeStripeObject(
                body, AlreadyExistsException.AlreadyExistsError.class, responseGetter);
    AlreadyExistsException exception =
        new AlreadyExistsException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class AlreadyExistsError extends StripeError {}
}
