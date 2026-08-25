package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - hack because we can't format java files whose imports aren't a single contiguous block
// - so _any_ imports in this file have to come from codegen
// - as do these comments, explaining the whole thing
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsFailedEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsProcessingEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsSucceededEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsSucceededWithErrorsEventNotification;
import com.stripe.events.V2CoreAccountClosedEventNotification;
import com.stripe.events.V2CoreAccountCreatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountLinkReturnedEventNotification;
import com.stripe.events.V2CoreAccountPersonCreatedEventNotification;
import com.stripe.events.V2CoreAccountPersonDeletedEventNotification;
import com.stripe.events.V2CoreAccountPersonUpdatedEventNotification;
import com.stripe.events.V2CoreAccountUpdatedEventNotification;
import com.stripe.events.V2CoreEventDestinationPingEventNotification;
import com.stripe.model.v2.core.EventNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// event-notification-class-imports: The end of the section generated from our OpenAPI spec

/**
 * Shared registration and dispatch machinery for {@link StripeEventNotificationHandler} and {@link
 * StripeEventNotificationHandlerWithoutVerification}.
 *
 * <p>Package-private, because it's an implementation detail: the user-facing types live at the top
 * level of this package instead ({@link EventNotificationCallback}, {@link
 * EventNotificationFallbackCallback}, {@link UnhandledNotificationDetails}).
 *
 * <p>The self type {@code T} lets the generated {@code on*} methods return the concrete handler
 * type. Returning this class instead would break fluent chaining for callers outside {@code
 * com.stripe}, who cannot access members of a type they can't see.
 */
abstract class StripeEventNotificationHandlerBase<T extends StripeEventNotificationHandlerBase<T>> {
  // this is intentionally naiive to avoid the performance cost of interacting with `volatile`. We
  // expect that registrations are done synchronously at startup time and handling will happen
  // async, so thread-safe reads aren't important here.
  boolean hasHandledEvent = false;

  final StripeClient client;
  private final EventNotificationFallbackCallback fallbackCallback;
  private EventNotificationPreHandleCallback preHandleCallback;
  private final HashMap<String, EventNotificationCallback<? extends EventNotification>>
      registeredHandlers = new HashMap<>();

  StripeEventNotificationHandlerBase(
      StripeClient client, EventNotificationFallbackCallback fallbackCallback) {
    this.client = client;
    this.fallbackCallback = fallbackCallback;
  }

  /**
   * Callbacks are expected to be registered once on startup, so registering anything after handling
   * has begun indicates a bug.
   */
  private void assertCanRegister() {
    if (hasHandledEvent) {
      throw new IllegalStateException(
          "Cannot register new callbacks after an event has been handled. This is indicative of a bug.");
    }
  }

  private <E extends EventNotification> void register(
      String eventType, EventNotificationCallback<E> handler) {
    assertCanRegister();

    if (this.registeredHandlers.containsKey(eventType)) {
      throw new IllegalArgumentException(
          "Callback for event type \"" + eventType + "\" is already registered");
    }
    this.registeredHandlers.put(eventType, handler);
  }

  /**
   * Registers a function that will be run before any event-specific callbacks. A useful place to
   * store event-agnostic logic, such as logging or checking for <a
   * href="https://docs.stripe.com/webhooks#handle-duplicate-events">duplicate event deliveries</a>.
   *
   * <p>Returning {@code true} causes handling to continue as normal; returning {@code false}
   * returns from {@code handle()} immediately, so neither the registered callback nor the fallback
   * callback are called.
   *
   * @param callback the hook to run before handling continues
   * @return this handler, for chaining
   */
  public T preHandle(EventNotificationPreHandleCallback callback) {
    assertCanRegister();

    if (this.preHandleCallback != null) {
      throw new IllegalArgumentException("A preHandle callback is already registered");
    }
    this.preHandleCallback = callback;
    return self();
  }

