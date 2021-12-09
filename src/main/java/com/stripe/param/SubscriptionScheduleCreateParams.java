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
public class SubscriptionScheduleCreateParams extends ApiRequestParams {
  /** The identifier of the customer to create the subscription schedule for. */
  @SerializedName("customer")
  String customer;

  /** Object representing the subscription schedule's default settings. */
  @SerializedName("default_settings")
  DefaultSettings defaultSettings;

  /**
   * Configures how the subscription schedule behaves when it ends. Possible values are {@code
   * release} or {@code cancel} with the default being {@code release}. {@code release} will end the
   * subscription schedule and keep the underlying subscription running.{@code cancel} will end the
   * subscription schedule and cancel the underlying subscription.
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
   * set, a subscription schedule will be created using the subscription's item(s), set to
   * auto-renew using the subscription's interval. When using this parameter, other parameters (such
   * as phase values) cannot be set. To create a subscription schedule with other modifications, we
   * recommend making two separate API calls.
   */
  @SerializedName("from_subscription")
  String fromSubscription;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have
   * different durations, plans, and coupons. If there are multiple phases, the {@code end_date} of
   * one phase will always equal the {@code start_date} of the next phase.
   */
  @SerializedName("phases")
  List<Phase> phases;

  /**
   * When the subscription schedule starts. We recommend using {@code now} so that it starts the
   * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
   * that it starts on a past date, or set a future date for the subscription to start on.
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
      Object metadata,
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

    private Object metadata;

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
     * Configures how the subscription schedule behaves when it ends. Possible values are {@code
     * release} or {@code cancel} with the default being {@code release}. {@code release} will end
     * the subscription schedule and keep the underlying subscription running.{@code cancel} will
     * end the subscription schedule and cancel the underlying subscription.
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
     * is set, a subscription schedule will be created using the subscription's item(s), set to
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
     * See {@link SubscriptionScheduleCreateParams#metadata} for the field documentation.
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
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
     * When the subscription schedule starts. We recommend using {@code now} so that it starts the
     * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
     * that it starts on a past date, or set a future date for the subscription to start on.
     */
    public Builder setStartDate(Long startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * When the subscription schedule starts. We recommend using {@code now} so that it starts the
     * subscription immediately. You can also use a Unix timestamp to backdate the subscription so
     * that it starts on a past date, or set a future date for the subscription to start on.
     */
    public Builder setStartDate(StartDate startDate) {
      this.startDate = startDate;
      return this;
    }
  }

  @Getter
  public static class DefaultSettings {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. The request must be made by a platform account on a
     * connected account in order to set an application fee percentage. For more information, see
     * the application fees <a
     * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
     */
    @SerializedName("application_fee_percent")
    BigDecimal applicationFeePercent;

    /** Default settings for automatic tax computation. */
    @SerializedName("automatic_tax")
    AutomaticTax automaticTax;

    /**
     * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
     * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if this
     * phase specifies a trial. For more information, see the billing cycle <a
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
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions. Defaults to {@code charge_automatically} on
     * creation.
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

    /**
     * The data with which to automatically create a Transfer for each of the associated
     * subscription's invoices.
     */
    @SerializedName("transfer_data")
    Object transferData;

