// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SubscriptionUpdateParams extends ApiRequestParams {
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice subtotal that will be transferred to the application
   * owner's Stripe account. The request must be made with an OAuth key in order to set an
   * application fee percentage. For more information, see the application fees
   * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay this subscription at the end of the cycle using the default source attached to
   * the customer. When sending an invoice, Stripe will email your customer an invoice with payment
   * instructions. Defaults to `charge_automatically`.
   */
  @SerializedName("billing")
  Billing billing;

  /**
   * Either `now` or `unchanged`. Setting the value to `now` resets the subscription's billing cycle
   * anchor to the current time. For more information, see the billing cycle
   * [documentation](https://stripe.com/docs/billing/subscriptions/billing-cycle).
   */
  @SerializedName("billing_cycle_anchor")
  String billingCycleAnchor;

  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. Pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

  /**
   * A timestamp at which the subscription should cancel. If set to a date before the current period
   * ends this will cause a proration if `prorate=true`.
   */
  @SerializedName("cancel_at")
  Object cancelAt;

  /**
   * Boolean indicating whether this subscription should cancel at the end of the current period.
   */
  @SerializedName("cancel_at_period_end")
  Boolean cancelAtPeriodEnd;

  /**
   * The code of the coupon to apply to this subscription. A coupon applied to a subscription will
   * only affect invoices created for that particular subscription.
   */
  @SerializedName("coupon")
  String coupon;

  /**
   * Number of days a customer has to pay invoices generated by this subscription. Valid only for
   * subscriptions where `billing` is set to `send_invoice`.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment source for the subscription. It must belong to the customer
   * associated with the subscription and be in a chargeable state. If not set, defaults to the
   * customer's default source.
   */
  @SerializedName("default_source")
  String defaultSource;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** List of subscription items, each with an attached plan. */
  @SerializedName("items")
  List<Item> items;

  /**
   * A set of key-value pairs that you can attach to a subscription object. This can be useful for
   * storing additional information about the subscription in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Boolean (defaults to `true`) telling us whether to [credit for unused
   * time](https://stripe.com/docs/subscriptions/billing-cycle#prorations) when the billing cycle
   * changes (e.g. when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial),
   * or if an item's `quantity` changes. If `false`, the anchor period will be free (similar to a
   * trial) and no proration adjustments will be created.
   */
  @SerializedName("prorate")
  Boolean prorate;

  /**
   * If set, the proration will be calculated as though the subscription was updated at the given
   * time. This can be used to apply exactly the same proration that was previewed with [upcoming
   * invoice](#retrieve_customer_invoice) endpoint. It can also be used to implement custom
   * proration logic, such as prorating by day instead of by second, by providing the time that you
   * wish to use for proration calculations.
   */
  @SerializedName("proration_date")
  Long prorationDate;

  /**
   * A non-negative decimal (with at most four decimal places) between 0 and 100. This represents
   * the percentage of the subscription invoice subtotal that will be calculated and added as tax to
   * the final amount in each billing period. For example, a plan which charges $10/month with a
   * `tax_percent` of `20.0` will charge $12 per invoice. To unset a previously-set value, pass an
   * empty string.
   */
  @SerializedName("tax_percent")
  Object taxPercent;

  /**
   * If specified, the funds from the subscription's invoices will be transferred to the destination
   * and the ID of the resulting transfers will be found on the resulting charges. This will be
   * unset if you POST an empty value.
   */
  @SerializedName("transfer_data")
  Object transferData;

  /**
   * Unix timestamp representing the end of the trial period the customer will get before being
   * charged for the first time. This will always overwrite any trials that might apply via a
   * subscribed plan. If set, trial_end will override the default trial period of the plan the
   * customer is being subscribed to. The special value `now` can be provided to end the customer's
   * trial immediately.
   */
  @SerializedName("trial_end")
  String trialEnd;

  /**
   * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting
   * `trial_end` per subscription is preferred, and this defaults to `false`. Setting this flag to
   * `true` together with `trial_end` is not allowed.
   */
  @SerializedName("trial_from_plan")
  Boolean trialFromPlan;

  private SubscriptionUpdateParams(
      BigDecimal applicationFeePercent,
      Billing billing,
      String billingCycleAnchor,
      Object billingThresholds,
      Object cancelAt,
      Boolean cancelAtPeriodEnd,
      String coupon,
      Long daysUntilDue,
      String defaultSource,
      List<String> expand,
      List<Item> items,
      Map<String, String> metadata,
      Boolean prorate,
      Long prorationDate,
      Object taxPercent,
      Object transferData,
      String trialEnd,
      Boolean trialFromPlan) {
    this.applicationFeePercent = applicationFeePercent;
    this.billing = billing;
    this.billingCycleAnchor = billingCycleAnchor;
    this.billingThresholds = billingThresholds;
    this.cancelAt = cancelAt;
    this.cancelAtPeriodEnd = cancelAtPeriodEnd;
    this.coupon = coupon;
    this.daysUntilDue = daysUntilDue;
    this.defaultSource = defaultSource;
    this.expand = expand;
    this.items = items;
    this.metadata = metadata;
    this.prorate = prorate;
    this.prorationDate = prorationDate;
    this.taxPercent = taxPercent;
    this.transferData = transferData;
    this.trialEnd = trialEnd;
    this.trialFromPlan = trialFromPlan;
  }

  public static Builder builder() {
    return new com.stripe.param.SubscriptionUpdateParams.Builder();
  }

  public static class Builder {
    private BigDecimal applicationFeePercent;

    private Billing billing;

    private String billingCycleAnchor;

    private Object billingThresholds;

    private Object cancelAt;

    private Boolean cancelAtPeriodEnd;

    private String coupon;

    private Long daysUntilDue;

    private String defaultSource;

    private List<String> expand;

    private List<Item> items;

    private Map<String, String> metadata;

    private Boolean prorate;

    private Long prorationDate;

    private Object taxPercent;

    private Object transferData;

    private String trialEnd;

    private Boolean trialFromPlan;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionUpdateParams build() {
      return new SubscriptionUpdateParams(
          this.applicationFeePercent,
          this.billing,
          this.billingCycleAnchor,
          this.billingThresholds,
          this.cancelAt,
          this.cancelAtPeriodEnd,
          this.coupon,
          this.daysUntilDue,
          this.defaultSource,
          this.expand,
          this.items,
          this.metadata,
          this.prorate,
          this.prorationDate,
          this.taxPercent,
          this.transferData,
          this.trialEnd,
          this.trialFromPlan);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add all elements to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionUpdateParams#items} for the field documentation.
     */
    public Builder addAllItem(List<Item> elements) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionUpdateParams#items} for the field documentation.
     */
    public Builder addItem(Item element) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. The request must be made with an OAuth key in order to
     * set an application fee percentage. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
     */
    public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
      this.applicationFeePercent = applicationFeePercent;
      return this;
    }

    /**
     * Either `now` or `unchanged`. Setting the value to `now` resets the subscription's billing
     * cycle anchor to the current time. For more information, see the billing cycle
     * [documentation](https://stripe.com/docs/billing/subscriptions/billing-cycle).
     */
    public Builder setBillingCycleAnchor(String billingCycleAnchor) {
      this.billingCycleAnchor = billingCycleAnchor;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public Builder setBillingThresholds(BillingThresholds billingThresholds) {
      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public Builder setBillingThresholds(Empty billingThresholds) {
      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay this subscription at the end of the cycle using the default source attached to
     * the customer. When sending an invoice, Stripe will email your customer an invoice with
     * payment instructions. Defaults to `charge_automatically`.
     */
    public Builder setBilling(Billing billing) {
      this.billing = billing;
      return this;
    }

    /**
     * Boolean indicating whether this subscription should cancel at the end of the current period.
     */
    public Builder setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
      this.cancelAtPeriodEnd = cancelAtPeriodEnd;
      return this;
    }

    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current
     * period ends this will cause a proration if `prorate=true`.
     */
    public Builder setCancelAt(Empty cancelAt) {
      this.cancelAt = cancelAt;
      return this;
    }

    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current
     * period ends this will cause a proration if `prorate=true`.
     */
    public Builder setCancelAt(Long cancelAt) {
      this.cancelAt = cancelAt;
      return this;
    }

    /**
     * The code of the coupon to apply to this subscription. A coupon applied to a subscription will
     * only affect invoices created for that particular subscription.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * Number of days a customer has to pay invoices generated by this subscription. Valid only for
     * subscriptions where `billing` is set to `send_invoice`.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment source for the subscription. It must belong to the customer
     * associated with the subscription and be in a chargeable state. If not set, defaults to the
     * customer's default source.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Boolean (defaults to `true`) telling us whether to [credit for unused
     * time](https://stripe.com/docs/subscriptions/billing-cycle#prorations) when the billing cycle
     * changes (e.g. when switching plans, resetting `billing_cycle_anchor=now`, or starting a
     * trial), or if an item's `quantity` changes. If `false`, the anchor period will be free
     * (similar to a trial) and no proration adjustments will be created.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given
     * time. This can be used to apply exactly the same proration that was previewed with [upcoming
     * invoice](#retrieve_customer_invoice) endpoint. It can also be used to implement custom
     * proration logic, such as prorating by day instead of by second, by providing the time that
     * you wish to use for proration calculations.
     */
    public Builder setProrationDate(Long prorationDate) {
      this.prorationDate = prorationDate;
      return this;
    }

    /**
     * A non-negative decimal (with at most four decimal places) between 0 and 100. This represents
     * the percentage of the subscription invoice subtotal that will be calculated and added as tax
     * to the final amount in each billing period. For example, a plan which charges $10/month with
     * a `tax_percent` of `20.0` will charge $12 per invoice. To unset a previously-set value, pass
     * an empty string.
     */
    public Builder setTaxPercent(Empty taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * A non-negative decimal (with at most four decimal places) between 0 and 100. This represents
     * the percentage of the subscription invoice subtotal that will be calculated and added as tax
     * to the final amount in each billing period. For example, a plan which charges $10/month with
     * a `tax_percent` of `20.0` will charge $12 per invoice. To unset a previously-set value, pass
     * an empty string.
     */
    public Builder setTaxPercent(BigDecimal taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * If specified, the funds from the subscription's invoices will be transferred to the
     * destination and the ID of the resulting transfers will be found on the resulting charges.
     * This will be unset if you POST an empty value.
     */
    public Builder setTransferData(Empty transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * If specified, the funds from the subscription's invoices will be transferred to the
     * destination and the ID of the resulting transfers will be found on the resulting charges.
     * This will be unset if you POST an empty value.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. This will always overwrite any trials that might apply via a
     * subscribed plan. If set, trial_end will override the default trial period of the plan the
     * customer is being subscribed to. The special value `now` can be provided to end the
     * customer's trial immediately.
     */
    public Builder setTrialEnd(String trialEnd) {
      this.trialEnd = trialEnd;
      return this;
    }

    /**
     * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting
     * `trial_end` per subscription is preferred, and this defaults to `false`. Setting this flag to
     * `true` together with `trial_end` is not allowed.
     */
    public Builder setTrialFromPlan(Boolean trialFromPlan) {
      this.trialFromPlan = trialFromPlan;
      return this;
    }
  }

  @Getter
  public static class BillingThresholds {
    /** Monetary threshold that triggers the subscription to advance to a new billing period. */
    @SerializedName("amount_gte")
    Long amountGte;

    /**
     * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If true,
     * `billing_cycle_anchor` will be updated to the date/time the threshold was last reached;
     * otherwise, the value will remain unchanged.
     */
    @SerializedName("reset_billing_cycle_anchor")
    Boolean resetBillingCycleAnchor;

    private BillingThresholds(Long amountGte, Boolean resetBillingCycleAnchor) {
      this.amountGte = amountGte;
      this.resetBillingCycleAnchor = resetBillingCycleAnchor;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionUpdateParams.BillingThresholds.Builder();
    }

    public static class Builder {
      private Long amountGte;

      private Boolean resetBillingCycleAnchor;

      /** Finalize and obtain parameter instance from this builder. */
      public BillingThresholds build() {
        return new BillingThresholds(this.amountGte, this.resetBillingCycleAnchor);
      }

      /** Monetary threshold that triggers the subscription to advance to a new billing period. */
      public Builder setAmountGte(Long amountGte) {
        this.amountGte = amountGte;
        return this;
      }

      /**
       * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If
       * true, `billing_cycle_anchor` will be updated to the date/time the threshold was last
       * reached; otherwise, the value will remain unchanged.
       */
      public Builder setResetBillingCycleAnchor(Boolean resetBillingCycleAnchor) {
        this.resetBillingCycleAnchor = resetBillingCycleAnchor;
        return this;
      }
    }
  }

  @Getter
  public static class Item {
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period.
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

    private Item(
        Object billingThresholds,
        Boolean clearUsage,
        Boolean deleted,
        String id,
        Map<String, String> metadata,
        String plan,
        Long quantity) {
      this.billingThresholds = billingThresholds;
      this.clearUsage = clearUsage;
      this.deleted = deleted;
      this.id = id;
      this.metadata = metadata;
      this.plan = plan;
      this.quantity = quantity;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionUpdateParams.Item.Builder();
    }

    public static class Builder {
      private Object billingThresholds;

      private Boolean clearUsage;

      private Boolean deleted;

      private String id;

      private Map<String, String> metadata;

      private String plan;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public Item build() {
        return new Item(
            this.billingThresholds,
            this.clearUsage,
            this.deleted,
            this.id,
            this.metadata,
            this.plan,
            this.quantity);
      }

      /**
       * Add all map key/value pairs to `metadata` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link Item#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * Item#metadata} for the field documentation.
       */
      public Builder putMetadata(String key, String value) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period.
       */
      public Builder setBillingThresholds(BillingThresholds billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period.
       */
      public Builder setBillingThresholds(Empty billingThresholds) {
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

      /** Subscription item to update. */
      public Builder setId(String id) {
        this.id = id;
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
    }

    @Getter
    public static class BillingThresholds {
      /** Usage threshold that triggers the subscription to advance to a new billing period. */
      @SerializedName("usage_gte")
      Long usageGte;

      private BillingThresholds(Long usageGte) {
        this.usageGte = usageGte;
      }

      public static Builder builder() {
        return new com.stripe.param.SubscriptionUpdateParams.Item.BillingThresholds.Builder();
      }

      public static class Builder {
        private Long usageGte;

        /** Finalize and obtain parameter instance from this builder. */
        public BillingThresholds build() {
          return new BillingThresholds(this.usageGte);
        }

        /** Usage threshold that triggers the subscription to advance to a new billing period. */
        public Builder setUsageGte(Long usageGte) {
          this.usageGte = usageGte;
          return this;
        }
      }
    }

    public enum Empty implements ApiRequestParams.Enum {
      @SerializedName("")
      EMPTY("");

      @Getter private final String value;

      Empty(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class TransferData {
    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    String destination;

    private TransferData(String destination) {
      this.destination = destination;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionUpdateParams.TransferData.Builder();
    }

    public static class Builder {
      private String destination;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.destination);
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }
    }
  }

  public enum Billing implements ApiRequestParams.Enum {
    @SerializedName("charge_automatically")
    CHARGE_AUTOMATICALLY("charge_automatically"),

    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter private final String value;

    Billing(String value) {
      this.value = value;
    }
  }

  public enum Empty implements ApiRequestParams.Enum {
    @SerializedName("")
    EMPTY("");

    @Getter private final String value;

    Empty(String value) {
      this.value = value;
    }
  }
}
