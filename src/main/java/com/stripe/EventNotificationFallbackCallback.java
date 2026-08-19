// File copied from our code generator; changes here will be overwritten.
package com.stripe;

import com.stripe.model.v2.core.EventNotification;

/**
 * Functional interface for handling otherwise unhandled events. It's similar to {@link
 * EventNotificationCallback}, but includes additional information about the unhandled event to help
 * debug it.
 */
@FunctionalInterface
public interface EventNotificationFallbackCallback {
  // this is an internal-facing method name that dictates how we call the stored method
  void process(EventNotification event, StripeClient client, UnhandledNotificationDetails details);
}
