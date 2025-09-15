// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.StripeObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 *
 * <p>For internal use by Stripe SDK only.
 */
public final class EventDataClassLookup {
  public static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();
  public static final Map<String, Class<? extends Event>> eventClassLookup = new HashMap<>();

  static {
    classLookup.put("billing.meter", com.stripe.model.billing.Meter.class);

    classLookup.put(
        "financial_address_credit_simulation",
        com.stripe.model.v2.FinancialAddressCreditSimulation.class);
    classLookup.put(
        "financial_address_generated_microdeposits",
        com.stripe.model.v2.FinancialAddressGeneratedMicrodeposits.class);
    classLookup.put("v2.core.event", com.stripe.model.v2.Event.class);
    classLookup.put("v2.core.event_destination", com.stripe.model.v2.EventDestination.class);

    classLookup.put("v2.billing.bill_setting", com.stripe.model.v2.billing.BillSetting.class);
    classLookup.put(
        "v2.billing.bill_setting_version", com.stripe.model.v2.billing.BillSettingVersion.class);
    classLookup.put("v2.billing.cadence", com.stripe.model.v2.billing.Cadence.class);
    classLookup.put(
        "v2.billing.collection_setting", com.stripe.model.v2.billing.CollectionSetting.class);
    classLookup.put(
        "v2.billing.collection_setting_version",
        com.stripe.model.v2.billing.CollectionSettingVersion.class);
    classLookup.put(
        "v2.billing.custom_pricing_unit", com.stripe.model.v2.billing.CustomPricingUnit.class);
    classLookup.put("v2.billing.intent", com.stripe.model.v2.billing.Intent.class);
    classLookup.put("v2.billing.intent_action", com.stripe.model.v2.billing.IntentAction.class);
    classLookup.put("v2.billing.license_fee", com.stripe.model.v2.billing.LicenseFee.class);
    classLookup.put(
        "v2.billing.license_fee_subscription",
        com.stripe.model.v2.billing.LicenseFeeSubscription.class);
    classLookup.put(
        "v2.billing.license_fee_version", com.stripe.model.v2.billing.LicenseFeeVersion.class);
    classLookup.put("v2.billing.licensed_item", com.stripe.model.v2.billing.LicensedItem.class);
    classLookup.put("v2.billing.meter_event", com.stripe.model.v2.billing.MeterEvent.class);
    classLookup.put(
        "v2.billing.meter_event_adjustment",
        com.stripe.model.v2.billing.MeterEventAdjustment.class);
    classLookup.put(
        "v2.billing.meter_event_session", com.stripe.model.v2.billing.MeterEventSession.class);
    classLookup.put("v2.billing.metered_item", com.stripe.model.v2.billing.MeteredItem.class);
    classLookup.put("v2.billing.pricing_plan", com.stripe.model.v2.billing.PricingPlan.class);
    classLookup.put(
        "v2.billing.pricing_plan_component",
        com.stripe.model.v2.billing.PricingPlanComponent.class);
    classLookup.put(
        "v2.billing.pricing_plan_subscription",
        com.stripe.model.v2.billing.PricingPlanSubscription.class);
    classLookup.put(
        "v2.billing.pricing_plan_version", com.stripe.model.v2.billing.PricingPlanVersion.class);
    classLookup.put("v2.billing.profile", com.stripe.model.v2.billing.Profile.class);
    classLookup.put("v2.billing.rate_card", com.stripe.model.v2.billing.RateCard.class);
    classLookup.put("v2.billing.rate_card_rate", com.stripe.model.v2.billing.RateCardRate.class);
    classLookup.put(
        "v2.billing.rate_card_subscription",
        com.stripe.model.v2.billing.RateCardSubscription.class);
    classLookup.put(
        "v2.billing.rate_card_version", com.stripe.model.v2.billing.RateCardVersion.class);
    classLookup.put("v2.billing.service_action", com.stripe.model.v2.billing.ServiceAction.class);

    classLookup.put("v2.core.account", com.stripe.model.v2.core.Account.class);
    classLookup.put("v2.core.account_link", com.stripe.model.v2.core.AccountLink.class);
    classLookup.put("v2.core.account_person", com.stripe.model.v2.core.Person.class);
    classLookup.put("v2.core.claimable_sandbox", com.stripe.model.v2.core.ClaimableSandbox.class);

    classLookup.put(
        "v2.core.vault.gb_bank_account", com.stripe.model.v2.core.vault.GbBankAccount.class);
    classLookup.put(
        "v2.core.vault.us_bank_account", com.stripe.model.v2.core.vault.UsBankAccount.class);

    classLookup.put(
        "v2.money_management.adjustment", com.stripe.model.v2.moneymanagement.Adjustment.class);
    classLookup.put(
        "v2.money_management.financial_account",
        com.stripe.model.v2.moneymanagement.FinancialAccount.class);
    classLookup.put(
        "v2.money_management.financial_address",
        com.stripe.model.v2.moneymanagement.FinancialAddress.class);
    classLookup.put(
        "v2.money_management.inbound_transfer",
        com.stripe.model.v2.moneymanagement.InboundTransfer.class);
    classLookup.put(
        "v2.money_management.outbound_payment",
        com.stripe.model.v2.moneymanagement.OutboundPayment.class);
    classLookup.put(
        "v2.money_management.outbound_payment_quote",
        com.stripe.model.v2.moneymanagement.OutboundPaymentQuote.class);
    classLookup.put(
        "v2.money_management.outbound_setup_intent",
        com.stripe.model.v2.moneymanagement.OutboundSetupIntent.class);
    classLookup.put(
        "v2.money_management.outbound_transfer",
        com.stripe.model.v2.moneymanagement.OutboundTransfer.class);
    classLookup.put(
        "v2.money_management.payout_method",
        com.stripe.model.v2.moneymanagement.PayoutMethod.class);
    classLookup.put(
        "v2.money_management.payout_methods_bank_account_spec",
        com.stripe.model.v2.moneymanagement.PayoutMethodsBankAccountSpec.class);
    classLookup.put(
        "v2.money_management.received_credit",
        com.stripe.model.v2.moneymanagement.ReceivedCredit.class);
    classLookup.put(
        "v2.money_management.received_debit",
        com.stripe.model.v2.moneymanagement.ReceivedDebit.class);
    classLookup.put(
        "v2.money_management.transaction", com.stripe.model.v2.moneymanagement.Transaction.class);
    classLookup.put(
        "v2.money_management.transaction_entry",
        com.stripe.model.v2.moneymanagement.TransactionEntry.class);

    classLookup.put(
        "v2.payments.off_session_payment", com.stripe.model.v2.payments.OffSessionPayment.class);

    classLookup.put("v2.reporting.report", com.stripe.model.v2.reporting.Report.class);
    classLookup.put("v2.reporting.report_run", com.stripe.model.v2.reporting.ReportRun.class);

    classLookup.put("v2.tax.automatic_rule", com.stripe.model.v2.tax.AutomaticRule.class);

    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found", com.stripe.events.V1BillingMeterNoMeterFoundEvent.class);
    eventClassLookup.put(
        "v2.billing.cadence.billed", com.stripe.events.V2BillingCadenceBilledEvent.class);
    eventClassLookup.put(
        "v2.billing.cadence.canceled", com.stripe.events.V2BillingCadenceCanceledEvent.class);
    eventClassLookup.put(
        "v2.billing.cadence.created", com.stripe.events.V2BillingCadenceCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.license_fee.created", com.stripe.events.V2BillingLicenseFeeCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.license_fee.updated", com.stripe.events.V2BillingLicenseFeeUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.license_fee_version.created",
        com.stripe.events.V2BillingLicenseFeeVersionCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.licensed_item.created",
        com.stripe.events.V2BillingLicensedItemCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.licensed_item.updated",
        com.stripe.events.V2BillingLicensedItemUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.metered_item.created",
        com.stripe.events.V2BillingMeteredItemCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.metered_item.updated",
        com.stripe.events.V2BillingMeteredItemUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan.created",
        com.stripe.events.V2BillingPricingPlanCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan.updated",
        com.stripe.events.V2BillingPricingPlanUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_component.created",
        com.stripe.events.V2BillingPricingPlanComponentCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_component.updated",
        com.stripe.events.V2BillingPricingPlanComponentUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_awaiting_customer_action",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEvent
            .class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_current",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionCurrentEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_past_due",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPastDueEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_paused",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPausedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_unpaid",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionUnpaidEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_activated",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingActivatedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_canceled",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingCanceledEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_paused",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingPausedEvent.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_version.created",
        com.stripe.events.V2BillingPricingPlanVersionCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card.created", com.stripe.events.V2BillingRateCardCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card.updated", com.stripe.events.V2BillingRateCardUpdatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_rate.created",
        com.stripe.events.V2BillingRateCardRateCreatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.activated",
        com.stripe.events.V2BillingRateCardSubscriptionActivatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.canceled",
        com.stripe.events.V2BillingRateCardSubscriptionCanceledEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_awaiting_customer_action",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_current",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionCurrentEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_past_due",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionPastDueEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_paused",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionPausedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_unpaid",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionUnpaidEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_activated",
        com.stripe.events.V2BillingRateCardSubscriptionServicingActivatedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_canceled",
        com.stripe.events.V2BillingRateCardSubscriptionServicingCanceledEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_paused",
        com.stripe.events.V2BillingRateCardSubscriptionServicingPausedEvent.class);
    eventClassLookup.put(
        "v2.billing.rate_card_version.created",
        com.stripe.events.V2BillingRateCardVersionCreatedEvent.class);
    eventClassLookup.put(
        "v2.core.account.closed", com.stripe.events.V2CoreAccountClosedEvent.class);
    eventClassLookup.put(
        "v2.core.account.created", com.stripe.events.V2CoreAccountCreatedEvent.class);
    eventClassLookup.put(
        "v2.core.account.updated", com.stripe.events.V2CoreAccountUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[configuration.storer].capability_status_updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.storer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationStorerUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[defaults].updated",
        com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[identity].updated",
        com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[requirements].updated",
        com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account_link.returned", com.stripe.events.V2CoreAccountLinkReturnedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.created", com.stripe.events.V2CoreAccountPersonCreatedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.deleted", com.stripe.events.V2CoreAccountPersonDeletedEvent.class);
    eventClassLookup.put(
        "v2.core.account_person.updated", com.stripe.events.V2CoreAccountPersonUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.event_destination.ping", com.stripe.events.V2CoreEventDestinationPingEvent.class);
    eventClassLookup.put(
        "v2.core.health.api_error.firing", com.stripe.events.V2CoreHealthApiErrorFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.api_error.resolved",
        com.stripe.events.V2CoreHealthApiErrorResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.api_latency.firing",
        com.stripe.events.V2CoreHealthApiLatencyFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.api_latency.resolved",
        com.stripe.events.V2CoreHealthApiLatencyResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.authorization_rate_drop.firing",
        com.stripe.events.V2CoreHealthAuthorizationRateDropFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.authorization_rate_drop.resolved",
        com.stripe.events.V2CoreHealthAuthorizationRateDropResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.event_generation_failure.resolved",
        com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.fraud_rate.increased",
        com.stripe.events.V2CoreHealthFraudRateIncreasedEvent.class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_timeout.firing",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_timeout.resolved",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.payment_method_error.firing",
        com.stripe.events.V2CoreHealthPaymentMethodErrorFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.payment_method_error.resolved",
        com.stripe.events.V2CoreHealthPaymentMethodErrorResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.traffic_volume_drop.firing",
        com.stripe.events.V2CoreHealthTrafficVolumeDropFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.traffic_volume_drop.resolved",
        com.stripe.events.V2CoreHealthTrafficVolumeDropResolvedEvent.class);
    eventClassLookup.put(
        "v2.core.health.webhook_latency.firing",
        com.stripe.events.V2CoreHealthWebhookLatencyFiringEvent.class);
    eventClassLookup.put(
        "v2.core.health.webhook_latency.resolved",
        com.stripe.events.V2CoreHealthWebhookLatencyResolvedEvent.class);
    eventClassLookup.put(
        "v2.money_management.adjustment.created",
        com.stripe.events.V2MoneyManagementAdjustmentCreatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.financial_account.created",
        com.stripe.events.V2MoneyManagementFinancialAccountCreatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.financial_account.updated",
        com.stripe.events.V2MoneyManagementFinancialAccountUpdatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.financial_address.activated",
        com.stripe.events.V2MoneyManagementFinancialAddressActivatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.financial_address.failed",
        com.stripe.events.V2MoneyManagementFinancialAddressFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.available",
        com.stripe.events.V2MoneyManagementInboundTransferAvailableEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_failed",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_processing",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitProcessingEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_queued",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitQueuedEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_returned",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitReturnedEvent.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_succeeded",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitSucceededEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.canceled",
        com.stripe.events.V2MoneyManagementOutboundPaymentCanceledEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.created",
        com.stripe.events.V2MoneyManagementOutboundPaymentCreatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.failed",
        com.stripe.events.V2MoneyManagementOutboundPaymentFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.posted",
        com.stripe.events.V2MoneyManagementOutboundPaymentPostedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.returned",
        com.stripe.events.V2MoneyManagementOutboundPaymentReturnedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.updated",
        com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.canceled",
        com.stripe.events.V2MoneyManagementOutboundTransferCanceledEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.created",
        com.stripe.events.V2MoneyManagementOutboundTransferCreatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.failed",
        com.stripe.events.V2MoneyManagementOutboundTransferFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.posted",
        com.stripe.events.V2MoneyManagementOutboundTransferPostedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.returned",
        com.stripe.events.V2MoneyManagementOutboundTransferReturnedEvent.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.updated",
        com.stripe.events.V2MoneyManagementOutboundTransferUpdatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.payout_method.updated",
        com.stripe.events.V2MoneyManagementPayoutMethodUpdatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.available",
        com.stripe.events.V2MoneyManagementReceivedCreditAvailableEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.failed",
        com.stripe.events.V2MoneyManagementReceivedCreditFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.returned",
        com.stripe.events.V2MoneyManagementReceivedCreditReturnedEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.succeeded",
        com.stripe.events.V2MoneyManagementReceivedCreditSucceededEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.canceled",
        com.stripe.events.V2MoneyManagementReceivedDebitCanceledEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.failed",
        com.stripe.events.V2MoneyManagementReceivedDebitFailedEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.pending",
        com.stripe.events.V2MoneyManagementReceivedDebitPendingEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.succeeded",
        com.stripe.events.V2MoneyManagementReceivedDebitSucceededEvent.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.updated",
        com.stripe.events.V2MoneyManagementReceivedDebitUpdatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.transaction.created",
        com.stripe.events.V2MoneyManagementTransactionCreatedEvent.class);
    eventClassLookup.put(
        "v2.money_management.transaction.updated",
        com.stripe.events.V2MoneyManagementTransactionUpdatedEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.authorization_attempt_failed",
        com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.authorization_attempt_started",
        com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.canceled",
        com.stripe.events.V2PaymentsOffSessionPaymentCanceledEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.created",
        com.stripe.events.V2PaymentsOffSessionPaymentCreatedEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.failed",
        com.stripe.events.V2PaymentsOffSessionPaymentFailedEvent.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.succeeded",
        com.stripe.events.V2PaymentsOffSessionPaymentSucceededEvent.class);
    eventClassLookup.put(
        "v2.reporting.report_run.created",
        com.stripe.events.V2ReportingReportRunCreatedEvent.class);
    eventClassLookup.put(
        "v2.reporting.report_run.failed", com.stripe.events.V2ReportingReportRunFailedEvent.class);
    eventClassLookup.put(
        "v2.reporting.report_run.succeeded",
        com.stripe.events.V2ReportingReportRunSucceededEvent.class);
    eventClassLookup.put(
        "v2.reporting.report_run.updated",
        com.stripe.events.V2ReportingReportRunUpdatedEvent.class);
  }
}
