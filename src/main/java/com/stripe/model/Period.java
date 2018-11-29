package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Period extends StripeObject {
  /**
   * The end date of this usage period. All usage up to and including this point in time is
   * included.
   */
  Long end;

  /** The start date of this usage period. All usage after this point in time is included. */
  Long start;
}
