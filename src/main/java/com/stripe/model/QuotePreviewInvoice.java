// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.CreditBalanceTransaction;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuotePreviewInvoiceListParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Invoices are statements of amounts owed by a customer, and are either generated one-off, or
 * generated periodically from a subscription.
 *
 * <p>They contain <a href="https://stripe.com/docs/api#invoiceitems">invoice items</a>, and
 * proration adjustments that may be caused by subscription upgrades/downgrades (if necessary).
 *
 * <p>If your invoice is configured to be billed through automatic charges, Stripe automatically
 * finalizes your invoice and attempts payment. Note that finalizing the invoice, <a
 * href="https://stripe.com/docs/invoicing/integration/automatic-advancement-collection">when
 * automatic</a>, does not happen immediately as the invoice is created. Stripe waits until one hour
 * after the last webhook was successfully sent (or the last webhook timed out after failing). If
 * you (and the platforms you may have connected to) have no webhooks configured, Stripe waits one
 * hour after creation to finalize the invoice.
 *
 * <p>If your invoice is configured to be billed by sending an email, then based on your <a
 * href="https://dashboard.stripe.com/account/billing/automatic">email settings</a>, Stripe will
 * email the invoice to your customer and await payment. These emails can contain a link to a hosted
 * page to pay the invoice.
 *
 * <p>Stripe applies any customer credit on the account before determining the amount due for the
 * invoice (i.e., the amount that will be actually charged). If the amount due for the invoice is
 * less than Stripe's <a
 * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">minimum allowed
 * charge per currency</a>, the invoice is automatically marked paid, and we add the amount due to
 * the customer's credit balance which is applied to the next invoice.
 *
 * <p>More details on the customer's credit balance are <a
 * href="https://stripe.com/docs/billing/customer/balance">here</a>.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/invoices/sending">Send invoices to
 * customers</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class QuotePreviewInvoice extends ApiResource implements HasId {
  /**
   * The country of the business associated with this invoice, most often the business creating the
   * invoice.
   */
  @SerializedName("account_country")
  String accountCountry;

  /**
   * The public name of the business associated with this invoice, most often the business creating
   * the invoice.
   */
  @SerializedName("account_name")
  String accountName;

  /** The account tax IDs associated with the invoice. Only editable when the invoice is a draft. */
  @SerializedName("account_tax_ids")
  List<ExpandableField<TaxId>> accountTaxIds;

  /**
   * Final amount due at this time for this invoice. If the invoice's total is smaller than the
   * minimum charge amount, for example, or if there is account credit that can be applied to the
   * invoice, the {@code amount_due} may be 0. If there is a positive {@code starting_balance} for
   * the invoice (the customer owes money), the {@code amount_due} will also take that into account.
   * The charge that gets generated for the invoice will be for the amount specified in {@code
   * amount_due}.
   */
  @SerializedName("amount_due")
  Long amountDue;

  /**
   * Amount that was overpaid on the invoice. Overpayments are debited to the customer's credit
   * balance.
   */
  @SerializedName("amount_overpaid")
  Long amountOverpaid;

  /** The amount, in cents (or local equivalent), that was paid. */
  @SerializedName("amount_paid")
  Long amountPaid;

  /** The difference between amount_due and amount_paid, in cents (or local equivalent). */
  @SerializedName("amount_remaining")
  Long amountRemaining;

  /** This is the sum of all the shipping amounts. */
  @SerializedName("amount_shipping")
  Long amountShipping;

  /**
   * List of expected payments and corresponding due dates. This value will be null for invoices
   * where collection_method=charge_automatically.
   */
  @SerializedName("amounts_due")
  List<QuotePreviewInvoice.AmountsDue> amountsDue;

  /** ID of the Connect Application that created the invoice. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The fee in cents (or local equivalent) that will be applied to the invoice and transferred to
   * the application owner's Stripe account when the invoice is paid.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  @SerializedName("applies_to")
  AppliesTo appliesTo;

  /**
   * Number of payment attempts made for this invoice, from the perspective of the payment retry
   * schedule. Any payment attempt counts as the first attempt, and subsequently only automatic
   * retries increment the attempt count. In other words, manual payment attempts after the first
   * attempt do not affect the retry schedule. If a failure is returned with a non-retryable return
   * code, the invoice can no longer be retried unless a new payment method is obtained. Retries
   * will continue to be scheduled, and attempt_count will continue to increment, but retries will
   * only be executed if a new payment method is obtained.
   */
  @SerializedName("attempt_count")
  Long attemptCount;

  /**
   * Whether an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour
   * after the {@code invoice.created} webhook, for example, so you might not want to display that
   * invoice as unpaid to your users.
   */
  @SerializedName("attempted")
  Boolean attempted;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * The time when this invoice is currently scheduled to be automatically finalized. The field will
   * be {@code null} if the invoice is not scheduled to finalize in the future. If the invoice is
   * not in the draft state, this field will always be {@code null} - see {@code finalized_at} for
   * the time when an already-finalized invoice was finalized.
   */
  @SerializedName("automatically_finalizes_at")
  Long automaticallyFinalizesAt;

  /**
   * Indicates the reason why the invoice was created.
   *
   * <p>* {@code manual}: Unrelated to a subscription, for example, created via the invoice editor.
   * * {@code subscription}: No longer in use. Applies to subscriptions from before May 2018 where
   * no distinction was made between updates, cycles, and thresholds. * {@code subscription_create}:
   * A new subscription was created. * {@code subscription_cycle}: A subscription advanced into a
   * new period. * {@code subscription_threshold}: A subscription reached a billing threshold. *
   * {@code subscription_update}: A subscription was updated. * {@code upcoming}: Reserved for
   * simulated invoices, per the upcoming invoice endpoint.
   *
   * <p>One of {@code automatic_pending_invoice_item_invoice}, {@code manual}, {@code quote_accept},
   * {@code subscription}, {@code subscription_create}, {@code subscription_cycle}, {@code
   * subscription_threshold}, {@code subscription_update}, or {@code upcoming}.
   */
  @SerializedName("billing_reason")
  String billingReason;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay this invoice using the default source attached to the customer. When
   * sending an invoice, Stripe will email this invoice to the customer with payment instructions.
   *
   * <p>One of {@code charge_automatically}, or {@code send_invoice}.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Custom fields displayed on the invoice. */
  @SerializedName("custom_fields")
  List<QuotePreviewInvoice.CustomField> customFields;

  /**
   * The customer's address. Until the invoice is finalized, this field will equal {@code
   * customer.address}. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_address")
  Address customerAddress;

  /**
   * The customer's email. Until the invoice is finalized, this field will equal {@code
   * customer.email}. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /**
   * The customer's name. Until the invoice is finalized, this field will equal {@code
   * customer.name}. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_name")
  String customerName;

  /**
   * The customer's phone number. Until the invoice is finalized, this field will equal {@code
   * customer.phone}. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_phone")
  String customerPhone;

  /**
   * The customer's shipping information. Until the invoice is finalized, this field will equal
   * {@code customer.shipping}. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_shipping")
  ShippingDetails customerShipping;

  /**
   * The customer's tax exempt status. Until the invoice is finalized, this field will equal {@code
   * customer.tax_exempt}. Once the invoice is finalized, this field will no longer be updated.
   *
   * <p>One of {@code exempt}, {@code none}, or {@code reverse}.
   */
  @SerializedName("customer_tax_exempt")
  String customerTaxExempt;

  /**
   * The customer's tax IDs. Until the invoice is finalized, this field will contain the same tax
   * IDs as {@code customer.tax_ids}. Once the invoice is finalized, this field will no longer be
   * updated.
   */
  @SerializedName("customer_tax_ids")
  List<QuotePreviewInvoice.CustomerTaxId> customerTaxIds;

  /**
   * The margins applied to the invoice. Can be overridden by line item {@code margins}. Use {@code
   * expand[]=default_margins} to expand each margin.
   */
  @SerializedName("default_margins")
  List<ExpandableField<Margin>> defaultMargins;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentSource> defaultSource;

  /** The tax rates applied to this invoice, if any. */
  @SerializedName("default_tax_rates")
  List<TaxRate> defaultTaxRates;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as
   * 'memo' in the Dashboard.
   */
  @SerializedName("description")
  String description;

  /**
   * Describes the current discount applied to this invoice, if there is one. Not populated if there
   * are multiple discounts.
   */
  @SerializedName("discount")
  Discount discount;

  /**
   * The discounts applied to the invoice. Line item discounts are applied before invoice discounts.
   * Use {@code expand[]=discounts} to expand each discount.
   */
  @SerializedName("discounts")
  List<ExpandableField<Discount>> discounts;

  /**
   * The date on which payment for this invoice is due. This value will be {@code null} for invoices
   * where {@code collection_method=charge_automatically}.
   */
  @SerializedName("due_date")
  Long dueDate;

  /**
   * The date when this invoice is in effect. Same as {@code finalized_at} unless overwritten. When
   * defined, this value replaces the system-generated 'Date of issue' printed on the invoice PDF
   * and receipt.
   */
  @SerializedName("effective_at")
  Long effectiveAt;

  /**
   * Ending customer balance after the invoice is finalized. Invoices are finalized approximately an
   * hour after successful webhook delivery or when payment collection is attempted for the invoice.
   * If the invoice has not been finalized yet, this will be null.
   */
  @SerializedName("ending_balance")
  Long endingBalance;

  /** Footer displayed on the invoice. */
  @SerializedName("footer")
  String footer;

  /**
   * Details of the invoice that was cloned. See the <a
   * href="https://stripe.com/docs/invoicing/invoice-revisions">revision documentation</a> for more
   * details.
   */
  @SerializedName("from_invoice")
  FromInvoice fromInvoice;

  /**
   * Unique identifier for the object. This property is always present unless the invoice is an
   * upcoming invoice. See <a href="https://stripe.com/docs/api/invoices/upcoming">Retrieve an
   * upcoming invoice</a> for more details.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("issuer")
  Issuer issuer;

  /**
   * The error encountered during the previous attempt to finalize the invoice. This field is
   * cleared when the invoice is successfully finalized.
   */
  @SerializedName("last_finalization_error")
  StripeError lastFinalizationError;

  /** The ID of the most recent non-draft revision of this invoice. */
  @SerializedName("latest_revision")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> latestRevision;

  /**
   * The individual line items that make up the invoice. {@code lines} is sorted as follows: (1)
   * pending invoice items (including prorations) in reverse chronological order, (2) subscription
   * items in reverse chronological order, and (3) invoice items added after invoice creation in
   * chronological order.
   */
  @SerializedName("lines")
  InvoiceLineItemCollection lines;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The time at which payment will next be attempted. This value will be {@code null} for invoices
   * where {@code collection_method=send_invoice}.
   */
  @SerializedName("next_payment_attempt")
  Long nextPaymentAttempt;

  /**
   * A unique, identifying string that appears on emails sent to the customer for this invoice. This
   * starts with the customer's unique invoice_prefix if it is specified.
   */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code quote_preview_invoice}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the
   * invoice will be presented with the branding and support information of the specified account.
   * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
   * documentation for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /**
   * Whether payment was successfully collected for this invoice. An invoice can be paid (most
   * commonly) with a charge or with credit from the customer's account balance.
   */
  @SerializedName("paid")
  Boolean paid;

  /**
   * Returns true if the invoice was manually marked paid, returns false if the invoice hasn't been
   * paid yet or was paid on Stripe.
   */
  @SerializedName("paid_out_of_band")
  Boolean paidOutOfBand;

  /**
   * The PaymentIntent associated with this invoice. The PaymentIntent is generated when the invoice
   * is finalized, and can then be used to pay the invoice. Note that voiding an invoice will cancel
   * the PaymentIntent.
   */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  @SerializedName("payment_settings")
  PaymentSettings paymentSettings;

  /** Payments for this invoice. */
  @SerializedName("payments")
  InvoicePaymentCollection payments;

  /**
   * End of the usage period during which invoice items were added to this invoice. This looks back
   * one period for a subscription invoice. Use the <a
   * href="https://stripe.com/api/invoices/line_item#invoice_line_item_object-period">line item
   * period</a> to get the service period for each price.
   */
  @SerializedName("period_end")
  Long periodEnd;

  /**
   * Start of the usage period during which invoice items were added to this invoice. This looks
   * back one period for a subscription invoice. Use the <a
   * href="https://stripe.com/api/invoices/line_item#invoice_line_item_object-period">line item
   * period</a> to get the service period for each price.
   */
  @SerializedName("period_start")
  Long periodStart;

  /** Total amount of all post-payment credit notes issued for this invoice. */
  @SerializedName("post_payment_credit_notes_amount")
  Long postPaymentCreditNotesAmount;

  /** Total amount of all pre-payment credit notes issued for this invoice. */
  @SerializedName("pre_payment_credit_notes_amount")
  Long prePaymentCreditNotesAmount;

  /** The quote this invoice was generated from. */
  @SerializedName("quote")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Quote> quote;

  /** This is the transaction number that appears on email receipts sent for this invoice. */
  @SerializedName("receipt_number")
  String receiptNumber;

  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing
   * surfaces such as PDF and Hosted Invoice Page.
   */
  @SerializedName("rendering")
  Rendering rendering;

  /** The details of the cost of shipping, including the ShippingRate applied on the invoice. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /**
   * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
   * if it is set, otherwise the PDF will render the shipping address from the customer.
   */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  /**
   * Starting customer balance before the invoice is finalized. If the invoice has not been
   * finalized yet, this will be the current customer balance. For revision invoices, this also
   * includes any customer balance that was applied to the original invoice.
   */
  @SerializedName("starting_balance")
  Long startingBalance;

  /** Extra information about an invoice for the customer's credit card statement. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The status of the invoice, one of {@code draft}, {@code open}, {@code paid}, {@code
   * uncollectible}, or {@code void}. <a
   * href="https://stripe.com/docs/billing/invoices/workflow#workflow-overview">Learn more</a>
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /** Details about the subscription that created this invoice. */
  @SerializedName("subscription_details")
  SubscriptionDetails subscriptionDetails;

  /**
   * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
   */
  @SerializedName("subscription_proration_date")
  Long subscriptionProrationDate;

  /**
   * Total of all subscriptions, invoice items, and prorations on the invoice before any invoice
   * level discount or exclusive tax is applied. Item discounts are already incorporated
   */
  @SerializedName("subtotal")
  Long subtotal;

  /**
   * The integer amount in cents (or local equivalent) representing the subtotal of the invoice
   * before any invoice level discount or tax is applied. Item discounts are already incorporated
   */
  @SerializedName("subtotal_excluding_tax")
  Long subtotalExcludingTax;

  /** The amount of tax on this invoice. This is the sum of all the tax amounts on this invoice. */
  @SerializedName("tax")
  Long tax;

  /** ID of the test clock this invoice belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  @SerializedName("threshold_reason")
  ThresholdReason thresholdReason;

  /** Total after discounts and taxes. */
  @SerializedName("total")
  Long total;

  /** The aggregate amounts calculated per discount across all line items. */
  @SerializedName("total_discount_amounts")
  List<QuotePreviewInvoice.TotalDiscountAmount> totalDiscountAmounts;

  /**
   * The integer amount in cents (or local equivalent) representing the total amount of the invoice
   * including all discounts but excluding all tax.
   */
  @SerializedName("total_excluding_tax")
  Long totalExcludingTax;

  /** The aggregate amounts calculated per margin across all line items. */
  @SerializedName("total_margin_amounts")
  List<QuotePreviewInvoice.TotalMarginAmount> totalMarginAmounts;

  /**
   * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this invoice.
   * This is a combined list of total_pretax_credit_amounts across all invoice line items.
   */
  @SerializedName("total_pretax_credit_amounts")
  List<QuotePreviewInvoice.TotalPretaxCreditAmount> totalPretaxCreditAmounts;

  /** The aggregate amounts calculated per tax rate for all line items. */
  @SerializedName("total_tax_amounts")
  List<QuotePreviewInvoice.TotalTaxAmount> totalTaxAmounts;

  /**
   * The account (if any) the payment will be attributed to for tax reporting, and where funds from
   * the payment will be transferred to for the invoice.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * Invoices are automatically paid or sent 1 hour after webhooks are delivered, or until all
   * webhook delivery attempts have <a
   * href="https://stripe.com/docs/billing/webhooks#understand">been exhausted</a>. This field
   * tracks the time when webhooks for this invoice were successfully delivered. If the invoice had
   * no webhooks to deliver, this will be set while the invoice is being created.
   */
  @SerializedName("webhooks_delivered_at")
  Long webhooksDeliveredAt;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code defaultPaymentMethod} object. */
  public String getDefaultPaymentMethod() {
    return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getId() : null;
  }

  public void setDefaultPaymentMethod(String id) {
    this.defaultPaymentMethod = ApiResource.setExpandableFieldId(id, this.defaultPaymentMethod);
  }

  /** Get expanded {@code defaultPaymentMethod}. */
  public PaymentMethod getDefaultPaymentMethodObject() {
    return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getExpanded() : null;
  }

  public void setDefaultPaymentMethodObject(PaymentMethod expandableObject) {
    this.defaultPaymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code defaultSource} object. */
  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String id) {
    this.defaultSource = ApiResource.setExpandableFieldId(id, this.defaultSource);
  }

  /** Get expanded {@code defaultSource}. */
  public PaymentSource getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(PaymentSource expandableObject) {
    this.defaultSource =
        new ExpandableField<PaymentSource>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code latestRevision} object. */
  public String getLatestRevision() {
    return (this.latestRevision != null) ? this.latestRevision.getId() : null;
  }

  public void setLatestRevision(String id) {
    this.latestRevision = ApiResource.setExpandableFieldId(id, this.latestRevision);
  }

  /** Get expanded {@code latestRevision}. */
  public Invoice getLatestRevisionObject() {
    return (this.latestRevision != null) ? this.latestRevision.getExpanded() : null;
  }

  public void setLatestRevisionObject(Invoice expandableObject) {
    this.latestRevision = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentIntent} object. */
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String id) {
    this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
  }

  /** Get expanded {@code paymentIntent}. */
  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent expandableObject) {
    this.paymentIntent =
        new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code quote} object. */
  public String getQuote() {
    return (this.quote != null) ? this.quote.getId() : null;
  }

  public void setQuote(String id) {
    this.quote = ApiResource.setExpandableFieldId(id, this.quote);
  }

  /** Get expanded {@code quote}. */
  public Quote getQuoteObject() {
    return (this.quote != null) ? this.quote.getExpanded() : null;
  }

  public void setQuoteObject(Quote expandableObject) {
    this.quote = new ExpandableField<Quote>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code subscription} object. */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /** Get expanded {@code subscription}. */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription =
        new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code testClock} object. */
  public String getTestClock() {
    return (this.testClock != null) ? this.testClock.getId() : null;
  }

  public void setTestClock(String id) {
    this.testClock = ApiResource.setExpandableFieldId(id, this.testClock);
  }

  /** Get expanded {@code testClock}. */
  public TestClock getTestClockObject() {
    return (this.testClock != null) ? this.testClock.getExpanded() : null;
  }

  public void setTestClockObject(TestClock expandableObject) {
    this.testClock = new ExpandableField<TestClock>(expandableObject.getId(), expandableObject);
  }

  /** Get IDs of expandable {@code accountTaxIds} object list. */
  public List<String> getAccountTaxIds() {
    return (this.accountTaxIds != null)
        ? this.accountTaxIds.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setAccountTaxIds(List<String> ids) {
    if (ids == null) {
      this.accountTaxIds = null;
      return;
    }
    if (this.accountTaxIds != null
        && this.accountTaxIds.stream()
            .map(x -> x.getId())
            .collect(Collectors.toList())
            .equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.accountTaxIds =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<TaxId>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code accountTaxIds}. */
  public List<TaxId> getAccountTaxIdObjects() {
    return (this.accountTaxIds != null)
        ? this.accountTaxIds.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setAccountTaxIdObjects(List<TaxId> objs) {
    this.accountTaxIds =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<TaxId>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Get IDs of expandable {@code defaultMargins} object list. */
  public List<String> getDefaultMargins() {
    return (this.defaultMargins != null)
        ? this.defaultMargins.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultMargins(List<String> ids) {
    if (ids == null) {
      this.defaultMargins = null;
      return;
    }
    if (this.defaultMargins != null
        && this.defaultMargins.stream()
            .map(x -> x.getId())
            .collect(Collectors.toList())
            .equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.defaultMargins =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<Margin>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code defaultMargins}. */
  public List<Margin> getDefaultMarginObjects() {
    return (this.defaultMargins != null)
        ? this.defaultMargins.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultMarginObjects(List<Margin> objs) {
    this.defaultMargins =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<Margin>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Get IDs of expandable {@code discounts} object list. */
  public List<String> getDiscounts() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDiscounts(List<String> ids) {
    if (ids == null) {
      this.discounts = null;
      return;
    }
    if (this.discounts != null
        && this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.discounts =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public static QuotePreviewInvoiceCollection list(String quote, Map<String, Object> params)
      throws StripeException {
    return list(quote, params, (RequestOptions) null);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public static QuotePreviewInvoiceCollection list(
      String quote, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/preview_invoices", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, QuotePreviewInvoiceCollection.class);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public static QuotePreviewInvoiceCollection list(
      String quote, QuotePreviewInvoiceListParams params) throws StripeException {
    return list(quote, params, (RequestOptions) null);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public static QuotePreviewInvoiceCollection list(
      String quote, QuotePreviewInvoiceListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/preview_invoices", ApiResource.urlEncodeId(quote));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, QuotePreviewInvoiceCollection.class);
  }

  /**
   * For more details about AmountsDue, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountsDue extends StripeObject {
    /** Incremental amount due for this payment in cents (or local equivalent). */
    @SerializedName("amount")
    Long amount;

    /** The amount in cents (or local equivalent) that was paid for this payment. */
    @SerializedName("amount_paid")
    Long amountPaid;

    /**
     * The difference between the payment’s amount and amount_paid, in cents (or local equivalent).
     */
    @SerializedName("amount_remaining")
    Long amountRemaining;

    /** Number of days from when invoice is finalized until the payment is due. */
    @SerializedName("days_until_due")
    Long daysUntilDue;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /** Date on which a payment plan’s payment is due. */
    @SerializedName("due_date")
    Long dueDate;

    /** Timestamp when the payment was paid. */
    @SerializedName("paid_at")
    Long paidAt;

    /** The status of the payment, one of {@code open}, {@code paid}, or {@code past_due}. */
    @SerializedName("status")
    String status;
  }

  /**
   * For more details about AppliesTo, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AppliesTo extends StripeObject {
    /**
     * A custom string that identifies a new subscription schedule being created upon quote
     * acceptance. All quote lines with the same {@code new_reference} field will be applied to the
     * creation of a new subscription schedule.
     */
    @SerializedName("new_reference")
    String newReference;

    /** The ID of the schedule the line applies to. */
    @SerializedName("subscription_schedule")
    String subscriptionSchedule;

    /**
     * Describes whether the quote line is affecting a new schedule or an existing schedule.
     *
     * <p>One of {@code new_reference}, or {@code subscription_schedule}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about AutomaticTax, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /**
     * If Stripe disabled automatic tax, this enum describes why.
     *
     * <p>One of {@code finalization_requires_location_inputs}, or {@code
     * finalization_system_error}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Whether Stripe automatically computes tax on this invoice. Note that incompatible invoice
     * items (invoice items with manually specified <a
     * href="https://stripe.com/docs/api/tax_rates">tax rates</a>, negative amounts, or {@code
     * tax_behavior=unspecified}) cannot be added to automatic tax invoices.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    /**
     * The status of the most recent automated tax calculation for this invoice.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;

    /**
     * For more details about Liability, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability extends StripeObject {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Account> account;

      /**
       * Type of the account referenced.
       *
       * <p>One of {@code account}, or {@code self}.
       */
      @SerializedName("type")
      String type;

      /** Get ID of expandable {@code account} object. */
      public String getAccount() {
        return (this.account != null) ? this.account.getId() : null;
      }

      public void setAccount(String id) {
        this.account = ApiResource.setExpandableFieldId(id, this.account);
      }

      /** Get expanded {@code account}. */
      public Account getAccountObject() {
        return (this.account != null) ? this.account.getExpanded() : null;
      }

      public void setAccountObject(Account expandableObject) {
        this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
      }
    }
  }

  /**
   * For more details about CustomField, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomField extends StripeObject {
    /** The name of the custom field. */
    @SerializedName("name")
    String name;

    /** The value of the custom field. */
    @SerializedName("value")
    String value;
  }

  /**
   * For more details about CustomerTaxId, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerTaxId extends StripeObject {
    /**
     * The type of the tax ID, one of {@code ad_nrt}, {@code ar_cuit}, {@code eu_vat}, {@code
     * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
     * {@code do_rcn}, {@code ec_ruc}, {@code eu_oss_vat}, {@code hr_oib}, {@code pe_ruc}, {@code
     * ro_tin}, {@code rs_pib}, {@code sv_nit}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin},
     * {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code
     * no_vat}, {@code no_voec}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
     * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code tw_vat},
     * {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid}, {@code li_vat},
     * {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code ca_gst_hst}, {@code
     * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst}, {@code sg_gst}, {@code
     * ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code my_frp}, {@code il_vat},
     * {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic}, {@code hu_tin}, {@code
     * si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code ph_tin}, {@code bh_vat},
     * {@code kz_bin}, {@code ng_tin}, {@code om_vat}, {@code de_stn}, {@code ch_uid}, {@code
     * tz_vat}, {@code uz_vat}, {@code uz_tin}, {@code md_vat}, {@code ma_vat}, {@code by_tin},
     * {@code ao_tin}, {@code bs_tin}, {@code bb_tin}, {@code cd_nif}, {@code mr_nif}, {@code
     * me_pib}, {@code zw_tin}, {@code ba_tin}, {@code gn_nif}, {@code mk_vat}, {@code sr_fin},
     * {@code sn_ninea}, {@code am_tin}, {@code np_pan}, {@code tj_tin}, {@code ug_tin}, {@code
     * zm_tin}, {@code kh_tin}, or {@code unknown}.
     */
    @SerializedName("type")
    String type;

    /** The value of the tax ID. */
    @SerializedName("value")
    String value;
  }

  /**
   * For more details about FromInvoice, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FromInvoice extends StripeObject {
    /** The relation between this invoice and the cloned invoice. */
    @SerializedName("action")
    String action;

    /** The invoice that was cloned. */
    @SerializedName("invoice")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Invoice> invoice;

    /** Get ID of expandable {@code invoice} object. */
    public String getInvoice() {
      return (this.invoice != null) ? this.invoice.getId() : null;
    }

    public void setInvoice(String id) {
      this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
    }

    /** Get expanded {@code invoice}. */
    public Invoice getInvoiceObject() {
      return (this.invoice != null) ? this.invoice.getExpanded() : null;
    }

    public void setInvoiceObject(Invoice expandableObject) {
      this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Issuer, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Issuer extends StripeObject {
    /** The connected account being referenced when {@code type} is {@code account}. */
    @SerializedName("account")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> account;

    /**
     * Type of the account referenced.
     *
     * <p>One of {@code account}, or {@code self}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code account} object. */
    public String getAccount() {
      return (this.account != null) ? this.account.getId() : null;
    }

    public void setAccount(String id) {
      this.account = ApiResource.setExpandableFieldId(id, this.account);
    }

    /** Get expanded {@code account}. */
    public Account getAccountObject() {
      return (this.account != null) ? this.account.getExpanded() : null;
    }

    public void setAccountObject(Account expandableObject) {
      this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about PaymentSettings, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentSettings extends StripeObject {
    /**
     * ID of the mandate to be used for this invoice. It must correspond to the payment method used
     * to pay the invoice, including the invoice's default_payment_method or default_source, if set.
     */
    @SerializedName("default_mandate")
    String defaultMandate;

    /** Payment-method-specific configuration to provide to the invoice’s PaymentIntent. */
    @SerializedName("payment_method_options")
    PaymentMethodOptions paymentMethodOptions;

    /**
     * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If
     * not set, Stripe attempts to automatically determine the types to use by looking at the
     * invoice’s default payment method, the subscription’s default payment method, the customer’s
     * default payment method, and your <a
     * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
     */
    @SerializedName("payment_method_types")
    List<String> paymentMethodTypes;

    /**
     * For more details about PaymentMethodOptions, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodOptions extends StripeObject {
      /**
       * If paying by {@code acss_debit}, this sub-hash contains details about the Canadian
       * pre-authorized debit payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("acss_debit")
      AcssDebit acssDebit;

      /**
       * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
       * payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("bancontact")
      Bancontact bancontact;

      /**
       * If paying by {@code card}, this sub-hash contains details about the Card payment method
       * options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("card")
      Card card;

      /**
       * If paying by {@code customer_balance}, this sub-hash contains details about the Bank
       * transfer payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("customer_balance")
      CustomerBalance customerBalance;

      /**
       * If paying by {@code id_bank_transfer}, this sub-hash contains details about the Indonesia
       * bank transfer payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("id_bank_transfer")
      IdBankTransfer idBankTransfer;

      /**
       * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
       * method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("konbini")
      Konbini konbini;

      /**
       * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Direct Debit
       * payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("sepa_debit")
      SepaDebit sepaDebit;

      /**
       * If paying by {@code us_bank_account}, this sub-hash contains details about the ACH direct
       * debit payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("us_bank_account")
      UsBankAccount usBankAccount;

      /**
       * For more details about AcssDebit, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class AcssDebit extends StripeObject {
        @SerializedName("mandate_options")
        MandateOptions mandateOptions;

        /**
         * Bank account verification method.
         *
         * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
         */
        @SerializedName("verification_method")
        String verificationMethod;

        /**
         * For more details about MandateOptions, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MandateOptions extends StripeObject {
          /**
           * Transaction type of the mandate.
           *
           * <p>One of {@code business}, or {@code personal}.
           */
          @SerializedName("transaction_type")
          String transactionType;
        }
      }

      /**
       * For more details about Bancontact, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Bancontact extends StripeObject {
        /**
         * Preferred language of the Bancontact authorization page that the customer is redirected
         * to.
         *
         * <p>One of {@code de}, {@code en}, {@code fr}, or {@code nl}.
         */
        @SerializedName("preferred_language")
        String preferredLanguage;
      }

      /**
       * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        @SerializedName("installments")
        Installments installments;

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Read our guide on <a
         * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
         *
         * <p>One of {@code any}, {@code automatic}, or {@code challenge}.
         */
        @SerializedName("request_three_d_secure")
        String requestThreeDSecure;

        /**
         * For more details about Installments, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Installments extends StripeObject {
          /** Whether Installments are enabled for this Invoice. */
          @SerializedName("enabled")
          Boolean enabled;
        }
      }

      /**
       * For more details about CustomerBalance, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomerBalance extends StripeObject {
        @SerializedName("bank_transfer")
        BankTransfer bankTransfer;

        /**
         * The funding method type to be used when there are not enough funds in the customer
         * balance. Permitted values include: {@code bank_transfer}.
         *
         * <p>Equal to {@code bank_transfer}.
         */
        @SerializedName("funding_type")
        String fundingType;

        /**
         * For more details about BankTransfer, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class BankTransfer extends StripeObject {
          @SerializedName("eu_bank_transfer")
          EuBankTransfer euBankTransfer;

          /**
           * The bank transfer type that can be used for funding. Permitted values include: {@code
           * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code
           * mx_bank_transfer}, or {@code us_bank_transfer}.
           */
          @SerializedName("type")
          String type;

          /**
           * For more details about EuBankTransfer, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class EuBankTransfer extends StripeObject {
            /**
             * The desired country code of the bank account information. Permitted values include:
             * {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code NL}.
             *
             * <p>One of {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE}, or {@code NL}.
             */
            @SerializedName("country")
            String country;
          }
        }
      }

      /**
       * For more details about IdBankTransfer, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class IdBankTransfer extends StripeObject {}

      /**
       * For more details about Konbini, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Konbini extends StripeObject {}

      /**
       * For more details about SepaDebit, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SepaDebit extends StripeObject {}

      /**
       * For more details about UsBankAccount, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class UsBankAccount extends StripeObject {
        @SerializedName("financial_connections")
        FinancialConnections financialConnections;

        /**
         * Bank account verification method.
         *
         * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
         */
        @SerializedName("verification_method")
        String verificationMethod;

        /**
         * For more details about FinancialConnections, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class FinancialConnections extends StripeObject {
          @SerializedName("filters")
          Filters filters;

          /**
           * The list of permissions to request. The {@code payment_method} permission must be
           * included.
           */
          @SerializedName("permissions")
          List<String> permissions;

          /** Data features requested to be retrieved upon account creation. */
          @SerializedName("prefetch")
          List<String> prefetch;

          /**
           * For more details about Filters, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Filters extends StripeObject {
            /**
             * The account subcategories to use to filter for possible accounts to link. Valid
             * subcategories are {@code checking} and {@code savings}.
             */
            @SerializedName("account_subcategories")
            List<String> accountSubcategories;

            /** The institution to use to filter for possible accounts to link. */
            @SerializedName("institution")
            String institution;
          }
        }
      }
    }
  }

  /**
   * For more details about Rendering, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Rendering extends StripeObject {
    /** How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. */
    @SerializedName("amount_tax_display")
    String amountTaxDisplay;

    /** Invoice pdf rendering options. */
    @SerializedName("pdf")
    Pdf pdf;

    /** ID of the rendering template that the invoice is formatted by. */
    @SerializedName("template")
    String template;

    /** Version of the rendering template that the invoice is using. */
    @SerializedName("template_version")
    Long templateVersion;

    /**
     * For more details about Pdf, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pdf extends StripeObject {
      /**
       * Page size of invoice pdf. Options include a4, letter, and auto. If set to auto, page size
       * will be switched to a4 or letter based on customer locale.
       *
       * <p>One of {@code a4}, {@code auto}, or {@code letter}.
       */
      @SerializedName("page_size")
      String pageSize;
    }
  }

  /**
   * For more details about ShippingCost, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost extends StripeObject {
    /** Total shipping cost before any taxes are applied. */
    @SerializedName("amount_subtotal")
    Long amountSubtotal;

    /** Total tax amount applied due to shipping costs. If no tax was applied, defaults to 0. */
    @SerializedName("amount_tax")
    Long amountTax;

    /** Total shipping cost after taxes are applied. */
    @SerializedName("amount_total")
    Long amountTotal;

    /** The ID of the ShippingRate for this invoice. */
    @SerializedName("shipping_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<ShippingRate> shippingRate;

    /** The taxes applied to the shipping rate. */
    @SerializedName("taxes")
    List<QuotePreviewInvoice.ShippingCost.Tax> taxes;

    /** Get ID of expandable {@code shippingRate} object. */
    public String getShippingRate() {
      return (this.shippingRate != null) ? this.shippingRate.getId() : null;
    }

    public void setShippingRate(String id) {
      this.shippingRate = ApiResource.setExpandableFieldId(id, this.shippingRate);
    }

    /** Get expanded {@code shippingRate}. */
    public ShippingRate getShippingRateObject() {
      return (this.shippingRate != null) ? this.shippingRate.getExpanded() : null;
    }

    public void setShippingRateObject(ShippingRate expandableObject) {
      this.shippingRate =
          new ExpandableField<ShippingRate>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** Amount of tax applied for this rate. */
      @SerializedName("amount")
      Long amount;

      /**
       * Tax rates can be applied to <a
       * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
       * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
       * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
       * Sessions</a> to collect tax.
       *
       * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
       */
      @SerializedName("rate")
      TaxRate rate;

      /**
       * The reasoning behind this tax, for example, if the product is tax exempt. The possible
       * values for this field may be extended as new tax rules are supported.
       *
       * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
       * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
       * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
       * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
       * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
       */
      @SerializedName("taxability_reason")
      String taxabilityReason;

      /** The amount on which tax is calculated, in cents (or local equivalent). */
      @SerializedName("taxable_amount")
      Long taxableAmount;
    }
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time that the invoice draft was finalized. */
    @SerializedName("finalized_at")
    Long finalizedAt;

    /** The time that the invoice was marked uncollectible. */
    @SerializedName("marked_uncollectible_at")
    Long markedUncollectibleAt;

    /** The time that the invoice was paid. */
    @SerializedName("paid_at")
    Long paidAt;

    /** The time that the invoice was voided. */
    @SerializedName("voided_at")
    Long voidedAt;
  }

  /**
   * For more details about SubscriptionDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionDetails extends StripeObject {
    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> defined as
     * subscription metadata when an invoice is created. Becomes an immutable snapshot of the
     * subscription metadata at the time of invoice finalization. <em>Note: This attribute is
     * populated only for invoices created on or after June 29, 2023.</em>
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * If specified, payment collection for this subscription will be paused. Note that the
     * subscription status will be unchanged and will not be updated to {@code paused}. Learn more
     * about <a href="https://stripe.com/docs/billing/subscriptions/pause-payment">pausing
     * collection</a>.
     */
    @SerializedName("pause_collection")
    PauseCollection pauseCollection;

    /**
     * The Pause Collection settings determine how we will pause collection for this subscription
     * and for how long the subscription should be paused.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PauseCollection extends StripeObject {
      /**
       * The payment collection behavior for this subscription while paused. One of {@code
       * keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
       */
      @SerializedName("behavior")
      String behavior;

      /** The time after which the subscription will resume collecting payments. */
      @SerializedName("resumes_at")
      Long resumesAt;
    }
  }

  /**
   * For more details about ThresholdReason, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ThresholdReason extends StripeObject {
    /** The total invoice amount threshold boundary if it triggered the threshold invoice. */
    @SerializedName("amount_gte")
    Long amountGte;

    /** Indicates which line items triggered a threshold invoice. */
    @SerializedName("item_reasons")
    List<QuotePreviewInvoice.ThresholdReason.ItemReason> itemReasons;

    /**
     * For more details about ItemReason, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ItemReason extends StripeObject {
      /** The IDs of the line items that triggered the threshold invoice. */
      @SerializedName("line_item_ids")
      List<String> lineItemIds;

      /** The quantity threshold boundary that applied to the given line item. */
      @SerializedName("usage_gte")
      Long usageGte;
    }
  }

  /**
   * For more details about TotalDiscountAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDiscountAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the discount. */
    @SerializedName("amount")
    Long amount;

    /** The discount that was applied to get this discount amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about TotalMarginAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalMarginAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the reduction in line item amount. */
    @SerializedName("amount")
    Long amount;

    /** The margin that was applied to get this margin amount. */
    @SerializedName("margin")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Margin> margin;

    /** Get ID of expandable {@code margin} object. */
    public String getMargin() {
      return (this.margin != null) ? this.margin.getId() : null;
    }

    public void setMargin(String id) {
      this.margin = ApiResource.setExpandableFieldId(id, this.margin);
    }

    /** Get expanded {@code margin}. */
    public Margin getMarginObject() {
      return (this.margin != null) ? this.margin.getExpanded() : null;
    }

    public void setMarginObject(Margin expandableObject) {
      this.margin = new ExpandableField<Margin>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about TotalPretaxCreditAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalPretaxCreditAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the pretax credit amount. */
    @SerializedName("amount")
    Long amount;

    /** The credit balance transaction that was applied to get this pretax credit amount. */
    @SerializedName("credit_balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<CreditBalanceTransaction> creditBalanceTransaction;

    /** The discount that was applied to get this pretax credit amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** The margin that was applied to get this pretax credit amount. */
    @SerializedName("margin")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Margin> margin;

    /**
     * Type of the pretax credit amount referenced.
     *
     * <p>One of {@code credit_balance_transaction}, {@code discount}, or {@code margin}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code creditBalanceTransaction} object. */
    public String getCreditBalanceTransaction() {
      return (this.creditBalanceTransaction != null) ? this.creditBalanceTransaction.getId() : null;
    }

    public void setCreditBalanceTransaction(String id) {
      this.creditBalanceTransaction =
          ApiResource.setExpandableFieldId(id, this.creditBalanceTransaction);
    }

    /** Get expanded {@code creditBalanceTransaction}. */
    public CreditBalanceTransaction getCreditBalanceTransactionObject() {
      return (this.creditBalanceTransaction != null)
          ? this.creditBalanceTransaction.getExpanded()
          : null;
    }

    public void setCreditBalanceTransactionObject(CreditBalanceTransaction expandableObject) {
      this.creditBalanceTransaction =
          new ExpandableField<CreditBalanceTransaction>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code margin} object. */
    public String getMargin() {
      return (this.margin != null) ? this.margin.getId() : null;
    }

    public void setMargin(String id) {
      this.margin = ApiResource.setExpandableFieldId(id, this.margin);
    }

    /** Get expanded {@code margin}. */
    public Margin getMarginObject() {
      return (this.margin != null) ? this.margin.getExpanded() : null;
    }

    public void setMarginObject(Margin expandableObject) {
      this.margin = new ExpandableField<Margin>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about TotalTaxAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalTaxAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the tax. */
    @SerializedName("amount")
    Long amount;

    /** Whether this tax amount is inclusive or exclusive. */
    @SerializedName("inclusive")
    Boolean inclusive;

    /** The tax rate that was applied to get this tax amount. */
    @SerializedName("tax_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<TaxRate> taxRate;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values
     * for this field may be extended as new tax rules are supported.
     *
     * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
     * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
     * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday}, {@code
     * proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code standard_rated},
     * {@code taxable_basis_reduced}, or {@code zero_rated}.
     */
    @SerializedName("taxability_reason")
    String taxabilityReason;

    /** The amount on which tax is calculated, in cents (or local equivalent). */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /** Get ID of expandable {@code taxRate} object. */
    public String getTaxRate() {
      return (this.taxRate != null) ? this.taxRate.getId() : null;
    }

    public void setTaxRate(String id) {
      this.taxRate = ApiResource.setExpandableFieldId(id, this.taxRate);
    }

    /** Get expanded {@code taxRate}. */
    public TaxRate getTaxRateObject() {
      return (this.taxRate != null) ? this.taxRate.getExpanded() : null;
    }

    public void setTaxRateObject(TaxRate expandableObject) {
      this.taxRate = new ExpandableField<TaxRate>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about TransferData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount in cents (or local equivalent) that will be transferred to the destination account
     * when the invoice is paid. By default, the entire amount is transferred to the destination.
     */
    @SerializedName("amount")
    Long amount;

    /** The account where funds from the payment will be transferred to upon payment success. */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get ID of expandable {@code destination} object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded {@code destination}. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(appliesTo, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(customerAddress, responseGetter);
    trySetResponseGetter(customerShipping, responseGetter);
    trySetResponseGetter(defaultPaymentMethod, responseGetter);
    trySetResponseGetter(defaultSource, responseGetter);
    trySetResponseGetter(discount, responseGetter);
    trySetResponseGetter(fromInvoice, responseGetter);
    trySetResponseGetter(issuer, responseGetter);
    trySetResponseGetter(lastFinalizationError, responseGetter);
    trySetResponseGetter(latestRevision, responseGetter);
    trySetResponseGetter(lines, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(paymentIntent, responseGetter);
    trySetResponseGetter(paymentSettings, responseGetter);
    trySetResponseGetter(payments, responseGetter);
    trySetResponseGetter(quote, responseGetter);
    trySetResponseGetter(rendering, responseGetter);
    trySetResponseGetter(shippingCost, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(subscriptionDetails, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
    trySetResponseGetter(thresholdReason, responseGetter);
    trySetResponseGetter(transferData, responseGetter);
  }
}
