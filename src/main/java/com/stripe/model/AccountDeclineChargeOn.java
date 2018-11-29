package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountDeclineChargeOn extends StripeObject {
  /**
   * Whether Stripe automatically declines charges with an incorrect ZIP or postal code. This
   * setting only applies when a ZIP or postal code is provided and they fail bank verification.
   */
  Boolean avsFailure;

  /**
   * Whether Stripe automatically declines charges with an incorrect CVC. This setting only applies
   * when a CVC is provided and it fails bank verification.
   */
  Boolean cvcFailure;
}
