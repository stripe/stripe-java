package com.stripe.model;

/**
 * Please note, StripeSearchResultInterface is beta functionality and is subject to change or
 * removal at any time.
 */
public interface StripeSearchResultInterface<T> extends StripeCollectionInterface<T> {
  String getNextPage();
}
