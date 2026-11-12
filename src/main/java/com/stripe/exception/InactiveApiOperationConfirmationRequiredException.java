// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/**
 * Account creation is temporarily restricted. Confirm in the Stripe Dashboard that you intended to
 * create this account, then retry.
 */
public final class InactiveApiOperationConfirmationRequiredException extends ApiException {
  private static final long serialVersionUID = 2L;

  private InactiveApiOperationConfirmationRequiredException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static InactiveApiOperationConfirmationRequiredException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    InactiveApiOperationConfirmationRequiredException.InactiveApiOperationConfirmationRequiredError
        error =
            StripeObject.deserializeStripeObject(
                body,
                InactiveApiOperationConfirmationRequiredException
                    .InactiveApiOperationConfirmationRequiredError.class,
                responseGetter);
    InactiveApiOperationConfirmationRequiredException exception =
        new InactiveApiOperationConfirmationRequiredException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class InactiveApiOperationConfirmationRequiredError extends StripeError {}
}
