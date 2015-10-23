package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class StripeCollectionAPIResource<T extends HasId> extends APIResource implements StripeCollectionInterface<T> {
	List<T> data;
	Integer totalCount;
	Boolean hasMore;
	private RequestOptions requestOptions;
	private Map<String, Object> requestParams;
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

	@Deprecated
	public String getUrl() {
		return getURL();
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

	/**
	 * Returns an iterable that can be used to iterate across all objects
	 * across all pages. As page boundaries are encountered, the next page will
	 * be fetch automatically for continued iteration.
	 */
	public Iterable<T> autoPagingIterable() {
		return new PagingIterable<T>(this);
	}

	public RequestOptions getRequestOptions() {
		return this.requestOptions;
	}

	public Map<String, Object> getRequestParams() {
		return this.requestParams;
	}

	public void setRequestOptions(RequestOptions requestOptions) {
		this.requestOptions = requestOptions;
	}

	public void setRequestParams(Map<String, Object> requestParams) {
		this.requestParams = requestParams;
	}
}
