package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class RecipientCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Recipient> data;
	Integer count;
	
	public List<Recipient> getData() {
		return data;
	}
	public void setData(List<Recipient> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
