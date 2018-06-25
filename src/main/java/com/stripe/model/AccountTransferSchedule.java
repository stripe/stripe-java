package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountTransferSchedule extends StripeObject {
  Long delayDays;
  String interval;
  Long monthlyAnchor;
  String weeklyAnchor;
}
