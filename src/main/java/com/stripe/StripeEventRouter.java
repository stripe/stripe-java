package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - dumb hack because we can't format java files whose imports aren't a single contiguous block
// - so _any_ imports in this file have to come from codegen
// - as do these comments, explaining the whole thing
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
import com.stripe.events.V2CoreAccountClosedEventNotification;
import com.stripe.events.V2CoreAccountCreatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountLinkReturnedEventNotification;
import com.stripe.events.V2CoreAccountPersonCreatedEventNotification;
import com.stripe.events.V2CoreAccountPersonDeletedEventNotification;
import com.stripe.events.V2CoreAccountPersonUpdatedEventNotification;
import com.stripe.events.V2CoreAccountUpdatedEventNotification;
import com.stripe.events.V2CoreEventDestinationPingEventNotification;
import com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEventNotification;
import com.stripe.events.V2MoneyManagementAdjustmentCreatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountCreatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAddressActivatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAddressFailedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferAvailableEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitFailedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitProcessingEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitQueuedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitReturnedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitSucceededEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutMethodUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditAvailableEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditReturnedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditSucceededEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitCanceledEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitPendingEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitSucceededEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementTransactionCreatedEventNotification;
import com.stripe.events.V2MoneyManagementTransactionUpdatedEventNotification;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import java.util.HashMap;

// event-notification-class-imports: The end of the section generated from our OpenAPI spec

public class StripeEventRouter {
  /**
   * Functional interface for event handlers. It describes the signature of the functions you'll
   * register on the StripeEventRouter to process incoming event notifications.
   */
  @FunctionalInterface
  public interface EventHandler<T extends EventNotification> {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(T event, StripeClient client);
  }

  /**
   * Functional interface for handling otherwise unhandled events. It's similar to {@link
   * EventHandler}, but includes additional information about the unhandled event to help debug it.
   */
  @FunctionalInterface
  public interface UnhandledEventHandler {
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

  private boolean hasHandledEvent = false;

  private final String webhookSecret;
  private final StripeClient client;
  private final UnhandledEventHandler onUnhandledHandler;
  private final HashMap<String, EventHandler<? extends EventNotification>> registeredHandlers =
      new HashMap<>();

  public StripeEventRouter(
      String webhookSecret, StripeClient client, UnhandledEventHandler onUnhandledHandler) {
    this.webhookSecret = webhookSecret;
    this.client = client;
    this.onUnhandledHandler = onUnhandledHandler;
  }

  private <T extends EventNotification> StripeEventRouter register(
      String eventType, EventHandler<T> handler) {
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

    EventHandler<? extends EventNotification> handler =
        registeredHandlers.get(eventNotification.getType());

    // Create a new client with the event's context for thread-safe processing
    StripeClient eventClient = this.client.withStripeContext(eventNotification.context);

    if (handler == null) {
      boolean isKnownEventType =
          !(eventNotification instanceof com.stripe.events.UnknownEventNotification);
      UnhandledNotificationDetails details = new UnhandledNotificationDetails(isKnownEventType);

      this.onUnhandledHandler.process(eventNotification, eventClient, details);
    } else {
      // this is technically unsafe but we control the registration API so should be ok
      ((EventHandler<EventNotification>) handler).process(eventNotification, eventClient);
    }
  }

  // event-router-methods: The beginning of the section generated from our OpenAPI spec
  public StripeEventRouter on_V1BillingMeterErrorReportTriggeredEventNotification(
      EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler) {
    this.register("v1.billing.meter.error_report_triggered", handler);
    return this;
  }

