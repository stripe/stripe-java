package com.stripe.model;

public class Subscription {
	protected long current_period_end, current_period_start, trial_end,
			trial_start, start, canceled_at, ended_at;
	protected Plan plan;
	protected String customer;
	protected String status;
	protected Period period;

	public Subscription() {
	}

	public Subscription(long current_period_end, long current_period_start,
			long trial_end, long trial_start, long start, Plan plan,
			String customer, String status, Period period, long canceled_at, long ended_at) {
		super();
		this.current_period_end = current_period_end;
		this.current_period_start = current_period_start;
		this.trial_end = trial_end;
		this.trial_start = trial_start;
		this.start = start;
		this.plan = plan;
		this.customer = customer;
		this.status = status;
		this.period = period;
		this.canceled_at = canceled_at;
		this.ended_at = ended_at;
	}

	public long getCurrent_period_end() {
		return current_period_end;
	}

	public void setCurrent_period_end(long current_period_end) {
		this.current_period_end = current_period_end;
	}

	public long getCurrent_period_start() {
		return current_period_start;
	}

	public void setCurrent_period_start(long current_period_start) {
		this.current_period_start = current_period_start;
	}

	public long getTrial_end() {
		return trial_end;
	}

	public void setTrial_end(long trial_end) {
		this.trial_end = trial_end;
	}

	public long getTrial_start() {
		return trial_start;
	}

	public void setTrial_start(long trial_start) {
		this.trial_start = trial_start;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public long getCanceled_at() {
		return canceled_at;
	}

	public void setCanceled_at(long canceled_at) {
		this.canceled_at = canceled_at;
	}

	public long getEnded_at() {
		return ended_at;
	}

	public void setEnded_at(long ended_at) {
		this.ended_at = ended_at;
	}

}
