package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransferSchedule extends StripeObject {
  /** The number of days charges for the account will be held before being paid out. */
  Long delayDays;

  /**
   * How frequently funds will be paid out. One of `manual` (transfers only created via API call),
   * `daily`, `weekly`, or `monthly`.
   */
  String interval;

  /**
   * The day of the month funds will be paid out. Only shown if `interval` is monthly. Payouts
   * scheduled between 29-31st of the month are sent on the last day of shorter months.
   */
  Long monthlyAnchor;

  /**
   * The day of the week funds will be paid out, of the style 'monday', 'tuesday', etc. Only shown
   * if `interval` is weekly.
   */
  String weeklyAnchor;
}
