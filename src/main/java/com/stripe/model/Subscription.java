// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SubscriptionCancelParams;
import com.stripe.param.SubscriptionCreateParams;
import com.stripe.param.SubscriptionListParams;
import com.stripe.param.SubscriptionResumeParams;
import com.stripe.param.SubscriptionRetrieveParams;
import com.stripe.param.SubscriptionSearchParams;
import com.stripe.param.SubscriptionUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Subscriptions allow you to charge a customer on a recurring basis.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/billing/subscriptions/creating">Creating
 * subscriptions</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Subscription extends ApiResource implements HasId, MetadataStore<Subscription> {
  /** ID of the Connect Application that created the subscription. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice total that will be transferred to the application
   * owner's Stripe account.
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * The reference point that aligns future <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a> dates. It sets the
   * day of week for {@code week} intervals, the day of month for {@code month} and {@code year}
   * intervals, and the month of year for {@code year} intervals. The timestamp is in UTC format.
   */
  @SerializedName("billing_cycle_anchor")
  Long billingCycleAnchor;

  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period.
   */
  @SerializedName("billing_thresholds")
  BillingThresholds billingThresholds;

  /** A date in the future at which the subscription will automatically get canceled. */
  @SerializedName("cancel_at")
  Long cancelAt;

  /**
   * If the subscription has been canceled with the {@code at_period_end} flag set to {@code true},
   * {@code cancel_at_period_end} on the subscription will be true. You can use this attribute to
   * determine whether a subscription that has a status of active is scheduled to be canceled at the
   * end of the current period.
   */
  @SerializedName("cancel_at_period_end")
  Boolean cancelAtPeriodEnd;

  /**
   * If the subscription has been canceled, the date of that cancellation. If the subscription was
   * canceled with {@code cancel_at_period_end}, {@code canceled_at} will reflect the time of the
   * most recent update request, not the end of the subscription period when the subscription is
   * automatically moved to a canceled state.
   */
  @SerializedName("canceled_at")
  Long canceledAt;

  /** Details about why this subscription was cancelled. */
  @SerializedName("cancellation_details")
  CancellationDetails cancellationDetails;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay this subscription at the end of the cycle using the default source
   * attached to the customer. When sending an invoice, Stripe will email your customer an invoice
   * with payment instructions and mark the subscription as {@code active}.
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

  /**
   * End of the current period that the subscription has been invoiced for. At the end of this
   * period, a new invoice will be created.
   */
  @SerializedName("current_period_end")
  Long currentPeriodEnd;

  /** Start of the current period that the subscription has been invoiced for. */
  @SerializedName("current_period_start")
  Long currentPeriodStart;

  /** ID of the customer who owns the subscription. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * Number of days a customer has to pay invoices generated by this subscription. This value will
   * be {@code null} for subscriptions where {@code collection_method=charge_automatically}.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the subscription. It must belong to the customer
   * associated with the subscription. This takes precedence over {@code default_source}. If neither
   * are set, invoices will use the customer's <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
   * or <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-default_source">default_source</a>.
   */
  @SerializedName("default_payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> defaultPaymentMethod;

  /**
   * ID of the default payment source for the subscription. It must belong to the customer
   * associated with the subscription and be in a chargeable state. If {@code
   * default_payment_method} is also set, {@code default_payment_method} will take precedence. If
   * neither are set, invoices will use the customer's <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
   * or <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-default_source">default_source</a>.
   */
  @SerializedName("default_source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentSource> defaultSource;

  /**
   * The tax rates that will apply to any subscription item that does not have {@code tax_rates}
   * set. Invoices created will have their {@code default_tax_rates} populated from the
   * subscription.
   */
  @SerializedName("default_tax_rates")
  List<TaxRate> defaultTaxRates;

  /**
   * The subscription's description, meant to be displayable to the customer. Use this field to
   * optionally store an explanation of the subscription for rendering in Stripe surfaces and
   * certain local payment methods UIs.
   */
  @SerializedName("description")
  String description;

  /**
   * Describes the current discount applied to this subscription, if there is one. When billing, a
   * discount applied to a subscription overrides a discount applied on a customer-wide basis.
   */
  @SerializedName("discount")
  Discount discount;

  /**
   * The discounts applied to the subscription. Subscription item discounts are applied before
   * subscription discounts. Use {@code expand[]=discounts} to expand each discount.
   */
  @SerializedName("discounts")
  List<ExpandableField<Discount>> discounts;

  /** If the subscription has ended, the date the subscription ended. */
  @SerializedName("ended_at")
  Long endedAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** List of subscription items, each with an attached price. */
  @SerializedName("items")
  SubscriptionItemCollection items;

  /** The most recent invoice this subscription has generated. */
  @SerializedName("latest_invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> latestInvoice;

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
   * Specifies the approximate timestamp on which any pending invoice items will be billed according
   * to the schedule provided at {@code pending_invoice_item_interval}.
   */
  @SerializedName("next_pending_invoice_item_invoice")
  Long nextPendingInvoiceItemInvoice;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code subscription}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account (if any) the charge was made on behalf of for charges associated with this
   * subscription. See the Connect documentation for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** If specified, payment collection for this subscription will be paused. */
  @SerializedName("pause_collection")
  PauseCollection pauseCollection;

  /** Payment settings passed on to invoices created by the subscription. */
  @SerializedName("payment_settings")
  PaymentSettings paymentSettings;

  /**
   * Specifies an interval for how often to bill for any pending invoice items. It is analogous to
   * calling <a href="https://stripe.com/docs/api#create_invoice">Create an invoice</a> for the
   * given subscription at the specified interval.
   */
  @SerializedName("pending_invoice_item_interval")
  PendingInvoiceItemInterval pendingInvoiceItemInterval;

  /**
   * You can use this <a href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> to collect
   * user authentication when creating a subscription without immediate payment or updating a
   * subscription's payment method, allowing you to optimize for off-session payments. Learn more in
   * the <a
   * href="https://stripe.com/docs/billing/migration/strong-customer-authentication#scenario-2">SCA
   * Migration Guide</a>.
   */
  @SerializedName("pending_setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> pendingSetupIntent;

  /**
   * If specified, <a href="https://stripe.com/docs/billing/subscriptions/pending-updates">pending
   * updates</a> that will be applied to the subscription once the {@code latest_invoice} has been
   * paid.
   */
  @SerializedName("pending_update")
  PendingUpdate pendingUpdate;

  /** Time period and invoice for a Subscription billed in advance. */
  @SerializedName("prebilling")
  Prebilling prebilling;

  /** The schedule attached to the subscription. */
  @SerializedName("schedule")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SubscriptionSchedule> schedule;

  /**
   * Date when the subscription was first created. The date might differ from the {@code created}
   * date due to backdating.
   */
  @SerializedName("start_date")
  Long startDate;

  /**
   * Possible values are {@code incomplete}, {@code incomplete_expired}, {@code trialing}, {@code
   * active}, {@code past_due}, {@code canceled}, or {@code unpaid}.
   *
   * <p>For {@code collection_method=charge_automatically} a subscription moves into {@code
   * incomplete} if the initial payment attempt fails. A subscription in this state can only have
   * metadata and default_source updated. Once the first invoice is paid, the subscription moves
   * into an {@code active} state. If the first invoice is not paid within 23 hours, the
   * subscription transitions to {@code incomplete_expired}. This is a terminal state, the open
   * invoice will be voided and no further invoices will be generated.
   *
   * <p>A subscription that is currently in a trial period is {@code trialing} and moves to {@code
   * active} when the trial period is over.
   *
   * <p>If subscription {@code collection_method=charge_automatically}, it becomes {@code past_due}
   * when payment is required but cannot be paid (due to failed payment or awaiting additional user
   * actions). Once Stripe has exhausted all payment retry attempts, the subscription will become
   * {@code canceled} or {@code unpaid} (depending on your subscriptions settings).
   *
   * <p>If subscription {@code collection_method=send_invoice} it becomes {@code past_due} when its
   * invoice is not paid by the due date, and {@code canceled} or {@code unpaid} if it is still not
   * paid by an additional deadline after that. Note that when a subscription has a status of {@code
   * unpaid}, no subsequent invoices will be attempted (invoices will be created, but then
   * immediately automatically closed). After receiving updated payment information from a customer,
   * you may choose to reopen and pay their closed invoices.
   *
   * <p>One of {@code active}, {@code canceled}, {@code incomplete}, {@code incomplete_expired},
   * {@code past_due}, {@code paused}, {@code trialing}, or {@code unpaid}.
   */
  @SerializedName("status")
  String status;

  /** ID of the test clock this subscription belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  /**
   * The account (if any) the subscription's payments will be attributed to for tax reporting, and
   * where funds from each payment will be transferred to for each of the subscription's invoices.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** If the subscription has a trial, the end of that trial. */
  @SerializedName("trial_end")
  Long trialEnd;

  /** Settings related to subscription trials. */
  @SerializedName("trial_settings")
  TrialSettings trialSettings;

  /** If the subscription has a trial, the beginning of that trial. */
  @SerializedName("trial_start")
  Long trialStart;

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

  /** Get ID of expandable {@code latestInvoice} object. */
  public String getLatestInvoice() {
    return (this.latestInvoice != null) ? this.latestInvoice.getId() : null;
  }

  public void setLatestInvoice(String id) {
    this.latestInvoice = ApiResource.setExpandableFieldId(id, this.latestInvoice);
  }

  /** Get expanded {@code latestInvoice}. */
  public Invoice getLatestInvoiceObject() {
    return (this.latestInvoice != null) ? this.latestInvoice.getExpanded() : null;
  }

  public void setLatestInvoiceObject(Invoice expandableObject) {
    this.latestInvoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code pendingSetupIntent} object. */
  public String getPendingSetupIntent() {
    return (this.pendingSetupIntent != null) ? this.pendingSetupIntent.getId() : null;
  }

  public void setPendingSetupIntent(String id) {
    this.pendingSetupIntent = ApiResource.setExpandableFieldId(id, this.pendingSetupIntent);
  }

  /** Get expanded {@code pendingSetupIntent}. */
  public SetupIntent getPendingSetupIntentObject() {
    return (this.pendingSetupIntent != null) ? this.pendingSetupIntent.getExpanded() : null;
  }

  public void setPendingSetupIntentObject(SetupIntent expandableObject) {
    this.pendingSetupIntent =
        new ExpandableField<SetupIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code schedule} object. */
  public String getSchedule() {
    return (this.schedule != null) ? this.schedule.getId() : null;
  }

  public void setSchedule(String id) {
    this.schedule = ApiResource.setExpandableFieldId(id, this.schedule);
  }

  /** Get expanded {@code schedule}. */
  public SubscriptionSchedule getScheduleObject() {
    return (this.schedule != null) ? this.schedule.getExpanded() : null;
  }

  public void setScheduleObject(SubscriptionSchedule expandableObject) {
    this.schedule =
        new ExpandableField<SubscriptionSchedule>(expandableObject.getId(), expandableObject);
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

  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            params,
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(SubscriptionCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a customer’s subscription immediately. The customer will not be charged again for the
   * subscription.
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for
   * at the end of the period, unless manually <a
   * href="https://stripe.com/docs/api#delete_invoiceitem">deleted</a>. If you’ve set the
   * subscription to cancel at the end of the period, any pending prorations will also be left in
   * place and collected at the end of the period. But if the subscription is set to cancel
   * immediately, pending prorations will be removed.
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all
   * finalized invoices for the customer. This is intended to prevent unexpected payment attempts
   * after the customer has canceled a subscription. However, you can resume automatic collection of
   * the invoices manually after subscription cancellation to have us proceed. Or, you could check
   * for unpaid invoices before allowing the customer to cancel the subscription at all.
   */
  public Subscription cancel(SubscriptionCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public static Subscription create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public static Subscription create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public static Subscription create(SubscriptionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   *
   * <p>When you create a subscription with {@code collection_method=charge_automatically}, the
   * first invoice is finalized as part of the request. The {@code payment_behavior} parameter
   * determines the exact behavior of the initial payment.
   *
   * <p>To start subscriptions where the first invoice always begins in a {@code draft} status, use
   * <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules#managing">subscription
   * schedules</a> instead. Schedules provide the flexibility to model more complex billing
   * configurations that change over time.
   */
  public static Subscription create(SubscriptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /** Removes the currently applied discount on a subscription. */
  public Discount deleteDiscount() throws StripeException {
    return deleteDiscount((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Removes the currently applied discount on a subscription. */
  public Discount deleteDiscount(Map<String, Object> params) throws StripeException {
    return deleteDiscount(params, (RequestOptions) null);
  }

  /** Removes the currently applied discount on a subscription. */
  public Discount deleteDiscount(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s/discount", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            params,
            Discount.class,
            options,
            ApiMode.V1);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public static SubscriptionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public static SubscriptionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            SubscriptionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public static SubscriptionCollection list(SubscriptionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify {@code status=canceled}.
   */
  public static SubscriptionCollection list(SubscriptionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume() throws StripeException {
    return resume((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(RequestOptions options) throws StripeException {
    return resume((Map<String, Object>) null, options);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(Map<String, Object> params) throws StripeException {
    return resume(params, (RequestOptions) null);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s/resume", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(SubscriptionResumeParams params) throws StripeException {
    return resume(params, (RequestOptions) null);
  }

  /**
   * Initiates resumption of a paused subscription, optionally resetting the billing cycle anchor
   * and creating prorations. If a resumption invoice is generated, it must be paid or marked
   * uncollectible before the subscription will be unpaused. If payment succeeds the subscription
   * will become {@code active}, and if payment fails the subscription will be {@code past_due}. The
   * resumption invoice will void automatically if not paid by the expiration date.
   */
  public Subscription resume(SubscriptionResumeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s/resume", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the subscription with the given ID. */
  public static Subscription retrieve(String subscriptionExposedId) throws StripeException {
    return retrieve(subscriptionExposedId, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the subscription with the given ID. */
  public static Subscription retrieve(String subscriptionExposedId, RequestOptions options)
      throws StripeException {
    return retrieve(subscriptionExposedId, (Map<String, Object>) null, options);
  }

  /** Retrieves the subscription with the given ID. */
  public static Subscription retrieve(
      String subscriptionExposedId, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the subscription with the given ID. */
  public static Subscription retrieve(
      String subscriptionExposedId, SubscriptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static SubscriptionSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static SubscriptionSearchResult search(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscriptions/search";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            SubscriptionSearchResult.class,
            options,
            ApiMode.V1);
  }

  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static SubscriptionSearchResult search(SubscriptionSearchParams params)
      throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for subscriptions you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static SubscriptionSearchResult search(
      SubscriptionSearchParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscriptions/search";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSearchResult.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/upcoming">upcoming invoice</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid, or paid to free.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  @Override
  public Subscription update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/upcoming">upcoming invoice</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid, or paid to free.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  @Override
  public Subscription update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Subscription.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/upcoming">upcoming invoice</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid, or paid to free.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(SubscriptionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing subscription to match the specified parameters. When changing prices or
   * quantities, we optionally prorate the price we charge next month to make up for any price
   * changes. To preview how the proration is calculated, use the <a
   * href="https://stripe.com/docs/api/invoices/upcoming">upcoming invoice</a> endpoint.
   *
   * <p>By default, we prorate subscription changes. For example, if a customer signs up on May 1
   * for a 100 price, they’ll be billed 100 immediately. If on May 15 they switch to a 200 price,
   * then on June 1 they’ll be billed 250 (200 for a renewal of her subscription, plus a 50
   * prorating adjustment for half of the previous month’s 100 difference). Similarly, a downgrade
   * generates a credit that is applied to the next invoice. We also prorate when you make quantity
   * changes.
   *
   * <p>Switching prices does not normally change the billing date or generate an immediate charge
   * unless:
   *
   * <p>
   *
   * <ul>
   *   <li>The billing interval is changed (for example, from monthly to yearly).
   *   <li>The subscription moves from free to paid, or paid to free.
   *   <li>A trial starts or ends.
   * </ul>
   *
   * <p>In these cases, we apply a credit for the unused time on the previous price, immediately
   * charge the customer using the new price, and reset the billing date.
   *
   * <p>If you want to charge for an upgrade immediately, pass {@code proration_behavior} as {@code
   * always_invoice} to create prorations, automatically invoice the customer for those proration
   * adjustments, and attempt to collect payment. If you pass {@code create_prorations}, the
   * prorations are created but not automatically invoiced. If you want to bill the customer for the
   * prorations before the subscription’s renewal date, you need to manually <a
   * href="https://stripe.com/docs/api/invoices/create">invoice the customer</a>.
   *
   * <p>If you don’t want to prorate, set the {@code proration_behavior} option to {@code none}.
   * With this option, the customer is billed 100 on May 1 and 200 on June 1. Similarly, if you set
   * {@code proration_behavior} to {@code none} when switching between different billing intervals
   * (for example, from monthly to yearly), we don’t generate any credits for the old subscription’s
   * unused time. We still reset the billing date and bill immediately for the new subscription.
   *
   * <p>Updating the quantity on a subscription many times in an hour may result in <a
   * href="https://stripe.com/docs/rate-limits">rate limiting</a>. If you need to bill for a
   * frequently changing quantity, consider integrating <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based">usage-based billing</a>
   * instead.
   */
  public Subscription update(SubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Subscription.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Whether Stripe automatically computes tax on this subscription. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingThresholds extends StripeObject {
    /** Monetary threshold that triggers the subscription to create an invoice. */
    @SerializedName("amount_gte")
    Long amountGte;

    /**
     * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached. If
     * true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was last
     * reached; otherwise, the value will remain unchanged. This value may not be {@code true} if
     * the subscription contains items with plans that have {@code aggregate_usage=last_ever}.
     */
    @SerializedName("reset_billing_cycle_anchor")
    Boolean resetBillingCycleAnchor;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CancellationDetails extends StripeObject {
    /**
     * Additional comments about why the user canceled the subscription, if the subscription was
     * canceled explicitly by the user.
     */
    @SerializedName("comment")
    String comment;

    /**
     * The customer submitted reason for why they canceled, if the subscription was canceled
     * explicitly by the user.
     *
     * <p>One of {@code customer_service}, {@code low_quality}, {@code missing_features}, {@code
     * other}, {@code switched_service}, {@code too_complex}, {@code too_expensive}, or {@code
     * unused}.
     */
    @SerializedName("feedback")
    String feedback;

    /**
     * Why this subscription was canceled.
     *
     * <p>One of {@code cancellation_requested}, {@code payment_disputed}, or {@code
     * payment_failed}.
     */
    @SerializedName("reason")
    String reason;
  }

  /**
   * The Pause Collection settings determine how we will pause collection for this subscription and
   * for how long the subscription should be paused.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentSettings extends StripeObject {
    /** Payment-method-specific configuration to provide to invoices created by the subscription. */
    @SerializedName("payment_method_options")
    PaymentMethodOptions paymentMethodOptions;

    /**
     * The list of payment method types to provide to every invoice created by the subscription. If
     * not set, Stripe attempts to automatically determine the types to use by looking at the
     * invoice’s default payment method, the subscription’s default payment method, the customer’s
     * default payment method, and your <a
     * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
     */
    @SerializedName("payment_method_types")
    List<String> paymentMethodTypes;

    /**
     * Either {@code off}, or {@code on_subscription}. With {@code on_subscription} Stripe updates
     * {@code subscription.default_payment_method} when a subscription payment succeeds.
     *
     * <p>One of {@code off}, or {@code on_subscription}.
     */
    @SerializedName("save_default_payment_method")
    String saveDefaultPaymentMethod;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodOptions extends StripeObject {
      /**
       * This sub-hash contains details about the Canadian pre-authorized debit payment method
       * options to pass to invoices created by the subscription.
       */
      @SerializedName("acss_debit")
      AcssDebit acssDebit;

      /**
       * This sub-hash contains details about the Bancontact payment method options to pass to
       * invoices created by the subscription.
       */
      @SerializedName("bancontact")
      Bancontact bancontact;

      /**
       * This sub-hash contains details about the Card payment method options to pass to invoices
       * created by the subscription.
       */
      @SerializedName("card")
      Card card;

      /**
       * This sub-hash contains details about the Bank transfer payment method options to pass to
       * invoices created by the subscription.
       */
      @SerializedName("customer_balance")
      CustomerBalance customerBalance;

      /**
       * This sub-hash contains details about the Konbini payment method options to pass to invoices
       * created by the subscription.
       */
      @SerializedName("konbini")
      Konbini konbini;

      /**
       * This sub-hash contains details about the ACH direct debit payment method options to pass to
       * invoices created by the subscription.
       */
      @SerializedName("us_bank_account")
      UsBankAccount usBankAccount;

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
         * Preferred language of the Bancontact authorization page that the customer is redirected
         * to.
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
        @SerializedName("mandate_options")
        MandateOptions mandateOptions;

        /**
         * Selected network to process this Subscription on. Depends on the available networks of
         * the card attached to the Subscription. Can be only set confirm-time.
         */
        @SerializedName("network")
        String network;

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Read our guide on <a
         * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
         * Secure</a> for more information on how this configuration interacts with Radar and our
         * SCA Engine.
         *
         * <p>One of {@code any}, or {@code automatic}.
         */
        @SerializedName("request_three_d_secure")
        String requestThreeDSecure;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MandateOptions extends StripeObject {
          /** Amount to be charged for future payments. */
          @SerializedName("amount")
          Long amount;

          /**
           * One of {@code fixed} or {@code maximum}. If {@code fixed}, the {@code amount} param
           * refers to the exact amount to be charged in future payments. If {@code maximum}, the
           * amount charged can be up to the value passed for the {@code amount} param.
           */
          @SerializedName("amount_type")
          String amountType;

          /**
           * A description of the mandate or subscription that is meant to be displayed to the
           * customer.
           */
          @SerializedName("description")
          String description;
        }
      }

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Konbini extends StripeObject {}

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

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class FinancialConnections extends StripeObject {
          /**
           * The list of permissions to request. The {@code payment_method} permission must be
           * included.
           */
          @SerializedName("permissions")
          List<String> permissions;

          /** Data features requested to be retrieved upon account creation. */
          @SerializedName("prefetch")
          List<String> prefetch;
        }
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PendingInvoiceItemInterval extends StripeObject {
    /**
     * Specifies invoicing frequency. Either {@code day}, {@code week}, {@code month} or {@code
     * year}.
     *
     * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
     */
    @SerializedName("interval")
    String interval;

    /**
     * The number of intervals between invoices. For example, {@code interval=month} and {@code
     * interval_count=3} bills every 3 months. Maximum of one year interval allowed (1 year, 12
     * months, or 52 weeks).
     */
    @SerializedName("interval_count")
    Long intervalCount;
  }

  /**
   * Pending Updates store the changes pending from a previous update that will be applied to the
   * Subscription upon successful payment.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PendingUpdate extends StripeObject {
    /**
     * If the update is applied, determines the date of the first full invoice, and, for plans with
     * {@code month} or {@code year} intervals, the day of the month for subsequent invoices. The
     * timestamp is in UTC format.
     */
    @SerializedName("billing_cycle_anchor")
    Long billingCycleAnchor;

    /**
     * The point after which the changes reflected by this update will be discarded and no longer
     * applied.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /** The number of iterations of prebilling to apply. */
    @SerializedName("prebilling_iterations")
    Long prebillingIterations;

    /**
     * List of subscription items, each with an attached plan, that will be set if the update is
     * applied.
     */
    @SerializedName("subscription_items")
    List<SubscriptionItem> subscriptionItems;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time, if the update is applied.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    /**
     * Indicates if a plan's {@code trial_period_days} should be applied to the subscription.
     * Setting {@code trial_end} per subscription is preferred, and this defaults to {@code false}.
     * Setting this flag to {@code true} together with {@code trial_end} is not allowed. See <a
     * href="https://stripe.com/docs/billing/subscriptions/trials">Using trial periods on
     * subscriptions</a> to learn more.
     */
    @SerializedName("trial_from_plan")
    Boolean trialFromPlan;
  }

  /** Prebilling stores the time period and invoice for a Subscription billed in advance. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Prebilling extends StripeObject {
    /** ID of the prebilling invoice. */
    @SerializedName("invoice")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Invoice> invoice;

    /** The end of the last period for which the invoice pre-bills. */
    @SerializedName("period_end")
    Long periodEnd;

    /** The start of the first period for which the invoice pre-bills. */
    @SerializedName("period_start")
    Long periodStart;

    /**
     * Whether to cancel or preserve {@code prebilling} if the subscription is updated during the
     * prebilled period.
     *
     * <p>One of {@code prebill}, or {@code reset}.
     */
    @SerializedName("update_behavior")
    String updateBehavior;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the destination
     * account. By default, the entire amount is transferred to the destination.
     */
    @SerializedName("amount_percent")
    BigDecimal amountPercent;

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

  /** Configures how this subscription behaves during the trial period. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TrialSettings extends StripeObject {
    /** Defines how a subscription behaves when a free trial ends. */
    @SerializedName("end_behavior")
    EndBehavior endBehavior;

    /** Defines how a subscription behaves when a free trial ends. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EndBehavior extends StripeObject {
      /**
       * Indicates how the subscription should change when the trial ends if the user did not
       * provide a payment method.
       *
       * <p>One of {@code cancel}, {@code create_invoice}, or {@code pause}.
       */
      @SerializedName("missing_payment_method")
      String missingPaymentMethod;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(billingThresholds, responseGetter);
    trySetResponseGetter(cancellationDetails, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(defaultPaymentMethod, responseGetter);
    trySetResponseGetter(defaultSource, responseGetter);
    trySetResponseGetter(discount, responseGetter);
    trySetResponseGetter(items, responseGetter);
    trySetResponseGetter(latestInvoice, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(pauseCollection, responseGetter);
    trySetResponseGetter(paymentSettings, responseGetter);
    trySetResponseGetter(pendingInvoiceItemInterval, responseGetter);
    trySetResponseGetter(pendingSetupIntent, responseGetter);
    trySetResponseGetter(pendingUpdate, responseGetter);
    trySetResponseGetter(prebilling, responseGetter);
    trySetResponseGetter(schedule, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
    trySetResponseGetter(transferData, responseGetter);
    trySetResponseGetter(trialSettings, responseGetter);
  }
}
