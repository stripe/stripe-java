package com.stripe;

/**
 * Information about an unhandled event notification to make it easier to respond (and potentially
 * update your integration).
 */
public class UnhandledNotificationDetails {
  private boolean isKnownEventType;

  // package-private: instances are created by the SDK while dispatching an event
  UnhandledNotificationDetails(boolean isKnownEventType) {
    this.isKnownEventType = isKnownEventType;
  }

  /**
   * If true, the unhandled event's type is known to the SDK (i.e., it was successfully deserialized
   * into a specific `EventNotification` subclass).
   */
  public boolean isKnownEventType() {
    return isKnownEventType;
  }
}
