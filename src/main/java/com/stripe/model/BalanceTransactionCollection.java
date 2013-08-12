package com.stripe.model;

import java.util.List;

public class BalanceTransactionCollection {
	List<BalanceTransaction> data;
	Integer count;

	public List<BalanceTransaction> getData() {
		return data;
	}
	public void setData(List<BalanceTransaction> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
