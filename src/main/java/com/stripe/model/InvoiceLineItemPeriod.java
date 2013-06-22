package com.stripe.model;

import java.io.Serializable;

public class InvoiceLineItemPeriod extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

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
