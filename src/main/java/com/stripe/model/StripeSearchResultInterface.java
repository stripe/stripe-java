package com.stripe.model;

public interface StripeSearchResultInterface<T> extends StripeCollectionInterface<T> {
  String getNextPage();
}
