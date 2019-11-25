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
public class SubscriptionScheduleCreateParams extends ApiRequestParams {
  /** The identifier of the customer to create the subscription schedule for. */
  @SerializedName("customer")
  String customer;

  /** Object representing the subscription schedule's default settings. */
  @SerializedName("default_settings")
  DefaultSettings defaultSettings;

  /**
   * Configures how the subscription schedule behaves when it ends. Possible values are `release` or
   * `cancel` with the default being `release`. `release` will end the subscription schedule and
   * keep the underlying subscription running.`cancel` will end the subscription schedule and cancel
   * the underlying subscription.
   */
  @SerializedName("end_behavior")
  EndBehavior endBehavior;

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
   * auto-renew using the subscription's interval. When using this parameter, other parameters (such
   * as phase values) cannot be set. To create a subscription schedule with other modifications, we
   * recommend making two separate API calls.
   */
  @SerializedName("from_subscription")
  String fromSubscription;

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
  List<Phase> phases;

  /**
   * When the subscription schedule starts. We recommend using `now` so that it starts the
   * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
   * that it starts on a past date, or set a future date for the subscription to start on. When you
   * backdate, the `billing_cycle_anchor` of the subscription is equivalent to the `start_date`.
   */
  @SerializedName("start_date")
  Object startDate;

  private SubscriptionScheduleCreateParams(
      String customer,
      DefaultSettings defaultSettings,
      EndBehavior endBehavior,
      List<String> expand,
      Map<String, Object> extraParams,
      String fromSubscription,
      Map<String, String> metadata,
      List<Phase> phases,
      Object startDate) {
    this.customer = customer;
    this.defaultSettings = defaultSettings;
    this.endBehavior = endBehavior;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fromSubscription = fromSubscription;
    this.metadata = metadata;
    this.phases = phases;
    this.startDate = startDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private DefaultSettings defaultSettings;

    private EndBehavior endBehavior;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String fromSubscription;

    private Map<String, String> metadata;

    private List<Phase> phases;

    private Object startDate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleCreateParams build() {
      return new SubscriptionScheduleCreateParams(
          this.customer,
          this.defaultSettings,
          this.endBehavior,
          this.expand,
          this.extraParams,
          this.fromSubscription,
          this.metadata,
          this.phases,
          this.startDate);
    }

    /** The identifier of the customer to create the subscription schedule for. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** Object representing the subscription schedule's default settings. */
    public Builder setDefaultSettings(DefaultSettings defaultSettings) {
      this.defaultSettings = defaultSettings;
      return this;
    }

    /**
     * Configures how the subscription schedule behaves when it ends. Possible values are `release`
     * or `cancel` with the default being `release`. `release` will end the subscription schedule
     * and keep the underlying subscription running.`cancel` will end the subscription schedule and
     * cancel the underlying subscription.
     */
    public Builder setEndBehavior(EndBehavior endBehavior) {
      this.endBehavior = endBehavior;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCreateParams#expand} for the field documentation.
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
     * SubscriptionScheduleCreateParams#expand} for the field documentation.
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
     * SubscriptionScheduleCreateParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionScheduleCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Migrate an existing subscription to be managed by a subscription schedule. If this parameter
     * is set, a subscription schedule will be created using the subscription's plan(s), set to
     * auto-renew using the subscription's interval. When using this parameter, other parameters
     * (such as phase values) cannot be set. To create a subscription schedule with other
     * modifications, we recommend making two separate API calls.
     */
    public Builder setFromSubscription(String fromSubscription) {
      this.fromSubscription = fromSubscription;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleCreateParams#metadata} for the field documentation.
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
     * See {@link SubscriptionScheduleCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
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
    public Builder addPhase(Phase element) {
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
    public Builder addAllPhase(List<Phase> elements) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(elements);
      return this;
    }

    /**
     * When the subscription schedule starts. We recommend using `now` so that it starts the
     * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
     * that it starts on a past date, or set a future date for the subscription to start on. When
     * you backdate, the `billing_cycle_anchor` of the subscription is equivalent to the
     * `start_date`.
     */
    public Builder setStartDate(Long startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * When the subscription schedule starts. We recommend using `now` so that it starts the
     * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
     * that it starts on a past date, or set a future date for the subscription to start on. When
     * you backdate, the `billing_cycle_anchor` of the subscription is equivalent to the
     * `start_date`.
     */
    public Builder setStartDate(StartDate startDate) {
      this.startDate = startDate;
      return this;
    }
  }

  @Getter
  public static class DefaultSettings {
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    @SerializedName("billing_thresholds")
    Object billingThresholds;

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions. Defaults to `charge_automatically` on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    String defaultPaymentMethod;

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
    InvoiceSettings invoiceSettings;

    private DefaultSettings(
        Object billingThresholds,
        CollectionMethod collectionMethod,
        String defaultPaymentMethod,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings) {
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private String defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public DefaultSettings build() {
        return new DefaultSettings(
            this.billingThresholds,
            this.collectionMethod,
            this.defaultPaymentMethod,
            this.extraParams,
            this.invoiceSettings);
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
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
       * attempt to pay the underlying subscription at the end of each billing cycle using the
       * default source attached to the customer. When sending an invoice, Stripe will email your
       * customer an invoice with payment instructions. Defaults to `charge_automatically` on
       * creation.
       */
      public Builder setCollectionMethod(CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.DefaultSettings#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleCreateParams.DefaultSettings#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If
       * true, `billing_cycle_anchor` will be updated to the date/time the threshold was last
       * reached; otherwise, the value will remain unchanged.
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
        public BillingThresholds build() {
          return new BillingThresholds(
              this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
        }

        /** Monetary threshold that triggers the subscription to advance to a new billing period. */
        public Builder setAmountGte(Long amountGte) {
          this.amountGte = amountGte;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleCreateParams.DefaultSettings.BillingThresholds#extraParams} for the
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
         * SubscriptionScheduleCreateParams.DefaultSettings.BillingThresholds#extraParams} for the
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

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams) {
        this.daysUntilDue = daysUntilDue;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long daysUntilDue;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceSettings build() {
          return new InvoiceSettings(this.daysUntilDue, this.extraParams);
        }

        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleCreateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
         * SubscriptionScheduleCreateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
  }

  @Getter
  public static class Phase {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. The request must be made by a platform account on a
     * connected account in order to set an application fee percentage. For more information, see
     * the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
     * billing period. Pass an empty string to remove previously-defined thresholds.
     */
    @SerializedName("billing_thresholds")
    Object billingThresholds;

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
     * attempt to pay the underlying subscription at the end of each billing cycle using the default
     * source attached to the customer. When sending an invoice, Stripe will email your customer an
     * invoice with payment instructions. Defaults to `charge_automatically` on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /** The identifier of the coupon to apply to this phase of the subscription schedule. */
    @SerializedName("coupon")
    String coupon;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    String defaultPaymentMethod;

    /**
     * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will set the
     * Subscription's
     * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates),
     * which means they will be the Invoice's
     * [`default_tax_rates`](https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates)
     * for any Invoices issued by the Subscription during this Phase. When updating, pass an empty
     * string to remove previously-defined tax rates.
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

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

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
        Object billingThresholds,
        CollectionMethod collectionMethod,
        String coupon,
        String defaultPaymentMethod,
        Object defaultTaxRates,
        Long endDate,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Long iterations,
        List<Plan> plans,
        BigDecimal taxPercent,
        Boolean trial,
        Long trialEnd) {
      this.applicationFeePercent = applicationFeePercent;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.coupon = coupon;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.defaultTaxRates = defaultTaxRates;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.iterations = iterations;
      this.plans = plans;
      this.taxPercent = taxPercent;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private String coupon;

      private String defaultPaymentMethod;

      private Object defaultTaxRates;

      private Long endDate;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Long iterations;

      private List<Plan> plans;

      private BigDecimal taxPercent;

      private Boolean trial;

      private Long trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public Phase build() {
        return new Phase(
            this.applicationFeePercent,
            this.billingThresholds,
            this.collectionMethod,
            this.coupon,
            this.defaultPaymentMethod,
            this.defaultTaxRates,
            this.endDate,
            this.extraParams,
            this.invoiceSettings,
            this.iterations,
            this.plans,
            this.taxPercent,
            this.trial,
            this.trialEnd);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees
       * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
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
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will
       * attempt to pay the underlying subscription at the end of each billing cycle using the
       * default source attached to the customer. When sending an invoice, Stripe will email your
       * customer an invoice with payment instructions. Defaults to `charge_automatically` on
       * creation.
       */
      public Builder setCollectionMethod(CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
      }

      /** The identifier of the coupon to apply to this phase of the subscription schedule. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
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
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#defaultTaxRates} for the field documentation.
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
       * {@link SubscriptionScheduleCreateParams.Phase#defaultTaxRates} for the field documentation.
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
       * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will set
       * the Subscription's
       * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates),
       * which means they will be the Invoice's
       * [`default_tax_rates`](https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates)
       * for any Invoices issued by the Subscription during this Phase. When updating, pass an empty
       * string to remove previously-defined tax rates.
       */
      public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will set
       * the Subscription's
       * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates),
       * which means they will be the Invoice's
       * [`default_tax_rates`](https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates)
       * for any Invoices issued by the Subscription during this Phase. When updating, pass an empty
       * string to remove previously-defined tax rates.
       */
      public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * The date at which this phase of the subscription schedule ends. If set, `iterations` must
       * not be set.
       */
      public Builder setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleCreateParams.Phase#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleCreateParams.Phase#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
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

      /**
       * Add an element to `plans` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#plans} for the field documentation.
       */
      public Builder addPlan(Plan element) {
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
      public Builder addAllPlan(List<Plan> elements) {
        if (this.plans == null) {
          this.plans = new ArrayList<>();
        }
        this.plans.addAll(elements);
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
      public Builder setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
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

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with `trial`
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates if the `billing_cycle_anchor` should be reset when a threshold is reached. If
       * true, `billing_cycle_anchor` will be updated to the date/time the threshold was last
       * reached; otherwise, the value will remain unchanged.
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
        public BillingThresholds build() {
          return new BillingThresholds(
              this.amountGte, this.extraParams, this.resetBillingCycleAnchor);
        }

        /** Monetary threshold that triggers the subscription to advance to a new billing period. */
        public Builder setAmountGte(Long amountGte) {
          this.amountGte = amountGte;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.BillingThresholds#extraParams} for
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.BillingThresholds#extraParams} for
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

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams) {
        this.daysUntilDue = daysUntilDue;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long daysUntilDue;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceSettings build() {
          return new InvoiceSettings(this.daysUntilDue, this.extraParams);
        }

        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.InvoiceSettings#extraParams} for
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.InvoiceSettings#extraParams} for
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
    }

    @Getter
    public static class Plan {
      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. When updating, pass an empty string to remove previously-defined
       * thresholds.
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
       * A list of [Tax Rate](https://stripe.com/docs/api/tax_rates) ids. These Tax Rates will
       * override the
       * [`default_tax_rates`](https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates)
       * on the Subscription. When updating, pass an empty string to remove previously-defined tax
       * rates.
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object billingThresholds;

        private Map<String, Object> extraParams;

        private String plan;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public Plan build() {
          return new Plan(
              this.billingThresholds, this.extraParams, this.plan, this.quantity, this.taxRates);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. When updating, pass an empty string to remove previously-defined
         * thresholds.
         */
        public Builder setBillingThresholds(BillingThresholds billingThresholds) {
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Plan#extraParams} for the field
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Plan#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
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

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleCreateParams.Phase.Plan#taxRates} for the field documentation.
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
         * SubscriptionScheduleCreateParams.Phase.Plan#taxRates} for the field documentation.
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
           * map. See {@link
           * SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds#extraParams} for the
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
           * SubscriptionScheduleCreateParams.Phase.Plan.BillingThresholds#extraParams} for the
           * field documentation.
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
  }

  public enum EndBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("cancel")
    CANCEL("cancel"),

    @SerializedName("none")
    NONE("none"),

    @SerializedName("release")
    RELEASE("release"),

    @SerializedName("renew")
    RENEW("renew");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EndBehavior(String value) {
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
}
