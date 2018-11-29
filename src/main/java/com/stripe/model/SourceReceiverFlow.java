package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceReceiverFlow extends StripeObject {
  /**
   * The address of the receiver source. This is the value that should be communicated to the
   * customer to send their funds to.
   */
  String address;

  /**
   * The total amount that was charged by you. The amount charged is expressed in the source's
   * currency.
   */
  Long amountCharged;

  /**
   * The total amount received by the receiver source. `amount_received = amount_returned +
   * amount_charged` is true at all time. The amount received is expressed in the source's currency.
   */
  Long amountReceived;

  /**
   * The total amount that was returned to the customer. The amount returned is expressed in the
   * source's currency.
   */
  Long amountReturned;
}
