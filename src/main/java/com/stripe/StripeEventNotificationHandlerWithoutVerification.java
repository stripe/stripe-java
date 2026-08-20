package com.stripe;

import com.stripe.model.v2.core.EventNotification;

/**
 * A variant of StripeEventNotificationHandler that parses events without verifying webhook
 * signatures. Intended for pre-authenticated channels like AWS EventBridge or Azure Event Grid.
 *
 * <p>Because this is a sibling of {@link StripeEventNotificationHandler} rather than a subclass, it
 * does not expose that class's two-argument {@code handle} at all — passing a signature header here
 * is a compile error rather than a runtime one.
 *
 * <p>Do not instantiate directly. Use {@link
 * StripeEventNotificationHandler#withoutVerification(StripeClient,
 * EventNotificationFallbackCallback)} or {@link
 * StripeClient#notificationHandlerWithoutVerification(EventNotificationFallbackCallback)} instead.
 */
public class StripeEventNotificationHandlerWithoutVerification
    extends StripeEventNotificationHandlerBase<StripeEventNotificationHandlerWithoutVerification> {
  StripeEventNotificationHandlerWithoutVerification(
      StripeClient client, EventNotificationFallbackCallback fallbackCallback) {
    super(client, fallbackCallback);
  }

  /**
   * Handle an incoming webhook event notification without signature verification.
   *
   * @param webhookBody the incoming webhook body
   */
  public void handle(String webhookBody) {
    hasHandledEvent = true;

    EventNotification eventNotification =
        this.client.parseEventNotificationWithoutVerification(webhookBody);

    dispatch(eventNotification);
  }
}
