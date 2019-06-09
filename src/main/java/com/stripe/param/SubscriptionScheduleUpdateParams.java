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

public class SubscriptionScheduleUpdateParams extends ApiRequestParams {

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay the underlying subscription at the end of each billing cycle using the default
   * source attached to the customer. When sending an invoice, Stripe will email your customer an
   * invoice with payment instructions. Defaults to `charge_automatically` on creation.
   */
  @SerializedName("billing")
  SubscriptionScheduleUpdateParams.Billing billing;

  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. Pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

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

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  SubscriptionScheduleUpdateParams.InvoiceSettings invoiceSettings;

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
  List<SubscriptionScheduleUpdateParams.Phase> phases;

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
  SubscriptionScheduleUpdateParams.RenewalBehavior renewalBehavior;

  /**
   * Configuration for renewing the subscription schedule when it ends. Must be set if
   * `renewal_behavior` is `renew`. Otherwise, must not be set.
   */
  @SerializedName("renewal_interval")
  SubscriptionScheduleUpdateParams.RenewalInterval renewalInterval;

  private SubscriptionScheduleUpdateParams(
      SubscriptionScheduleUpdateParams.Billing billing,
      Object billingThresholds,
      List<String> expand,
      Map<String, Object> extraParams,
      SubscriptionScheduleUpdateParams.InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      List<SubscriptionScheduleUpdateParams.Phase> phases,
      Boolean prorate,
      SubscriptionScheduleUpdateParams.RenewalBehavior renewalBehavior,
      SubscriptionScheduleUpdateParams.RenewalInterval renewalInterval) {

    this.billing = billing;
    this.billingThresholds = billingThresholds;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.phases = phases;
    this.prorate = prorate;
    this.renewalBehavior = renewalBehavior;
    this.renewalInterval = renewalInterval;
  }

  public static SubscriptionScheduleUpdateParams.Builder builder() {
    return new SubscriptionScheduleUpdateParams.Builder();
  }

  public static class Builder {
    private SubscriptionScheduleUpdateParams.Billing billing;
    private Object billingThresholds;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private SubscriptionScheduleUpdateParams.InvoiceSettings invoiceSettings;
    private Map<String, String> metadata;
    private List<SubscriptionScheduleUpdateParams.Phase> phases;
    private Boolean prorate;
    private SubscriptionScheduleUpdateParams.RenewalBehavior renewalBehavior;
    private SubscriptionScheduleUpdateParams.RenewalInterval renewalInterval;

