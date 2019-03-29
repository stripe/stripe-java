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
public class SubscriptionScheduleUpdateParams extends ApiRequestParams {
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay the underlying subscription at the end of each billing cycle using the default
   * source attached to the customer. When sending an invoice, Stripe will email your customer an
   * invoice with payment instructions. Defaults to `charge_automatically` on creation.
   */
  @SerializedName("billing")
  Billing billing;

  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. Pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have
   * different durations, plans, and coupons. If there are multiple phases, the `end_date` of one
   * phase will always equal the `start_date` of the next phase. Note that past phases can be
   * omitted.
   */
  @SerializedName("phases")
  List<Phase> phases;

  /**
   * If the update changes the current phase, indicates if the changes should be prorated. Defaults
   * to `true`.
   */
  @SerializedName("prorate")
  Boolean prorate;

  /**
   * Configures how the subscription schedule behaves when it ends. Possible values are `none`,
   * `renew`, or `release`. `renew` will create a new subscription schedule revision by adding a new
   * phase using the most recent phase's `plans` applied to a duration set by `renewal_interval`.
   * `none` will stop the subscription schedule and cancel the underlying subscription. `release`
   * will stop the subscription schedule, but keep the underlying subscription running.
   */
  @SerializedName("renewal_behavior")
  RenewalBehavior renewalBehavior;

  /**
   * Configuration for renewing the subscription schedule when it ends. Must be set if
   * `renewal_behavior` is `renew`. Otherwise, must not be set.
   */
  @SerializedName("renewal_interval")
  RenewalInterval renewalInterval;

  private SubscriptionScheduleUpdateParams(
      Billing billing,
      Object billingThresholds,
      List<String> expand,
      InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      List<Phase> phases,
      Boolean prorate,
      RenewalBehavior renewalBehavior,
      RenewalInterval renewalInterval) {
    this.billing = billing;
    this.billingThresholds = billingThresholds;
    this.expand = expand;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.phases = phases;
    this.prorate = prorate;
    this.renewalBehavior = renewalBehavior;
    this.renewalInterval = renewalInterval;
  }

  public static Builder builder() {
    return new com.stripe.param.SubscriptionScheduleUpdateParams.Builder();
  }

  public static class Builder {
    private Billing billing;

    private Object billingThresholds;

    private List<String> expand;

    private InvoiceSettings invoiceSettings;

    private Map<String, String> metadata;

    private List<Phase> phases;

    private Boolean prorate;

    private RenewalBehavior renewalBehavior;

    private RenewalInterval renewalInterval;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleUpdateParams build() {
      return new SubscriptionScheduleUpdateParams(
          this.billing,
          this.billingThresholds,
          this.expand,
          this.invoiceSettings,
          this.metadata,
          this.phases,
          this.prorate,
          this.renewalBehavior,
          this.renewalInterval);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public Builder addAllPhase(List<Phase> elements) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public Builder addPhase(Phase element) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.add(element);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleUpdateParams#metadata} for the field documentation.
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
     * SubscriptionScheduleUpdateParams#metadata} for the field documentation.
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
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions. Defaults to `charge_automatically` on creation.
     */
    public Builder setBilling(Billing billing) {
      this.billing = billing;
      return this;
    }

    /** All invoices will be billed using the specified settings. */
    public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * If the update changes the current phase, indicates if the changes should be prorated.
     * Defaults to `true`.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }

    /**
     * Configures how the subscription schedule behaves when it ends. Possible values are `none`,
     * `renew`, or `release`. `renew` will create a new subscription schedule revision by adding a
     * new phase using the most recent phase's `plans` applied to a duration set by
     * `renewal_interval`. `none` will stop the subscription schedule and cancel the underlying
     * subscription. `release` will stop the subscription schedule, but keep the underlying
     * subscription running.
     */
    public Builder setRenewalBehavior(RenewalBehavior renewalBehavior) {
      this.renewalBehavior = renewalBehavior;
      return this;
    }

