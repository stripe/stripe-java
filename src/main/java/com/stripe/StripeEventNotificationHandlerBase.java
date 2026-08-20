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
import com.stripe.events.V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEventNotification;
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
import com.stripe.events.V2CoreBatchJobBatchFailedEventNotification;
import com.stripe.events.V2CoreBatchJobCanceledEventNotification;
import com.stripe.events.V2CoreBatchJobCompletedEventNotification;
import com.stripe.events.V2CoreBatchJobCreatedEventNotification;
import com.stripe.events.V2CoreBatchJobReadyForUploadEventNotification;
import com.stripe.events.V2CoreBatchJobTimeoutEventNotification;
import com.stripe.events.V2CoreBatchJobUpdatedEventNotification;
import com.stripe.events.V2CoreBatchJobUploadTimeoutEventNotification;
import com.stripe.events.V2CoreBatchJobValidatingEventNotification;
import com.stripe.events.V2CoreBatchJobValidationFailedEventNotification;
import com.stripe.events.V2CoreEventDestinationPingEventNotification;
import com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEventNotification;
import com.stripe.events.V2DataReportingQueryRunCreatedEventNotification;
import com.stripe.events.V2DataReportingQueryRunFailedEventNotification;
import com.stripe.events.V2DataReportingQueryRunSucceededEventNotification;
import com.stripe.events.V2DataReportingQueryRunUpdatedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunFailedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunStartedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunSucceededEventNotification;
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
import com.stripe.events.V2MoneyManagementOutboundPaymentUnderReviewEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferUnderReviewEventNotification;
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
import com.stripe.events.V2OrchestratedCommerceAgreementConfirmedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementCreatedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementPartiallyConfirmedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementTerminatedEventNotification;
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
  private final HashMap<String, EventNotificationCallback<? extends EventNotification>>
      registeredHandlers = new HashMap<>();

  StripeEventNotificationHandlerBase(
      StripeClient client, EventNotificationFallbackCallback fallbackCallback) {
    this.client = client;
    this.fallbackCallback = fallbackCallback;
  }

  private <E extends EventNotification> void register(
      String eventType, EventNotificationCallback<E> handler) {
    if (hasHandledEvent) {
      throw new IllegalStateException("Cannot register handlers after handling an event");
    }

    if (this.registeredHandlers.containsKey(eventType)) {
      throw new IllegalArgumentException("Handler already registered for event type: " + eventType);
    }
    this.registeredHandlers.put(eventType, handler);
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

  public T onV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register(
        "v2.core.account[configuration.money_manager].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMoneyManagerUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.money_manager].updated", callback);
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

  public T onV2CoreBatchJobBatchFailed(
      EventNotificationCallback<V2CoreBatchJobBatchFailedEventNotification> callback) {
    this.register("v2.core.batch_job.batch_failed", callback);
    return self();
  }

  public T onV2CoreBatchJobCanceled(
      EventNotificationCallback<V2CoreBatchJobCanceledEventNotification> callback) {
    this.register("v2.core.batch_job.canceled", callback);
    return self();
  }

  public T onV2CoreBatchJobCompleted(
      EventNotificationCallback<V2CoreBatchJobCompletedEventNotification> callback) {
    this.register("v2.core.batch_job.completed", callback);
    return self();
  }

  public T onV2CoreBatchJobCreated(
      EventNotificationCallback<V2CoreBatchJobCreatedEventNotification> callback) {
    this.register("v2.core.batch_job.created", callback);
    return self();
  }

  public T onV2CoreBatchJobReadyForUpload(
      EventNotificationCallback<V2CoreBatchJobReadyForUploadEventNotification> callback) {
    this.register("v2.core.batch_job.ready_for_upload", callback);
    return self();
  }

  public T onV2CoreBatchJobTimeout(
      EventNotificationCallback<V2CoreBatchJobTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.timeout", callback);
    return self();
  }

  public T onV2CoreBatchJobUpdated(
      EventNotificationCallback<V2CoreBatchJobUpdatedEventNotification> callback) {
    this.register("v2.core.batch_job.updated", callback);
    return self();
  }

  public T onV2CoreBatchJobUploadTimeout(
      EventNotificationCallback<V2CoreBatchJobUploadTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.upload_timeout", callback);
    return self();
  }

  public T onV2CoreBatchJobValidating(
      EventNotificationCallback<V2CoreBatchJobValidatingEventNotification> callback) {
    this.register("v2.core.batch_job.validating", callback);
    return self();
  }

  public T onV2CoreBatchJobValidationFailed(
      EventNotificationCallback<V2CoreBatchJobValidationFailedEventNotification> callback) {
    this.register("v2.core.batch_job.validation_failed", callback);
    return self();
  }

  public T onV2CoreEventDestinationPing(
      EventNotificationCallback<V2CoreEventDestinationPingEventNotification> callback) {
    this.register("v2.core.event_destination.ping", callback);
    return self();
  }

  public T onV2CoreHealthEventGenerationFailureResolved(
      EventNotificationCallback<V2CoreHealthEventGenerationFailureResolvedEventNotification>
          callback) {
    this.register("v2.core.health.event_generation_failure.resolved", callback);
    return self();
  }

  public T onV2DataReportingQueryRunCreated(
      EventNotificationCallback<V2DataReportingQueryRunCreatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.created", callback);
    return self();
  }

  public T onV2DataReportingQueryRunFailed(
      EventNotificationCallback<V2DataReportingQueryRunFailedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.failed", callback);
    return self();
  }

  public T onV2DataReportingQueryRunSucceeded(
      EventNotificationCallback<V2DataReportingQueryRunSucceededEventNotification> callback) {
    this.register("v2.data.reporting.query_run.succeeded", callback);
    return self();
  }

  public T onV2DataReportingQueryRunUpdated(
      EventNotificationCallback<V2DataReportingQueryRunUpdatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.updated", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunFailed(
      EventNotificationCallback<V2ExtendWorkflowRunFailedEventNotification> callback) {
    this.register("v2.extend.workflow_run.failed", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunStarted(
      EventNotificationCallback<V2ExtendWorkflowRunStartedEventNotification> callback) {
    this.register("v2.extend.workflow_run.started", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunSucceeded(
      EventNotificationCallback<V2ExtendWorkflowRunSucceededEventNotification> callback) {
    this.register("v2.extend.workflow_run.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementAdjustmentCreated(
      EventNotificationCallback<V2MoneyManagementAdjustmentCreatedEventNotification> callback) {
    this.register("v2.money_management.adjustment.created", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountCreated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountCreatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account.created", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountUpdated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account.updated", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAddressActivated(
      EventNotificationCallback<V2MoneyManagementFinancialAddressActivatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_address.activated", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAddressFailed(
      EventNotificationCallback<V2MoneyManagementFinancialAddressFailedEventNotification>
          callback) {
    this.register("v2.money_management.financial_address.failed", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferAvailable(
      EventNotificationCallback<V2MoneyManagementInboundTransferAvailableEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.available", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitFailed(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitFailedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_failed", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitProcessing(
      EventNotificationCallback<
              V2MoneyManagementInboundTransferBankDebitProcessingEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_processing", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitQueued(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitQueuedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_queued", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitReturned(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitReturnedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_returned", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitSucceeded(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitSucceededEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentCanceled(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentCanceledEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentCreated(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentCreatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.created", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentFailed(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.failed", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentPosted(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.posted", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentReturned(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentReturnedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.returned", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentUnderReview(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentUnderReviewEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.under_review", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentUpdated(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.updated", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferCanceled(
      EventNotificationCallback<V2MoneyManagementOutboundTransferCanceledEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferCreated(
      EventNotificationCallback<V2MoneyManagementOutboundTransferCreatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.created", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferFailed(
      EventNotificationCallback<V2MoneyManagementOutboundTransferFailedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.failed", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferPosted(
      EventNotificationCallback<V2MoneyManagementOutboundTransferPostedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.posted", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferReturned(
      EventNotificationCallback<V2MoneyManagementOutboundTransferReturnedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.returned", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferUnderReview(
      EventNotificationCallback<V2MoneyManagementOutboundTransferUnderReviewEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.under_review", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferUpdated(
      EventNotificationCallback<V2MoneyManagementOutboundTransferUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.updated", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutMethodCreated(
      EventNotificationCallback<V2MoneyManagementPayoutMethodCreatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.created", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutMethodUpdated(
      EventNotificationCallback<V2MoneyManagementPayoutMethodUpdatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.updated", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditAvailable(
      EventNotificationCallback<V2MoneyManagementReceivedCreditAvailableEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.available", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditFailed(
      EventNotificationCallback<V2MoneyManagementReceivedCreditFailedEventNotification> callback) {
    this.register("v2.money_management.received_credit.failed", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditReturned(
      EventNotificationCallback<V2MoneyManagementReceivedCreditReturnedEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.returned", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditSucceeded(
      EventNotificationCallback<V2MoneyManagementReceivedCreditSucceededEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitCanceled(
      EventNotificationCallback<V2MoneyManagementReceivedDebitCanceledEventNotification> callback) {
    this.register("v2.money_management.received_debit.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitFailed(
      EventNotificationCallback<V2MoneyManagementReceivedDebitFailedEventNotification> callback) {
    this.register("v2.money_management.received_debit.failed", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitPending(
      EventNotificationCallback<V2MoneyManagementReceivedDebitPendingEventNotification> callback) {
    this.register("v2.money_management.received_debit.pending", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitSucceeded(
      EventNotificationCallback<V2MoneyManagementReceivedDebitSucceededEventNotification>
          callback) {
    this.register("v2.money_management.received_debit.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitUpdated(
      EventNotificationCallback<V2MoneyManagementReceivedDebitUpdatedEventNotification> callback) {
    this.register("v2.money_management.received_debit.updated", callback);
    return self();
  }

  public T onV2MoneyManagementTransactionCreated(
      EventNotificationCallback<V2MoneyManagementTransactionCreatedEventNotification> callback) {
    this.register("v2.money_management.transaction.created", callback);
    return self();
  }

  public T onV2MoneyManagementTransactionUpdated(
      EventNotificationCallback<V2MoneyManagementTransactionUpdatedEventNotification> callback) {
    this.register("v2.money_management.transaction.updated", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementConfirmed(
      EventNotificationCallback<V2OrchestratedCommerceAgreementConfirmedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.confirmed", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementCreated(
      EventNotificationCallback<V2OrchestratedCommerceAgreementCreatedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.created", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementPartiallyConfirmed(
      EventNotificationCallback<V2OrchestratedCommerceAgreementPartiallyConfirmedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.partially_confirmed", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementTerminated(
      EventNotificationCallback<V2OrchestratedCommerceAgreementTerminatedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.terminated", callback);
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
