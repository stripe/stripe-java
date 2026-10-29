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
public final class InvalidVaultedCredentialException extends ApiException {
  private static final long serialVersionUID = 2L;
  /**
   * Closed Enum. The field that already exists on the resource.
   *
   * <p>One of {@code account_number}, {@code currency}, {@code iban}, or {@code sort_code}.
   */
  @Getter String invalidParam;

  private InvalidVaultedCredentialException(
      String message,
      String requestId,
      String code,
      Integer statusCode,
      Throwable e,
      String invalidParam) {
    super(message, requestId, code, statusCode, e);
    this.invalidParam = invalidParam;
  }

  static InvalidVaultedCredentialException parse(
      JsonObject body, int statusCode, String requestId, StripeResponseGetter responseGetter) {
    InvalidVaultedCredentialException.InvalidVaultedCredentialError error =
        StripeObject.deserializeStripeObject(
            body,
            InvalidVaultedCredentialException.InvalidVaultedCredentialError.class,
            responseGetter);
    InvalidVaultedCredentialException exception =
        new InvalidVaultedCredentialException(
            error.getMessage(),
            requestId,
            error.getCode(),
            statusCode,
            null,
            error.getInvalidParam());
    exception.setStripeError(error);
    return exception;
  }

  public static class InvalidVaultedCredentialError extends StripeError {
    /**
     * Closed Enum. The field that already exists on the resource.
     *
     * <p>One of {@code account_number}, {@code currency}, {@code iban}, or {@code sort_code}.
     */
    @Getter
    @SerializedName("invalid_param")
    String invalidParam;
  }
}
