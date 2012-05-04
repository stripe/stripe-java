package com.stripe.model;

import java.util.List;


public class TransferCollection extends StripeObject {
	List<Transfer> data;
	Integer count;

	public List<Transfer> getData() {
		return data;
	}
	public void setData(List<Transfer> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
