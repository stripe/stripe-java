package com.stripe.model;

import java.util.List;


public class PlanCollection extends StripeObject {
	List<Plan> data;
	Integer count;
	
	public List<Plan> getData() {
		return data;
	}
	public void setData(List<Plan> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	} 
}