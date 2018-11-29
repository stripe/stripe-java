package com.stripe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in {@link EventDataDeserializer}.
 */
final class EventDataClassLookup {
  private static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();

  static {
    classLookup.put("account", Account.class);
    classLookup.put("alipay_account", AlipayAccount.class);
    classLookup.put("apple_pay_domain", ApplePayDomain.class);
    classLookup.put("application", Application.class);
    classLookup.put("application_fee", ApplicationFee.class);
    classLookup.put("balance", Balance.class);
    classLookup.put("balance_transaction", BalanceTransaction.class);
    classLookup.put("bank_account", BankAccount.class);
    classLookup.put("bitcoin_receiver", BitcoinReceiver.class);
    classLookup.put("card", Card.class);
    classLookup.put("charge", Charge.class);
    classLookup.put("country_spec", CountrySpec.class);
    classLookup.put("coupon", Coupon.class);
    classLookup.put("customer", Customer.class);
    classLookup.put("discount", Discount.class);
    classLookup.put("dispute", Dispute.class);
    classLookup.put("event", Event.class);
    classLookup.put("exchange_rate", ExchangeRate.class);
    classLookup.put("fee", BalanceTransaction.Fee.class);
    classLookup.put("fee_refund", FeeRefund.class);
    classLookup.put("file", File.class);
    classLookup.put("file_upload", File.class);
    classLookup.put("invoice", Invoice.class);
    classLookup.put("invoice_line_item", InvoiceLineItem.class);
    classLookup.put("invoiceitem", InvoiceItem.class);
    classLookup.put("issuing.authorization", com.stripe.model.issuing.Authorization.class);
    classLookup.put("issuing.card", com.stripe.model.issuing.Card.class);
    classLookup.put("issuing.card_details", com.stripe.model.issuing.CardDetails.class);
    classLookup.put("issuing.cardholder", com.stripe.model.issuing.Cardholder.class);
    classLookup.put("issuing.dispute", com.stripe.model.issuing.Dispute.class);
    classLookup.put("issuing.transaction", com.stripe.model.issuing.Transaction.class);
    classLookup.put("order", Order.class);
    classLookup.put("order_item", OrderItem.class);
    classLookup.put("order_return", OrderReturn.class);
    classLookup.put("payment_intent", PaymentIntent.class);
    classLookup.put("payout", Payout.class);
    classLookup.put("plan", Plan.class);
    classLookup.put("product", Product.class);
    classLookup.put("radar.value_list", com.stripe.model.radar.ValueList.class);
    classLookup.put("radar.value_list_item", com.stripe.model.radar.ValueListItem.class);
    classLookup.put("reporting.report_run", com.stripe.model.reporting.ReportRun.class);
    classLookup.put("reporting.report_type", com.stripe.model.reporting.ReportType.class);
    classLookup.put("refund", Refund.class);
    classLookup.put("recipient", Recipient.class);
    classLookup.put("review", Review.class);
    classLookup.put("scheduled_query_run", com.stripe.model.sigma.ScheduledQueryRun.class);
    classLookup.put("sku", Sku.class);
    classLookup.put("source", Source.class);
    classLookup.put("source_mandate_notification", SourceMandateNotification.class);
    classLookup.put("source_transaction", SourceTransaction.class);
    classLookup.put("subscription", Subscription.class);
    classLookup.put("subscription_item", SubscriptionItem.class);
    classLookup.put("summary", Transfer.Summary.class);
    classLookup.put("terminal.connection_token", com.stripe.model.terminal.ConnectionToken.class);
    classLookup.put("terminal.location", com.stripe.model.terminal.Location.class);
    classLookup.put("terminal.reader", com.stripe.model.terminal.Reader.class);
    classLookup.put("three_d_secure", ThreeDSecure.class);
    classLookup.put("token", Token.class);
    classLookup.put("transfer", Transfer.class);
    classLookup.put("transfer_reversal", Reversal.class);
  }

  public static Class<? extends StripeObject> findClass(String objectType) {
    return classLookup.get(objectType);
  }
}
