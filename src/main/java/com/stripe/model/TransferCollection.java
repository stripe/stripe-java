package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class TransferCollection extends StripeObject implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
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
