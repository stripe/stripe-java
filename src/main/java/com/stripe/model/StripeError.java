package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeError extends StripeObject {
  /** For card errors, the ID of the failed charge. */
  String charge;

  /**
   * For some errors that could be handled programmatically, a short string indicating the [error
   * code](/docs/error-codes) reported.
   */
  String code;

  /**
   * For card errors resulting from a card issuer decline, a short string indicating the [card
   * issuer's reason for the decline](/docs/declines#issuer-declines) if they provide one.
   */
  String declineCode;

  /** A URL to more information about the [error code](/docs/error-codes) reported. */
  String docUrl;

  /**
   * A human-readable message providing more details about the error. For card errors, these
   * messages can be shown to your users.
   */
  String message;

  /**
   * If the error is parameter-specific, the parameter related to the error. For example, you can
   * use this to display a message near the correct form field.
   */
  String param;

  PaymentSource source;

  /**
   * The type of error returned. One of `api_connection_error`, `api_error`, `authentication_error`,
   * `card_error`, `idempotency_error`, `invalid_request_error`, or `rate_limit_error`
   */
  String type;
}
