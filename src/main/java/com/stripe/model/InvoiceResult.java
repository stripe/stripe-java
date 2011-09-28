package com.stripe.model;

public class InvoiceResult {
	private Invoice[] data;

	public Invoice[] getData() {
		return data;
	}

	public void setData(Invoice[] data) {
		this.data = data;
	}
}