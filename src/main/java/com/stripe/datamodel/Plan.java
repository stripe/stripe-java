package com.stripe.datamodel;

public class Plan {
	protected String id;
	protected long amount;
	protected String currency;
	protected String interval;
	protected int trial_period_days;
	protected String identifier;

	public Plan() {
	}

	public Plan(String id, long amount, String currency, String interval,
			int trial_period_days, String identifier) {
		super();
		this.id = id;
		this.amount = amount;
		this.currency = currency;
		this.interval = interval;
		this.trial_period_days = trial_period_days;
		this.identifier = identifier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public int getTrial_period_days() {
		return trial_period_days;
	}

	public void setTrial_period_days(int trial_period_days) {
		this.trial_period_days = trial_period_days;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
