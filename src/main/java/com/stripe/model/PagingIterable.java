package com.stripe.model;

import java.util.Iterator;
import java.util.Map;

import com.stripe.net.RequestOptions;

/**
 * Provides an <code>{@code Iterable<T>}</code> target that automatically
 * iterates across all API pages and which is suitable for use with a
 * <code>{@code foreach}</code> loop.
 */
public class PagingIterable<T extends HasId> implements Iterable<T> {
	private int maxFetches;
	private StripeCollectionInterface<T> page;

	PagingIterable(final StripeCollectionInterface<T> page) {
		this(page, -1);
	}

	PagingIterable(final StripeCollectionInterface<T> page, int maxFetches) {
		this.maxFetches = maxFetches;
		this.page = page;
	}

	public Iterator<T> iterator() {
		PagingIterator<T> iterator = new PagingIterator<T>(page);
		if (maxFetches != -1) {
			iterator.setMaxFetches(maxFetches);
		}
		return iterator;
	}
}
