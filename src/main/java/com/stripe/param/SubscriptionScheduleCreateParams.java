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

public class SubscriptionScheduleCreateParams extends ApiRequestParams {

  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
   * attempt to pay the underlying subscription at the end of each billing cycle using the default
   * source attached to the customer. When sending an invoice, Stripe will email your customer an
   * invoice with payment instructions. Defaults to `charge_automatically` on creation.
   */
  @SerializedName("billing")
  SubscriptionScheduleCreateParams.Billing billing;

  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
   * billing period. Pass an empty string to remove previously-defined thresholds.
   */
  @SerializedName("billing_thresholds")
  Object billingThresholds;

  /** The identifier of the customer to create the subscription schedule for. */
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

  /**
   * Migrate an existing subscription to be managed by a subscription schedule. If this parameter is
   * set, a subscription schedule will be created using the subscription's plan(s), set to
   * auto-renew using the subscription's interval. Other parameters cannot be set since their values
   * will be inferred from the subscription.
   */
  @SerializedName("from_subscription")
  String fromSubscription;

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  SubscriptionScheduleCreateParams.InvoiceSettings invoiceSettings;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have
   * different durations, plans, and coupons. If there are multiple phases, the `end_date` of one
   * phase will always equal the `start_date` of the next phase.
   */
  @SerializedName("phases")
  List<SubscriptionScheduleCreateParams.Phase> phases;

  /**
   * Configures how the subscription schedule behaves when it ends. Possible values are `none`,
   * `renew`, or `release`. `renew` will create a new subscription schedule revision by adding a new
   * phase using the most recent phase's `plans` applied to a duration set by `renewal_interval`.
   * `none` will stop the subscription schedule and cancel the underlying subscription. `release`
   * will stop the subscription schedule, but keep the underlying subscription running.
   */
  @SerializedName("renewal_behavior")
  SubscriptionScheduleCreateParams.RenewalBehavior renewalBehavior;

  /**
   * Configuration for renewing the subscription schedule when it ends. Must be set if
   * `renewal_behavior` is `renew`. Otherwise, must not be set.
   */
  @SerializedName("renewal_interval")
  SubscriptionScheduleCreateParams.RenewalInterval renewalInterval;

  /** The date at which the subscription schedule starts. */
  @SerializedName("start_date")
  Object startDate;

  private SubscriptionScheduleCreateParams(
      SubscriptionScheduleCreateParams.Billing billing,
      Object billingThresholds,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String fromSubscription,
      SubscriptionScheduleCreateParams.InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      List<SubscriptionScheduleCreateParams.Phase> phases,
      SubscriptionScheduleCreateParams.RenewalBehavior renewalBehavior,
      SubscriptionScheduleCreateParams.RenewalInterval renewalInterval,
      Object startDate) {

    this.billing = billing;
    this.billingThresholds = billingThresholds;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fromSubscription = fromSubscription;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.phases = phases;
    this.renewalBehavior = renewalBehavior;
    this.renewalInterval = renewalInterval;
    this.startDate = startDate;
  }

  public static SubscriptionScheduleCreateParams.Builder builder() {
    return new SubscriptionScheduleCreateParams.Builder();
  }

  public static class Builder {
    private SubscriptionScheduleCreateParams.Billing billing;
    private Object billingThresholds;
    private String customer;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private String fromSubscription;
    private SubscriptionScheduleCreateParams.InvoiceSettings invoiceSettings;
    private Map<String, String> metadata;
    private List<SubscriptionScheduleCreateParams.Phase> phases;
    private SubscriptionScheduleCreateParams.RenewalBehavior renewalBehavior;
    private SubscriptionScheduleCreateParams.RenewalInterval renewalInterval;
    private Object startDate;

