package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - hack because we can't format java files whose imports aren't a single contiguous block
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
import com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification;
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
import com.stripe.events.V2MoneyManagementPayoutMethodCreatedEventNotification;
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
  public StripeEventNotificationHandler onV1BillingMeterErrorReportTriggered(
      Callback<V1BillingMeterErrorReportTriggeredEventNotification> callback) {
    this.register("v1.billing.meter.error_report_triggered", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingMeterNoMeterFound(
      Callback<V1BillingMeterNoMeterFoundEventNotification> callback) {
    this.register("v1.billing.meter.no_meter_found", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountClosed(
      Callback<V2CoreAccountClosedEventNotification> callback) {
    this.register("v2.core.account.closed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountCreated(
      Callback<V2CoreAccountCreatedEventNotification> callback) {
    this.register("v2.core.account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountUpdated(
      Callback<V2CoreAccountUpdatedEventNotification> callback) {
    this.register("v2.core.account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.customer].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationCustomerUpdated(
      Callback<V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.customer].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.merchant].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationMerchantUpdated(
      Callback<V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.merchant].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.recipient].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationRecipientUpdated(
      Callback<V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.recipient].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.storer].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationStorerUpdated(
      Callback<V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.storer].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingDefaultsUpdated(
      Callback<V2CoreAccountIncludingDefaultsUpdatedEventNotification> callback) {
    this.register("v2.core.account[defaults].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingFutureRequirementsUpdated(
      Callback<V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification> callback) {
    this.register("v2.core.account[future_requirements].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingIdentityUpdated(
      Callback<V2CoreAccountIncludingIdentityUpdatedEventNotification> callback) {
    this.register("v2.core.account[identity].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingRequirementsUpdated(
      Callback<V2CoreAccountIncludingRequirementsUpdatedEventNotification> callback) {
    this.register("v2.core.account[requirements].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountLinkReturned(
      Callback<V2CoreAccountLinkReturnedEventNotification> callback) {
    this.register("v2.core.account_link.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonCreated(
      Callback<V2CoreAccountPersonCreatedEventNotification> callback) {
    this.register("v2.core.account_person.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonDeleted(
      Callback<V2CoreAccountPersonDeletedEventNotification> callback) {
    this.register("v2.core.account_person.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonUpdated(
      Callback<V2CoreAccountPersonUpdatedEventNotification> callback) {
    this.register("v2.core.account_person.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreEventDestinationPing(
      Callback<V2CoreEventDestinationPingEventNotification> callback) {
    this.register("v2.core.event_destination.ping", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthEventGenerationFailureResolved(
      Callback<V2CoreHealthEventGenerationFailureResolvedEventNotification> callback) {
    this.register("v2.core.health.event_generation_failure.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementAdjustmentCreated(
      Callback<V2MoneyManagementAdjustmentCreatedEventNotification> callback) {
    this.register("v2.money_management.adjustment.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountCreated(
      Callback<V2MoneyManagementFinancialAccountCreatedEventNotification> callback) {
    this.register("v2.money_management.financial_account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountUpdated(
      Callback<V2MoneyManagementFinancialAccountUpdatedEventNotification> callback) {
    this.register("v2.money_management.financial_account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAddressActivated(
      Callback<V2MoneyManagementFinancialAddressActivatedEventNotification> callback) {
    this.register("v2.money_management.financial_address.activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAddressFailed(
      Callback<V2MoneyManagementFinancialAddressFailedEventNotification> callback) {
    this.register("v2.money_management.financial_address.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferAvailable(
      Callback<V2MoneyManagementInboundTransferAvailableEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitFailed(
      Callback<V2MoneyManagementInboundTransferBankDebitFailedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitProcessing(
      Callback<V2MoneyManagementInboundTransferBankDebitProcessingEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_processing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitQueued(
      Callback<V2MoneyManagementInboundTransferBankDebitQueuedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_queued", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitReturned(
      Callback<V2MoneyManagementInboundTransferBankDebitReturnedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitSucceeded(
      Callback<V2MoneyManagementInboundTransferBankDebitSucceededEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentCanceled(
      Callback<V2MoneyManagementOutboundPaymentCanceledEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentCreated(
      Callback<V2MoneyManagementOutboundPaymentCreatedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentFailed(
      Callback<V2MoneyManagementOutboundPaymentFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentPosted(
      Callback<V2MoneyManagementOutboundPaymentPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.posted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentReturned(
      Callback<V2MoneyManagementOutboundPaymentReturnedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentUpdated(
      Callback<V2MoneyManagementOutboundPaymentUpdatedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferCanceled(
      Callback<V2MoneyManagementOutboundTransferCanceledEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferCreated(
      Callback<V2MoneyManagementOutboundTransferCreatedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferFailed(
      Callback<V2MoneyManagementOutboundTransferFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferPosted(
      Callback<V2MoneyManagementOutboundTransferPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.posted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferReturned(
      Callback<V2MoneyManagementOutboundTransferReturnedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferUpdated(
      Callback<V2MoneyManagementOutboundTransferUpdatedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementPayoutMethodCreated(
      Callback<V2MoneyManagementPayoutMethodCreatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementPayoutMethodUpdated(
      Callback<V2MoneyManagementPayoutMethodUpdatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditAvailable(
      Callback<V2MoneyManagementReceivedCreditAvailableEventNotification> callback) {
    this.register("v2.money_management.received_credit.available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditFailed(
      Callback<V2MoneyManagementReceivedCreditFailedEventNotification> callback) {
    this.register("v2.money_management.received_credit.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditReturned(
      Callback<V2MoneyManagementReceivedCreditReturnedEventNotification> callback) {
    this.register("v2.money_management.received_credit.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditSucceeded(
      Callback<V2MoneyManagementReceivedCreditSucceededEventNotification> callback) {
    this.register("v2.money_management.received_credit.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitCanceled(
      Callback<V2MoneyManagementReceivedDebitCanceledEventNotification> callback) {
    this.register("v2.money_management.received_debit.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitFailed(
      Callback<V2MoneyManagementReceivedDebitFailedEventNotification> callback) {
    this.register("v2.money_management.received_debit.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitPending(
      Callback<V2MoneyManagementReceivedDebitPendingEventNotification> callback) {
    this.register("v2.money_management.received_debit.pending", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitSucceeded(
      Callback<V2MoneyManagementReceivedDebitSucceededEventNotification> callback) {
    this.register("v2.money_management.received_debit.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitUpdated(
      Callback<V2MoneyManagementReceivedDebitUpdatedEventNotification> callback) {
    this.register("v2.money_management.received_debit.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementTransactionCreated(
      Callback<V2MoneyManagementTransactionCreatedEventNotification> callback) {
    this.register("v2.money_management.transaction.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementTransactionUpdated(
      Callback<V2MoneyManagementTransactionUpdatedEventNotification> callback) {
    this.register("v2.money_management.transaction.updated", callback);
    return this;
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
