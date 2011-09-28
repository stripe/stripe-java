package com.stripe.model;

public class InvoiceItemResult {
	private InvoiceItem[] data;

	public InvoiceItem[] getData() {
		return data;
	}

	public void setData(InvoiceItem[] data) {
		this.data = data;
	}
}
