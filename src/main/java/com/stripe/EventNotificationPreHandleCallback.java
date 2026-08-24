package com.stripe;

import com.stripe.model.v2.core.EventNotification;

/** Functional interface for a hook that runs before any event-specific callback. */
@FunctionalInterface
public interface EventNotificationPreHandleCallback {
  // this is an internal-facing method name that dictates how we call the stored method
  boolean process(EventNotification event, StripeClient client);
}