  public StripeEventRouter on_V1BillingMeterNoMeterFoundEventNotification(
      EventHandler<V1BillingMeterNoMeterFoundEventNotification> handler) {
    this.register("v1.billing.meter.no_meter_found", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountClosedEventNotification(
      EventHandler<V2CoreAccountClosedEventNotification> handler) {
    this.register("v2.core.account.closed", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountCreatedEventNotification(
      EventHandler<V2CoreAccountCreatedEventNotification> handler) {
    this.register("v2.core.account.created", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountUpdatedEventNotification(
      EventHandler<V2CoreAccountUpdatedEventNotification> handler) {
    this.register("v2.core.account.updated", handler);
    return this;
  }

  public StripeEventRouter
      on_V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification(
          EventHandler<
                  V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification>
              handler) {
    this.register("v2.core.account[configuration.customer].capability_status_updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification> handler) {
    this.register("v2.core.account[configuration.customer].updated", handler);
    return this;
  }

  public StripeEventRouter
      on_V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification(
          EventHandler<
                  V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification>
              handler) {
    this.register("v2.core.account[configuration.merchant].capability_status_updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification> handler) {
    this.register("v2.core.account[configuration.merchant].updated", handler);
    return this;
  }

  public StripeEventRouter
      on_V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification(
          EventHandler<
                  V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification>
              handler) {
    this.register("v2.core.account[configuration.recipient].capability_status_updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification> handler) {
    this.register("v2.core.account[configuration.recipient].updated", handler);
    return this;
  }

  public StripeEventRouter
      on_V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification(
          EventHandler<
                  V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification>
              handler) {
    this.register("v2.core.account[configuration.storer].capability_status_updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification> handler) {
    this.register("v2.core.account[configuration.storer].updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingDefaultsUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingDefaultsUpdatedEventNotification> handler) {
    this.register("v2.core.account[defaults].updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingIdentityUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingIdentityUpdatedEventNotification> handler) {
    this.register("v2.core.account[identity].updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountIncludingRequirementsUpdatedEventNotification(
      EventHandler<V2CoreAccountIncludingRequirementsUpdatedEventNotification> handler) {
    this.register("v2.core.account[requirements].updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountLinkReturnedEventNotification(
      EventHandler<V2CoreAccountLinkReturnedEventNotification> handler) {
    this.register("v2.core.account_link.returned", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountPersonCreatedEventNotification(
      EventHandler<V2CoreAccountPersonCreatedEventNotification> handler) {
    this.register("v2.core.account_person.created", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountPersonDeletedEventNotification(
      EventHandler<V2CoreAccountPersonDeletedEventNotification> handler) {
    this.register("v2.core.account_person.deleted", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreAccountPersonUpdatedEventNotification(
      EventHandler<V2CoreAccountPersonUpdatedEventNotification> handler) {
    this.register("v2.core.account_person.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreEventDestinationPingEventNotification(
      EventHandler<V2CoreEventDestinationPingEventNotification> handler) {
    this.register("v2.core.event_destination.ping", handler);
    return this;
  }

  public StripeEventRouter on_V2CoreHealthEventGenerationFailureResolvedEventNotification(
      EventHandler<V2CoreHealthEventGenerationFailureResolvedEventNotification> handler) {
    this.register("v2.core.health.event_generation_failure.resolved", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementAdjustmentCreatedEventNotification(
      EventHandler<V2MoneyManagementAdjustmentCreatedEventNotification> handler) {
    this.register("v2.money_management.adjustment.created", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementFinancialAccountCreatedEventNotification(
      EventHandler<V2MoneyManagementFinancialAccountCreatedEventNotification> handler) {
    this.register("v2.money_management.financial_account.created", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementFinancialAccountUpdatedEventNotification(
      EventHandler<V2MoneyManagementFinancialAccountUpdatedEventNotification> handler) {
    this.register("v2.money_management.financial_account.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementFinancialAddressActivatedEventNotification(
      EventHandler<V2MoneyManagementFinancialAddressActivatedEventNotification> handler) {
    this.register("v2.money_management.financial_address.activated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementFinancialAddressFailedEventNotification(
      EventHandler<V2MoneyManagementFinancialAddressFailedEventNotification> handler) {
    this.register("v2.money_management.financial_address.failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferAvailableEventNotification(
      EventHandler<V2MoneyManagementInboundTransferAvailableEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.available", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferBankDebitFailedEventNotification(
      EventHandler<V2MoneyManagementInboundTransferBankDebitFailedEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.bank_debit_failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferBankDebitProcessingEventNotification(
      EventHandler<V2MoneyManagementInboundTransferBankDebitProcessingEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.bank_debit_processing", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferBankDebitQueuedEventNotification(
      EventHandler<V2MoneyManagementInboundTransferBankDebitQueuedEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.bank_debit_queued", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferBankDebitReturnedEventNotification(
      EventHandler<V2MoneyManagementInboundTransferBankDebitReturnedEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.bank_debit_returned", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementInboundTransferBankDebitSucceededEventNotification(
      EventHandler<V2MoneyManagementInboundTransferBankDebitSucceededEventNotification> handler) {
    this.register("v2.money_management.inbound_transfer.bank_debit_succeeded", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentCanceledEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentCanceledEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.canceled", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentCreatedEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentCreatedEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.created", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentFailedEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentFailedEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentPostedEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentPostedEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.posted", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentReturnedEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentReturnedEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.returned", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundPaymentUpdatedEventNotification(
      EventHandler<V2MoneyManagementOutboundPaymentUpdatedEventNotification> handler) {
    this.register("v2.money_management.outbound_payment.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferCanceledEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferCanceledEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.canceled", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferCreatedEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferCreatedEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.created", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferFailedEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferFailedEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferPostedEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferPostedEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.posted", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferReturnedEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferReturnedEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.returned", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementOutboundTransferUpdatedEventNotification(
      EventHandler<V2MoneyManagementOutboundTransferUpdatedEventNotification> handler) {
    this.register("v2.money_management.outbound_transfer.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementPayoutMethodUpdatedEventNotification(
      EventHandler<V2MoneyManagementPayoutMethodUpdatedEventNotification> handler) {
    this.register("v2.money_management.payout_method.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedCreditAvailableEventNotification(
      EventHandler<V2MoneyManagementReceivedCreditAvailableEventNotification> handler) {
    this.register("v2.money_management.received_credit.available", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedCreditFailedEventNotification(
      EventHandler<V2MoneyManagementReceivedCreditFailedEventNotification> handler) {
    this.register("v2.money_management.received_credit.failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedCreditReturnedEventNotification(
      EventHandler<V2MoneyManagementReceivedCreditReturnedEventNotification> handler) {
    this.register("v2.money_management.received_credit.returned", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedCreditSucceededEventNotification(
      EventHandler<V2MoneyManagementReceivedCreditSucceededEventNotification> handler) {
    this.register("v2.money_management.received_credit.succeeded", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedDebitCanceledEventNotification(
      EventHandler<V2MoneyManagementReceivedDebitCanceledEventNotification> handler) {
    this.register("v2.money_management.received_debit.canceled", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedDebitFailedEventNotification(
      EventHandler<V2MoneyManagementReceivedDebitFailedEventNotification> handler) {
    this.register("v2.money_management.received_debit.failed", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedDebitPendingEventNotification(
      EventHandler<V2MoneyManagementReceivedDebitPendingEventNotification> handler) {
    this.register("v2.money_management.received_debit.pending", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedDebitSucceededEventNotification(
      EventHandler<V2MoneyManagementReceivedDebitSucceededEventNotification> handler) {
    this.register("v2.money_management.received_debit.succeeded", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementReceivedDebitUpdatedEventNotification(
      EventHandler<V2MoneyManagementReceivedDebitUpdatedEventNotification> handler) {
    this.register("v2.money_management.received_debit.updated", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementTransactionCreatedEventNotification(
      EventHandler<V2MoneyManagementTransactionCreatedEventNotification> handler) {
    this.register("v2.money_management.transaction.created", handler);
    return this;
  }

  public StripeEventRouter on_V2MoneyManagementTransactionUpdatedEventNotification(
      EventHandler<V2MoneyManagementTransactionUpdatedEventNotification> handler) {
    this.register("v2.money_management.transaction.updated", handler);
    return this;
  }
  // event-router-methods: The end of the section generated from our OpenAPI spec

  /**
   * Get a sorted list of all registered event types.
   *
   * @return A sorted list of event type strings
   */
  public java.util.List<String> getRegisteredEventTypes() {
    java.util.List<String> eventTypes = new java.util.ArrayList<>(this.registeredHandlers.keySet());
    java.util.Collections.sort(eventTypes);
    return eventTypes;
  }
}
