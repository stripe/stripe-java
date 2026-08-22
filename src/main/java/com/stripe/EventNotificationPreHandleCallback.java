package com.stripe;

import com.stripe.model.v2.core.EventNotification;

/**
 * Functional interface for a hook that runs after {@code handle()} parses the payload but before
 * any {@link EventNotificationCallback} or {@link EventNotificationFallbackCallback} fires.
 * Returning {@code false} stops handling for that event entirely: neither the registered callback
 * nor the fallback will run.
 */
@FunctionalInterface
public interface EventNotificationPreHandleCallback {
  // this is an internal-facing method name that dictates how we call the stored method
  boolean process(EventNotification event, StripeClient client);
}
