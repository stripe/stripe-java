package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class InvoiceCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Invoice> data;
	Integer count;
	
	public List<Invoice> getData() {
		return data;
	}
	public void setData(List<Invoice> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}