  /** Lets the generated {@code on*} methods return the concrete handler type for chaining. */
  @SuppressWarnings("unchecked")
  final T self() {
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  void dispatch(EventNotification eventNotification) {
    EventNotificationCallback<? extends EventNotification> handler =
        registeredHandlers.get(eventNotification.getType());

    // Create a new client with the event's context for thread-safe processing
    StripeClient eventClient = this.client.withStripeContext(eventNotification.context);

    if (this.preHandleCallback != null
        && !this.preHandleCallback.process(eventNotification, eventClient)) {
      return;
    }

    if (handler == null) {
      boolean isKnownEventType =
          !(eventNotification instanceof com.stripe.events.UnknownEventNotification);
      UnhandledNotificationDetails details = new UnhandledNotificationDetails(isKnownEventType);

      this.fallbackCallback.process(eventNotification, eventClient, details);
    } else {
      // this is technically unsafe but we control the registration API so should be ok
      ((EventNotificationCallback<EventNotification>) handler)
          .process(eventNotification, eventClient);
    }
  }

  // notification-handler-methods: The beginning of the section generated from our OpenAPI spec
  public T onV1BillingMeterErrorReportTriggered(
      EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> callback) {
    this.register("v1.billing.meter.error_report_triggered", callback);
    return self();
  }

  public T onV1BillingMeterNoMeterFound(
      EventNotificationCallback<V1BillingMeterNoMeterFoundEventNotification> callback) {
    this.register("v1.billing.meter.no_meter_found", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsFailed(
      EventNotificationCallback<V2CommerceProductCatalogImportsFailedEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.failed", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsProcessing(
      EventNotificationCallback<V2CommerceProductCatalogImportsProcessingEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.processing", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsSucceeded(
      EventNotificationCallback<V2CommerceProductCatalogImportsSucceededEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsSucceededWithErrors(
      EventNotificationCallback<V2CommerceProductCatalogImportsSucceededWithErrorsEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded_with_errors", callback);
    return self();
  }

  public T onV2CoreAccountClosed(
      EventNotificationCallback<V2CoreAccountClosedEventNotification> callback) {
    this.register("v2.core.account.closed", callback);
    return self();
  }

  public T onV2CoreAccountCreated(
      EventNotificationCallback<V2CoreAccountCreatedEventNotification> callback) {
    this.register("v2.core.account.created", callback);
    return self();
  }

  public T onV2CoreAccountUpdated(
      EventNotificationCallback<V2CoreAccountUpdatedEventNotification> callback) {
    this.register("v2.core.account.updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.customer].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCustomerUpdated(
      EventNotificationCallback<V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.customer].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.merchant].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMerchantUpdated(
      EventNotificationCallback<V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.merchant].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.recipient].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationRecipientUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.recipient].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingDefaultsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingDefaultsUpdatedEventNotification> callback) {
    this.register("v2.core.account[defaults].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingFutureRequirementsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[future_requirements].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingIdentityUpdated(
      EventNotificationCallback<V2CoreAccountIncludingIdentityUpdatedEventNotification> callback) {
    this.register("v2.core.account[identity].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingRequirementsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingRequirementsUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[requirements].updated", callback);
    return self();
  }

  public T onV2CoreAccountLinkReturned(
      EventNotificationCallback<V2CoreAccountLinkReturnedEventNotification> callback) {
    this.register("v2.core.account_link.returned", callback);
    return self();
  }

  public T onV2CoreAccountPersonCreated(
      EventNotificationCallback<V2CoreAccountPersonCreatedEventNotification> callback) {
    this.register("v2.core.account_person.created", callback);
    return self();
  }

  public T onV2CoreAccountPersonDeleted(
      EventNotificationCallback<V2CoreAccountPersonDeletedEventNotification> callback) {
    this.register("v2.core.account_person.deleted", callback);
    return self();
  }

  public T onV2CoreAccountPersonUpdated(
      EventNotificationCallback<V2CoreAccountPersonUpdatedEventNotification> callback) {
    this.register("v2.core.account_person.updated", callback);
    return self();
  }

  public T onV2CoreEventDestinationPing(
      EventNotificationCallback<V2CoreEventDestinationPingEventNotification> callback) {
    this.register("v2.core.event_destination.ping", callback);
    return self();
  }
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
