package com.stripe.model;

import java.util.List;


public class ChargeCollection extends StripeObject {
	List<Charge> data;
	Integer count;
	
	public List<Charge> getData() {
		return data;
	}
	public void setData(List<Charge> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}