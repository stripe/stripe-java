// File generated from our OpenAPI spec
package com.stripe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is `object` string of
 * the model.
 */
final class EventDataClassLookup {
  public static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();

  static {
    classLookup.put("account", Account.class);
    classLookup.put("capability", Capability.class);
    classLookup.put("login_link", LoginLink.class);
    classLookup.put("person", Person.class);
    classLookup.put("account_link", AccountLink.class);
    classLookup.put("apple_pay_domain", ApplePayDomain.class);
    classLookup.put("application", Application.class);
    classLookup.put("application_fee", ApplicationFee.class);
    classLookup.put("fee_refund", FeeRefund.class);
    classLookup.put("balance", Balance.class);
    classLookup.put("balance_transaction", BalanceTransaction.class);
    classLookup.put("bank_account", BankAccount.class);
    classLookup.put("card", Card.class);
    classLookup.put("charge", Charge.class);
    classLookup.put("connect_collection_transfer", ConnectCollectionTransfer.class);
    classLookup.put("country_spec", CountrySpec.class);
    classLookup.put("coupon", Coupon.class);
    classLookup.put("credit_note", CreditNote.class);
    classLookup.put("credit_note_line_item", CreditNoteLineItem.class);
    classLookup.put("customer", Customer.class);
    classLookup.put("cash_balance", CashBalance.class);
    classLookup.put("customer_balance_transaction", CustomerBalanceTransaction.class);
    classLookup.put("customer_cash_balance_transaction", CustomerCashBalanceTransaction.class);
    classLookup.put("tax_id", TaxId.class);
    classLookup.put("discount", Discount.class);
    classLookup.put("dispute", Dispute.class);
    classLookup.put("ephemeral_key", EphemeralKey.class);
    classLookup.put("event", Event.class);
    classLookup.put("exchange_rate", ExchangeRate.class);
    classLookup.put("file", File.class);
    classLookup.put("file_link", FileLink.class);
    classLookup.put("funding_instructions", FundingInstructions.class);
    classLookup.put("invoice", Invoice.class);
    classLookup.put("line_item", InvoiceLineItem.class);
    classLookup.put("invoiceitem", InvoiceItem.class);
    classLookup.put("item", LineItem.class);
    classLookup.put("mandate", Mandate.class);
    classLookup.put("payment_intent", PaymentIntent.class);
    classLookup.put("payment_link", PaymentLink.class);
    classLookup.put("payment_method", PaymentMethod.class);
    classLookup.put("payout", Payout.class);
    classLookup.put("plan", Plan.class);
    classLookup.put("platform_tax_fee", PlatformTaxFee.class);
    classLookup.put("price", Price.class);
    classLookup.put("product", Product.class);
    classLookup.put("promotion_code", PromotionCode.class);
    classLookup.put("quote", Quote.class);
    classLookup.put("refund", Refund.class);
    classLookup.put("reserve_transaction", ReserveTransaction.class);
    classLookup.put("review", Review.class);
    classLookup.put("setup_attempt", SetupAttempt.class);
    classLookup.put("setup_intent", SetupIntent.class);
    classLookup.put("shipping_rate", ShippingRate.class);
    classLookup.put("source", Source.class);
    classLookup.put("source_mandate_notification", SourceMandateNotification.class);
    classLookup.put("source_transaction", SourceTransaction.class);
    classLookup.put("subscription", Subscription.class);
    classLookup.put("subscription_item", SubscriptionItem.class);
    classLookup.put("usage_record", UsageRecord.class);
    classLookup.put("usage_record_summary", UsageRecordSummary.class);
    classLookup.put("subscription_schedule", SubscriptionSchedule.class);
    classLookup.put("tax_code", TaxCode.class);
    classLookup.put("tax_deducted_at_source", TaxDeductedAtSource.class);
    classLookup.put("tax_rate", TaxRate.class);
    classLookup.put("token", Token.class);
    classLookup.put("topup", Topup.class);
    classLookup.put("transfer", Transfer.class);
    classLookup.put("transfer_reversal", TransferReversal.class);
    classLookup.put("webhook_endpoint", WebhookEndpoint.class);

    classLookup.put("apps.secret", com.stripe.model.apps.Secret.class);

    classLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);
    classLookup.put("billing_portal.session", com.stripe.model.billingportal.Session.class);

