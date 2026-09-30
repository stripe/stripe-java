package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - hack because we can't format java files whose imports aren't a single contiguous block
// - so _any_ imports in this file have to come from codegen
// - as do these comments, explaining the whole thing
import com.stripe.events.V1AccountApplicationAuthorizedEventNotification;
import com.stripe.events.V1AccountApplicationDeauthorizedEventNotification;
import com.stripe.events.V1AccountExternalAccountCreatedEventNotification;
import com.stripe.events.V1AccountExternalAccountDeletedEventNotification;
import com.stripe.events.V1AccountExternalAccountUpdatedEventNotification;
import com.stripe.events.V1AccountUpdatedEventNotification;
import com.stripe.events.V1ApplicationFeeCreatedEventNotification;
import com.stripe.events.V1ApplicationFeeRefundUpdatedEventNotification;
import com.stripe.events.V1ApplicationFeeRefundedEventNotification;
import com.stripe.events.V1BalanceAvailableEventNotification;
import com.stripe.events.V1BalanceSettingsUpdatedEventNotification;
import com.stripe.events.V1BillingAlertTriggeredEventNotification;
import com.stripe.events.V1BillingCreditBalanceTransactionCreatedEventNotification;
import com.stripe.events.V1BillingCreditGrantCreatedEventNotification;
import com.stripe.events.V1BillingCreditGrantUpdatedEventNotification;
import com.stripe.events.V1BillingMeterCreatedEventNotification;
import com.stripe.events.V1BillingMeterDeactivatedEventNotification;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
import com.stripe.events.V1BillingMeterReactivatedEventNotification;
import com.stripe.events.V1BillingMeterUpdatedEventNotification;
import com.stripe.events.V1BillingPortalConfigurationCreatedEventNotification;
import com.stripe.events.V1BillingPortalConfigurationUpdatedEventNotification;
import com.stripe.events.V1BillingPortalSessionCreatedEventNotification;
import com.stripe.events.V1CapabilityUpdatedEventNotification;
import com.stripe.events.V1CashBalanceFundsAvailableEventNotification;
import com.stripe.events.V1ChargeCapturedEventNotification;
import com.stripe.events.V1ChargeDisputeClosedEventNotification;
import com.stripe.events.V1ChargeDisputeCreatedEventNotification;
import com.stripe.events.V1ChargeDisputeFundsReinstatedEventNotification;
import com.stripe.events.V1ChargeDisputeFundsWithdrawnEventNotification;
import com.stripe.events.V1ChargeDisputeUpdatedEventNotification;
import com.stripe.events.V1ChargeExpiredEventNotification;
import com.stripe.events.V1ChargeFailedEventNotification;
import com.stripe.events.V1ChargePendingEventNotification;
import com.stripe.events.V1ChargeRefundUpdatedEventNotification;
import com.stripe.events.V1ChargeRefundedEventNotification;
import com.stripe.events.V1ChargeSucceededEventNotification;
import com.stripe.events.V1ChargeUpdatedEventNotification;
import com.stripe.events.V1CheckoutSessionAsyncPaymentFailedEventNotification;
import com.stripe.events.V1CheckoutSessionAsyncPaymentSucceededEventNotification;
import com.stripe.events.V1CheckoutSessionCompletedEventNotification;
import com.stripe.events.V1CheckoutSessionExpiredEventNotification;
import com.stripe.events.V1ClimateOrderCanceledEventNotification;
import com.stripe.events.V1ClimateOrderCreatedEventNotification;
import com.stripe.events.V1ClimateOrderDelayedEventNotification;
import com.stripe.events.V1ClimateOrderDeliveredEventNotification;
import com.stripe.events.V1ClimateOrderProductSubstitutedEventNotification;
import com.stripe.events.V1ClimateProductCreatedEventNotification;
import com.stripe.events.V1ClimateProductPricingUpdatedEventNotification;
import com.stripe.events.V1CouponCreatedEventNotification;
import com.stripe.events.V1CouponDeletedEventNotification;
import com.stripe.events.V1CouponUpdatedEventNotification;
import com.stripe.events.V1CreditNoteCreatedEventNotification;
import com.stripe.events.V1CreditNoteUpdatedEventNotification;
import com.stripe.events.V1CreditNoteVoidedEventNotification;
import com.stripe.events.V1CustomerCashBalanceTransactionCreatedEventNotification;
import com.stripe.events.V1CustomerCreatedEventNotification;
import com.stripe.events.V1CustomerDeletedEventNotification;
import com.stripe.events.V1CustomerDiscountCreatedEventNotification;
import com.stripe.events.V1CustomerDiscountDeletedEventNotification;
import com.stripe.events.V1CustomerDiscountUpdatedEventNotification;
import com.stripe.events.V1CustomerSubscriptionCreatedEventNotification;
import com.stripe.events.V1CustomerSubscriptionDeletedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPausedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPendingUpdateAppliedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPendingUpdateExpiredEventNotification;
import com.stripe.events.V1CustomerSubscriptionResumedEventNotification;
import com.stripe.events.V1CustomerSubscriptionTrialWillEndEventNotification;
import com.stripe.events.V1CustomerSubscriptionUpdatedEventNotification;
import com.stripe.events.V1CustomerTaxIdCreatedEventNotification;
import com.stripe.events.V1CustomerTaxIdDeletedEventNotification;
import com.stripe.events.V1CustomerTaxIdUpdatedEventNotification;
import com.stripe.events.V1CustomerUpdatedEventNotification;
import com.stripe.events.V1EntitlementsActiveEntitlementSummaryUpdatedEventNotification;
import com.stripe.events.V1FileCreatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountAccountNumbersUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountCreatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDeactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDisconnectedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountReactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedBalanceEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedOwnershipEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedTransactionsEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountUpcomingDeactivationEventNotification;
import com.stripe.events.V1IdentityVerificationSessionCanceledEventNotification;
import com.stripe.events.V1IdentityVerificationSessionCreatedEventNotification;
import com.stripe.events.V1IdentityVerificationSessionProcessingEventNotification;
import com.stripe.events.V1IdentityVerificationSessionRedactedEventNotification;
import com.stripe.events.V1IdentityVerificationSessionRequiresInputEventNotification;
import com.stripe.events.V1IdentityVerificationSessionVerifiedEventNotification;
import com.stripe.events.V1InvoiceCreatedEventNotification;
import com.stripe.events.V1InvoiceDeletedEventNotification;
import com.stripe.events.V1InvoiceFinalizationFailedEventNotification;
import com.stripe.events.V1InvoiceFinalizedEventNotification;
import com.stripe.events.V1InvoiceMarkedUncollectibleEventNotification;
import com.stripe.events.V1InvoiceOverdueEventNotification;
import com.stripe.events.V1InvoiceOverpaidEventNotification;
import com.stripe.events.V1InvoicePaidEventNotification;
import com.stripe.events.V1InvoicePaymentActionRequiredEventNotification;
import com.stripe.events.V1InvoicePaymentAttemptRequiredEventNotification;
import com.stripe.events.V1InvoicePaymentFailedEventNotification;
import com.stripe.events.V1InvoicePaymentPaidEventNotification;
import com.stripe.events.V1InvoicePaymentSucceededEventNotification;
import com.stripe.events.V1InvoiceSentEventNotification;
import com.stripe.events.V1InvoiceUpcomingEventNotification;
import com.stripe.events.V1InvoiceUpdatedEventNotification;
import com.stripe.events.V1InvoiceVoidedEventNotification;
import com.stripe.events.V1InvoiceWillBeDueEventNotification;
import com.stripe.events.V1InvoiceitemCreatedEventNotification;
import com.stripe.events.V1InvoiceitemDeletedEventNotification;
import com.stripe.events.V1IssuingAuthorizationCreatedEventNotification;
import com.stripe.events.V1IssuingAuthorizationRequestEventNotification;
import com.stripe.events.V1IssuingAuthorizationUpdatedEventNotification;
import com.stripe.events.V1IssuingCardCreatedEventNotification;
import com.stripe.events.V1IssuingCardUpdatedEventNotification;
import com.stripe.events.V1IssuingCardholderCreatedEventNotification;
import com.stripe.events.V1IssuingCardholderUpdatedEventNotification;
import com.stripe.events.V1IssuingDisputeClosedEventNotification;
import com.stripe.events.V1IssuingDisputeCreatedEventNotification;
import com.stripe.events.V1IssuingDisputeFundsReinstatedEventNotification;
import com.stripe.events.V1IssuingDisputeFundsRescindedEventNotification;
import com.stripe.events.V1IssuingDisputeSubmittedEventNotification;
import com.stripe.events.V1IssuingDisputeUpdatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignActivatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignDeactivatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignRejectedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignUpdatedEventNotification;
import com.stripe.events.V1IssuingTokenCreatedEventNotification;
import com.stripe.events.V1IssuingTokenUpdatedEventNotification;
import com.stripe.events.V1IssuingTransactionCreatedEventNotification;
import com.stripe.events.V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification;
import com.stripe.events.V1IssuingTransactionUpdatedEventNotification;
import com.stripe.events.V1MandateUpdatedEventNotification;
import com.stripe.events.V1PaymentIntentAmountCapturableUpdatedEventNotification;
import com.stripe.events.V1PaymentIntentCanceledEventNotification;
import com.stripe.events.V1PaymentIntentCreatedEventNotification;
import com.stripe.events.V1PaymentIntentPartiallyFundedEventNotification;
import com.stripe.events.V1PaymentIntentPaymentFailedEventNotification;
import com.stripe.events.V1PaymentIntentProcessingEventNotification;
import com.stripe.events.V1PaymentIntentRequiresActionEventNotification;
import com.stripe.events.V1PaymentIntentSucceededEventNotification;
import com.stripe.events.V1PaymentLinkCreatedEventNotification;
import com.stripe.events.V1PaymentLinkUpdatedEventNotification;
import com.stripe.events.V1PaymentMethodAttachedEventNotification;
import com.stripe.events.V1PaymentMethodAutomaticallyUpdatedEventNotification;
import com.stripe.events.V1PaymentMethodDetachedEventNotification;
import com.stripe.events.V1PaymentMethodUpdatedEventNotification;
import com.stripe.events.V1PayoutCanceledEventNotification;
import com.stripe.events.V1PayoutCreatedEventNotification;
import com.stripe.events.V1PayoutFailedEventNotification;
import com.stripe.events.V1PayoutPaidEventNotification;
import com.stripe.events.V1PayoutReconciliationCompletedEventNotification;
import com.stripe.events.V1PayoutUpdatedEventNotification;
import com.stripe.events.V1PersonCreatedEventNotification;
import com.stripe.events.V1PersonDeletedEventNotification;
import com.stripe.events.V1PersonUpdatedEventNotification;
import com.stripe.events.V1PlanCreatedEventNotification;
import com.stripe.events.V1PlanDeletedEventNotification;
import com.stripe.events.V1PlanUpdatedEventNotification;
import com.stripe.events.V1PriceCreatedEventNotification;
import com.stripe.events.V1PriceDeletedEventNotification;
import com.stripe.events.V1PriceUpdatedEventNotification;
import com.stripe.events.V1ProductCreatedEventNotification;
import com.stripe.events.V1ProductDeletedEventNotification;
import com.stripe.events.V1ProductUpdatedEventNotification;
import com.stripe.events.V1PromotionCodeCreatedEventNotification;
import com.stripe.events.V1PromotionCodeUpdatedEventNotification;
import com.stripe.events.V1QuoteAcceptedEventNotification;
import com.stripe.events.V1QuoteCanceledEventNotification;
import com.stripe.events.V1QuoteCreatedEventNotification;
import com.stripe.events.V1QuoteFinalizedEventNotification;
import com.stripe.events.V1RadarEarlyFraudWarningCreatedEventNotification;
import com.stripe.events.V1RadarEarlyFraudWarningUpdatedEventNotification;
import com.stripe.events.V1RefundCreatedEventNotification;
import com.stripe.events.V1RefundFailedEventNotification;
import com.stripe.events.V1RefundUpdatedEventNotification;
import com.stripe.events.V1ReviewClosedEventNotification;
import com.stripe.events.V1ReviewOpenedEventNotification;
import com.stripe.events.V1SetupIntentCanceledEventNotification;
import com.stripe.events.V1SetupIntentCreatedEventNotification;
import com.stripe.events.V1SetupIntentRequiresActionEventNotification;
import com.stripe.events.V1SetupIntentSetupFailedEventNotification;
import com.stripe.events.V1SetupIntentSucceededEventNotification;
import com.stripe.events.V1SigmaScheduledQueryRunCreatedEventNotification;
import com.stripe.events.V1SourceCanceledEventNotification;
import com.stripe.events.V1SourceChargeableEventNotification;
import com.stripe.events.V1SourceFailedEventNotification;
import com.stripe.events.V1SourceRefundAttributesRequiredEventNotification;
import com.stripe.events.V1SubscriptionScheduleAbortedEventNotification;
import com.stripe.events.V1SubscriptionScheduleCanceledEventNotification;
import com.stripe.events.V1SubscriptionScheduleCompletedEventNotification;
import com.stripe.events.V1SubscriptionScheduleCreatedEventNotification;
import com.stripe.events.V1SubscriptionScheduleExpiringEventNotification;
import com.stripe.events.V1SubscriptionScheduleReleasedEventNotification;
import com.stripe.events.V1SubscriptionScheduleUpdatedEventNotification;
import com.stripe.events.V1TaxRateCreatedEventNotification;
import com.stripe.events.V1TaxRateUpdatedEventNotification;
import com.stripe.events.V1TaxSettingsUpdatedEventNotification;
import com.stripe.events.V1TerminalReaderActionFailedEventNotification;
import com.stripe.events.V1TerminalReaderActionSucceededEventNotification;
import com.stripe.events.V1TerminalReaderActionUpdatedEventNotification;
import com.stripe.events.V1TestHelpersTestClockAdvancingEventNotification;
import com.stripe.events.V1TestHelpersTestClockCreatedEventNotification;
import com.stripe.events.V1TestHelpersTestClockDeletedEventNotification;
import com.stripe.events.V1TestHelpersTestClockInternalFailureEventNotification;
import com.stripe.events.V1TestHelpersTestClockReadyEventNotification;
import com.stripe.events.V1TopupCanceledEventNotification;
import com.stripe.events.V1TopupCreatedEventNotification;
import com.stripe.events.V1TopupFailedEventNotification;
import com.stripe.events.V1TopupReversedEventNotification;
import com.stripe.events.V1TopupSucceededEventNotification;
import com.stripe.events.V1TransferCreatedEventNotification;
import com.stripe.events.V1TransferReversedEventNotification;
import com.stripe.events.V1TransferUpdatedEventNotification;
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
  public T onV1AccountApplicationAuthorized(
      EventNotificationCallback<V1AccountApplicationAuthorizedEventNotification> callback) {
    this.register("v1.account.application.authorized", callback);
    return self();
  }

  public T onV1AccountApplicationDeauthorized(
      EventNotificationCallback<V1AccountApplicationDeauthorizedEventNotification> callback) {
    this.register("v1.account.application.deauthorized", callback);
    return self();
  }

  public T onV1AccountExternalAccountCreated(
      EventNotificationCallback<V1AccountExternalAccountCreatedEventNotification> callback) {
    this.register("v1.account.external_account.created", callback);
    return self();
  }

  public T onV1AccountExternalAccountDeleted(
      EventNotificationCallback<V1AccountExternalAccountDeletedEventNotification> callback) {
    this.register("v1.account.external_account.deleted", callback);
    return self();
  }

  public T onV1AccountExternalAccountUpdated(
      EventNotificationCallback<V1AccountExternalAccountUpdatedEventNotification> callback) {
    this.register("v1.account.external_account.updated", callback);
    return self();
  }

  public T onV1AccountUpdated(
      EventNotificationCallback<V1AccountUpdatedEventNotification> callback) {
    this.register("v1.account.updated", callback);
    return self();
  }

  public T onV1ApplicationFeeCreated(
      EventNotificationCallback<V1ApplicationFeeCreatedEventNotification> callback) {
    this.register("v1.application_fee.created", callback);
    return self();
  }

  public T onV1ApplicationFeeRefundUpdated(
      EventNotificationCallback<V1ApplicationFeeRefundUpdatedEventNotification> callback) {
    this.register("v1.application_fee.refund.updated", callback);
    return self();
  }

  public T onV1ApplicationFeeRefunded(
      EventNotificationCallback<V1ApplicationFeeRefundedEventNotification> callback) {
    this.register("v1.application_fee.refunded", callback);
    return self();
  }

  public T onV1BalanceAvailable(
      EventNotificationCallback<V1BalanceAvailableEventNotification> callback) {
    this.register("v1.balance.available", callback);
    return self();
  }

  public T onV1BalanceSettingsUpdated(
      EventNotificationCallback<V1BalanceSettingsUpdatedEventNotification> callback) {
    this.register("v1.balance_settings.updated", callback);
    return self();
  }

  public T onV1BillingAlertTriggered(
      EventNotificationCallback<V1BillingAlertTriggeredEventNotification> callback) {
    this.register("v1.billing.alert.triggered", callback);
    return self();
  }

  public T onV1BillingCreditBalanceTransactionCreated(
      EventNotificationCallback<V1BillingCreditBalanceTransactionCreatedEventNotification>
          callback) {
    this.register("v1.billing.credit_balance_transaction.created", callback);
    return self();
  }

  public T onV1BillingCreditGrantCreated(
      EventNotificationCallback<V1BillingCreditGrantCreatedEventNotification> callback) {
    this.register("v1.billing.credit_grant.created", callback);
    return self();
  }

  public T onV1BillingCreditGrantUpdated(
      EventNotificationCallback<V1BillingCreditGrantUpdatedEventNotification> callback) {
    this.register("v1.billing.credit_grant.updated", callback);
    return self();
  }

  public T onV1BillingMeterCreated(
      EventNotificationCallback<V1BillingMeterCreatedEventNotification> callback) {
    this.register("v1.billing.meter.created", callback);
    return self();
  }

  public T onV1BillingMeterDeactivated(
      EventNotificationCallback<V1BillingMeterDeactivatedEventNotification> callback) {
    this.register("v1.billing.meter.deactivated", callback);
    return self();
  }

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

  public T onV1BillingMeterReactivated(
      EventNotificationCallback<V1BillingMeterReactivatedEventNotification> callback) {
    this.register("v1.billing.meter.reactivated", callback);
    return self();
  }

  public T onV1BillingMeterUpdated(
      EventNotificationCallback<V1BillingMeterUpdatedEventNotification> callback) {
    this.register("v1.billing.meter.updated", callback);
    return self();
  }

  public T onV1BillingPortalConfigurationCreated(
      EventNotificationCallback<V1BillingPortalConfigurationCreatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.created", callback);
    return self();
  }

  public T onV1BillingPortalConfigurationUpdated(
      EventNotificationCallback<V1BillingPortalConfigurationUpdatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.updated", callback);
    return self();
  }

  public T onV1BillingPortalSessionCreated(
      EventNotificationCallback<V1BillingPortalSessionCreatedEventNotification> callback) {
    this.register("v1.billing_portal.session.created", callback);
    return self();
  }

  public T onV1CapabilityUpdated(
      EventNotificationCallback<V1CapabilityUpdatedEventNotification> callback) {
    this.register("v1.capability.updated", callback);
    return self();
  }

  public T onV1CashBalanceFundsAvailable(
      EventNotificationCallback<V1CashBalanceFundsAvailableEventNotification> callback) {
    this.register("v1.cash_balance.funds_available", callback);
    return self();
  }

  public T onV1ChargeCaptured(
      EventNotificationCallback<V1ChargeCapturedEventNotification> callback) {
    this.register("v1.charge.captured", callback);
    return self();
  }

  public T onV1ChargeDisputeClosed(
      EventNotificationCallback<V1ChargeDisputeClosedEventNotification> callback) {
    this.register("v1.charge.dispute.closed", callback);
    return self();
  }

  public T onV1ChargeDisputeCreated(
      EventNotificationCallback<V1ChargeDisputeCreatedEventNotification> callback) {
    this.register("v1.charge.dispute.created", callback);
    return self();
  }

  public T onV1ChargeDisputeFundsReinstated(
      EventNotificationCallback<V1ChargeDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.charge.dispute.funds_reinstated", callback);
    return self();
  }

  public T onV1ChargeDisputeFundsWithdrawn(
      EventNotificationCallback<V1ChargeDisputeFundsWithdrawnEventNotification> callback) {
    this.register("v1.charge.dispute.funds_withdrawn", callback);
    return self();
  }

  public T onV1ChargeDisputeUpdated(
      EventNotificationCallback<V1ChargeDisputeUpdatedEventNotification> callback) {
    this.register("v1.charge.dispute.updated", callback);
    return self();
  }

  public T onV1ChargeExpired(EventNotificationCallback<V1ChargeExpiredEventNotification> callback) {
    this.register("v1.charge.expired", callback);
    return self();
  }

  public T onV1ChargeFailed(EventNotificationCallback<V1ChargeFailedEventNotification> callback) {
    this.register("v1.charge.failed", callback);
    return self();
  }

  public T onV1ChargePending(EventNotificationCallback<V1ChargePendingEventNotification> callback) {
    this.register("v1.charge.pending", callback);
    return self();
  }

  public T onV1ChargeRefundUpdated(
      EventNotificationCallback<V1ChargeRefundUpdatedEventNotification> callback) {
    this.register("v1.charge.refund.updated", callback);
    return self();
  }

  public T onV1ChargeRefunded(
      EventNotificationCallback<V1ChargeRefundedEventNotification> callback) {
    this.register("v1.charge.refunded", callback);
    return self();
  }

  public T onV1ChargeSucceeded(
      EventNotificationCallback<V1ChargeSucceededEventNotification> callback) {
    this.register("v1.charge.succeeded", callback);
    return self();
  }

  public T onV1ChargeUpdated(EventNotificationCallback<V1ChargeUpdatedEventNotification> callback) {
    this.register("v1.charge.updated", callback);
    return self();
  }

  public T onV1CheckoutSessionAsyncPaymentFailed(
      EventNotificationCallback<V1CheckoutSessionAsyncPaymentFailedEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_failed", callback);
    return self();
  }

  public T onV1CheckoutSessionAsyncPaymentSucceeded(
      EventNotificationCallback<V1CheckoutSessionAsyncPaymentSucceededEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_succeeded", callback);
    return self();
  }

  public T onV1CheckoutSessionCompleted(
      EventNotificationCallback<V1CheckoutSessionCompletedEventNotification> callback) {
    this.register("v1.checkout.session.completed", callback);
    return self();
  }

  public T onV1CheckoutSessionExpired(
      EventNotificationCallback<V1CheckoutSessionExpiredEventNotification> callback) {
    this.register("v1.checkout.session.expired", callback);
    return self();
  }

  public T onV1ClimateOrderCanceled(
      EventNotificationCallback<V1ClimateOrderCanceledEventNotification> callback) {
    this.register("v1.climate.order.canceled", callback);
    return self();
  }

  public T onV1ClimateOrderCreated(
      EventNotificationCallback<V1ClimateOrderCreatedEventNotification> callback) {
    this.register("v1.climate.order.created", callback);
    return self();
  }

  public T onV1ClimateOrderDelayed(
      EventNotificationCallback<V1ClimateOrderDelayedEventNotification> callback) {
    this.register("v1.climate.order.delayed", callback);
    return self();
  }

  public T onV1ClimateOrderDelivered(
      EventNotificationCallback<V1ClimateOrderDeliveredEventNotification> callback) {
    this.register("v1.climate.order.delivered", callback);
    return self();
  }

  public T onV1ClimateOrderProductSubstituted(
      EventNotificationCallback<V1ClimateOrderProductSubstitutedEventNotification> callback) {
    this.register("v1.climate.order.product_substituted", callback);
    return self();
  }

  public T onV1ClimateProductCreated(
      EventNotificationCallback<V1ClimateProductCreatedEventNotification> callback) {
    this.register("v1.climate.product.created", callback);
    return self();
  }

  public T onV1ClimateProductPricingUpdated(
      EventNotificationCallback<V1ClimateProductPricingUpdatedEventNotification> callback) {
    this.register("v1.climate.product.pricing_updated", callback);
    return self();
  }

  public T onV1CouponCreated(EventNotificationCallback<V1CouponCreatedEventNotification> callback) {
    this.register("v1.coupon.created", callback);
    return self();
  }

  public T onV1CouponDeleted(EventNotificationCallback<V1CouponDeletedEventNotification> callback) {
    this.register("v1.coupon.deleted", callback);
    return self();
  }

  public T onV1CouponUpdated(EventNotificationCallback<V1CouponUpdatedEventNotification> callback) {
    this.register("v1.coupon.updated", callback);
    return self();
  }

  public T onV1CreditNoteCreated(
      EventNotificationCallback<V1CreditNoteCreatedEventNotification> callback) {
    this.register("v1.credit_note.created", callback);
    return self();
  }

  public T onV1CreditNoteUpdated(
      EventNotificationCallback<V1CreditNoteUpdatedEventNotification> callback) {
    this.register("v1.credit_note.updated", callback);
    return self();
  }

  public T onV1CreditNoteVoided(
      EventNotificationCallback<V1CreditNoteVoidedEventNotification> callback) {
    this.register("v1.credit_note.voided", callback);
    return self();
  }

  public T onV1CustomerCreated(
      EventNotificationCallback<V1CustomerCreatedEventNotification> callback) {
    this.register("v1.customer.created", callback);
    return self();
  }

  public T onV1CustomerDeleted(
      EventNotificationCallback<V1CustomerDeletedEventNotification> callback) {
    this.register("v1.customer.deleted", callback);
    return self();
  }

  public T onV1CustomerDiscountCreated(
      EventNotificationCallback<V1CustomerDiscountCreatedEventNotification> callback) {
    this.register("v1.customer.discount.created", callback);
    return self();
  }

  public T onV1CustomerDiscountDeleted(
      EventNotificationCallback<V1CustomerDiscountDeletedEventNotification> callback) {
    this.register("v1.customer.discount.deleted", callback);
    return self();
  }

  public T onV1CustomerDiscountUpdated(
      EventNotificationCallback<V1CustomerDiscountUpdatedEventNotification> callback) {
    this.register("v1.customer.discount.updated", callback);
    return self();
  }

  public T onV1CustomerSubscriptionCreated(
      EventNotificationCallback<V1CustomerSubscriptionCreatedEventNotification> callback) {
    this.register("v1.customer.subscription.created", callback);
    return self();
  }

  public T onV1CustomerSubscriptionDeleted(
      EventNotificationCallback<V1CustomerSubscriptionDeletedEventNotification> callback) {
    this.register("v1.customer.subscription.deleted", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPaused(
      EventNotificationCallback<V1CustomerSubscriptionPausedEventNotification> callback) {
    this.register("v1.customer.subscription.paused", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPendingUpdateApplied(
      EventNotificationCallback<V1CustomerSubscriptionPendingUpdateAppliedEventNotification>
          callback) {
    this.register("v1.customer.subscription.pending_update_applied", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPendingUpdateExpired(
      EventNotificationCallback<V1CustomerSubscriptionPendingUpdateExpiredEventNotification>
          callback) {
    this.register("v1.customer.subscription.pending_update_expired", callback);
    return self();
  }

  public T onV1CustomerSubscriptionResumed(
      EventNotificationCallback<V1CustomerSubscriptionResumedEventNotification> callback) {
    this.register("v1.customer.subscription.resumed", callback);
    return self();
  }

  public T onV1CustomerSubscriptionTrialWillEnd(
      EventNotificationCallback<V1CustomerSubscriptionTrialWillEndEventNotification> callback) {
    this.register("v1.customer.subscription.trial_will_end", callback);
    return self();
  }

  public T onV1CustomerSubscriptionUpdated(
      EventNotificationCallback<V1CustomerSubscriptionUpdatedEventNotification> callback) {
    this.register("v1.customer.subscription.updated", callback);
    return self();
  }

  public T onV1CustomerTaxIdCreated(
      EventNotificationCallback<V1CustomerTaxIdCreatedEventNotification> callback) {
    this.register("v1.customer.tax_id.created", callback);
    return self();
  }

  public T onV1CustomerTaxIdDeleted(
      EventNotificationCallback<V1CustomerTaxIdDeletedEventNotification> callback) {
    this.register("v1.customer.tax_id.deleted", callback);
    return self();
  }

  public T onV1CustomerTaxIdUpdated(
      EventNotificationCallback<V1CustomerTaxIdUpdatedEventNotification> callback) {
    this.register("v1.customer.tax_id.updated", callback);
    return self();
  }

  public T onV1CustomerUpdated(
      EventNotificationCallback<V1CustomerUpdatedEventNotification> callback) {
    this.register("v1.customer.updated", callback);
    return self();
  }

  public T onV1CustomerCashBalanceTransactionCreated(
      EventNotificationCallback<V1CustomerCashBalanceTransactionCreatedEventNotification>
          callback) {
    this.register("v1.customer_cash_balance_transaction.created", callback);
    return self();
  }

  public T onV1EntitlementsActiveEntitlementSummaryUpdated(
      EventNotificationCallback<V1EntitlementsActiveEntitlementSummaryUpdatedEventNotification>
          callback) {
    this.register("v1.entitlements.active_entitlement_summary.updated", callback);
    return self();
  }

  public T onV1FileCreated(EventNotificationCallback<V1FileCreatedEventNotification> callback) {
    this.register("v1.file.created", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountAccountNumbersUpdated(
      EventNotificationCallback<V1FinancialConnectionsAccountAccountNumbersUpdatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.account_numbers_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountCreated(
      EventNotificationCallback<V1FinancialConnectionsAccountCreatedEventNotification> callback) {
    this.register("v1.financial_connections.account.created", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountDeactivated(
      EventNotificationCallback<V1FinancialConnectionsAccountDeactivatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.deactivated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountDisconnected(
      EventNotificationCallback<V1FinancialConnectionsAccountDisconnectedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.disconnected", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountExpectedDeactivationDateUpdated(
      EventNotificationCallback<
              V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.expected_deactivation_date_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountReactivated(
      EventNotificationCallback<V1FinancialConnectionsAccountReactivatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.reactivated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedBalance(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedBalanceEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_balance", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedOwnership(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedOwnershipEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_ownership", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedTransactions(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedTransactionsEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_transactions", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdated(
      EventNotificationCallback<
              V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEventNotification>
          callback) {
    this.register(
        "v1.financial_connections.account.supported_payment_method_types_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountUpcomingAccountNumberExpiry(
      EventNotificationCallback<
              V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEventNotification>
          callback) {
    this.register("v1.financial_connections.account.upcoming_account_number_expiry", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountUpcomingDeactivation(
      EventNotificationCallback<V1FinancialConnectionsAccountUpcomingDeactivationEventNotification>
          callback) {
    this.register("v1.financial_connections.account.upcoming_deactivation", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionCanceled(
      EventNotificationCallback<V1IdentityVerificationSessionCanceledEventNotification> callback) {
    this.register("v1.identity.verification_session.canceled", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionCreated(
      EventNotificationCallback<V1IdentityVerificationSessionCreatedEventNotification> callback) {
    this.register("v1.identity.verification_session.created", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionProcessing(
      EventNotificationCallback<V1IdentityVerificationSessionProcessingEventNotification>
          callback) {
    this.register("v1.identity.verification_session.processing", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionRedacted(
      EventNotificationCallback<V1IdentityVerificationSessionRedactedEventNotification> callback) {
    this.register("v1.identity.verification_session.redacted", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionRequiresInput(
      EventNotificationCallback<V1IdentityVerificationSessionRequiresInputEventNotification>
          callback) {
    this.register("v1.identity.verification_session.requires_input", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionVerified(
      EventNotificationCallback<V1IdentityVerificationSessionVerifiedEventNotification> callback) {
    this.register("v1.identity.verification_session.verified", callback);
    return self();
  }

  public T onV1InvoiceCreated(
      EventNotificationCallback<V1InvoiceCreatedEventNotification> callback) {
    this.register("v1.invoice.created", callback);
    return self();
  }

  public T onV1InvoiceDeleted(
      EventNotificationCallback<V1InvoiceDeletedEventNotification> callback) {
    this.register("v1.invoice.deleted", callback);
    return self();
  }

  public T onV1InvoiceFinalizationFailed(
      EventNotificationCallback<V1InvoiceFinalizationFailedEventNotification> callback) {
    this.register("v1.invoice.finalization_failed", callback);
    return self();
  }

  public T onV1InvoiceFinalized(
      EventNotificationCallback<V1InvoiceFinalizedEventNotification> callback) {
    this.register("v1.invoice.finalized", callback);
    return self();
  }

  public T onV1InvoiceMarkedUncollectible(
      EventNotificationCallback<V1InvoiceMarkedUncollectibleEventNotification> callback) {
    this.register("v1.invoice.marked_uncollectible", callback);
    return self();
  }

  public T onV1InvoiceOverdue(
      EventNotificationCallback<V1InvoiceOverdueEventNotification> callback) {
    this.register("v1.invoice.overdue", callback);
    return self();
  }

  public T onV1InvoiceOverpaid(
      EventNotificationCallback<V1InvoiceOverpaidEventNotification> callback) {
    this.register("v1.invoice.overpaid", callback);
    return self();
  }

  public T onV1InvoicePaid(EventNotificationCallback<V1InvoicePaidEventNotification> callback) {
    this.register("v1.invoice.paid", callback);
    return self();
  }

  public T onV1InvoicePaymentActionRequired(
      EventNotificationCallback<V1InvoicePaymentActionRequiredEventNotification> callback) {
    this.register("v1.invoice.payment_action_required", callback);
    return self();
  }

  public T onV1InvoicePaymentAttemptRequired(
      EventNotificationCallback<V1InvoicePaymentAttemptRequiredEventNotification> callback) {
    this.register("v1.invoice.payment_attempt_required", callback);
    return self();
  }

  public T onV1InvoicePaymentFailed(
      EventNotificationCallback<V1InvoicePaymentFailedEventNotification> callback) {
    this.register("v1.invoice.payment_failed", callback);
    return self();
  }

  public T onV1InvoicePaymentSucceeded(
      EventNotificationCallback<V1InvoicePaymentSucceededEventNotification> callback) {
    this.register("v1.invoice.payment_succeeded", callback);
    return self();
  }

  public T onV1InvoiceSent(EventNotificationCallback<V1InvoiceSentEventNotification> callback) {
    this.register("v1.invoice.sent", callback);
    return self();
  }

  public T onV1InvoiceUpcoming(
      EventNotificationCallback<V1InvoiceUpcomingEventNotification> callback) {
    this.register("v1.invoice.upcoming", callback);
    return self();
  }

  public T onV1InvoiceUpdated(
      EventNotificationCallback<V1InvoiceUpdatedEventNotification> callback) {
    this.register("v1.invoice.updated", callback);
    return self();
  }

  public T onV1InvoiceVoided(EventNotificationCallback<V1InvoiceVoidedEventNotification> callback) {
    this.register("v1.invoice.voided", callback);
    return self();
  }

  public T onV1InvoiceWillBeDue(
      EventNotificationCallback<V1InvoiceWillBeDueEventNotification> callback) {
    this.register("v1.invoice.will_be_due", callback);
    return self();
  }

  public T onV1InvoicePaymentPaid(
      EventNotificationCallback<V1InvoicePaymentPaidEventNotification> callback) {
    this.register("v1.invoice_payment.paid", callback);
    return self();
  }

  public T onV1InvoiceitemCreated(
      EventNotificationCallback<V1InvoiceitemCreatedEventNotification> callback) {
    this.register("v1.invoiceitem.created", callback);
    return self();
  }

  public T onV1InvoiceitemDeleted(
      EventNotificationCallback<V1InvoiceitemDeletedEventNotification> callback) {
    this.register("v1.invoiceitem.deleted", callback);
    return self();
  }

  public T onV1IssuingAuthorizationCreated(
      EventNotificationCallback<V1IssuingAuthorizationCreatedEventNotification> callback) {
    this.register("v1.issuing_authorization.created", callback);
    return self();
  }

  public T onV1IssuingAuthorizationRequest(
      EventNotificationCallback<V1IssuingAuthorizationRequestEventNotification> callback) {
    this.register("v1.issuing_authorization.request", callback);
    return self();
  }

  public T onV1IssuingAuthorizationUpdated(
      EventNotificationCallback<V1IssuingAuthorizationUpdatedEventNotification> callback) {
    this.register("v1.issuing_authorization.updated", callback);
    return self();
  }

  public T onV1IssuingCardCreated(
      EventNotificationCallback<V1IssuingCardCreatedEventNotification> callback) {
    this.register("v1.issuing_card.created", callback);
    return self();
  }

  public T onV1IssuingCardUpdated(
      EventNotificationCallback<V1IssuingCardUpdatedEventNotification> callback) {
    this.register("v1.issuing_card.updated", callback);
    return self();
  }

  public T onV1IssuingCardholderCreated(
      EventNotificationCallback<V1IssuingCardholderCreatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.created", callback);
    return self();
  }

  public T onV1IssuingCardholderUpdated(
      EventNotificationCallback<V1IssuingCardholderUpdatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.updated", callback);
    return self();
  }

  public T onV1IssuingDisputeClosed(
      EventNotificationCallback<V1IssuingDisputeClosedEventNotification> callback) {
    this.register("v1.issuing_dispute.closed", callback);
    return self();
  }

  public T onV1IssuingDisputeCreated(
      EventNotificationCallback<V1IssuingDisputeCreatedEventNotification> callback) {
    this.register("v1.issuing_dispute.created", callback);
    return self();
  }

  public T onV1IssuingDisputeFundsReinstated(
      EventNotificationCallback<V1IssuingDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_reinstated", callback);
    return self();
  }

  public T onV1IssuingDisputeFundsRescinded(
      EventNotificationCallback<V1IssuingDisputeFundsRescindedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_rescinded", callback);
    return self();
  }

  public T onV1IssuingDisputeSubmitted(
      EventNotificationCallback<V1IssuingDisputeSubmittedEventNotification> callback) {
    this.register("v1.issuing_dispute.submitted", callback);
    return self();
  }

  public T onV1IssuingDisputeUpdated(
      EventNotificationCallback<V1IssuingDisputeUpdatedEventNotification> callback) {
    this.register("v1.issuing_dispute.updated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignActivated(
      EventNotificationCallback<V1IssuingPersonalizationDesignActivatedEventNotification>
          callback) {
    this.register("v1.issuing_personalization_design.activated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignDeactivated(
      EventNotificationCallback<V1IssuingPersonalizationDesignDeactivatedEventNotification>
          callback) {
    this.register("v1.issuing_personalization_design.deactivated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignRejected(
      EventNotificationCallback<V1IssuingPersonalizationDesignRejectedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.rejected", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignUpdated(
      EventNotificationCallback<V1IssuingPersonalizationDesignUpdatedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.updated", callback);
    return self();
  }

  public T onV1IssuingTokenCreated(
      EventNotificationCallback<V1IssuingTokenCreatedEventNotification> callback) {
    this.register("v1.issuing_token.created", callback);
    return self();
  }

  public T onV1IssuingTokenUpdated(
      EventNotificationCallback<V1IssuingTokenUpdatedEventNotification> callback) {
    this.register("v1.issuing_token.updated", callback);
    return self();
  }

  public T onV1IssuingTransactionCreated(
      EventNotificationCallback<V1IssuingTransactionCreatedEventNotification> callback) {
    this.register("v1.issuing_transaction.created", callback);
    return self();
  }

  public T onV1IssuingTransactionPurchaseDetailsReceiptUpdated(
      EventNotificationCallback<V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification>
          callback) {
    this.register("v1.issuing_transaction.purchase_details_receipt_updated", callback);
    return self();
  }

  public T onV1IssuingTransactionUpdated(
      EventNotificationCallback<V1IssuingTransactionUpdatedEventNotification> callback) {
    this.register("v1.issuing_transaction.updated", callback);
    return self();
  }

  public T onV1MandateUpdated(
      EventNotificationCallback<V1MandateUpdatedEventNotification> callback) {
    this.register("v1.mandate.updated", callback);
    return self();
  }

  public T onV1PaymentIntentAmountCapturableUpdated(
      EventNotificationCallback<V1PaymentIntentAmountCapturableUpdatedEventNotification> callback) {
    this.register("v1.payment_intent.amount_capturable_updated", callback);
    return self();
  }

  public T onV1PaymentIntentCanceled(
      EventNotificationCallback<V1PaymentIntentCanceledEventNotification> callback) {
    this.register("v1.payment_intent.canceled", callback);
    return self();
  }

  public T onV1PaymentIntentCreated(
      EventNotificationCallback<V1PaymentIntentCreatedEventNotification> callback) {
    this.register("v1.payment_intent.created", callback);
    return self();
  }

  public T onV1PaymentIntentPartiallyFunded(
      EventNotificationCallback<V1PaymentIntentPartiallyFundedEventNotification> callback) {
    this.register("v1.payment_intent.partially_funded", callback);
    return self();
  }

  public T onV1PaymentIntentPaymentFailed(
      EventNotificationCallback<V1PaymentIntentPaymentFailedEventNotification> callback) {
    this.register("v1.payment_intent.payment_failed", callback);
    return self();
  }

  public T onV1PaymentIntentProcessing(
      EventNotificationCallback<V1PaymentIntentProcessingEventNotification> callback) {
    this.register("v1.payment_intent.processing", callback);
    return self();
  }

  public T onV1PaymentIntentRequiresAction(
      EventNotificationCallback<V1PaymentIntentRequiresActionEventNotification> callback) {
    this.register("v1.payment_intent.requires_action", callback);
    return self();
  }

  public T onV1PaymentIntentSucceeded(
      EventNotificationCallback<V1PaymentIntentSucceededEventNotification> callback) {
    this.register("v1.payment_intent.succeeded", callback);
    return self();
  }

  public T onV1PaymentLinkCreated(
      EventNotificationCallback<V1PaymentLinkCreatedEventNotification> callback) {
    this.register("v1.payment_link.created", callback);
    return self();
  }

  public T onV1PaymentLinkUpdated(
      EventNotificationCallback<V1PaymentLinkUpdatedEventNotification> callback) {
    this.register("v1.payment_link.updated", callback);
    return self();
  }

  public T onV1PaymentMethodAttached(
      EventNotificationCallback<V1PaymentMethodAttachedEventNotification> callback) {
    this.register("v1.payment_method.attached", callback);
    return self();
  }

  public T onV1PaymentMethodAutomaticallyUpdated(
      EventNotificationCallback<V1PaymentMethodAutomaticallyUpdatedEventNotification> callback) {
    this.register("v1.payment_method.automatically_updated", callback);
    return self();
  }

  public T onV1PaymentMethodDetached(
      EventNotificationCallback<V1PaymentMethodDetachedEventNotification> callback) {
    this.register("v1.payment_method.detached", callback);
    return self();
  }

  public T onV1PaymentMethodUpdated(
      EventNotificationCallback<V1PaymentMethodUpdatedEventNotification> callback) {
    this.register("v1.payment_method.updated", callback);
    return self();
  }

  public T onV1PayoutCanceled(
      EventNotificationCallback<V1PayoutCanceledEventNotification> callback) {
    this.register("v1.payout.canceled", callback);
    return self();
  }

  public T onV1PayoutCreated(EventNotificationCallback<V1PayoutCreatedEventNotification> callback) {
    this.register("v1.payout.created", callback);
    return self();
  }

  public T onV1PayoutFailed(EventNotificationCallback<V1PayoutFailedEventNotification> callback) {
    this.register("v1.payout.failed", callback);
    return self();
  }

  public T onV1PayoutPaid(EventNotificationCallback<V1PayoutPaidEventNotification> callback) {
    this.register("v1.payout.paid", callback);
    return self();
  }

  public T onV1PayoutReconciliationCompleted(
      EventNotificationCallback<V1PayoutReconciliationCompletedEventNotification> callback) {
    this.register("v1.payout.reconciliation_completed", callback);
    return self();
  }

  public T onV1PayoutUpdated(EventNotificationCallback<V1PayoutUpdatedEventNotification> callback) {
    this.register("v1.payout.updated", callback);
    return self();
  }

  public T onV1PersonCreated(EventNotificationCallback<V1PersonCreatedEventNotification> callback) {
    this.register("v1.person.created", callback);
    return self();
  }

  public T onV1PersonDeleted(EventNotificationCallback<V1PersonDeletedEventNotification> callback) {
    this.register("v1.person.deleted", callback);
    return self();
  }

  public T onV1PersonUpdated(EventNotificationCallback<V1PersonUpdatedEventNotification> callback) {
    this.register("v1.person.updated", callback);
    return self();
  }

  public T onV1PlanCreated(EventNotificationCallback<V1PlanCreatedEventNotification> callback) {
    this.register("v1.plan.created", callback);
    return self();
  }

  public T onV1PlanDeleted(EventNotificationCallback<V1PlanDeletedEventNotification> callback) {
    this.register("v1.plan.deleted", callback);
    return self();
  }

  public T onV1PlanUpdated(EventNotificationCallback<V1PlanUpdatedEventNotification> callback) {
    this.register("v1.plan.updated", callback);
    return self();
  }

  public T onV1PriceCreated(EventNotificationCallback<V1PriceCreatedEventNotification> callback) {
    this.register("v1.price.created", callback);
    return self();
  }

  public T onV1PriceDeleted(EventNotificationCallback<V1PriceDeletedEventNotification> callback) {
    this.register("v1.price.deleted", callback);
    return self();
  }

  public T onV1PriceUpdated(EventNotificationCallback<V1PriceUpdatedEventNotification> callback) {
    this.register("v1.price.updated", callback);
    return self();
  }

  public T onV1ProductCreated(
      EventNotificationCallback<V1ProductCreatedEventNotification> callback) {
    this.register("v1.product.created", callback);
    return self();
  }

  public T onV1ProductDeleted(
      EventNotificationCallback<V1ProductDeletedEventNotification> callback) {
    this.register("v1.product.deleted", callback);
    return self();
  }

  public T onV1ProductUpdated(
      EventNotificationCallback<V1ProductUpdatedEventNotification> callback) {
    this.register("v1.product.updated", callback);
    return self();
  }

  public T onV1PromotionCodeCreated(
      EventNotificationCallback<V1PromotionCodeCreatedEventNotification> callback) {
    this.register("v1.promotion_code.created", callback);
    return self();
  }

  public T onV1PromotionCodeUpdated(
      EventNotificationCallback<V1PromotionCodeUpdatedEventNotification> callback) {
    this.register("v1.promotion_code.updated", callback);
    return self();
  }

  public T onV1QuoteAccepted(EventNotificationCallback<V1QuoteAcceptedEventNotification> callback) {
    this.register("v1.quote.accepted", callback);
    return self();
  }

  public T onV1QuoteCanceled(EventNotificationCallback<V1QuoteCanceledEventNotification> callback) {
    this.register("v1.quote.canceled", callback);
    return self();
  }

  public T onV1QuoteCreated(EventNotificationCallback<V1QuoteCreatedEventNotification> callback) {
    this.register("v1.quote.created", callback);
    return self();
  }

  public T onV1QuoteFinalized(
      EventNotificationCallback<V1QuoteFinalizedEventNotification> callback) {
    this.register("v1.quote.finalized", callback);
    return self();
  }

  public T onV1RadarEarlyFraudWarningCreated(
      EventNotificationCallback<V1RadarEarlyFraudWarningCreatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.created", callback);
    return self();
  }

  public T onV1RadarEarlyFraudWarningUpdated(
      EventNotificationCallback<V1RadarEarlyFraudWarningUpdatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.updated", callback);
    return self();
  }

  public T onV1RefundCreated(EventNotificationCallback<V1RefundCreatedEventNotification> callback) {
    this.register("v1.refund.created", callback);
    return self();
  }

  public T onV1RefundFailed(EventNotificationCallback<V1RefundFailedEventNotification> callback) {
    this.register("v1.refund.failed", callback);
    return self();
  }

  public T onV1RefundUpdated(EventNotificationCallback<V1RefundUpdatedEventNotification> callback) {
    this.register("v1.refund.updated", callback);
    return self();
  }

  public T onV1ReviewClosed(EventNotificationCallback<V1ReviewClosedEventNotification> callback) {
    this.register("v1.review.closed", callback);
    return self();
  }

  public T onV1ReviewOpened(EventNotificationCallback<V1ReviewOpenedEventNotification> callback) {
    this.register("v1.review.opened", callback);
    return self();
  }

  public T onV1SetupIntentCanceled(
      EventNotificationCallback<V1SetupIntentCanceledEventNotification> callback) {
    this.register("v1.setup_intent.canceled", callback);
    return self();
  }

  public T onV1SetupIntentCreated(
      EventNotificationCallback<V1SetupIntentCreatedEventNotification> callback) {
    this.register("v1.setup_intent.created", callback);
    return self();
  }

  public T onV1SetupIntentRequiresAction(
      EventNotificationCallback<V1SetupIntentRequiresActionEventNotification> callback) {
    this.register("v1.setup_intent.requires_action", callback);
    return self();
  }

  public T onV1SetupIntentSetupFailed(
      EventNotificationCallback<V1SetupIntentSetupFailedEventNotification> callback) {
    this.register("v1.setup_intent.setup_failed", callback);
    return self();
  }

  public T onV1SetupIntentSucceeded(
      EventNotificationCallback<V1SetupIntentSucceededEventNotification> callback) {
    this.register("v1.setup_intent.succeeded", callback);
    return self();
  }

  public T onV1SigmaScheduledQueryRunCreated(
      EventNotificationCallback<V1SigmaScheduledQueryRunCreatedEventNotification> callback) {
    this.register("v1.sigma.scheduled_query_run.created", callback);
    return self();
  }

  public T onV1SourceCanceled(
      EventNotificationCallback<V1SourceCanceledEventNotification> callback) {
    this.register("v1.source.canceled", callback);
    return self();
  }

  public T onV1SourceChargeable(
      EventNotificationCallback<V1SourceChargeableEventNotification> callback) {
    this.register("v1.source.chargeable", callback);
    return self();
  }

  public T onV1SourceFailed(EventNotificationCallback<V1SourceFailedEventNotification> callback) {
    this.register("v1.source.failed", callback);
    return self();
  }

  public T onV1SourceRefundAttributesRequired(
      EventNotificationCallback<V1SourceRefundAttributesRequiredEventNotification> callback) {
    this.register("v1.source.refund_attributes_required", callback);
    return self();
  }

  public T onV1SubscriptionScheduleAborted(
      EventNotificationCallback<V1SubscriptionScheduleAbortedEventNotification> callback) {
    this.register("v1.subscription_schedule.aborted", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCanceled(
      EventNotificationCallback<V1SubscriptionScheduleCanceledEventNotification> callback) {
    this.register("v1.subscription_schedule.canceled", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCompleted(
      EventNotificationCallback<V1SubscriptionScheduleCompletedEventNotification> callback) {
    this.register("v1.subscription_schedule.completed", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCreated(
      EventNotificationCallback<V1SubscriptionScheduleCreatedEventNotification> callback) {
    this.register("v1.subscription_schedule.created", callback);
    return self();
  }

  public T onV1SubscriptionScheduleExpiring(
      EventNotificationCallback<V1SubscriptionScheduleExpiringEventNotification> callback) {
    this.register("v1.subscription_schedule.expiring", callback);
    return self();
  }

  public T onV1SubscriptionScheduleReleased(
      EventNotificationCallback<V1SubscriptionScheduleReleasedEventNotification> callback) {
    this.register("v1.subscription_schedule.released", callback);
    return self();
  }

  public T onV1SubscriptionScheduleUpdated(
      EventNotificationCallback<V1SubscriptionScheduleUpdatedEventNotification> callback) {
    this.register("v1.subscription_schedule.updated", callback);
    return self();
  }

  public T onV1TaxSettingsUpdated(
      EventNotificationCallback<V1TaxSettingsUpdatedEventNotification> callback) {
    this.register("v1.tax.settings.updated", callback);
    return self();
  }

  public T onV1TaxRateCreated(
      EventNotificationCallback<V1TaxRateCreatedEventNotification> callback) {
    this.register("v1.tax_rate.created", callback);
    return self();
  }

  public T onV1TaxRateUpdated(
      EventNotificationCallback<V1TaxRateUpdatedEventNotification> callback) {
    this.register("v1.tax_rate.updated", callback);
    return self();
  }

  public T onV1TerminalReaderActionFailed(
      EventNotificationCallback<V1TerminalReaderActionFailedEventNotification> callback) {
    this.register("v1.terminal.reader.action_failed", callback);
    return self();
  }

  public T onV1TerminalReaderActionSucceeded(
      EventNotificationCallback<V1TerminalReaderActionSucceededEventNotification> callback) {
    this.register("v1.terminal.reader.action_succeeded", callback);
    return self();
  }

  public T onV1TerminalReaderActionUpdated(
      EventNotificationCallback<V1TerminalReaderActionUpdatedEventNotification> callback) {
    this.register("v1.terminal.reader.action_updated", callback);
    return self();
  }

  public T onV1TestHelpersTestClockAdvancing(
      EventNotificationCallback<V1TestHelpersTestClockAdvancingEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.advancing", callback);
    return self();
  }

  public T onV1TestHelpersTestClockCreated(
      EventNotificationCallback<V1TestHelpersTestClockCreatedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.created", callback);
    return self();
  }

  public T onV1TestHelpersTestClockDeleted(
      EventNotificationCallback<V1TestHelpersTestClockDeletedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.deleted", callback);
    return self();
  }

  public T onV1TestHelpersTestClockInternalFailure(
      EventNotificationCallback<V1TestHelpersTestClockInternalFailureEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.internal_failure", callback);
    return self();
  }

  public T onV1TestHelpersTestClockReady(
      EventNotificationCallback<V1TestHelpersTestClockReadyEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.ready", callback);
    return self();
  }

  public T onV1TopupCanceled(EventNotificationCallback<V1TopupCanceledEventNotification> callback) {
    this.register("v1.topup.canceled", callback);
    return self();
  }

  public T onV1TopupCreated(EventNotificationCallback<V1TopupCreatedEventNotification> callback) {
    this.register("v1.topup.created", callback);
    return self();
  }

  public T onV1TopupFailed(EventNotificationCallback<V1TopupFailedEventNotification> callback) {
    this.register("v1.topup.failed", callback);
    return self();
  }

  public T onV1TopupReversed(EventNotificationCallback<V1TopupReversedEventNotification> callback) {
    this.register("v1.topup.reversed", callback);
    return self();
  }

  public T onV1TopupSucceeded(
      EventNotificationCallback<V1TopupSucceededEventNotification> callback) {
    this.register("v1.topup.succeeded", callback);
    return self();
  }

  public T onV1TransferCreated(
      EventNotificationCallback<V1TransferCreatedEventNotification> callback) {
    this.register("v1.transfer.created", callback);
    return self();
  }

  public T onV1TransferReversed(
      EventNotificationCallback<V1TransferReversedEventNotification> callback) {
    this.register("v1.transfer.reversed", callback);
    return self();
  }

  public T onV1TransferUpdated(
      EventNotificationCallback<V1TransferUpdatedEventNotification> callback) {
    this.register("v1.transfer.updated", callback);
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
