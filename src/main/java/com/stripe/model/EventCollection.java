package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class EventCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

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