    /**
     * Configuration for renewing the subscription schedule when it ends. Must be set if
     * `renewal_behavior` is `renew`. Otherwise, must not be set.
     */
    public Builder setRenewalInterval(RenewalInterval renewalInterval) {
      this.renewalInterval = renewalInterval;
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
      return new com.stripe.param.SubscriptionScheduleUpdateParams.BillingThresholds.Builder();
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
  public static class InvoiceSettings {
    @SerializedName("days_until_due")
    Long daysUntilDue;

    private InvoiceSettings(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionScheduleUpdateParams.InvoiceSettings.Builder();
    }

    public static class Builder {
      private Long daysUntilDue;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceSettings build() {
        return new InvoiceSettings(this.daysUntilDue);
      }

      public Builder setDaysUntilDue(Long daysUntilDue) {
        this.daysUntilDue = daysUntilDue;
        return this;
      }
    }
  }

  @Getter
  public static class Phase {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. The request must be made with an OAuth key in order to
     * set an application fee percentage. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /** The identifier of the coupon to apply to this phase of the subscription schedule. */
    @SerializedName("coupon")
    String coupon;

    /**
     * The date at which this phase of the subscription schedule ends. If set, `iterations` must not
     * be set.
     */
    @SerializedName("end_date")
    String endDate;

    /**
     * Integer representing the multiplier applied to the plan interval. For example, `iterations=2`
     * applied to a plan with `interval=month` and `interval_count=3` results in a phase of duration
     * `2 * 3 months = 6 months`. If set, `end_date` must not be set.
     */
    @SerializedName("iterations")
    Long iterations;

    /**
     * List of configuration items, each with an attached plan, to apply during this phase of the
     * subscription schedule.
     */
    @SerializedName("plans")
    List<Plan> plans;

    /** The date at which this phase of the subscription schedule starts. */
    @SerializedName("start_date")
    String startDate;

    /**
     * A non-negative decimal (with at most four decimal places) between 0 and 100. This represents
     * the percentage of the subscription invoice subtotal that will be calculated and added as tax
     * to the final amount in each billing period during thise phase of the schedule. For example, a
     * plan which charges $10/month with a `tax_percent` of `20.0` will charge $12 per invoice. To
     * unset a previously-set value, pass an empty string.
     */
    @SerializedName("tax_percent")
    BigDecimal taxPercent;

    /**
     * If set to true the entire phase is counted as a trial and the customer will not be charged
     * for any fees.
     */
    @SerializedName("trial")
    Boolean trial;

    /**
     * Sets the phase to trialing from the start date to this date. Must be before the phase end
     * date, can not be combined with `trial`
     */
    @SerializedName("trial_end")
    String trialEnd;

    private Phase(
        BigDecimal applicationFeePercent,
        String coupon,
        String endDate,
        Long iterations,
        List<Plan> plans,
        String startDate,
        BigDecimal taxPercent,
        Boolean trial,
        String trialEnd) {
      this.applicationFeePercent = applicationFeePercent;
      this.coupon = coupon;
      this.endDate = endDate;
      this.iterations = iterations;
      this.plans = plans;
      this.startDate = startDate;
      this.taxPercent = taxPercent;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionScheduleUpdateParams.Phase.Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private String coupon;

      private String endDate;

      private Long iterations;

      private List<Plan> plans;

      private String startDate;

      private BigDecimal taxPercent;

      private Boolean trial;

      private String trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public Phase build() {
        return new Phase(
            this.applicationFeePercent,
            this.coupon,
            this.endDate,
            this.iterations,
            this.plans,
            this.startDate,
            this.taxPercent,
            this.trial,
            this.trialEnd);
      }

      /**
       * Add all elements to `plans` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link Phase#plans}
       * for the field documentation.
       */
      public Builder addAllPlan(List<Plan> elements) {
        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.addAll(elements);
        return this;
      }

      /**
       * Add an element to `plans` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link Phase#plans} for
       * the field documentation.
       */
      public Builder addPlan(Plan element) {
        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.add(element);
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

      /** The identifier of the coupon to apply to this phase of the subscription schedule. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, `iterations` must
       * not be set.
       */
      public Builder setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * Integer representing the multiplier applied to the plan interval. For example,
       * `iterations=2` applied to a plan with `interval=month` and `interval_count=3` results in a
       * phase of duration `2 * 3 months = 6 months`. If set, `end_date` must not be set.
       */
      public Builder setIterations(Long iterations) {
        this.iterations = iterations;
        return this;
      }

      /** The date at which this phase of the subscription schedule starts. */
      public Builder setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
      }

      /**
       * A non-negative decimal (with at most four decimal places) between 0 and 100. This
       * represents the percentage of the subscription invoice subtotal that will be calculated and
       * added as tax to the final amount in each billing period during thise phase of the schedule.
       * For example, a plan which charges $10/month with a `tax_percent` of `20.0` will charge $12
       * per invoice. To unset a previously-set value, pass an empty string.
       */
      public Builder setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with `trial`
       */
      public Builder setTrialEnd(String trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      public Builder setTrial(Boolean trial) {
        this.trial = trial;
        return this;
      }
    }

    @Getter
    public static class Plan {
      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

      /** The plan ID to subscribe to. */
      @SerializedName("plan")
      String plan;

      /**
       * Quantity for the given plan. Can be set only if the plan's `usage_type` is `licensed` and
       * not `metered`.
       */
      @SerializedName("quantity")
      Long quantity;

      private Plan(Object billingThresholds, String plan, Long quantity) {
        this.billingThresholds = billingThresholds;
        this.plan = plan;
        this.quantity = quantity;
      }

      public static Builder builder() {
        return new com.stripe.param.SubscriptionScheduleUpdateParams.Phase.Plan.Builder();
      }

      public static class Builder {
        private Object billingThresholds;

        private String plan;

        private Long quantity;

        /** Finalize and obtain parameter instance from this builder. */
        public Plan build() {
          return new Plan(this.billingThresholds, this.plan, this.quantity);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public Builder setBillingThresholds(BillingThresholds billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public Builder setBillingThresholds(Empty billingThresholds) {
          this.billingThresholds = billingThresholds;
          return this;
        }

        /** The plan ID to subscribe to. */
        public Builder setPlan(String plan) {
          this.plan = plan;
          return this;
        }

        /**
         * Quantity for the given plan. Can be set only if the plan's `usage_type` is `licensed` and
         * not `metered`.
         */
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
          return new com.stripe.param.SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds
              .Builder();
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
  }

  @Getter
  public static class RenewalInterval {
    /**
     * Interval at which to renew the subscription schedule for when it ends. Possible values are
     * `day`, `week`, `month`, or `year`.
     */
    @SerializedName("interval")
    Interval interval;

    /** Number of intervals to renew the subscription schedule for when it ends. */
    @SerializedName("length")
    Long length;

    private RenewalInterval(Interval interval, Long length) {
      this.interval = interval;
      this.length = length;
    }

    public static Builder builder() {
      return new com.stripe.param.SubscriptionScheduleUpdateParams.RenewalInterval.Builder();
    }

    public static class Builder {
      private Interval interval;

      private Long length;

      /** Finalize and obtain parameter instance from this builder. */
      public RenewalInterval build() {
        return new RenewalInterval(this.interval, this.length);
      }

      /**
       * Interval at which to renew the subscription schedule for when it ends. Possible values are
       * `day`, `week`, `month`, or `year`.
       */
      public Builder setInterval(Interval interval) {
        this.interval = interval;
        return this;
      }

      /** Number of intervals to renew the subscription schedule for when it ends. */
      public Builder setLength(Long length) {
        this.length = length;
        return this;
      }
    }

    public enum Interval implements ApiRequestParams.Enum {
      @SerializedName("day")
      DAY("day"),

      @SerializedName("month")
      MONTH("month"),

      @SerializedName("week")
      WEEK("week"),

      @SerializedName("year")
      YEAR("year");

      @Getter private final String value;

      Interval(String value) {
        this.value = value;
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

  public enum RenewalBehavior implements ApiRequestParams.Enum {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("release")
    RELEASE("release"),

    @SerializedName("renew")
    RENEW("renew");

    @Getter private final String value;

    RenewalBehavior(String value) {
      this.value = value;
    }
  }
}
