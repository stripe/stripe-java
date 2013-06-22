package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class InvoiceItemCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

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