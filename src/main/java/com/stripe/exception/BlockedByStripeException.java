// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Returned when the bank account cannot be added due to previous suspicious activity. */
public final class BlockedByStripeException extends ApiException {
  private static final long serialVersionUID = 2L;

  private BlockedByStripeException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static BlockedByStripeException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    BlockedByStripeException.BlockedByStripeError error =
        (BlockedByStripeException.BlockedByStripeError)
            StripeObject.deserializeStripeObject(
                body, BlockedByStripeException.BlockedByStripeError.class, responseGetter);
    BlockedByStripeException exception =
        new BlockedByStripeException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class BlockedByStripeError extends StripeError {}
}
