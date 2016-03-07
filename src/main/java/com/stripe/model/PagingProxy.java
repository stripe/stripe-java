package com.stripe.model;

import java.util.Map;

import com.stripe.net.RequestOptions;

/**
/* Provides a simple object that allows the contents of a list call to be
/* iterated lazily so that extra params and options can be applied to future
/* pagination calls in the case where that's necessary.
 */
public class PagingProxy<T extends HasId> {
	private boolean isEmptyPage;
	private StripeCollectionInterface<T> page;

	// The default invocation is with an empty page which is used to seed the
	// PagingIterable.
	PagingProxy(final StripeCollectionInterface<T> page) {
		this(page, true);
	}

	PagingProxy(final StripeCollectionInterface<T> page, boolean isEmptyPage) {
		this.isEmptyPage = isEmptyPage;
		this.page = page;
	}

	public Iterable<T> autoPagingIterable() {
		return autoPagingIterable(null, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params) {
		return autoPagingIterable(params, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params, RequestOptions options) {
		setParamsAndOptions(params, options);
		return new PagingIterable<T>(page);
	}

	public Iterable<T> singlePageIterable() {
		return singlePageIterable(null, null);
	}

	public Iterable<T> singlePageIterable(Map<String, Object> params) {
		return singlePageIterable(params, null);
	}

	/**
	 * Gets an <code>{@code Iterable<T>}</code> for only the current page's
	 * worth of data. No more pages will be fetched.
	 */
	public Iterable<T> singlePageIterable(Map<String, Object> params, RequestOptions options) {
		setParamsAndOptions(params, options);

		// If we were given an empty page on initialization then we have not
		// yet made any API call. Use the page to seed the PagingIterable, and
		// then tell it that we only want a single page back.
		//
		// Otherwise, simply return the page (which contains results from an
		// API call) that was used to initialize this instance.
		if (this.isEmptyPage) {
			return new PagingIterable<T>(page, 1);
		} else {
			return this.page.getData();
		}
	}

	public void setParamsAndOptions(Map<String, Object> params, RequestOptions options) {
		// This does have the side effect of manipulating the state of the
		// given collection, but is quite likely a good practical trade-off in
		// that these should only be used for auto pagination with that
		// particular collection instance.
		this.page.setRequestOptions(options);
		this.page.setRequestParams(params);
	}
}
