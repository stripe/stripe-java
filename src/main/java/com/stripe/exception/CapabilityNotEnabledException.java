// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** The user attempts to create an outbound flow from a closed Financial Account. */
public final class CapabilityNotEnabledException extends ApiException {
  private static final long serialVersionUID = 2L;

  private CapabilityNotEnabledException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static CapabilityNotEnabledException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    CapabilityNotEnabledException.CapabilityNotEnabledError error =
        StripeObject.deserializeStripeObject(
            body, CapabilityNotEnabledException.CapabilityNotEnabledError.class, responseGetter);
    CapabilityNotEnabledException exception =
        new CapabilityNotEnabledException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class CapabilityNotEnabledError extends StripeError {}
}
