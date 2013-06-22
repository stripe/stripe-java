package com.stripe.model;

import java.io.Serializable;
import java.util.List;

public class TransferTransactionCollection extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

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
