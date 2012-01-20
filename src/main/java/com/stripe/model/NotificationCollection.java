package com.stripe.model;

import java.util.List;

public class NotificationCollection extends StripeObject {
	List<Notification> data;
	Integer count;
	
	public List<Notification> getData() {
		return data;
	}
	public void setData(List<Notification> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	} 
}