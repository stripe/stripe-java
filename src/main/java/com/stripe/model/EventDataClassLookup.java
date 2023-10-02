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
    classLookup.put("account_link", AccountLink.class);
    classLookup.put("account_session", AccountSession.class);
    classLookup.put("apple_pay_domain", ApplePayDomain.class);
    classLookup.put("application", Application.class);
    classLookup.put("application_fee", ApplicationFee.class);
    classLookup.put("balance", Balance.class);
    classLookup.put("balance_transaction", BalanceTransaction.class);
    classLookup.put("bank_account", BankAccount.class);
    classLookup.put("capability", Capability.class);
    classLookup.put("card", Card.class);
    classLookup.put("cash_balance", CashBalance.class);
    classLookup.put("charge", Charge.class);
    classLookup.put("confirmation_token", ConfirmationToken.class);
    classLookup.put("connect_collection_transfer", ConnectCollectionTransfer.class);
    classLookup.put("country_spec", CountrySpec.class);
    classLookup.put("coupon", Coupon.class);
    classLookup.put("credit_note", CreditNote.class);
    classLookup.put("credit_note_line_item", CreditNoteLineItem.class);
    classLookup.put("customer", Customer.class);
    classLookup.put("customer_balance_transaction", CustomerBalanceTransaction.class);
    classLookup.put("customer_cash_balance_transaction", CustomerCashBalanceTransaction.class);
    classLookup.put("customer_session", CustomerSession.class);
    classLookup.put("discount", Discount.class);
    classLookup.put("dispute", Dispute.class);
    classLookup.put("ephemeral_key", EphemeralKey.class);
    classLookup.put("event", Event.class);
    classLookup.put("exchange_rate", ExchangeRate.class);
    classLookup.put("fee_refund", FeeRefund.class);
    classLookup.put("file", File.class);
    classLookup.put("file_link", FileLink.class);
    classLookup.put("funding_instructions", FundingInstructions.class);
    classLookup.put("invoice", Invoice.class);
    classLookup.put("invoiceitem", InvoiceItem.class);
    classLookup.put("item", LineItem.class);
    classLookup.put("line_item", InvoiceLineItem.class);
    classLookup.put("login_link", LoginLink.class);
    classLookup.put("mandate", Mandate.class);
    classLookup.put("order", Order.class);
    classLookup.put("payment_intent", PaymentIntent.class);
    classLookup.put("payment_link", PaymentLink.class);
    classLookup.put("payment_method", PaymentMethod.class);
    classLookup.put("payment_method_configuration", PaymentMethodConfiguration.class);
    classLookup.put("payment_method_domain", PaymentMethodDomain.class);
    classLookup.put("payout", Payout.class);
    classLookup.put("person", Person.class);
    classLookup.put("plan", Plan.class);
    classLookup.put("platform_tax_fee", PlatformTaxFee.class);
    classLookup.put("price", Price.class);
    classLookup.put("product", Product.class);
    classLookup.put("promotion_code", PromotionCode.class);
    classLookup.put("quote", Quote.class);
    classLookup.put("quote_line", QuoteLine.class);
    classLookup.put("quote_phase", QuotePhase.class);
    classLookup.put("quote_preview_invoice", QuotePreviewInvoice.class);
    classLookup.put("quote_preview_schedule", QuotePreviewSchedule.class);
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
    classLookup.put("subscription_schedule", SubscriptionSchedule.class);
    classLookup.put("tax_code", TaxCode.class);
    classLookup.put("tax_deducted_at_source", TaxDeductedAtSource.class);
    classLookup.put("tax_id", TaxId.class);
    classLookup.put("tax_rate", TaxRate.class);
    classLookup.put("token", Token.class);
    classLookup.put("topup", Topup.class);
    classLookup.put("transfer", Transfer.class);
    classLookup.put("transfer_reversal", TransferReversal.class);
    classLookup.put("usage_record", UsageRecord.class);
    classLookup.put("usage_record_summary", UsageRecordSummary.class);
    classLookup.put("webhook_endpoint", WebhookEndpoint.class);

    classLookup.put("apps.secret", com.stripe.model.apps.Secret.class);

    classLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);
    classLookup.put("billing_portal.session", com.stripe.model.billingportal.Session.class);

    classLookup.put("capital.financing_offer", com.stripe.model.capital.FinancingOffer.class);
    classLookup.put("capital.financing_summary", com.stripe.model.capital.FinancingSummary.class);
    classLookup.put(
        "capital.financing_transaction", com.stripe.model.capital.FinancingTransaction.class);

    classLookup.put("checkout.session", com.stripe.model.checkout.Session.class);

    classLookup.put(
        "financial_connections.account", com.stripe.model.financialconnections.Account.class);
    classLookup.put(
        "financial_connections.account_inferred_balance",
        com.stripe.model.financialconnections.AccountInferredBalance.class);
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

    classLookup.put("gift_cards.card", com.stripe.model.giftcards.Card.class);
    classLookup.put("gift_cards.transaction", com.stripe.model.giftcards.Transaction.class);

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
    classLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);

    classLookup.put("radar.early_fraud_warning", com.stripe.model.radar.EarlyFraudWarning.class);
    classLookup.put("radar.value_list", com.stripe.model.radar.ValueList.class);
    classLookup.put("radar.value_list_item", com.stripe.model.radar.ValueListItem.class);

    classLookup.put("reporting.report_run", com.stripe.model.reporting.ReportRun.class);
    classLookup.put("reporting.report_type", com.stripe.model.reporting.ReportType.class);

    classLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);

    classLookup.put("tax.calculation", com.stripe.model.tax.Calculation.class);
    classLookup.put("tax.calculation_line_item", com.stripe.model.tax.CalculationLineItem.class);
    classLookup.put("tax.form", com.stripe.model.tax.Form.class);
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
