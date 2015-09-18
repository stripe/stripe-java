package com.stripe.model;

import java.util.Iterator;
import java.util.List;

public abstract class StripeCollection<T> extends StripeObject implements Iterable {
	List<T> data;
	Integer totalCount;
	Boolean hasMore;
	String url;
	/** 3/2014: Legacy (from before newstyle pagination API) */
	Integer count;

	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Boolean getHasMore() {
		return hasMore;
	}
	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	/** 3/2014: Legacy (from before newstyle pagination API) */
	public Integer getCount() {
		return count;
	}
	/** 3/2014: Legacy (from before newstyle pagination API) */
	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public Iterator iterator() {
		return this.data.iterator();
	}
}
