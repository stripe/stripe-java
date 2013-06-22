package com.stripe.model;

import java.io.Serializable;

public class NextRecurringCharge extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer amount;
	String date;
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
}