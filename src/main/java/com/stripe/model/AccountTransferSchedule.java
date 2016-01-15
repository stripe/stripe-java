package com.stripe.model;

public class AccountTransferSchedule extends StripeObject {
	Integer delayDays;
	String interval;
	Integer monthlyAnchor;
	String weeklyAnchor;

	public Integer getDelayDays() {
		return delayDays;
	}

	public void setDelayDays(Integer delayDays) {
		this.delayDays = delayDays;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public Integer getMonthlyAnchor() {
		return monthlyAnchor;
	}

	public void setMonthlyAnchor(Integer monthlyAnchor) {
		this.monthlyAnchor = monthlyAnchor;
	}

	public String getWeeklyAnchor() {
		return weeklyAnchor;
	}

	public void setWeeklyAnchor(String weeklyAnchor) {
		this.weeklyAnchor = weeklyAnchor;
	}
}
