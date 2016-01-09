package com.stripe.model;

public class AccountTransferSchedule extends StripeObject {
	Integer delayDays;
	String interval;
	Integer monthlyAnchor;
	String weeklyAnchor;

	public Integer getDelayDays() {
		return this.delayDays;
	}

	public String getInterval() {
		return this.interval;
	}

	public Integer getMonthlyAnchor() {
		return this.monthlyAnchor;
	}

	public String getWeeklyAnchor() {
		return this.weeklyAnchor;
	}
}
