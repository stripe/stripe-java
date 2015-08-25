package com.stripe.model;

import java.util.List;

public interface StripeCollectionInterface<T> {
	public List<T> getData();
	public Integer getTotalCount();
	public Boolean getHasMore();
	public String getUrl();
}
