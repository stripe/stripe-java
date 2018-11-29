package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ShippingMethod extends StripeObject implements HasId {
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the total amount for the line item.
   */
  Long amount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /**
   * The estimated delivery date for the given shipping method. Can be either a specific date or a
   * range.
   */
  DeliveryEstimate deliveryEstimate;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;
}
