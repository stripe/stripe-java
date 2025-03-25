// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

public final class FinancialAccountNotOpenException extends ApiException {
  private static final long serialVersionUID = 2L;

  private FinancialAccountNotOpenException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static FinancialAccountNotOpenException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    FinancialAccountNotOpenException.FinancialAccountNotOpenError error =
        (FinancialAccountNotOpenException.FinancialAccountNotOpenError)
            StripeObject.deserializeStripeObject(
                body,
                FinancialAccountNotOpenException.FinancialAccountNotOpenError.class,
                responseGetter);
    FinancialAccountNotOpenException exception =
        new FinancialAccountNotOpenException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class FinancialAccountNotOpenError extends StripeError {}
}
