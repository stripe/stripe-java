// Stub — provides StripeError type referenced by handwritten exception classes.
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeError extends StripeObject {
  /**
   * For some errors that could be handled programmatically, a short string indicating the <a
   * href="https://docs.stripe.com/error-codes">error code</a> reported.
   */
  /** For card errors, the ID of the failed charge. */
  @SerializedName("charge")
  String charge;

  @SerializedName("code")
  String code;

  /** For card errors resulting from a card issuer decline, a short string indicating the card
   * issuer's reason for the decline. */
  @SerializedName("decline_code")
  String declineCode;

  /**
   * A human-readable message providing more details about the error. For card errors, these
   * messages can be shown to your users.
   */
  @SerializedName("message")
  String message;

  /**
   * If the error is parameter-specific, the parameter related to the error. For example, you can
   * use this to display a message near the correct form field.
   */
  @SerializedName("param")
  String param;

  /**
   * The type of error returned. One of {@code api_error}, {@code card_error}, {@code
   * idempotency_error}, or {@code invalid_request_error}
   */
  @SerializedName("type")
  String type;

  /** The user message associated with the error. */
  @SerializedName("user_message")
  String userMessage;
}
