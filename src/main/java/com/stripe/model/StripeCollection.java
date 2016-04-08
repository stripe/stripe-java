package com.stripe.model;

import com.stripe.net.RequestOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Provides a representation of a single page worth of data from the Stripe
 * API.
 *
 * The following code will have the effect of iterating through a single page
 * worth of invoice data retrieve from the API:
 *
 * <pre>
 * {@code
 * foreach (Invoice invoice : Invoice.list(...).getData()) {
 *	 System.out.println("Current invoice = " + invoice.toString());
 * }
 * }
 * </pre>
 *
 * The class also provides a helper for iterating over collections that may be
 * longer than a single page:
 *
 * <pre>
 * {@code
 * foreach (Invoice invoice : Invoice.list(...).autoPagingIterable()) {
 *	 System.out.println("Current invoice = " + invoice.toString());
 * }
 * }
 * </pre>
 */
public abstract class StripeCollection<T extends HasId> extends StripeObject implements StripeCollectionInterface<T> {
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
