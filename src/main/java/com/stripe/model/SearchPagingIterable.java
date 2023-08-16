package com.stripe.model;

import com.stripe.net.StripeResponseGetter;
import java.util.Iterator;

/**
 * Provides an <code>{@code Iterable<T>}</code> target that automatically iterates across all API
 * pages and which is suitable for use with a <code>{@code foreach}</code> loop.
 */
public class SearchPagingIterable<T> implements Iterable<T> {
  private final StripeSearchResultInterface<T> page;
  private final StripeResponseGetter responseGetter;

  SearchPagingIterable(
      final StripeSearchResultInterface<T> page, StripeResponseGetter responseGetter) {
    this.page = page;
    this.responseGetter = responseGetter;
  }

  @Override
  public Iterator<T> iterator() {
    return new SearchPagingIterator<>(page, responseGetter);
  }
}
