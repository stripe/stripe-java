package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Fee extends StripeObject {
  /** Amount of the fee, in cents. */
  Long amount;

  String application;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  /** Type of the fee, one of: `application_fee`, `stripe_fee` or `tax`. */
  String type;
}