    private DefaultSettings(
        BigDecimal applicationFeePercent,
        AutomaticTax automaticTax,
        BillingCycleAnchor billingCycleAnchor,
        Object billingThresholds,
        CollectionMethod collectionMethod,
        String defaultPaymentMethod,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Object transferData) {
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.transferData = transferData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BigDecimal applicationFeePercent;

      private AutomaticTax automaticTax;

      private BillingCycleAnchor billingCycleAnchor;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private String defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Object transferData;

      /** Finalize and obtain parameter instance from this builder. */
      public DefaultSettings build() {
        return new DefaultSettings(
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
            this.defaultPaymentMethod,
            this.extraParams,
            this.invoiceSettings,
            this.transferData);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** Default settings for automatic tax computation. */
      public Builder setAutomaticTax(AutomaticTax automaticTax) {
        this.automaticTax = automaticTax;
        return this;
      }

      /**
       * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
       * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
       * this phase specifies a trial. For more information, see the billing cycle <a
       * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
       */
      public Builder setBillingCycleAnchor(BillingCycleAnchor billingCycleAnchor) {
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
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions. Defaults to {@code
       * charge_automatically} on creation.
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

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(TransferData transferData) {
        this.transferData = transferData;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(EmptyParam transferData) {
        this.transferData = transferData;
        return this;
      }
    }

    @Getter
    public static class AutomaticTax {
      /**
       * Enabled automatic tax calculation which will automatically compute tax rates on all
       * invoices generated by the subscription.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AutomaticTax build() {
          return new AutomaticTax(this.enabled, this.extraParams);
        }

        /**
         * Enabled automatic tax calculation which will automatically compute tax rates on all
         * invoices generated by the subscription.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleCreateParams.DefaultSettings.AutomaticTax#extraParams} for the field
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
         * SubscriptionScheduleCreateParams.DefaultSettings.AutomaticTax#extraParams} for the field
         * documentation.
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
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged.
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
    public static class InvoiceSettings {
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

    @Getter
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      String destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public TransferData build() {
          return new TransferData(this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice subtotal that will be transferred
         * to the destination account. By default, the entire amount is transferred to the
         * destination.
         */
        public Builder setAmountPercent(BigDecimal amountPercent) {
          this.amountPercent = amountPercent;
          return this;
        }

        /** ID of an existing, connected Stripe account. */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleCreateParams.DefaultSettings.TransferData#extraParams} for the field
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
         * SubscriptionScheduleCreateParams.DefaultSettings.TransferData#extraParams} for the field
         * documentation.
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
  }

  @Getter
  public static class Phase {
    /**
     * A list of prices and quantities that will generate invoice items appended to the next
     * invoice. You may pass up to 20 items.
     */
    @SerializedName("add_invoice_items")
    List<AddInvoiceItem> addInvoiceItems;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
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
     * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if this
     * phase specifies a trial. For more information, see the billing cycle <a
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
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions. Defaults to {@code charge_automatically} on
     * creation.
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
     * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
     * must not be set.
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
     * List of configuration items, each with an attached price, to apply during this phase of the
     * subscription schedule.
     */
    @SerializedName("items")
    List<Item> items;

    /**
     * Integer representing the multiplier applied to the price interval. For example, {@code
     * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
     * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date} must
     * not be set.
     */
    @SerializedName("iterations")
    Long iterations;

    /**
     * If a subscription schedule will create prorations when transitioning to this phase. Possible
     * values are {@code create_prorations} or {@code none}, and the default value is {@code
     * create_prorations}. See <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">Prorations</a>.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

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

    /**
     * Sets the phase to trialing from the start date to this date. Must be before the phase end
     * date, can not be combined with {@code trial}
     */
    @SerializedName("trial_end")
    Long trialEnd;

    private Phase(
        List<AddInvoiceItem> addInvoiceItems,
        BigDecimal applicationFeePercent,
        AutomaticTax automaticTax,
        BillingCycleAnchor billingCycleAnchor,
        Object billingThresholds,
        CollectionMethod collectionMethod,
        String coupon,
        String defaultPaymentMethod,
        Object defaultTaxRates,
        Long endDate,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        List<Item> items,
        Long iterations,
        ProrationBehavior prorationBehavior,
        TransferData transferData,
        Boolean trial,
        Long trialEnd) {
      this.addInvoiceItems = addInvoiceItems;
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.coupon = coupon;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.defaultTaxRates = defaultTaxRates;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.items = items;
      this.iterations = iterations;
      this.prorationBehavior = prorationBehavior;
      this.transferData = transferData;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<AddInvoiceItem> addInvoiceItems;

      private BigDecimal applicationFeePercent;

      private AutomaticTax automaticTax;

      private BillingCycleAnchor billingCycleAnchor;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private String coupon;

      private String defaultPaymentMethod;

      private Object defaultTaxRates;

      private Long endDate;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private List<Item> items;

      private Long iterations;

      private ProrationBehavior prorationBehavior;

      private TransferData transferData;

      private Boolean trial;

      private Long trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public Phase build() {
        return new Phase(
            this.addInvoiceItems,
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
            this.coupon,
            this.defaultPaymentMethod,
            this.defaultTaxRates,
            this.endDate,
            this.extraParams,
            this.invoiceSettings,
            this.items,
            this.iterations,
            this.prorationBehavior,
            this.transferData,
            this.trial,
            this.trialEnd);
      }

      /**
       * Add an element to `addInvoiceItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAddInvoiceItem(AddInvoiceItem element) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.add(element);
        return this;
      }

      /**
       * Add all elements to `addInvoiceItems` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleCreateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAllAddInvoiceItem(List<AddInvoiceItem> elements) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.addAll(elements);
        return this;
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * application owner's Stripe account. The request must be made by a platform account on a
       * connected account in order to set an application fee percentage. For more information, see
       * the application fees <a
       * href="https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions">documentation</a>.
       */
      public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
        this.applicationFeePercent = applicationFeePercent;
        return this;
      }

      /** Automatic tax settings for this phase. */
      public Builder setAutomaticTax(AutomaticTax automaticTax) {
        this.automaticTax = automaticTax;
        return this;
      }

      /**
       * Can be set to {@code phase_start} to set the anchor to the start of the phase or {@code
       * automatic} to automatically change it if needed. Cannot be set to {@code phase_start} if
       * this phase specifies a trial. For more information, see the billing cycle <a
       * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
       */
      public Builder setBillingCycleAnchor(BillingCycleAnchor billingCycleAnchor) {
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
      public Builder setBillingThresholds(EmptyParam billingThresholds) {
        this.billingThresholds = billingThresholds;
        return this;
      }

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions. Defaults to {@code
       * charge_automatically} on creation.
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
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
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
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
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
       * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
       * must not be set.
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
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#items} for the field documentation.
       */
      public Builder addItem(Item element) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleCreateParams.Phase#items} for the field documentation.
       */
      public Builder addAllItem(List<Item> elements) {
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
       * If a subscription schedule will create prorations when transitioning to this phase.
       * Possible values are {@code create_prorations} or {@code none}, and the default value is
       * {@code create_prorations}. See <a
       * href="https://stripe.com/docs/billing/subscriptions/prorations">Prorations</a>.
       */
      public Builder setProrationBehavior(ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(TransferData transferData) {
        this.transferData = transferData;
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
       * date, can not be combined with {@code trial}
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }
    }

    @Getter
    public static class AddInvoiceItem {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the price object. */
      @SerializedName("price")
      String price;

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline.
       */
      @SerializedName("price_data")
      PriceData priceData;

      /** Quantity for this item. Defaults to 1. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not apply
       * to this item.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private AddInvoiceItem(
          Map<String, Object> extraParams,
          String price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
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
        private Map<String, Object> extraParams;

        private String price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public AddInvoiceItem build() {
          return new AddInvoiceItem(
              this.extraParams, this.price, this.priceData, this.quantity, this.taxRates);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.AddInvoiceItem#extraParams} for
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.AddInvoiceItem#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline.
         */
        public Builder setPriceData(PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /** Quantity for this item. Defaults to 1. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleCreateParams.Phase.AddInvoiceItem#taxRates} for the field
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
         * SubscriptionScheduleCreateParams.Phase.AddInvoiceItem#taxRates} for the field
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the product that this price will belong to. */
        @SerializedName("product")
        String product;

        /**
         * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
         * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
         * {@code inclusive} or {@code exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
         * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
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
          public PriceData build() {
            return new PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleCreateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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
           * SubscriptionScheduleCreateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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

          /**
           * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as
           * either {@code inclusive} or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
           * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
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
       * Enabled automatic tax calculation which will automatically compute tax rates on all
       * invoices generated by the subscription.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
        this.enabled = enabled;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AutomaticTax build() {
          return new AutomaticTax(this.enabled, this.extraParams);
        }

        /**
         * Enabled automatic tax calculation which will automatically compute tax rates on all
         * invoices generated by the subscription.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.AutomaticTax#extraParams} for the
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.AutomaticTax#extraParams} for the
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
       * Indicates if the {@code billing_cycle_anchor} should be reset when a threshold is reached.
       * If true, {@code billing_cycle_anchor} will be updated to the date/time the threshold was
       * last reached; otherwise, the value will remain unchanged.
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
    public static class InvoiceSettings {
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
    public static class Item {
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

      /**
       * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code price}.
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
          Map<String, Object> extraParams,
          String plan,
          String price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
        this.billingThresholds = billingThresholds;
        this.extraParams = extraParams;
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

        private Map<String, Object> extraParams;

        private String plan;

        private String price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public Item build() {
          return new Item(
              this.billingThresholds,
              this.extraParams,
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Item#extraParams} for the field
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.Item#extraParams} for the field
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
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline.
         */
        public Builder setPriceData(PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /**
         * Quantity for the given price. Can be set only if the price's {@code usage_type} is {@code
         * licensed} and not {@code metered}.
         */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleCreateParams.Phase.Item#taxRates} for the field documentation.
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
         * SubscriptionScheduleCreateParams.Phase.Item#taxRates} for the field documentation.
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
           * SubscriptionScheduleCreateParams.Phase.Item.BillingThresholds#extraParams} for the
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
           * SubscriptionScheduleCreateParams.Phase.Item.BillingThresholds#extraParams} for the
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the product that this price will belong to. */
        @SerializedName("product")
        String product;

        /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
        @SerializedName("recurring")
        Recurring recurring;

        /**
         * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
         * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
         * {@code inclusive} or {@code exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
         * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
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
          public PriceData build() {
            return new PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.recurring,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleCreateParams.Phase.Item.PriceData#extraParams} for
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
           * map. See {@link SubscriptionScheduleCreateParams.Phase.Item.PriceData#extraParams} for
           * the field documentation.
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

          /**
           * The recurring components of a price such as {@code interval} and {@code usage_type}.
           */
          public Builder setRecurring(Recurring recurring) {
            this.recurring = recurring;
            return this;
          }

          /**
           * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as
           * either {@code inclusive} or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
           * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
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
            public Recurring build() {
              return new Recurring(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleCreateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * SubscriptionScheduleCreateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or
             * {@code year}.
             */
            public Builder setInterval(Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one
             * year interval allowed (1 year, 12 months, or 52 weeks).
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
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      String destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public TransferData build() {
          return new TransferData(this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice subtotal that will be transferred
         * to the destination account. By default, the entire amount is transferred to the
         * destination.
         */
        public Builder setAmountPercent(BigDecimal amountPercent) {
          this.amountPercent = amountPercent;
          return this;
        }

        /** ID of an existing, connected Stripe account. */
        public Builder setDestination(String destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleCreateParams.Phase.TransferData#extraParams} for the
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
         * map. See {@link SubscriptionScheduleCreateParams.Phase.TransferData#extraParams} for the
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
