package com.stripe;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import java.util.HashMap;

public class StripeEventHandler {
  /** Functional interface for event handlers that can throw StripeException. */
  @FunctionalInterface
  public interface EventHandler<T extends EventNotification> {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(T event, StripeClient client);
  }

  private final String webhookSecret;
  private final StripeClient stripeClient;
  private final HashMap<String, EventHandler<? extends EventNotification>> registeredHandlers =
      new HashMap<>();

  public StripeEventHandler(String webhookSecret, StripeClient stripeClient) {
    this.webhookSecret = webhookSecret;
    this.stripeClient = stripeClient;
  }

  public <T extends EventNotification> StripeEventHandler register(
      Class<T> eventClass, EventHandler<T> handler) {
    this.registeredHandlers.put(eventClass.getName(), handler);
    return this;
  }

  /**
   * Handle an incoming webhook event notification.
   *
   * @param webhookBody the incoming webhook body
   * @param sigHeader the incoming webhook signature header
   * @throws SignatureVerificationException if the validation of the webhook signature fails
   * @throws IllegalArgumentException if no handler is registered for the event type
   * @throws Exception any other exception that the registered handler might throw
   */
  @SuppressWarnings("unchecked")
  public void handle(String webhookBody, String sigHeader) throws SignatureVerificationException {
    EventNotification eventNotification =
        this.stripeClient.parseEventNotification(webhookBody, sigHeader, this.webhookSecret);

    EventHandler<? extends EventNotification> handler =
        // I don't _love_ getName as a matcher but lets us bucket all the unknown events in a way
        // that checking .type doesn't.
        registeredHandlers.get(eventNotification.getClass().getName());

    if (handler == null) {
      throw new IllegalArgumentException(
          "No handler registered for event type: " + eventNotification.getType());
    }

    // TODO: re-bind client context
    // this is technically unsafe but we control the registration API so should be ok
    ((EventHandler<EventNotification>) handler).process(eventNotification, this.stripeClient);
  }
}
