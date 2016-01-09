package com.stripe.model;

public class AccountTosAcceptance extends StripeObject {
	Long date;
	String ip;
	String userAgent;

	public Long getDate() {
		return this.date;
	}

	public String getIp() {
		return this.ip;
	}

	public String getUserAgent() {
		return this.userAgent;
	}
}
