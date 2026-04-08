// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

/** Returned when the PayoutMethod object is set as default_for_currency and cannot be archived. */
public final class CannotProceedException extends ApiException {
  private static final long serialVersionUID = 2L;
  @Getter String reason;

  private CannotProceedException(
      String message,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e,
      String reason) {
    super(message, requestId, code, statusCode, e);
    this.reason = reason;
  }

  static CannotProceedException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    CannotProceedException.CannotProceedError error =
        (CannotProceedException.CannotProceedError)
            StripeObject.deserializeStripeObject(
                body, CannotProceedException.CannotProceedError.class, responseGetter);
    CannotProceedException exception =
        new CannotProceedException(
            error.getMessage(), requestId, error.getCode(), statusCode, null, error.getReason());
    exception.setStripeError(error);
    return exception;
  }

  public static class CannotProceedError extends StripeError {
    @Getter
    @SerializedName("reason")
    String reason;
  }
}
