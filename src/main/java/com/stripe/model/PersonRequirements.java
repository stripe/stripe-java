package com.stripe.model;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PersonRequirements extends StripeObject {
  /**
   * Fields that need to be collected to keep the person's account enabled. If not collected by the
   * account's `current_deadline`, these fields are moved to `past_due` and the account is disabled.
   */
  List<String> currentlyDue;

  /**
   * Fields that need to be collected assuming all volume thresholds are reached. As fields are
   * needed, they are moved to `currently_due` and the account's `current_deadline` is set.
   */
  List<String> eventuallyDue;

  /**
   * Fields that weren't collected by the account's `current_deadline`. These fields need to be
   * collected to enable payouts for the person's account.
   */
  List<String> pastDue;
}
