// File generated from our OpenAPI spec
package com.stripe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in {@link EventDataDeserializer}. The key to look up is `object`
 * string of the model.
 */
final class EventDataClassLookup {
  private static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();

  static {
    classLookup.put("account", Account.class);
    classLookup.put("account_link", AccountLink.class);
    classLookup.put("alipay_account", AlipayAccount.class);
    classLookup.put("apple_pay_domain", ApplePayDomain.class);
    classLookup.put("application", Application.class);
    classLookup.put("application_fee", ApplicationFee.class);
    classLookup.put("balance", Balance.class);
    classLookup.put("balance_transaction", BalanceTransaction.class);
    classLookup.put("bank_account", BankAccount.class);
    classLookup.put("bitcoin_receiver", BitcoinReceiver.class);
    classLookup.put("bitcoin_transaction", BitcoinTransaction.class);
    classLookup.put("capability", Capability.class);
    classLookup.put("card", Card.class);
    classLookup.put("charge", Charge.class);
    classLookup.put("connect_collection_transfer", ConnectCollectionTransfer.class);
    classLookup.put("country_spec", CountrySpec.class);
    classLookup.put("coupon", Coupon.class);
    classLookup.put("credit_note", CreditNote.class);
    classLookup.put("credit_note_line_item", CreditNoteLineItem.class);
    classLookup.put("customer", Customer.class);
    classLookup.put("customer_balance_transaction", CustomerBalanceTransaction.class);
    classLookup.put("discount", Discount.class);
    classLookup.put("dispute", Dispute.class);
    classLookup.put("ephemeral_key", EphemeralKey.class);
    classLookup.put("event", Event.class);
    classLookup.put("exchange_rate", ExchangeRate.class);
    classLookup.put("fee_refund", FeeRefund.class);
    classLookup.put("file", File.class);
    classLookup.put("file_link", FileLink.class);
    classLookup.put("invoice", Invoice.class);
    classLookup.put("invoiceitem", InvoiceItem.class);
    classLookup.put("issuer_fraud_record", IssuerFraudRecord.class);
    classLookup.put("item", LineItem.class);
    classLookup.put("line_item", InvoiceLineItem.class);
    classLookup.put("login_link", LoginLink.class);
    classLookup.put("mandate", Mandate.class);
    classLookup.put("order", Order.class);
    classLookup.put("order_item", OrderItem.class);
    classLookup.put("order_return", OrderReturn.class);
    classLookup.put("payment_intent", PaymentIntent.class);
    classLookup.put("payment_link", PaymentLink.class);
    classLookup.put("payment_method", PaymentMethod.class);
    classLookup.put("payout", Payout.class);
    classLookup.put("person", Person.class);
    classLookup.put("plan", Plan.class);
    classLookup.put("platform_tax_fee", PlatformTaxFee.class);
    classLookup.put("price", Price.class);
    classLookup.put("product", Product.class);
    classLookup.put("promotion_code", PromotionCode.class);
    classLookup.put("quote", Quote.class);
    classLookup.put("recipient", Recipient.class);
    classLookup.put("refund", Refund.class);
    classLookup.put("reserve_transaction", ReserveTransaction.class);
    classLookup.put("review", Review.class);
    classLookup.put("setup_attempt", SetupAttempt.class);
    classLookup.put("setup_intent", SetupIntent.class);
    classLookup.put("shipping_rate", ShippingRate.class);
    classLookup.put("sku", Sku.class);
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
    classLookup.put("three_d_secure", ThreeDSecure.class);
    classLookup.put("token", Token.class);
    classLookup.put("topup", Topup.class);
    classLookup.put("transfer", Transfer.class);
    classLookup.put("transfer_reversal", TransferReversal.class);
    classLookup.put("usage_record", UsageRecord.class);
    classLookup.put("usage_record_summary", UsageRecordSummary.class);
    classLookup.put("webhook_endpoint", WebhookEndpoint.class);

    classLookup.put(
        "billing_portal.configuration", com.stripe.model.billingportal.Configuration.class);
    classLookup.put("billing_portal.session", com.stripe.model.billingportal.Session.class);

    classLookup.put("checkout.session", com.stripe.model.checkout.Session.class);

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

    classLookup.put("terminal.connection_token", com.stripe.model.terminal.ConnectionToken.class);
    classLookup.put("terminal.location", com.stripe.model.terminal.Location.class);
    classLookup.put("terminal.reader", com.stripe.model.terminal.Reader.class);
  }

  public static Class<? extends StripeObject> findClass(String objectType) {
    return classLookup.get(objectType);
  }
}
