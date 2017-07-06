package com.stripe.model;

public class AccountPayoutSchedule extends StripeObject {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		AccountPayoutSchedule schedule = (AccountPayoutSchedule) o;
		return equals(delayDays, schedule.delayDays) &&
				equals(interval, schedule.interval) &&
				equals(monthlyAnchor, schedule.monthlyAnchor) &&
				equals(weeklyAnchor, schedule.weeklyAnchor);
	}
}
