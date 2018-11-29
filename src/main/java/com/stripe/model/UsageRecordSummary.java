package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsageRecordSummary extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The invoice in which this usage period has been billed for. */
  String invoice;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  Period period;

  /** The ID of the subscription item this summary is describing. */
  String subscriptionItem;

  /** The total usage within this usage period. */
  Long totalUsage;
}