    public SubscriptionScheduleUpdateParams build() {
      return new SubscriptionScheduleUpdateParams(
          this.billing,
          this.billingThresholds,
          this.expand,
          this.extraParams,
          this.invoiceSettings,
          this.metadata,
          this.phases,
          this.prorate,
          this.renewalBehavior,
          this.renewalInterval);
    }

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions. Defaults to `charge_automatically` on creation.
     */
    public SubscriptionScheduleUpdateParams.Builder setBilling(
        SubscriptionScheduleUpdateParams.Billing billing) {

      this.billing = billing;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public SubscriptionScheduleUpdateParams.Builder setBillingThresholds(
        SubscriptionScheduleUpdateParams.BillingThresholds billingThresholds) {

      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public SubscriptionScheduleUpdateParams.Builder setBillingThresholds(
        EmptyParam billingThresholds) {

      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder addExpand(String element) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#expand} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** All invoices will be billed using the specified settings. */
    public SubscriptionScheduleUpdateParams.Builder setInvoiceSettings(
        SubscriptionScheduleUpdateParams.InvoiceSettings invoiceSettings) {

      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleUpdateParams#metadata} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleUpdateParams#metadata} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder addPhase(
        SubscriptionScheduleUpdateParams.Phase element) {

      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.add(element);
      return this;
    }

    /**
     * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public SubscriptionScheduleUpdateParams.Builder addAllPhase(
        List<SubscriptionScheduleUpdateParams.Phase> list) {

      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(list);
      return this;
    }

    /**
     * If the update changes the current phase, indicates if the changes should be prorated.
     * Defaults to `true`.
     */
    public SubscriptionScheduleUpdateParams.Builder setProrate(Boolean prorate) {

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
    public SubscriptionScheduleUpdateParams.Builder setRenewalBehavior(
        SubscriptionScheduleUpdateParams.RenewalBehavior renewalBehavior) {

      this.renewalBehavior = renewalBehavior;
      return this;
    }

    /**
     * Configuration for renewing the subscription schedule when it ends. Must be set if
     * `renewal_behavior` is `renew`. Otherwise, must not be set.
     */
    public SubscriptionScheduleUpdateParams.Builder setRenewalInterval(
        SubscriptionScheduleUpdateParams.RenewalInterval renewalInterval) {

      this.renewalInterval = renewalInterval;
      return this;
    }
  }

  public static class BillingThresholds {

    /** Monetary threshold that triggers the subscription to advance to a new billing period. */
    @SerializedName("amount_gte")
    Long amountGte;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If true,
     * `billing_cycle_anchor` will be updated to the date/time the threshold was last reached;
     * otherwise, the value will remain unchanged.
     */
    @SerializedName("reset_billing_cycle_anchor")
    Boolean resetBillingCycleAnchor;

    private BillingThresholds(
        Long amountGte, Map<String, Object> extraParams, Boolean resetBillingCycleAnchor) {

      this.amountGte = amountGte;
      this.extraParams = extraParams;
      this.resetBillingCycleAnchor = resetBillingCycleAnchor;
    }

    public static SubscriptionScheduleUpdateParams.BillingThresholds.Builder builder() {

      return new SubscriptionScheduleUpdateParams.BillingThresholds.Builder();
    }

    public static class Builder {
      private Long amountGte;
      private Map<String, Object> extraParams;
      private Boolean resetBillingCycleAnchor;

      public SubscriptionScheduleUpdateParams.BillingThresholds build() {
        return new SubscriptionScheduleUpdateParams.BillingThresholds(
            this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
      }

      /** Monetary threshold that triggers the subscription to advance to a new billing period. */
      public SubscriptionScheduleUpdateParams.BillingThresholds.Builder setAmountGte(
          Long amountGte) {

        this.amountGte = amountGte;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleUpdateParams.BillingThresholds.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleUpdateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleUpdateParams.BillingThresholds.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If
       * true, `billing_cycle_anchor` will be updated to the date/time the threshold was last
       * reached; otherwise, the value will remain unchanged.
       */
      public SubscriptionScheduleUpdateParams.BillingThresholds.Builder setResetBillingCycleAnchor(
          Boolean resetBillingCycleAnchor) {

        this.resetBillingCycleAnchor = resetBillingCycleAnchor;
        return this;
      }
    }
  }

  public static class InvoiceSettings {
    @SerializedName("days_until_due")
    Long daysUntilDue;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams) {

      this.daysUntilDue = daysUntilDue;
      this.extraParams = extraParams;
    }

    public static SubscriptionScheduleUpdateParams.InvoiceSettings.Builder builder() {

      return new SubscriptionScheduleUpdateParams.InvoiceSettings.Builder();
    }

    public static class Builder {
      private Long daysUntilDue;
      private Map<String, Object> extraParams;

      public SubscriptionScheduleUpdateParams.InvoiceSettings build() {
        return new SubscriptionScheduleUpdateParams.InvoiceSettings(
            this.daysUntilDue, this.extraParams);
      }

      public SubscriptionScheduleUpdateParams.InvoiceSettings.Builder setDaysUntilDue(
          Long daysUntilDue) {

        this.daysUntilDue = daysUntilDue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.InvoiceSettings#extraParams} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.InvoiceSettings.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleUpdateParams.InvoiceSettings#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleUpdateParams.InvoiceSettings.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

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
     * The tax rates that will apply to any phase that does not have `tax_rates` set. Invoices
     * created will have their `default_tax_rates` populated from the phase.
     */
    @SerializedName("default_tax_rates")
    Object defaultTaxRates;

    /**
     * The date at which this phase of the subscription schedule ends. If set, `iterations` must not
     * be set.
     */
    @SerializedName("end_date")
    Object endDate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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
    List<SubscriptionScheduleUpdateParams.Phase.Plan> plans;

    /** The date at which this phase of the subscription schedule starts. */
    @SerializedName("start_date")
    Object startDate;

    /**
     * A non-negative decimal (with at most four decimal places) between 0 and 100. This represents
     * the percentage of the subscription invoice subtotal that will be calculated and added as tax
     * to the final amount in each billing period during thise phase of the schedule. For example, a
     * plan which charges $10/month with a `tax_percent` of `20.0` will charge $12 per invoice. To
     * unset a previously-set value, pass an empty string. This field has been deprecated and will
     * be removed in a future API version, for further information view the [migration
     * docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
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
    Object trialEnd;

    private Phase(
        BigDecimal applicationFeePercent,
        String coupon,
        Object defaultTaxRates,
        Object endDate,
        Map<String, Object> extraParams,
        Long iterations,
        List<SubscriptionScheduleUpdateParams.Phase.Plan> plans,
        Object startDate,
        BigDecimal taxPercent,
        Boolean trial,
        Object trialEnd) {

      this.applicationFeePercent = applicationFeePercent;
      this.coupon = coupon;
      this.defaultTaxRates = defaultTaxRates;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.iterations = iterations;
      this.plans = plans;
      this.startDate = startDate;
      this.taxPercent = taxPercent;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static SubscriptionScheduleUpdateParams.Phase.Builder builder() {
      return new SubscriptionScheduleUpdateParams.Phase.Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;
      private String coupon;
      private Object defaultTaxRates;
      private Object endDate;
      private Map<String, Object> extraParams;
      private Long iterations;
      private List<SubscriptionScheduleUpdateParams.Phase.Plan> plans;
      private Object startDate;
      private BigDecimal taxPercent;
      private Boolean trial;
      private Object trialEnd;

      public SubscriptionScheduleUpdateParams.Phase build() {
        return new SubscriptionScheduleUpdateParams.Phase(
            this.applicationFeePercent,
            this.coupon,
            this.defaultTaxRates,
            this.endDate,
            this.extraParams,
            this.iterations,
            this.plans,
            this.startDate,
            this.taxPercent,
            this.trial,
            this.trialEnd);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * application owner's Stripe account. The request must be made with an OAuth key in order to
       * set an application fee percentage. For more information, see the application fees
       * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setApplicationFeePercent(
          BigDecimal applicationFeePercent) {

        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** The identifier of the coupon to apply to this phase of the subscription schedule. */
      public SubscriptionScheduleUpdateParams.Phase.Builder setCoupon(String coupon) {

        this.coupon = coupon;
        return this;
      }

      /**
       * The tax rates that will apply to any phase that does not have `tax_rates` set. Invoices
       * created will have their `default_tax_rates` populated from the phase.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setDefaultTaxRates(
          List<String> defaultTaxRates) {

        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * The tax rates that will apply to any phase that does not have `tax_rates` set. Invoices
       * created will have their `default_tax_rates` populated from the phase.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setDefaultTaxRates(
          EmptyParam defaultTaxRates) {

        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, `iterations` must
       * not be set.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setEndDate(Long endDate) {

        this.endDate = endDate;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, `iterations` must
       * not be set.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setEndDate(
          SubscriptionScheduleUpdateParams.Phase.EndDate endDate) {

        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Integer representing the multiplier applied to the plan interval. For example,
       * `iterations=2` applied to a plan with `interval=month` and `interval_count=3` results in a
       * phase of duration `2 * 3 months = 6 months`. If set, `end_date` must not be set.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setIterations(Long iterations) {

        this.iterations = iterations;
        return this;
      }

      /**
       * Add an element to `plans` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#plans} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder addPlan(
          SubscriptionScheduleUpdateParams.Phase.Plan element) {

        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.add(element);
        return this;
      }

      /**
       * Add all elements to `plans` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#plans} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder addAllPlan(
          List<SubscriptionScheduleUpdateParams.Phase.Plan> list) {

        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.addAll(list);
        return this;
      }

      /** The date at which this phase of the subscription schedule starts. */
      public SubscriptionScheduleUpdateParams.Phase.Builder setStartDate(Long startDate) {

        this.startDate = startDate;
        return this;
      }

      /** The date at which this phase of the subscription schedule starts. */
      public SubscriptionScheduleUpdateParams.Phase.Builder setStartDate(
          SubscriptionScheduleUpdateParams.Phase.StartDate startDate) {

        this.startDate = startDate;
        return this;
      }

      /**
       * A non-negative decimal (with at most four decimal places) between 0 and 100. This
       * represents the percentage of the subscription invoice subtotal that will be calculated and
       * added as tax to the final amount in each billing period during thise phase of the schedule.
       * For example, a plan which charges $10/month with a `tax_percent` of `20.0` will charge $12
       * per invoice. To unset a previously-set value, pass an empty string. This field has been
       * deprecated and will be removed in a future API version, for further information view the
       * [migration docs](https://stripe.com/docs/billing/migration/taxes) for `tax_rates`.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setTaxPercent(BigDecimal taxPercent) {

        this.taxPercent = taxPercent;
        return this;
      }

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setTrial(Boolean trial) {

        this.trial = trial;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with `trial`
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setTrialEnd(Long trialEnd) {

        this.trialEnd = trialEnd;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with `trial`
       */
      public SubscriptionScheduleUpdateParams.Phase.Builder setTrialEnd(
          SubscriptionScheduleUpdateParams.Phase.TrialEnd trialEnd) {

        this.trialEnd = trialEnd;
        return this;
      }
    }

    public static class Plan {

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The plan ID to subscribe to. */
      @SerializedName("plan")
      String plan;

      /**
       * Quantity for the given plan. Can be set only if the plan's `usage_type` is `licensed` and
       * not `metered`.
       */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates` on
       * the subscription do not apply to this `subscription_item`.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private Plan(
          Object billingThresholds,
          Map<String, Object> extraParams,
          String plan,
          Long quantity,
          Object taxRates) {

        this.billingThresholds = billingThresholds;
        this.extraParams = extraParams;
        this.plan = plan;
        this.quantity = quantity;
        this.taxRates = taxRates;
      }

      public static SubscriptionScheduleUpdateParams.Phase.Plan.Builder builder() {

        return new SubscriptionScheduleUpdateParams.Phase.Plan.Builder();
      }

      public static class Builder {
        private Object billingThresholds;
        private Map<String, Object> extraParams;
        private String plan;
        private Long quantity;
        private Object taxRates;

        public SubscriptionScheduleUpdateParams.Phase.Plan build() {
          return new SubscriptionScheduleUpdateParams.Phase.Plan(
              this.billingThresholds, this.extraParams, this.plan, this.quantity, this.taxRates);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setBillingThresholds(
            SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds billingThresholds) {

          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setBillingThresholds(
            EmptyParam billingThresholds) {

          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Plan#extraParams} for the field
         * documentation.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder putExtraParam(
            String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Plan#extraParams} for the field
         * documentation.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The plan ID to subscribe to. */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setPlan(String plan) {

          this.plan = plan;
          return this;
        }

        /**
         * Quantity for the given plan. Can be set only if the plan's `usage_type` is `licensed` and
         * not `metered`.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setQuantity(Long quantity) {

          this.quantity = quantity;
          return this;
        }

        /**
         * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates`
         * on the subscription do not apply to this `subscription_item`.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setTaxRates(
            List<String> taxRates) {

          this.taxRates = taxRates;
          return this;
        }

        /**
         * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates`
         * on the subscription do not apply to this `subscription_item`.
         */
        public SubscriptionScheduleUpdateParams.Phase.Plan.Builder setTaxRates(
            EmptyParam taxRates) {

          this.taxRates = taxRates;
          return this;
        }
      }

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

        /** Usage threshold that triggers the subscription to advance to a new billing period. */
        @SerializedName("usage_gte")
        Long usageGte;

        private BillingThresholds(Map<String, Object> extraParams, Long usageGte) {

          this.extraParams = extraParams;
          this.usageGte = usageGte;
        }

        public static SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds.Builder
            builder() {

          return new SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds.Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;
          private Long usageGte;

          public SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds build() {

            return new SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds(
                this.extraParams, this.usageGte);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds#extraParams} for the
           * field documentation.
           */
          public SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds.Builder
              putExtraParam(String key, Object value) {

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
           * SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds#extraParams} for the
           * field documentation.
           */
          public SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds.Builder
              putAllExtraParam(Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Usage threshold that triggers the subscription to advance to a new billing period. */
          public SubscriptionScheduleUpdateParams.Phase.Plan.BillingThresholds.Builder setUsageGte(
              Long usageGte) {

            this.usageGte = usageGte;
            return this;
          }
        }
      }
    }

    public enum EndDate implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private EndDate(String value) {
        this.value = value;
      }
    }

    public enum StartDate implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private StartDate(String value) {
        this.value = value;
      }
    }

    public enum TrialEnd implements ApiRequestParams.EnumParam {
      @SerializedName("now")
      NOW("now");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private TrialEnd(String value) {
        this.value = value;
      }
    }
  }

  public static class RenewalInterval {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Interval at which to renew the subscription schedule for when it ends. Possible values are
     * `day`, `week`, `month`, or `year`.
     */
    @SerializedName("interval")
    SubscriptionScheduleUpdateParams.RenewalInterval.Interval interval;

    /** Number of intervals to renew the subscription schedule for when it ends. */
    @SerializedName("length")
    Long length;

    private RenewalInterval(
        Map<String, Object> extraParams,
        SubscriptionScheduleUpdateParams.RenewalInterval.Interval interval,
        Long length) {

      this.extraParams = extraParams;
      this.interval = interval;
      this.length = length;
    }

    public static SubscriptionScheduleUpdateParams.RenewalInterval.Builder builder() {

      return new SubscriptionScheduleUpdateParams.RenewalInterval.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private SubscriptionScheduleUpdateParams.RenewalInterval.Interval interval;
      private Long length;

      public SubscriptionScheduleUpdateParams.RenewalInterval build() {
        return new SubscriptionScheduleUpdateParams.RenewalInterval(
            this.extraParams, this.interval, this.length);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.RenewalInterval#extraParams} for the field documentation.
       */
      public SubscriptionScheduleUpdateParams.RenewalInterval.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SubscriptionScheduleUpdateParams.RenewalInterval#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleUpdateParams.RenewalInterval.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Interval at which to renew the subscription schedule for when it ends. Possible values are
       * `day`, `week`, `month`, or `year`.
       */
      public SubscriptionScheduleUpdateParams.RenewalInterval.Builder setInterval(
          SubscriptionScheduleUpdateParams.RenewalInterval.Interval interval) {

        this.interval = interval;
        return this;
      }

      /** Number of intervals to renew the subscription schedule for when it ends. */
      public SubscriptionScheduleUpdateParams.RenewalInterval.Builder setLength(Long length) {

        this.length = length;
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

      private Interval(String value) {
        this.value = value;
      }
    }
  }

  public enum Billing implements ApiRequestParams.EnumParam {
    @SerializedName("charge_automatically")
    CHARGE_AUTOMATICALLY("charge_automatically"),
    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Billing(String value) {
      this.value = value;
    }
  }

  public enum RenewalBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("none")
    NONE("none"),
    @SerializedName("release")
    RELEASE("release"),
    @SerializedName("renew")
    RENEW("renew");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private RenewalBehavior(String value) {
      this.value = value;
    }
  }
}
