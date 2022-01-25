// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.InvoiceCreateParams;
import com.stripe.param.InvoiceFinalizeInvoiceParams;
import com.stripe.param.InvoiceListParams;
import com.stripe.param.InvoiceMarkUncollectibleParams;
import com.stripe.param.InvoicePayParams;
import com.stripe.param.InvoiceRetrieveParams;
import com.stripe.param.InvoiceSendInvoiceParams;
import com.stripe.param.InvoiceUpcomingParams;
import com.stripe.param.InvoiceUpdateParams;
import com.stripe.param.InvoiceVoidInvoiceParams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Invoice extends ApiResource implements HasId, MetadataStore<Invoice> {
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

  /** The amount, in %s, that was paid. */
  @SerializedName("amount_paid")
  Long amountPaid;

  /** The amount remaining, in %s, that is due. */
  @SerializedName("amount_remaining")
  Long amountRemaining;

  /**
   * The fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account when the invoice is paid.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Number of payment attempts made for this invoice, from the perspective of the payment retry
   * schedule. Any payment attempt counts as the first attempt, and subsequently only automatic
   * retries increment the attempt count. In other words, manual payment attempts after the first
   * attempt do not affect the retry schedule.
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

  /**
   * Controls whether Stripe will perform <a
   * href="https://stripe.com/docs/billing/invoices/workflow/#auto_advance">automatic collection</a>
   * of the invoice. When {@code false}, the invoice's state will not automatically advance without
   * an explicit action.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Indicates the reason why the invoice was created. {@code subscription_cycle} indicates an
   * invoice created by a subscription advancing into a new period. {@code subscription_create}
   * indicates an invoice created due to creating a subscription. {@code subscription_update}
   * indicates an invoice created due to updating a subscription. {@code subscription} is set for
   * all old invoices to indicate either a change to a subscription or a period advancement. {@code
   * manual} is set for all invoices unrelated to a subscription (for example: created via the
   * invoice editor). The {@code upcoming} value is reserved for simulated invoices per the upcoming
   * invoice endpoint. {@code subscription_threshold} indicates an invoice created due to a billing
   * threshold being reached.
   *
   * <p>One of {@code automatic_pending_invoice_item_invoice}, {@code manual}, {@code quote_accept},
   * {@code subscription}, {@code subscription_create}, {@code subscription_cycle}, {@code
   * subscription_threshold}, {@code subscription_update}, or {@code upcoming}.
   */
  @SerializedName("billing_reason")
  String billingReason;

  /** ID of the latest charge generated for this invoice, if any. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

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

  /** The ID of the customer who will be billed. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

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
  List<Invoice.CustomerTaxId> customerTaxIds;

  /** Custom fields displayed on the invoice. */
  @SerializedName("custom_fields")
  List<Invoice.CustomField> customFields;

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

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

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
   * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the
   * invoice has not been finalized yet, this will be null.
   */
  @SerializedName("hosted_invoice_url")
  String hostedInvoiceUrl;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The link to download the PDF for the invoice. If the invoice has not been finalized yet, this
   * will be null.
   */
  @SerializedName("invoice_pdf")
  String invoicePdf;

  /**
   * The error encountered during the previous attempt to finalize the invoice. This field is
   * cleared when the invoice is successfully finalized.
   */
  @SerializedName("last_finalization_error")
  StripeError lastFinalizationError;

  /**
   * The individual line items that make up the invoice. {@code lines} is sorted as follows: invoice
   * items in reverse chronological order, followed by the subscription, if any.
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
  @Getter(onMethod_ = {@Override})
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
   * <p>Equal to {@code invoice}.
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

  /** End of the usage period during which invoice items were added to this invoice. */
  @SerializedName("period_end")
  Long periodEnd;

  /** Start of the usage period during which invoice items were added to this invoice. */
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
   * Starting customer balance before the invoice is finalized. If the invoice has not been
   * finalized yet, this will be the current customer balance.
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

  /** The subscription that this invoice was prepared for, if any. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /**
   * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
   */
  @SerializedName("subscription_proration_date")
  Long subscriptionProrationDate;

  /**
   * Total of all subscriptions, invoice items, and prorations on the invoice before any invoice
   * level discount or tax is applied. Item discounts are already incorporated
   */
  @SerializedName("subtotal")
  Long subtotal;

  /** The amount of tax on this invoice. This is the sum of all the tax amounts on this invoice. */
  @SerializedName("tax")
  Long tax;

  @SerializedName("threshold_reason")
  ThresholdReason thresholdReason;

  /** Total after discounts and taxes. */
  @SerializedName("total")
  Long total;

  /** The aggregate amounts calculated per discount across all line items. */
  @SerializedName("total_discount_amounts")
  List<Invoice.DiscountAmount> totalDiscountAmounts;

  /** The aggregate amounts calculated per tax rate for all line items. */
  @SerializedName("total_tax_amounts")
  List<Invoice.TaxAmount> totalTaxAmounts;

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

  /** Get ID of expandable {@code charge} object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded {@code charge}. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
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
    if (this.accountTaxIds.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
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
    if (this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
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

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public static InvoiceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public static InvoiceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices");
    return ApiResource.requestCollection(url, params, InvoiceCollection.class, options);
  }

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public static InvoiceCollection list(InvoiceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public static InvoiceCollection list(InvoiceListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices");
    return ApiResource.requestCollection(url, params, InvoiceCollection.class, options);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discounts that are applicable to the invoice.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public static Invoice upcoming() throws StripeException {
    return upcoming((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discounts that are applicable to the invoice.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public static Invoice upcoming(Map<String, Object> params) throws StripeException {
    return upcoming(params, (RequestOptions) null);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discounts that are applicable to the invoice.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public static Invoice upcoming(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices/upcoming");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discounts that are applicable to the invoice.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public static Invoice upcoming(InvoiceUpcomingParams params) throws StripeException {
    return upcoming(params, (RequestOptions) null);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discounts that are applicable to the invoice.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public static Invoice upcoming(InvoiceUpcomingParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices/upcoming");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations. The invoice remains a draft
   * until you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice,
   * which allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public static Invoice create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations. The invoice remains a draft
   * until you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice,
   * which allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public static Invoice create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations. The invoice remains a draft
   * until you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice,
   * which allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public static Invoice create(InvoiceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations. The invoice remains a draft
   * until you <a href="https://stripe.com/docs/api#finalize_invoice">finalize</a> the invoice,
   * which allows you to <a href="https://stripe.com/docs/api#pay_invoice">pay</a> or <a
   * href="https://stripe.com/docs/api#send_invoice">send</a> the invoice to your customers.
   */
  public static Invoice create(InvoiceCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /** Retrieves the invoice with the given ID. */
  public static Invoice retrieve(String invoice) throws StripeException {
    return retrieve(invoice, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the invoice with the given ID. */
  public static Invoice retrieve(String invoice, RequestOptions options) throws StripeException {
    return retrieve(invoice, (Map<String, Object>) null, options);
  }

  /** Retrieves the invoice with the given ID. */
  public static Invoice retrieve(String invoice, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s", ApiResource.urlEncodeId(invoice)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /** Retrieves the invoice with the given ID. */
  public static Invoice retrieve(
      String invoice, InvoiceRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s", ApiResource.urlEncodeId(invoice)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass <code>auto_advance=false</code>.
   */
  @Override
  public Invoice update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass <code>auto_advance=false</code>.
   */
  @Override
  public Invoice update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass <code>auto_advance=false</code>.
   */
  public Invoice update(InvoiceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="https://stripe.com/docs/billing/invoices/workflow#finalized">finalized</a>, monetary
   * values, as well as <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="https://stripe.com/docs/billing/invoices/reconciliation">automatically reconciling</a>
   * invoices, pass <code>auto_advance=false</code>.
   */
  public Invoice update(InvoiceUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a one-off invoice draft. This cannot be undone. Attempts to delete invoices
   * that are no longer in a draft state will fail; once an invoice has been finalized or if an
   * invoice is for a subscription, it must be <a
   * href="https://stripe.com/docs/api#void_invoice">voided</a>.
   */
  public Invoice delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay() throws StripeException {
    return pay((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(RequestOptions options) throws StripeException {
    return pay((Map<String, Object>) null, options);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(Map<String, Object> params) throws StripeException {
    return pay(params, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/pay", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(InvoicePayParams params) throws StripeException {
    return pay(params, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(InvoicePayParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/pay", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice() throws StripeException {
    return finalizeInvoice((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(RequestOptions options) throws StripeException {
    return finalizeInvoice((Map<String, Object>) null, options);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(Map<String, Object> params) throws StripeException {
    return finalizeInvoice(params, (RequestOptions) null);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/finalize", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(InvoiceFinalizeInvoiceParams params) throws StripeException {
    return finalizeInvoice(params, (RequestOptions) null);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(InvoiceFinalizeInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/finalize", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice() throws StripeException {
    return sendInvoice((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(RequestOptions options) throws StripeException {
    return sendInvoice((Map<String, Object>) null, options);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(Map<String, Object> params) throws StripeException {
    return sendInvoice(params, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/send", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(InvoiceSendInvoiceParams params) throws StripeException {
    return sendInvoice(params, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(InvoiceSendInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/send", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible() throws StripeException {
    return markUncollectible((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(RequestOptions options) throws StripeException {
    return markUncollectible((Map<String, Object>) null, options);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(Map<String, Object> params) throws StripeException {
    return markUncollectible(params, (RequestOptions) null);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/invoices/%s/mark_uncollectible", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(InvoiceMarkUncollectibleParams params) throws StripeException {
    return markUncollectible(params, (RequestOptions) null);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(InvoiceMarkUncollectibleParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/invoices/%s/mark_uncollectible", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice() throws StripeException {
    return voidInvoice((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(RequestOptions options) throws StripeException {
    return voidInvoice((Map<String, Object>) null, options);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(Map<String, Object> params) throws StripeException {
    return voidInvoice(params, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/void", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(InvoiceVoidInvoiceParams params) throws StripeException {
    return voidInvoice(params, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="https://stripe.com/docs/api#delete_invoice">deletion</a>, however it only applies to
   * finalized invoices and maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(InvoiceVoidInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/invoices/%s/void", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Whether Stripe automatically computes tax on this invoice. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The status of the most recent automated tax calculation for this invoice.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;
  }

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerTaxId extends StripeObject {
    /**
     * The type of the tax ID, one of {@code eu_vat}, {@code br_cnpj}, {@code br_cpf}, {@code
     * gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code in_gst}, {@code no_vat},
     * {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen}, {@code ru_inn}, {@code
     * ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code tw_vat}, {@code th_vat}, {@code
     * jp_cn}, {@code jp_rn}, {@code li_uid}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code
     * ca_qst}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code
     * my_sst}, {@code sg_gst}, {@code ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp},
     * {@code my_frp}, {@code il_vat}, {@code ge_vat}, {@code ua_vat}, {@code is_vat}, or {@code
     * unknown}.
     */
    @SerializedName("type")
    String type;

    /** The value of the tax ID. */
    @SerializedName("value")
    String value;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DiscountAmount extends StripeObject {
    /** The amount, in %s, of the discount. */
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
     * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact payment
     * method options to pass to the invoice’s PaymentIntent.
     */
    @SerializedName("bancontact")
    Bancontact bancontact;

    /**
     * If paying by {@code card}, this sub-hash contains details about the Card payment method
     * options to pass to the invoice’s PaymentIntent.
     */
    @SerializedName("card")
    Card card;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       *
       * <p>One of {@code de}, {@code en}, {@code fr}, or {@code nl}.
       */
      @SerializedName("preferred_language")
      String preferredLanguage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. Read our guide on <a
       * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
       * Secure</a> for more information on how this configuration interacts with Radar and our SCA
       * Engine.
       *
       * <p>One of {@code any}, or {@code automatic}.
       */
      @SerializedName("request_three_d_secure")
      String requestThreeDSecure;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentSettings extends StripeObject {
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
  }

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxAmount extends StripeObject {
    /** The amount, in %s, of the tax. */
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ThresholdItemReason extends StripeObject {
    /** The IDs of the line items that triggered the threshold invoice. */
    @SerializedName("line_item_ids")
    List<String> lineItemIds;

    /** The quantity threshold boundary that applied to the given line item. */
    @SerializedName("usage_gte")
    Long usageGte;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ThresholdReason extends StripeObject {
    /** The total invoice amount threshold boundary if it triggered the threshold invoice. */
    @SerializedName("amount_gte")
    Long amountGte;

    /** Indicates which line items triggered a threshold invoice. */
    @SerializedName("item_reasons")
    List<Invoice.ThresholdItemReason> itemReasons;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount in %s that will be transferred to the destination account when the invoice is
     * paid. By default, the entire amount is transferred to the destination.
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
}
