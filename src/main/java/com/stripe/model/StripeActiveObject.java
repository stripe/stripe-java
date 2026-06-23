package com.stripe.model;

import com.stripe.net.StripeResponseGetter;

/**
 * Represents a {@code StripeObject} that has properties or method that can make HTTP requests.
 * Examples: - list that can retrieve next page - event that can fetch associated object
 */
public interface StripeActiveObject {
  /**
   * Method is used by the containing object or {@code StripeResponseGetter} implementations to set
   * the {@code StripeResponseGetter} instance used to make further requests.
   *
   * @param responseGetter the {@code StripeResponseGetter} instance to use for making further
   *     requests.
   */
  void setResponseGetter(StripeResponseGetter responseGetter);

  /**
   * Calls {@code setResponseGetter} on the {@code object} if it's supported.
   *
   * @param object the object to set the {@code StripeResponseGetter} for.
   * @param responseGetter the {@code StripeResponseGetter} instance to use for making further
   *     requests.
   */
  default void trySetResponseGetter(Object object, StripeResponseGetter responseGetter) {
    if (object instanceof StripeActiveObject) {
      ((StripeActiveObject) object).setResponseGetter(responseGetter);
    }
  }
}
