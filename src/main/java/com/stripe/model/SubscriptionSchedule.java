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
import com.stripe.param.SubscriptionScheduleCancelParams;
import com.stripe.param.SubscriptionScheduleCreateParams;
import com.stripe.param.SubscriptionScheduleListParams;
import com.stripe.param.SubscriptionScheduleReleaseParams;
import com.stripe.param.SubscriptionScheduleRetrieveParams;
import com.stripe.param.SubscriptionScheduleUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A subscription schedule allows you to create and manage the lifecycle of a subscription by
 * predefining expected changes.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules">Subscription
 * schedules</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionSchedule extends ApiResource
    implements HasId, MetadataStore<SubscriptionSchedule> {
  /** ID of the Connect Application that created the schedule. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * Time at which the subscription schedule was canceled. Measured in seconds since the Unix epoch.
   */
  @SerializedName("canceled_at")
  Long canceledAt;

  /**
   * Time at which the subscription schedule was completed. Measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("completed_at")
  Long completedAt;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Object representing the start and end dates for the current phase of the subscription schedule,
   * if it is {@code active}.
   */
  @SerializedName("current_phase")
  CurrentPhase currentPhase;

  /** ID of the customer who owns the subscription schedule. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  @SerializedName("default_settings")
  DefaultSettings defaultSettings;

  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values
   * are {@code release} or {@code cancel} with the default being {@code release}. {@code release}
   * will end the subscription schedule and keep the underlying subscription running.{@code cancel}
   * will end the subscription schedule and cancel the underlying subscription.
   *
   * <p>One of {@code cancel}, {@code none}, {@code release}, or {@code renew}.
   */
  @SerializedName("end_behavior")
  String endBehavior;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code subscription_schedule}.
   */
  @SerializedName("object")
  String object;

  /** Configuration for the subscription schedule's phases. */
  @SerializedName("phases")
  List<SubscriptionSchedule.Phase> phases;

  /**
   * Time at which the subscription schedule was released. Measured in seconds since the Unix epoch.
   */
  @SerializedName("released_at")
  Long releasedAt;

  /** ID of the subscription once managed by the subscription schedule (if it is released). */
  @SerializedName("released_subscription")
  String releasedSubscription;

  /**
   * The present status of the subscription schedule. Possible values are {@code not_started},
   * {@code active}, {@code completed}, {@code released}, and {@code canceled}. You can read more
   * about the different states in our <a
   * href="https://stripe.com/docs/billing/subscriptions/subscription-schedules">behavior guide</a>.
   *
   * <p>One of {@code active}, {@code canceled}, {@code completed}, {@code not_started}, or {@code
   * released}.
   */
  @SerializedName("status")
  String status;

  /** ID of the subscription managed by the subscription schedule. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /** ID of the test clock this subscription schedule belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

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

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_schedules/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(SubscriptionScheduleCancelParams params)
      throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is {@code not_started} or {@code active}.
   */
  public SubscriptionSchedule cancel(
      SubscriptionScheduleCancelParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/subscription_schedules/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static SubscriptionSchedule create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static SubscriptionSchedule create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/subscription_schedules";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static SubscriptionSchedule create(SubscriptionScheduleCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new subscription schedule object. Each customer can have up to 500 active or
   * scheduled subscriptions.
   */
  public static SubscriptionSchedule create(
      SubscriptionScheduleCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_schedules";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_schedules";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            SubscriptionScheduleCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(SubscriptionScheduleListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(
      SubscriptionScheduleListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/subscription_schedules";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionScheduleCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release() throws StripeException {
    return release((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(RequestOptions options) throws StripeException {
    return release((Map<String, Object>) null, options);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(Map<String, Object> params) throws StripeException {
    return release(params, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/subscription_schedules/%s/release", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(SubscriptionScheduleReleaseParams params)
      throws StripeException {
    return release(params, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * {@code not_started} or {@code active}. If the subscription schedule is currently associated
   * with a subscription, releasing it will remove its {@code subscription} property and set the
   * subscription’s ID to the {@code released_subscription} property.
   */
  public SubscriptionSchedule release(
      SubscriptionScheduleReleaseParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/subscription_schedules/%s/release", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public static SubscriptionSchedule retrieve(String schedule) throws StripeException {
    return retrieve(schedule, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public static SubscriptionSchedule retrieve(String schedule, RequestOptions options)
      throws StripeException {
    return retrieve(schedule, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public static SubscriptionSchedule retrieve(
      String schedule, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(schedule));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public static SubscriptionSchedule retrieve(
      String schedule, SubscriptionScheduleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(schedule));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /** Updates an existing subscription schedule. */
  @Override
  public SubscriptionSchedule update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing subscription schedule. */
  @Override
  public SubscriptionSchedule update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(SubscriptionScheduleUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(
      SubscriptionScheduleUpdateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            SubscriptionSchedule.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrentPhase extends StripeObject {
    /** The end of this phase of the subscription schedule. */
    @SerializedName("end_date")
    Long endDate;

    /** The start of this phase of the subscription schedule. */
    @SerializedName("start_date")
    Long startDate;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultSettings extends StripeObject {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account during this phase of the schedule.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    @SerializedName("automatic_tax")
    AutomaticTax automaticTax;

    /**
     * Possible values are {@code phase_start} or {@code automatic}. If {@code phase_start} then
     * billing cycle anchor of the subscription is set to the start of the phase when entering the
     * phase. If {@code automatic} then the billing cycle anchor is automatically modified as needed
     * when entering the phase. For more information, see the billing cycle <a
     * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
     *
     * <p>One of {@code automatic}, or {@code phase_start}.
     */
    @SerializedName("billing_cycle_anchor")
    String billingCycleAnchor;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period.
     */
    @SerializedName("billing_thresholds")
    BillingThresholds billingThresholds;

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     *
     * <p>One of {@code charge_automatically}, or {@code send_invoice}.
     */
    @SerializedName("collection_method")
    String collectionMethod;

    /**
     * ID of the default payment method for the subscription schedule. If not set, invoices will use
     * the default payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentMethod> defaultPaymentMethod;

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * The account (if any) the charge was made on behalf of for charges associated with the
     * schedule's subscription. See the Connect documentation for details.
     */
    @SerializedName("on_behalf_of")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> onBehalfOf;

    /**
     * The account (if any) the associated subscription's payments will be attributed to for tax
     * reporting, and where funds from each payment will be transferred to for each of the
     * subscription's invoices.
     */
    @SerializedName("transfer_data")
    TransferData transferData;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AutomaticTax extends StripeObject {
      /** Whether Stripe automatically computes tax on invoices created during this phase. */
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
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged. This value may not be {@code
       * true} if the subscription contains items with plans that have {@code
       * aggregate_usage=last_ever}.
       */
      @SerializedName("reset_billing_cycle_anchor")
      Boolean resetBillingCycleAnchor;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings extends StripeObject {
      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * billing=charge_automatically}.
       */
      @SerializedName("days_until_due")
      Long daysUntilDue;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData extends StripeObject {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
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

  /**
   * A phase describes the plans, coupon, and trialing status of a subscription for a predefined
   * time period.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Phase extends StripeObject {
    /**
     * A list of prices and quantities that will generate invoice items appended to the next invoice
     * for this phase.
     */
    @SerializedName("add_invoice_items")
    List<SubscriptionSchedule.Phase.AddInvoiceItem> addInvoiceItems;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account during this phase of the schedule.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    @SerializedName("automatic_tax")
    AutomaticTax automaticTax;

    /**
     * Possible values are {@code phase_start} or {@code automatic}. If {@code phase_start} then
     * billing cycle anchor of the subscription is set to the start of the phase when entering the
     * phase. If {@code automatic} then the billing cycle anchor is automatically modified as needed
     * when entering the phase. For more information, see the billing cycle <a
     * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
     *
     * <p>One of {@code automatic}, or {@code phase_start}.
     */
    @SerializedName("billing_cycle_anchor")
    String billingCycleAnchor;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period.
     */
    @SerializedName("billing_thresholds")
    BillingThresholds billingThresholds;

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     *
     * <p>One of {@code charge_automatically}, or {@code send_invoice}.
     */
    @SerializedName("collection_method")
    String collectionMethod;

    /** ID of the coupon to use during this phase of the subscription schedule. */
    @SerializedName("coupon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Coupon> coupon;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentMethod> defaultPaymentMethod;

    /**
     * The default tax rates to apply to the subscription during this phase of the subscription
     * schedule.
     */
    @SerializedName("default_tax_rates")
    List<TaxRate> defaultTaxRates;

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

    /** The end of this phase of the subscription schedule. */
    @SerializedName("end_date")
    Long endDate;

    /** The invoice settings applicable during this phase. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * Subscription items to configure the subscription to during this phase of the subscription
     * schedule.
     */
    @SerializedName("items")
    List<SubscriptionSchedule.Phase.Item> items;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to a phase. Metadata on a schedule's phase will update the underlying subscription's {@code
     * metadata} when the phase is entered. Updating the underlying subscription's {@code metadata}
     * directly will not affect the current phase's {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The account (if any) the charge was made on behalf of for charges associated with the
     * schedule's subscription. See the Connect documentation for details.
     */
    @SerializedName("on_behalf_of")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> onBehalfOf;

    /**
     * If the subscription schedule will prorate when transitioning to this phase. Possible values
     * are {@code create_prorations} and {@code none}.
     *
     * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
     */
    @SerializedName("proration_behavior")
    String prorationBehavior;

    /** The start of this phase of the subscription schedule. */
    @SerializedName("start_date")
    Long startDate;

    /**
     * The account (if any) the associated subscription's payments will be attributed to for tax
     * reporting, and where funds from each payment will be transferred to for each of the
     * subscription's invoices.
     */
    @SerializedName("transfer_data")
    TransferData transferData;

    /** When the trial ends within the phase. */
    @SerializedName("trial_end")
    Long trialEnd;

    /** Get ID of expandable {@code coupon} object. */
    public String getCoupon() {
      return (this.coupon != null) ? this.coupon.getId() : null;
    }

    public void setCoupon(String id) {
      this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
    }

    /** Get expanded {@code coupon}. */
    public Coupon getCouponObject() {
      return (this.coupon != null) ? this.coupon.getExpanded() : null;
    }

    public void setCouponObject(Coupon expandableObject) {
      this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
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

    /**
     * An Add Invoice Item describes the prices and quantities that will be added as pending invoice
     * items when entering a phase.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddInvoiceItem extends StripeObject {
      /** ID of the price used to generate the invoice item. */
      @SerializedName("price")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** The quantity of the invoice item. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not apply
       * to this item.
       */
      @SerializedName("tax_rates")
      List<TaxRate> taxRates;

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AutomaticTax extends StripeObject {
      /** Whether Stripe automatically computes tax on invoices created during this phase. */
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
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged. This value may not be {@code
       * true} if the subscription contains items with plans that have {@code
       * aggregate_usage=last_ever}.
       */
      @SerializedName("reset_billing_cycle_anchor")
      Boolean resetBillingCycleAnchor;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings extends StripeObject {
      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * billing=charge_automatically}.
       */
      @SerializedName("days_until_due")
      Long daysUntilDue;
    }

    /** A phase item describes the price and quantity of a phase. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Item extends StripeObject {
      /**
       * Define thresholds at which an invoice will be sent, and the related subscription advanced
       * to a new billing period.
       */
      @SerializedName("billing_thresholds")
      BillingThresholds billingThresholds;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an item. Metadata on this item will update the underlying subscription item's
       * {@code metadata} when the phase is entered.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** ID of the plan to which the customer should be subscribed. */
      @SerializedName("plan")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Plan> plan;

      /** ID of the price to which the customer should be subscribed. */
      @SerializedName("price")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** Quantity of the plan to which the customer should be subscribed. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to this {@code phase_item}. When set, the {@code
       * default_tax_rates} on the phase do not apply to this {@code phase_item}.
       */
      @SerializedName("tax_rates")
      List<TaxRate> taxRates;

      /** Get ID of expandable {@code plan} object. */
      public String getPlan() {
        return (this.plan != null) ? this.plan.getId() : null;
      }

      public void setPlan(String id) {
        this.plan = ApiResource.setExpandableFieldId(id, this.plan);
      }

      /** Get expanded {@code plan}. */
      public Plan getPlanObject() {
        return (this.plan != null) ? this.plan.getExpanded() : null;
      }

      public void setPlanObject(Plan expandableObject) {
        this.plan = new ExpandableField<Plan>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillingThresholds extends StripeObject {
        /** Usage threshold that triggers the subscription to create an invoice. */
        @SerializedName("usage_gte")
        Long usageGte;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData extends StripeObject {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(currentPhase, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(defaultSettings, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}
