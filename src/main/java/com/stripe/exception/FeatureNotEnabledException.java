// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;

/** Information about the error that occurred. */
public final class FeatureNotEnabledException extends ApiException {
  private static final long serialVersionUID = 2L;

  private FeatureNotEnabledException(
      String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, requestId, code, statusCode, e);
  }

  static FeatureNotEnabledException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    FeatureNotEnabledException.FeatureNotEnabledError error =
        (FeatureNotEnabledException.FeatureNotEnabledError)
            StripeObject.deserializeStripeObject(
                body, FeatureNotEnabledException.FeatureNotEnabledError.class, responseGetter);
    FeatureNotEnabledException exception =
        new FeatureNotEnabledException(
            error.getMessage(), requestId, error.getCode(), statusCode, null);
    exception.setStripeError(error);
    return exception;
  }

  public static class FeatureNotEnabledError extends StripeError {}
}
