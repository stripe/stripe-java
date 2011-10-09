package com.stripe.model;

import java.util.List;


public class InvoiceItemCollection extends StripeObject {
	List<InvoiceItem> data;
	Integer count;
	
	public List<InvoiceItem> getData() {
		return data;
	}
	public void setData(List<InvoiceItem> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}