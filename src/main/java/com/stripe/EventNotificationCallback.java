// File copied from our code generator; changes here will be overwritten.
package com.stripe;

import com.stripe.model.v2.core.EventNotification;

/**
 * Functional interface for callback functions. It describes the signature of the functions you'll
 * register on a {@link StripeEventNotificationHandler} to process incoming event notifications.
 */
@FunctionalInterface
public interface EventNotificationCallback<E extends EventNotification> {
  // this is an internal-facing method name that dictates how we call the stored method
  void process(E event, StripeClient client);
}
