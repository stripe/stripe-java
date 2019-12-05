package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionSchedule extends ApiResource
    implements HasId, MetadataStore<SubscriptionSchedule> {
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
   * if it is `active`.
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
   * Behavior of the subscription schedule and underlying subscription when it ends.
   *
   * <p>One of `cancel`, `none`, `release`, or `renew`.
   */
  @SerializedName("end_behavior")
  String endBehavior;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `subscription_schedule`.
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
   * This field has been deprecated. Interval and duration at which the subscription schedule renews
   * for when it ends if `renewal_behavior` is `renew`.
   */
  @SerializedName("renewal_interval")
  RenewalInterval renewalInterval;

  /**
   * The present status of the subscription schedule. Possible values are `not_started`, `active`,
   * `completed`, `released`, and `canceled`. You can read more about the different states in our
   * [behavior guide](https://stripe.com/docs/billing/subscriptions/subscription-schedules).
   *
   * <p>One of `active`, `canceled`, `completed`, `not_started`, or `released`.
   */
  @SerializedName("status")
  String status;

  /** ID of the subscription managed by the subscription schedule. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

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

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_schedules");
    return ApiResource.requestCollection(
        url, params, SubscriptionScheduleCollection.class, options);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(SubscriptionScheduleListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves the list of your subscription schedules. */
  public static SubscriptionScheduleCollection list(
      SubscriptionScheduleListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_schedules");
    return ApiResource.requestCollection(
        url, params, SubscriptionScheduleCollection.class, options);
  }

  /** Creates a new subscription schedule object. */
  public static SubscriptionSchedule create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new subscription schedule object. */
  public static SubscriptionSchedule create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_schedules");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /** Creates a new subscription schedule object. */
  public static SubscriptionSchedule create(SubscriptionScheduleCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new subscription schedule object. */
  public static SubscriptionSchedule create(
      SubscriptionScheduleCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/subscription_schedules");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(schedule)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionSchedule.class, options);
  }

  /**
   * Retrieves the details of an existing subscription schedule. You only need to supply the unique
   * subscription schedule identifier that was returned upon subscription schedule creation.
   */
  public static SubscriptionSchedule retrieve(
      String schedule, SubscriptionScheduleRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(schedule)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionSchedule.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(SubscriptionScheduleUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing subscription schedule. */
  public SubscriptionSchedule update(
      SubscriptionScheduleUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/subscription_schedules/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_schedules/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel(SubscriptionScheduleCancelParams params)
      throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a subscription schedule and its associated subscription immediately (if the
   * subscription schedule has an active subscription). A subscription schedule can only be canceled
   * if its status is <code>not_started</code> or <code>active</code>.
   */
  public SubscriptionSchedule cancel(
      SubscriptionScheduleCancelParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_schedules/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release() throws StripeException {
    return release((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release(RequestOptions options) throws StripeException {
    return release((Map<String, Object>) null, options);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release(Map<String, Object> params) throws StripeException {
    return release(params, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_schedules/%s/release", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release(SubscriptionScheduleReleaseParams params)
      throws StripeException {
    return release(params, (RequestOptions) null);
  }

  /**
   * Releases the subscription schedule immediately, which will stop scheduling of its phases, but
   * leave any existing subscription in place. A schedule can only be released if its status is
   * <code>not_started</code> or <code>active</code>. If the subscription schedule is currently
   * associated with a subscription, releasing it will remove its <code>subscription</code> property
   * and set the subscription’s ID to the <code>released_subscription</code> property.
   */
  public SubscriptionSchedule release(
      SubscriptionScheduleReleaseParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/subscription_schedules/%s/release", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, SubscriptionSchedule.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrentPhase extends StripeObject {
    @SerializedName("end_date")
    Long endDate;

    @SerializedName("start_date")
    Long startDate;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultSettings extends StripeObject {
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period.
     */
    @SerializedName("billing_thresholds")
    Subscription.BillingThresholds billingThresholds;

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions.
     *
     * <p>One of `charge_automatically`, or `send_invoice`.
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

    /** The subscription schedule's default invoice settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings extends StripeObject {
    /**
     * Number of days within which a customer must pay invoices generated by this subscription
     * schedule. This value will be `null` for subscription schedules where
     * `billing=charge_automatically`.
     */
    @SerializedName("days_until_due")
    Long daysUntilDue;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Phase extends StripeObject {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account during this phase of the schedule.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period.
     */
    @SerializedName("billing_thresholds")
    Subscription.BillingThresholds billingThresholds;

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions.
     *
     * <p>One of `charge_automatically`, or `send_invoice`.
     */
    @SerializedName("collection_method")
    String collectionMethod;

    /** ID of the coupon to use during this phase of the subscription schedule. */
    @SerializedName("coupon")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Coupon> coupon;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentMethod> defaultPaymentMethod;

    @SerializedName("default_tax_rates")
    List<TaxRate> defaultTaxRates;

    /** The end of this phase of the subscription schedule. */
    @SerializedName("end_date")
    Long endDate;

    /** The subscription schedule's default invoice settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /** Plans to subscribe during this phase of the subscription schedule. */
    @SerializedName("plans")
    List<SubscriptionSchedule.PhaseItem> plans;

    /** The start of this phase of the subscription schedule. */
    @SerializedName("start_date")
    Long startDate;

    /**
     * If provided, each invoice created during this phase of the subscription schedule will apply
     * the tax rate, increasing the amount billed to the customer.
     */
    @SerializedName("tax_percent")
    BigDecimal taxPercent;

    /** When the trial ends within the phase. */
    @SerializedName("trial_end")
    Long trialEnd;

    /** Get id of expandable `coupon` object. */
    public String getCoupon() {
      return (this.coupon != null) ? this.coupon.getId() : null;
    }

    public void setCoupon(String id) {
      this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
    }

    /** Get expanded `coupon`. */
    public Coupon getCouponObject() {
      return (this.coupon != null) ? this.coupon.getExpanded() : null;
    }

    public void setCouponObject(Coupon expandableObject) {
      this.coupon = new ExpandableField<Coupon>(expandableObject.getId(), expandableObject);
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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PhaseItem extends StripeObject {
    /**
     * Define thresholds at which an invoice will be sent, and the related subscription advanced to
     * a new billing period.
     */
    @SerializedName("billing_thresholds")
    SubscriptionItem.BillingThresholds billingThresholds;

    /** ID of the plan to which the customer should be subscribed. */
    @SerializedName("plan")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Plan> plan;

    /** Quantity of the plan to which the customer should be subscribed. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * The tax rates which apply to this `phase_item`. When set, the `default_tax_rates` on the
     * phase do not apply to this `phase_item`.
     */
    @SerializedName("tax_rates")
    List<TaxRate> taxRates;

    /** Get id of expandable `plan` object. */
    public String getPlan() {
      return (this.plan != null) ? this.plan.getId() : null;
    }

    public void setPlan(String id) {
      this.plan = ApiResource.setExpandableFieldId(id, this.plan);
    }

    /** Get expanded `plan`. */
    public Plan getPlanObject() {
      return (this.plan != null) ? this.plan.getExpanded() : null;
    }

    public void setPlanObject(Plan expandableObject) {
      this.plan = new ExpandableField<Plan>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RenewalInterval extends StripeObject {
    /**
     * Interval at which to renew the subscription schedule for when it ends.
     *
     * <p>One of `day`, `month`, `week`, or `year`.
     */
    @SerializedName("interval")
    String interval;

    /** Number of intervals to renew the subscription schedule for when it ends. */
    @SerializedName("length")
    Long length;
  }
}
