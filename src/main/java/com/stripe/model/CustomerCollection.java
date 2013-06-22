package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class CustomerCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Customer> data;
	Integer count;
	
	public List<Customer> getData() {
		return data;
	}
	public void setData(List<Customer> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}