// File generated from our OpenAPI spec
package com.stripe.model.v2;

import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.Event;
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
    classLookup.put("account", com.stripe.model.Account.class);
    classLookup.put("application_fee", com.stripe.model.ApplicationFee.class);
    classLookup.put("balance", com.stripe.model.Balance.class);
    classLookup.put("balance_settings", com.stripe.model.BalanceSettings.class);
    classLookup.put("capability", com.stripe.model.Capability.class);
    classLookup.put("cash_balance", com.stripe.model.CashBalance.class);
    classLookup.put("charge", com.stripe.model.Charge.class);
    classLookup.put("coupon", com.stripe.model.Coupon.class);
    classLookup.put("credit_note", com.stripe.model.CreditNote.class);
    classLookup.put("customer", com.stripe.model.Customer.class);
    classLookup.put(
        "customer_cash_balance_transaction", com.stripe.model.CustomerCashBalanceTransaction.class);
    classLookup.put("discount", com.stripe.model.Discount.class);
    classLookup.put("dispute", com.stripe.model.Dispute.class);
    classLookup.put("fee_refund", com.stripe.model.FeeRefund.class);
    classLookup.put("file", com.stripe.model.File.class);
    classLookup.put("invoice", com.stripe.model.Invoice.class);
    classLookup.put("invoice_payment", com.stripe.model.InvoicePayment.class);
    classLookup.put("invoiceitem", com.stripe.model.InvoiceItem.class);
    classLookup.put("mandate", com.stripe.model.Mandate.class);
    classLookup.put("payment_intent", com.stripe.model.PaymentIntent.class);
    classLookup.put("payment_link", com.stripe.model.PaymentLink.class);
    classLookup.put("payment_method", com.stripe.model.PaymentMethod.class);
    classLookup.put("payout", com.stripe.model.Payout.class);
    classLookup.put("person", com.stripe.model.Person.class);
    classLookup.put("plan", com.stripe.model.Plan.class);
    classLookup.put("price", com.stripe.model.Price.class);
    classLookup.put("product", com.stripe.model.Product.class);
    classLookup.put("promotion_code", com.stripe.model.PromotionCode.class);
    classLookup.put("quote", com.stripe.model.Quote.class);
    classLookup.put("refund", com.stripe.model.Refund.class);
    classLookup.put("review", com.stripe.model.Review.class);
    classLookup.put("setup_intent", com.stripe.model.SetupIntent.class);
    classLookup.put("source", com.stripe.model.Source.class);
    classLookup.put("subscription", com.stripe.model.Subscription.class);
    classLookup.put("subscription_schedule", com.stripe.model.SubscriptionSchedule.class);
    classLookup.put("tax_id", com.stripe.model.TaxId.class);
    classLookup.put("tax_rate", com.stripe.model.TaxRate.class);
    classLookup.put("topup", com.stripe.model.Topup.class);
    classLookup.put("transfer", com.stripe.model.Transfer.class);

    classLookup.put("billing.alert", com.stripe.model.billing.Alert.class);
    classLookup.put(
        "billing.credit_balance_transaction",
        com.stripe.model.billing.CreditBalanceTransaction.class);
    classLookup.put("billing.credit_grant", com.stripe.model.billing.CreditGrant.class);
    classLookup.put("billing.meter", com.stripe.model.billing.Meter.class);

    classLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);

    classLookup.put("checkout.session", com.stripe.model.checkout.Session.class);

    classLookup.put("climate.order", com.stripe.model.climate.Order.class);
    classLookup.put("climate.product", com.stripe.model.climate.Product.class);

    classLookup.put(
        "financial_connections.account", com.stripe.model.financialconnections.Account.class);

    classLookup.put(
        "identity.verification_session", com.stripe.model.identity.VerificationSession.class);

    classLookup.put("issuing.authorization", com.stripe.model.issuing.Authorization.class);
    classLookup.put("issuing.card", com.stripe.model.issuing.Card.class);
    classLookup.put("issuing.cardholder", com.stripe.model.issuing.Cardholder.class);
    classLookup.put("issuing.dispute", com.stripe.model.issuing.Dispute.class);
    classLookup.put(
        "issuing.personalization_design", com.stripe.model.issuing.PersonalizationDesign.class);
    classLookup.put("issuing.token", com.stripe.model.issuing.Token.class);
    classLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);

    classLookup.put("radar.early_fraud_warning", com.stripe.model.radar.EarlyFraudWarning.class);

    classLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);

    classLookup.put("tax.settings", com.stripe.model.tax.Settings.class);

    classLookup.put("terminal.reader", com.stripe.model.terminal.Reader.class);

    classLookup.put("test_helpers.test_clock", com.stripe.model.testhelpers.TestClock.class);

    classLookup.put("v2.billing.meter_event", com.stripe.model.v2.billing.MeterEvent.class);
    classLookup.put(
        "v2.billing.meter_event_adjustment",
        com.stripe.model.v2.billing.MeterEventAdjustment.class);
    classLookup.put(
        "v2.billing.meter_event_session", com.stripe.model.v2.billing.MeterEventSession.class);

    classLookup.put(
        "v2.commerce.product_catalog_import",
        com.stripe.model.v2.commerce.ProductCatalogImport.class);

    classLookup.put("v2.core.account", com.stripe.model.v2.core.Account.class);
    classLookup.put("v2.core.account_link", com.stripe.model.v2.core.AccountLink.class);
    classLookup.put("v2.core.account_person", com.stripe.model.v2.core.AccountPerson.class);
    classLookup.put(
        "v2.core.account_person_token", com.stripe.model.v2.core.AccountPersonToken.class);
    classLookup.put("v2.core.account_token", com.stripe.model.v2.core.AccountToken.class);
    classLookup.put("v2.core.event", com.stripe.model.v2.core.Event.class);
    classLookup.put("v2.core.event_destination", com.stripe.model.v2.core.EventDestination.class);

    eventClassLookup.put(
        "v1.account.application.authorized",
        com.stripe.events.V1AccountApplicationAuthorizedEvent.class);
    eventClassLookup.put(
        "v1.account.application.deauthorized",
        com.stripe.events.V1AccountApplicationDeauthorizedEvent.class);
    eventClassLookup.put(
        "v1.account.external_account.created",
        com.stripe.events.V1AccountExternalAccountCreatedEvent.class);
    eventClassLookup.put(
        "v1.account.external_account.deleted",
        com.stripe.events.V1AccountExternalAccountDeletedEvent.class);
    eventClassLookup.put(
        "v1.account.external_account.updated",
        com.stripe.events.V1AccountExternalAccountUpdatedEvent.class);
    eventClassLookup.put("v1.account.updated", com.stripe.events.V1AccountUpdatedEvent.class);
    eventClassLookup.put(
        "v1.application_fee.created", com.stripe.events.V1ApplicationFeeCreatedEvent.class);
    eventClassLookup.put(
        "v1.application_fee.refund.updated",
        com.stripe.events.V1ApplicationFeeRefundUpdatedEvent.class);
    eventClassLookup.put(
        "v1.application_fee.refunded", com.stripe.events.V1ApplicationFeeRefundedEvent.class);
    eventClassLookup.put("v1.balance.available", com.stripe.events.V1BalanceAvailableEvent.class);
    eventClassLookup.put(
        "v1.balance_settings.updated", com.stripe.events.V1BalanceSettingsUpdatedEvent.class);
    eventClassLookup.put(
        "v1.billing.alert.triggered", com.stripe.events.V1BillingAlertTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.credit_balance_transaction.created",
        com.stripe.events.V1BillingCreditBalanceTransactionCreatedEvent.class);
    eventClassLookup.put(
        "v1.billing.credit_grant.created",
        com.stripe.events.V1BillingCreditGrantCreatedEvent.class);
    eventClassLookup.put(
        "v1.billing.credit_grant.updated",
        com.stripe.events.V1BillingCreditGrantUpdatedEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.created", com.stripe.events.V1BillingMeterCreatedEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.deactivated", com.stripe.events.V1BillingMeterDeactivatedEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.error_report_triggered",
        com.stripe.events.V1BillingMeterErrorReportTriggeredEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.no_meter_found", com.stripe.events.V1BillingMeterNoMeterFoundEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.reactivated", com.stripe.events.V1BillingMeterReactivatedEvent.class);
    eventClassLookup.put(
        "v1.billing.meter.updated", com.stripe.events.V1BillingMeterUpdatedEvent.class);
    eventClassLookup.put(
        "v1.billing_portal.configuration.created",
        com.stripe.events.V1BillingPortalConfigurationCreatedEvent.class);
    eventClassLookup.put(
        "v1.billing_portal.configuration.updated",
        com.stripe.events.V1BillingPortalConfigurationUpdatedEvent.class);
    eventClassLookup.put(
        "v1.billing_portal.session.created",
        com.stripe.events.V1BillingPortalSessionCreatedEvent.class);
    eventClassLookup.put("v1.capability.updated", com.stripe.events.V1CapabilityUpdatedEvent.class);
    eventClassLookup.put(
        "v1.cash_balance.funds_available",
        com.stripe.events.V1CashBalanceFundsAvailableEvent.class);
    eventClassLookup.put("v1.charge.captured", com.stripe.events.V1ChargeCapturedEvent.class);
    eventClassLookup.put(
        "v1.charge.dispute.closed", com.stripe.events.V1ChargeDisputeClosedEvent.class);
    eventClassLookup.put(
        "v1.charge.dispute.created", com.stripe.events.V1ChargeDisputeCreatedEvent.class);
    eventClassLookup.put(
        "v1.charge.dispute.funds_reinstated",
        com.stripe.events.V1ChargeDisputeFundsReinstatedEvent.class);
    eventClassLookup.put(
        "v1.charge.dispute.funds_withdrawn",
        com.stripe.events.V1ChargeDisputeFundsWithdrawnEvent.class);
    eventClassLookup.put(
        "v1.charge.dispute.updated", com.stripe.events.V1ChargeDisputeUpdatedEvent.class);
    eventClassLookup.put("v1.charge.expired", com.stripe.events.V1ChargeExpiredEvent.class);
    eventClassLookup.put("v1.charge.failed", com.stripe.events.V1ChargeFailedEvent.class);
    eventClassLookup.put("v1.charge.pending", com.stripe.events.V1ChargePendingEvent.class);
    eventClassLookup.put(
        "v1.charge.refund.updated", com.stripe.events.V1ChargeRefundUpdatedEvent.class);
    eventClassLookup.put("v1.charge.refunded", com.stripe.events.V1ChargeRefundedEvent.class);
    eventClassLookup.put("v1.charge.succeeded", com.stripe.events.V1ChargeSucceededEvent.class);
    eventClassLookup.put("v1.charge.updated", com.stripe.events.V1ChargeUpdatedEvent.class);
    eventClassLookup.put(
        "v1.checkout.session.async_payment_failed",
        com.stripe.events.V1CheckoutSessionAsyncPaymentFailedEvent.class);
    eventClassLookup.put(
        "v1.checkout.session.async_payment_succeeded",
        com.stripe.events.V1CheckoutSessionAsyncPaymentSucceededEvent.class);
    eventClassLookup.put(
        "v1.checkout.session.completed", com.stripe.events.V1CheckoutSessionCompletedEvent.class);
    eventClassLookup.put(
        "v1.checkout.session.expired", com.stripe.events.V1CheckoutSessionExpiredEvent.class);
    eventClassLookup.put(
        "v1.climate.order.canceled", com.stripe.events.V1ClimateOrderCanceledEvent.class);
    eventClassLookup.put(
        "v1.climate.order.created", com.stripe.events.V1ClimateOrderCreatedEvent.class);
    eventClassLookup.put(
        "v1.climate.order.delayed", com.stripe.events.V1ClimateOrderDelayedEvent.class);
    eventClassLookup.put(
        "v1.climate.order.delivered", com.stripe.events.V1ClimateOrderDeliveredEvent.class);
    eventClassLookup.put(
        "v1.climate.order.product_substituted",
        com.stripe.events.V1ClimateOrderProductSubstitutedEvent.class);
    eventClassLookup.put(
        "v1.climate.product.created", com.stripe.events.V1ClimateProductCreatedEvent.class);
    eventClassLookup.put(
        "v1.climate.product.pricing_updated",
        com.stripe.events.V1ClimateProductPricingUpdatedEvent.class);
    eventClassLookup.put("v1.coupon.created", com.stripe.events.V1CouponCreatedEvent.class);
    eventClassLookup.put("v1.coupon.deleted", com.stripe.events.V1CouponDeletedEvent.class);
    eventClassLookup.put("v1.coupon.updated", com.stripe.events.V1CouponUpdatedEvent.class);
    eventClassLookup.put(
        "v1.credit_note.created", com.stripe.events.V1CreditNoteCreatedEvent.class);
    eventClassLookup.put(
        "v1.credit_note.updated", com.stripe.events.V1CreditNoteUpdatedEvent.class);
    eventClassLookup.put("v1.credit_note.voided", com.stripe.events.V1CreditNoteVoidedEvent.class);
    eventClassLookup.put("v1.customer.created", com.stripe.events.V1CustomerCreatedEvent.class);
    eventClassLookup.put("v1.customer.deleted", com.stripe.events.V1CustomerDeletedEvent.class);
    eventClassLookup.put(
        "v1.customer.discount.created", com.stripe.events.V1CustomerDiscountCreatedEvent.class);
    eventClassLookup.put(
        "v1.customer.discount.deleted", com.stripe.events.V1CustomerDiscountDeletedEvent.class);
    eventClassLookup.put(
        "v1.customer.discount.updated", com.stripe.events.V1CustomerDiscountUpdatedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.created",
        com.stripe.events.V1CustomerSubscriptionCreatedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.deleted",
        com.stripe.events.V1CustomerSubscriptionDeletedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.paused",
        com.stripe.events.V1CustomerSubscriptionPausedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.pending_update_applied",
        com.stripe.events.V1CustomerSubscriptionPendingUpdateAppliedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.pending_update_expired",
        com.stripe.events.V1CustomerSubscriptionPendingUpdateExpiredEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.resumed",
        com.stripe.events.V1CustomerSubscriptionResumedEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.trial_will_end",
        com.stripe.events.V1CustomerSubscriptionTrialWillEndEvent.class);
    eventClassLookup.put(
        "v1.customer.subscription.updated",
        com.stripe.events.V1CustomerSubscriptionUpdatedEvent.class);
    eventClassLookup.put(
        "v1.customer.tax_id.created", com.stripe.events.V1CustomerTaxIdCreatedEvent.class);
    eventClassLookup.put(
        "v1.customer.tax_id.deleted", com.stripe.events.V1CustomerTaxIdDeletedEvent.class);
    eventClassLookup.put(
        "v1.customer.tax_id.updated", com.stripe.events.V1CustomerTaxIdUpdatedEvent.class);
    eventClassLookup.put("v1.customer.updated", com.stripe.events.V1CustomerUpdatedEvent.class);
    eventClassLookup.put(
        "v1.customer_cash_balance_transaction.created",
        com.stripe.events.V1CustomerCashBalanceTransactionCreatedEvent.class);
    eventClassLookup.put(
        "v1.entitlements.active_entitlement_summary.updated",
        com.stripe.events.V1EntitlementsActiveEntitlementSummaryUpdatedEvent.class);
    eventClassLookup.put("v1.file.created", com.stripe.events.V1FileCreatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.account_numbers_updated",
        com.stripe.events.V1FinancialConnectionsAccountAccountNumbersUpdatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.created",
        com.stripe.events.V1FinancialConnectionsAccountCreatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.deactivated",
        com.stripe.events.V1FinancialConnectionsAccountDeactivatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.disconnected",
        com.stripe.events.V1FinancialConnectionsAccountDisconnectedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.expected_deactivation_date_updated",
        com.stripe.events.V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.reactivated",
        com.stripe.events.V1FinancialConnectionsAccountReactivatedEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_balance",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedBalanceEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_ownership",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedOwnershipEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.refreshed_transactions",
        com.stripe.events.V1FinancialConnectionsAccountRefreshedTransactionsEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.supported_payment_method_types_updated",
        com.stripe.events.V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEvent
            .class);
    eventClassLookup.put(
        "v1.financial_connections.account.upcoming_account_number_expiry",
        com.stripe.events.V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEvent.class);
    eventClassLookup.put(
        "v1.financial_connections.account.upcoming_deactivation",
        com.stripe.events.V1FinancialConnectionsAccountUpcomingDeactivationEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.canceled",
        com.stripe.events.V1IdentityVerificationSessionCanceledEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.created",
        com.stripe.events.V1IdentityVerificationSessionCreatedEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.processing",
        com.stripe.events.V1IdentityVerificationSessionProcessingEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.redacted",
        com.stripe.events.V1IdentityVerificationSessionRedactedEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.requires_input",
        com.stripe.events.V1IdentityVerificationSessionRequiresInputEvent.class);
    eventClassLookup.put(
        "v1.identity.verification_session.verified",
        com.stripe.events.V1IdentityVerificationSessionVerifiedEvent.class);
    eventClassLookup.put("v1.invoice.created", com.stripe.events.V1InvoiceCreatedEvent.class);
    eventClassLookup.put("v1.invoice.deleted", com.stripe.events.V1InvoiceDeletedEvent.class);
    eventClassLookup.put(
        "v1.invoice.finalization_failed", com.stripe.events.V1InvoiceFinalizationFailedEvent.class);
    eventClassLookup.put("v1.invoice.finalized", com.stripe.events.V1InvoiceFinalizedEvent.class);
    eventClassLookup.put(
        "v1.invoice.marked_uncollectible",
        com.stripe.events.V1InvoiceMarkedUncollectibleEvent.class);
    eventClassLookup.put("v1.invoice.overdue", com.stripe.events.V1InvoiceOverdueEvent.class);
    eventClassLookup.put("v1.invoice.overpaid", com.stripe.events.V1InvoiceOverpaidEvent.class);
    eventClassLookup.put("v1.invoice.paid", com.stripe.events.V1InvoicePaidEvent.class);
    eventClassLookup.put(
        "v1.invoice.payment_action_required",
        com.stripe.events.V1InvoicePaymentActionRequiredEvent.class);
    eventClassLookup.put(
        "v1.invoice.payment_attempt_required",
        com.stripe.events.V1InvoicePaymentAttemptRequiredEvent.class);
    eventClassLookup.put(
        "v1.invoice.payment_failed", com.stripe.events.V1InvoicePaymentFailedEvent.class);
    eventClassLookup.put(
        "v1.invoice.payment_succeeded", com.stripe.events.V1InvoicePaymentSucceededEvent.class);
    eventClassLookup.put("v1.invoice.sent", com.stripe.events.V1InvoiceSentEvent.class);
    eventClassLookup.put("v1.invoice.upcoming", com.stripe.events.V1InvoiceUpcomingEvent.class);
    eventClassLookup.put("v1.invoice.updated", com.stripe.events.V1InvoiceUpdatedEvent.class);
    eventClassLookup.put("v1.invoice.voided", com.stripe.events.V1InvoiceVoidedEvent.class);
    eventClassLookup.put("v1.invoice.will_be_due", com.stripe.events.V1InvoiceWillBeDueEvent.class);
    eventClassLookup.put(
        "v1.invoice_payment.paid", com.stripe.events.V1InvoicePaymentPaidEvent.class);
    eventClassLookup.put(
        "v1.invoiceitem.created", com.stripe.events.V1InvoiceitemCreatedEvent.class);
    eventClassLookup.put(
        "v1.invoiceitem.deleted", com.stripe.events.V1InvoiceitemDeletedEvent.class);
    eventClassLookup.put(
        "v1.issuing_authorization.created",
        com.stripe.events.V1IssuingAuthorizationCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_authorization.request",
        com.stripe.events.V1IssuingAuthorizationRequestEvent.class);
    eventClassLookup.put(
        "v1.issuing_authorization.updated",
        com.stripe.events.V1IssuingAuthorizationUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_card.created", com.stripe.events.V1IssuingCardCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_card.updated", com.stripe.events.V1IssuingCardUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_cardholder.created", com.stripe.events.V1IssuingCardholderCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_cardholder.updated", com.stripe.events.V1IssuingCardholderUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.closed", com.stripe.events.V1IssuingDisputeClosedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.created", com.stripe.events.V1IssuingDisputeCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.funds_reinstated",
        com.stripe.events.V1IssuingDisputeFundsReinstatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.funds_rescinded",
        com.stripe.events.V1IssuingDisputeFundsRescindedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.submitted", com.stripe.events.V1IssuingDisputeSubmittedEvent.class);
    eventClassLookup.put(
        "v1.issuing_dispute.updated", com.stripe.events.V1IssuingDisputeUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.activated",
        com.stripe.events.V1IssuingPersonalizationDesignActivatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.deactivated",
        com.stripe.events.V1IssuingPersonalizationDesignDeactivatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.rejected",
        com.stripe.events.V1IssuingPersonalizationDesignRejectedEvent.class);
    eventClassLookup.put(
        "v1.issuing_personalization_design.updated",
        com.stripe.events.V1IssuingPersonalizationDesignUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_token.created", com.stripe.events.V1IssuingTokenCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_token.updated", com.stripe.events.V1IssuingTokenUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_transaction.created", com.stripe.events.V1IssuingTransactionCreatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_transaction.purchase_details_receipt_updated",
        com.stripe.events.V1IssuingTransactionPurchaseDetailsReceiptUpdatedEvent.class);
    eventClassLookup.put(
        "v1.issuing_transaction.updated", com.stripe.events.V1IssuingTransactionUpdatedEvent.class);
    eventClassLookup.put("v1.mandate.updated", com.stripe.events.V1MandateUpdatedEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.amount_capturable_updated",
        com.stripe.events.V1PaymentIntentAmountCapturableUpdatedEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.canceled", com.stripe.events.V1PaymentIntentCanceledEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.created", com.stripe.events.V1PaymentIntentCreatedEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.partially_funded",
        com.stripe.events.V1PaymentIntentPartiallyFundedEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.payment_failed",
        com.stripe.events.V1PaymentIntentPaymentFailedEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.processing", com.stripe.events.V1PaymentIntentProcessingEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.requires_action",
        com.stripe.events.V1PaymentIntentRequiresActionEvent.class);
    eventClassLookup.put(
        "v1.payment_intent.succeeded", com.stripe.events.V1PaymentIntentSucceededEvent.class);
    eventClassLookup.put(
        "v1.payment_link.created", com.stripe.events.V1PaymentLinkCreatedEvent.class);
    eventClassLookup.put(
        "v1.payment_link.updated", com.stripe.events.V1PaymentLinkUpdatedEvent.class);
    eventClassLookup.put(
        "v1.payment_method.attached", com.stripe.events.V1PaymentMethodAttachedEvent.class);
    eventClassLookup.put(
        "v1.payment_method.automatically_updated",
        com.stripe.events.V1PaymentMethodAutomaticallyUpdatedEvent.class);
    eventClassLookup.put(
        "v1.payment_method.detached", com.stripe.events.V1PaymentMethodDetachedEvent.class);
    eventClassLookup.put(
        "v1.payment_method.updated", com.stripe.events.V1PaymentMethodUpdatedEvent.class);
    eventClassLookup.put("v1.payout.canceled", com.stripe.events.V1PayoutCanceledEvent.class);
    eventClassLookup.put("v1.payout.created", com.stripe.events.V1PayoutCreatedEvent.class);
    eventClassLookup.put("v1.payout.failed", com.stripe.events.V1PayoutFailedEvent.class);
    eventClassLookup.put("v1.payout.paid", com.stripe.events.V1PayoutPaidEvent.class);
    eventClassLookup.put(
        "v1.payout.reconciliation_completed",
        com.stripe.events.V1PayoutReconciliationCompletedEvent.class);
    eventClassLookup.put("v1.payout.updated", com.stripe.events.V1PayoutUpdatedEvent.class);
    eventClassLookup.put("v1.person.created", com.stripe.events.V1PersonCreatedEvent.class);
    eventClassLookup.put("v1.person.deleted", com.stripe.events.V1PersonDeletedEvent.class);
    eventClassLookup.put("v1.person.updated", com.stripe.events.V1PersonUpdatedEvent.class);
    eventClassLookup.put("v1.plan.created", com.stripe.events.V1PlanCreatedEvent.class);
    eventClassLookup.put("v1.plan.deleted", com.stripe.events.V1PlanDeletedEvent.class);
    eventClassLookup.put("v1.plan.updated", com.stripe.events.V1PlanUpdatedEvent.class);
    eventClassLookup.put("v1.price.created", com.stripe.events.V1PriceCreatedEvent.class);
    eventClassLookup.put("v1.price.deleted", com.stripe.events.V1PriceDeletedEvent.class);
    eventClassLookup.put("v1.price.updated", com.stripe.events.V1PriceUpdatedEvent.class);
    eventClassLookup.put("v1.product.created", com.stripe.events.V1ProductCreatedEvent.class);
    eventClassLookup.put("v1.product.deleted", com.stripe.events.V1ProductDeletedEvent.class);
    eventClassLookup.put("v1.product.updated", com.stripe.events.V1ProductUpdatedEvent.class);
    eventClassLookup.put(
        "v1.promotion_code.created", com.stripe.events.V1PromotionCodeCreatedEvent.class);
    eventClassLookup.put(
        "v1.promotion_code.updated", com.stripe.events.V1PromotionCodeUpdatedEvent.class);
    eventClassLookup.put("v1.quote.accepted", com.stripe.events.V1QuoteAcceptedEvent.class);
    eventClassLookup.put("v1.quote.canceled", com.stripe.events.V1QuoteCanceledEvent.class);
    eventClassLookup.put("v1.quote.created", com.stripe.events.V1QuoteCreatedEvent.class);
    eventClassLookup.put("v1.quote.finalized", com.stripe.events.V1QuoteFinalizedEvent.class);
    eventClassLookup.put(
        "v1.radar.early_fraud_warning.created",
        com.stripe.events.V1RadarEarlyFraudWarningCreatedEvent.class);
    eventClassLookup.put(
        "v1.radar.early_fraud_warning.updated",
        com.stripe.events.V1RadarEarlyFraudWarningUpdatedEvent.class);
    eventClassLookup.put("v1.refund.created", com.stripe.events.V1RefundCreatedEvent.class);
    eventClassLookup.put("v1.refund.failed", com.stripe.events.V1RefundFailedEvent.class);
    eventClassLookup.put("v1.refund.updated", com.stripe.events.V1RefundUpdatedEvent.class);
    eventClassLookup.put("v1.review.closed", com.stripe.events.V1ReviewClosedEvent.class);
    eventClassLookup.put("v1.review.opened", com.stripe.events.V1ReviewOpenedEvent.class);
    eventClassLookup.put(
        "v1.setup_intent.canceled", com.stripe.events.V1SetupIntentCanceledEvent.class);
    eventClassLookup.put(
        "v1.setup_intent.created", com.stripe.events.V1SetupIntentCreatedEvent.class);
    eventClassLookup.put(
        "v1.setup_intent.requires_action",
        com.stripe.events.V1SetupIntentRequiresActionEvent.class);
    eventClassLookup.put(
        "v1.setup_intent.setup_failed", com.stripe.events.V1SetupIntentSetupFailedEvent.class);
    eventClassLookup.put(
        "v1.setup_intent.succeeded", com.stripe.events.V1SetupIntentSucceededEvent.class);
    eventClassLookup.put(
        "v1.sigma.scheduled_query_run.created",
        com.stripe.events.V1SigmaScheduledQueryRunCreatedEvent.class);
    eventClassLookup.put("v1.source.canceled", com.stripe.events.V1SourceCanceledEvent.class);
    eventClassLookup.put("v1.source.chargeable", com.stripe.events.V1SourceChargeableEvent.class);
    eventClassLookup.put("v1.source.failed", com.stripe.events.V1SourceFailedEvent.class);
    eventClassLookup.put(
        "v1.source.refund_attributes_required",
        com.stripe.events.V1SourceRefundAttributesRequiredEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.aborted",
        com.stripe.events.V1SubscriptionScheduleAbortedEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.canceled",
        com.stripe.events.V1SubscriptionScheduleCanceledEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.completed",
        com.stripe.events.V1SubscriptionScheduleCompletedEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.created",
        com.stripe.events.V1SubscriptionScheduleCreatedEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.expiring",
        com.stripe.events.V1SubscriptionScheduleExpiringEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.released",
        com.stripe.events.V1SubscriptionScheduleReleasedEvent.class);
    eventClassLookup.put(
        "v1.subscription_schedule.updated",
        com.stripe.events.V1SubscriptionScheduleUpdatedEvent.class);
    eventClassLookup.put(
        "v1.tax.settings.updated", com.stripe.events.V1TaxSettingsUpdatedEvent.class);
    eventClassLookup.put("v1.tax_rate.created", com.stripe.events.V1TaxRateCreatedEvent.class);
    eventClassLookup.put("v1.tax_rate.updated", com.stripe.events.V1TaxRateUpdatedEvent.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_failed",
        com.stripe.events.V1TerminalReaderActionFailedEvent.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_succeeded",
        com.stripe.events.V1TerminalReaderActionSucceededEvent.class);
    eventClassLookup.put(
        "v1.terminal.reader.action_updated",
        com.stripe.events.V1TerminalReaderActionUpdatedEvent.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.advancing",
        com.stripe.events.V1TestHelpersTestClockAdvancingEvent.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.created",
        com.stripe.events.V1TestHelpersTestClockCreatedEvent.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.deleted",
        com.stripe.events.V1TestHelpersTestClockDeletedEvent.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.internal_failure",
        com.stripe.events.V1TestHelpersTestClockInternalFailureEvent.class);
    eventClassLookup.put(
        "v1.test_helpers.test_clock.ready",
        com.stripe.events.V1TestHelpersTestClockReadyEvent.class);
    eventClassLookup.put("v1.topup.canceled", com.stripe.events.V1TopupCanceledEvent.class);
    eventClassLookup.put("v1.topup.created", com.stripe.events.V1TopupCreatedEvent.class);
    eventClassLookup.put("v1.topup.failed", com.stripe.events.V1TopupFailedEvent.class);
    eventClassLookup.put("v1.topup.reversed", com.stripe.events.V1TopupReversedEvent.class);
    eventClassLookup.put("v1.topup.succeeded", com.stripe.events.V1TopupSucceededEvent.class);
    eventClassLookup.put("v1.transfer.created", com.stripe.events.V1TransferCreatedEvent.class);
    eventClassLookup.put("v1.transfer.reversed", com.stripe.events.V1TransferReversedEvent.class);
    eventClassLookup.put("v1.transfer.updated", com.stripe.events.V1TransferUpdatedEvent.class);
    eventClassLookup.put(
        "v2.commerce.product_catalog.imports.failed",
        com.stripe.events.V2CommerceProductCatalogImportsFailedEvent.class);
    eventClassLookup.put(
        "v2.commerce.product_catalog.imports.processing",
        com.stripe.events.V2CommerceProductCatalogImportsProcessingEvent.class);
    eventClassLookup.put(
        "v2.commerce.product_catalog.imports.succeeded",
        com.stripe.events.V2CommerceProductCatalogImportsSucceededEvent.class);
    eventClassLookup.put(
        "v2.commerce.product_catalog.imports.succeeded_with_errors",
        com.stripe.events.V2CommerceProductCatalogImportsSucceededWithErrorsEvent.class);
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
        "v2.core.account[defaults].updated",
        com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEvent.class);
    eventClassLookup.put(
        "v2.core.account[future_requirements].updated",
        com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEvent.class);
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
  }
}