    public SubscriptionScheduleCreateParams build() {
      return new SubscriptionScheduleCreateParams(
          this.billing,
          this.billingThresholds,
          this.customer,
          this.expand,
          this.extraParams,
          this.fromSubscription,
          this.invoiceSettings,
          this.metadata,
          this.phases,
          this.renewalBehavior,
          this.renewalInterval,
          this.startDate);
    }

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions. Defaults to `charge_automatically` on creation.
     */
    public SubscriptionScheduleCreateParams.Builder setBilling(
        SubscriptionScheduleCreateParams.Billing billing) {

      this.billing = billing;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public SubscriptionScheduleCreateParams.Builder setBillingThresholds(
        SubscriptionScheduleCreateParams.BillingThresholds billingThresholds) {

      this.billingThresholds = billingThresholds;
      return this;
    }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    public SubscriptionScheduleCreateParams.Builder setBillingThresholds(
        EmptyParam billingThresholds) {

      this.billingThresholds = billingThresholds;
      return this;
    }

    /** The identifier of the customer to create the subscription schedule for. */
    public SubscriptionScheduleCreateParams.Builder setCustomer(String customer) {

      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCreateParams#expand} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder addExpand(String element) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCreateParams#expand} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleCreateParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleCreateParams#extraParams} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Migrate an existing subscription to be managed by a subscription schedule. If this parameter
     * is set, a subscription schedule will be created using the subscription's plan(s), set to
     * auto-renew using the subscription's interval. Other parameters cannot be set since their
     * values will be inferred from the subscription.
     */
    public SubscriptionScheduleCreateParams.Builder setFromSubscription(String fromSubscription) {

      this.fromSubscription = fromSubscription;
      return this;
    }

    /** All invoices will be billed using the specified settings. */
    public SubscriptionScheduleCreateParams.Builder setInvoiceSettings(
        SubscriptionScheduleCreateParams.InvoiceSettings invoiceSettings) {

      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleCreateParams#metadata} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SubscriptionScheduleCreateParams#metadata} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCreateParams#phases} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder addPhase(
        SubscriptionScheduleCreateParams.Phase element) {

      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.add(element);
      return this;
    }

    /**
     * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCreateParams#phases} for the field documentation.
     */
    public SubscriptionScheduleCreateParams.Builder addAllPhase(
        List<SubscriptionScheduleCreateParams.Phase> list) {

      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(list);
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
    public SubscriptionScheduleCreateParams.Builder setRenewalBehavior(
        SubscriptionScheduleCreateParams.RenewalBehavior renewalBehavior) {

      this.renewalBehavior = renewalBehavior;
      return this;
    }

    /**
     * Configuration for renewing the subscription schedule when it ends. Must be set if
     * `renewal_behavior` is `renew`. Otherwise, must not be set.
     */
    public SubscriptionScheduleCreateParams.Builder setRenewalInterval(
        SubscriptionScheduleCreateParams.RenewalInterval renewalInterval) {

      this.renewalInterval = renewalInterval;
      return this;
    }

    /** The date at which the subscription schedule starts. */
    public SubscriptionScheduleCreateParams.Builder setStartDate(Long startDate) {

      this.startDate = startDate;
      return this;
    }

    /** The date at which the subscription schedule starts. */
    public SubscriptionScheduleCreateParams.Builder setStartDate(
        SubscriptionScheduleCreateParams.StartDate startDate) {

      this.startDate = startDate;
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

    public static SubscriptionScheduleCreateParams.BillingThresholds.Builder builder() {

      return new SubscriptionScheduleCreateParams.BillingThresholds.Builder();
    }

    public static class Builder {
      private Long amountGte;
      private Map<String, Object> extraParams;
      private Boolean resetBillingCycleAnchor;

      public SubscriptionScheduleCreateParams.BillingThresholds build() {
        return new SubscriptionScheduleCreateParams.BillingThresholds(
            this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
      }

      /** Monetary threshold that triggers the subscription to advance to a new billing period. */
      public SubscriptionScheduleCreateParams.BillingThresholds.Builder setAmountGte(
          Long amountGte) {

        this.amountGte = amountGte;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleCreateParams.BillingThresholds.Builder putExtraParam(
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
       * See {@link SubscriptionScheduleCreateParams.BillingThresholds#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleCreateParams.BillingThresholds.Builder putAllExtraParam(
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
      public SubscriptionScheduleCreateParams.BillingThresholds.Builder setResetBillingCycleAnchor(
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

    public static SubscriptionScheduleCreateParams.InvoiceSettings.Builder builder() {

      return new SubscriptionScheduleCreateParams.InvoiceSettings.Builder();
    }

    public static class Builder {
      private Long daysUntilDue;
      private Map<String, Object> extraParams;

      public SubscriptionScheduleCreateParams.InvoiceSettings build() {
        return new SubscriptionScheduleCreateParams.InvoiceSettings(
            this.daysUntilDue, this.extraParams);
      }

      public SubscriptionScheduleCreateParams.InvoiceSettings.Builder setDaysUntilDue(
          Long daysUntilDue) {

        this.daysUntilDue = daysUntilDue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.InvoiceSettings#extraParams} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.InvoiceSettings.Builder putExtraParam(
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
       * See {@link SubscriptionScheduleCreateParams.InvoiceSettings#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleCreateParams.InvoiceSettings.Builder putAllExtraParam(
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
    Long endDate;

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
    List<SubscriptionScheduleCreateParams.Phase.Plan> plans;

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
    Long trialEnd;

    private Phase(
        BigDecimal applicationFeePercent,
        String coupon,
        Object defaultTaxRates,
        Long endDate,
        Map<String, Object> extraParams,
        Long iterations,
        List<SubscriptionScheduleCreateParams.Phase.Plan> plans,
        BigDecimal taxPercent,
        Boolean trial,
        Long trialEnd) {

      this.applicationFeePercent = applicationFeePercent;
      this.coupon = coupon;
      this.defaultTaxRates = defaultTaxRates;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.iterations = iterations;
      this.plans = plans;
      this.taxPercent = taxPercent;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static SubscriptionScheduleCreateParams.Phase.Builder builder() {
      return new SubscriptionScheduleCreateParams.Phase.Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;
      private String coupon;
      private Object defaultTaxRates;
      private Long endDate;
      private Map<String, Object> extraParams;
      private Long iterations;
      private List<SubscriptionScheduleCreateParams.Phase.Plan> plans;
      private BigDecimal taxPercent;
      private Boolean trial;
      private Long trialEnd;

      public SubscriptionScheduleCreateParams.Phase build() {
        return new SubscriptionScheduleCreateParams.Phase(
            this.applicationFeePercent,
            this.coupon,
            this.defaultTaxRates,
            this.endDate,
            this.extraParams,
            this.iterations,
            this.plans,
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
      public SubscriptionScheduleCreateParams.Phase.Builder setApplicationFeePercent(
          BigDecimal applicationFeePercent) {

        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** The identifier of the coupon to apply to this phase of the subscription schedule. */
      public SubscriptionScheduleCreateParams.Phase.Builder setCoupon(String coupon) {

        this.coupon = coupon;
        return this;
      }

      /**
       * The tax rates that will apply to any phase that does not have `tax_rates` set. Invoices
       * created will have their `default_tax_rates` populated from the phase.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder setDefaultTaxRates(
          List<String> defaultTaxRates) {

        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * The tax rates that will apply to any phase that does not have `tax_rates` set. Invoices
       * created will have their `default_tax_rates` populated from the phase.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder setDefaultTaxRates(
          EmptyParam defaultTaxRates) {

        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, `iterations` must
       * not be set.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder setEndDate(Long endDate) {

        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.Phase#extraParams} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder putExtraParam(
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
       * See {@link SubscriptionScheduleCreateParams.Phase#extraParams} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder putAllExtraParam(
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
      public SubscriptionScheduleCreateParams.Phase.Builder setIterations(Long iterations) {

        this.iterations = iterations;
        return this;
      }

      /**
       * Add an element to `plans` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#plans} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder addPlan(
          SubscriptionScheduleCreateParams.Phase.Plan element) {

        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.add(element);
        return this;
      }

      /**
       * Add all elements to `plans` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#plans} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder addAllPlan(
          List<SubscriptionScheduleCreateParams.Phase.Plan> list) {

        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.addAll(list);
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
      public SubscriptionScheduleCreateParams.Phase.Builder setTaxPercent(BigDecimal taxPercent) {

        this.taxPercent = taxPercent;
        return this;
      }

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      public SubscriptionScheduleCreateParams.Phase.Builder setTrial(Boolean trial) {

        this.trial = trial;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with `trial`
       */
      public SubscriptionScheduleCreateParams.Phase.Builder setTrialEnd(Long trialEnd) {

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

      public static SubscriptionScheduleCreateParams.Phase.Plan.Builder builder() {

        return new SubscriptionScheduleCreateParams.Phase.Plan.Builder();
      }

      public static class Builder {
        private Object billingThresholds;
        private Map<String, Object> extraParams;
        private String plan;
        private Long quantity;
        private Object taxRates;

        public SubscriptionScheduleCreateParams.Phase.Plan build() {
          return new SubscriptionScheduleCreateParams.Phase.Plan(
              this.billingThresholds, this.extraParams, this.plan, this.quantity, this.taxRates);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setBillingThresholds(
            SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds billingThresholds) {

          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setBillingThresholds(
            EmptyParam billingThresholds) {

          this.billingThresholds = billingThresholds;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Plan#extraParams} for the field
         * documentation.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder putExtraParam(
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Plan#extraParams} for the field
         * documentation.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The plan ID to subscribe to. */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setPlan(String plan) {

          this.plan = plan;
          return this;
        }

        /**
         * Quantity for the given plan. Can be set only if the plan's `usage_type` is `licensed` and
         * not `metered`.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setQuantity(Long quantity) {

          this.quantity = quantity;
          return this;
        }

        /**
         * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates`
         * on the subscription do not apply to this `subscription_item`.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setTaxRates(
            List<String> taxRates) {

          this.taxRates = taxRates;
          return this;
        }

        /**
         * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates`
         * on the subscription do not apply to this `subscription_item`.
         */
        public SubscriptionScheduleCreateParams.Phase.Plan.Builder setTaxRates(
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

        public static SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds.Builder
            builder() {

          return new SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds.Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;
          private Long usageGte;

          public SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds build() {

            return new SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds(
                this.extraParams, this.usageGte);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds#extraParams} for the
           * field documentation.
           */
          public SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds.Builder
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
           * SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds#extraParams} for the
           * field documentation.
           */
          public SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds.Builder
              putAllExtraParam(Map<String, Object> map) {

            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Usage threshold that triggers the subscription to advance to a new billing period. */
          public SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds.Builder setUsageGte(
              Long usageGte) {

            this.usageGte = usageGte;
            return this;
          }
        }
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
    SubscriptionScheduleCreateParams.RenewalInterval.Interval interval;

    /** Number of intervals to renew the subscription schedule for when it ends. */
    @SerializedName("length")
    Long length;

    private RenewalInterval(
        Map<String, Object> extraParams,
        SubscriptionScheduleCreateParams.RenewalInterval.Interval interval,
        Long length) {

      this.extraParams = extraParams;
      this.interval = interval;
      this.length = length;
    }

    public static SubscriptionScheduleCreateParams.RenewalInterval.Builder builder() {

      return new SubscriptionScheduleCreateParams.RenewalInterval.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private SubscriptionScheduleCreateParams.RenewalInterval.Interval interval;
      private Long length;

      public SubscriptionScheduleCreateParams.RenewalInterval build() {
        return new SubscriptionScheduleCreateParams.RenewalInterval(
            this.extraParams, this.interval, this.length);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.RenewalInterval#extraParams} for the field documentation.
       */
      public SubscriptionScheduleCreateParams.RenewalInterval.Builder putExtraParam(
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
       * See {@link SubscriptionScheduleCreateParams.RenewalInterval#extraParams} for the field
       * documentation.
       */
      public SubscriptionScheduleCreateParams.RenewalInterval.Builder putAllExtraParam(
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
      public SubscriptionScheduleCreateParams.RenewalInterval.Builder setInterval(
          SubscriptionScheduleCreateParams.RenewalInterval.Interval interval) {

        this.interval = interval;
        return this;
      }

      /** Number of intervals to renew the subscription schedule for when it ends. */
      public SubscriptionScheduleCreateParams.RenewalInterval.Builder setLength(Long length) {

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

  public enum StartDate implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private StartDate(String value) {
      this.value = value;
    }
  }
}
