package com.stripe.model;

public final class SourceVerificationFlow extends StripeObject {
	Integer attemptsRemaining;
	String status;

	public Integer getAttemptsRemaining() {
		return attemptsRemaining;
	}

	public void setAttemptsRemaining(Integer attemptsRemaining) {
		this.attemptsRemaining = attemptsRemaining;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
