package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceLineItemPeriod extends StripeObject {
  /** End of the line item's billing period. */
  Long end;

  /** Start of the line item's billing period. */
  Long start;
}
