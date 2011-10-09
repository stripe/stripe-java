package com.stripe.model;

import java.util.List;


public class CustomerCollection extends StripeObject {
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