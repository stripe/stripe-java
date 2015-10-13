package com.stripe.model;

import com.stripe.net.APIResource;

import java.util.Iterator;
import java.util.List;

public abstract class StripeCollectionAPIResource<T extends HasId> extends APIResource implements StripeCollectionInterface<T>, Iterable<T>  {
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
	public String getURL() {
		return url;
	}
	public String getUrl() {
		return url;
	}
	public void setURL(String url) {
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
	
	public Iterator<T> iterator() {
		return new StripeCollectionIterator<T>(this);
	}
}
