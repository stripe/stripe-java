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
public class InvoiceUpcomingParams extends ApiRequestParams {
  /**
   * The code of the coupon to apply. If {@code subscription} or {@code subscription_items} is
   * provided, the invoice returned will preview updating or creating a subscription with that
   * coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming
   * invoice from among the customer's subscriptions. The invoice can be previewed without a coupon
   * by passing this value as an empty string.
   */
  @SerializedName("coupon")
  String coupon;

  /** The identifier of the customer whose upcoming invoice you'd like to retrieve. */
  @SerializedName("customer")
  String customer;

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

  /** List of invoice items to add or update in the upcoming invoice preview. */
  @SerializedName("invoice_items")
  List<InvoiceItem> invoiceItems;

  /**
   * The identifier of the unstarted schedule whose upcoming invoice you'd like to retrieve. Cannot
   * be used with subscription or subscription fields.
   */
  @SerializedName("schedule")
  String schedule;

  /**
   * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If
   * not provided, but a {@code subscription_items} is provided, you will preview creating a
   * subscription with those items. If neither {@code subscription} nor {@code subscription_items}
   * is provided, you will retrieve the next upcoming invoice from among the customer's
   * subscriptions.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * For new subscriptions, a future timestamp to anchor the subscription's <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
   * determine the date of the first full invoice, and, for plans with {@code month} or {@code year}
   * intervals, the day of the month for subsequent invoices. For existing subscriptions, the value
   * can only be set to {@code now} or {@code unchanged}.
   */
  @SerializedName("subscription_billing_cycle_anchor")
  Object subscriptionBillingCycleAnchor;

  /**
   * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
   * within the current period and prorations have been enabled using {@code proration_behavior}.`
   */
  @SerializedName("subscription_cancel_at")
  Object subscriptionCancelAt;

  /**
   * Boolean indicating whether this subscription should cancel at the end of the current period.
   */
  @SerializedName("subscription_cancel_at_period_end")
  Boolean subscriptionCancelAtPeriodEnd;

  /** This simulates the subscription being canceled or expired immediately. */
  @SerializedName("subscription_cancel_now")
  Boolean subscriptionCancelNow;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with these
   * default tax rates. The default tax rates will apply to any line item that does not have {@code
   * tax_rates} set.
   */
  @SerializedName("subscription_default_tax_rates")
  Object subscriptionDefaultTaxRates;

  /** List of subscription items, each with an attached plan. */
  @SerializedName("subscription_items")
  List<SubscriptionItem> subscriptionItems;

  /**
   * This field has been renamed to {@code subscription_proration_behavior}. {@code
   * subscription_prorate=true} can be replaced with {@code
   * subscription_proration_behavior=create_prorations} and {@code subscription_prorate=false} can
   * be replaced with {@code subscription_proration_behavior=none}.
   */
  @SerializedName("subscription_prorate")
  Boolean subscriptionProrate;

  /**
   * Determines how to handle <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
   * billing cycle changes (e.g., when switching plans, resetting {@code billing_cycle_anchor=now},
   * or starting a trial), or if an item's {@code quantity} changes. Valid values are {@code
   * create_prorations}, {@code none}, or {@code always_invoice}.
   *
   * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
   * applicable. These proration items will only be invoiced immediately under <a
   * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
   * conditions</a>. In order to always invoice immediately for prorations, pass {@code
   * always_invoice}.
   *
   * <p>Prorations can be disabled by passing {@code none}.
   */
  @SerializedName("subscription_proration_behavior")
  SubscriptionProrationBehavior subscriptionProrationBehavior;

  /**
   * If previewing an update to a subscription, and doing proration, {@code
   * subscription_proration_date} forces the proration to be calculated as though the update was
   * done at the specified time. The time given must be within the current subscription period, and
   * cannot be before the subscription was on its current plan. If set, {@code subscription}, and
   * one of {@code subscription_items}, or {@code subscription_trial_end} are required. Also, {@code
   * subscription_proration} cannot be set to false.
   */
  @SerializedName("subscription_proration_date")
  Long subscriptionProrationDate;

