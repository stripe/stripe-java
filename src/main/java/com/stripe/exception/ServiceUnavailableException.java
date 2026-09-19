// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** The FinancialAccount wallet export is temporarily unavailable. */
public final class ServiceUnavailableException extends ApiException {
  private static final long serialVersionUID = 2L;

  private ServiceUnavailableException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static ServiceUnavailableException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    ServiceUnavailableException.ServiceUnavailableError error =
        StripeObject.deserializeStripeObject(
            body, ServiceUnavailableException.ServiceUnavailableError.class, responseGetter);
    ServiceUnavailableException exception =
        new ServiceUnavailableException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class ServiceUnavailableError extends StripeError {}
}
