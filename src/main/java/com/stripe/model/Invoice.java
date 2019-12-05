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
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
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

  /**
   * Final amount due at this time for this invoice. If the invoice's total is smaller than the
   * minimum charge amount, for example, or if there is account credit that can be applied to the
   * invoice, the `amount_due` may be 0. If there is a positive `starting_balance` for the invoice
   * (the customer owes money), the `amount_due` will also take that into account. The charge that
   * gets generated for the invoice will be for the amount specified in `amount_due`.
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
   * after the `invoice.created` webhook, for example, so you might not want to display that invoice
   * as unpaid to your users.
   */
  @SerializedName("attempted")
  Boolean attempted;

  /**
   * Controls whether Stripe will perform [automatic
   * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
   * When `false`, the invoice's state will not automatically advance without an explicit action.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /**
   * Indicates the reason why the invoice was created. `subscription_cycle` indicates an invoice
   * created by a subscription advancing into a new period. `subscription_create` indicates an
   * invoice created due to creating a subscription. `subscription_update` indicates an invoice
   * created due to updating a subscription. `subscription` is set for all old invoices to indicate
   * either a change to a subscription or a period advancement. `manual` is set for all invoices
   * unrelated to a subscription (for example: created via the invoice editor). The `upcoming` value
   * is reserved for simulated invoices per the upcoming invoice endpoint. `subscription_threshold`
   * indicates an invoice created due to a billing threshold being reached.
   *
   * <p>One of `automatic_pending_invoice_item_invoice`, `manual`, `subscription`,
   * `subscription_create`, `subscription_cycle`, `subscription_threshold`, `subscription_update`,
   * or `upcoming`.
   */
  @SerializedName("billing_reason")
  String billingReason;

  /** ID of the latest charge generated for this invoice, if any. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay this invoice using the default source attached to the customer. When sending an
   * invoice, Stripe will email this invoice to the customer with payment instructions.
   *
   * <p>One of `charge_automatically`, or `send_invoice`.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** Custom fields displayed on the invoice. */
  @SerializedName("custom_fields")
  List<Invoice.CustomField> customFields;

  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * The customer's address. Until the invoice is finalized, this field will equal
   * `customer.address`. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_address")
  Address customerAddress;

  /**
   * The customer's email. Until the invoice is finalized, this field will equal `customer.email`.
   * Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /**
   * The customer's name. Until the invoice is finalized, this field will equal `customer.name`.
   * Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_name")
  String customerName;

  /**
   * The customer's phone number. Until the invoice is finalized, this field will equal
   * `customer.phone`. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_phone")
  String customerPhone;

  /**
   * The customer's shipping information. Until the invoice is finalized, this field will equal
   * `customer.shipping`. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_shipping")
  ShippingDetails customerShipping;

  /**
   * The customer's tax exempt status. Until the invoice is finalized, this field will equal
   * `customer.tax_exempt`. Once the invoice is finalized, this field will no longer be updated.
   *
   * <p>One of `exempt`, `none`, or `reverse`.
   */
  @SerializedName("customer_tax_exempt")
  String customerTaxExempt;

  /**
   * The customer's tax IDs. Until the invoice is finalized, this field will contain the same tax
   * IDs as `customer.tax_ids`. Once the invoice is finalized, this field will no longer be updated.
   */
  @SerializedName("customer_tax_ids")
  List<Invoice.CustomerTaxId> customerTaxIds;

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

  @SerializedName("discount")
  Discount discount;

  /**
   * The date on which payment for this invoice is due. This value will be `null` for invoices where
   * `collection_method=charge_automatically`.
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
   * The individual line items that make up the invoice. `lines` is sorted as follows: invoice items
   * in reverse chronological order, followed by the subscription, if any.
   */
  @SerializedName("lines")
  InvoiceLineItemCollection lines;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The time at which payment will next be attempted. This value will be `null` for invoices where
   * `collection_method=send_invoice`.
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
   * <p>Equal to `invoice`.
   */
  @SerializedName("object")
  String object;

  /**
   * Whether payment was successfully collected for this invoice. An invoice can be paid (most
   * commonly) with a charge or with credit from the customer's account balance.
   */
  @SerializedName("paid")
  Boolean paid;

  /**
   * The PaymentIntent associated with this invoice. The PaymentIntent is generated when the invoice
   * is finalized, and can then be used to pay the invoice. Note that voiding an invoice will cancel
   * the PaymentIntent.
   */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

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
   * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn
   * more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
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
   * Total of all subscriptions, invoice items, and prorations on the invoice before any discount or
   * tax is applied.
   */
  @SerializedName("subtotal")
  Long subtotal;

  /** The amount of tax on this invoice. This is the sum of all the tax amounts on this invoice. */
  @SerializedName("tax")
  Long tax;

  /**
   * This percentage of the subtotal has been added to the total amount of the invoice, including
   * invoice line items and discounts. This field is inherited from the subscription's `tax_percent`
   * field, but can be changed before the invoice is paid. This field defaults to null.
   */
  @SerializedName("tax_percent")
  BigDecimal taxPercent;

  @SerializedName("threshold_reason")
  ThresholdReason thresholdReason;

  /** Total after discounts and taxes. */
  @SerializedName("total")
  Long total;

  /** The aggregate amounts calculated per tax rate for all line items. */
  @SerializedName("total_tax_amounts")
  List<Invoice.TaxAmount> totalTaxAmounts;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * The time at which webhooks for this invoice were successfully delivered (if the invoice had no
   * webhooks to deliver, this will match `created`). Invoice payment is delayed until webhooks are
   * delivered, or until all webhook delivery attempts have been exhausted.
   */
  @SerializedName("webhooks_delivered_at")
  Long webhooksDeliveredAt;

  /** Get id of expandable `charge` object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded `charge`. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `defaultPaymentMethod` object. */
  public String getDefaultPaymentMethod() {
    return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getId() : null;
  }

  public void setDefaultPaymentMethod(String id) {
    this.defaultPaymentMethod = ApiResource.setExpandableFieldId(id, this.defaultPaymentMethod);
  }

  /** Get expanded `defaultPaymentMethod`. */
  public PaymentMethod getDefaultPaymentMethodObject() {
    return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getExpanded() : null;
  }

  public void setDefaultPaymentMethodObject(PaymentMethod expandableObject) {
    this.defaultPaymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `defaultSource` object. */
  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String id) {
    this.defaultSource = ApiResource.setExpandableFieldId(id, this.defaultSource);
  }

  /** Get expanded `defaultSource`. */
  public PaymentSource getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(PaymentSource expandableObject) {
    this.defaultSource =
        new ExpandableField<PaymentSource>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `paymentIntent` object. */
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String id) {
    this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
  }

  /** Get expanded `paymentIntent`. */
  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent expandableObject) {
    this.paymentIntent =
        new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `subscription` object. */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /** Get expanded `subscription`. */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription =
        new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
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
   * will also show you any discount that is applicable to the customer.
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
   * will also show you any discount that is applicable to the customer.
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
   * will also show you any discount that is applicable to the customer.
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
   * will also show you any discount that is applicable to the customer.
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
   * will also show you any discount that is applicable to the customer.
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
   * all pending invoice items on that customer, including prorations.
   */
  public static Invoice create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations.
   */
  public static Invoice create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoices");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations.
   */
  public static Invoice create(InvoiceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations.
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
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  @Override
  public Invoice update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
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
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  public Invoice update(InvoiceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>collection_method</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
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
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
   */
  public Invoice delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
   */
  public Invoice delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
   */
  public Invoice delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
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
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice() throws StripeException {
    return voidInvoice((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(RequestOptions options) throws StripeException {
    return voidInvoice((Map<String, Object>) null, options);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(Map<String, Object> params) throws StripeException {
    return voidInvoice(params, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
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
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(InvoiceVoidInvoiceParams params) throws StripeException {
    return voidInvoice(params, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
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
     * The type of the tax ID, one of `au_abn`, `ch_vat`, `eu_vat`, `in_gst`, `mx_rfc`, `no_vat`,
     * `nz_gst`, `unknown`, or `za_vat`.
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

    /** Get id of expandable `taxRate` object. */
    public String getTaxRate() {
      return (this.taxRate != null) ? this.taxRate.getId() : null;
    }

    public void setTaxRate(String id) {
      this.taxRate = ApiResource.setExpandableFieldId(id, this.taxRate);
    }

    /** Get expanded `taxRate`. */
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
     * The account (if any) where funds from the payment will be transferred to upon payment
     * success.
     */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get id of expandable `destination` object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded `destination`. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }
}
