package com.stripe.model;

import com.stripe.net.StripeResponseGetter;
import java.lang.reflect.Type;
import java.util.Iterator;

/**
 * Provides an <code>{@code Iterable<T>}</code> target that automatically iterates across all API
 * pages and which is suitable for use with a <code>{@code foreach}</code> loop.
 */
public class PagingIterable<T extends HasId> implements Iterable<T> {
  private final StripeCollectionInterface<T> page;
  private final StripeResponseGetter responseGetter;
  private final Type pageType;

  PagingIterable(
      final StripeCollectionInterface<T> page, StripeResponseGetter responseGetter, Type pageType) {

    this.page = page;
    this.responseGetter = responseGetter;
    this.pageType = pageType;
  }

  @Override
  public Iterator<T> iterator() {
    return new PagingIterator<>(page, responseGetter, pageType);
  }
}
