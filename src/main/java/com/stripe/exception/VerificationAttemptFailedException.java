// File generated from our OpenAPI spec
package com.stripe.exception;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeError;
import com.stripe.model.StripeObject;
import com.stripe.net.StripeResponseGetter;
import lombok.Getter;

/** Returned when the wrong values were provided to confirm microdeposits. */
public final class VerificationAttemptFailedException extends ApiException {
  private static final long serialVersionUID = 2L;
  /**
   * Closed Enum. The verification status of the bank account associated with this error.
   *
   * <p>One of {@code awaiting_verification}, {@code unverified}, {@code verification_failed}, or
   * {@code verified}.
   */
  @Getter String verificationStatus;

  private VerificationAttemptFailedException(
      String message,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e,
      String verificationStatus) {
    super(message, requestId, code, statusCode, e);
    this.verificationStatus = verificationStatus;
  }

  static VerificationAttemptFailedException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    VerificationAttemptFailedException.VerificationAttemptFailedError error =
        StripeObject.deserializeStripeObject(
            body,
            VerificationAttemptFailedException.VerificationAttemptFailedError.class,
            responseGetter);
    VerificationAttemptFailedException exception =
        new VerificationAttemptFailedException(
            error.getMessage(),
            requestId,
            error.getCode(),
            statusCode,
            null,
            error.getVerificationStatus());
    exception.setStripeError(error);
    return exception;
  }

  public static class VerificationAttemptFailedError extends StripeError {
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