  /** Date a subscription is intended to start (can be future or past). */
  @SerializedName("subscription_start_date")
  Long subscriptionStartDate;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with that
   * tax percent. If set, one of {@code subscription_items} or {@code subscription} is required.
   * This field has been deprecated and will be removed in a future API version, for further
   * information view the <a href="https://stripe.com/docs/billing/migration/taxes">migration
   * docs</a> for {@code tax_rates}.
   */
  @SerializedName("subscription_tax_percent")
  BigDecimal subscriptionTaxPercent;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with that
   * trial end. If set, one of {@code subscription_items} or {@code subscription} is required.
   */
  @SerializedName("subscription_trial_end")
  Object subscriptionTrialEnd;

  /**
   * Indicates if a plan's {@code trial_period_days} should be applied to the subscription. Setting
   * {@code subscription_trial_end} per subscription is preferred, and this defaults to {@code
   * false}. Setting this flag to {@code true} together with {@code subscription_trial_end} is not
   * allowed.
   */
  @SerializedName("subscription_trial_from_plan")
  Boolean subscriptionTrialFromPlan;

  private InvoiceUpcomingParams(
      String coupon,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      List<InvoiceItem> invoiceItems,
      String schedule,
      String subscription,
      Object subscriptionBillingCycleAnchor,
      Object subscriptionCancelAt,
      Boolean subscriptionCancelAtPeriodEnd,
      Boolean subscriptionCancelNow,
      Object subscriptionDefaultTaxRates,
      List<SubscriptionItem> subscriptionItems,
      Boolean subscriptionProrate,
      SubscriptionProrationBehavior subscriptionProrationBehavior,
      Long subscriptionProrationDate,
      Long subscriptionStartDate,
      BigDecimal subscriptionTaxPercent,
      Object subscriptionTrialEnd,
      Boolean subscriptionTrialFromPlan) {
    this.coupon = coupon;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceItems = invoiceItems;
    this.schedule = schedule;
    this.subscription = subscription;
    this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
    this.subscriptionCancelAt = subscriptionCancelAt;
    this.subscriptionCancelAtPeriodEnd = subscriptionCancelAtPeriodEnd;
    this.subscriptionCancelNow = subscriptionCancelNow;
    this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
    this.subscriptionItems = subscriptionItems;
    this.subscriptionProrate = subscriptionProrate;
    this.subscriptionProrationBehavior = subscriptionProrationBehavior;
    this.subscriptionProrationDate = subscriptionProrationDate;
    this.subscriptionStartDate = subscriptionStartDate;
    this.subscriptionTaxPercent = subscriptionTaxPercent;
    this.subscriptionTrialEnd = subscriptionTrialEnd;
    this.subscriptionTrialFromPlan = subscriptionTrialFromPlan;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String coupon;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<InvoiceItem> invoiceItems;

    private String schedule;

    private String subscription;

    private Object subscriptionBillingCycleAnchor;

    private Object subscriptionCancelAt;

    private Boolean subscriptionCancelAtPeriodEnd;

    private Boolean subscriptionCancelNow;

    private Object subscriptionDefaultTaxRates;

    private List<SubscriptionItem> subscriptionItems;

    private Boolean subscriptionProrate;

    private SubscriptionProrationBehavior subscriptionProrationBehavior;

    private Long subscriptionProrationDate;

    private Long subscriptionStartDate;

    private BigDecimal subscriptionTaxPercent;

    private Object subscriptionTrialEnd;

    private Boolean subscriptionTrialFromPlan;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceUpcomingParams build() {
      return new InvoiceUpcomingParams(
          this.coupon,
          this.customer,
          this.expand,
          this.extraParams,
          this.invoiceItems,
          this.schedule,
          this.subscription,
          this.subscriptionBillingCycleAnchor,
          this.subscriptionCancelAt,
          this.subscriptionCancelAtPeriodEnd,
          this.subscriptionCancelNow,
          this.subscriptionDefaultTaxRates,
          this.subscriptionItems,
          this.subscriptionProrate,
          this.subscriptionProrationBehavior,
          this.subscriptionProrationDate,
          this.subscriptionStartDate,
          this.subscriptionTaxPercent,
          this.subscriptionTrialEnd,
          this.subscriptionTrialFromPlan);
    }

    /**
     * The code of the coupon to apply. If {@code subscription} or {@code subscription_items} is
     * provided, the invoice returned will preview updating or creating a subscription with that
     * coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming
     * invoice from among the customer's subscriptions. The invoice can be previewed without a
     * coupon by passing this value as an empty string.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /** The identifier of the customer whose upcoming invoice you'd like to retrieve. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingParams#expand} for the field documentation.
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
     * InvoiceUpcomingParams#expand} for the field documentation.
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
     * InvoiceUpcomingParams#extraParams} for the field documentation.
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
     * See {@link InvoiceUpcomingParams#extraParams} for the field documentation.
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
     * InvoiceUpcomingParams#invoiceItems} for the field documentation.
     */
    public Builder addInvoiceItem(InvoiceItem element) {
      if (this.invoiceItems == null) {
        this.invoiceItems = new ArrayList<>();
      }
      this.invoiceItems.add(element);
      return this;
    }

    /**
     * Add all elements to `invoiceItems` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingParams#invoiceItems} for the field documentation.
     */
    public Builder addAllInvoiceItem(List<InvoiceItem> elements) {
      if (this.invoiceItems == null) {
        this.invoiceItems = new ArrayList<>();
      }
      this.invoiceItems.addAll(elements);
      return this;
    }

    /**
     * The identifier of the unstarted schedule whose upcoming invoice you'd like to retrieve.
     * Cannot be used with subscription or subscription fields.
     */
    public Builder setSchedule(String schedule) {
      this.schedule = schedule;
      return this;
    }

    /**
     * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If
     * not provided, but a {@code subscription_items} is provided, you will preview creating a
     * subscription with those items. If neither {@code subscription} nor {@code subscription_items}
     * is provided, you will retrieve the next upcoming invoice from among the customer's
     * subscriptions.
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
     * the value can only be set to {@code now} or {@code unchanged}.
     */
    public Builder setSubscriptionBillingCycleAnchor(
        SubscriptionBillingCycleAnchor subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * For new subscriptions, a future timestamp to anchor the subscription's <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle">billing cycle</a>. This is used to
     * determine the date of the first full invoice, and, for plans with {@code month} or {@code
     * year} intervals, the day of the month for subsequent invoices. For existing subscriptions,
     * the value can only be set to {@code now} or {@code unchanged}.
     */
    public Builder setSubscriptionBillingCycleAnchor(Long subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
     * within the current period and prorations have been enabled using {@code proration_behavior}.`
     */
    public Builder setSubscriptionCancelAt(Long subscriptionCancelAt) {
      this.subscriptionCancelAt = subscriptionCancelAt;
      return this;
    }

    /**
     * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
     * within the current period and prorations have been enabled using {@code proration_behavior}.`
     */
    public Builder setSubscriptionCancelAt(EmptyParam subscriptionCancelAt) {
      this.subscriptionCancelAt = subscriptionCancelAt;
      return this;
    }

    /**
     * Boolean indicating whether this subscription should cancel at the end of the current period.
     */
    public Builder setSubscriptionCancelAtPeriodEnd(Boolean subscriptionCancelAtPeriodEnd) {
      this.subscriptionCancelAtPeriodEnd = subscriptionCancelAtPeriodEnd;
      return this;
    }

    /** This simulates the subscription being canceled or expired immediately. */
    public Builder setSubscriptionCancelNow(Boolean subscriptionCancelNow) {
      this.subscriptionCancelNow = subscriptionCancelNow;
      return this;
    }

    /**
     * Add an element to `subscriptionDefaultTaxRates` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceUpcomingParams#subscriptionDefaultTaxRates} for the field documentation.
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
     * {@link InvoiceUpcomingParams#subscriptionDefaultTaxRates} for the field documentation.
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
     * {@code tax_rates} set.
     */
    public Builder setSubscriptionDefaultTaxRates(EmptyParam subscriptionDefaultTaxRates) {
      this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with these
     * default tax rates. The default tax rates will apply to any line item that does not have
     * {@code tax_rates} set.
     */
    public Builder setSubscriptionDefaultTaxRates(List<String> subscriptionDefaultTaxRates) {
      this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
      return this;
    }

    /**
     * Add an element to `subscriptionItems` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpcomingParams#subscriptionItems} for the field documentation.
     */
    public Builder addSubscriptionItem(SubscriptionItem element) {
      if (this.subscriptionItems == null) {
        this.subscriptionItems = new ArrayList<>();
      }
      this.subscriptionItems.add(element);
      return this;
    }

    /**
     * Add all elements to `subscriptionItems` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceUpcomingParams#subscriptionItems} for the field documentation.
     */
    public Builder addAllSubscriptionItem(List<SubscriptionItem> elements) {
      if (this.subscriptionItems == null) {
        this.subscriptionItems = new ArrayList<>();
      }
      this.subscriptionItems.addAll(elements);
      return this;
    }

    /**
     * This field has been renamed to {@code subscription_proration_behavior}. {@code
     * subscription_prorate=true} can be replaced with {@code
     * subscription_proration_behavior=create_prorations} and {@code subscription_prorate=false} can
     * be replaced with {@code subscription_proration_behavior=none}.
     */
    public Builder setSubscriptionProrate(Boolean subscriptionProrate) {
      this.subscriptionProrate = subscriptionProrate;
      return this;
    }

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * Valid values are {@code create_prorations}, {@code none}, or {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
     * conditions</a>. In order to always invoice immediately for prorations, pass {@code
     * always_invoice}.
     *
     * <p>Prorations can be disabled by passing {@code none}.
     */
    public Builder setSubscriptionProrationBehavior(
        SubscriptionProrationBehavior subscriptionProrationBehavior) {
      this.subscriptionProrationBehavior = subscriptionProrationBehavior;
      return this;
    }

    /**
     * If previewing an update to a subscription, and doing proration, {@code
     * subscription_proration_date} forces the proration to be calculated as though the update was
     * done at the specified time. The time given must be within the current subscription period,
     * and cannot be before the subscription was on its current plan. If set, {@code subscription},
     * and one of {@code subscription_items}, or {@code subscription_trial_end} are required. Also,
     * {@code subscription_proration} cannot be set to false.
     */
    public Builder setSubscriptionProrationDate(Long subscriptionProrationDate) {
      this.subscriptionProrationDate = subscriptionProrationDate;
      return this;
    }

    /** Date a subscription is intended to start (can be future or past). */
    public Builder setSubscriptionStartDate(Long subscriptionStartDate) {
      this.subscriptionStartDate = subscriptionStartDate;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * tax percent. If set, one of {@code subscription_items} or {@code subscription} is required.
     * This field has been deprecated and will be removed in a future API version, for further
     * information view the <a href="https://stripe.com/docs/billing/migration/taxes">migration
     * docs</a> for {@code tax_rates}.
     */
    public Builder setSubscriptionTaxPercent(BigDecimal subscriptionTaxPercent) {
      this.subscriptionTaxPercent = subscriptionTaxPercent;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of {@code subscription_items} or {@code subscription} is required.
     */
    public Builder setSubscriptionTrialEnd(SubscriptionTrialEnd subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of {@code subscription_items} or {@code subscription} is required.
     */
    public Builder setSubscriptionTrialEnd(Long subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * Indicates if a plan's {@code trial_period_days} should be applied to the subscription.
     * Setting {@code subscription_trial_end} per subscription is preferred, and this defaults to
     * {@code false}. Setting this flag to {@code true} together with {@code subscription_trial_end}
     * is not allowed.
     */
    public Builder setSubscriptionTrialFromPlan(Boolean subscriptionTrialFromPlan) {
      this.subscriptionTrialFromPlan = subscriptionTrialFromPlan;
      return this;
    }
  }

  @Getter
  public static class InvoiceItem {
    /** The integer amount in <strong>%s</strong> of previewed invoice item. */
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
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /** The period associated with this invoice item. */
    @SerializedName("period")
    Period period;

    /** The ID of the price object. */
    @SerializedName("price")
    String price;

    /** Data used to generate a new price object inline. */
    @SerializedName("price_data")
    PriceData priceData;

    /** Non-negative integer. The quantity of units for the invoice item. */
    @SerializedName("quantity")
    Long quantity;

    @SerializedName("tax_rates")
    Object taxRates;

    /**
     * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
     * invoice. This unit_amount will be multiplied by the quantity to get the full amount. If you
     * want to apply a credit to the customer's account, pass a negative unit_amount.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as {@code unit_amount}, but accepts a decimal string with at most 12 decimal places.
     * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    private InvoiceItem(
        Long amount,
        String currency,
        String description,
        Boolean discountable,
        Map<String, Object> extraParams,
        String invoiceitem,
        Object metadata,
        Period period,
        String price,
        PriceData priceData,
        Long quantity,
        Object taxRates,
        Long unitAmount,
        BigDecimal unitAmountDecimal) {
      this.amount = amount;
      this.currency = currency;
      this.description = description;
      this.discountable = discountable;
      this.extraParams = extraParams;
      this.invoiceitem = invoiceitem;
      this.metadata = metadata;
      this.period = period;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
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

      private Map<String, Object> extraParams;

      private String invoiceitem;

      private Object metadata;

      private Period period;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      private Long unitAmount;

      private BigDecimal unitAmountDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceItem build() {
        return new InvoiceItem(
            this.amount,
            this.currency,
            this.description,
            this.discountable,
            this.extraParams,
            this.invoiceitem,
            this.metadata,
            this.period,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /** The integer amount in <strong>%s</strong> of previewed invoice item. */
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingParams.InvoiceItem#extraParams} for the field documentation.
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
       * See {@link InvoiceUpcomingParams.InvoiceItem#extraParams} for the field documentation.
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
       * InvoiceUpcomingParams.InvoiceItem#metadata} for the field documentation.
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
       * See {@link InvoiceUpcomingParams.InvoiceItem#metadata} for the field documentation.
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
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format. Individual keys can be
       * unset by posting an empty value to them. All keys can be unset by posting an empty value to
       * {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format. Individual keys can be
       * unset by posting an empty value to them. All keys can be unset by posting an empty value to
       * {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /** The period associated with this invoice item. */
      public Builder setPeriod(Period period) {
        this.period = period;
        return this;
      }

      /** The ID of the price object. */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /** Data used to generate a new price object inline. */
      public Builder setPriceData(PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /** Non-negative integer. The quantity of units for the invoice item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * InvoiceUpcomingParams.InvoiceItem#taxRates} for the field documentation.
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
       * InvoiceUpcomingParams.InvoiceItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The integer unit amount in <strong>%s</strong> of the charge to be applied to the upcoming
       * invoice. This unit_amount will be multiplied by the quantity to get the full amount. If you
       * want to apply a credit to the customer's account, pass a negative unit_amount.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as {@code unit_amount}, but accepts a decimal string with at most 12 decimal places.
       * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
      }
    }

    @Getter
    public static class Period {
      /** The end of the period, which must be greater than or equal to the start. */
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

      /** The start of the period. */
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
        public Period build() {
          return new Period(this.end, this.extraParams, this.start);
        }

        /** The end of the period, which must be greater than or equal to the start. */
        public Builder setEnd(Long end) {
          this.end = end;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingParams.InvoiceItem.Period#extraParams} for the field
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
         * map. See {@link InvoiceUpcomingParams.InvoiceItem.Period#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The start of the period. */
        public Builder setStart(Long start) {
          this.start = start;
          return this;
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
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

      /** The ID of the product that this price will belong to. */
      @SerializedName("product")
      String product;

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
       * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
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

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public PriceData build() {
          return new PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.unitAmount,
              this.unitAmountDecimal);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingParams.InvoiceItem.PriceData#extraParams} for the field
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
         * map. See {@link InvoiceUpcomingParams.InvoiceItem.PriceData#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
         * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
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
     * Delete all usage for a given subscription item. Allowed only when {@code deleted} is set to
     * {@code true} and the current plan's {@code usage_type} is {@code metered}.
     */
    @SerializedName("clear_usage")
    Boolean clearUsage;

    /** A flag that, if set to {@code true}, will delete the specified item. */
    @SerializedName("deleted")
    Boolean deleted;

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
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to {@code
     * metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /** Plan ID for this item, as a string. */
    @SerializedName("plan")
    String plan;

    /** The ID of the price object. */
    @SerializedName("price")
    String price;

    /** Data used to generate a new price object inline. */
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

      private Map<String, Object> extraParams;

      private String id;

      private Object metadata;

      private String plan;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionItem build() {
        return new SubscriptionItem(
            this.billingThresholds,
            this.clearUsage,
            this.deleted,
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
      public Builder setBillingThresholds(BillingThresholds billingThresholds) {
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
       * Delete all usage for a given subscription item. Allowed only when {@code deleted} is set to
       * {@code true} and the current plan's {@code usage_type} is {@code metered}.
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpcomingParams.SubscriptionItem#extraParams} for the field documentation.
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
       * See {@link InvoiceUpcomingParams.SubscriptionItem#extraParams} for the field documentation.
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
       * InvoiceUpcomingParams.SubscriptionItem#metadata} for the field documentation.
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
       * See {@link InvoiceUpcomingParams.SubscriptionItem#metadata} for the field documentation.
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
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format. Individual keys can be
       * unset by posting an empty value to them. All keys can be unset by posting an empty value to
       * {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format. Individual keys can be
       * unset by posting an empty value to them. All keys can be unset by posting an empty value to
       * {@code metadata}.
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

      /** The ID of the price object. */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /** Data used to generate a new price object inline. */
      public Builder setPriceData(PriceData priceData) {
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
       * InvoiceUpcomingParams.SubscriptionItem#taxRates} for the field documentation.
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
       * InvoiceUpcomingParams.SubscriptionItem#taxRates} for the field documentation.
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

      /** Usage threshold that triggers the subscription to advance to a new billing period. */
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
        public BillingThresholds build() {
          return new BillingThresholds(this.extraParams, this.usageGte);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingParams.SubscriptionItem.BillingThresholds#extraParams} for
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
         * map. See {@link InvoiceUpcomingParams.SubscriptionItem.BillingThresholds#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Usage threshold that triggers the subscription to advance to a new billing period. */
        public Builder setUsageGte(Long usageGte) {
          this.usageGte = usageGte;
          return this;
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
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

      /** The ID of the product that this price will belong to. */
      @SerializedName("product")
      String product;

      /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
      @SerializedName("recurring")
      Recurring recurring;

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
       * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          Recurring recurring,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.recurring = recurring;
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

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public PriceData build() {
          return new PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.recurring,
              this.unitAmount,
              this.unitAmountDecimal);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpcomingParams.SubscriptionItem.PriceData#extraParams} for the
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
         * map. See {@link InvoiceUpcomingParams.SubscriptionItem.PriceData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
        public Builder setRecurring(Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value with at most 12 decimal places.
         * Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      @Getter
      public static class Recurring {
        /**
         * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}. Allowed
         * values are {@code sum} for summing up all usage during a period, {@code
         * last_during_period} for using the last usage record reported within a period, {@code
         * last_ever} for using the last usage record ever (across period bounds) or {@code max}
         * which uses the usage record with the maximum reported usage during a period. Defaults to
         * {@code sum}.
         */
        @SerializedName("aggregate_usage")
        AggregateUsage aggregateUsage;

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
         * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
         * year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
         * interval allowed (1 year, 12 months, or 52 weeks).
         */
        @SerializedName("interval_count")
        Long intervalCount;

        /**
         * Default number of trial days when subscribing a customer to this price using <a
         * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
         * trial_from_plan=true}</a>.
         */
        @SerializedName("trial_period_days")
        Long trialPeriodDays;

        /**
         * Configures how the quantity per period should be determined. Can be either {@code
         * metered} or {@code licensed}. {@code licensed} automatically bills the {@code quantity}
         * set when adding it to a subscription. {@code metered} aggregates the total usage based on
         * usage records. Defaults to {@code licensed}.
         */
        @SerializedName("usage_type")
        UsageType usageType;

        private Recurring(
            AggregateUsage aggregateUsage,
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            Long trialPeriodDays,
            UsageType usageType) {
          this.aggregateUsage = aggregateUsage;
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
          this.trialPeriodDays = trialPeriodDays;
          this.usageType = usageType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AggregateUsage aggregateUsage;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          private Long trialPeriodDays;

          private UsageType usageType;

          /** Finalize and obtain parameter instance from this builder. */
          public Recurring build() {
            return new Recurring(
                this.aggregateUsage,
                this.extraParams,
                this.interval,
                this.intervalCount,
                this.trialPeriodDays,
                this.usageType);
          }

          /**
           * Specifies a usage aggregation strategy for prices of {@code usage_type=metered}.
           * Allowed values are {@code sum} for summing up all usage during a period, {@code
           * last_during_period} for using the last usage record reported within a period, {@code
           * last_ever} for using the last usage record ever (across period bounds) or {@code max}
           * which uses the usage record with the maximum reported usage during a period. Defaults
           * to {@code sum}.
           */
          public Builder setAggregateUsage(AggregateUsage aggregateUsage) {
            this.aggregateUsage = aggregateUsage;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceUpcomingParams.SubscriptionItem.PriceData.Recurring#extraParams}
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
           * map. See {@link InvoiceUpcomingParams.SubscriptionItem.PriceData.Recurring#extraParams}
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
           * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
           * year}.
           */
          public Builder setInterval(Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
           * interval allowed (1 year, 12 months, or 52 weeks).
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }

          /**
           * Default number of trial days when subscribing a customer to this price using <a
           * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
           * trial_from_plan=true}</a>.
           */
          public Builder setTrialPeriodDays(Long trialPeriodDays) {
            this.trialPeriodDays = trialPeriodDays;
            return this;
          }

          /**
           * Configures how the quantity per period should be determined. Can be either {@code
           * metered} or {@code licensed}. {@code licensed} automatically bills the {@code quantity}
           * set when adding it to a subscription. {@code metered} aggregates the total usage based
           * on usage records. Defaults to {@code licensed}.
           */
          public Builder setUsageType(UsageType usageType) {
            this.usageType = usageType;
            return this;
          }
        }

        public enum AggregateUsage implements ApiRequestParams.EnumParam {
          @SerializedName("last_during_period")
          LAST_DURING_PERIOD("last_during_period"),

          @SerializedName("last_ever")
          LAST_EVER("last_ever"),

          @SerializedName("max")
          MAX("max"),

          @SerializedName("sum")
          SUM("sum");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AggregateUsage(String value) {
            this.value = value;
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

        public enum UsageType implements ApiRequestParams.EnumParam {
          @SerializedName("licensed")
          LICENSED("licensed"),

          @SerializedName("metered")
          METERED("metered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          UsageType(String value) {
            this.value = value;
          }
        }
      }
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
