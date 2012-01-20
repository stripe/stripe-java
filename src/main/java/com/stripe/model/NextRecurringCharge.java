package com.stripe.model;

public class NextRecurringCharge extends StripeObject {
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