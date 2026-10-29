// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

/**
 * Returned when an attempt to confirm microdeposits has failed because too much time has elapsed
 * since the microdeposits were sent.
 */
public final class VerificationExpiredException extends ApiException {
  private static final long serialVersionUID = 2L;
  /**
   * Closed Enum. The verification status of the bank account associated with this error.
   *
   * <p>One of {@code awaiting_verification}, {@code unverified}, {@code verification_failed}, or
   * {@code verified}.
   */
  @Getter String verificationStatus;

  private VerificationExpiredException(
      String message,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e,
      String verificationStatus) {
    super(message, requestId, code, statusCode, e);
    this.verificationStatus = verificationStatus;
  }

  static VerificationExpiredException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    VerificationExpiredException.VerificationExpiredError error =
        StripeObject.deserializeStripeObject(
            body, VerificationExpiredException.VerificationExpiredError.class, responseGetter);
    VerificationExpiredException exception =
        new VerificationExpiredException(
            error.getMessage(),
            requestId,
            error.getCode(),
            statusCode,
            null,
            error.getVerificationStatus());
    exception.setStripeError(error);
    return exception;
  }

  public static class VerificationExpiredError extends StripeError {
    /**
     * Closed Enum. The verification status of the bank account associated with this error.
     *
     * <p>One of {@code awaiting_verification}, {@code unverified}, {@code verification_failed}, or
     * {@code verified}.
     */
    @Getter
    @SerializedName("verification_status")
    String verificationStatus;
  }
}
