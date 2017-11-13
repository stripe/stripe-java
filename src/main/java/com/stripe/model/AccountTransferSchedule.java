package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountTransferSchedule extends StripeObject {
	Integer delayDays;
	String interval;
	Integer monthlyAnchor;
	String weeklyAnchor;
}
