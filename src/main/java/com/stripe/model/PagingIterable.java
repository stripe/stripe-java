package com.stripe.model;

import java.util.Iterator;

/**
 * Provides an <code>{@code Iterable<T>}</code> target that automatically iterates across all API
 * pages and which is suitable for use with a <code>{@code foreach}</code> loop.
 */
public class PagingIterable<T extends HasId> implements Iterable<T> {
  private StripeCollectionInterface<T> page;

  PagingIterable(final StripeCollectionInterface<T> page) {
    this.page = page;
  }

  @Override
  public Iterator<T> iterator() {
    return new PagingIterator<>(page);
  }
}
