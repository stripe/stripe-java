// File generated from our OpenAPI spec
package com.stripe.model;

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

  static {
    classLookup.put("account", com.stripe.model.Account.class);
    classLookup.put("account_link", com.stripe.model.AccountLink.class);
    classLookup.put("account_session", com.stripe.model.AccountSession.class);
    classLookup.put("apple_pay_domain", com.stripe.model.ApplePayDomain.class);
    classLookup.put("application", com.stripe.model.Application.class);
    classLookup.put("application_fee", com.stripe.model.ApplicationFee.class);
    classLookup.put("balance", com.stripe.model.Balance.class);
    classLookup.put("balance_settings", com.stripe.model.BalanceSettings.class);
    classLookup.put("balance_transaction", com.stripe.model.BalanceTransaction.class);
    classLookup.put("bank_account", com.stripe.model.BankAccount.class);
    classLookup.put("capability", com.stripe.model.Capability.class);
    classLookup.put("card", com.stripe.model.Card.class);
    classLookup.put("cash_balance", com.stripe.model.CashBalance.class);
    classLookup.put("charge", com.stripe.model.Charge.class);
    classLookup.put("confirmation_token", com.stripe.model.ConfirmationToken.class);
    classLookup.put(
        "connect_collection_transfer", com.stripe.model.ConnectCollectionTransfer.class);
    classLookup.put("country_spec", com.stripe.model.CountrySpec.class);
    classLookup.put("coupon", com.stripe.model.Coupon.class);
    classLookup.put("credit_note", com.stripe.model.CreditNote.class);
    classLookup.put("credit_note_line_item", com.stripe.model.CreditNoteLineItem.class);
    classLookup.put("customer", com.stripe.model.Customer.class);
    classLookup.put(
        "customer_balance_transaction", com.stripe.model.CustomerBalanceTransaction.class);
    classLookup.put(
        "customer_cash_balance_transaction", com.stripe.model.CustomerCashBalanceTransaction.class);
    classLookup.put("customer_session", com.stripe.model.CustomerSession.class);
    classLookup.put("discount", com.stripe.model.Discount.class);
    classLookup.put("dispute", com.stripe.model.Dispute.class);
    classLookup.put("ephemeral_key", com.stripe.model.EphemeralKey.class);
    classLookup.put("event", com.stripe.model.Event.class);
    classLookup.put("exchange_rate", com.stripe.model.ExchangeRate.class);
    classLookup.put("fee_refund", com.stripe.model.FeeRefund.class);
    classLookup.put("file", com.stripe.model.File.class);
    classLookup.put("file_link", com.stripe.model.FileLink.class);
    classLookup.put("funding_instructions", com.stripe.model.FundingInstructions.class);
    classLookup.put("invoice", com.stripe.model.Invoice.class);
    classLookup.put("invoice_payment", com.stripe.model.InvoicePayment.class);
    classLookup.put("invoice_rendering_template", com.stripe.model.InvoiceRenderingTemplate.class);
    classLookup.put("invoiceitem", com.stripe.model.InvoiceItem.class);
    classLookup.put("item", com.stripe.model.LineItem.class);
    classLookup.put("line_item", com.stripe.model.InvoiceLineItem.class);
    classLookup.put("login_link", com.stripe.model.LoginLink.class);
    classLookup.put("mandate", com.stripe.model.Mandate.class);
    classLookup.put("payment_attempt_record", com.stripe.model.PaymentAttemptRecord.class);
    classLookup.put("payment_intent", com.stripe.model.PaymentIntent.class);
    classLookup.put(
        "payment_intent_amount_details_line_item",
        com.stripe.model.PaymentIntentAmountDetailsLineItem.class);
    classLookup.put("payment_link", com.stripe.model.PaymentLink.class);
    classLookup.put("payment_method", com.stripe.model.PaymentMethod.class);
    classLookup.put(
        "payment_method_configuration", com.stripe.model.PaymentMethodConfiguration.class);
    classLookup.put("payment_method_domain", com.stripe.model.PaymentMethodDomain.class);
    classLookup.put("payment_record", com.stripe.model.PaymentRecord.class);
    classLookup.put("payout", com.stripe.model.Payout.class);
    classLookup.put("person", com.stripe.model.Person.class);
    classLookup.put("plan", com.stripe.model.Plan.class);
    classLookup.put("price", com.stripe.model.Price.class);
    classLookup.put("product", com.stripe.model.Product.class);
    classLookup.put("product_feature", com.stripe.model.ProductFeature.class);
    classLookup.put("promotion_code", com.stripe.model.PromotionCode.class);
    classLookup.put("quote", com.stripe.model.Quote.class);
    classLookup.put("refund", com.stripe.model.Refund.class);
    classLookup.put("reserve_transaction", com.stripe.model.ReserveTransaction.class);
    classLookup.put("review", com.stripe.model.Review.class);
    classLookup.put("setup_attempt", com.stripe.model.SetupAttempt.class);
    classLookup.put("setup_intent", com.stripe.model.SetupIntent.class);
    classLookup.put("shipping_rate", com.stripe.model.ShippingRate.class);
    classLookup.put("source", com.stripe.model.Source.class);
    classLookup.put(
        "source_mandate_notification", com.stripe.model.SourceMandateNotification.class);
    classLookup.put("source_transaction", com.stripe.model.SourceTransaction.class);
    classLookup.put("subscription", com.stripe.model.Subscription.class);
    classLookup.put("subscription_item", com.stripe.model.SubscriptionItem.class);
    classLookup.put("subscription_schedule", com.stripe.model.SubscriptionSchedule.class);
    classLookup.put("tax_code", com.stripe.model.TaxCode.class);
    classLookup.put("tax_deducted_at_source", com.stripe.model.TaxDeductedAtSource.class);
    classLookup.put("tax_id", com.stripe.model.TaxId.class);
    classLookup.put("tax_rate", com.stripe.model.TaxRate.class);
    classLookup.put("token", com.stripe.model.Token.class);
    classLookup.put("topup", com.stripe.model.Topup.class);
    classLookup.put("transfer", com.stripe.model.Transfer.class);
    classLookup.put("transfer_reversal", com.stripe.model.TransferReversal.class);
    classLookup.put("webhook_endpoint", com.stripe.model.WebhookEndpoint.class);

    classLookup.put("apps.secret", com.stripe.model.apps.Secret.class);

    classLookup.put("billing.alert", com.stripe.model.billing.Alert.class);
    classLookup.put("billing.alert_triggered", com.stripe.model.billing.AlertTriggered.class);
    classLookup.put(
        "billing.credit_balance_summary", com.stripe.model.billing.CreditBalanceSummary.class);
    classLookup.put(
        "billing.credit_balance_transaction",
        com.stripe.model.billing.CreditBalanceTransaction.class);
    classLookup.put("billing.credit_grant", com.stripe.model.billing.CreditGrant.class);
    classLookup.put("billing.meter", com.stripe.model.billing.Meter.class);
    classLookup.put("billing.meter_event", com.stripe.model.billing.MeterEvent.class);
    classLookup.put(
        "billing.meter_event_adjustment", com.stripe.model.billing.MeterEventAdjustment.class);
    classLookup.put(
        "billing.meter_event_summary", com.stripe.model.billing.MeterEventSummary.class);

    classLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);
    classLookup.put("billing_portal.session", com.stripe.model.billingportal.Session.class);

    classLookup.put("checkout.session", com.stripe.model.checkout.Session.class);

    classLookup.put("climate.order", com.stripe.model.climate.Order.class);
    classLookup.put("climate.product", com.stripe.model.climate.Product.class);
    classLookup.put("climate.supplier", com.stripe.model.climate.Supplier.class);

    classLookup.put(
        "entitlements.active_entitlement", com.stripe.model.entitlements.ActiveEntitlement.class);
    classLookup.put(
        "entitlements.active_entitlement_summary",
        com.stripe.model.entitlements.ActiveEntitlementSummary.class);
    classLookup.put("entitlements.feature", com.stripe.model.entitlements.Feature.class);

    classLookup.put(
        "financial_connections.account", com.stripe.model.financialconnections.Account.class);
    classLookup.put(
        "financial_connections.account_owner",
        com.stripe.model.financialconnections.AccountOwner.class);
    classLookup.put(
        "financial_connections.account_ownership",
        com.stripe.model.financialconnections.AccountOwnership.class);
    classLookup.put(
        "financial_connections.session", com.stripe.model.financialconnections.Session.class);
    classLookup.put(
        "financial_connections.transaction",
        com.stripe.model.financialconnections.Transaction.class);

    classLookup.put("forwarding.request", com.stripe.model.forwarding.Request.class);

    classLookup.put(
        "identity.verification_report", com.stripe.model.identity.VerificationReport.class);
    classLookup.put(
        "identity.verification_session", com.stripe.model.identity.VerificationSession.class);

    classLookup.put("issuing.authorization", com.stripe.model.issuing.Authorization.class);
    classLookup.put("issuing.card", com.stripe.model.issuing.Card.class);
    classLookup.put("issuing.cardholder", com.stripe.model.issuing.Cardholder.class);
    classLookup.put("issuing.dispute", com.stripe.model.issuing.Dispute.class);
    classLookup.put(
        "issuing.personalization_design", com.stripe.model.issuing.PersonalizationDesign.class);
    classLookup.put("issuing.physical_bundle", com.stripe.model.issuing.PhysicalBundle.class);
    classLookup.put("issuing.token", com.stripe.model.issuing.Token.class);
    classLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);

    classLookup.put("radar.early_fraud_warning", com.stripe.model.radar.EarlyFraudWarning.class);
    classLookup.put("radar.value_list", com.stripe.model.radar.ValueList.class);
    classLookup.put("radar.value_list_item", com.stripe.model.radar.ValueListItem.class);

    classLookup.put("reporting.report_run", com.stripe.model.reporting.ReportRun.class);
    classLookup.put("reporting.report_type", com.stripe.model.reporting.ReportType.class);

    classLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);

    classLookup.put("tax.calculation", com.stripe.model.tax.Calculation.class);
    classLookup.put("tax.calculation_line_item", com.stripe.model.tax.CalculationLineItem.class);
    classLookup.put("tax.registration", com.stripe.model.tax.Registration.class);
    classLookup.put("tax.settings", com.stripe.model.tax.Settings.class);
    classLookup.put("tax.transaction", com.stripe.model.tax.Transaction.class);
    classLookup.put("tax.transaction_line_item", com.stripe.model.tax.TransactionLineItem.class);

    classLookup.put("terminal.configuration", com.stripe.model.terminal.Configuration.class);
    classLookup.put("terminal.connection_token", com.stripe.model.terminal.ConnectionToken.class);
    classLookup.put("terminal.location", com.stripe.model.terminal.Location.class);
    classLookup.put("terminal.reader", com.stripe.model.terminal.Reader.class);

    classLookup.put("test_helpers.test_clock", com.stripe.model.testhelpers.TestClock.class);

    classLookup.put("treasury.credit_reversal", com.stripe.model.treasury.CreditReversal.class);
    classLookup.put("treasury.debit_reversal", com.stripe.model.treasury.DebitReversal.class);
    classLookup.put("treasury.financial_account", com.stripe.model.treasury.FinancialAccount.class);
    classLookup.put(
        "treasury.financial_account_features",
        com.stripe.model.treasury.FinancialAccountFeatures.class);
    classLookup.put("treasury.inbound_transfer", com.stripe.model.treasury.InboundTransfer.class);
    classLookup.put("treasury.outbound_payment", com.stripe.model.treasury.OutboundPayment.class);
    classLookup.put("treasury.outbound_transfer", com.stripe.model.treasury.OutboundTransfer.class);
    classLookup.put("treasury.received_credit", com.stripe.model.treasury.ReceivedCredit.class);
    classLookup.put("treasury.received_debit", com.stripe.model.treasury.ReceivedDebit.class);
    classLookup.put("treasury.transaction", com.stripe.model.treasury.Transaction.class);
    classLookup.put("treasury.transaction_entry", com.stripe.model.treasury.TransactionEntry.class);
  }
}
