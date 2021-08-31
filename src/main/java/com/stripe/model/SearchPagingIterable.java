package com.stripe.model;

import java.util.Iterator;

/**
 * Provides an <code>{@code Iterable<T>}</code> target that automatically iterates across all API
 * pages and which is suitable for use with a <code>{@code foreach}</code> loop.
 *
 * <p>Please note SearchPagingIterable is in beta and is subject to change or removal at any time.
 */
public class SearchPagingIterable<T> implements Iterable<T> {
  private StripeSearchResultInterface<T> page;

  SearchPagingIterable(final StripeSearchResultInterface<T> page) {
    this.page = page;
  }

  @Override
  public Iterator<T> iterator() {
    return new SearchPagingIterator<>(page);
  }
}
