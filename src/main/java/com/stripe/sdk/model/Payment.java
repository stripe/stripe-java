package com.stripe.sdk.model;

public class Payment {
	protected long time;
	protected Card card;
	protected boolean success;

	public Payment() {
	}

	public Payment(long time, Card card, boolean success) {
		super();
		this.time = time;
		this.card = card;
		this.success = success;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
