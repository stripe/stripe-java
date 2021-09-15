// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SubscriptionCancelParams;
import com.stripe.param.SubscriptionCreateParams;
import com.stripe.param.SubscriptionListParams;
import com.stripe.param.SubscriptionRetrieveParams;
import com.stripe.param.SubscriptionUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Subscription extends ApiResource implements HasId, MetadataStore<Subscription> {
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice subtotal that will be transferred to the application
   * owner's Stripe account.
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Determines the date of the first full invoice, and, for plans with {@code month} or {@code
   * year} intervals, the day of the month for subsequent invoices.
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

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay this subscription at the end of the cycle using the default source
   * attached to the customer. When sending an invoice, Stripe will email your customer an invoice
   * with payment instructions.
   *
   * <p>One of {@code charge_automatically}, or {@code send_invoice}.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

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
   * Describes the current discount applied to this subscription, if there is one. When billing, a
   * discount applied to a subscription overrides a discount applied on a customer-wide basis.
   */
  @SerializedName("discount")
  Discount discount;

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
   * <p>If subscription {@code collection_method=charge_automatically} it becomes {@code past_due}
   * when payment to renew it fails and {@code canceled} or {@code unpaid} (depending on your
   * subscriptions settings) when Stripe has exhausted all payment retry attempts.
   *
   * <p>If subscription {@code collection_method=send_invoice} it becomes {@code past_due} when its
   * invoice is not paid by the due date, and {@code canceled} or {@code unpaid} if it is still not
   * paid by an additional deadline after that. Note that when a subscription has a status of {@code
   * unpaid}, no subsequent invoices will be attempted (invoices will be created, but then
   * immediately automatically closed). After receiving updated payment information from a customer,
   * you may choose to reopen and pay their closed invoices.
   *
   * <p>One of {@code active}, {@code canceled}, {@code incomplete}, {@code incomplete_expired},
   * {@code past_due}, {@code trialing}, or {@code unpaid}.
   */
  @SerializedName("status")
  String status;

  /**
   * The account (if any) the subscription's payments will be attributed to for tax reporting, and
   * where funds from each payment will be transferred to for each of the subscription's invoices.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** If the subscription has a trial, the end of that trial. */
  @SerializedName("trial_end")
  Long trialEnd;

  /** If the subscription has a trial, the beginning of that trial. */
  @SerializedName("trial_start")
  Long trialStart;

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

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify <code>status=canceled</code>.
   */
  public static SubscriptionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify <code>status=canceled</code>.
   */
  public static SubscriptionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscriptions");
    return ApiResource.requestCollection(url, params, SubscriptionCollection.class, options);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify <code>status=canceled</code>.
   */
  public static SubscriptionCollection list(SubscriptionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * By default, returns a list of subscriptions that have not been canceled. In order to list
   * canceled subscriptions, specify <code>status=canceled</code>.
   */
  public static SubscriptionCollection list(SubscriptionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscriptions");
    return ApiResource.requestCollection(url, params, SubscriptionCollection.class, options);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static Subscription create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static Subscription create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscriptions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Subscription.class, options);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static Subscription create(SubscriptionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription on an existing customer. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static Subscription create(SubscriptionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscriptions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Subscription.class, options);
  }

  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  @Override
  public Subscription update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  @Override
  public Subscription update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Subscription.class, options);
  }

  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(SubscriptionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing subscription on a customer to match the specified parameters. When changing
   * plans or quantities, we will optionally prorate the price we charge next month to make up for
   * any price changes. To preview how the proration will be calculated, use the <a
   * href="https://stripe.com/docs/api#upcoming_invoice">upcoming invoice</a> endpoint.
   */
  public Subscription update(SubscriptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Subscription.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Subscription.class, options);
  }

  /** Retrieves the subscription with the given ID. */
  public static Subscription retrieve(
      String subscriptionExposedId, SubscriptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(subscriptionExposedId)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Subscription.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Subscription.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Subscription.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscriptions/%s/discount", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Discount.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Whether Stripe automatically computes tax on this subscription. */
    @SerializedName("enabled")
    Boolean enabled;
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
  public static class PaymentMethodOptions extends StripeObject {
    /**
     * This sub-hash contains details about the Canadian pre-authorized debit payment method options
     * to pass to invoices created by the subscription.
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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PendingUpdate extends StripeObject {
    /**
     * If the update is applied, determines the date of the first full invoice, and, for plans with
     * {@code month} or {@code year} intervals, the day of the month for subsequent invoices.
     */
    @SerializedName("billing_cycle_anchor")
    Long billingCycleAnchor;

    /**
     * The point after which the changes reflected by this update will be discarded and no longer
     * applied.
     */
    @SerializedName("expires_at")
    Long expiresAt;

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
     * Setting this flag to {@code true} together with {@code trial_end} is not allowed.
     */
    @SerializedName("trial_from_plan")
    Boolean trialFromPlan;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * destination account. By default, the entire amount is transferred to the destination.
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
}
