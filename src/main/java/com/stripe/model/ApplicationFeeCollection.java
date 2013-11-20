package com.stripe.model;

import java.util.List;

public class ApplicationFeeCollection extends StripeObject {
	List<ApplicationFee> data;
	Integer count;
	
	public List<ApplicationFee> getData() {
		return data;
	}
	public void setData(List<ApplicationFee> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
