package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeError extends StripeObject {
  /** For card errors, the ID of the failed charge. */
  @SerializedName("charge")
  String charge;

  /**
   * For some errors that could be handled programmatically, a short string indicating the <a
   * href="https://stripe.com/docs/error-codes">error code</a> reported.
   */
  @SerializedName("code")
  String code;

  /**
   * For card errors resulting from a card issuer decline, a short string indicating the <a
   * href="https://stripe.com/docs/declines#issuer-declines">card issuer's reason for the
   * decline</a> if they provide one.
   */
  @SerializedName("decline_code")
  String declineCode;

  /**
   * A URL to more information about the <a href="https://stripe.com/docs/error-codes">error
   * code</a> reported.
   */
  @SerializedName("doc_url")
  String docUrl;

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

  @SerializedName("payment_intent")
  PaymentIntent paymentIntent;

  @SerializedName("payment_method")
  PaymentMethod paymentMethod;

  @SerializedName("setup_intent")
  SetupIntent setupIntent;

  @SerializedName("source")
  PaymentSource source;

  /**
   * The type of error returned. One of {@code api_connection_error}, {@code api_error}, {@code
   * authentication_error}, {@code card_error}, {@code idempotency_error}, {@code
   * invalid_request_error}, or {@code rate_limit_error}
   */
  @SerializedName("type")
  String type;
}
