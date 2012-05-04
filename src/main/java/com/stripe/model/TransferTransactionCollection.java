package com.stripe.model;

import java.util.List;


public class TransferTransactionCollection extends StripeObject {
	List<TransferTransaction> data;
	Integer count;

	public List<TransferTransaction> getData() {
		return data;
	}
	public void setData(List<TransferTransaction> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
