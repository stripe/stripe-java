package com.stripe;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;

/**
 * Verifies incoming webhook signatures before routing event notifications to the callbacks
 * registered on it. This is the handler you want unless events reach you through a channel that has
 * already authenticated them, in which case see {@link #withoutVerification(StripeClient,
 * EventNotificationFallbackCallback)}.
 */
public class StripeEventNotificationHandler
    extends StripeEventNotificationHandlerBase<StripeEventNotificationHandler> {
  private final String webhookSecret;

  public StripeEventNotificationHandler(
      String webhookSecret,
      StripeClient client,
      EventNotificationFallbackCallback fallbackCallback) {
    super(client, fallbackCallback);
    if (isBlankWebhookSecret(webhookSecret)) {
      throw new IllegalArgumentException("webhookSecret must be a non-empty string");
    }
    this.webhookSecret = webhookSecret;
  }

  private static boolean isBlankWebhookSecret(String secret) {
    if (secret == null || secret.isEmpty()) {
      return true;
    }

    for (int i = 0; i < secret.length(); i++) {
      char character = secret.charAt(i);
      if (character != ' '
          && character != '\t'
          && character != '\r'
          && character != '\n'
          && character != '\f'
          && character != '\u000B') {
        return false;
      }
    }
    return true;
  }

  /**
   * Creates a handler that processes events without webhook signature verification. Intended for
   * pre-authenticated channels like AWS EventBridge or Azure Event Grid.
   */
  public static StripeEventNotificationHandlerWithoutVerification withoutVerification(
      StripeClient client, EventNotificationFallbackCallback fallbackCallback) {
    return new StripeEventNotificationHandlerWithoutVerification(client, fallbackCallback);
  }

  /**
   * Handle an incoming webhook event notification.
   *
   * @param webhookBody the incoming webhook body
   * @param sigHeader the incoming webhook signature header
   * @throws SignatureVerificationException if the validation of the webhook signature fails
   * @throws IllegalArgumentException if no handler is registered for the event type
   */
  public void handle(String webhookBody, String sigHeader) throws SignatureVerificationException {
    // setting this naiively isn't technically thread-safe, but we expect the all callbacks to be
    // registered syncronously on startup, so this should be fine
    hasHandledEvent = true;

    EventNotification eventNotification =
        this.client.parseEventNotification(webhookBody, sigHeader, this.webhookSecret);

    dispatch(eventNotification);
  }
}
