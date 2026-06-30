// File copied from our code generator; changes here will be overwritten.
package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - hack because we can't format java files whose imports aren't a single contiguous block
// - so _any_ imports in this file have to come from codegen
// - as do these comments, explaining the whole thing
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// event-notification-class-imports: The end of the section generated from our OpenAPI spec

public class StripeEventNotificationHandler {
  /**
   * Functional interface for callback functions. It describes the signature of the functions you'll
   * register on the StripeEventRouter to process incoming event notifications.
   */
  @FunctionalInterface
  public interface Callback<T extends EventNotification> {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(T event, StripeClient client);
  }

  /**
   * Functional interface for handling otherwise unhandled events. It's similar to {@link Callback},
   * but includes additional information about the unhandled event to help debug it.
   */
  @FunctionalInterface
  public interface FallbackCallback {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(
        EventNotification event, StripeClient client, UnhandledNotificationDetails details);
  }

  /**
   * Information about an unhandled event notification to make it easier to respond (and potentially
   * update your integration).
   */
  public static class UnhandledNotificationDetails {
    private boolean isKnownEventType;

    private UnhandledNotificationDetails(boolean isKnownEventType) {
      this.isKnownEventType = isKnownEventType;
    }

    /**
     * If true, the unhandled event's type is known to the SDK (i.e., it was successfully
     * deserialized into a specific `EventNotification` subclass).
     */
    public boolean isKnownEventType() {
      return isKnownEventType;
    }
  }

  // this is intentionally naiive to avoid the performance cost of interacting with `volatile`. We
  // expect that registrations are done synchronously at startup time and handling will happen
  // async, so thread-safe reads aren't important here.
  private boolean hasHandledEvent = false;

  private final String webhookSecret;
  private final StripeClient client;
  private final FallbackCallback fallbackCallback;
  private final HashMap<String, Callback<? extends EventNotification>> registeredHandlers =
      new HashMap<>();

  public StripeEventNotificationHandler(
      String webhookSecret, StripeClient client, FallbackCallback fallbackCallback) {
    this.webhookSecret = webhookSecret;
    this.client = client;
    this.fallbackCallback = fallbackCallback;
  }

  @SuppressWarnings("unused")
  private <T extends EventNotification> StripeEventNotificationHandler register(
      String eventType, Callback<T> handler) {
    if (hasHandledEvent) {
      throw new IllegalStateException("Cannot register handlers after handling an event");
    }

    if (this.registeredHandlers.containsKey(eventType)) {
      throw new IllegalArgumentException("Handler already registered for event type: " + eventType);
    }
    this.registeredHandlers.put(eventType, handler);
    return this;
  }

  /**
   * Handle an incoming webhook event notification.
   *
   * @param webhookBody the incoming webhook body
   * @param sigHeader the incoming webhook signature header
   * @throws SignatureVerificationException if the validation of the webhook signature fails
   * @throws IllegalArgumentException if no handler is registered for the event type
   */
  @SuppressWarnings("unchecked")
  public void handle(String webhookBody, String sigHeader) throws SignatureVerificationException {
    // setting this naiively isn't technically thread-safe, but we expect the all callbacks to be
    // registered syncronously on startup, so this should be fine
    hasHandledEvent = true;

    EventNotification eventNotification =
        this.client.parseEventNotification(webhookBody, sigHeader, this.webhookSecret);

    Callback<? extends EventNotification> handler =
        registeredHandlers.get(eventNotification.getType());

    // Create a new client with the event's context for thread-safe processing
    StripeClient eventClient = this.client.withStripeContext(eventNotification.context);

    if (handler == null) {
      boolean isKnownEventType =
          !(eventNotification instanceof com.stripe.events.UnknownEventNotification);
      UnhandledNotificationDetails details = new UnhandledNotificationDetails(isKnownEventType);

      this.fallbackCallback.process(eventNotification, eventClient, details);
    } else {
      // this is technically unsafe but we control the registration API so should be ok
      ((Callback<EventNotification>) handler).process(eventNotification, eventClient);
    }
  }

  // notification-handler-methods: The beginning of the section generated from our OpenAPI spec
  // notification-handler-methods: The end of the section generated from our OpenAPI spec

  /**
   * Get a sorted list of all registered event types.
   *
   * @return A sorted list of event type strings
   */
  public List<String> getRegisteredEventTypes() {
    List<String> eventTypes = new ArrayList<>(this.registeredHandlers.keySet());
    Collections.sort(eventTypes);
    return eventTypes;
  }
}
