// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Errors Returned when raw card input is not enabled for the account. */
public final class MerchantNotGatedException extends ApiException {
  private static final long serialVersionUID = 2L;

  private MerchantNotGatedException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static MerchantNotGatedException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    MerchantNotGatedException.MerchantNotGatedError error =
        StripeObject.deserializeStripeObject(
            body, MerchantNotGatedException.MerchantNotGatedError.class, responseGetter);
    MerchantNotGatedException exception =
        new MerchantNotGatedException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class MerchantNotGatedError extends StripeError {}
}
