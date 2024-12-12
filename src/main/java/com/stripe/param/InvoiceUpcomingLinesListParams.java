// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoiceUpcomingLinesListParams extends ApiRequestParams {
  /** Settings for automatic tax lookup for this invoice preview. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * The ID of the coupon to apply to this phase of the subscription schedule. This field has been
   * deprecated and will be removed in a future API version. Use {@code discounts} instead.
   */
  @SerializedName("coupon")
  String coupon;

  /**
   * The currency to preview this invoice in. Defaults to that of {@code customer} if not specified.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The identifier of the customer whose upcoming invoice you'd like to retrieve. If {@code
   * automatic_tax} is enabled then one of {@code customer}, {@code customer_details}, {@code
   * subscription}, or {@code schedule} must be set.
   */
  @SerializedName("customer")
  String customer;

  /**
   * Details about the customer you want to invoice or overrides for an existing customer. If {@code
   * automatic_tax} is enabled then one of {@code customer}, {@code customer_details}, {@code
   * subscription}, or {@code schedule} must be set.
   */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the
   * discount from the subscription or customer. This works for both coupons directly applied to an
   * invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting any
   * discounts.
   */
  @SerializedName("discounts")
  Object discounts;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** List of invoice items to add or update in the upcoming invoice preview (up to 250). */
  @SerializedName("invoice_items")
  List<InvoiceUpcomingLinesListParams.InvoiceItem> invoiceItems;

  /**
   * The connected account that issues the invoice. The invoice is presented with the branding and
   * support information of the specified account.
   */
  @SerializedName("issuer")
  Issuer issuer;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the
   * invoice will be presented with the branding and support information of the specified account.
   * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
   * documentation for details.
   */
  @SerializedName("on_behalf_of")
  Object onBehalfOf;

  /**
   * Customizes the types of values to include when calculating the invoice. Defaults to {@code
   * next} if unspecified.
   */
  @SerializedName("preview_mode")
  PreviewMode previewMode;

  /**
   * The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used
   * with subscription or subscription fields.
   */
  @SerializedName("schedule")
  String schedule;

  /**
   * The schedule creation or modification params to apply as a preview. Cannot be used with {@code
   * subscription} or {@code subscription_} prefixed fields.
   */
  @SerializedName("schedule_details")
  ScheduleDetails scheduleDetails;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If
   * not provided, but a {@code subscription_details.items} is provided, you will preview creating a
   * subscription with those items. If neither {@code subscription} nor {@code
   * subscription_details.items} is provided, you will retrieve the next upcoming invoice from among
   * the customer's subscriptions.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * For new subscriptions, a future timestamp to anchor the subscription's <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
   * determine the date of the first full invoice, and, for plans with {@code month} or {@code year}
   * intervals, the day of the month for subsequent invoices. For existing subscriptions, the value
   * can only be set to {@code now} or {@code unchanged}. This field has been deprecated and will be
   * removed in a future API version. Use {@code subscription_details.billing_cycle_anchor} instead.
   */
  @SerializedName("subscription_billing_cycle_anchor")
  Object subscriptionBillingCycleAnchor;

  /**
   * A timestamp at which the subscription should cancel. If set to a date before the current period
   * ends, this will cause a proration if prorations have been enabled using {@code
   * proration_behavior}. If set during a future period, this will always cause a proration for that
   * period. This field has been deprecated and will be removed in a future API version. Use {@code
   * subscription_details.cancel_at} instead.
   */
  @SerializedName("subscription_cancel_at")
  Object subscriptionCancelAt;

  /**
   * Indicate whether this subscription should cancel at the end of the current period ({@code
   * current_period_end}). Defaults to {@code false}. This field has been deprecated and will be
   * removed in a future API version. Use {@code subscription_details.cancel_at_period_end} instead.
   */
  @SerializedName("subscription_cancel_at_period_end")
  Boolean subscriptionCancelAtPeriodEnd;

  /**
   * This simulates the subscription being canceled or expired immediately. This field has been
   * deprecated and will be removed in a future API version. Use {@code
   * subscription_details.cancel_now} instead.
   */
  @SerializedName("subscription_cancel_now")
  Boolean subscriptionCancelNow;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with these
   * default tax rates. The default tax rates will apply to any line item that does not have {@code
   * tax_rates} set. This field has been deprecated and will be removed in a future API version. Use
   * {@code subscription_details.default_tax_rates} instead.
   */
  @SerializedName("subscription_default_tax_rates")
  Object subscriptionDefaultTaxRates;

  /**
   * The subscription creation or modification params to apply as a preview. Cannot be used with
   * {@code schedule} or {@code schedule_details} fields.
   */
  @SerializedName("subscription_details")
  SubscriptionDetails subscriptionDetails;

  /**
   * A list of up to 20 subscription items, each with an attached price. This field has been
   * deprecated and will be removed in a future API version. Use {@code subscription_details.items}
   * instead.
   */
  @SerializedName("subscription_items")
  List<InvoiceUpcomingLinesListParams.SubscriptionItem> subscriptionItems;

  /**
   * The pre-billing to apply to the subscription as a preview. This field has been deprecated and
   * will be removed in a future API version. Use {@code subscription_details.prebilling} instead.
   */
  @SerializedName("subscription_prebilling")
  SubscriptionPrebilling subscriptionPrebilling;

  /**
   * Determines how to handle <a
   * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the billing
   * cycle changes (e.g., when switching plans, resetting {@code billing_cycle_anchor=now}, or
   * starting a trial), or if an item's {@code quantity} changes. The default value is {@code
   * create_prorations}. This field has been deprecated and will be removed in a future API version.
   * Use {@code subscription_details.proration_behavior} instead.
   */
  @SerializedName("subscription_proration_behavior")
  SubscriptionProrationBehavior subscriptionProrationBehavior;

  /**
   * If previewing an update to a subscription, and doing proration, {@code
   * subscription_proration_date} forces the proration to be calculated as though the update was
   * done at the specified time. The time given must be within the current subscription period and
   * within the current phase of the schedule backing this subscription, if the schedule exists. If
   * set, {@code subscription}, and one of {@code subscription_items}, or {@code
   * subscription_trial_end} are required. Also, {@code subscription_proration_behavior} cannot be
   * set to 'none'. This field has been deprecated and will be removed in a future API version. Use
   * {@code subscription_details.proration_date} instead.
   */
  @SerializedName("subscription_proration_date")
  Long subscriptionProrationDate;

  /**
   * For paused subscriptions, setting {@code subscription_resume_at} to {@code now} will preview
   * the invoice that will be generated if the subscription is resumed. This field has been
   * deprecated and will be removed in a future API version. Use {@code
   * subscription_details.resume_at} instead.
   */
  @SerializedName("subscription_resume_at")
  SubscriptionResumeAt subscriptionResumeAt;

  /**
   * Date a subscription is intended to start (can be future or past). This field has been
   * deprecated and will be removed in a future API version. Use {@code
   * subscription_details.start_date} instead.
   */
  @SerializedName("subscription_start_date")
  Long subscriptionStartDate;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with that
   * trial end. If set, one of {@code subscription_items} or {@code subscription} is required. This
   * field has been deprecated and will be removed in a future API version. Use {@code
   * subscription_details.trial_end} instead.
   */
  @SerializedName("subscription_trial_end")
  Object subscriptionTrialEnd;

  /**
   * Indicates if a plan's {@code trial_period_days} should be applied to the subscription. Setting
   * {@code subscription_trial_end} per subscription is preferred, and this defaults to {@code
   * false}. Setting this flag to {@code true} together with {@code subscription_trial_end} is not
   * allowed. See <a href="https://stripe.com/docs/billing/subscriptions/trials">Using trial periods
   * on subscriptions</a> to learn more.
   */
  @SerializedName("subscription_trial_from_plan")
  Boolean subscriptionTrialFromPlan;

  private InvoiceUpcomingLinesListParams(
      AutomaticTax automaticTax,
      String coupon,
      String currency,
      String customer,
      CustomerDetails customerDetails,
      Object discounts,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      List<InvoiceUpcomingLinesListParams.InvoiceItem> invoiceItems,
      Issuer issuer,
      Long limit,
      Object onBehalfOf,
      PreviewMode previewMode,
      String schedule,
      ScheduleDetails scheduleDetails,
      String startingAfter,
      String subscription,
      Object subscriptionBillingCycleAnchor,
      Object subscriptionCancelAt,
      Boolean subscriptionCancelAtPeriodEnd,
      Boolean subscriptionCancelNow,
      Object subscriptionDefaultTaxRates,
      SubscriptionDetails subscriptionDetails,
      List<InvoiceUpcomingLinesListParams.SubscriptionItem> subscriptionItems,
      SubscriptionPrebilling subscriptionPrebilling,
      SubscriptionProrationBehavior subscriptionProrationBehavior,
      Long subscriptionProrationDate,
      SubscriptionResumeAt subscriptionResumeAt,
      Long subscriptionStartDate,
      Object subscriptionTrialEnd,
      Boolean subscriptionTrialFromPlan) {
    this.automaticTax = automaticTax;
    this.coupon = coupon;
    this.currency = currency;
    this.customer = customer;
    this.customerDetails = customerDetails;
    this.discounts = discounts;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceItems = invoiceItems;
    this.issuer = issuer;
    this.limit = limit;
    this.onBehalfOf = onBehalfOf;
    this.previewMode = previewMode;
    this.schedule = schedule;
    this.scheduleDetails = scheduleDetails;
    this.startingAfter = startingAfter;
    this.subscription = subscription;
    this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
    this.subscriptionCancelAt = subscriptionCancelAt;
    this.subscriptionCancelAtPeriodEnd = subscriptionCancelAtPeriodEnd;
    this.subscriptionCancelNow = subscriptionCancelNow;
    this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
    this.subscriptionDetails = subscriptionDetails;
    this.subscriptionItems = subscriptionItems;
    this.subscriptionPrebilling = subscriptionPrebilling;
    this.subscriptionProrationBehavior = subscriptionProrationBehavior;
    this.subscriptionProrationDate = subscriptionProrationDate;
    this.subscriptionResumeAt = subscriptionResumeAt;
    this.subscriptionStartDate = subscriptionStartDate;
    this.subscriptionTrialEnd = subscriptionTrialEnd;
    this.subscriptionTrialFromPlan = subscriptionTrialFromPlan;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AutomaticTax automaticTax;

    private String coupon;

    private String currency;

    private String customer;

    private CustomerDetails customerDetails;

    private Object discounts;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<InvoiceUpcomingLinesListParams.InvoiceItem> invoiceItems;

    private Issuer issuer;

    private Long limit;

    private Object onBehalfOf;

    private PreviewMode previewMode;

    private String schedule;

    private ScheduleDetails scheduleDetails;

    private String startingAfter;

    private String subscription;

    private Object subscriptionBillingCycleAnchor;

    private Object subscriptionCancelAt;

    private Boolean subscriptionCancelAtPeriodEnd;

    private Boolean subscriptionCancelNow;

    private Object subscriptionDefaultTaxRates;

    private SubscriptionDetails subscriptionDetails;

    private List<InvoiceUpcomingLinesListParams.SubscriptionItem> subscriptionItems;

    private SubscriptionPrebilling subscriptionPrebilling;

    private SubscriptionProrationBehavior subscriptionProrationBehavior;

    private Long subscriptionProrationDate;

    private SubscriptionResumeAt subscriptionResumeAt;

    private Long subscriptionStartDate;

    private Object subscriptionTrialEnd;

    private Boolean subscriptionTrialFromPlan;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceUpcomingLinesListParams build() {
      return new InvoiceUpcomingLinesListParams(
          this.automaticTax,
          this.coupon,
          this.currency,
          this.customer,
          this.customerDetails,
          this.discounts,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.invoiceItems,
          this.issuer,
          this.limit,
          this.onBehalfOf,
          this.previewMode,
          this.schedule,
          this.scheduleDetails,
          this.startingAfter,
          this.subscription,
          this.subscriptionBillingCycleAnchor,
          this.subscriptionCancelAt,
          this.subscriptionCancelAtPeriodEnd,
          this.subscriptionCancelNow,
          this.subscriptionDefaultTaxRates,
          this.subscriptionDetails,
          this.subscriptionItems,
          this.subscriptionPrebilling,
          this.subscriptionProrationBehavior,
          this.subscriptionProrationDate,
          this.subscriptionResumeAt,
          this.subscriptionStartDate,
          this.subscriptionTrialEnd,
          this.subscriptionTrialFromPlan);
    }

    /** Settings for automatic tax lookup for this invoice preview. */
    public Builder setAutomaticTax(InvoiceUpcomingLinesListParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * The ID of the coupon to apply to this phase of the subscription schedule. This field has been
     * deprecated and will be removed in a future API version. Use {@code discounts} instead.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * The currency to preview this invoice in. Defaults to that of {@code customer} if not
     * specified.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The identifier of the customer whose upcoming invoice you'd like to retrieve. If {@code
     * automatic_tax} is enabled then one of {@code customer}, {@code customer_details}, {@code
     * subscription}, or {@code schedule} must be set.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Details about the customer you want to invoice or overrides for an existing customer. If
     * {@code automatic_tax} is enabled then one of {@code customer}, {@code customer_details},
     * {@code subscription}, or {@code schedule} must be set.
     */
    public Builder setCustomerDetails(
        InvoiceUpcomingLinesListParams.CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(InvoiceUpcomingLinesListParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceUpcomingLinesListParams.Discount>();
      }
      ((List<InvoiceUpcomingLinesListParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<InvoiceUpcomingLinesListParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceUpcomingLinesListParams.Discount>();
      }
      ((List<InvoiceUpcomingLinesListParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the
     * discount from the subscription or customer. This works for both coupons directly applied to
     * an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting
     * any discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the
     * discount from the subscription or customer. This works for both coupons directly applied to
     * an invoice and coupons applied to a subscription. Pass an empty string to avoid inheriting
     * any discounts.
     */
    public Builder setDiscounts(List<InvoiceUpcomingLinesListParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceUpcomingLinesListParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceUpcomingLinesListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `invoiceItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#invoiceItems} for the field documentation.
     */
    public Builder addInvoiceItem(InvoiceUpcomingLinesListParams.InvoiceItem element) {
      if (this.invoiceItems == null) {
        this.invoiceItems = new ArrayList<>();
      }
      this.invoiceItems.add(element);
      return this;
    }

    /**
     * Add all elements to `invoiceItems` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#invoiceItems} for the field documentation.
     */
    public Builder addAllInvoiceItem(List<InvoiceUpcomingLinesListParams.InvoiceItem> elements) {
      if (this.invoiceItems == null) {
        this.invoiceItems = new ArrayList<>();
      }
      this.invoiceItems.addAll(elements);
      return this;
    }

    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and
     * support information of the specified account.
     */
    public Builder setIssuer(InvoiceUpcomingLinesListParams.Issuer issuer) {
      this.issuer = issuer;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the
     * invoice will be presented with the branding and support information of the specified account.
     * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
     * documentation for details.
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the
     * invoice will be presented with the branding and support information of the specified account.
     * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
     * documentation for details.
     */
    public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * Customizes the types of values to include when calculating the invoice. Defaults to {@code
     * next} if unspecified.
     */
    public Builder setPreviewMode(InvoiceUpcomingLinesListParams.PreviewMode previewMode) {
      this.previewMode = previewMode;
      return this;
    }

    /**
     * The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used
     * with subscription or subscription fields.
     */
    public Builder setSchedule(String schedule) {
      this.schedule = schedule;
      return this;
    }

    /**
     * The schedule creation or modification params to apply as a preview. Cannot be used with
     * {@code subscription} or {@code subscription_} prefixed fields.
     */
    public Builder setScheduleDetails(
        InvoiceUpcomingLinesListParams.ScheduleDetails scheduleDetails) {
      this.scheduleDetails = scheduleDetails;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If
     * not provided, but a {@code subscription_details.items} is provided, you will preview creating
     * a subscription with those items. If neither {@code subscription} nor {@code
     * subscription_details.items} is provided, you will retrieve the next upcoming invoice from
     * among the customer's subscriptions.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * For new subscriptions, a future timestamp to anchor the subscription's <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
     * determine the date of the first full invoice, and, for plans with {@code month} or {@code
     * year} intervals, the day of the month for subsequent invoices. For existing subscriptions,
     * the value can only be set to {@code now} or {@code unchanged}. This field has been deprecated
     * and will be removed in a future API version. Use {@code
     * subscription_details.billing_cycle_anchor} instead.
     */
    public Builder setSubscriptionBillingCycleAnchor(
        InvoiceUpcomingLinesListParams.SubscriptionBillingCycleAnchor
            subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * For new subscriptions, a future timestamp to anchor the subscription's <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
     * determine the date of the first full invoice, and, for plans with {@code month} or {@code
     * year} intervals, the day of the month for subsequent invoices. For existing subscriptions,
     * the value can only be set to {@code now} or {@code unchanged}. This field has been deprecated
     * and will be removed in a future API version. Use {@code
     * subscription_details.billing_cycle_anchor} instead.
     */
    public Builder setSubscriptionBillingCycleAnchor(Long subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current
     * period ends, this will cause a proration if prorations have been enabled using {@code
     * proration_behavior}. If set during a future period, this will always cause a proration for
     * that period. This field has been deprecated and will be removed in a future API version. Use
     * {@code subscription_details.cancel_at} instead.
     */
    public Builder setSubscriptionCancelAt(Long subscriptionCancelAt) {
      this.subscriptionCancelAt = subscriptionCancelAt;
      return this;
    }

    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current
     * period ends, this will cause a proration if prorations have been enabled using {@code
     * proration_behavior}. If set during a future period, this will always cause a proration for
     * that period. This field has been deprecated and will be removed in a future API version. Use
     * {@code subscription_details.cancel_at} instead.
     */
    public Builder setSubscriptionCancelAt(EmptyParam subscriptionCancelAt) {
      this.subscriptionCancelAt = subscriptionCancelAt;
      return this;
    }

    /**
     * Indicate whether this subscription should cancel at the end of the current period ({@code
     * current_period_end}). Defaults to {@code false}. This field has been deprecated and will be
     * removed in a future API version. Use {@code subscription_details.cancel_at_period_end}
     * instead.
     */
    public Builder setSubscriptionCancelAtPeriodEnd(Boolean subscriptionCancelAtPeriodEnd) {
      this.subscriptionCancelAtPeriodEnd = subscriptionCancelAtPeriodEnd;
      return this;
    }

    /**
     * This simulates the subscription being canceled or expired immediately. This field has been
     * deprecated and will be removed in a future API version. Use {@code
     * subscription_details.cancel_now} instead.
     */
    public Builder setSubscriptionCancelNow(Boolean subscriptionCancelNow) {
      this.subscriptionCancelNow = subscriptionCancelNow;
      return this;
    }

    /**
     * Add an element to `subscriptionDefaultTaxRates` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceUpcomingLinesListParams#subscriptionDefaultTaxRates} for the field
     * documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addSubscriptionDefaultTaxRate(String element) {
      if (this.subscriptionDefaultTaxRates == null
          || this.subscriptionDefaultTaxRates instanceof EmptyParam) {
        this.subscriptionDefaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.subscriptionDefaultTaxRates).add(element);
      return this;
    }

    /**
     * Add all elements to `subscriptionDefaultTaxRates` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceUpcomingLinesListParams#subscriptionDefaultTaxRates} for the field
     * documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllSubscriptionDefaultTaxRate(List<String> elements) {
      if (this.subscriptionDefaultTaxRates == null
          || this.subscriptionDefaultTaxRates instanceof EmptyParam) {
        this.subscriptionDefaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.subscriptionDefaultTaxRates).addAll(elements);
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with these
     * default tax rates. The default tax rates will apply to any line item that does not have
     * {@code tax_rates} set. This field has been deprecated and will be removed in a future API
     * version. Use {@code subscription_details.default_tax_rates} instead.
     */
    public Builder setSubscriptionDefaultTaxRates(EmptyParam subscriptionDefaultTaxRates) {
      this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with these
     * default tax rates. The default tax rates will apply to any line item that does not have
     * {@code tax_rates} set. This field has been deprecated and will be removed in a future API
     * version. Use {@code subscription_details.default_tax_rates} instead.
     */
    public Builder setSubscriptionDefaultTaxRates(List<String> subscriptionDefaultTaxRates) {
      this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
      return this;
    }

    /**
     * The subscription creation or modification params to apply as a preview. Cannot be used with
     * {@code schedule} or {@code schedule_details} fields.
     */
    public Builder setSubscriptionDetails(
        InvoiceUpcomingLinesListParams.SubscriptionDetails subscriptionDetails) {
      this.subscriptionDetails = subscriptionDetails;
      return this;
    }

    /**
     * Add an element to `subscriptionItems` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingLinesListParams#subscriptionItems} for the field documentation.
     */
    public Builder addSubscriptionItem(InvoiceUpcomingLinesListParams.SubscriptionItem element) {
      if (this.subscriptionItems == null) {
        this.subscriptionItems = new ArrayList<>();
      }
      this.subscriptionItems.add(element);
      return this;
    }

    /**
     * Add all elements to `subscriptionItems` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceUpcomingLinesListParams#subscriptionItems} for the field documentation.
     */
    public Builder addAllSubscriptionItem(
        List<InvoiceUpcomingLinesListParams.SubscriptionItem> elements) {
      if (this.subscriptionItems == null) {
        this.subscriptionItems = new ArrayList<>();
      }
      this.subscriptionItems.addAll(elements);
      return this;
    }

    /**
     * The pre-billing to apply to the subscription as a preview. This field has been deprecated and
     * will be removed in a future API version. Use {@code subscription_details.prebilling} instead.
     */
    public Builder setSubscriptionPrebilling(
        InvoiceUpcomingLinesListParams.SubscriptionPrebilling subscriptionPrebilling) {
      this.subscriptionPrebilling = subscriptionPrebilling;
      return this;
    }

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * The default value is {@code create_prorations}. This field has been deprecated and will be
     * removed in a future API version. Use {@code subscription_details.proration_behavior} instead.
     */
    public Builder setSubscriptionProrationBehavior(
        InvoiceUpcomingLinesListParams.SubscriptionProrationBehavior
            subscriptionProrationBehavior) {
      this.subscriptionProrationBehavior = subscriptionProrationBehavior;
      return this;
    }

    /**
     * If previewing an update to a subscription, and doing proration, {@code
     * subscription_proration_date} forces the proration to be calculated as though the update was
     * done at the specified time. The time given must be within the current subscription period and
     * within the current phase of the schedule backing this subscription, if the schedule exists.
     * If set, {@code subscription}, and one of {@code subscription_items}, or {@code
     * subscription_trial_end} are required. Also, {@code subscription_proration_behavior} cannot be
     * set to 'none'. This field has been deprecated and will be removed in a future API version.
     * Use {@code subscription_details.proration_date} instead.
     */
    public Builder setSubscriptionProrationDate(Long subscriptionProrationDate) {
      this.subscriptionProrationDate = subscriptionProrationDate;
      return this;
    }

    /**
     * For paused subscriptions, setting {@code subscription_resume_at} to {@code now} will preview
     * the invoice that will be generated if the subscription is resumed. This field has been
     * deprecated and will be removed in a future API version. Use {@code
     * subscription_details.resume_at} instead.
     */
    public Builder setSubscriptionResumeAt(
        InvoiceUpcomingLinesListParams.SubscriptionResumeAt subscriptionResumeAt) {
      this.subscriptionResumeAt = subscriptionResumeAt;
      return this;
    }

    /**
     * Date a subscription is intended to start (can be future or past). This field has been
     * deprecated and will be removed in a future API version. Use {@code
     * subscription_details.start_date} instead.
     */
    public Builder setSubscriptionStartDate(Long subscriptionStartDate) {
      this.subscriptionStartDate = subscriptionStartDate;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of {@code subscription_items} or {@code subscription} is required.
     * This field has been deprecated and will be removed in a future API version. Use {@code
     * subscription_details.trial_end} instead.
     */
    public Builder setSubscriptionTrialEnd(
        InvoiceUpcomingLinesListParams.SubscriptionTrialEnd subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of {@code subscription_items} or {@code subscription} is required.
     * This field has been deprecated and will be removed in a future API version. Use {@code
     * subscription_details.trial_end} instead.
     */
    public Builder setSubscriptionTrialEnd(Long subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * Indicates if a plan's {@code trial_period_days} should be applied to the subscription.
     * Setting {@code subscription_trial_end} per subscription is preferred, and this defaults to
     * {@code false}. Setting this flag to {@code true} together with {@code subscription_trial_end}
     * is not allowed. See <a href="https://stripe.com/docs/billing/subscriptions/trials">Using
     * trial periods on subscriptions</a> to learn more.
     */
    public Builder setSubscriptionTrialFromPlan(Boolean subscriptionTrialFromPlan) {
      this.subscriptionTrialFromPlan = subscriptionTrialFromPlan;
      return this;
    }
  }

  @Getter
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> Whether Stripe automatically computes tax on this invoice. Note
     * that incompatible invoice items (invoice items with manually specified <a
     * href="https://stripe.com/docs/api/tax_rates">tax rates</a>, negative amounts, or {@code
     * tax_behavior=unspecified}) cannot be added to automatic tax invoices.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams, Liability liability) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.liability = liability;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private Liability liability;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.AutomaticTax build() {
        return new InvoiceUpcomingLinesListParams.AutomaticTax(
            this.enabled, this.extraParams, this.liability);
      }

      /**
       * <strong>Required.</strong> Whether Stripe automatically computes tax on this invoice. Note
       * that incompatible invoice items (invoice items with manually specified <a
       * href="https://stripe.com/docs/api/tax_rates">tax rates</a>, negative amounts, or {@code
       * tax_behavior=unspecified}) cannot be added to automatic tax invoices.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.AutomaticTax#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.AutomaticTax#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      public Builder setLiability(InvoiceUpcomingLinesListParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    public static class Liability {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      String account;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      @SerializedName("type")
      Type type;

      private Liability(String account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.AutomaticTax.Liability build() {
          return new InvoiceUpcomingLinesListParams.AutomaticTax.Liability(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.AutomaticTax.Liability#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.AutomaticTax.Liability#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        public Builder setType(InvoiceUpcomingLinesListParams.AutomaticTax.Liability.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("self")
        SELF("self");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class CustomerDetails {
    /** The customer's address. */
    @SerializedName("address")
    Object address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    @SerializedName("shipping")
    Object shipping;

    /** Tax details about the customer. */
    @SerializedName("tax")
    Tax tax;

    /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
    @SerializedName("tax_exempt")
    ApiRequestParams.EnumParam taxExempt;

    /** The customer's tax IDs. */
    @SerializedName("tax_ids")
    List<InvoiceUpcomingLinesListParams.CustomerDetails.TaxId> taxIds;

    private CustomerDetails(
        Object address,
        Map<String, Object> extraParams,
        Object shipping,
        Tax tax,
        ApiRequestParams.EnumParam taxExempt,
        List<InvoiceUpcomingLinesListParams.CustomerDetails.TaxId> taxIds) {
      this.address = address;
      this.extraParams = extraParams;
      this.shipping = shipping;
      this.tax = tax;
      this.taxExempt = taxExempt;
      this.taxIds = taxIds;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object address;

      private Map<String, Object> extraParams;

      private Object shipping;

      private Tax tax;

      private ApiRequestParams.EnumParam taxExempt;

      private List<InvoiceUpcomingLinesListParams.CustomerDetails.TaxId> taxIds;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.CustomerDetails build() {
        return new InvoiceUpcomingLinesListParams.CustomerDetails(
            this.address, this.extraParams, this.shipping, this.tax, this.taxExempt, this.taxIds);
      }

      /** The customer's address. */
      public Builder setAddress(InvoiceUpcomingLinesListParams.CustomerDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The customer's address. */
      public Builder setAddress(EmptyParam address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.CustomerDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.CustomerDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's shipping information. Appears on invoices emailed to this customer. */
      public Builder setShipping(InvoiceUpcomingLinesListParams.CustomerDetails.Shipping shipping) {
        this.shipping = shipping;
        return this;
      }

      /** The customer's shipping information. Appears on invoices emailed to this customer. */
      public Builder setShipping(EmptyParam shipping) {
        this.shipping = shipping;
        return this;
      }

      /** Tax details about the customer. */
      public Builder setTax(InvoiceUpcomingLinesListParams.CustomerDetails.Tax tax) {
        this.tax = tax;
        return this;
      }

      /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
      public Builder setTaxExempt(
          InvoiceUpcomingLinesListParams.CustomerDetails.TaxExempt taxExempt) {
        this.taxExempt = taxExempt;
        return this;
      }

      /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
      public Builder setTaxExempt(EmptyParam taxExempt) {
        this.taxExempt = taxExempt;
        return this;
      }

      /**
       * Add an element to `taxIds` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.CustomerDetails#taxIds} for the field documentation.
       */
      public Builder addTaxId(InvoiceUpcomingLinesListParams.CustomerDetails.TaxId element) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.add(element);
        return this;
      }

      /**
       * Add all elements to `taxIds` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.CustomerDetails#taxIds} for the field documentation.
       */
      public Builder addAllTaxId(
          List<InvoiceUpcomingLinesListParams.CustomerDetails.TaxId> elements) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.addAll(elements);
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.CustomerDetails.Address build() {
          return new InvoiceUpcomingLinesListParams.CustomerDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Address#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Address#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    public static class Shipping {
      /** <strong>Required.</strong> Customer shipping address. */
      @SerializedName("address")
      Address address;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Customer name. */
      @SerializedName("name")
      String name;

      /** Customer phone (including extension). */
      @SerializedName("phone")
      String phone;

      private Shipping(
          Address address, Map<String, Object> extraParams, String name, String phone) {
        this.address = address;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.CustomerDetails.Shipping build() {
          return new InvoiceUpcomingLinesListParams.CustomerDetails.Shipping(
              this.address, this.extraParams, this.name, this.phone);
        }

        /** <strong>Required.</strong> Customer shipping address. */
        public Builder setAddress(
            InvoiceUpcomingLinesListParams.CustomerDetails.Shipping.Address address) {
          this.address = address;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Shipping#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Shipping#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Customer name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Customer phone (including extension). */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * A freeform text field for the country. However, in order to activate some tax features,
         * the format should be a two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.CustomerDetails.Shipping.Address build() {
            return new InvoiceUpcomingLinesListParams.CustomerDetails.Shipping.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * A freeform text field for the country. However, in order to activate some tax features,
           * the format should be a two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.CustomerDetails.Shipping.Address#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.CustomerDetails.Shipping.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Tax {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A recent IP address of the customer used for tax reporting and tax location inference.
       * Stripe recommends updating the IP address when a new PaymentMethod is attached or the
       * address field on the customer is updated. We recommend against updating this field more
       * frequently since it could result in unexpected tax location/reporting outcomes.
       */
      @SerializedName("ip_address")
      Object ipAddress;

      private Tax(Map<String, Object> extraParams, Object ipAddress) {
        this.extraParams = extraParams;
        this.ipAddress = ipAddress;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object ipAddress;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.CustomerDetails.Tax build() {
          return new InvoiceUpcomingLinesListParams.CustomerDetails.Tax(
              this.extraParams, this.ipAddress);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Tax#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.Tax#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * A recent IP address of the customer used for tax reporting and tax location inference.
         * Stripe recommends updating the IP address when a new PaymentMethod is attached or the
         * address field on the customer is updated. We recommend against updating this field more
         * frequently since it could result in unexpected tax location/reporting outcomes.
         */
        public Builder setIpAddress(String ipAddress) {
          this.ipAddress = ipAddress;
          return this;
        }

        /**
         * A recent IP address of the customer used for tax reporting and tax location inference.
         * Stripe recommends updating the IP address when a new PaymentMethod is attached or the
         * address field on the customer is updated. We recommend against updating this field more
         * frequently since it could result in unexpected tax location/reporting outcomes.
         */
        public Builder setIpAddress(EmptyParam ipAddress) {
          this.ipAddress = ipAddress;
          return this;
        }
      }
    }

    @Getter
    public static class TaxId {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
       * {@code am_tin}, {@code ao_tin}, {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code
       * ba_tin}, {@code bb_tin}, {@code bg_uic}, {@code bh_vat}, {@code bo_tin}, {@code br_cnpj},
       * {@code br_cpf}, {@code bs_tin}, {@code by_tin}, {@code ca_bn}, {@code ca_gst_hst}, {@code
       * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code cd_nif}, {@code
       * ch_uid}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
       * {@code de_stn}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code
       * eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code gn_nif}, {@code hk_br},
       * {@code hr_oib}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code
       * is_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kh_tin},
       * {@code kr_brn}, {@code kz_bin}, {@code li_uid}, {@code li_vat}, {@code ma_vat}, {@code
       * md_vat}, {@code me_pib}, {@code mk_vat}, {@code mr_nif}, {@code mx_rfc}, {@code my_frp},
       * {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat}, {@code no_voec}, {@code
       * np_pan}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin}, {@code ro_tin},
       * {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code
       * sg_uen}, {@code si_tin}, {@code sn_ninea}, {@code sr_fin}, {@code sv_nit}, {@code th_vat},
       * {@code tj_tin}, {@code tr_tin}, {@code tw_vat}, {@code tz_vat}, {@code ua_vat}, {@code
       * ug_tin}, {@code us_ein}, {@code uy_ruc}, {@code uz_tin}, {@code uz_vat}, {@code ve_rif},
       * {@code vn_tin}, {@code za_vat}, {@code zm_tin}, or {@code zw_tin}
       */
      @SerializedName("type")
      Type type;

      /** <strong>Required.</strong> Value of the tax ID. */
      @SerializedName("value")
      String value;

      private TaxId(Map<String, Object> extraParams, Type type, String value) {
        this.extraParams = extraParams;
        this.type = type;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        private String value;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.CustomerDetails.TaxId build() {
          return new InvoiceUpcomingLinesListParams.CustomerDetails.TaxId(
              this.extraParams, this.type, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.TaxId#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.CustomerDetails.TaxId#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
         * {@code am_tin}, {@code ao_tin}, {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code
         * ba_tin}, {@code bb_tin}, {@code bg_uic}, {@code bh_vat}, {@code bo_tin}, {@code br_cnpj},
         * {@code br_cpf}, {@code bs_tin}, {@code by_tin}, {@code ca_bn}, {@code ca_gst_hst}, {@code
         * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code cd_nif}, {@code
         * ch_uid}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code co_nit}, {@code cr_tin},
         * {@code de_stn}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code
         * eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code gn_nif}, {@code
         * hk_br}, {@code hr_oib}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst},
         * {@code is_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code
         * kh_tin}, {@code kr_brn}, {@code kz_bin}, {@code li_uid}, {@code li_vat}, {@code ma_vat},
         * {@code md_vat}, {@code me_pib}, {@code mk_vat}, {@code mr_nif}, {@code mx_rfc}, {@code
         * my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat}, {@code no_voec},
         * {@code np_pan}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin}, {@code
         * ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst},
         * {@code sg_uen}, {@code si_tin}, {@code sn_ninea}, {@code sr_fin}, {@code sv_nit}, {@code
         * th_vat}, {@code tj_tin}, {@code tr_tin}, {@code tw_vat}, {@code tz_vat}, {@code ua_vat},
         * {@code ug_tin}, {@code us_ein}, {@code uy_ruc}, {@code uz_tin}, {@code uz_vat}, {@code
         * ve_rif}, {@code vn_tin}, {@code za_vat}, {@code zm_tin}, or {@code zw_tin}
         */
        public Builder setType(InvoiceUpcomingLinesListParams.CustomerDetails.TaxId.Type type) {
          this.type = type;
          return this;
        }

        /** <strong>Required.</strong> Value of the tax ID. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ad_nrt")
        AD_NRT("ad_nrt"),

        @SerializedName("ae_trn")
        AE_TRN("ae_trn"),

        @SerializedName("am_tin")
        AM_TIN("am_tin"),

        @SerializedName("ao_tin")
        AO_TIN("ao_tin"),

        @SerializedName("ar_cuit")
        AR_CUIT("ar_cuit"),

        @SerializedName("au_abn")
        AU_ABN("au_abn"),

        @SerializedName("au_arn")
        AU_ARN("au_arn"),

        @SerializedName("ba_tin")
        BA_TIN("ba_tin"),

        @SerializedName("bb_tin")
        BB_TIN("bb_tin"),

        @SerializedName("bg_uic")
        BG_UIC("bg_uic"),

        @SerializedName("bh_vat")
        BH_VAT("bh_vat"),

        @SerializedName("bo_tin")
        BO_TIN("bo_tin"),

        @SerializedName("br_cnpj")
        BR_CNPJ("br_cnpj"),

        @SerializedName("br_cpf")
        BR_CPF("br_cpf"),

        @SerializedName("bs_tin")
        BS_TIN("bs_tin"),

        @SerializedName("by_tin")
        BY_TIN("by_tin"),

        @SerializedName("ca_bn")
        CA_BN("ca_bn"),

        @SerializedName("ca_gst_hst")
        CA_GST_HST("ca_gst_hst"),

        @SerializedName("ca_pst_bc")
        CA_PST_BC("ca_pst_bc"),

        @SerializedName("ca_pst_mb")
        CA_PST_MB("ca_pst_mb"),

        @SerializedName("ca_pst_sk")
        CA_PST_SK("ca_pst_sk"),

        @SerializedName("ca_qst")
        CA_QST("ca_qst"),

        @SerializedName("cd_nif")
        CD_NIF("cd_nif"),

        @SerializedName("ch_uid")
        CH_UID("ch_uid"),

        @SerializedName("ch_vat")
        CH_VAT("ch_vat"),

        @SerializedName("cl_tin")
        CL_TIN("cl_tin"),

        @SerializedName("cn_tin")
        CN_TIN("cn_tin"),

        @SerializedName("co_nit")
        CO_NIT("co_nit"),

        @SerializedName("cr_tin")
        CR_TIN("cr_tin"),

        @SerializedName("de_stn")
        DE_STN("de_stn"),

        @SerializedName("do_rcn")
        DO_RCN("do_rcn"),

        @SerializedName("ec_ruc")
        EC_RUC("ec_ruc"),

        @SerializedName("eg_tin")
        EG_TIN("eg_tin"),

        @SerializedName("es_cif")
        ES_CIF("es_cif"),

        @SerializedName("eu_oss_vat")
        EU_OSS_VAT("eu_oss_vat"),

        @SerializedName("eu_vat")
        EU_VAT("eu_vat"),

        @SerializedName("gb_vat")
        GB_VAT("gb_vat"),

        @SerializedName("ge_vat")
        GE_VAT("ge_vat"),

        @SerializedName("gn_nif")
        GN_NIF("gn_nif"),

        @SerializedName("hk_br")
        HK_BR("hk_br"),

        @SerializedName("hr_oib")
        HR_OIB("hr_oib"),

        @SerializedName("hu_tin")
        HU_TIN("hu_tin"),

        @SerializedName("id_npwp")
        ID_NPWP("id_npwp"),

        @SerializedName("il_vat")
        IL_VAT("il_vat"),

        @SerializedName("in_gst")
        IN_GST("in_gst"),

        @SerializedName("is_vat")
        IS_VAT("is_vat"),

        @SerializedName("jp_cn")
        JP_CN("jp_cn"),

        @SerializedName("jp_rn")
        JP_RN("jp_rn"),

        @SerializedName("jp_trn")
        JP_TRN("jp_trn"),

        @SerializedName("ke_pin")
        KE_PIN("ke_pin"),

        @SerializedName("kh_tin")
        KH_TIN("kh_tin"),

        @SerializedName("kr_brn")
        KR_BRN("kr_brn"),

        @SerializedName("kz_bin")
        KZ_BIN("kz_bin"),

        @SerializedName("li_uid")
        LI_UID("li_uid"),

        @SerializedName("li_vat")
        LI_VAT("li_vat"),

        @SerializedName("ma_vat")
        MA_VAT("ma_vat"),

        @SerializedName("md_vat")
        MD_VAT("md_vat"),

        @SerializedName("me_pib")
        ME_PIB("me_pib"),

        @SerializedName("mk_vat")
        MK_VAT("mk_vat"),

        @SerializedName("mr_nif")
        MR_NIF("mr_nif"),

        @SerializedName("mx_rfc")
        MX_RFC("mx_rfc"),

        @SerializedName("my_frp")
        MY_FRP("my_frp"),

        @SerializedName("my_itn")
        MY_ITN("my_itn"),

        @SerializedName("my_sst")
        MY_SST("my_sst"),

        @SerializedName("ng_tin")
        NG_TIN("ng_tin"),

        @SerializedName("no_vat")
        NO_VAT("no_vat"),

        @SerializedName("no_voec")
        NO_VOEC("no_voec"),

        @SerializedName("np_pan")
        NP_PAN("np_pan"),

        @SerializedName("nz_gst")
        NZ_GST("nz_gst"),

        @SerializedName("om_vat")
        OM_VAT("om_vat"),

        @SerializedName("pe_ruc")
        PE_RUC("pe_ruc"),

        @SerializedName("ph_tin")
        PH_TIN("ph_tin"),

        @SerializedName("ro_tin")
        RO_TIN("ro_tin"),

        @SerializedName("rs_pib")
        RS_PIB("rs_pib"),

        @SerializedName("ru_inn")
        RU_INN("ru_inn"),

        @SerializedName("ru_kpp")
        RU_KPP("ru_kpp"),

        @SerializedName("sa_vat")
        SA_VAT("sa_vat"),

        @SerializedName("sg_gst")
        SG_GST("sg_gst"),

        @SerializedName("sg_uen")
        SG_UEN("sg_uen"),

        @SerializedName("si_tin")
        SI_TIN("si_tin"),

        @SerializedName("sn_ninea")
        SN_NINEA("sn_ninea"),

        @SerializedName("sr_fin")
        SR_FIN("sr_fin"),

        @SerializedName("sv_nit")
        SV_NIT("sv_nit"),

        @SerializedName("th_vat")
        TH_VAT("th_vat"),

        @SerializedName("tj_tin")
        TJ_TIN("tj_tin"),

        @SerializedName("tr_tin")
        TR_TIN("tr_tin"),

        @SerializedName("tw_vat")
        TW_VAT("tw_vat"),

        @SerializedName("tz_vat")
        TZ_VAT("tz_vat"),

        @SerializedName("ua_vat")
        UA_VAT("ua_vat"),

        @SerializedName("ug_tin")
        UG_TIN("ug_tin"),

        @SerializedName("us_ein")
        US_EIN("us_ein"),

        @SerializedName("uy_ruc")
        UY_RUC("uy_ruc"),

        @SerializedName("uz_tin")
        UZ_TIN("uz_tin"),

        @SerializedName("uz_vat")
        UZ_VAT("uz_vat"),

        @SerializedName("ve_rif")
        VE_RIF("ve_rif"),

        @SerializedName("vn_tin")
        VN_TIN("vn_tin"),

        @SerializedName("za_vat")
        ZA_VAT("za_vat"),

        @SerializedName("zm_tin")
        ZM_TIN("zm_tin"),

        @SerializedName("zw_tin")
        ZW_TIN("zw_tin");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum TaxExempt implements ApiRequestParams.EnumParam {
      @SerializedName("exempt")
      EXEMPT("exempt"),

      @SerializedName("none")
      NONE("none"),

      @SerializedName("reverse")
      REVERSE("reverse");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxExempt(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

    /** Details to determine how long the discount should be applied for. */
    @SerializedName("discount_end")
    DiscountEnd discountEnd;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    String promotionCode;

    private Discount(
        String coupon,
        String discount,
        DiscountEnd discountEnd,
        Map<String, Object> extraParams,
        String promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.discountEnd = discountEnd;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private String discount;

      private DiscountEnd discountEnd;

      private Map<String, Object> extraParams;

      private String promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.Discount build() {
        return new InvoiceUpcomingLinesListParams.Discount(
            this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** Details to determine how long the discount should be applied for. */
      public Builder setDiscountEnd(
          InvoiceUpcomingLinesListParams.Discount.DiscountEnd discountEnd) {
        this.discountEnd = discountEnd;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.Discount#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.Discount#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }

    @Getter
    public static class DiscountEnd {
      /** Time span for the redeemed discount. */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A precise Unix timestamp for the discount to end. Must be in the future. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> The type of calculation made to determine when the discount
       * ends.
       */
      @SerializedName("type")
      Type type;

      private DiscountEnd(
          Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.Discount.DiscountEnd build() {
          return new InvoiceUpcomingLinesListParams.Discount.DiscountEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the redeemed discount. */
        public Builder setDuration(
            InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.Discount.DiscountEnd#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.Discount.DiscountEnd#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        public Builder setType(InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Duration {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
         * Stripe multiplies this by the interval type to get the overall duration.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration build() {
            return new InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration#extraParams} for the field
           * documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              InvoiceUpcomingLinesListParams.Discount.DiscountEnd.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class InvoiceItem {
    /** The integer amount in cents (or local equivalent) of previewed invoice item. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>. Only applicable to new invoice items.
     */
    @SerializedName("currency")
    String currency;

    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in
     * the invoice for easy tracking.
     */
    @SerializedName("description")
    String description;

    /**
     * Explicitly controls whether discounts apply to this invoice item. Defaults to true, except
     * for negative invoice items.
     */
    @SerializedName("discountable")
    Boolean discountable;

    /** The coupons to redeem into discounts for the invoice item in the preview. */
    @SerializedName("discounts")
    Object discounts;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The ID of the invoice item to update in preview. If not specified, a new invoice item will be
     * added to the preview of the upcoming invoice.
     */
    @SerializedName("invoiceitem")
    String invoiceitem;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /**
     * The period associated with this invoice item. When set to different values, the period will
     * be rendered on the invoice. If you have <a
     * href="https://stripe.com/docs/revenue-recognition">Stripe Revenue Recognition</a> enabled,
     * the period will be used to recognize and defer revenue. See the <a
     * href="https://stripe.com/docs/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
     * Recognition documentation</a> for details.
     */
    @SerializedName("period")
    Period period;

    /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
    @SerializedName("price")
    String price;

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /** Non-negative integer. The quantity of units for the invoice item. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * Only required if a <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
     * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price is
     * considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
     * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
     * exclusive}, it cannot be changed.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
    @SerializedName("tax_code")
    Object taxCode;

    /**
     * The tax rates that apply to the item. When set, any {@code default_tax_rates} do not apply to
     * this item.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    /**
     * The integer unit amount in cents (or local equivalent) of the charge to be applied to the
     * upcoming invoice. This unit_amount will be multiplied by the quantity to get the full amount.
     * If you want to apply a credit to the customer's account, pass a negative unit_amount.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent) with
     * at most 12 decimal places. Only one of {@code unit_amount} and {@code unit_amount_decimal}
     * can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    private InvoiceItem(
        Long amount,
        String currency,
        String description,
        Boolean discountable,
        Object discounts,
        Map<String, Object> extraParams,
        String invoiceitem,
        Object metadata,
        Period period,
        String price,
        PriceData priceData,
        Long quantity,
        TaxBehavior taxBehavior,
        Object taxCode,
        Object taxRates,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
      this.amount = amount;
      this.currency = currency;
      this.description = description;
      this.discountable = discountable;
      this.discounts = discounts;
      this.extraParams = extraParams;
      this.invoiceitem = invoiceitem;
      this.metadata = metadata;
      this.period = period;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
      this.taxBehavior = taxBehavior;
      this.taxCode = taxCode;
      this.taxRates = taxRates;
      this.unitAmount = unitAmount;
      this.unitAmountDecimal = unitAmountDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private String description;

      private Boolean discountable;

      private Object discounts;

      private Map<String, Object> extraParams;

      private String invoiceitem;

      private Object metadata;

      private Period period;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private TaxBehavior taxBehavior;

      private Object taxCode;

      private Object taxRates;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.InvoiceItem build() {
        return new InvoiceUpcomingLinesListParams.InvoiceItem(
            this.amount,
            this.currency,
            this.description,
            this.discountable,
            this.discounts,
            this.extraParams,
            this.invoiceitem,
            this.metadata,
            this.period,
            this.price,
            this.priceData,
            this.quantity,
            this.taxBehavior,
            this.taxCode,
            this.taxRates,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /** The integer amount in cents (or local equivalent) of previewed invoice item. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>. Only applicable to new invoice items.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * An arbitrary string which you can attach to the invoice item. The description is displayed
       * in the invoice for easy tracking.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Explicitly controls whether discounts apply to this invoice item. Defaults to true, except
       * for negative invoice items.
       */
      public Builder setDiscountable(Boolean discountable) {
        this.discountable = discountable;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(InvoiceUpcomingLinesListParams.InvoiceItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<InvoiceUpcomingLinesListParams.InvoiceItem.Discount>();
        }
        ((List<InvoiceUpcomingLinesListParams.InvoiceItem.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(
          List<InvoiceUpcomingLinesListParams.InvoiceItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<InvoiceUpcomingLinesListParams.InvoiceItem.Discount>();
        }
        ((List<InvoiceUpcomingLinesListParams.InvoiceItem.Discount>) this.discounts)
            .addAll(elements);
        return this;
      }

      /** The coupons to redeem into discounts for the invoice item in the preview. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The coupons to redeem into discounts for the invoice item in the preview. */
      public Builder setDiscounts(
          List<InvoiceUpcomingLinesListParams.InvoiceItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.InvoiceItem#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The ID of the invoice item to update in preview. If not specified, a new invoice item will
       * be added to the preview of the upcoming invoice.
       */
      public Builder setInvoiceitem(String invoiceitem) {
        this.invoiceitem = invoiceitem;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.InvoiceItem#metadata} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).putAll(map);
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * The period associated with this invoice item. When set to different values, the period will
       * be rendered on the invoice. If you have <a
       * href="https://stripe.com/docs/revenue-recognition">Stripe Revenue Recognition</a> enabled,
       * the period will be used to recognize and defer revenue. See the <a
       * href="https://stripe.com/docs/revenue-recognition/methodology/subscriptions-and-invoicing">Revenue
       * Recognition documentation</a> for details.
       */
      public Builder setPeriod(InvoiceUpcomingLinesListParams.InvoiceItem.Period period) {
        this.period = period;
        return this;
      }

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(InvoiceUpcomingLinesListParams.InvoiceItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /** Non-negative integer. The quantity of units for the invoice item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      public Builder setTaxBehavior(
          InvoiceUpcomingLinesListParams.InvoiceItem.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      public Builder setTaxCode(EmptyParam taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addTaxRate(String element) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.InvoiceItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      /**
       * The tax rates that apply to the item. When set, any {@code default_tax_rates} do not apply
       * to this item.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The tax rates that apply to the item. When set, any {@code default_tax_rates} do not apply
       * to this item.
       */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The integer unit amount in cents (or local equivalent) of the charge to be applied to the
       * upcoming invoice. This unit_amount will be multiplied by the quantity to get the full
       * amount. If you want to apply a credit to the customer's account, pass a negative
       * unit_amount.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      String coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      String discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the promotion code to create a new discount for. */
      @SerializedName("promotion_code")
      String promotionCode;

      private Discount(
          String coupon,
          String discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          String promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String coupon;

        private String discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private String promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.InvoiceItem.Discount build() {
          return new InvoiceUpcomingLinesListParams.InvoiceItem.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(
            InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.Discount#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.Discount#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(String promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** Time span for the redeemed discount. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        @SerializedName("type")
        Type type;

        private DiscountEnd(
            Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd build() {
            return new InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration
                build() {
              return new InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                InvoiceUpcomingLinesListParams.InvoiceItem.Discount.DiscountEnd.Duration.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("day")
            DAY("day"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week"),

            @SerializedName("year")
            YEAR("year");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class Period {
      /**
       * <strong>Required.</strong> The end of the period, which must be greater than or equal to
       * the start. This value is inclusive.
       */
      @SerializedName("end")
      Long end;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The start of the period. This value is inclusive. */
      @SerializedName("start")
      Long start;

      private Period(Long end, Map<String, Object> extraParams, Long start) {
        this.end = end;
        this.extraParams = extraParams;
        this.start = start;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long end;

        private Map<String, Object> extraParams;

        private Long start;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.InvoiceItem.Period build() {
          return new InvoiceUpcomingLinesListParams.InvoiceItem.Period(
              this.end, this.extraParams, this.start);
        }

        /**
         * <strong>Required.</strong> The end of the period, which must be greater than or equal to
         * the start. This value is inclusive.
         */
        public Builder setEnd(Long end) {
          this.end = end;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.Period#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.Period#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The start of the period. This value is inclusive. */
        public Builder setStart(Long start) {
          this.start = start;
          return this;
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      @SerializedName("product")
      String product;

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          TaxBehavior taxBehavior,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String currency;

        private Map<String, Object> extraParams;

        private String product;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.InvoiceItem.PriceData build() {
          return new InvoiceUpcomingLinesListParams.InvoiceItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.PriceData#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.InvoiceItem.PriceData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            InvoiceUpcomingLinesListParams.InvoiceItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive"),

      @SerializedName("unspecified")
      UNSPECIFIED("unspecified");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Issuer {
    /** The connected account being referenced when {@code type} is {@code account}. */
    @SerializedName("account")
    String account;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Type of the account referenced in the request. */
    @SerializedName("type")
    Type type;

    private Issuer(String account, Map<String, Object> extraParams, Type type) {
      this.account = account;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.Issuer build() {
        return new InvoiceUpcomingLinesListParams.Issuer(this.account, this.extraParams, this.type);
      }

      /** The connected account being referenced when {@code type} is {@code account}. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.Issuer#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.Issuer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      public Builder setType(InvoiceUpcomingLinesListParams.Issuer.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("account")
      ACCOUNT("account"),

      @SerializedName("self")
      SELF("self");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class ScheduleDetails {
    /** Changes to apply to the phases of the subscription schedule, in the order provided. */
    @SerializedName("amendments")
    List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment> amendments;

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
     * all phases within the current billing cycle up front.
     */
    @SerializedName("billing_behavior")
    BillingBehavior billingBehavior;

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends. Possible
     * values are {@code release} or {@code cancel} with the default being {@code release}. {@code
     * release} will end the subscription schedule and keep the underlying subscription running.
     * {@code cancel} will end the subscription schedule and cancel the underlying subscription.
     */
    @SerializedName("end_behavior")
    EndBehavior endBehavior;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * List representing phases of the subscription schedule. Each phase can be customized to have
     * different durations, plans, and coupons. If there are multiple phases, the {@code end_date}
     * of one phase will always equal the {@code start_date} of the next phase.
     */
    @SerializedName("phases")
    List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase> phases;

    /** Provide any time periods to bill in advance. */
    @SerializedName("prebilling")
    Object prebilling;

    /**
     * In cases where the {@code schedule_details} params update the currently active phase,
     * specifies if and how to prorate at the time of the request.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    private ScheduleDetails(
        List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment> amendments,
        BillingBehavior billingBehavior,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase> phases,
        Object prebilling,
        ProrationBehavior prorationBehavior) {
      this.amendments = amendments;
      this.billingBehavior = billingBehavior;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.phases = phases;
      this.prebilling = prebilling;
      this.prorationBehavior = prorationBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment> amendments;

      private BillingBehavior billingBehavior;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase> phases;

      private Object prebilling;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.ScheduleDetails build() {
        return new InvoiceUpcomingLinesListParams.ScheduleDetails(
            this.amendments,
            this.billingBehavior,
            this.endBehavior,
            this.extraParams,
            this.phases,
            this.prebilling,
            this.prorationBehavior);
      }

      /**
       * Add an element to `amendments` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#amendments} for the field documentation.
       */
      public Builder addAmendment(
          InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment element) {
        if (this.amendments == null) {
          this.amendments = new ArrayList<>();
        }
        this.amendments.add(element);
        return this;
      }

      /**
       * Add all elements to `amendments` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#amendments} for the field documentation.
       */
      public Builder addAllAmendment(
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment> elements) {
        if (this.amendments == null) {
          this.amendments = new ArrayList<>();
        }
        this.amendments.addAll(elements);
        return this;
      }

      /**
       * Configures when the subscription schedule generates prorations for phase transitions.
       * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
       * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
       * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
       * all phases within the current billing cycle up front.
       */
      public Builder setBillingBehavior(
          InvoiceUpcomingLinesListParams.ScheduleDetails.BillingBehavior billingBehavior) {
        this.billingBehavior = billingBehavior;
        return this;
      }

      /**
       * Behavior of the subscription schedule and underlying subscription when it ends. Possible
       * values are {@code release} or {@code cancel} with the default being {@code release}. {@code
       * release} will end the subscription schedule and keep the underlying subscription running.
       * {@code cancel} will end the subscription schedule and cancel the underlying subscription.
       */
      public Builder setEndBehavior(
          InvoiceUpcomingLinesListParams.ScheduleDetails.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#phases} for the field documentation.
       */
      public Builder addPhase(InvoiceUpcomingLinesListParams.ScheduleDetails.Phase element) {
        if (this.phases == null) {
          this.phases = new ArrayList<>();
        }
        this.phases.add(element);
        return this;
      }

      /**
       * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#phases} for the field documentation.
       */
      public Builder addAllPhase(
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase> elements) {
        if (this.phases == null) {
          this.phases = new ArrayList<>();
        }
        this.phases.addAll(elements);
        return this;
      }

      /**
       * Add an element to `prebilling` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#prebilling} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addPrebilling(
          InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling element) {
        if (this.prebilling == null || this.prebilling instanceof EmptyParam) {
          this.prebilling =
              new ArrayList<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling>();
        }
        ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling>) this.prebilling)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `prebilling` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.ScheduleDetails#prebilling} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllPrebilling(
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling> elements) {
        if (this.prebilling == null || this.prebilling instanceof EmptyParam) {
          this.prebilling =
              new ArrayList<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling>();
        }
        ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling>) this.prebilling)
            .addAll(elements);
        return this;
      }

      /** Provide any time periods to bill in advance. */
      public Builder setPrebilling(EmptyParam prebilling) {
        this.prebilling = prebilling;
        return this;
      }

      /** Provide any time periods to bill in advance. */
      public Builder setPrebilling(
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling> prebilling) {
        this.prebilling = prebilling;
        return this;
      }

      /**
       * In cases where the {@code schedule_details} params update the currently active phase,
       * specifies if and how to prorate at the time of the request.
       */
      public Builder setProrationBehavior(
          InvoiceUpcomingLinesListParams.ScheduleDetails.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }
    }

    @Getter
    public static class Amendment {
      /**
       * Details to identify the end of the time range modified by the proposed change. If not
       * supplied, the amendment is considered a point-in-time operation that only affects the exact
       * timestamp at {@code amendment_start}, and a restricted set of attributes is supported on
       * the amendment.
       */
      @SerializedName("amendment_end")
      AmendmentEnd amendmentEnd;

      /**
       * <strong>Required.</strong> Details to identify the earliest timestamp where the proposed
       * change should take effect.
       */
      @SerializedName("amendment_start")
      AmendmentStart amendmentStart;

      /**
       * For point-in-time amendments (having no {@code amendment_end}), this attribute lets you set
       * or remove whether the subscription's billing cycle anchor is reset at the {@code
       * amendment_start} timestamp.For time-span based amendments (having both {@code
       * amendment_start} and {@code amendment_end}), the only value valid is {@code automatic},
       * which removes any previously configured billing cycle anchor resets scheduled to occur
       * during the window of time spanned by the amendment.
       */
      @SerializedName("billing_cycle_anchor")
      BillingCycleAnchor billingCycleAnchor;

      /**
       * Changes to the coupons being redeemed or discounts being applied during the amendment time
       * span.
       */
      @SerializedName("discount_actions")
      List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction> discountActions;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Changes to the subscription items during the amendment time span. */
      @SerializedName("item_actions")
      List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction> itemActions;

      /** Instructions for how to modify phase metadata. */
      @SerializedName("metadata_actions")
      List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction> metadataActions;

      /**
       * Changes to how Stripe handles prorations during the amendment time span. Affects if and how
       * prorations are created when a future phase starts. In cases where the amendment changes the
       * currently active phase, it is used to determine whether or how to prorate now, at the time
       * of the request. Also supported as a point-in-time operation when {@code amendment_end} is
       * {@code null}.
       */
      @SerializedName("proration_behavior")
      ProrationBehavior prorationBehavior;

      /**
       * Defines how to pause collection for the underlying subscription throughout the duration of
       * the amendment.
       */
      @SerializedName("set_pause_collection")
      SetPauseCollection setPauseCollection;

      /**
       * Ends the subscription schedule early as dictated by either the accompanying amendment's
       * start or end.
       */
      @SerializedName("set_schedule_end")
      SetScheduleEnd setScheduleEnd;

      /** Settings related to subscription trials. */
      @SerializedName("trial_settings")
      TrialSettings trialSettings;

      private Amendment(
          AmendmentEnd amendmentEnd,
          AmendmentStart amendmentStart,
          BillingCycleAnchor billingCycleAnchor,
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction>
              discountActions,
          Map<String, Object> extraParams,
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction> itemActions,
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction>
              metadataActions,
          ProrationBehavior prorationBehavior,
          SetPauseCollection setPauseCollection,
          SetScheduleEnd setScheduleEnd,
          TrialSettings trialSettings) {
        this.amendmentEnd = amendmentEnd;
        this.amendmentStart = amendmentStart;
        this.billingCycleAnchor = billingCycleAnchor;
        this.discountActions = discountActions;
        this.extraParams = extraParams;
        this.itemActions = itemActions;
        this.metadataActions = metadataActions;
        this.prorationBehavior = prorationBehavior;
        this.setPauseCollection = setPauseCollection;
        this.setScheduleEnd = setScheduleEnd;
        this.trialSettings = trialSettings;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AmendmentEnd amendmentEnd;

        private AmendmentStart amendmentStart;

        private BillingCycleAnchor billingCycleAnchor;

        private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction>
            discountActions;

        private Map<String, Object> extraParams;

        private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction>
            itemActions;

        private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction>
            metadataActions;

        private ProrationBehavior prorationBehavior;

        private SetPauseCollection setPauseCollection;

        private SetScheduleEnd setScheduleEnd;

        private TrialSettings trialSettings;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment build() {
          return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment(
              this.amendmentEnd,
              this.amendmentStart,
              this.billingCycleAnchor,
              this.discountActions,
              this.extraParams,
              this.itemActions,
              this.metadataActions,
              this.prorationBehavior,
              this.setPauseCollection,
              this.setScheduleEnd,
              this.trialSettings);
        }

        /**
         * Details to identify the end of the time range modified by the proposed change. If not
         * supplied, the amendment is considered a point-in-time operation that only affects the
         * exact timestamp at {@code amendment_start}, and a restricted set of attributes is
         * supported on the amendment.
         */
        public Builder setAmendmentEnd(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd amendmentEnd) {
          this.amendmentEnd = amendmentEnd;
          return this;
        }

        /**
         * <strong>Required.</strong> Details to identify the earliest timestamp where the proposed
         * change should take effect.
         */
        public Builder setAmendmentStart(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart
                amendmentStart) {
          this.amendmentStart = amendmentStart;
          return this;
        }

        /**
         * For point-in-time amendments (having no {@code amendment_end}), this attribute lets you
         * set or remove whether the subscription's billing cycle anchor is reset at the {@code
         * amendment_start} timestamp.For time-span based amendments (having both {@code
         * amendment_start} and {@code amendment_end}), the only value valid is {@code automatic},
         * which removes any previously configured billing cycle anchor resets scheduled to occur
         * during the window of time spanned by the amendment.
         */
        public Builder setBillingCycleAnchor(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.BillingCycleAnchor
                billingCycleAnchor) {
          this.billingCycleAnchor = billingCycleAnchor;
          return this;
        }

        /**
         * Add an element to `discountActions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#discountActions} for
         * the field documentation.
         */
        public Builder addDiscountAction(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction element) {
          if (this.discountActions == null) {
            this.discountActions = new ArrayList<>();
          }
          this.discountActions.add(element);
          return this;
        }

        /**
         * Add all elements to `discountActions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#discountActions} for
         * the field documentation.
         */
        public Builder addAllDiscountAction(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction>
                elements) {
          if (this.discountActions == null) {
            this.discountActions = new ArrayList<>();
          }
          this.discountActions.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `itemActions` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#itemActions} for the field
         * documentation.
         */
        public Builder addItemAction(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction element) {
          if (this.itemActions == null) {
            this.itemActions = new ArrayList<>();
          }
          this.itemActions.add(element);
          return this;
        }

        /**
         * Add all elements to `itemActions` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#itemActions} for the field
         * documentation.
         */
        public Builder addAllItemAction(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction> elements) {
          if (this.itemActions == null) {
            this.itemActions = new ArrayList<>();
          }
          this.itemActions.addAll(elements);
          return this;
        }

        /**
         * Add an element to `metadataActions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#metadataActions} for
         * the field documentation.
         */
        public Builder addMetadataAction(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction element) {
          if (this.metadataActions == null) {
            this.metadataActions = new ArrayList<>();
          }
          this.metadataActions.add(element);
          return this;
        }

        /**
         * Add all elements to `metadataActions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment#metadataActions} for
         * the field documentation.
         */
        public Builder addAllMetadataAction(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction>
                elements) {
          if (this.metadataActions == null) {
            this.metadataActions = new ArrayList<>();
          }
          this.metadataActions.addAll(elements);
          return this;
        }

        /**
         * Changes to how Stripe handles prorations during the amendment time span. Affects if and
         * how prorations are created when a future phase starts. In cases where the amendment
         * changes the currently active phase, it is used to determine whether or how to prorate
         * now, at the time of the request. Also supported as a point-in-time operation when {@code
         * amendment_end} is {@code null}.
         */
        public Builder setProrationBehavior(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ProrationBehavior
                prorationBehavior) {
          this.prorationBehavior = prorationBehavior;
          return this;
        }

        /**
         * Defines how to pause collection for the underlying subscription throughout the duration
         * of the amendment.
         */
        public Builder setSetPauseCollection(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection
                setPauseCollection) {
          this.setPauseCollection = setPauseCollection;
          return this;
        }

        /**
         * Ends the subscription schedule early as dictated by either the accompanying amendment's
         * start or end.
         */
        public Builder setSetScheduleEnd(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetScheduleEnd
                setScheduleEnd) {
          this.setScheduleEnd = setScheduleEnd;
          return this;
        }

        /** Settings related to subscription trials. */
        public Builder setTrialSettings(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings trialSettings) {
          this.trialSettings = trialSettings;
          return this;
        }
      }

      @Getter
      public static class AmendmentEnd {
        /** Use the {@code end} time of a given discount. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /** Time span for the amendment starting from the {@code amendment_start}. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * A precise Unix timestamp for the amendment to end. Must be after the {@code
         * amendment_start}.
         */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_end}.
         */
        @SerializedName("type")
        Type type;

        private AmendmentEnd(
            DiscountEnd discountEnd,
            Duration duration,
            Map<String, Object> extraParams,
            Long timestamp,
            Type type) {
          this.discountEnd = discountEnd;
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DiscountEnd discountEnd;

          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd(
                this.discountEnd, this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Use the {@code end} time of a given discount. */
          public Builder setDiscountEnd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /** Time span for the amendment starting from the {@code amendment_start}. */
          public Builder setDuration(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * A precise Unix timestamp for the amendment to end. Must be after the {@code
           * amendment_start}.
           */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_end}.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class DiscountEnd {
          /** <strong>Required.</strong> The ID of a specific discount. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private DiscountEnd(String discount, Map<String, Object> extraParams) {
            this.discount = discount;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String discount;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.DiscountEnd
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd
                  .DiscountEnd(this.discount, this.extraParams);
            }

            /** <strong>Required.</strong> The ID of a specific discount. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }
          }
        }

        @Getter
        public static class Duration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Duration
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentEnd.Duration
                        .Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("day")
            DAY("day"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week"),

            @SerializedName("year")
            YEAR("year");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("discount_end")
          DISCOUNT_END("discount_end"),

          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("schedule_end")
          SCHEDULE_END("schedule_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp"),

          @SerializedName("trial_end")
          TRIAL_END("trial_end"),

          @SerializedName("trial_start")
          TRIAL_START("trial_start"),

          @SerializedName("upcoming_invoice")
          UPCOMING_INVOICE("upcoming_invoice");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class AmendmentStart {
        /**
         * Details of another amendment in the same array, immediately after which this amendment
         * should begin.
         */
        @SerializedName("amendment_end")
        AmendmentEnd amendmentEnd;

        /** Use the {@code end} time of a given discount. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the amendment to start. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> Select one of three ways to pass the {@code amendment_start}.
         */
        @SerializedName("type")
        Type type;

        private AmendmentStart(
            AmendmentEnd amendmentEnd,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Long timestamp,
            Type type) {
          this.amendmentEnd = amendmentEnd;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AmendmentEnd amendmentEnd;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart(
                this.amendmentEnd, this.discountEnd, this.extraParams, this.timestamp, this.type);
          }

          /**
           * Details of another amendment in the same array, immediately after which this amendment
           * should begin.
           */
          public Builder setAmendmentEnd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.AmendmentEnd
                  amendmentEnd) {
            this.amendmentEnd = amendmentEnd;
            return this;
          }

          /** Use the {@code end} time of a given discount. */
          public Builder setDiscountEnd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the amendment to start. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> Select one of three ways to pass the {@code
           * amendment_start}.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class AmendmentEnd {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> The position of the previous amendment in the {@code
           * amendments} array after which this amendment should begin. Indexes start from 0 and
           * must be less than the index of the current amendment in the array.
           */
          @SerializedName("index")
          Long index;

          private AmendmentEnd(Map<String, Object> extraParams, Long index) {
            this.extraParams = extraParams;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart
                    .AmendmentEnd
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart
                  .AmendmentEnd(this.extraParams, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.AmendmentEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.AmendmentEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> The position of the previous amendment in the {@code
             * amendments} array after which this amendment should begin. Indexes start from 0 and
             * must be less than the index of the current amendment in the array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        @Getter
        public static class DiscountEnd {
          /** <strong>Required.</strong> The ID of a specific discount. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private DiscountEnd(String discount, Map<String, Object> extraParams) {
            this.discount = discount;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String discount;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart
                    .DiscountEnd
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart
                  .DiscountEnd(this.discount, this.extraParams);
            }

            /** <strong>Required.</strong> The ID of a specific discount. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.AmendmentStart.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("amendment_end")
          AMENDMENT_END("amendment_end"),

          @SerializedName("discount_end")
          DISCOUNT_END("discount_end"),

          @SerializedName("now")
          NOW("now"),

          @SerializedName("schedule_end")
          SCHEDULE_END("schedule_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp"),

          @SerializedName("trial_end")
          TRIAL_END("trial_end"),

          @SerializedName("trial_start")
          TRIAL_START("trial_start"),

          @SerializedName("upcoming_invoice")
          UPCOMING_INVOICE("upcoming_invoice");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class DiscountAction {
        /** Details of the discount to add. */
        @SerializedName("add")
        Add add;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of the discount to remove. */
        @SerializedName("remove")
        Remove remove;

        /** Details of the discount to replace the existing discounts with. */
        @SerializedName("set")
        Set set;

        /** <strong>Required.</strong> Determines the type of discount action. */
        @SerializedName("type")
        Type type;

        private DiscountAction(
            Add add, Map<String, Object> extraParams, Remove remove, Set set, Type type) {
          this.add = add;
          this.extraParams = extraParams;
          this.remove = remove;
          this.set = set;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Add add;

          private Map<String, Object> extraParams;

          private Remove remove;

          private Set set;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction(
                this.add, this.extraParams, this.remove, this.set, this.type);
          }

          /** Details of the discount to add. */
          public Builder setAdd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add add) {
            this.add = add;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of the discount to remove. */
          public Builder setRemove(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Remove
                  remove) {
            this.remove = remove;
            return this;
          }

          /** Details of the discount to replace the existing discounts with. */
          public Builder setSet(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Set set) {
            this.set = set;
            return this;
          }

          /** <strong>Required.</strong> Determines the type of discount action. */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Add {
          /** The coupon code to redeem. */
          @SerializedName("coupon")
          String coupon;

          /** An ID of an existing discount for a coupon that was already redeemed. */
          @SerializedName("discount")
          String discount;

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * The index, starting at 0, at which to position the new discount. When not supplied,
           * Stripe defaults to appending the discount to the end of the {@code discounts} array.
           */
          @SerializedName("index")
          Long index;

          /** The promotion code to redeem. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Add(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              Long index,
              String promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.index = index;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private Long index;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction
                  .Add(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.index,
                  this.promotionCode);
            }

            /** The coupon code to redeem. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** An ID of an existing discount for a coupon that was already redeemed. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add
                        .DiscountEnd
                    discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * The index, starting at 0, at which to position the new discount. When not supplied,
             * Stripe defaults to appending the discount to the end of the {@code discounts} array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }

            /** The promotion code to redeem. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            @SerializedName("type")
            Type type;

            private DiscountEnd(Map<String, Object> extraParams, Type type) {
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add
                      .DiscountEnd
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction
                    .Add.DiscountEnd(this.extraParams, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              public Builder setType(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Add
                          .DiscountEnd.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("amendment_end")
              AMENDMENT_END("amendment_end");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class Remove {
          /** The coupon code to remove from the {@code discounts} array. */
          @SerializedName("coupon")
          String coupon;

          /** The ID of a discount to remove from the {@code discounts} array. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The ID of a promotion code to remove from the {@code discounts} array. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Remove(
              String coupon,
              String discount,
              Map<String, Object> extraParams,
              String promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Remove
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction
                  .Remove(this.coupon, this.discount, this.extraParams, this.promotionCode);
            }

            /** The coupon code to remove from the {@code discounts} array. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** The ID of a discount to remove from the {@code discounts} array. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Remove#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Remove#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The ID of a promotion code to remove from the {@code discounts} array. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }
        }

        @Getter
        public static class Set {
          /** The coupon code to replace the {@code discounts} array with. */
          @SerializedName("coupon")
          String coupon;

          /** An ID of an existing discount to replace the {@code discounts} array with. */
          @SerializedName("discount")
          String discount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** An ID of an existing promotion code to replace the {@code discounts} array with. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Set(
              String coupon,
              String discount,
              Map<String, Object> extraParams,
              String promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Set
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction
                  .Set(this.coupon, this.discount, this.extraParams, this.promotionCode);
            }

            /** The coupon code to replace the {@code discounts} array with. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** An ID of an existing discount to replace the {@code discounts} array with. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Set#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.DiscountAction.Set#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** An ID of an existing promotion code to replace the {@code discounts} array with. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("add")
          ADD("add"),

          @SerializedName("remove")
          REMOVE("remove"),

          @SerializedName("set")
          SET("set");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class ItemAction {
        /**
         * Details of the subscription item to add. If an item with the same {@code price} exists,
         * it will be replaced by this new item. Otherwise, it adds the new item.
         */
        @SerializedName("add")
        Add add;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of the subscription item to remove. */
        @SerializedName("remove")
        Remove remove;

        /**
         * Details of the subscription item to replace the existing items with. If an item with the
         * {@code set[price]} already exists, the {@code items} array is not cleared. Instead, all
         * of the other {@code set} properties that are passed in this request will replace the
         * existing values for the configuration item.
         */
        @SerializedName("set")
        Set set;

        /** <strong>Required.</strong> Determines the type of item action. */
        @SerializedName("type")
        Type type;

        private ItemAction(
            Add add, Map<String, Object> extraParams, Remove remove, Set set, Type type) {
          this.add = add;
          this.extraParams = extraParams;
          this.remove = remove;
          this.set = set;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Add add;

          private Map<String, Object> extraParams;

          private Remove remove;

          private Set set;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction(
                this.add, this.extraParams, this.remove, this.set, this.type);
          }

          /**
           * Details of the subscription item to add. If an item with the same {@code price} exists,
           * it will be replaced by this new item. Otherwise, it adds the new item.
           */
          public Builder setAdd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add add) {
            this.add = add;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of the subscription item to remove. */
          public Builder setRemove(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Remove remove) {
            this.remove = remove;
            return this;
          }

          /**
           * Details of the subscription item to replace the existing items with. If an item with
           * the {@code set[price]} already exists, the {@code items} array is not cleared. Instead,
           * all of the other {@code set} properties that are passed in this request will replace
           * the existing values for the configuration item.
           */
          public Builder setSet(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set set) {
            this.set = set;
            return this;
          }

          /** <strong>Required.</strong> Determines the type of item action. */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Add {
          /**
           * The discounts applied to the item. Subscription item discounts are applied before
           * subscription discounts.
           */
          @SerializedName("discounts")
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount>
              discounts;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
           * attach to an object. This can be useful for storing additional information about the
           * object in a structured format. Individual keys can be unset by posting an empty value
           * to them. All keys can be unset by posting an empty value to {@code metadata}.
           */
          @SerializedName("metadata")
          Map<String, String> metadata;

          /** <strong>Required.</strong> The ID of the price object. */
          @SerializedName("price")
          String price;

          /** Quantity for this item. */
          @SerializedName("quantity")
          Long quantity;

          /**
           * The tax rates that apply to this subscription item. When set, the {@code
           * default_tax_rates} on the subscription do not apply to this {@code subscription_item}.
           */
          @SerializedName("tax_rates")
          List<String> taxRates;

          /** Options that configure the trial on the subscription item. */
          @SerializedName("trial")
          Trial trial;

          private Add(
              List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount>
                  discounts,
              Map<String, Object> extraParams,
              Map<String, String> metadata,
              String price,
              Long quantity,
              List<String> taxRates,
              Trial trial) {
            this.discounts = discounts;
            this.extraParams = extraParams;
            this.metadata = metadata;
            this.price = price;
            this.quantity = quantity;
            this.taxRates = taxRates;
            this.trial = trial;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                        .Discount>
                discounts;

            private Map<String, Object> extraParams;

            private Map<String, String> metadata;

            private String price;

            private Long quantity;

            private List<String> taxRates;

            private Trial trial;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add(
                  this.discounts,
                  this.extraParams,
                  this.metadata,
                  this.price,
                  this.quantity,
                  this.taxRates,
                  this.trial);
            }

            /**
             * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#discounts}
             * for the field documentation.
             */
            public Builder addDiscount(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount
                    element) {
              if (this.discounts == null) {
                this.discounts = new ArrayList<>();
              }
              this.discounts.add(element);
              return this;
            }

            /**
             * Add all elements to `discounts` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#discounts}
             * for the field documentation.
             */
            public Builder addAllDiscount(
                List<
                        InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                            .Discount>
                    elements) {
              if (this.discounts == null) {
                this.discounts = new ArrayList<>();
              }
              this.discounts.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Add a key/value pair to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#metadata} for
             * the field documentation.
             */
            public Builder putMetadata(String key, String value) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#metadata} for
             * the field documentation.
             */
            public Builder putAllMetadata(Map<String, String> map) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the price object. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }

            /** Quantity for this item. */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }

            /**
             * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#taxRates} for
             * the field documentation.
             */
            public Builder addTaxRate(String element) {
              if (this.taxRates == null) {
                this.taxRates = new ArrayList<>();
              }
              this.taxRates.add(element);
              return this;
            }

            /**
             * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add#taxRates} for
             * the field documentation.
             */
            public Builder addAllTaxRate(List<String> elements) {
              if (this.taxRates == null) {
                this.taxRates = new ArrayList<>();
              }
              this.taxRates.addAll(elements);
              return this;
            }

            /** Options that configure the trial on the subscription item. */
            public Builder setTrial(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial
                    trial) {
              this.trial = trial;
              return this;
            }
          }

          @Getter
          public static class Discount {
            /** ID of the coupon to create a new discount for. */
            @SerializedName("coupon")
            String coupon;

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            @SerializedName("discount")
            String discount;

            /** Details to determine how long the discount should be applied for. */
            @SerializedName("discount_end")
            DiscountEnd discountEnd;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** ID of the promotion code to create a new discount for. */
            @SerializedName("promotion_code")
            String promotionCode;

            private Discount(
                String coupon,
                String discount,
                DiscountEnd discountEnd,
                Map<String, Object> extraParams,
                String promotionCode) {
              this.coupon = coupon;
              this.discount = discount;
              this.discountEnd = discountEnd;
              this.extraParams = extraParams;
              this.promotionCode = promotionCode;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String coupon;

              private String discount;

              private DiscountEnd discountEnd;

              private Map<String, Object> extraParams;

              private String promotionCode;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                      .Discount
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                    .Discount(
                    this.coupon,
                    this.discount,
                    this.discountEnd,
                    this.extraParams,
                    this.promotionCode);
              }

              /** ID of the coupon to create a new discount for. */
              public Builder setCoupon(String coupon) {
                this.coupon = coupon;
                return this;
              }

              /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
              public Builder setDiscount(String discount) {
                this.discount = discount;
                return this;
              }

              /** Details to determine how long the discount should be applied for. */
              public Builder setDiscountEnd(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount
                          .DiscountEnd
                      discountEnd) {
                this.discountEnd = discountEnd;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** ID of the promotion code to create a new discount for. */
              public Builder setPromotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
              }
            }

            @Getter
            public static class DiscountEnd {
              /** Time span for the redeemed discount. */
              @SerializedName("duration")
              Duration duration;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              @SerializedName("timestamp")
              Long timestamp;

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              @SerializedName("type")
              Type type;

              private DiscountEnd(
                  Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
                this.duration = duration;
                this.extraParams = extraParams;
                this.timestamp = timestamp;
                this.type = type;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Duration duration;

                private Map<String, Object> extraParams;

                private Long timestamp;

                private Type type;

                /** Finalize and obtain parameter instance from this builder. */
                public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                        .Discount.DiscountEnd
                    build() {
                  return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                      .Discount.DiscountEnd(
                      this.duration, this.extraParams, this.timestamp, this.type);
                }

                /** Time span for the redeemed discount. */
                public Builder setDuration(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount
                            .DiscountEnd.Duration
                        duration) {
                  this.duration = duration;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount.DiscountEnd#extraParams}
                 * for the field documentation.
                 */
                public Builder putExtraParam(String key, Object value) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.put(key, value);
                  return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount.DiscountEnd#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** A precise Unix timestamp for the discount to end. Must be in the future. */
                public Builder setTimestamp(Long timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The type of calculation made to determine when the
                 * discount ends.
                 */
                public Builder setType(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount
                            .DiscountEnd.Type
                        type) {
                  this.type = type;
                  return this;
                }
              }

              @Getter
              public static class Duration {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                @SerializedName("interval")
                Interval interval;

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
                 */
                @SerializedName("interval_count")
                Long intervalCount;

                private Duration(
                    Map<String, Object> extraParams, Interval interval, Long intervalCount) {
                  this.extraParams = extraParams;
                  this.interval = interval;
                  this.intervalCount = intervalCount;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private Interval interval;

                  private Long intervalCount;

                  /** Finalize and obtain parameter instance from this builder. */
                  public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                          .Discount.DiscountEnd.Duration
                      build() {
                    return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction
                        .Add.Discount.DiscountEnd.Duration(
                        this.extraParams, this.interval, this.intervalCount);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount.DiscountEnd.Duration#extraParams}
                   * for the field documentation.
                   */
                  public Builder putExtraParam(String key, Object value) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.put(key, value);
                    return this;
                  }

                  /**
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Discount.DiscountEnd.Duration#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /**
                   * <strong>Required.</strong> Specifies a type of interval unit. Either {@code
                   * day}, {@code week}, {@code month} or {@code year}.
                   */
                  public Builder setInterval(
                      InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                              .Discount.DiscountEnd.Duration.Interval
                          interval) {
                    this.interval = interval;
                    return this;
                  }

                  /**
                   * <strong>Required.</strong> The number of intervals, as an whole number greater
                   * than 0. Stripe multiplies this by the interval type to get the overall
                   * duration.
                   */
                  public Builder setIntervalCount(Long intervalCount) {
                    this.intervalCount = intervalCount;
                    return this;
                  }
                }

                public enum Interval implements ApiRequestParams.EnumParam {
                  @SerializedName("day")
                  DAY("day"),

                  @SerializedName("month")
                  MONTH("month"),

                  @SerializedName("week")
                  WEEK("week"),

                  @SerializedName("year")
                  YEAR("year");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  Interval(String value) {
                    this.value = value;
                  }
                }
              }

              public enum Type implements ApiRequestParams.EnumParam {
                @SerializedName("duration")
                DURATION("duration"),

                @SerializedName("timestamp")
                TIMESTAMP("timestamp");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Type(String value) {
                  this.value = value;
                }
              }
            }
          }

          @Getter
          public static class Trial {
            /**
             * List of price IDs which, if present on the subscription following a paid trial,
             * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
             */
            @SerializedName("converts_to")
            List<String> convertsTo;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> Determines the type of trial for this item. */
            @SerializedName("type")
            Type type;

            private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
              this.convertsTo = convertsTo;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private List<String> convertsTo;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add
                    .Trial(this.convertsTo, this.extraParams, this.type);
              }

              /**
               * Add an element to `convertsTo` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial#convertsTo}
               * for the field documentation.
               */
              public Builder addConvertsTo(String element) {
                if (this.convertsTo == null) {
                  this.convertsTo = new ArrayList<>();
                }
                this.convertsTo.add(element);
                return this;
              }

              /**
               * Add all elements to `convertsTo` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial#convertsTo}
               * for the field documentation.
               */
              public Builder addAllConvertsTo(List<String> elements) {
                if (this.convertsTo == null) {
                  this.convertsTo = new ArrayList<>();
                }
                this.convertsTo.addAll(elements);
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> Determines the type of trial for this item. */
              public Builder setType(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Add.Trial.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("free")
              FREE("free"),

              @SerializedName("paid")
              PAID("paid");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class Remove {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> ID of a price to remove. */
          @SerializedName("price")
          String price;

          private Remove(Map<String, Object> extraParams, String price) {
            this.extraParams = extraParams;
            this.price = price;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String price;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Remove
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Remove(
                  this.extraParams, this.price);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Remove#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Remove#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> ID of a price to remove. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }
          }
        }

        @Getter
        public static class Set {
          /**
           * If an item with the {@code price} already exists, passing this will override the {@code
           * discounts} array on the subscription item that matches that price. Otherwise, the
           * {@code items} array is cleared and a single new item is added with the supplied {@code
           * discounts}.
           */
          @SerializedName("discounts")
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount>
              discounts;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * If an item with the {@code price} already exists, passing this will override the {@code
           * metadata} on the subscription item that matches that price. Otherwise, the {@code
           * items} array is cleared and a single new item is added with the supplied {@code
           * metadata}.
           */
          @SerializedName("metadata")
          Map<String, String> metadata;

          /** <strong>Required.</strong> The ID of the price object. */
          @SerializedName("price")
          String price;

          /**
           * If an item with the {@code price} already exists, passing this will override the
           * quantity on the subscription item that matches that price. Otherwise, the {@code items}
           * array is cleared and a single new item is added with the supplied {@code quantity}.
           */
          @SerializedName("quantity")
          Long quantity;

          /**
           * If an item with the {@code price} already exists, passing this will override the {@code
           * tax_rates} array on the subscription item that matches that price. Otherwise, the
           * {@code items} array is cleared and a single new item is added with the supplied {@code
           * tax_rates}.
           */
          @SerializedName("tax_rates")
          List<String> taxRates;

          /**
           * If an item with the {@code price} already exists, passing this will override the {@code
           * trial} configuration on the subscription item that matches that price. Otherwise, the
           * {@code items} array is cleared and a single new item is added with the supplied {@code
           * trial}.
           */
          @SerializedName("trial")
          Trial trial;

          private Set(
              List<InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount>
                  discounts,
              Map<String, Object> extraParams,
              Map<String, String> metadata,
              String price,
              Long quantity,
              List<String> taxRates,
              Trial trial) {
            this.discounts = discounts;
            this.extraParams = extraParams;
            this.metadata = metadata;
            this.price = price;
            this.quantity = quantity;
            this.taxRates = taxRates;
            this.trial = trial;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                        .Discount>
                discounts;

            private Map<String, Object> extraParams;

            private Map<String, String> metadata;

            private String price;

            private Long quantity;

            private List<String> taxRates;

            private Trial trial;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set(
                  this.discounts,
                  this.extraParams,
                  this.metadata,
                  this.price,
                  this.quantity,
                  this.taxRates,
                  this.trial);
            }

            /**
             * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#discounts}
             * for the field documentation.
             */
            public Builder addDiscount(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount
                    element) {
              if (this.discounts == null) {
                this.discounts = new ArrayList<>();
              }
              this.discounts.add(element);
              return this;
            }

            /**
             * Add all elements to `discounts` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#discounts}
             * for the field documentation.
             */
            public Builder addAllDiscount(
                List<
                        InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                            .Discount>
                    elements) {
              if (this.discounts == null) {
                this.discounts = new ArrayList<>();
              }
              this.discounts.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Add a key/value pair to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#metadata} for
             * the field documentation.
             */
            public Builder putMetadata(String key, String value) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#metadata} for
             * the field documentation.
             */
            public Builder putAllMetadata(Map<String, String> map) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the price object. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }

            /**
             * If an item with the {@code price} already exists, passing this will override the
             * quantity on the subscription item that matches that price. Otherwise, the {@code
             * items} array is cleared and a single new item is added with the supplied {@code
             * quantity}.
             */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }

            /**
             * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#taxRates} for
             * the field documentation.
             */
            public Builder addTaxRate(String element) {
              if (this.taxRates == null) {
                this.taxRates = new ArrayList<>();
              }
              this.taxRates.add(element);
              return this;
            }

            /**
             * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set#taxRates} for
             * the field documentation.
             */
            public Builder addAllTaxRate(List<String> elements) {
              if (this.taxRates == null) {
                this.taxRates = new ArrayList<>();
              }
              this.taxRates.addAll(elements);
              return this;
            }

            /**
             * If an item with the {@code price} already exists, passing this will override the
             * {@code trial} configuration on the subscription item that matches that price.
             * Otherwise, the {@code items} array is cleared and a single new item is added with the
             * supplied {@code trial}.
             */
            public Builder setTrial(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial
                    trial) {
              this.trial = trial;
              return this;
            }
          }

          @Getter
          public static class Discount {
            /** ID of the coupon to create a new discount for. */
            @SerializedName("coupon")
            String coupon;

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            @SerializedName("discount")
            String discount;

            /** Details to determine how long the discount should be applied for. */
            @SerializedName("discount_end")
            DiscountEnd discountEnd;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** ID of the promotion code to create a new discount for. */
            @SerializedName("promotion_code")
            String promotionCode;

            private Discount(
                String coupon,
                String discount,
                DiscountEnd discountEnd,
                Map<String, Object> extraParams,
                String promotionCode) {
              this.coupon = coupon;
              this.discount = discount;
              this.discountEnd = discountEnd;
              this.extraParams = extraParams;
              this.promotionCode = promotionCode;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String coupon;

              private String discount;

              private DiscountEnd discountEnd;

              private Map<String, Object> extraParams;

              private String promotionCode;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                      .Discount
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                    .Discount(
                    this.coupon,
                    this.discount,
                    this.discountEnd,
                    this.extraParams,
                    this.promotionCode);
              }

              /** ID of the coupon to create a new discount for. */
              public Builder setCoupon(String coupon) {
                this.coupon = coupon;
                return this;
              }

              /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
              public Builder setDiscount(String discount) {
                this.discount = discount;
                return this;
              }

              /** Details to determine how long the discount should be applied for. */
              public Builder setDiscountEnd(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount
                          .DiscountEnd
                      discountEnd) {
                this.discountEnd = discountEnd;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** ID of the promotion code to create a new discount for. */
              public Builder setPromotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
              }
            }

            @Getter
            public static class DiscountEnd {
              /** Time span for the redeemed discount. */
              @SerializedName("duration")
              Duration duration;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              @SerializedName("timestamp")
              Long timestamp;

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              @SerializedName("type")
              Type type;

              private DiscountEnd(
                  Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
                this.duration = duration;
                this.extraParams = extraParams;
                this.timestamp = timestamp;
                this.type = type;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Duration duration;

                private Map<String, Object> extraParams;

                private Long timestamp;

                private Type type;

                /** Finalize and obtain parameter instance from this builder. */
                public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                        .Discount.DiscountEnd
                    build() {
                  return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                      .Discount.DiscountEnd(
                      this.duration, this.extraParams, this.timestamp, this.type);
                }

                /** Time span for the redeemed discount. */
                public Builder setDuration(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount
                            .DiscountEnd.Duration
                        duration) {
                  this.duration = duration;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount.DiscountEnd#extraParams}
                 * for the field documentation.
                 */
                public Builder putExtraParam(String key, Object value) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.put(key, value);
                  return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount.DiscountEnd#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** A precise Unix timestamp for the discount to end. Must be in the future. */
                public Builder setTimestamp(Long timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The type of calculation made to determine when the
                 * discount ends.
                 */
                public Builder setType(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount
                            .DiscountEnd.Type
                        type) {
                  this.type = type;
                  return this;
                }
              }

              @Getter
              public static class Duration {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                @SerializedName("interval")
                Interval interval;

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
                 */
                @SerializedName("interval_count")
                Long intervalCount;

                private Duration(
                    Map<String, Object> extraParams, Interval interval, Long intervalCount) {
                  this.extraParams = extraParams;
                  this.interval = interval;
                  this.intervalCount = intervalCount;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private Interval interval;

                  private Long intervalCount;

                  /** Finalize and obtain parameter instance from this builder. */
                  public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                          .Discount.DiscountEnd.Duration
                      build() {
                    return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction
                        .Set.Discount.DiscountEnd.Duration(
                        this.extraParams, this.interval, this.intervalCount);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount.DiscountEnd.Duration#extraParams}
                   * for the field documentation.
                   */
                  public Builder putExtraParam(String key, Object value) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.put(key, value);
                    return this;
                  }

                  /**
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Discount.DiscountEnd.Duration#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /**
                   * <strong>Required.</strong> Specifies a type of interval unit. Either {@code
                   * day}, {@code week}, {@code month} or {@code year}.
                   */
                  public Builder setInterval(
                      InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                              .Discount.DiscountEnd.Duration.Interval
                          interval) {
                    this.interval = interval;
                    return this;
                  }

                  /**
                   * <strong>Required.</strong> The number of intervals, as an whole number greater
                   * than 0. Stripe multiplies this by the interval type to get the overall
                   * duration.
                   */
                  public Builder setIntervalCount(Long intervalCount) {
                    this.intervalCount = intervalCount;
                    return this;
                  }
                }

                public enum Interval implements ApiRequestParams.EnumParam {
                  @SerializedName("day")
                  DAY("day"),

                  @SerializedName("month")
                  MONTH("month"),

                  @SerializedName("week")
                  WEEK("week"),

                  @SerializedName("year")
                  YEAR("year");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  Interval(String value) {
                    this.value = value;
                  }
                }
              }

              public enum Type implements ApiRequestParams.EnumParam {
                @SerializedName("duration")
                DURATION("duration"),

                @SerializedName("timestamp")
                TIMESTAMP("timestamp");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Type(String value) {
                  this.value = value;
                }
              }
            }
          }

          @Getter
          public static class Trial {
            /**
             * List of price IDs which, if present on the subscription following a paid trial,
             * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
             */
            @SerializedName("converts_to")
            List<String> convertsTo;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> Determines the type of trial for this item. */
            @SerializedName("type")
            Type type;

            private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
              this.convertsTo = convertsTo;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private List<String> convertsTo;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set
                    .Trial(this.convertsTo, this.extraParams, this.type);
              }

              /**
               * Add an element to `convertsTo` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial#convertsTo}
               * for the field documentation.
               */
              public Builder addConvertsTo(String element) {
                if (this.convertsTo == null) {
                  this.convertsTo = new ArrayList<>();
                }
                this.convertsTo.add(element);
                return this;
              }

              /**
               * Add all elements to `convertsTo` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial#convertsTo}
               * for the field documentation.
               */
              public Builder addAllConvertsTo(List<String> elements) {
                if (this.convertsTo == null) {
                  this.convertsTo = new ArrayList<>();
                }
                this.convertsTo.addAll(elements);
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> Determines the type of trial for this item. */
              public Builder setType(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.ItemAction.Set.Trial.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("free")
              FREE("free"),

              @SerializedName("paid")
              PAID("paid");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("add")
          ADD("add"),

          @SerializedName("remove")
          REMOVE("remove"),

          @SerializedName("set")
          SET("set");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class MetadataAction {
        /**
         * Key-value pairs to add to schedule phase metadata. These values will merge with existing
         * schedule phase metadata.
         */
        @SerializedName("add")
        Map<String, String> add;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Keys to remove from schedule phase metadata. */
        @SerializedName("remove")
        List<String> remove;

        /**
         * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata will
         * be overwritten.
         */
        @SerializedName("set")
        Object set;

        /**
         * <strong>Required.</strong> Select one of three ways to update phase-level {@code
         * metadata} on subscription schedules.
         */
        @SerializedName("type")
        Type type;

        private MetadataAction(
            Map<String, String> add,
            Map<String, Object> extraParams,
            List<String> remove,
            Object set,
            Type type) {
          this.add = add;
          this.extraParams = extraParams;
          this.remove = remove;
          this.set = set;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, String> add;

          private Map<String, Object> extraParams;

          private List<String> remove;

          private Object set;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction(
                this.add, this.extraParams, this.remove, this.set, this.type);
          }

          /**
           * Add a key/value pair to `add` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#add} for
           * the field documentation.
           */
          public Builder putAdd(String key, String value) {
            if (this.add == null) {
              this.add = new HashMap<>();
            }
            this.add.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `add` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#add} for the
           * field documentation.
           */
          public Builder putAllAdd(Map<String, String> map) {
            if (this.add == null) {
              this.add = new HashMap<>();
            }
            this.add.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `remove` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#remove} for the
           * field documentation.
           */
          public Builder addRemove(String element) {
            if (this.remove == null) {
              this.remove = new ArrayList<>();
            }
            this.remove.add(element);
            return this;
          }

          /**
           * Add all elements to `remove` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#remove} for the
           * field documentation.
           */
          public Builder addAllRemove(List<String> elements) {
            if (this.remove == null) {
              this.remove = new ArrayList<>();
            }
            this.remove.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `set` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#set} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder putSet(String key, String value) {
            if (this.set == null || this.set instanceof EmptyParam) {
              this.set = new HashMap<String, String>();
            }
            ((Map<String, String>) this.set).put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `set` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction#set} for the
           * field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder putAllSet(Map<String, String> map) {
            if (this.set == null || this.set instanceof EmptyParam) {
              this.set = new HashMap<String, String>();
            }
            ((Map<String, String>) this.set).putAll(map);
            return this;
          }

          /**
           * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata
           * will be overwritten.
           */
          public Builder setSet(EmptyParam set) {
            this.set = set;
            return this;
          }

          /**
           * Key-value pairs to set as schedule phase metadata. Existing schedule phase metadata
           * will be overwritten.
           */
          public Builder setSet(Map<String, String> set) {
            this.set = set;
            return this;
          }

          /**
           * <strong>Required.</strong> Select one of three ways to update phase-level {@code
           * metadata} on subscription schedules.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.MetadataAction.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("add")
          ADD("add"),

          @SerializedName("remove")
          REMOVE("remove"),

          @SerializedName("set")
          SET("set");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class SetPauseCollection {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of the pause_collection behavior to apply to the amendment. */
        @SerializedName("set")
        Set set;

        /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
        @SerializedName("type")
        Type type;

        private SetPauseCollection(Map<String, Object> extraParams, Set set, Type type) {
          this.extraParams = extraParams;
          this.set = set;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Set set;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection
              build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection(
                this.extraParams, this.set, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of the pause_collection behavior to apply to the amendment. */
          public Builder setSet(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Set set) {
            this.set = set;
            return this;
          }

          /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Type
                  type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Set {
          /**
           * <strong>Required.</strong> The payment collection behavior for this subscription while
           * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
           */
          @SerializedName("behavior")
          Behavior behavior;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Set(Behavior behavior, Map<String, Object> extraParams) {
            this.behavior = behavior;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Behavior behavior;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Set
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection
                  .Set(this.behavior, this.extraParams);
            }

            /**
             * <strong>Required.</strong> The payment collection behavior for this subscription
             * while paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code
             * void}.
             */
            public Builder setBehavior(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Set
                        .Behavior
                    behavior) {
              this.behavior = behavior;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Set#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.SetPauseCollection.Set#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }
          }

          public enum Behavior implements ApiRequestParams.EnumParam {
            @SerializedName("keep_as_draft")
            KEEP_AS_DRAFT("keep_as_draft"),

            @SerializedName("mark_uncollectible")
            MARK_UNCOLLECTIBLE("mark_uncollectible"),

            @SerializedName("void")
            VOID("void");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Behavior(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("remove")
          REMOVE("remove"),

          @SerializedName("set")
          SET("set");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class TrialSettings {
        /** Defines how the subscription should behave when a trial ends. */
        @SerializedName("end_behavior")
        EndBehavior endBehavior;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
          this.endBehavior = endBehavior;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EndBehavior endBehavior;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings(
                this.endBehavior, this.extraParams);
          }

          /** Defines how the subscription should behave when a trial ends. */
          public Builder setEndBehavior(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings.EndBehavior
                  endBehavior) {
            this.endBehavior = endBehavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        @Getter
        public static class EndBehavior {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Configure how an opt-in following a paid trial is billed when using {@code
           * billing_behavior: prorate_up_front}.
           */
          @SerializedName("prorate_up_front")
          ProrateUpFront prorateUpFront;

          private EndBehavior(Map<String, Object> extraParams, ProrateUpFront prorateUpFront) {
            this.extraParams = extraParams;
            this.prorateUpFront = prorateUpFront;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ProrateUpFront prorateUpFront;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings
                    .EndBehavior
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings
                  .EndBehavior(this.extraParams, this.prorateUpFront);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings.EndBehavior#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings.EndBehavior#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Configure how an opt-in following a paid trial is billed when using {@code
             * billing_behavior: prorate_up_front}.
             */
            public Builder setProrateUpFront(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Amendment.TrialSettings.EndBehavior
                        .ProrateUpFront
                    prorateUpFront) {
              this.prorateUpFront = prorateUpFront;
              return this;
            }
          }

          public enum ProrateUpFront implements ApiRequestParams.EnumParam {
            @SerializedName("defer")
            DEFER("defer"),

            @SerializedName("include")
            INCLUDE("include");

            @Getter(onMethod_ = {@Override})
            private final String value;

            ProrateUpFront(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
        @SerializedName("amendment_start")
        AMENDMENT_START("amendment_start"),

        @SerializedName("automatic")
        AUTOMATIC("automatic");

        @Getter(onMethod_ = {@Override})
        private final String value;

        BillingCycleAnchor(String value) {
          this.value = value;
        }
      }

      public enum ProrationBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("always_invoice")
        ALWAYS_INVOICE("always_invoice"),

        @SerializedName("create_prorations")
        CREATE_PRORATIONS("create_prorations"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProrationBehavior(String value) {
          this.value = value;
        }
      }

      public enum SetScheduleEnd implements ApiRequestParams.EnumParam {
        @SerializedName("amendment_end")
        AMENDMENT_END("amendment_end"),

        @SerializedName("amendment_start")
        AMENDMENT_START("amendment_start");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetScheduleEnd(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Phase {
      /**
       * A list of prices and quantities that will generate invoice items appended to the next
       * invoice for this phase. You may pass up to 20 items.
       */
      @SerializedName("add_invoice_items")
      List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem> addInvoiceItems;

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      @SerializedName("application_fee_percent")
      BigDecimal applicationFeePercent;

      /** Automatic tax settings for this phase. */
      @SerializedName("automatic_tax")
      AutomaticTax automaticTax;

      /**
       * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
       * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
       * this phase specifies a trial. For more information, see the billing cycle <a
       * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
       */
      @SerializedName("billing_cycle_anchor")
      BillingCycleAnchor billingCycleAnchor;

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      @SerializedName("collection_method")
      CollectionMethod collectionMethod;

      /**
       * The ID of the coupon to apply to this phase of the subscription schedule. This field has
       * been deprecated and will be removed in a future API version. Use {@code discounts} instead.
       */
      @SerializedName("coupon")
      String coupon;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      @SerializedName("default_payment_method")
      String defaultPaymentMethod;

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a>, which means they will be the Invoice's <a
       * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
       * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
       */
      @SerializedName("default_tax_rates")
      Object defaultTaxRates;

      /**
       * Subscription description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      @SerializedName("description")
      Object description;

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      @SerializedName("discounts")
      Object discounts;

      /**
       * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
       * must not be set.
       */
      @SerializedName("end_date")
      Object endDate;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** All invoices will be billed using the specified settings. */
      @SerializedName("invoice_settings")
      InvoiceSettings invoiceSettings;

      /**
       * <strong>Required.</strong> List of configuration items, each with an attached price, to
       * apply during this phase of the subscription schedule.
       */
      @SerializedName("items")
      List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item> items;

      /**
       * Integer representing the multiplier applied to the price interval. For example, {@code
       * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
       * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date}
       * must not be set.
       */
      @SerializedName("iterations")
      Long iterations;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to a phase. Metadata on a schedule's phase will update the underlying subscription's
       * {@code metadata} when the phase is entered, adding new keys and replacing existing keys in
       * the subscription's {@code metadata}. Individual keys in the subscription's {@code metadata}
       * can be unset by posting an empty value to them in the phase's {@code metadata}. To unset
       * all keys in the subscription's {@code metadata}, update the subscription directly or unset
       * every key individually from the phase's {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      @SerializedName("on_behalf_of")
      String onBehalfOf;

      /**
       * If specified, payment collection for this subscription will be paused. Note that the
       * subscription status will be unchanged and will not be updated to {@code paused}. Learn more
       * about <a href="https://stripe.com/docs/billing/subscriptions/pause-payment">pausing
       * collection</a>.
       */
      @SerializedName("pause_collection")
      PauseCollection pauseCollection;

      /**
       * Whether the subscription schedule will create <a
       * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
       * transitioning to this phase. The default value is {@code create_prorations}. This setting
       * controls prorations when a phase is started asynchronously and it is persisted as a field
       * on the phase. It's different from the request-level <a
       * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
       * parameter which controls what happens if the update request affects the billing
       * configuration of the current phase.
       */
      @SerializedName("proration_behavior")
      ProrationBehavior prorationBehavior;

      /**
       * The date at which this phase of the subscription schedule starts or {@code now}. Must be
       * set on the first phase.
       */
      @SerializedName("start_date")
      Object startDate;

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      @SerializedName("transfer_data")
      TransferData transferData;

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      @SerializedName("trial")
      Boolean trial;

      /** Specify trial behavior when crossing phase boundaries. */
      @SerializedName("trial_continuation")
      TrialContinuation trialContinuation;

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with {@code trial}
       */
      @SerializedName("trial_end")
      Object trialEnd;

      /** Settings related to subscription trials. */
      @SerializedName("trial_settings")
      TrialSettings trialSettings;

      private Phase(
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem> addInvoiceItems,
          BigDecimal applicationFeePercent,
          AutomaticTax automaticTax,
          BillingCycleAnchor billingCycleAnchor,
          Object billingThresholds,
          CollectionMethod collectionMethod,
          String coupon,
          String currency,
          String defaultPaymentMethod,
          Object defaultTaxRates,
          Object description,
          Object discounts,
          Object endDate,
          Map<String, Object> extraParams,
          InvoiceSettings invoiceSettings,
          List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item> items,
          Long iterations,
          Map<String, String> metadata,
          String onBehalfOf,
          PauseCollection pauseCollection,
          ProrationBehavior prorationBehavior,
          Object startDate,
          TransferData transferData,
          Boolean trial,
          TrialContinuation trialContinuation,
          Object trialEnd,
          TrialSettings trialSettings) {
        this.addInvoiceItems = addInvoiceItems;
        this.applicationFeePercent = applicationFeePercent;
        this.automaticTax = automaticTax;
        this.billingCycleAnchor = billingCycleAnchor;
        this.billingThresholds = billingThresholds;
        this.collectionMethod = collectionMethod;
        this.coupon = coupon;
        this.currency = currency;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.defaultTaxRates = defaultTaxRates;
        this.description = description;
        this.discounts = discounts;
        this.endDate = endDate;
        this.extraParams = extraParams;
        this.invoiceSettings = invoiceSettings;
        this.items = items;
        this.iterations = iterations;
        this.metadata = metadata;
        this.onBehalfOf = onBehalfOf;
        this.pauseCollection = pauseCollection;
        this.prorationBehavior = prorationBehavior;
        this.startDate = startDate;
        this.transferData = transferData;
        this.trial = trial;
        this.trialContinuation = trialContinuation;
        this.trialEnd = trialEnd;
        this.trialSettings = trialSettings;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem>
            addInvoiceItems;

        private BigDecimal applicationFeePercent;

        private AutomaticTax automaticTax;

        private BillingCycleAnchor billingCycleAnchor;

        private Object billingThresholds;

        private CollectionMethod collectionMethod;

        private String coupon;

        private String currency;

        private String defaultPaymentMethod;

        private Object defaultTaxRates;

        private Object description;

        private Object discounts;

        private Object endDate;

        private Map<String, Object> extraParams;

        private InvoiceSettings invoiceSettings;

        private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item> items;

        private Long iterations;

        private Map<String, String> metadata;

        private String onBehalfOf;

        private PauseCollection pauseCollection;

        private ProrationBehavior prorationBehavior;

        private Object startDate;

        private TransferData transferData;

        private Boolean trial;

        private TrialContinuation trialContinuation;

        private Object trialEnd;

        private TrialSettings trialSettings;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase build() {
          return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase(
              this.addInvoiceItems,
              this.applicationFeePercent,
              this.automaticTax,
              this.billingCycleAnchor,
              this.billingThresholds,
              this.collectionMethod,
              this.coupon,
              this.currency,
              this.defaultPaymentMethod,
              this.defaultTaxRates,
              this.description,
              this.discounts,
              this.endDate,
              this.extraParams,
              this.invoiceSettings,
              this.items,
              this.iterations,
              this.metadata,
              this.onBehalfOf,
              this.pauseCollection,
              this.prorationBehavior,
              this.startDate,
              this.transferData,
              this.trial,
              this.trialContinuation,
              this.trialEnd,
              this.trialSettings);
        }

        /**
         * Add an element to `addInvoiceItems` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#addInvoiceItems} for the
         * field documentation.
         */
        public Builder addAddInvoiceItem(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem element) {
          if (this.addInvoiceItems == null) {
            this.addInvoiceItems = new ArrayList<>();
          }
          this.addInvoiceItems.add(element);
          return this;
        }

        /**
         * Add all elements to `addInvoiceItems` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#addInvoiceItems} for the
         * field documentation.
         */
        public Builder addAllAddInvoiceItem(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem> elements) {
          if (this.addInvoiceItems == null) {
            this.addInvoiceItems = new ArrayList<>();
          }
          this.addInvoiceItems.addAll(elements);
          return this;
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the application owner's Stripe account. The request must be made by a platform account on
         * a connected account in order to set an application fee percentage. For more information,
         * see the application fees <a
         * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
         */
        public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
          this.applicationFeePercent = applicationFeePercent;
          return this;
        }

        /** Automatic tax settings for this phase. */
        public Builder setAutomaticTax(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax automaticTax) {
          this.automaticTax = automaticTax;
          return this;
        }

        /**
         * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
         * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
         * this phase specifies a trial. For more information, see the billing cycle <a
         * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
         */
        public Builder setBillingCycleAnchor(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingCycleAnchor
                billingCycleAnchor) {
          this.billingCycleAnchor = billingCycleAnchor;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. Pass an empty string to remove previously-defined thresholds.
         */
        public Builder setBillingThresholds(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingThresholds
                billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. Pass an empty string to remove previously-defined thresholds.
         */
        public Builder setBillingThresholds(EmptyParam billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Either {@code charge_automatically}, or {@code send_invoice}. When charging
         * automatically, Stripe will attempt to pay the underlying subscription at the end of each
         * billing cycle using the default source attached to the customer. When sending an invoice,
         * Stripe will email your customer an invoice with payment instructions and mark the
         * subscription as {@code active}. Defaults to {@code charge_automatically} on creation.
         */
        public Builder setCollectionMethod(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.CollectionMethod
                collectionMethod) {
          this.collectionMethod = collectionMethod;
          return this;
        }

        /**
         * The ID of the coupon to apply to this phase of the subscription schedule. This field has
         * been deprecated and will be removed in a future API version. Use {@code discounts}
         * instead.
         */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * ID of the default payment method for the subscription schedule. It must belong to the
         * customer associated with the subscription schedule. If not set, invoices will use the
         * default payment method in the customer's invoice settings.
         */
        public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
          this.defaultPaymentMethod = defaultPaymentMethod;
          return this;
        }

        /**
         * Add an element to `defaultTaxRates` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#defaultTaxRates} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDefaultTaxRate(String element) {
          if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
            this.defaultTaxRates = new ArrayList<String>();
          }
          ((List<String>) this.defaultTaxRates).add(element);
          return this;
        }

        /**
         * Add all elements to `defaultTaxRates` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#defaultTaxRates} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDefaultTaxRate(List<String> elements) {
          if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
            this.defaultTaxRates = new ArrayList<String>();
          }
          ((List<String>) this.defaultTaxRates).addAll(elements);
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will set the Subscription's <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a>, which means they will be the Invoice's <a
         * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
         * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
         */
        public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
          this.defaultTaxRates = defaultTaxRates;
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will set the Subscription's <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a>, which means they will be the Invoice's <a
         * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
         * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
         */
        public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
          this.defaultTaxRates = defaultTaxRates;
          return this;
        }

        /**
         * Subscription description, meant to be displayable to the customer. Use this field to
         * optionally store an explanation of the subscription for rendering in Stripe surfaces and
         * certain local payment methods UIs.
         */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Subscription description, meant to be displayable to the customer. Use this field to
         * optionally store an explanation of the subscription for rendering in Stripe surfaces and
         * certain local payment methods UIs.
         */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#discounts} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDiscount(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount element) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts =
                new ArrayList<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount>();
          }
          ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount>) this.discounts)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#discounts} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDiscount(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount> elements) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts =
                new ArrayList<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount>();
          }
          ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount>) this.discounts)
              .addAll(elements);
          return this;
        }

        /**
         * The coupons to redeem into discounts for the schedule phase. If not specified, inherits
         * the discount from the subscription's customer. Pass an empty string to avoid inheriting
         * any discounts.
         */
        public Builder setDiscounts(EmptyParam discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * The coupons to redeem into discounts for the schedule phase. If not specified, inherits
         * the discount from the subscription's customer. Pass an empty string to avoid inheriting
         * any discounts.
         */
        public Builder setDiscounts(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount> discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * The date at which this phase of the subscription schedule ends. If set, {@code
         * iterations} must not be set.
         */
        public Builder setEndDate(Long endDate) {
          this.endDate = endDate;
          return this;
        }

        /**
         * The date at which this phase of the subscription schedule ends. If set, {@code
         * iterations} must not be set.
         */
        public Builder setEndDate(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.EndDate endDate) {
          this.endDate = endDate;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** All invoices will be billed using the specified settings. */
        public Builder setInvoiceSettings(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings invoiceSettings) {
          this.invoiceSettings = invoiceSettings;
          return this;
        }

        /**
         * Add an element to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#items} for the field documentation.
         */
        public Builder addItem(InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item element) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.add(element);
          return this;
        }

        /**
         * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#items} for the field documentation.
         */
        public Builder addAllItem(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item> elements) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.addAll(elements);
          return this;
        }

        /**
         * Integer representing the multiplier applied to the price interval. For example, {@code
         * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
         * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date}
         * must not be set.
         */
        public Builder setIterations(Long iterations) {
          this.iterations = iterations;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#metadata} for the field
         * documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase#metadata} for the
         * field documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * The account on behalf of which to charge, for each of the associated subscription's
         * invoices.
         */
        public Builder setOnBehalfOf(String onBehalfOf) {
          this.onBehalfOf = onBehalfOf;
          return this;
        }

        /**
         * If specified, payment collection for this subscription will be paused. Note that the
         * subscription status will be unchanged and will not be updated to {@code paused}. Learn
         * more about <a href="https://stripe.com/docs/billing/subscriptions/pause-payment">pausing
         * collection</a>.
         */
        public Builder setPauseCollection(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection pauseCollection) {
          this.pauseCollection = pauseCollection;
          return this;
        }

        /**
         * Whether the subscription schedule will create <a
         * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
         * transitioning to this phase. The default value is {@code create_prorations}. This setting
         * controls prorations when a phase is started asynchronously and it is persisted as a field
         * on the phase. It's different from the request-level <a
         * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
         * parameter which controls what happens if the update request affects the billing
         * configuration of the current phase.
         */
        public Builder setProrationBehavior(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.ProrationBehavior
                prorationBehavior) {
          this.prorationBehavior = prorationBehavior;
          return this;
        }

        /**
         * The date at which this phase of the subscription schedule starts or {@code now}. Must be
         * set on the first phase.
         */
        public Builder setStartDate(Long startDate) {
          this.startDate = startDate;
          return this;
        }

        /**
         * The date at which this phase of the subscription schedule starts or {@code now}. Must be
         * set on the first phase.
         */
        public Builder setStartDate(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.StartDate startDate) {
          this.startDate = startDate;
          return this;
        }

        /**
         * The data with which to automatically create a Transfer for each of the associated
         * subscription's invoices.
         */
        public Builder setTransferData(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TransferData transferData) {
          this.transferData = transferData;
          return this;
        }

        /**
         * If set to true the entire phase is counted as a trial and the customer will not be
         * charged for any fees.
         */
        public Builder setTrial(Boolean trial) {
          this.trial = trial;
          return this;
        }

        /** Specify trial behavior when crossing phase boundaries. */
        public Builder setTrialContinuation(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialContinuation
                trialContinuation) {
          this.trialContinuation = trialContinuation;
          return this;
        }

        /**
         * Sets the phase to trialing from the start date to this date. Must be before the phase end
         * date, can not be combined with {@code trial}
         */
        public Builder setTrialEnd(Long trialEnd) {
          this.trialEnd = trialEnd;
          return this;
        }

        /**
         * Sets the phase to trialing from the start date to this date. Must be before the phase end
         * date, can not be combined with {@code trial}
         */
        public Builder setTrialEnd(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialEnd trialEnd) {
          this.trialEnd = trialEnd;
          return this;
        }

        /** Settings related to subscription trials. */
        public Builder setTrialSettings(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings trialSettings) {
          this.trialSettings = trialSettings;
          return this;
        }
      }

      @Getter
      public static class AddInvoiceItem {
        /** The coupons to redeem into discounts for the item. */
        @SerializedName("discounts")
        List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount>
            discounts;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        @SerializedName("price")
        String price;

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline. One of {@code price} or {@code price_data} is required.
         */
        @SerializedName("price_data")
        PriceData priceData;

        /** Quantity for this item. Defaults to 1. */
        @SerializedName("quantity")
        Long quantity;

        /**
         * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not
         * apply to this item.
         */
        @SerializedName("tax_rates")
        Object taxRates;

        private AddInvoiceItem(
            List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount>
                discounts,
            Map<String, Object> extraParams,
            String price,
            PriceData priceData,
            Long quantity,
            Object taxRates) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.price = price;
          this.priceData = priceData;
          this.quantity = quantity;
          this.taxRates = taxRates;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount>
              discounts;

          private Map<String, Object> extraParams;

          private String price;

          private PriceData priceData;

          private Long quantity;

          private Object taxRates;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem(
                this.discounts,
                this.extraParams,
                this.price,
                this.priceData,
                this.quantity,
                this.taxRates);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#discounts} for the
           * field documentation.
           */
          public Builder addDiscount(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                  element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#discounts} for the
           * field documentation.
           */
          public Builder addAllDiscount(
              List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount>
                  elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a>
           * object inline. One of {@code price} or {@code price_data} is required.
           */
          public Builder setPriceData(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.PriceData
                  priceData) {
            this.priceData = priceData;
            return this;
          }

          /** Quantity for this item. Defaults to 1. */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#taxRates} for the
           * field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addTaxRate(String element) {
            if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
              this.taxRates = new ArrayList<String>();
            }
            ((List<String>) this.taxRates).add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem#taxRates} for the
           * field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
              this.taxRates = new ArrayList<String>();
            }
            ((List<String>) this.taxRates).addAll(elements);
            return this;
          }

          /**
           * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not
           * apply to this item.
           */
          public Builder setTaxRates(EmptyParam taxRates) {
            this.taxRates = taxRates;
            return this;
          }

          /**
           * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not
           * apply to this item.
           */
          public Builder setTaxRates(List<String> taxRates) {
            this.taxRates = taxRates;
            return this;
          }
        }

        @Getter
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem
                  .Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                        .DiscountEnd
                    discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            @SerializedName("type")
            Type type;

            private DiscountEnd(
                Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
              this.duration = duration;
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Duration duration;

              private Map<String, Object> extraParams;

              private Long timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                      .DiscountEnd
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem
                    .Discount.DiscountEnd(
                    this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                          .DiscountEnd.Duration
                      duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              public Builder setTimestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              public Builder setType(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                          .DiscountEnd.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              @SerializedName("interval")
              Interval interval;

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              @SerializedName("interval_count")
              Long intervalCount;

              private Duration(
                  Map<String, Object> extraParams, Interval interval, Long intervalCount) {
                this.extraParams = extraParams;
                this.interval = interval;
                this.intervalCount = intervalCount;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private Interval interval;

                private Long intervalCount;

                /** Finalize and obtain parameter instance from this builder. */
                public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                        .DiscountEnd.Duration
                    build() {
                  return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem
                      .Discount.DiscountEnd.Duration(
                      this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount.DiscountEnd.Duration#extraParams}
                 * for the field documentation.
                 */
                public Builder putExtraParam(String key, Object value) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.put(key, value);
                  return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount.DiscountEnd.Duration#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /**
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                public Builder setInterval(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.Discount
                            .DiscountEnd.Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
                 */
                public Builder setIntervalCount(Long intervalCount) {
                  this.intervalCount = intervalCount;
                  return this;
                }
              }

              public enum Interval implements ApiRequestParams.EnumParam {
                @SerializedName("day")
                DAY("day"),

                @SerializedName("month")
                MONTH("month"),

                @SerializedName("week")
                WEEK("week"),

                @SerializedName("year")
                YEAR("year");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Interval(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("duration")
              DURATION("duration"),

              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class PriceData {
          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          @SerializedName("currency")
          String currency;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The ID of the product that this price will belong to. */
          @SerializedName("product")
          String product;

          /**
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge or a negative integer representing the amount to credit to the
           * customer.
           */
          @SerializedName("unit_amount")
          Long unitAmount;

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          @SerializedName("unit_amount_decimal")
          BigDecimal unitAmountDecimal;

          private PriceData(
              String currency,
              Map<String, Object> extraParams,
              String product,
              TaxBehavior taxBehavior,
              Long unitAmount,
              BigDecimal unitAmountDecimal) {
            this.currency = currency;
            this.extraParams = extraParams;
            this.product = product;
            this.taxBehavior = taxBehavior;
            this.unitAmount = unitAmount;
            this.unitAmountDecimal = unitAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String currency;

            private Map<String, Object> extraParams;

            private String product;

            private TaxBehavior taxBehavior;

            private Long unitAmount;

            private BigDecimal unitAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.PriceData
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem
                  .PriceData(
                  this.currency,
                  this.extraParams,
                  this.product,
                  this.taxBehavior,
                  this.unitAmount,
                  this.unitAmountDecimal);
            }

            /**
             * <strong>Required.</strong> Three-letter <a
             * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
             * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
             * currency</a>.
             */
            public Builder setCurrency(String currency) {
              this.currency = currency;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.PriceData#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.PriceData#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the product that this price will belong to. */
            public Builder setProduct(String product) {
              this.product = product;
              return this;
            }

            /**
             * Only required if a <a
             * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
             * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
             * price is considered inclusive of taxes or exclusive of taxes. One of {@code
             * inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
             * {@code inclusive} or {@code exclusive}, it cannot be changed.
             */
            public Builder setTaxBehavior(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AddInvoiceItem.PriceData
                        .TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }

            /**
             * A positive integer in cents (or local equivalent) (or 0 for a free price)
             * representing how much to charge or a negative integer representing the amount to
             * credit to the customer.
             */
            public Builder setUnitAmount(Long unitAmount) {
              this.unitAmount = unitAmount;
              return this;
            }

            /**
             * Same as {@code unit_amount}, but accepts a decimal value in cents (or local
             * equivalent) with at most 12 decimal places. Only one of {@code unit_amount} and
             * {@code unit_amount_decimal} can be set.
             */
            public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
            }
          }

          public enum TaxBehavior implements ApiRequestParams.EnumParam {
            @SerializedName("exclusive")
            EXCLUSIVE("exclusive"),

            @SerializedName("inclusive")
            INCLUSIVE("inclusive"),

            @SerializedName("unspecified")
            UNSPECIFIED("unspecified");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TaxBehavior(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class AutomaticTax {
        /**
         * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
         * compute tax rates on all invoices generated by the subscription.
         */
        @SerializedName("enabled")
        Boolean enabled;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The account that's liable for tax. If set, the business address and tax registrations
         * required to perform the tax calculation are loaded from this account. The tax transaction
         * is returned in the report of the connected account.
         */
        @SerializedName("liability")
        Liability liability;

        private AutomaticTax(
            Boolean enabled, Map<String, Object> extraParams, Liability liability) {
          this.enabled = enabled;
          this.extraParams = extraParams;
          this.liability = liability;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean enabled;

          private Map<String, Object> extraParams;

          private Liability liability;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax(
                this.enabled, this.extraParams, this.liability);
          }

          /**
           * <strong>Required.</strong> Enabled automatic tax calculation which will automatically
           * compute tax rates on all invoices generated by the subscription.
           */
          public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The account that's liable for tax. If set, the business address and tax registrations
           * required to perform the tax calculation are loaded from this account. The tax
           * transaction is returned in the report of the connected account.
           */
          public Builder setLiability(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax.Liability
                  liability) {
            this.liability = liability;
            return this;
          }
        }

        @Getter
        public static class Liability {
          /** The connected account being referenced when {@code type} is {@code account}. */
          @SerializedName("account")
          String account;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          @SerializedName("type")
          Type type;

          private Liability(String account, Map<String, Object> extraParams, Type type) {
            this.account = account;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String account;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax.Liability
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax
                  .Liability(this.account, this.extraParams, this.type);
            }

            /** The connected account being referenced when {@code type} is {@code account}. */
            public Builder setAccount(String account) {
              this.account = account;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax.Liability#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax.Liability#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Type of the account referenced in the request. */
            public Builder setType(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.AutomaticTax.Liability.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("account")
            ACCOUNT("account"),

            @SerializedName("self")
            SELF("self");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class BillingThresholds {
        /** Monetary threshold that triggers the subscription to advance to a new billing period. */
        @SerializedName("amount_gte")
        Long amountGte;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is
         * reached. If true, {@code billing_cycle_anchor} will be updated to the date/time the
         * threshold was last reached; otherwise, the value will remain unchanged.
         */
        @SerializedName("reset_billing_cycle_anchor")
        Boolean resetBillingCycleAnchor;

        private BillingThresholds(
            Long amountGte, Map<String, Object> extraParams, Boolean resetBillingCycleAnchor) {
          this.amountGte = amountGte;
          this.extraParams = extraParams;
          this.resetBillingCycleAnchor = resetBillingCycleAnchor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amountGte;

          private Map<String, Object> extraParams;

          private Boolean resetBillingCycleAnchor;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingThresholds build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingThresholds(
                this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
          }

          /**
           * Monetary threshold that triggers the subscription to advance to a new billing period.
           */
          public Builder setAmountGte(Long amountGte) {
            this.amountGte = amountGte;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingThresholds#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.BillingThresholds#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is
           * reached. If true, {@code billing_cycle_anchor} will be updated to the date/time the
           * threshold was last reached; otherwise, the value will remain unchanged.
           */
          public Builder setResetBillingCycleAnchor(Boolean resetBillingCycleAnchor) {
            this.resetBillingCycleAnchor = resetBillingCycleAnchor;
            return this;
          }
        }
      }

      @Getter
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        String coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        String discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** ID of the promotion code to create a new discount for. */
        @SerializedName("promotion_code")
        String promotionCode;

        private Discount(
            String coupon,
            String discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            String promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private String promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        public static class DiscountEnd {
          /** Time span for the redeemed discount. */
          @SerializedName("duration")
          Duration duration;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(
              Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
            this.duration = duration;
            this.extraParams = extraParams;
            this.timestamp = timestamp;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Duration duration;

            private Map<String, Object> extraParams;

            private Long timestamp;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd(
                  this.duration, this.extraParams, this.timestamp, this.type);
            }

            /** Time span for the redeemed discount. */
            public Builder setDuration(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd.Duration
                    duration) {
              this.duration = duration;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class Duration {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Duration(
                Map<String, Object> extraParams, Interval interval, Long intervalCount) {
              this.extraParams = extraParams;
              this.interval = interval;
              this.intervalCount = intervalCount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Interval interval;

              private Long intervalCount;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd
                      .Duration
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd
                    .Duration(this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd.Duration#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd.Duration#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Discount.DiscountEnd.Duration
                          .Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              public Builder setIntervalCount(Long intervalCount) {
                this.intervalCount = intervalCount;
                return this;
              }
            }

            public enum Interval implements ApiRequestParams.EnumParam {
              @SerializedName("day")
              DAY("day"),

              @SerializedName("month")
              MONTH("month"),

              @SerializedName("week")
              WEEK("week"),

              @SerializedName("year")
              YEAR("year");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Interval(String value) {
                this.value = value;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("duration")
            DURATION("duration"),

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class InvoiceSettings {
        /**
         * The account tax IDs associated with this phase of the subscription schedule. Will be set
         * on invoices generated by this phase of the subscription schedule.
         */
        @SerializedName("account_tax_ids")
        Object accountTaxIds;

        /**
         * Number of days within which a customer must pay invoices generated by this subscription
         * schedule. This value will be {@code null} for subscription schedules where {@code
         * billing=charge_automatically}.
         */
        @SerializedName("days_until_due")
        Long daysUntilDue;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        @SerializedName("issuer")
        Issuer issuer;

        private InvoiceSettings(
            Object accountTaxIds,
            Long daysUntilDue,
            Map<String, Object> extraParams,
            Issuer issuer) {
          this.accountTaxIds = accountTaxIds;
          this.daysUntilDue = daysUntilDue;
          this.extraParams = extraParams;
          this.issuer = issuer;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object accountTaxIds;

          private Long daysUntilDue;

          private Map<String, Object> extraParams;

          private Issuer issuer;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings(
                this.accountTaxIds, this.daysUntilDue, this.extraParams, this.issuer);
          }

          /**
           * Add an element to `accountTaxIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings#accountTaxIds} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAccountTaxId(String element) {
            if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
              this.accountTaxIds = new ArrayList<String>();
            }
            ((List<String>) this.accountTaxIds).add(element);
            return this;
          }

          /**
           * Add all elements to `accountTaxIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings#accountTaxIds} for
           * the field documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllAccountTaxId(List<String> elements) {
            if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
              this.accountTaxIds = new ArrayList<String>();
            }
            ((List<String>) this.accountTaxIds).addAll(elements);
            return this;
          }

          /**
           * The account tax IDs associated with this phase of the subscription schedule. Will be
           * set on invoices generated by this phase of the subscription schedule.
           */
          public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
            this.accountTaxIds = accountTaxIds;
            return this;
          }

          /**
           * The account tax IDs associated with this phase of the subscription schedule. Will be
           * set on invoices generated by this phase of the subscription schedule.
           */
          public Builder setAccountTaxIds(List<String> accountTaxIds) {
            this.accountTaxIds = accountTaxIds;
            return this;
          }

          /**
           * Number of days within which a customer must pay invoices generated by this subscription
           * schedule. This value will be {@code null} for subscription schedules where {@code
           * billing=charge_automatically}.
           */
          public Builder setDaysUntilDue(Long daysUntilDue) {
            this.daysUntilDue = daysUntilDue;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The connected account that issues the invoice. The invoice is presented with the
           * branding and support information of the specified account.
           */
          public Builder setIssuer(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings.Issuer issuer) {
            this.issuer = issuer;
            return this;
          }
        }

        @Getter
        public static class Issuer {
          /** The connected account being referenced when {@code type} is {@code account}. */
          @SerializedName("account")
          String account;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          @SerializedName("type")
          Type type;

          private Issuer(String account, Map<String, Object> extraParams, Type type) {
            this.account = account;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String account;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings.Issuer
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings
                  .Issuer(this.account, this.extraParams, this.type);
            }

            /** The connected account being referenced when {@code type} is {@code account}. */
            public Builder setAccount(String account) {
              this.account = account;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings.Issuer#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings.Issuer#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Type of the account referenced in the request. */
            public Builder setType(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.InvoiceSettings.Issuer.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("account")
            ACCOUNT("account"),

            @SerializedName("self")
            SELF("self");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class Item {
        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. When updating, pass an empty string to remove previously-defined
         * thresholds.
         */
        @SerializedName("billing_thresholds")
        Object billingThresholds;

        /** The coupons to redeem into discounts for the subscription item. */
        @SerializedName("discounts")
        Object discounts;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to a configuration item. Metadata on a configuration item will update the
         * underlying subscription item's {@code metadata} when the phase is entered, adding new
         * keys and replacing existing keys. Individual keys in the subscription item's {@code
         * metadata} can be unset by posting an empty value to them in the configuration item's
         * {@code metadata}. To unset all keys in the subscription item's {@code metadata}, update
         * the subscription item directly or unset every key individually from the configuration
         * item's {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /**
         * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code
         * price}.
         */
        @SerializedName("plan")
        String plan;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline.
         */
        @SerializedName("price_data")
        PriceData priceData;

        /**
         * Quantity for the given price. Can be set only if the price's {@code usage_type} is {@code
         * licensed} and not {@code metered}.
         */
        @SerializedName("quantity")
        Long quantity;

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will override the <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
         * previously-defined tax rates.
         */
        @SerializedName("tax_rates")
        Object taxRates;

        /** Options that configure the trial on the subscription item. */
        @SerializedName("trial")
        Trial trial;

        private Item(
            Object billingThresholds,
            Object discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            String plan,
            String price,
            PriceData priceData,
            Long quantity,
            Object taxRates,
            Trial trial) {
          this.billingThresholds = billingThresholds;
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.plan = plan;
          this.price = price;
          this.priceData = priceData;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object billingThresholds;

          private Object discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String plan;

          private String price;

          private PriceData priceData;

          private Long quantity;

          private Object taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item(
                this.billingThresholds,
                this.discounts,
                this.extraParams,
                this.metadata,
                this.plan,
                this.price,
                this.priceData,
                this.quantity,
                this.taxRates,
                this.trial);
          }

          /**
           * Define thresholds at which an invoice will be sent, and the subscription advanced to a
           * new billing period. When updating, pass an empty string to remove previously-defined
           * thresholds.
           */
          public Builder setBillingThresholds(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.BillingThresholds
                  billingThresholds) {
            this.billingThresholds = billingThresholds;
            return this;
          }

          /**
           * Define thresholds at which an invoice will be sent, and the subscription advanced to a
           * new billing period. When updating, pass an empty string to remove previously-defined
           * thresholds.
           */
          public Builder setBillingThresholds(EmptyParam billingThresholds) {
            this.billingThresholds = billingThresholds;
            return this;
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#discounts} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addDiscount(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount element) {
            if (this.discounts == null || this.discounts instanceof EmptyParam) {
              this.discounts =
                  new ArrayList<
                      InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount>();
            }
            ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount>)
                    this.discounts)
                .add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#discounts} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllDiscount(
              List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount> elements) {
            if (this.discounts == null || this.discounts instanceof EmptyParam) {
              this.discounts =
                  new ArrayList<
                      InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount>();
            }
            ((List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount>)
                    this.discounts)
                .addAll(elements);
            return this;
          }

          /** The coupons to redeem into discounts for the subscription item. */
          public Builder setDiscounts(EmptyParam discounts) {
            this.discounts = discounts;
            return this;
          }

          /** The coupons to redeem into discounts for the subscription item. */
          public Builder setDiscounts(
              List<InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount> discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#metadata} for the
           * field documentation.
           */
          public Builder putMetadata(String key, String value) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `metadata` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#metadata} for
           * the field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /**
           * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code
           * price}.
           */
          public Builder setPlan(String plan) {
            this.plan = plan;
            return this;
          }

          /** The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a>
           * object inline.
           */
          public Builder setPriceData(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData priceData) {
            this.priceData = priceData;
            return this;
          }

          /**
           * Quantity for the given price. Can be set only if the price's {@code usage_type} is
           * {@code licensed} and not {@code metered}.
           */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#taxRates} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addTaxRate(String element) {
            if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
              this.taxRates = new ArrayList<String>();
            }
            ((List<String>) this.taxRates).add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item#taxRates} for the field
           * documentation.
           */
          @SuppressWarnings("unchecked")
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
              this.taxRates = new ArrayList<String>();
            }
            ((List<String>) this.taxRates).addAll(elements);
            return this;
          }

          /**
           * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
           * Rates will override the <a
           * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
           * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to
           * remove previously-defined tax rates.
           */
          public Builder setTaxRates(EmptyParam taxRates) {
            this.taxRates = taxRates;
            return this;
          }

          /**
           * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
           * Rates will override the <a
           * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
           * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to
           * remove previously-defined tax rates.
           */
          public Builder setTaxRates(List<String> taxRates) {
            this.taxRates = taxRates;
            return this;
          }

          /** Options that configure the trial on the subscription item. */
          public Builder setTrial(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial trial) {
            this.trial = trial;
            return this;
          }
        }

        @Getter
        public static class BillingThresholds {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Number of units that meets the billing threshold to advance
           * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
           * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
           * threshold</a>)
           */
          @SerializedName("usage_gte")
          Long usageGte;

          private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {
            this.extraParams = extraParams;
            this.usageGte = usageGte;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long usageGte;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.BillingThresholds
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item
                  .BillingThresholds(this.extraParams, this.usageGte);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.BillingThresholds#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.BillingThresholds#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Number of units that meets the billing threshold to
             * advance the subscription to a new billing period (e.g., it takes 10 $5 units to meet
             * a $50 <a
             * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
             * threshold</a>)
             */
            public Builder setUsageGte(Long usageGte) {
              this.usageGte = usageGte;
              return this;
            }
          }
        }

        @Getter
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          String promotionCode;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd
                    discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount#extraParams} for
             * the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            @SerializedName("type")
            Type type;

            private DiscountEnd(
                Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
              this.duration = duration;
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Duration duration;

              private Map<String, Object> extraParams;

              private Long timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount
                    .DiscountEnd(this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd
                          .Duration
                      duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              public Builder setTimestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              public Builder setType(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              @SerializedName("interval")
              Interval interval;

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              @SerializedName("interval_count")
              Long intervalCount;

              private Duration(
                  Map<String, Object> extraParams, Interval interval, Long intervalCount) {
                this.extraParams = extraParams;
                this.interval = interval;
                this.intervalCount = intervalCount;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private Interval interval;

                private Long intervalCount;

                /** Finalize and obtain parameter instance from this builder. */
                public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount
                        .DiscountEnd.Duration
                    build() {
                  return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount
                      .DiscountEnd.Duration(this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd.Duration#extraParams}
                 * for the field documentation.
                 */
                public Builder putExtraParam(String key, Object value) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.put(key, value);
                  return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd.Duration#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /**
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                public Builder setInterval(
                    InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Discount.DiscountEnd
                            .Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
                 */
                public Builder setIntervalCount(Long intervalCount) {
                  this.intervalCount = intervalCount;
                  return this;
                }
              }

              public enum Interval implements ApiRequestParams.EnumParam {
                @SerializedName("day")
                DAY("day"),

                @SerializedName("month")
                MONTH("month"),

                @SerializedName("week")
                WEEK("week"),

                @SerializedName("year")
                YEAR("year");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Interval(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("duration")
              DURATION("duration"),

              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class PriceData {
          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          @SerializedName("currency")
          String currency;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The ID of the product that this price will belong to. */
          @SerializedName("product")
          String product;

          /**
           * <strong>Required.</strong> The recurring components of a price such as {@code interval}
           * and {@code interval_count}.
           */
          @SerializedName("recurring")
          Recurring recurring;

          /**
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge.
           */
          @SerializedName("unit_amount")
          Long unitAmount;

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          @SerializedName("unit_amount_decimal")
          BigDecimal unitAmountDecimal;

          private PriceData(
              String currency,
              Map<String, Object> extraParams,
              String product,
              Recurring recurring,
              TaxBehavior taxBehavior,
              Long unitAmount,
              BigDecimal unitAmountDecimal) {
            this.currency = currency;
            this.extraParams = extraParams;
            this.product = product;
            this.recurring = recurring;
            this.taxBehavior = taxBehavior;
            this.unitAmount = unitAmount;
            this.unitAmountDecimal = unitAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String currency;

            private Map<String, Object> extraParams;

            private String product;

            private Recurring recurring;

            private TaxBehavior taxBehavior;

            private Long unitAmount;

            private BigDecimal unitAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData(
                  this.currency,
                  this.extraParams,
                  this.product,
                  this.recurring,
                  this.taxBehavior,
                  this.unitAmount,
                  this.unitAmountDecimal);
            }

            /**
             * <strong>Required.</strong> Three-letter <a
             * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
             * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
             * currency</a>.
             */
            public Builder setCurrency(String currency) {
              this.currency = currency;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData#extraParams} for
             * the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the product that this price will belong to. */
            public Builder setProduct(String product) {
              this.product = product;
              return this;
            }

            /**
             * <strong>Required.</strong> The recurring components of a price such as {@code
             * interval} and {@code interval_count}.
             */
            public Builder setRecurring(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.Recurring
                    recurring) {
              this.recurring = recurring;
              return this;
            }

            /**
             * Only required if a <a
             * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
             * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
             * price is considered inclusive of taxes or exclusive of taxes. One of {@code
             * inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
             * {@code inclusive} or {@code exclusive}, it cannot be changed.
             */
            public Builder setTaxBehavior(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }

            /**
             * A positive integer in cents (or local equivalent) (or 0 for a free price)
             * representing how much to charge.
             */
            public Builder setUnitAmount(Long unitAmount) {
              this.unitAmount = unitAmount;
              return this;
            }

            /**
             * Same as {@code unit_amount}, but accepts a decimal value in cents (or local
             * equivalent) with at most 12 decimal places. Only one of {@code unit_amount} and
             * {@code unit_amount_decimal} can be set.
             */
            public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
            }
          }

          @Getter
          public static class Recurring {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
             * week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
             * years interval allowed (3 years, 36 months, or 156 weeks).
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Recurring(
                Map<String, Object> extraParams, Interval interval, Long intervalCount) {
              this.extraParams = extraParams;
              this.interval = interval;
              this.intervalCount = intervalCount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Interval interval;

              private Long intervalCount;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.Recurring
                  build() {
                return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData
                    .Recurring(this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.Recurring#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.Recurring#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /**
               * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
               * week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.PriceData.Recurring
                          .Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * The number of intervals between subscription billings. For example, {@code
               * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
               * years interval allowed (3 years, 36 months, or 156 weeks).
               */
              public Builder setIntervalCount(Long intervalCount) {
                this.intervalCount = intervalCount;
                return this;
              }
            }

            public enum Interval implements ApiRequestParams.EnumParam {
              @SerializedName("day")
              DAY("day"),

              @SerializedName("month")
              MONTH("month"),

              @SerializedName("week")
              WEEK("week"),

              @SerializedName("year")
              YEAR("year");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Interval(String value) {
                this.value = value;
              }
            }
          }

          public enum TaxBehavior implements ApiRequestParams.EnumParam {
            @SerializedName("exclusive")
            EXCLUSIVE("exclusive"),

            @SerializedName("inclusive")
            INCLUSIVE("inclusive"),

            @SerializedName("unspecified")
            UNSPECIFIED("unspecified");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TaxBehavior(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        public static class Trial {
          /**
           * List of price IDs which, if present on the subscription following a paid trial,
           * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
           */
          @SerializedName("converts_to")
          List<String> convertsTo;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Determines the type of trial for this item. */
          @SerializedName("type")
          Type type;

          private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
            this.convertsTo = convertsTo;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<String> convertsTo;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addConvertsTo(String element) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.add(element);
              return this;
            }

            /**
             * Add all elements to `convertsTo` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addAllConvertsTo(List<String> elements) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial#extraParams} for the
             * field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Determines the type of trial for this item. */
            public Builder setType(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.Item.Trial.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

            @SerializedName("paid")
            PAID("paid");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class PauseCollection {
        /**
         * <strong>Required.</strong> The payment collection behavior for this subscription while
         * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
         */
        @SerializedName("behavior")
        Behavior behavior;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private PauseCollection(Behavior behavior, Map<String, Object> extraParams) {
          this.behavior = behavior;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Behavior behavior;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection(
                this.behavior, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The payment collection behavior for this subscription while
           * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
           */
          public Builder setBehavior(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection.Behavior
                  behavior) {
            this.behavior = behavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.PauseCollection#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        public enum Behavior implements ApiRequestParams.EnumParam {
          @SerializedName("keep_as_draft")
          KEEP_AS_DRAFT("keep_as_draft"),

          @SerializedName("mark_uncollectible")
          MARK_UNCOLLECTIBLE("mark_uncollectible"),

          @SerializedName("void")
          VOID("void");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Behavior(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class TransferData {
        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
         */
        @SerializedName("amount_percent")
        BigDecimal amountPercent;

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        @SerializedName("destination")
        String destination;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TransferData(
            BigDecimal amountPercent, String destination, Map<String, Object> extraParams) {
          this.amountPercent = amountPercent;
          this.destination = destination;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BigDecimal amountPercent;

          private String destination;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TransferData build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TransferData(
                this.amountPercent, this.destination, this.extraParams);
          }

          /**
           * A non-negative decimal between 0 and 100, with at most two decimal places. This
           * represents the percentage of the subscription invoice total that will be transferred to
           * the destination account. By default, the entire amount is transferred to the
           * destination.
           */
          public Builder setAmountPercent(BigDecimal amountPercent) {
            this.amountPercent = amountPercent;
            return this;
          }

          /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
          public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TransferData#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TransferData#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }
      }

      @Getter
      public static class TrialSettings {
        /** Defines how the subscription should behave when a trial ends. */
        @SerializedName("end_behavior")
        EndBehavior endBehavior;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
          this.endBehavior = endBehavior;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EndBehavior endBehavior;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings(
                this.endBehavior, this.extraParams);
          }

          /** Defines how the subscription should behave when a trial ends. */
          public Builder setEndBehavior(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings.EndBehavior
                  endBehavior) {
            this.endBehavior = endBehavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        @Getter
        public static class EndBehavior {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Configure how an opt-in following a paid trial is billed when using {@code
           * billing_behavior: prorate_up_front}.
           */
          @SerializedName("prorate_up_front")
          ProrateUpFront prorateUpFront;

          private EndBehavior(Map<String, Object> extraParams, ProrateUpFront prorateUpFront) {
            this.extraParams = extraParams;
            this.prorateUpFront = prorateUpFront;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ProrateUpFront prorateUpFront;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings.EndBehavior
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings
                  .EndBehavior(this.extraParams, this.prorateUpFront);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings.EndBehavior#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings.EndBehavior#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * Configure how an opt-in following a paid trial is billed when using {@code
             * billing_behavior: prorate_up_front}.
             */
            public Builder setProrateUpFront(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Phase.TrialSettings.EndBehavior
                        .ProrateUpFront
                    prorateUpFront) {
              this.prorateUpFront = prorateUpFront;
              return this;
            }
          }

          public enum ProrateUpFront implements ApiRequestParams.EnumParam {
            @SerializedName("defer")
            DEFER("defer"),

            @SerializedName("include")
            INCLUDE("include");

            @Getter(onMethod_ = {@Override})
            private final String value;

            ProrateUpFront(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("phase_start")
        PHASE_START("phase_start");

        @Getter(onMethod_ = {@Override})
        private final String value;

        BillingCycleAnchor(String value) {
          this.value = value;
        }
      }

      public enum CollectionMethod implements ApiRequestParams.EnumParam {
        @SerializedName("charge_automatically")
        CHARGE_AUTOMATICALLY("charge_automatically"),

        @SerializedName("send_invoice")
        SEND_INVOICE("send_invoice");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CollectionMethod(String value) {
          this.value = value;
        }
      }

      public enum EndDate implements ApiRequestParams.EnumParam {
        @SerializedName("now")
        NOW("now");

        @Getter(onMethod_ = {@Override})
        private final String value;

        EndDate(String value) {
          this.value = value;
        }
      }

      public enum ProrationBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("always_invoice")
        ALWAYS_INVOICE("always_invoice"),

        @SerializedName("create_prorations")
        CREATE_PRORATIONS("create_prorations"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProrationBehavior(String value) {
          this.value = value;
        }
      }

      public enum StartDate implements ApiRequestParams.EnumParam {
        @SerializedName("now")
        NOW("now");

        @Getter(onMethod_ = {@Override})
        private final String value;

        StartDate(String value) {
          this.value = value;
        }
      }

      public enum TrialContinuation implements ApiRequestParams.EnumParam {
        @SerializedName("continue")
        CONTINUE("continue"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TrialContinuation(String value) {
          this.value = value;
        }
      }

      public enum TrialEnd implements ApiRequestParams.EnumParam {
        @SerializedName("now")
        NOW("now");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TrialEnd(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Prebilling {
      /** The end of the prebilled time period. */
      @SerializedName("bill_until")
      BillUntil billUntil;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** This is used to determine the number of billing cycles to prebill. */
      @SerializedName("iterations")
      Long iterations;

      private Prebilling(BillUntil billUntil, Map<String, Object> extraParams, Long iterations) {
        this.billUntil = billUntil;
        this.extraParams = extraParams;
        this.iterations = iterations;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillUntil billUntil;

        private Map<String, Object> extraParams;

        private Long iterations;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling build() {
          return new InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling(
              this.billUntil, this.extraParams, this.iterations);
        }

        /** The end of the prebilled time period. */
        public Builder setBillUntil(
            InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This is used to determine the number of billing cycles to prebill. */
        public Builder setIterations(Long iterations) {
          this.iterations = iterations;
          return this;
        }
      }

      @Getter
      public static class BillUntil {
        /** End the prebilled period when a specified amendment ends. */
        @SerializedName("amendment_end")
        AmendmentEnd amendmentEnd;

        /** Time span for prebilling, starting from {@code bill_from}. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * End the prebilled period at a precise integer timestamp, starting from the Unix epoch.
         */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> Select one of several ways to pass the {@code bill_until}
         * value.
         */
        @SerializedName("type")
        Type type;

        private BillUntil(
            AmendmentEnd amendmentEnd,
            Duration duration,
            Map<String, Object> extraParams,
            Long timestamp,
            Type type) {
          this.amendmentEnd = amendmentEnd;
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AmendmentEnd amendmentEnd;

          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil build() {
            return new InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil(
                this.amendmentEnd, this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** End the prebilled period when a specified amendment ends. */
          public Builder setAmendmentEnd(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.AmendmentEnd
                  amendmentEnd) {
            this.amendmentEnd = amendmentEnd;
            return this;
          }

          /** Time span for prebilling, starting from {@code bill_from}. */
          public Builder setDuration(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * End the prebilled period at a precise integer timestamp, starting from the Unix epoch.
           */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> Select one of several ways to pass the {@code bill_until}
           * value.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class AmendmentEnd {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> The position of the amendment in the {@code amendments}
           * array at which prebilling should end. Indexes start from 0 and must be less than the
           * total number of supplied amendments.
           */
          @SerializedName("index")
          Long index;

          private AmendmentEnd(Map<String, Object> extraParams, Long index) {
            this.extraParams = extraParams;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.AmendmentEnd
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil
                  .AmendmentEnd(this.extraParams, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.AmendmentEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.AmendmentEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> The position of the amendment in the {@code amendments}
             * array at which prebilling should end. Indexes start from 0 and must be less than the
             * total number of supplied amendments.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        @Getter
        public static class Duration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Duration
                build() {
              return new InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                InvoiceUpcomingLinesListParams.ScheduleDetails.Prebilling.BillUntil.Duration
                        .Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("day")
            DAY("day"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week"),

            @SerializedName("year")
            YEAR("year");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("amendment_end")
          AMENDMENT_END("amendment_end"),

          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("schedule_end")
          SCHEDULE_END("schedule_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum BillingBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("prorate_on_next_phase")
      PRORATE_ON_NEXT_PHASE("prorate_on_next_phase"),

      @SerializedName("prorate_up_front")
      PRORATE_UP_FRONT("prorate_up_front");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingBehavior(String value) {
        this.value = value;
      }
    }

    public enum EndBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("cancel")
      CANCEL("cancel"),

      @SerializedName("release")
      RELEASE("release");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EndBehavior(String value) {
        this.value = value;
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("always_invoice")
      ALWAYS_INVOICE("always_invoice"),

      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class SubscriptionDetails {
    /**
     * For new subscriptions, a future timestamp to anchor the subscription's <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
     * determine the date of the first full invoice, and, for plans with {@code month} or {@code
     * year} intervals, the day of the month for subsequent invoices. For existing subscriptions,
     * the value can only be set to {@code now} or {@code unchanged}.
     */
    @SerializedName("billing_cycle_anchor")
    Object billingCycleAnchor;

    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current
     * period ends, this will cause a proration if prorations have been enabled using {@code
     * proration_behavior}. If set during a future period, this will always cause a proration for
     * that period.
     */
    @SerializedName("cancel_at")
    Object cancelAt;

    /**
     * Indicate whether this subscription should cancel at the end of the current period ({@code
     * current_period_end}). Defaults to {@code false}.
     */
    @SerializedName("cancel_at_period_end")
    Boolean cancelAtPeriodEnd;

    /** This simulates the subscription being canceled or expired immediately. */
    @SerializedName("cancel_now")
    Boolean cancelNow;

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with these
     * default tax rates. The default tax rates will apply to any line item that does not have
     * {@code tax_rates} set.
     */
    @SerializedName("default_tax_rates")
    Object defaultTaxRates;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A list of up to 20 subscription items, each with an attached price. */
    @SerializedName("items")
    List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item> items;

    /** The pre-billing to apply to the subscription as a preview. */
    @SerializedName("prebilling")
    Prebilling prebilling;

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * The default value is {@code create_prorations}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * If previewing an update to a subscription, and doing proration, {@code
     * subscription_details.proration_date} forces the proration to be calculated as though the
     * update was done at the specified time. The time given must be within the current subscription
     * period and within the current phase of the schedule backing this subscription, if the
     * schedule exists. If set, {@code subscription}, and one of {@code subscription_details.items},
     * or {@code subscription_details.trial_end} are required. Also, {@code
     * subscription_details.proration_behavior} cannot be set to 'none'.
     */
    @SerializedName("proration_date")
    Long prorationDate;

    /**
     * For paused subscriptions, setting {@code subscription_details.resume_at} to {@code now} will
     * preview the invoice that will be generated if the subscription is resumed.
     */
    @SerializedName("resume_at")
    ResumeAt resumeAt;

    /** Date a subscription is intended to start (can be future or past). */
    @SerializedName("start_date")
    Long startDate;

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of {@code subscription_details.items} or {@code subscription} is
     * required.
     */
    @SerializedName("trial_end")
    Object trialEnd;

    private SubscriptionDetails(
        Object billingCycleAnchor,
        Object cancelAt,
        Boolean cancelAtPeriodEnd,
        Boolean cancelNow,
        Object defaultTaxRates,
        Map<String, Object> extraParams,
        List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item> items,
        Prebilling prebilling,
        ProrationBehavior prorationBehavior,
        Long prorationDate,
        ResumeAt resumeAt,
        Long startDate,
        Object trialEnd) {
      this.billingCycleAnchor = billingCycleAnchor;
      this.cancelAt = cancelAt;
      this.cancelAtPeriodEnd = cancelAtPeriodEnd;
      this.cancelNow = cancelNow;
      this.defaultTaxRates = defaultTaxRates;
      this.extraParams = extraParams;
      this.items = items;
      this.prebilling = prebilling;
      this.prorationBehavior = prorationBehavior;
      this.prorationDate = prorationDate;
      this.resumeAt = resumeAt;
      this.startDate = startDate;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object billingCycleAnchor;

      private Object cancelAt;

      private Boolean cancelAtPeriodEnd;

      private Boolean cancelNow;

      private Object defaultTaxRates;

      private Map<String, Object> extraParams;

      private List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item> items;

      private Prebilling prebilling;

      private ProrationBehavior prorationBehavior;

      private Long prorationDate;

      private ResumeAt resumeAt;

      private Long startDate;

      private Object trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.SubscriptionDetails build() {
        return new InvoiceUpcomingLinesListParams.SubscriptionDetails(
            this.billingCycleAnchor,
            this.cancelAt,
            this.cancelAtPeriodEnd,
            this.cancelNow,
            this.defaultTaxRates,
            this.extraParams,
            this.items,
            this.prebilling,
            this.prorationBehavior,
            this.prorationDate,
            this.resumeAt,
            this.startDate,
            this.trialEnd);
      }

      /**
       * For new subscriptions, a future timestamp to anchor the subscription's <a
       * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used
       * to determine the date of the first full invoice, and, for plans with {@code month} or
       * {@code year} intervals, the day of the month for subsequent invoices. For existing
       * subscriptions, the value can only be set to {@code now} or {@code unchanged}.
       */
      public Builder setBillingCycleAnchor(
          InvoiceUpcomingLinesListParams.SubscriptionDetails.BillingCycleAnchor
              billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * For new subscriptions, a future timestamp to anchor the subscription's <a
       * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used
       * to determine the date of the first full invoice, and, for plans with {@code month} or
       * {@code year} intervals, the day of the month for subsequent invoices. For existing
       * subscriptions, the value can only be set to {@code now} or {@code unchanged}.
       */
      public Builder setBillingCycleAnchor(Long billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * A timestamp at which the subscription should cancel. If set to a date before the current
       * period ends, this will cause a proration if prorations have been enabled using {@code
       * proration_behavior}. If set during a future period, this will always cause a proration for
       * that period.
       */
      public Builder setCancelAt(Long cancelAt) {
        this.cancelAt = cancelAt;
        return this;
      }

      /**
       * A timestamp at which the subscription should cancel. If set to a date before the current
       * period ends, this will cause a proration if prorations have been enabled using {@code
       * proration_behavior}. If set during a future period, this will always cause a proration for
       * that period.
       */
      public Builder setCancelAt(EmptyParam cancelAt) {
        this.cancelAt = cancelAt;
        return this;
      }

      /**
       * Indicate whether this subscription should cancel at the end of the current period ({@code
       * current_period_end}). Defaults to {@code false}.
       */
      public Builder setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
        this.cancelAtPeriodEnd = cancelAtPeriodEnd;
        return this;
      }

      /** This simulates the subscription being canceled or expired immediately. */
      public Builder setCancelNow(Boolean cancelNow) {
        this.cancelNow = cancelNow;
        return this;
      }

      /**
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionDetails#defaultTaxRates} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDefaultTaxRate(String element) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `defaultTaxRates` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link InvoiceUpcomingLinesListParams.SubscriptionDetails#defaultTaxRates} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDefaultTaxRate(List<String> elements) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).addAll(elements);
        return this;
      }

      /**
       * If provided, the invoice returned will preview updating or creating a subscription with
       * these default tax rates. The default tax rates will apply to any line item that does not
       * have {@code tax_rates} set.
       */
      public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * If provided, the invoice returned will preview updating or creating a subscription with
       * these default tax rates. The default tax rates will apply to any line item that does not
       * have {@code tax_rates} set.
       */
      public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionDetails#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.SubscriptionDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionDetails#items} for the field documentation.
       */
      public Builder addItem(InvoiceUpcomingLinesListParams.SubscriptionDetails.Item element) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionDetails#items} for the field documentation.
       */
      public Builder addAllItem(
          List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item> elements) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.addAll(elements);
        return this;
      }

      /** The pre-billing to apply to the subscription as a preview. */
      public Builder setPrebilling(
          InvoiceUpcomingLinesListParams.SubscriptionDetails.Prebilling prebilling) {
        this.prebilling = prebilling;
        return this;
      }

      /**
       * Determines how to handle <a
       * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when the
       * billing cycle changes (e.g., when switching plans, resetting {@code
       * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
       * The default value is {@code create_prorations}.
       */
      public Builder setProrationBehavior(
          InvoiceUpcomingLinesListParams.SubscriptionDetails.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * If previewing an update to a subscription, and doing proration, {@code
       * subscription_details.proration_date} forces the proration to be calculated as though the
       * update was done at the specified time. The time given must be within the current
       * subscription period and within the current phase of the schedule backing this subscription,
       * if the schedule exists. If set, {@code subscription}, and one of {@code
       * subscription_details.items}, or {@code subscription_details.trial_end} are required. Also,
       * {@code subscription_details.proration_behavior} cannot be set to 'none'.
       */
      public Builder setProrationDate(Long prorationDate) {
        this.prorationDate = prorationDate;
        return this;
      }

      /**
       * For paused subscriptions, setting {@code subscription_details.resume_at} to {@code now}
       * will preview the invoice that will be generated if the subscription is resumed.
       */
      public Builder setResumeAt(
          InvoiceUpcomingLinesListParams.SubscriptionDetails.ResumeAt resumeAt) {
        this.resumeAt = resumeAt;
        return this;
      }

      /** Date a subscription is intended to start (can be future or past). */
      public Builder setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
      }

      /**
       * If provided, the invoice returned will preview updating or creating a subscription with
       * that trial end. If set, one of {@code subscription_details.items} or {@code subscription}
       * is required.
       */
      public Builder setTrialEnd(
          InvoiceUpcomingLinesListParams.SubscriptionDetails.TrialEnd trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * If provided, the invoice returned will preview updating or creating a subscription with
       * that trial end. If set, one of {@code subscription_details.items} or {@code subscription}
       * is required.
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }
    }

    @Getter
    public static class Item {
      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. When updating, pass an empty string to remove previously-defined
       * thresholds.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

      /**
       * Delete all usage for a given subscription item. You must pass this when deleting a usage
       * records subscription item. {@code clear_usage} has no effect if the plan has a billing
       * meter attached.
       */
      @SerializedName("clear_usage")
      Boolean clearUsage;

      /** A flag that, if set to {@code true}, will delete the specified item. */
      @SerializedName("deleted")
      Boolean deleted;

      /** The coupons to redeem into discounts for the subscription item. */
      @SerializedName("discounts")
      Object discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Subscription item to update. */
      @SerializedName("id")
      String id;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Object metadata;

      /** Plan ID for this item, as a string. */
      @SerializedName("plan")
      String plan;

      /**
       * The ID of the price object. One of {@code price} or {@code price_data} is required. When
       * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code
       * quantity} parameter is provided.
       */
      @SerializedName("price")
      String price;

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      @SerializedName("price_data")
      PriceData priceData;

      /** Quantity for this item. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will override the <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
       * previously-defined tax rates.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private Item(
          Object billingThresholds,
          Boolean clearUsage,
          Boolean deleted,
          Object discounts,
          Map<String, Object> extraParams,
          String id,
          Object metadata,
          String plan,
          String price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
        this.billingThresholds = billingThresholds;
        this.clearUsage = clearUsage;
        this.deleted = deleted;
        this.discounts = discounts;
        this.extraParams = extraParams;
        this.id = id;
        this.metadata = metadata;
        this.plan = plan;
        this.price = price;
        this.priceData = priceData;
        this.quantity = quantity;
        this.taxRates = taxRates;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object billingThresholds;

        private Boolean clearUsage;

        private Boolean deleted;

        private Object discounts;

        private Map<String, Object> extraParams;

        private String id;

        private Object metadata;

        private String plan;

        private String price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item build() {
          return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item(
              this.billingThresholds,
              this.clearUsage,
              this.deleted,
              this.discounts,
              this.extraParams,
              this.id,
              this.metadata,
              this.plan,
              this.price,
              this.priceData,
              this.quantity,
              this.taxRates);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. When updating, pass an empty string to remove previously-defined
         * thresholds.
         */
        public Builder setBillingThresholds(
            InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.BillingThresholds
                billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. When updating, pass an empty string to remove previously-defined
         * thresholds.
         */
        public Builder setBillingThresholds(EmptyParam billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Delete all usage for a given subscription item. You must pass this when deleting a usage
         * records subscription item. {@code clear_usage} has no effect if the plan has a billing
         * meter attached.
         */
        public Builder setClearUsage(Boolean clearUsage) {
          this.clearUsage = clearUsage;
          return this;
        }

        /** A flag that, if set to {@code true}, will delete the specified item. */
        public Builder setDeleted(Boolean deleted) {
          this.deleted = deleted;
          return this;
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#discounts} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDiscount(
            InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount element) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts =
                new ArrayList<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount>();
          }
          ((List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount>) this.discounts)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#discounts} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDiscount(
            List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount> elements) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts =
                new ArrayList<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount>();
          }
          ((List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount>) this.discounts)
              .addAll(elements);
          return this;
        }

        /** The coupons to redeem into discounts for the subscription item. */
        public Builder setDiscounts(EmptyParam discounts) {
          this.discounts = discounts;
          return this;
        }

        /** The coupons to redeem into discounts for the subscription item. */
        public Builder setDiscounts(
            List<InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount> discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Subscription item to update. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#metadata} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#metadata} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).putAll(map);
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(EmptyParam metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(Map<String, String> metadata) {
          this.metadata = metadata;
          return this;
        }

        /** Plan ID for this item, as a string. */
        public Builder setPlan(String plan) {
          this.plan = plan;
          return this;
        }

        /**
         * The ID of the price object. One of {@code price} or {@code price_data} is required. When
         * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code
         * quantity} parameter is provided.
         */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline. One of {@code price} or {@code price_data} is required.
         */
        public Builder setPriceData(
            InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /** Quantity for this item. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#taxRates} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addTaxRate(String element) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).add(element);
          return this;
        }

        /**
         * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item#taxRates} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllTaxRate(List<String> elements) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).addAll(elements);
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will override the <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
         * previously-defined tax rates.
         */
        public Builder setTaxRates(EmptyParam taxRates) {
          this.taxRates = taxRates;
          return this;
        }

        /**
         * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax
         * Rates will override the <a
         * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
         * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
         * previously-defined tax rates.
         */
        public Builder setTaxRates(List<String> taxRates) {
          this.taxRates = taxRates;
          return this;
        }
      }

      @Getter
      public static class BillingThresholds {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Number of units that meets the billing threshold to advance
         * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
         * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
         * threshold</a>)
         */
        @SerializedName("usage_gte")
        Long usageGte;

        private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {
          this.extraParams = extraParams;
          this.usageGte = usageGte;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long usageGte;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.BillingThresholds build() {
            return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.BillingThresholds(
                this.extraParams, this.usageGte);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.BillingThresholds#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.BillingThresholds#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Number of units that meets the billing threshold to advance
           * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
           * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
           * threshold</a>)
           */
          public Builder setUsageGte(Long usageGte) {
            this.usageGte = usageGte;
            return this;
          }
        }
      }

      @Getter
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        String coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        String discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** ID of the promotion code to create a new discount for. */
        @SerializedName("promotion_code")
        String promotionCode;

        private Discount(
            String coupon,
            String discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            String promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private String promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount build() {
            return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd
                  discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        public static class DiscountEnd {
          /** Time span for the redeemed discount. */
          @SerializedName("duration")
          Duration duration;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(
              Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
            this.duration = duration;
            this.extraParams = extraParams;
            this.timestamp = timestamp;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Duration duration;

            private Map<String, Object> extraParams;

            private Long timestamp;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd
                build() {
              return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount
                  .DiscountEnd(this.duration, this.extraParams, this.timestamp, this.type);
            }

            /** Time span for the redeemed discount. */
            public Builder setDuration(
                InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd
                        .Duration
                    duration) {
              this.duration = duration;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class Duration {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Duration(
                Map<String, Object> extraParams, Interval interval, Long intervalCount) {
              this.extraParams = extraParams;
              this.interval = interval;
              this.intervalCount = intervalCount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Interval interval;

              private Long intervalCount;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd
                      .Duration
                  build() {
                return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount
                    .DiscountEnd.Duration(this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd.Duration#extraParams}
               * for the field documentation.
               */
              public Builder putExtraParam(String key, Object value) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
              }

              /**
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd.Duration#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.Discount.DiscountEnd
                          .Duration.Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              public Builder setIntervalCount(Long intervalCount) {
                this.intervalCount = intervalCount;
                return this;
              }
            }

            public enum Interval implements ApiRequestParams.EnumParam {
              @SerializedName("day")
              DAY("day"),

              @SerializedName("month")
              MONTH("month"),

              @SerializedName("week")
              WEEK("week"),

              @SerializedName("year")
              YEAR("year");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Interval(String value) {
                this.value = value;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("duration")
            DURATION("duration"),

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
        @SerializedName("product")
        String product;

        /**
         * <strong>Required.</strong> The recurring components of a price such as {@code interval}
         * and {@code interval_count}.
         */
        @SerializedName("recurring")
        Recurring recurring;

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        @SerializedName("unit_amount_decimal")
        BigDecimal unitAmountDecimal;

        private PriceData(
            String currency,
            Map<String, Object> extraParams,
            String product,
            Recurring recurring,
            TaxBehavior taxBehavior,
            Long unitAmount,
            BigDecimal unitAmountDecimal) {
          this.currency = currency;
          this.extraParams = extraParams;
          this.product = product;
          this.recurring = recurring;
          this.taxBehavior = taxBehavior;
          this.unitAmount = unitAmount;
          this.unitAmountDecimal = unitAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String currency;

          private Map<String, Object> extraParams;

          private String product;

          private Recurring recurring;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private BigDecimal unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData build() {
            return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.recurring,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID of the product that this price will belong to. */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The recurring components of a price such as {@code interval}
           * and {@code interval_count}.
           */
          public Builder setRecurring(
              InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.Recurring
                  recurring) {
            this.recurring = recurring;
            return this;
          }

          /**
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(
              InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.TaxBehavior
                  taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge.
           */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        @Getter
        public static class Recurring {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Recurring(
              Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.Recurring
                build() {
              return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData
                  .Recurring(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.Recurring#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.Recurring#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
             * week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                InvoiceUpcomingLinesListParams.SubscriptionDetails.Item.PriceData.Recurring.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
             * years interval allowed (3 years, 36 months, or 156 weeks).
             */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("day")
            DAY("day"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week"),

            @SerializedName("year")
            YEAR("year");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }
        }

        public enum TaxBehavior implements ApiRequestParams.EnumParam {
          @SerializedName("exclusive")
          EXCLUSIVE("exclusive"),

          @SerializedName("inclusive")
          INCLUSIVE("inclusive"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxBehavior(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class Prebilling {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> This is used to determine the number of billing cycles to
       * prebill.
       */
      @SerializedName("iterations")
      Long iterations;

      private Prebilling(Map<String, Object> extraParams, Long iterations) {
        this.extraParams = extraParams;
        this.iterations = iterations;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long iterations;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.SubscriptionDetails.Prebilling build() {
          return new InvoiceUpcomingLinesListParams.SubscriptionDetails.Prebilling(
              this.extraParams, this.iterations);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Prebilling#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionDetails.Prebilling#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> This is used to determine the number of billing cycles to
         * prebill.
         */
        public Builder setIterations(Long iterations) {
          this.iterations = iterations;
          return this;
        }
      }
    }

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now"),

      @SerializedName("unchanged")
      UNCHANGED("unchanged");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
        this.value = value;
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("always_invoice")
      ALWAYS_INVOICE("always_invoice"),

      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }

    public enum ResumeAt implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ResumeAt(String value) {
        this.value = value;
      }
    }

    public enum TrialEnd implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TrialEnd(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class SubscriptionItem {
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. When updating, pass an empty string to remove previously-defined thresholds.
     */
    @SerializedName("billing_thresholds")
    Object billingThresholds;

    /**
     * Delete all usage for a given subscription item. You must pass this when deleting a usage
     * records subscription item. {@code clear_usage} has no effect if the plan has a billing meter
     * attached.
     */
    @SerializedName("clear_usage")
    Boolean clearUsage;

    /** A flag that, if set to {@code true}, will delete the specified item. */
    @SerializedName("deleted")
    Boolean deleted;

    /** The coupons to redeem into discounts for the subscription item. */
    @SerializedName("discounts")
    Object discounts;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Subscription item to update. */
    @SerializedName("id")
    String id;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /** Plan ID for this item, as a string. */
    @SerializedName("plan")
    String plan;

    /**
     * The ID of the price object. One of {@code price} or {@code price_data} is required. When
     * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code quantity}
     * parameter is provided.
     */
    @SerializedName("price")
    String price;

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /** Quantity for this item. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
     * will override the <a
     * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
     * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
     * previously-defined tax rates.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    private SubscriptionItem(
        Object billingThresholds,
        Boolean clearUsage,
        Boolean deleted,
        Object discounts,
        Map<String, Object> extraParams,
        String id,
        Object metadata,
        String plan,
        String price,
        PriceData priceData,
        Long quantity,
        Object taxRates) {
      this.billingThresholds = billingThresholds;
      this.clearUsage = clearUsage;
      this.deleted = deleted;
      this.discounts = discounts;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.plan = plan;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
      this.taxRates = taxRates;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object billingThresholds;

      private Boolean clearUsage;

      private Boolean deleted;

      private Object discounts;

      private Map<String, Object> extraParams;

      private String id;

      private Object metadata;

      private String plan;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.SubscriptionItem build() {
        return new InvoiceUpcomingLinesListParams.SubscriptionItem(
            this.billingThresholds,
            this.clearUsage,
            this.deleted,
            this.discounts,
            this.extraParams,
            this.id,
            this.metadata,
            this.plan,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates);
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. When updating, pass an empty string to remove previously-defined
       * thresholds.
       */
      public Builder setBillingThresholds(
          InvoiceUpcomingLinesListParams.SubscriptionItem.BillingThresholds billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. When updating, pass an empty string to remove previously-defined
       * thresholds.
       */
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Delete all usage for a given subscription item. You must pass this when deleting a usage
       * records subscription item. {@code clear_usage} has no effect if the plan has a billing
       * meter attached.
       */
      public Builder setClearUsage(Boolean clearUsage) {
        this.clearUsage = clearUsage;
        return this;
      }

      /** A flag that, if set to {@code true}, will delete the specified item. */
      public Builder setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(InvoiceUpcomingLinesListParams.SubscriptionItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts =
              new ArrayList<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount>();
        }
        ((List<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount>) this.discounts)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(
          List<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts =
              new ArrayList<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount>();
        }
        ((List<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount>) this.discounts)
            .addAll(elements);
        return this;
      }

      /** The coupons to redeem into discounts for the subscription item. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The coupons to redeem into discounts for the subscription item. */
      public Builder setDiscounts(
          List<InvoiceUpcomingLinesListParams.SubscriptionItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.SubscriptionItem#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Subscription item to update. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#metadata} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.SubscriptionItem#metadata} for the field
       * documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null || this.metadata instanceof EmptyParam) {
          this.metadata = new HashMap<String, String>();
        }
        ((Map<String, String>) this.metadata).putAll(map);
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /** Plan ID for this item, as a string. */
      public Builder setPlan(String plan) {
        this.plan = plan;
        return this;
      }

      /**
       * The ID of the price object. One of {@code price} or {@code price_data} is required. When
       * changing a subscription item's price, {@code quantity} is set to 1 unless a {@code
       * quantity} parameter is provided.
       */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(
          InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /** Quantity for this item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addTaxRate(String element) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will override the <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
       * previously-defined tax rates.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will override the <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a> on the Subscription. When updating, pass an empty string to remove
       * previously-defined tax rates.
       */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }
    }

    @Getter
    public static class BillingThresholds {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Number of units that meets the billing threshold to advance the
       * subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
       * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
       * threshold</a>)
       */
      @SerializedName("usage_gte")
      Long usageGte;

      private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {
        this.extraParams = extraParams;
        this.usageGte = usageGte;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long usageGte;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.SubscriptionItem.BillingThresholds build() {
          return new InvoiceUpcomingLinesListParams.SubscriptionItem.BillingThresholds(
              this.extraParams, this.usageGte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionItem.BillingThresholds#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceUpcomingLinesListParams.SubscriptionItem.BillingThresholds#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Number of units that meets the billing threshold to advance
         * the subscription to a new billing period (e.g., it takes 10 $5 units to meet a $50 <a
         * href="https://stripe.com/docs/api/subscriptions/update#update_subscription-billing_thresholds-amount_gte">monetary
         * threshold</a>)
         */
        public Builder setUsageGte(Long usageGte) {
          this.usageGte = usageGte;
          return this;
        }
      }
    }

    @Getter
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      String coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      String discount;

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the promotion code to create a new discount for. */
      @SerializedName("promotion_code")
      String promotionCode;

      private Discount(
          String coupon,
          String discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          String promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String coupon;

        private String discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private String promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.SubscriptionItem.Discount build() {
          return new InvoiceUpcomingLinesListParams.SubscriptionItem.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(
            InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionItem.Discount#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionItem.Discount#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(String promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** Time span for the redeemed discount. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        @SerializedName("type")
        Type type;

        private DiscountEnd(
            Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd build() {
            return new InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          public Builder setType(
              InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Duration
                build() {
              return new InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Duration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                InvoiceUpcomingLinesListParams.SubscriptionItem.Discount.DiscountEnd.Duration
                        .Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("day")
            DAY("day"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week"),

            @SerializedName("year")
            YEAR("year");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      @SerializedName("product")
      String product;

      /**
       * <strong>Required.</strong> The recurring components of a price such as {@code interval} and
       * {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          Recurring recurring,
          TaxBehavior taxBehavior,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.recurring = recurring;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String currency;

        private Map<String, Object> extraParams;

        private String product;

        private Recurring recurring;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData build() {
          return new InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.recurring,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * <strong>Required.</strong> The recurring components of a price such as {@code interval}
         * and {@code interval_count}.
         */
        public Builder setRecurring(
            InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      @Getter
      public static class Recurring {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three years
         * interval allowed (3 years, 36 months, or 156 weeks).
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Recurring(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring build() {
            return new InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              InvoiceUpcomingLinesListParams.SubscriptionItem.PriceData.Recurring.Interval
                  interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class SubscriptionPrebilling {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> This is used to determine the number of billing cycles to prebill.
     */
    @SerializedName("iterations")
    Long iterations;

    private SubscriptionPrebilling(Map<String, Object> extraParams, Long iterations) {
      this.extraParams = extraParams;
      this.iterations = iterations;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long iterations;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpcomingLinesListParams.SubscriptionPrebilling build() {
        return new InvoiceUpcomingLinesListParams.SubscriptionPrebilling(
            this.extraParams, this.iterations);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingLinesListParams.SubscriptionPrebilling#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingLinesListParams.SubscriptionPrebilling#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> This is used to determine the number of billing cycles to
       * prebill.
       */
      public Builder setIterations(Long iterations) {
        this.iterations = iterations;
        return this;
      }
    }
  }

  public enum PreviewMode implements ApiRequestParams.EnumParam {
    @SerializedName("next")
    NEXT("next"),

    @SerializedName("recurring")
    RECURRING("recurring");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PreviewMode(String value) {
      this.value = value;
    }
  }

  public enum SubscriptionBillingCycleAnchor implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now"),

    @SerializedName("unchanged")
    UNCHANGED("unchanged");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubscriptionBillingCycleAnchor(String value) {
      this.value = value;
    }
  }

  public enum SubscriptionProrationBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("always_invoice")
    ALWAYS_INVOICE("always_invoice"),

    @SerializedName("create_prorations")
    CREATE_PRORATIONS("create_prorations"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubscriptionProrationBehavior(String value) {
      this.value = value;
    }
  }

  public enum SubscriptionResumeAt implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubscriptionResumeAt(String value) {
      this.value = value;
    }
  }

  public enum SubscriptionTrialEnd implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubscriptionTrialEnd(String value) {
      this.value = value;
    }
  }
}
