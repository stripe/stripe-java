package com.stripe.model;

import java.util.List;

public class EventCollection extends StripeObject {
	List<Event> data;
	Integer count;
	
	public List<Event> getData() {
		return data;
	}
	public void setData(List<Event> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	} 
}