    classLookup.put("checkout.session", com.stripe.model.checkout.Session.class);

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
        "identity.verification_report", com.stripe.model.identity.VerificationReport.class);
    classLookup.put(
        "identity.verification_session", com.stripe.model.identity.VerificationSession.class);

    classLookup.put("issuing.authorization", com.stripe.model.issuing.Authorization.class);
    classLookup.put("issuing.card", com.stripe.model.issuing.Card.class);
    classLookup.put("issuing.cardholder", com.stripe.model.issuing.Cardholder.class);
    classLookup.put("issuing.dispute", com.stripe.model.issuing.Dispute.class);
    classLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);

    classLookup.put("radar.early_fraud_warning", com.stripe.model.radar.EarlyFraudWarning.class);
    classLookup.put("radar.value_list", com.stripe.model.radar.ValueList.class);
    classLookup.put("radar.value_list_item", com.stripe.model.radar.ValueListItem.class);

    classLookup.put("reporting.report_run", com.stripe.model.reporting.ReportRun.class);
    classLookup.put("reporting.report_type", com.stripe.model.reporting.ReportType.class);

    classLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);

    classLookup.put("tax.calculation", com.stripe.model.tax.Calculation.class);
    classLookup.put("tax.calculation_line_item", com.stripe.model.tax.CalculationLineItem.class);
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

    eventClassLookup.put("account", Account.class);
    eventClassLookup.put("account_link", AccountLink.class);
    eventClassLookup.put("apple_pay_domain", ApplePayDomain.class);
    eventClassLookup.put("application", Application.class);
    eventClassLookup.put("application_fee", ApplicationFee.class);
    eventClassLookup.put("apps.secret", com.stripe.model.apps.Secret.class);
    eventClassLookup.put("balance", Balance.class);
    eventClassLookup.put("balance_transaction", BalanceTransaction.class);
    eventClassLookup.put("bank_account", BankAccount.class);
    eventClassLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);
    eventClassLookup.put("billing_portal.session", com.stripe.model.billingportal.Session.class);
    eventClassLookup.put("capability", Capability.class);
    eventClassLookup.put("card", Card.class);
    eventClassLookup.put("cash_balance", CashBalance.class);
    eventClassLookup.put("charge", Charge.class);
    eventClassLookup.put("checkout.session", com.stripe.model.checkout.Session.class);
    eventClassLookup.put("connect_collection_transfer", ConnectCollectionTransfer.class);
    eventClassLookup.put("country_spec", CountrySpec.class);
    eventClassLookup.put("coupon", Coupon.class);
    eventClassLookup.put("credit_note", CreditNote.class);
    eventClassLookup.put("credit_note_line_item", CreditNoteLineItem.class);
    eventClassLookup.put("customer", Customer.class);
    eventClassLookup.put("customer_balance_transaction", CustomerBalanceTransaction.class);
    eventClassLookup.put("customer_cash_balance_transaction", CustomerCashBalanceTransaction.class);
    eventClassLookup.put("discount", Discount.class);
    eventClassLookup.put("dispute", Dispute.class);
    eventClassLookup.put("ephemeral_key", EphemeralKey.class);
    eventClassLookup.put("event", Event.class);
    eventClassLookup.put("exchange_rate", ExchangeRate.class);
    eventClassLookup.put("fee_refund", FeeRefund.class);
    eventClassLookup.put("file", File.class);
    eventClassLookup.put("file_link", FileLink.class);
    eventClassLookup.put(
        "financial_connections.account", com.stripe.model.financialconnections.Account.class);
    eventClassLookup.put(
        "financial_connections.account_owner",
        com.stripe.model.financialconnections.AccountOwner.class);
    eventClassLookup.put(
        "financial_connections.account_ownership",
        com.stripe.model.financialconnections.AccountOwnership.class);
    eventClassLookup.put(
        "financial_connections.session", com.stripe.model.financialconnections.Session.class);
    eventClassLookup.put("funding_instructions", FundingInstructions.class);
    eventClassLookup.put(
        "identity.verification_report", com.stripe.model.identity.VerificationReport.class);
    eventClassLookup.put(
        "identity.verification_session", com.stripe.model.identity.VerificationSession.class);
    eventClassLookup.put("invoice", Invoice.class);
    eventClassLookup.put("invoiceitem", InvoiceItem.class);
    eventClassLookup.put("issuing.authorization", com.stripe.model.issuing.Authorization.class);
    eventClassLookup.put("issuing.card", com.stripe.model.issuing.Card.class);
    eventClassLookup.put("issuing.cardholder", com.stripe.model.issuing.Cardholder.class);
    eventClassLookup.put("issuing.dispute", com.stripe.model.issuing.Dispute.class);
    eventClassLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);
    eventClassLookup.put("item", LineItem.class);
    eventClassLookup.put("line_item", InvoiceLineItem.class);
    eventClassLookup.put("login_link", LoginLink.class);
    eventClassLookup.put("mandate", Mandate.class);
    eventClassLookup.put("payment_intent", PaymentIntent.class);
    eventClassLookup.put("payment_link", PaymentLink.class);
    eventClassLookup.put("payment_method", PaymentMethod.class);
    eventClassLookup.put("payout", Payout.class);
    eventClassLookup.put("person", Person.class);
    eventClassLookup.put("plan", Plan.class);
    eventClassLookup.put("platform_tax_fee", PlatformTaxFee.class);
    eventClassLookup.put("price", Price.class);
    eventClassLookup.put("product", Product.class);
    eventClassLookup.put("promotion_code", PromotionCode.class);
    eventClassLookup.put("quote", Quote.class);
    eventClassLookup.put(
        "radar.early_fraud_warning", com.stripe.model.radar.EarlyFraudWarning.class);
    eventClassLookup.put("radar.value_list", com.stripe.model.radar.ValueList.class);
    eventClassLookup.put("radar.value_list_item", com.stripe.model.radar.ValueListItem.class);
    eventClassLookup.put("refund", Refund.class);
    eventClassLookup.put("reporting.report_run", com.stripe.model.reporting.ReportRun.class);
    eventClassLookup.put("reporting.report_type", com.stripe.model.reporting.ReportType.class);
    eventClassLookup.put("reserve_transaction", ReserveTransaction.class);
    eventClassLookup.put("review", Review.class);
    eventClassLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);
    eventClassLookup.put("setup_attempt", SetupAttempt.class);
    eventClassLookup.put("setup_intent", SetupIntent.class);
    eventClassLookup.put("shipping_rate", ShippingRate.class);
    eventClassLookup.put("source", Source.class);
    eventClassLookup.put("source_mandate_notification", SourceMandateNotification.class);
    eventClassLookup.put("source_transaction", SourceTransaction.class);
    eventClassLookup.put("subscription", Subscription.class);
    eventClassLookup.put("subscription_item", SubscriptionItem.class);
    eventClassLookup.put("subscription_schedule", SubscriptionSchedule.class);
    eventClassLookup.put("tax.calculation", com.stripe.model.tax.Calculation.class);
    eventClassLookup.put(
        "tax.calculation_line_item", com.stripe.model.tax.CalculationLineItem.class);
    eventClassLookup.put("tax.transaction", com.stripe.model.tax.Transaction.class);
    eventClassLookup.put(
        "tax.transaction_line_item", com.stripe.model.tax.TransactionLineItem.class);
    eventClassLookup.put("tax_code", TaxCode.class);
    eventClassLookup.put("tax_deducted_at_source", TaxDeductedAtSource.class);
    eventClassLookup.put("tax_id", TaxId.class);
    eventClassLookup.put("tax_rate", TaxRate.class);
    eventClassLookup.put("terminal.configuration", com.stripe.model.terminal.Configuration.class);
    eventClassLookup.put(
        "terminal.connection_token", com.stripe.model.terminal.ConnectionToken.class);
    eventClassLookup.put("terminal.location", com.stripe.model.terminal.Location.class);
    eventClassLookup.put("terminal.reader", com.stripe.model.terminal.Reader.class);
    eventClassLookup.put("test_helpers.test_clock", com.stripe.model.testhelpers.TestClock.class);
    eventClassLookup.put("token", Token.class);
    eventClassLookup.put("topup", Topup.class);
    eventClassLookup.put("transfer", Transfer.class);
    eventClassLookup.put("transfer_reversal", TransferReversal.class);
    eventClassLookup.put(
        "treasury.credit_reversal", com.stripe.model.treasury.CreditReversal.class);
    eventClassLookup.put("treasury.debit_reversal", com.stripe.model.treasury.DebitReversal.class);
    eventClassLookup.put(
        "treasury.financial_account", com.stripe.model.treasury.FinancialAccount.class);
    eventClassLookup.put(
        "treasury.financial_account_features",
        com.stripe.model.treasury.FinancialAccountFeatures.class);
    eventClassLookup.put(
        "treasury.inbound_transfer", com.stripe.model.treasury.InboundTransfer.class);
    eventClassLookup.put(
        "treasury.outbound_payment", com.stripe.model.treasury.OutboundPayment.class);
    eventClassLookup.put(
        "treasury.outbound_transfer", com.stripe.model.treasury.OutboundTransfer.class);
    eventClassLookup.put(
        "treasury.received_credit", com.stripe.model.treasury.ReceivedCredit.class);
    eventClassLookup.put("treasury.received_debit", com.stripe.model.treasury.ReceivedDebit.class);
    eventClassLookup.put("treasury.transaction", com.stripe.model.treasury.Transaction.class);
    eventClassLookup.put(
        "treasury.transaction_entry", com.stripe.model.treasury.TransactionEntry.class);
    eventClassLookup.put("usage_record", UsageRecord.class);
    eventClassLookup.put("usage_record_summary", UsageRecordSummary.class);
    eventClassLookup.put("webhook_endpoint", WebhookEndpoint.class);
  }
}
