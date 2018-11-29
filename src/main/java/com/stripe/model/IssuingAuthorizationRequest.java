package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingAuthorizationRequest extends StripeObject {
  /** Whether this request was approved. */
  Boolean approved;

  /** The amount that was authorized at the time of this request. */
  Long authorizedAmount;

  /**
   * The currency that was presented to the cardholder for the authorization. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  String authorizedCurrency;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * The amount Stripe held from your account to fund the authorization, if the request was
   * approved.
   */
  Long heldAmount;

  /** The currency of the [held amount](/docs/api#issuing_authorization_object-held_amount). */
  String heldCurrency;

  /**
   * One of `authorization_controls`, `card_active`, `card_inactive`, `insufficient_funds`,
   * `account_compliance_disabled`, `account_inactive`, `suspected_fraud`, `webhook_approved`,
   * `webhook_declined`, or `webhook_timeout`.
   */
  String reason;
}
