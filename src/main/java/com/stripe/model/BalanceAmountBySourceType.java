package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceAmountBySourceType extends StripeObject {
  /** Amount for bank account. */
  Long bankAccount;

  /** Amount for card. */
  Long card;
}
