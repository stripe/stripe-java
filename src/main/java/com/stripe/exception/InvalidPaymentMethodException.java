// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

/**
 * Returned in cases where the bank account provided is not valid (wrong format of account number or
 * a routing number that does not correspond to a banking institution).
 */
public final class InvalidPaymentMethodException extends ApiException {
  private static final long serialVersionUID = 2L;
  @Getter String invalidParam;

  private InvalidPaymentMethodException(
      String message,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e,
      String invalidParam) {
    super(message, requestId, code, statusCode, e);
    this.invalidParam = invalidParam;
  }

  static InvalidPaymentMethodException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    InvalidPaymentMethodException.InvalidPaymentMethodError error =
        (InvalidPaymentMethodException.InvalidPaymentMethodError)
            StripeObject.deserializeStripeObject(
                body,
                InvalidPaymentMethodException.InvalidPaymentMethodError.class,
                responseGetter);
    InvalidPaymentMethodException exception =
        new InvalidPaymentMethodException(
            error.getMessage(),
            requestId,
            error.getCode(),
            statusCode,
            null,
            error.getInvalidParam());
    exception.setStripeError(error);
    return exception;
  }

  public static class InvalidPaymentMethodError extends StripeError {
    @Getter
    @SerializedName("invalid_param")
    String invalidParam;
  }
}
