// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.v2.core.EventNotification;
import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 *
 * <p>For internal use by Stripe SDK only.
 */
public final class EventNotificationClassLookup {
  public static final Map<String, Class<? extends EventNotification>> eventClassLookup =
      new HashMap<>();

  static {
    eventClassLookup.put(
        "v1.account.updated", com.stripe.events.V1AccountUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.application_fee.created",
        com.stripe.events.V1ApplicationFeeCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.application_fee.refunded",
        com.stripe.events.V1ApplicationFeeRefundedEventNotification.class);
    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found",
        com.stripe.events.V1BillingMeterNoMeterFoundEventNotification.class);
    eventClassLookup.put(
        "v1.billing_portal.configuration.created",
        com.stripe.events.V1BillingPortalConfigurationCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.billing_portal.configuration.updated",
        com.stripe.events.V1BillingPortalConfigurationUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.capability.updated", com.stripe.events.V1CapabilityUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.captured", com.stripe.events.V1ChargeCapturedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.dispute.closed", com.stripe.events.V1ChargeDisputeClosedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.dispute.created",
        com.stripe.events.V1ChargeDisputeCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.dispute.funds_reinstated",
        com.stripe.events.V1ChargeDisputeFundsReinstatedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.dispute.funds_withdrawn",
        com.stripe.events.V1ChargeDisputeFundsWithdrawnEventNotification.class);
    eventClassLookup.put(
        "v1.charge.dispute.updated",
        com.stripe.events.V1ChargeDisputeUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.expired", com.stripe.events.V1ChargeExpiredEventNotification.class);
    eventClassLookup.put(
        "v1.charge.failed", com.stripe.events.V1ChargeFailedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.pending", com.stripe.events.V1ChargePendingEventNotification.class);
    eventClassLookup.put(
        "v1.charge.refund.updated", com.stripe.events.V1ChargeRefundUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.refunded", com.stripe.events.V1ChargeRefundedEventNotification.class);
    eventClassLookup.put(
        "v1.charge.succeeded", com.stripe.events.V1ChargeSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.charge.updated", com.stripe.events.V1ChargeUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.checkout.session.async_payment_failed",
        com.stripe.events.V1CheckoutSessionAsyncPaymentFailedEventNotification.class);
    eventClassLookup.put(
        "v1.checkout.session.async_payment_succeeded",
        com.stripe.events.V1CheckoutSessionAsyncPaymentSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.checkout.session.completed",
        com.stripe.events.V1CheckoutSessionCompletedEventNotification.class);
    eventClassLookup.put(
        "v1.checkout.session.expired",
        com.stripe.events.V1CheckoutSessionExpiredEventNotification.class);
    eventClassLookup.put(
        "v1.climate.order.canceled",
        com.stripe.events.V1ClimateOrderCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.climate.order.created", com.stripe.events.V1ClimateOrderCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.climate.order.delayed", com.stripe.events.V1ClimateOrderDelayedEventNotification.class);
    eventClassLookup.put(
        "v1.climate.order.delivered",
        com.stripe.events.V1ClimateOrderDeliveredEventNotification.class);
    eventClassLookup.put(
        "v1.climate.order.product_substituted",
        com.stripe.events.V1ClimateOrderProductSubstitutedEventNotification.class);
    eventClassLookup.put(
        "v1.climate.product.created",
        com.stripe.events.V1ClimateProductCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.climate.product.pricing_updated",
        com.stripe.events.V1ClimateProductPricingUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.coupon.created", com.stripe.events.V1CouponCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.coupon.deleted", com.stripe.events.V1CouponDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.coupon.updated", com.stripe.events.V1CouponUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.credit_note.created", com.stripe.events.V1CreditNoteCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.credit_note.updated", com.stripe.events.V1CreditNoteUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.credit_note.voided", com.stripe.events.V1CreditNoteVoidedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.created", com.stripe.events.V1CustomerCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.deleted", com.stripe.events.V1CustomerDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.created",
        com.stripe.events.V1CustomerSubscriptionCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.deleted",
        com.stripe.events.V1CustomerSubscriptionDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.paused",
        com.stripe.events.V1CustomerSubscriptionPausedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.pending_update_applied",
        com.stripe.events.V1CustomerSubscriptionPendingUpdateAppliedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.pending_update_expired",
        com.stripe.events.V1CustomerSubscriptionPendingUpdateExpiredEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.resumed",
        com.stripe.events.V1CustomerSubscriptionResumedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.trial_will_end",
        com.stripe.events.V1CustomerSubscriptionTrialWillEndEventNotification.class);
    eventClassLookup.put(
        "v1.customer.subscription.updated",
        com.stripe.events.V1CustomerSubscriptionUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.tax_id.created",
        com.stripe.events.V1CustomerTaxIdCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.tax_id.deleted",
        com.stripe.events.V1CustomerTaxIdDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.tax_id.updated",
        com.stripe.events.V1CustomerTaxIdUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.customer.updated", com.stripe.events.V1CustomerUpdatedEventNotification.class);
    eventClassLookup.put("v1.file.created", com.stripe.events.V1FileCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.created",
        com.stripe.events.V1FinancialConnectionsAccountCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.deactivated",
        com.stripe.events.V1FinancialConnectionsAccountDeactivatedEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.disconnected",
        com.stripe.events.V1FinancialConnectionsAccountDisconnectedEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.reactivated",
        com.stripe.events.V1FinancialConnectionsAccountReactivatedEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_balance",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedBalanceEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_ownership",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedOwnershipEventNotification.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_transactions",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedTransactionsEventNotification
            .class);
    eventClassLookup.put(
        "v1.identity.verification_session.canceled",
        com.stripe.events.V1IdentityVerificationSessionCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.identity.verification_session.created",
        com.stripe.events.V1IdentityVerificationSessionCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.identity.verification_session.processing",
        com.stripe.events.V1IdentityVerificationSessionProcessingEventNotification.class);
    eventClassLookup.put(
        "v1.identity.verification_session.redacted",
        com.stripe.events.V1IdentityVerificationSessionRedactedEventNotification.class);
    eventClassLookup.put(
        "v1.identity.verification_session.requires_input",
        com.stripe.events.V1IdentityVerificationSessionRequiresInputEventNotification.class);
    eventClassLookup.put(
        "v1.identity.verification_session.verified",
        com.stripe.events.V1IdentityVerificationSessionVerifiedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.created", com.stripe.events.V1InvoiceCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.deleted", com.stripe.events.V1InvoiceDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.finalization_failed",
        com.stripe.events.V1InvoiceFinalizationFailedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.finalized", com.stripe.events.V1InvoiceFinalizedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.marked_uncollectible",
        com.stripe.events.V1InvoiceMarkedUncollectibleEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.overdue", com.stripe.events.V1InvoiceOverdueEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.overpaid", com.stripe.events.V1InvoiceOverpaidEventNotification.class);
    eventClassLookup.put("v1.invoice.paid", com.stripe.events.V1InvoicePaidEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.payment_action_required",
        com.stripe.events.V1InvoicePaymentActionRequiredEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.payment_failed",
        com.stripe.events.V1InvoicePaymentFailedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.payment_succeeded",
        com.stripe.events.V1InvoicePaymentSucceededEventNotification.class);
    eventClassLookup.put("v1.invoice.sent", com.stripe.events.V1InvoiceSentEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.upcoming", com.stripe.events.V1InvoiceUpcomingEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.updated", com.stripe.events.V1InvoiceUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.voided", com.stripe.events.V1InvoiceVoidedEventNotification.class);
    eventClassLookup.put(
        "v1.invoice.will_be_due", com.stripe.events.V1InvoiceWillBeDueEventNotification.class);
    eventClassLookup.put(
        "v1.invoice_payment.paid", com.stripe.events.V1InvoicePaymentPaidEventNotification.class);
    eventClassLookup.put(
        "v1.invoiceitem.created", com.stripe.events.V1InvoiceitemCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.invoiceitem.deleted", com.stripe.events.V1InvoiceitemDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_authorization.created",
        com.stripe.events.V1IssuingAuthorizationCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_authorization.request",
        com.stripe.events.V1IssuingAuthorizationRequestEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_authorization.updated",
        com.stripe.events.V1IssuingAuthorizationUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_card.created", com.stripe.events.V1IssuingCardCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_card.updated", com.stripe.events.V1IssuingCardUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_cardholder.created",
        com.stripe.events.V1IssuingCardholderCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_cardholder.updated",
        com.stripe.events.V1IssuingCardholderUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.closed",
        com.stripe.events.V1IssuingDisputeClosedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.created",
        com.stripe.events.V1IssuingDisputeCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.funds_reinstated",
        com.stripe.events.V1IssuingDisputeFundsReinstatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.funds_rescinded",
        com.stripe.events.V1IssuingDisputeFundsRescindedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.submitted",
        com.stripe.events.V1IssuingDisputeSubmittedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_dispute.updated",
        com.stripe.events.V1IssuingDisputeUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.activated",
        com.stripe.events.V1IssuingPersonalizationDesignActivatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.deactivated",
        com.stripe.events.V1IssuingPersonalizationDesignDeactivatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.rejected",
        com.stripe.events.V1IssuingPersonalizationDesignRejectedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.updated",
        com.stripe.events.V1IssuingPersonalizationDesignUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_token.created", com.stripe.events.V1IssuingTokenCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_token.updated", com.stripe.events.V1IssuingTokenUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_transaction.created",
        com.stripe.events.V1IssuingTransactionCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_transaction.purchase_details_receipt_updated",
        com.stripe.events.V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.issuing_transaction.updated",
        com.stripe.events.V1IssuingTransactionUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.mandate.updated", com.stripe.events.V1MandateUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.amount_capturable_updated",
        com.stripe.events.V1PaymentIntentAmountCapturableUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.canceled",
        com.stripe.events.V1PaymentIntentCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.created",
        com.stripe.events.V1PaymentIntentCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.partially_funded",
        com.stripe.events.V1PaymentIntentPartiallyFundedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.payment_failed",
        com.stripe.events.V1PaymentIntentPaymentFailedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.processing",
        com.stripe.events.V1PaymentIntentProcessingEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.requires_action",
        com.stripe.events.V1PaymentIntentRequiresActionEventNotification.class);
    eventClassLookup.put(
        "v1.payment_intent.succeeded",
        com.stripe.events.V1PaymentIntentSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.payment_link.created", com.stripe.events.V1PaymentLinkCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_link.updated", com.stripe.events.V1PaymentLinkUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_method.attached",
        com.stripe.events.V1PaymentMethodAttachedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_method.automatically_updated",
        com.stripe.events.V1PaymentMethodAutomaticallyUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_method.detached",
        com.stripe.events.V1PaymentMethodDetachedEventNotification.class);
    eventClassLookup.put(
        "v1.payment_method.updated",
        com.stripe.events.V1PaymentMethodUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.payout.canceled", com.stripe.events.V1PayoutCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.payout.created", com.stripe.events.V1PayoutCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.payout.failed", com.stripe.events.V1PayoutFailedEventNotification.class);
    eventClassLookup.put("v1.payout.paid", com.stripe.events.V1PayoutPaidEventNotification.class);
    eventClassLookup.put(
        "v1.payout.reconciliation_completed",
        com.stripe.events.V1PayoutReconciliationCompletedEventNotification.class);
    eventClassLookup.put(
        "v1.payout.updated", com.stripe.events.V1PayoutUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.person.created", com.stripe.events.V1PersonCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.person.deleted", com.stripe.events.V1PersonDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.person.updated", com.stripe.events.V1PersonUpdatedEventNotification.class);
    eventClassLookup.put("v1.plan.created", com.stripe.events.V1PlanCreatedEventNotification.class);
    eventClassLookup.put("v1.plan.deleted", com.stripe.events.V1PlanDeletedEventNotification.class);
    eventClassLookup.put("v1.plan.updated", com.stripe.events.V1PlanUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.price.created", com.stripe.events.V1PriceCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.price.deleted", com.stripe.events.V1PriceDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.price.updated", com.stripe.events.V1PriceUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.product.created", com.stripe.events.V1ProductCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.product.deleted", com.stripe.events.V1ProductDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.product.updated", com.stripe.events.V1ProductUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.promotion_code.created",
        com.stripe.events.V1PromotionCodeCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.promotion_code.updated",
        com.stripe.events.V1PromotionCodeUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.quote.accepted", com.stripe.events.V1QuoteAcceptedEventNotification.class);
    eventClassLookup.put(
        "v1.quote.canceled", com.stripe.events.V1QuoteCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.quote.created", com.stripe.events.V1QuoteCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.quote.finalized", com.stripe.events.V1QuoteFinalizedEventNotification.class);
    eventClassLookup.put(
        "v1.radar.early_fraud_warning.created",
        com.stripe.events.V1RadarEarlyFraudWarningCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.radar.early_fraud_warning.updated",
        com.stripe.events.V1RadarEarlyFraudWarningUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.refund.created", com.stripe.events.V1RefundCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.refund.failed", com.stripe.events.V1RefundFailedEventNotification.class);
    eventClassLookup.put(
        "v1.refund.updated", com.stripe.events.V1RefundUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.review.closed", com.stripe.events.V1ReviewClosedEventNotification.class);
    eventClassLookup.put(
        "v1.review.opened", com.stripe.events.V1ReviewOpenedEventNotification.class);
    eventClassLookup.put(
        "v1.setup_intent.canceled", com.stripe.events.V1SetupIntentCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.setup_intent.created", com.stripe.events.V1SetupIntentCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.setup_intent.requires_action",
        com.stripe.events.V1SetupIntentRequiresActionEventNotification.class);
    eventClassLookup.put(
        "v1.setup_intent.setup_failed",
        com.stripe.events.V1SetupIntentSetupFailedEventNotification.class);
    eventClassLookup.put(
        "v1.setup_intent.succeeded",
        com.stripe.events.V1SetupIntentSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.sigma.scheduled_query_run.created",
        com.stripe.events.V1SigmaScheduledQueryRunCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.source.canceled", com.stripe.events.V1SourceCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.source.chargeable", com.stripe.events.V1SourceChargeableEventNotification.class);
    eventClassLookup.put(
        "v1.source.failed", com.stripe.events.V1SourceFailedEventNotification.class);
    eventClassLookup.put(
        "v1.source.refund_attributes_required",
        com.stripe.events.V1SourceRefundAttributesRequiredEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.aborted",
        com.stripe.events.V1SubscriptionScheduleAbortedEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.canceled",
        com.stripe.events.V1SubscriptionScheduleCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.completed",
        com.stripe.events.V1SubscriptionScheduleCompletedEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.created",
        com.stripe.events.V1SubscriptionScheduleCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.expiring",
        com.stripe.events.V1SubscriptionScheduleExpiringEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.released",
        com.stripe.events.V1SubscriptionScheduleReleasedEventNotification.class);
    eventClassLookup.put(
        "v1.subscription_schedule.updated",
        com.stripe.events.V1SubscriptionScheduleUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.tax_rate.created", com.stripe.events.V1TaxRateCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.tax_rate.updated", com.stripe.events.V1TaxRateUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_failed",
        com.stripe.events.V1TerminalReaderActionFailedEventNotification.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_succeeded",
        com.stripe.events.V1TerminalReaderActionSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_updated",
        com.stripe.events.V1TerminalReaderActionUpdatedEventNotification.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.advancing",
        com.stripe.events.V1TestHelpersTestClockAdvancingEventNotification.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.created",
        com.stripe.events.V1TestHelpersTestClockCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.deleted",
        com.stripe.events.V1TestHelpersTestClockDeletedEventNotification.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.internal_failure",
        com.stripe.events.V1TestHelpersTestClockInternalFailureEventNotification.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.ready",
        com.stripe.events.V1TestHelpersTestClockReadyEventNotification.class);
    eventClassLookup.put(
        "v1.topup.canceled", com.stripe.events.V1TopupCanceledEventNotification.class);
    eventClassLookup.put(
        "v1.topup.created", com.stripe.events.V1TopupCreatedEventNotification.class);
    eventClassLookup.put("v1.topup.failed", com.stripe.events.V1TopupFailedEventNotification.class);
    eventClassLookup.put(
        "v1.topup.reversed", com.stripe.events.V1TopupReversedEventNotification.class);
    eventClassLookup.put(
        "v1.topup.succeeded", com.stripe.events.V1TopupSucceededEventNotification.class);
    eventClassLookup.put(
        "v1.transfer.created", com.stripe.events.V1TransferCreatedEventNotification.class);
    eventClassLookup.put(
        "v1.transfer.reversed", com.stripe.events.V1TransferReversedEventNotification.class);
    eventClassLookup.put(
        "v1.transfer.updated", com.stripe.events.V1TransferUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.cadence.billed",
        com.stripe.events.V2BillingCadenceBilledEventNotification.class);
    eventClassLookup.put(
        "v2.billing.cadence.canceled",
        com.stripe.events.V2BillingCadenceCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.billing.cadence.created",
        com.stripe.events.V2BillingCadenceCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.license_fee.created",
        com.stripe.events.V2BillingLicenseFeeCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.license_fee.updated",
        com.stripe.events.V2BillingLicenseFeeUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.license_fee_version.created",
        com.stripe.events.V2BillingLicenseFeeVersionCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.licensed_item.created",
        com.stripe.events.V2BillingLicensedItemCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.licensed_item.updated",
        com.stripe.events.V2BillingLicensedItemUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.metered_item.created",
        com.stripe.events.V2BillingMeteredItemCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.metered_item.updated",
        com.stripe.events.V2BillingMeteredItemUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan.created",
        com.stripe.events.V2BillingPricingPlanCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan.updated",
        com.stripe.events.V2BillingPricingPlanUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_component.created",
        com.stripe.events.V2BillingPricingPlanComponentCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_component.updated",
        com.stripe.events.V2BillingPricingPlanComponentUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_awaiting_customer_action",
        com.stripe.events
            .V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEventNotification
            .class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_current",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionCurrentEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_past_due",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPastDueEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_paused",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPausedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.collection_unpaid",
        com.stripe.events.V2BillingPricingPlanSubscriptionCollectionUnpaidEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_activated",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingActivatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_canceled",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_subscription.servicing_paused",
        com.stripe.events.V2BillingPricingPlanSubscriptionServicingPausedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.pricing_plan_version.created",
        com.stripe.events.V2BillingPricingPlanVersionCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card.created",
        com.stripe.events.V2BillingRateCardCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card.updated",
        com.stripe.events.V2BillingRateCardUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_rate.created",
        com.stripe.events.V2BillingRateCardRateCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.activated",
        com.stripe.events.V2BillingRateCardSubscriptionActivatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.canceled",
        com.stripe.events.V2BillingRateCardSubscriptionCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_awaiting_customer_action",
        com.stripe.events
            .V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_current",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionCurrentEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_past_due",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionPastDueEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_paused",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionPausedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.collection_unpaid",
        com.stripe.events.V2BillingRateCardSubscriptionCollectionUnpaidEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_activated",
        com.stripe.events.V2BillingRateCardSubscriptionServicingActivatedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_canceled",
        com.stripe.events.V2BillingRateCardSubscriptionServicingCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_subscription.servicing_paused",
        com.stripe.events.V2BillingRateCardSubscriptionServicingPausedEventNotification.class);
    eventClassLookup.put(
        "v2.billing.rate_card_version.created",
        com.stripe.events.V2BillingRateCardVersionCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account.closed", com.stripe.events.V2CoreAccountClosedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account.created", com.stripe.events.V2CoreAccountCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account.updated", com.stripe.events.V2CoreAccountUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.customer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.merchant].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.recipient].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.storer].capability_status_updated",
        com.stripe.events
            .V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.account[configuration.storer].updated",
        com.stripe.events.V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[defaults].updated",
        com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[identity].updated",
        com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account[requirements].updated",
        com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_link.returned",
        com.stripe.events.V2CoreAccountLinkReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.created",
        com.stripe.events.V2CoreAccountPersonCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.deleted",
        com.stripe.events.V2CoreAccountPersonDeletedEventNotification.class);
    eventClassLookup.put(
        "v2.core.account_person.updated",
        com.stripe.events.V2CoreAccountPersonUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.claimable_sandbox.claimed",
        com.stripe.events.V2CoreClaimableSandboxClaimedEventNotification.class);
    eventClassLookup.put(
        "v2.core.claimable_sandbox.created",
        com.stripe.events.V2CoreClaimableSandboxCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.core.claimable_sandbox.expired",
        com.stripe.events.V2CoreClaimableSandboxExpiredEventNotification.class);
    eventClassLookup.put(
        "v2.core.claimable_sandbox.expiring",
        com.stripe.events.V2CoreClaimableSandboxExpiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.claimable_sandbox.sandbox_details_owner_account_updated",
        com.stripe.events.V2CoreClaimableSandboxSandboxDetailsOwnerAccountUpdatedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.event_destination.ping",
        com.stripe.events.V2CoreEventDestinationPingEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.api_error.firing",
        com.stripe.events.V2CoreHealthApiErrorFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.api_error.resolved",
        com.stripe.events.V2CoreHealthApiErrorResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.api_latency.firing",
        com.stripe.events.V2CoreHealthApiLatencyFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.api_latency.resolved",
        com.stripe.events.V2CoreHealthApiLatencyResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.authorization_rate_drop.firing",
        com.stripe.events.V2CoreHealthAuthorizationRateDropFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.authorization_rate_drop.resolved",
        com.stripe.events.V2CoreHealthAuthorizationRateDropResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.event_generation_failure.resolved",
        com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.fraud_rate.increased",
        com.stripe.events.V2CoreHealthFraudRateIncreasedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_errors.firing",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsFiringEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_errors.resolved",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_timeout.firing",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.health.issuing_authorization_request_timeout.resolved",
        com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification
            .class);
    eventClassLookup.put(
        "v2.core.health.payment_method_error.firing",
        com.stripe.events.V2CoreHealthPaymentMethodErrorFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.payment_method_error.resolved",
        com.stripe.events.V2CoreHealthPaymentMethodErrorResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.traffic_volume_drop.firing",
        com.stripe.events.V2CoreHealthTrafficVolumeDropFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.traffic_volume_drop.resolved",
        com.stripe.events.V2CoreHealthTrafficVolumeDropResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.webhook_latency.firing",
        com.stripe.events.V2CoreHealthWebhookLatencyFiringEventNotification.class);
    eventClassLookup.put(
        "v2.core.health.webhook_latency.resolved",
        com.stripe.events.V2CoreHealthWebhookLatencyResolvedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.adjustment.created",
        com.stripe.events.V2MoneyManagementAdjustmentCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.financial_account.created",
        com.stripe.events.V2MoneyManagementFinancialAccountCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.financial_account.updated",
        com.stripe.events.V2MoneyManagementFinancialAccountUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.financial_address.activated",
        com.stripe.events.V2MoneyManagementFinancialAddressActivatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.financial_address.failed",
        com.stripe.events.V2MoneyManagementFinancialAddressFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.available",
        com.stripe.events.V2MoneyManagementInboundTransferAvailableEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_failed",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_processing",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitProcessingEventNotification
            .class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_queued",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitQueuedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_returned",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.inbound_transfer.bank_debit_succeeded",
        com.stripe.events.V2MoneyManagementInboundTransferBankDebitSucceededEventNotification
            .class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.canceled",
        com.stripe.events.V2MoneyManagementOutboundPaymentCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.created",
        com.stripe.events.V2MoneyManagementOutboundPaymentCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.failed",
        com.stripe.events.V2MoneyManagementOutboundPaymentFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.posted",
        com.stripe.events.V2MoneyManagementOutboundPaymentPostedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.returned",
        com.stripe.events.V2MoneyManagementOutboundPaymentReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_payment.updated",
        com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.canceled",
        com.stripe.events.V2MoneyManagementOutboundTransferCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.created",
        com.stripe.events.V2MoneyManagementOutboundTransferCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.failed",
        com.stripe.events.V2MoneyManagementOutboundTransferFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.posted",
        com.stripe.events.V2MoneyManagementOutboundTransferPostedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.returned",
        com.stripe.events.V2MoneyManagementOutboundTransferReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.outbound_transfer.updated",
        com.stripe.events.V2MoneyManagementOutboundTransferUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.payout_method.updated",
        com.stripe.events.V2MoneyManagementPayoutMethodUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.available",
        com.stripe.events.V2MoneyManagementReceivedCreditAvailableEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.failed",
        com.stripe.events.V2MoneyManagementReceivedCreditFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.returned",
        com.stripe.events.V2MoneyManagementReceivedCreditReturnedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_credit.succeeded",
        com.stripe.events.V2MoneyManagementReceivedCreditSucceededEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.canceled",
        com.stripe.events.V2MoneyManagementReceivedDebitCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.failed",
        com.stripe.events.V2MoneyManagementReceivedDebitFailedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.pending",
        com.stripe.events.V2MoneyManagementReceivedDebitPendingEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.succeeded",
        com.stripe.events.V2MoneyManagementReceivedDebitSucceededEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.received_debit.updated",
        com.stripe.events.V2MoneyManagementReceivedDebitUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.recipient_verification.created",
        com.stripe.events.V2MoneyManagementRecipientVerificationCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.recipient_verification.updated",
        com.stripe.events.V2MoneyManagementRecipientVerificationUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.transaction.created",
        com.stripe.events.V2MoneyManagementTransactionCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.money_management.transaction.updated",
        com.stripe.events.V2MoneyManagementTransactionUpdatedEventNotification.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.authorization_attempt_failed",
        com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEventNotification
            .class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.authorization_attempt_started",
        com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEventNotification
            .class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.canceled",
        com.stripe.events.V2PaymentsOffSessionPaymentCanceledEventNotification.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.created",
        com.stripe.events.V2PaymentsOffSessionPaymentCreatedEventNotification.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.failed",
        com.stripe.events.V2PaymentsOffSessionPaymentFailedEventNotification.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.requires_capture",
        com.stripe.events.V2PaymentsOffSessionPaymentRequiresCaptureEventNotification.class);
    eventClassLookup.put(
        "v2.payments.off_session_payment.succeeded",
        com.stripe.events.V2PaymentsOffSessionPaymentSucceededEventNotification.class);
  }
}
