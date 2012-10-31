package com.stripe.model;

public class InvoiceLineItemPeriod extends StripeObject {
	Long start;
	Long end;
	
	public Long getStart() {
		return start;
	}
	public void setStart(Long start) {
		this.start = start;
	}
	public Long getEnd() {
		return end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}
}
