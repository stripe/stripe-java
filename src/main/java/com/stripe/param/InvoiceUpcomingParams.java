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
   * The code of the coupon to apply. If `subscription` or `subscription_items` is provided, the
   * invoice returned will preview updating or creating a subscription with that coupon. Otherwise,
   * it will preview applying that coupon to the customer for the next upcoming invoice from among
   * the customer's subscriptions. The invoice can be previewed without a coupon by passing this
   * value as an empty string.
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
   * not provided, but a `subscription_items` is provided, you will preview creating a subscription
   * with those items. If neither `subscription` nor `subscription_items` is provided, you will
   * retrieve the next upcoming invoice from among the customer's subscriptions.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * For new subscriptions, a future timestamp to anchor the subscription's [billing
   * cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the date
   * of the first full invoice, and, for plans with `month` or `year` intervals, the day of the
   * month for subsequent invoices. For existing subscriptions, the value can only be set to `now`
   * or `unchanged`.
   */
  @SerializedName("subscription_billing_cycle_anchor")
  Object subscriptionBillingCycleAnchor;

  /**
   * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
   * within the current period if `prorate=true`
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
   * default tax rates. The default tax rates will apply to any line item that does not have
   * `tax_rates` set.
   */
  @SerializedName("subscription_default_tax_rates")
  Object subscriptionDefaultTaxRates;

  /** List of subscription items, each with an attached plan. */
  @SerializedName("subscription_items")
  List<SubscriptionItem> subscriptionItems;

  /**
   * If previewing an update to a subscription, this decides whether the preview will show the
   * result of applying prorations or not. If set, one of `subscription_items` or `subscription`,
   * and one of `subscription_items` or `subscription_trial_end` are required.
   */
  @SerializedName("subscription_prorate")
  Boolean subscriptionProrate;

  /**
   * If previewing an update to a subscription, and doing proration, `subscription_proration_date`
   * forces the proration to be calculated as though the update was done at the specified time. The
   * time given must be within the current subscription period, and cannot be before the
   * subscription was on its current plan. If set, `subscription`, and one of `subscription_items`,
   * or `subscription_trial_end` are required. Also, `subscription_proration` cannot be set to
   * false.
   */
  @SerializedName("subscription_proration_date")
  Long subscriptionProrationDate;

  /** Date a subscription is intended to start (can be future or past). */
  @SerializedName("subscription_start_date")
  Long subscriptionStartDate;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with that
   * tax percent. If set, one of `subscription_items` or `subscription` is required. This field has
   * been deprecated and will be removed in a future API version, for further information view the
   * [migration docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
   */
  @SerializedName("subscription_tax_percent")
  BigDecimal subscriptionTaxPercent;

  /**
   * If provided, the invoice returned will preview updating or creating a subscription with that
   * trial end. If set, one of `subscription_items` or `subscription` is required.
   */
  @SerializedName("subscription_trial_end")
  Object subscriptionTrialEnd;

  /**
   * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting
   * `subscription_trial_end` per subscription is preferred, and this defaults to `false`. Setting
   * this flag to `true` together with `subscription_trial_end` is not allowed.
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
          this.subscriptionProrationDate,
          this.subscriptionStartDate,
          this.subscriptionTaxPercent,
          this.subscriptionTrialEnd,
          this.subscriptionTrialFromPlan);
    }

    /**
     * The code of the coupon to apply. If `subscription` or `subscription_items` is provided, the
     * invoice returned will preview updating or creating a subscription with that coupon.
     * Otherwise, it will preview applying that coupon to the customer for the next upcoming invoice
     * from among the customer's subscriptions. The invoice can be previewed without a coupon by
     * passing this value as an empty string.
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
     * not provided, but a `subscription_items` is provided, you will preview creating a
     * subscription with those items. If neither `subscription` nor `subscription_items` is
     * provided, you will retrieve the next upcoming invoice from among the customer's
     * subscriptions.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * For new subscriptions, a future timestamp to anchor the subscription's [billing
     * cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the
     * date of the first full invoice, and, for plans with `month` or `year` intervals, the day of
     * the month for subsequent invoices. For existing subscriptions, the value can only be set to
     * `now` or `unchanged`.
     */
    public Builder setSubscriptionBillingCycleAnchor(
        SubscriptionBillingCycleAnchor subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * For new subscriptions, a future timestamp to anchor the subscription's [billing
     * cycle](https://stripe.com/docs/subscriptions/billing-cycle). This is used to determine the
     * date of the first full invoice, and, for plans with `month` or `year` intervals, the day of
     * the month for subsequent invoices. For existing subscriptions, the value can only be set to
     * `now` or `unchanged`.
     */
    public Builder setSubscriptionBillingCycleAnchor(Long subscriptionBillingCycleAnchor) {
      this.subscriptionBillingCycleAnchor = subscriptionBillingCycleAnchor;
      return this;
    }

    /**
     * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
     * within the current period if `prorate=true`
     */
    public Builder setSubscriptionCancelAt(Long subscriptionCancelAt) {
      this.subscriptionCancelAt = subscriptionCancelAt;
      return this;
    }

    /**
     * Timestamp indicating when the subscription should be scheduled to cancel. Will prorate if
     * within the current period if `prorate=true`
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
     * `tax_rates` set.
     */
    public Builder setSubscriptionDefaultTaxRates(EmptyParam subscriptionDefaultTaxRates) {
      this.subscriptionDefaultTaxRates = subscriptionDefaultTaxRates;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with these
     * default tax rates. The default tax rates will apply to any line item that does not have
     * `tax_rates` set.
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
     * If previewing an update to a subscription, this decides whether the preview will show the
     * result of applying prorations or not. If set, one of `subscription_items` or `subscription`,
     * and one of `subscription_items` or `subscription_trial_end` are required.
     */
    public Builder setSubscriptionProrate(Boolean subscriptionProrate) {
      this.subscriptionProrate = subscriptionProrate;
      return this;
    }

    /**
     * If previewing an update to a subscription, and doing proration, `subscription_proration_date`
     * forces the proration to be calculated as though the update was done at the specified time.
     * The time given must be within the current subscription period, and cannot be before the
     * subscription was on its current plan. If set, `subscription`, and one of
     * `subscription_items`, or `subscription_trial_end` are required. Also,
     * `subscription_proration` cannot be set to false.
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
     * tax percent. If set, one of `subscription_items` or `subscription` is required. This field
     * has been deprecated and will be removed in a future API version, for further information view
     * the [migration docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
     */
    public Builder setSubscriptionTaxPercent(BigDecimal subscriptionTaxPercent) {
      this.subscriptionTaxPercent = subscriptionTaxPercent;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of `subscription_items` or `subscription` is required.
     */
    public Builder setSubscriptionTrialEnd(SubscriptionTrialEnd subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * If provided, the invoice returned will preview updating or creating a subscription with that
     * trial end. If set, one of `subscription_items` or `subscription` is required.
     */
    public Builder setSubscriptionTrialEnd(Long subscriptionTrialEnd) {
      this.subscriptionTrialEnd = subscriptionTrialEnd;
      return this;
    }

    /**
     * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting
     * `subscription_trial_end` per subscription is preferred, and this defaults to `false`. Setting
     * this flag to `true` together with `subscription_trial_end` is not allowed.
     */
    public Builder setSubscriptionTrialFromPlan(Boolean subscriptionTrialFromPlan) {
      this.subscriptionTrialFromPlan = subscriptionTrialFromPlan;
      return this;
    }
  }

  @Getter
  public static class InvoiceItem {
    /** The integer amount in **%s** of previewed invoice item. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies). Only
     * applicable to new invoice items.
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
     * A set of key-value pairs that you can attach to an invoice item object. It can be useful for
     * storing additional information about the invoice item in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The period associated with this invoice item. */
    @SerializedName("period")
    Period period;

    /** Non-negative integer. The quantity of units for the invoice item. */
    @SerializedName("quantity")
    Long quantity;

    @SerializedName("tax_rates")
    Object taxRates;

    /**
     * The integer unit amount in **%s** of the charge to be applied to the upcoming invoice. This
     * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply a
     * credit to the customer's account, pass a negative unit_amount.
     */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * Same as `unit_amount`, but accepts a decimal string with at most 12 decimal places. Only one
     * of `unit_amount` and `unit_amount_decimal` can be set.
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
        Map<String, String> metadata,
        Period period,
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

      private Map<String, String> metadata;

      private Period period;

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
            this.quantity,
            this.taxRates,
            this.unitAmount,
            this.unitAmountDecimal);
      }

      /** The integer amount in **%s** of previewed invoice item. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
       * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies). Only
       * applicable to new invoice items.
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
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingParams.InvoiceItem#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** The period associated with this invoice item. */
      public Builder setPeriod(Period period) {
        this.period = period;
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
       * The integer unit amount in **%s** of the charge to be applied to the upcoming invoice. This
       * unit_amount will be multiplied by the quantity to get the full amount. If you want to apply
       * a credit to the customer's account, pass a negative unit_amount.
       */
      public Builder setUnitAmount(Long unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Same as `unit_amount`, but accepts a decimal string with at most 12 decimal places. Only
       * one of `unit_amount` and `unit_amount_decimal` can be set.
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
     * Delete all usage for a given subscription item. Allowed only when `deleted` is set to `true`
     * and the current plan's `usage_type` is `metered`.
     */
    @SerializedName("clear_usage")
    Boolean clearUsage;

    /** A flag that, if set to `true`, will delete the specified item. */
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
     * additional information about the object in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** Plan ID for this item, as a string. */
    @SerializedName("plan")
    String plan;

    /** Quantity for this item. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
     * override the
     * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
     * on the Subscription. When updating, pass an empty string to remove previously-defined tax
     * rates.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    private SubscriptionItem(
        Object billingThresholds,
        Boolean clearUsage,
        Boolean deleted,
        Map<String, Object> extraParams,
        String id,
        Map<String, String> metadata,
        String plan,
        Long quantity,
        Object taxRates) {
      this.billingThresholds = billingThresholds;
      this.clearUsage = clearUsage;
      this.deleted = deleted;
      this.extraParams = extraParams;
      this.id = id;
      this.metadata = metadata;
      this.plan = plan;
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

      private Map<String, String> metadata;

      private String plan;

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
       * Delete all usage for a given subscription item. Allowed only when `deleted` is set to
       * `true` and the current plan's `usage_type` is `metered`.
       */
      public Builder setClearUsage(Boolean clearUsage) {
        this.clearUsage = clearUsage;
        return this;
      }

      /** A flag that, if set to `true`, will delete the specified item. */
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
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceUpcomingParams.SubscriptionItem#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** Plan ID for this item, as a string. */
      public Builder setPlan(String plan) {
        this.plan = plan;
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
       * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
       * override the
       * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
       * on the Subscription. When updating, pass an empty string to remove previously-defined tax
       * rates.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
       * override the
       * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
       * on the Subscription. When updating, pass an empty string to remove previously-defined tax
       * rates.
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
