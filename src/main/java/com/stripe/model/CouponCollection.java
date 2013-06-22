package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class CouponCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Coupon> data;
	Integer count;
	
	public List<Coupon> getData() {
		return data;
	}
	public void setData(List<Coupon> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	} 
}