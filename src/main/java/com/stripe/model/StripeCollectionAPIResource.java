package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class StripeCollectionAPIResource<T extends HasId> extends APIResource implements StripeCollectionInterface<T> {
	List<T> data;
	Boolean hasMore;
	Integer totalCount;
	String url;

	/** 3/2014: Legacy (from before newstyle pagination API) */
	Integer count;

	private RequestOptions requestOptions;
	private Map<String, Object> requestParams;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getURL() {
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

	/**
	 * Returns an iterable that can be used to iterate across all objects
	 * across all pages. As page boundaries are encountered, the next page will
	 * be fetched automatically for continued iteration.
	 */
	public Iterable<T> autoPagingIterable() {
		return autoPagingIterable(null, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params) {
		return autoPagingIterable(params, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params, RequestOptions options) {
		// This does have the side effect of manipulating the state of the
		// given collection, which is an unfortunate side effect, but is quite
		// likely a good practical trade-off in that these should only be used
		// for auto pagination with that particular collection instance.
		this.setRequestOptions(options);
		this.setRequestParams(params);

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
