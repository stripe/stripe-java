package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransformUsage extends StripeObject {
  /** Divide usage by this number. */
  Long divideBy;

  /** After division, either round the result `up` or `down`. */
  String round;
}
