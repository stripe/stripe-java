package com.stripe.model;

import java.util.Map;

import com.stripe.net.RequestOptions;

/**
 * Provides a simple object that allows the contents of a list call to be
 * iterated lazily so that extra params and options can be applied to future
 * pagination calls in the case where that's necessary.
 */
public class PagingProxy<T extends HasId> {
	private StripeCollectionInterface<T> page;

	PagingProxy(final StripeCollectionInterface<T> page) {
		this.page = page;
	}

	public Iterable<T> autoPagingIterable() {
		return autoPagingIterable(null, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params) {
		return autoPagingIterable(params, null);
	}

	public Iterable<T> autoPagingIterable(Map<String, Object> params, RequestOptions options) {
		// This does have the side effect of manipulating the state of the
		// given collection, but is quite likely a good practical trade-off in
		// that these should only be used for auto pagination with that
		// particular collection instance.
		this.page.setRequestOptions(options);
		this.page.setRequestParams(params);

		return new PagingIterable<T>(page);
	}

	/**
	 * Gets an <code>{@code Iterable<T>}</code> for only the current page's
	 * worth of data. No more pages will be fetched.
	 */
	public Iterable<T> singlePageIterable() {
		return this.page.getData();
	}
}
