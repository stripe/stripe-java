package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PlanTier extends StripeObject {
  /** Price for the entire tier. */
  Long flatAmount;

  /** Per unit price for units relevant to the tier. */
  Long unitAmount;

  /** Up to and including to this quantity will be contained in the tier. */
  Long upTo;
}
