package com.stripe.model;

public interface NestedBuilder<T> {

  T getParent();

  default T done() {
    return getParent();
  }
}
