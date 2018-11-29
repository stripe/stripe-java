package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Invoice extends ApiResource implements HasId, MetadataStore<Invoice> {
  /**
   * Final amount due at this time for this invoice. If the invoice's total is smaller than the
   * minimum charge amount, for example, or if there is account credit that can be applied to the
   * invoice, the `amount_due` may be 0. If there is a positive `starting_balance` for the invoice
   * (the customer owes money), the `amount_due` will also take that into account. The charge that
   * gets generated for the invoice will be for the amount specified in `amount_due`.
   */
  Long amountDue;

  /** The amount, in %s, that was paid. */
  Long amountPaid;

  /** The amount remaining, in %s, that is due. */
  Long amountRemaining;

  /**
   * The fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account when the invoice is paid.
   */
  Long applicationFee;

  /**
   * Number of payment attempts made for this invoice, from the perspective of the payment retry
   * schedule. Any payment attempt counts as the first attempt, and subsequently only automatic
   * retries increment the attempt count. In other words, manual payment attempts after the first
   * attempt do not affect the retry schedule.
   */
  Long attemptCount;

  /**
   * Whether an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour
   * after the `invoice.created` webhook, for example, so you might not want to display that invoice
   * as unpaid to your users.
   */
  Boolean attempted;

  /**
   * Controls whether Stripe will perform [automatic
   * collection](/docs/billing/invoices/workflow/#auto_advance) of the invoice. When `false`, the
   * invoice's state will not automatically advance without an explicit action.
   */
  Boolean autoAdvance;

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay this invoice using the default source attached to the customer. When sending an
   * invoice, Stripe will email this invoice to the customer with payment instructions.
   */
  String billing;

  /**
   * Indicates the reason why the invoice was created. `subscription_cycle` indicates an invoice
   * created by a subscription advancing into a new period. `subscription_update` indicates an
   * invoice created due to creating or updating a subscription. `subscription` is set for all old
   * invoices to indicate either a change to a subscription or a period advancement. `manual` is set
   * for all invoices unrelated to a subscription (for example: created via the invoice editor). The
   * `upcoming` value is reserved for simulated invoices per the upcoming invoice endpoint.
   */
  String billingReason;

  /** ID of the latest charge generated for this invoice, if any. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long date;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<CustomerSource> defaultSource;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  Discount discount;

  /**
   * The date on which payment for this invoice is due. This value will be `null` for invoices where
   * `billing=charge_automatically`.
   */
  Long dueDate;

  /**
   * Ending customer balance after the invoice is finalized. Invoices are finalized approximately an
   * hour after successful webhook delivery or when payment collection is attempted for the invoice.
   * If the invoice has not been finalized yet, this will be null.
   */
  Long endingBalance;

  /** The time that the invoice draft was finalized. */
  Long finalizedAt;

  /**
   * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the
   * invoice has not been finalized yet, this will be null.
   */
  String hostedInvoiceUrl;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * The link to download the PDF for the invoice. If the invoice has not been finalized yet, this
   * will be null.
   */
  String invoicePdf;

  /**
   * The individual line items that make up the invoice. `lines` is sorted as follows: invoice items
   * in reverse chronological order, followed by the subscription, if any.
   */
  LineItemCollection lines;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /**
   * The time at which payment will next be attempted. This value will be `null` for invoices where
   * `billing=send_invoice`.
   */
  Long nextPaymentAttempt;

  /**
   * A unique, identifying string that appears on emails sent to the customer for this invoice. This
   * starts with the customer's unique invoice_prefix if it is specified.
   */
  String number;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Whether payment was successfully collected for this invoice. An invoice can be paid (most
   * commonly) with a charge or with credit from the customer's account balance.
   */
  Boolean paid;

  /** End of the usage period during which invoice items were added to this invoice. */
  Long periodEnd;

  /** Start of the usage period during which invoice items were added to this invoice. */
  Long periodStart;

  /** This is the transaction number that appears on email receipts sent for this invoice. */
  String receiptNumber;

  /**
   * Starting customer balance before the invoice is finalized. If the invoice has not been
   * finalized yet, this will be the current customer balance.
   */
  Long startingBalance;

  /** Extra information about an invoice for the customer's credit card statement. */
  String statementDescriptor;

  /** The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. */
  String status;

  /** The subscription that this invoice was prepared for, if any. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /**
   * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
   */
  Long subscriptionProrationDate;

  /**
   * Total of all subscriptions, invoice items, and prorations on the invoice before any discount is
   * applied.
   */
  Long subtotal;

  /**
   * The amount of tax included in the total, calculated from `tax_percent` and the subtotal. If no
   * `tax_percent` is defined, this value will be null.
   */
  Long tax;

  /**
   * This percentage of the subtotal has been added to the total amount of the invoice, including
   * invoice line items and discounts. This field is inherited from the subscription's `tax_percent`
   * field, but can be changed before the invoice is paid. This field defaults to null.
   */
  BigDecimal taxPercent;

  /** Total after discount. */
  Long total;

  /**
   * The time at which webhooks for this invoice were successfully delivered (if the invoice had no
   * webhooks to deliver, this will match `date`). Invoice payment is delayed until webhooks are
   * delivered, or until all webhook delivery attempts have been exhausted.
   */
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

  /** Get id of expandable `defaultSource` object. */
  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String id) {
    this.defaultSource = ApiResource.setExpandableFieldId(id, this.defaultSource);
  }

  /** Get expanded `defaultSource`. */
  public CustomerSource getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(CustomerSource expandableObject) {
    this.defaultSource =
        new ExpandableField<CustomerSource>(expandableObject.getId(), expandableObject);
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
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
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
    return requestCollection(url, params, InvoiceCollection.class, options);
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
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s", invoice));
    return request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
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
    return request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
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
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, Invoice.class, options);
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
            "%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s/finalize", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
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
            Stripe.getApiBase(), String.format("/v1/invoices/%s/mark_uncollectible", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to attempt payment on an invoice out of the normal collection schedule or for some
   * other reason, you can do so.
   */
  public Invoice pay() throws StripeException {
    return pay((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to attempt payment on an invoice out of the normal collection schedule or for some
   * other reason, you can do so.
   */
  public Invoice pay(Map<String, Object> params) throws StripeException {
    return pay(params, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to attempt payment on an invoice out of the normal collection schedule or for some
   * other reason, you can do so.
   */
  public Invoice pay(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s/pay", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to manually send an invoice to your customer out of the normal schedule, you can do
   * so. When sending invoices that have already been paid, there will be no reference to the
   * payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice() throws StripeException {
    return sendInvoice((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to manually send an invoice to your customer out of the normal schedule, you can do
   * so. When sending invoices that have already been paid, there will be no reference to the
   * payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(Map<String, Object> params) throws StripeException {
    return sendInvoice(params, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/recurring">subscriptions settings</a>. However, if
   * you’d like to manually send an invoice to your customer out of the normal schedule, you can do
   * so. When sending invoices that have already been paid, there will be no reference to the
   * payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s/send", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>billing</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  public Invoice update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>billing</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  public Invoice update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
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
            "%s%s", Stripe.getApiBase(), String.format("/v1/invoices/%s/void", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }
}
