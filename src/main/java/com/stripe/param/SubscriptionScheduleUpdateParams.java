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
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionScheduleUpdateParams extends ApiRequestParams {
  /** Object representing the subscription schedule's default settings. */
  @SerializedName("default_settings")
  DefaultSettings defaultSettings;

  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values
   * are {@code release} or {@code cancel} with the default being {@code release}. {@code release}
   * will end the subscription schedule and keep the underlying subscription running. {@code cancel}
   * will end the subscription schedule and cancel the underlying subscription.
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
   * one phase will always equal the {@code start_date} of the next phase. Note that past phases can
   * be omitted.
   */
  @SerializedName("phases")
  List<SubscriptionScheduleUpdateParams.Phase> phases;

  /**
   * If the update changes the billing configuration (item price, quantity, etc.) of the current
   * phase, indicates how prorations from this change should be handled. The default value is {@code
   * create_prorations}.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  private SubscriptionScheduleUpdateParams(
      DefaultSettings defaultSettings,
      EndBehavior endBehavior,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      List<SubscriptionScheduleUpdateParams.Phase> phases,
      ProrationBehavior prorationBehavior) {
    this.defaultSettings = defaultSettings;
    this.endBehavior = endBehavior;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.phases = phases;
    this.prorationBehavior = prorationBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private DefaultSettings defaultSettings;

    private EndBehavior endBehavior;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private List<SubscriptionScheduleUpdateParams.Phase> phases;

    private ProrationBehavior prorationBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleUpdateParams build() {
      return new SubscriptionScheduleUpdateParams(
          this.defaultSettings,
          this.endBehavior,
          this.expand,
          this.extraParams,
          this.metadata,
          this.phases,
          this.prorationBehavior);
    }

    /** Object representing the subscription schedule's default settings. */
    public Builder setDefaultSettings(
        SubscriptionScheduleUpdateParams.DefaultSettings defaultSettings) {
      this.defaultSettings = defaultSettings;
      return this;
    }

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends. Possible
     * values are {@code release} or {@code cancel} with the default being {@code release}. {@code
     * release} will end the subscription schedule and keep the underlying subscription running.
     * {@code cancel} will end the subscription schedule and cancel the underlying subscription.
     */
    public Builder setEndBehavior(SubscriptionScheduleUpdateParams.EndBehavior endBehavior) {
      this.endBehavior = endBehavior;
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
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionScheduleUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionScheduleUpdateParams#metadata} for the field documentation.
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
     * See {@link SubscriptionScheduleUpdateParams#metadata} for the field documentation.
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
     * SubscriptionScheduleUpdateParams#phases} for the field documentation.
     */
    public Builder addPhase(SubscriptionScheduleUpdateParams.Phase element) {
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
    public Builder addAllPhase(List<SubscriptionScheduleUpdateParams.Phase> elements) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(elements);
      return this;
    }

    /**
     * If the update changes the billing configuration (item price, quantity, etc.) of the current
     * phase, indicates how prorations from this change should be handled. The default value is
     * {@code create_prorations}.
     */
    public Builder setProrationBehavior(
        SubscriptionScheduleUpdateParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultSettings {
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. The request must be made by a platform account on a connected account
     * in order to set an application fee percentage. For more information, see the application fees
     * <a
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
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     * Defaults to {@code charge_automatically} on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    Object defaultPaymentMethod;

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    Object description;

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
     * The account on behalf of which to charge, for each of the associated subscription's invoices.
     */
    @SerializedName("on_behalf_of")
    Object onBehalfOf;

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
        Object defaultPaymentMethod,
        Object description,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Object onBehalfOf,
        Object transferData) {
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.description = description;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.onBehalfOf = onBehalfOf;
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

      private Object defaultPaymentMethod;

      private Object description;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Object onBehalfOf;

      private Object transferData;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.DefaultSettings build() {
        return new SubscriptionScheduleUpdateParams.DefaultSettings(
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
            this.defaultPaymentMethod,
            this.description,
            this.extraParams,
            this.invoiceSettings,
            this.onBehalfOf,
            this.transferData);
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
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
      public Builder setAutomaticTax(
          SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax automaticTax) {
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
          SubscriptionScheduleUpdateParams.DefaultSettings.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(
          SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds billingThresholds) {
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
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      public Builder setCollectionMethod(
          SubscriptionScheduleUpdateParams.DefaultSettings.CollectionMethod collectionMethod) {
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
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.DefaultSettings#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.DefaultSettings#extraParams} for the field
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
      public Builder setInvoiceSettings(
          SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
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
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(
          SubscriptionScheduleUpdateParams.DefaultSettings.TransferData transferData) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax(
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax#extraParams} for the field
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax#extraParams} for the field
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
        public Builder setLiability(
            SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability liability) {
          this.liability = liability;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Liability {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Liability(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability build() {
            return new SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability#extraParams}
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
           * SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability#extraParams}
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
              SubscriptionScheduleUpdateParams.DefaultSettings.AutomaticTax.Liability.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds(
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds#extraParams} for the
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.BillingThresholds#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings {
      /**
       * The account tax IDs associated with the subscription schedule. Will be set on invoices
       * generated by the subscription schedule.
       */
      @SerializedName("account_tax_ids")
      Object accountTaxIds;

      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * collection_method=charge_automatically}.
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

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceSettings(
          Object accountTaxIds, Long daysUntilDue, Map<String, Object> extraParams, Issuer issuer) {
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
        public SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings(
              this.accountTaxIds, this.daysUntilDue, this.extraParams, this.issuer);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#accountTaxIds} for the
         * field documentation.
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#accountTaxIds} for the
         * field documentation.
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
         * The account tax IDs associated with the subscription schedule. Will be set on invoices
         * generated by the subscription schedule.
         */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * The account tax IDs associated with the subscription schedule. Will be set on invoices
         * generated by the subscription schedule.
         */
        public Builder setAccountTaxIds(List<String> accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * Number of days within which a customer must pay invoices generated by this subscription
         * schedule. This value will be {@code null} for subscription schedules where {@code
         * collection_method=charge_automatically}.
         */
        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings#extraParams} for the
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
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer build() {
            return new SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer#extraParams}
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
           * SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer#extraParams}
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
              SubscriptionScheduleUpdateParams.DefaultSettings.InvoiceSettings.Issuer.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      Object destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TransferData(
          BigDecimal amountPercent, Object destination, Map<String, Object> extraParams) {
        this.amountPercent = amountPercent;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BigDecimal amountPercent;

        private Object destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.DefaultSettings.TransferData build() {
          return new SubscriptionScheduleUpdateParams.DefaultSettings.TransferData(
              this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
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

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(EmptyParam destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * SubscriptionScheduleUpdateParams.DefaultSettings.TransferData#extraParams} for the field
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
         * SubscriptionScheduleUpdateParams.DefaultSettings.TransferData#extraParams} for the field
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
  @EqualsAndHashCode(callSuper = false)
  public static class Phase {
    /**
     * A list of prices and quantities that will generate invoice items appended to the next invoice
     * for this phase. You may pass up to 20 items.
     */
    @SerializedName("add_invoice_items")
    List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. The request must be made by a platform account on a connected account
     * in order to set an application fee percentage. For more information, see the application fees
     * <a
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
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     * Defaults to {@code charge_automatically} on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    Object currency;

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the
     * customer associated with the subscription schedule. If not set, invoices will use the default
     * payment method in the customer's invoice settings.
     */
    @SerializedName("default_payment_method")
    Object defaultPaymentMethod;

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
     * <strong>Required.</strong> List of configuration items, each with an attached price, to apply
     * during this phase of the subscription schedule.
     */
    @SerializedName("items")
    List<SubscriptionScheduleUpdateParams.Phase.Item> items;

    /**
     * Integer representing the multiplier applied to the price interval. For example, {@code
     * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
     * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date} must
     * not be set.
     */
    @SerializedName("iterations")
    Long iterations;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to a phase. Metadata on a schedule's phase will update the underlying subscription's {@code
     * metadata} when the phase is entered, adding new keys and replacing existing keys in the
     * subscription's {@code metadata}. Individual keys in the subscription's {@code metadata} can
     * be unset by posting an empty value to them in the phase's {@code metadata}. To unset all keys
     * in the subscription's {@code metadata}, update the subscription directly or unset every key
     * individually from the phase's {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The account on behalf of which to charge, for each of the associated subscription's invoices.
     */
    @SerializedName("on_behalf_of")
    Object onBehalfOf;

    /**
     * Controls whether the subscription schedule should create <a
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
     * transitioning to this phase if there is a difference in billing configuration. It's different
     * from the request-level <a
     * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
     * parameter which controls what happens if the update request affects the billing configuration
     * (item price, quantity, etc.) of the current phase.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * The date at which this phase of the subscription schedule starts or {@code now}. Must be set
     * on the first phase.
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

    /**
     * Sets the phase to trialing from the start date to this date. Must be before the phase end
     * date, can not be combined with {@code trial}
     */
    @SerializedName("trial_end")
    Object trialEnd;

    private Phase(
        List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems,
        BigDecimal applicationFeePercent,
        AutomaticTax automaticTax,
        BillingCycleAnchor billingCycleAnchor,
        Object billingThresholds,
        CollectionMethod collectionMethod,
        Object currency,
        Object defaultPaymentMethod,
        Object defaultTaxRates,
        Object description,
        Object discounts,
        Object endDate,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        List<SubscriptionScheduleUpdateParams.Phase.Item> items,
        Long iterations,
        Map<String, String> metadata,
        Object onBehalfOf,
        ProrationBehavior prorationBehavior,
        Object startDate,
        TransferData transferData,
        Boolean trial,
        Object trialEnd) {
      this.addInvoiceItems = addInvoiceItems;
      this.applicationFeePercent = applicationFeePercent;
      this.automaticTax = automaticTax;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingThresholds = billingThresholds;
      this.collectionMethod = collectionMethod;
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
      this.prorationBehavior = prorationBehavior;
      this.startDate = startDate;
      this.transferData = transferData;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> addInvoiceItems;

      private BigDecimal applicationFeePercent;

      private AutomaticTax automaticTax;

      private BillingCycleAnchor billingCycleAnchor;

      private Object billingThresholds;

      private CollectionMethod collectionMethod;

      private Object currency;

      private Object defaultPaymentMethod;

      private Object defaultTaxRates;

      private Object description;

      private Object discounts;

      private Object endDate;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private List<SubscriptionScheduleUpdateParams.Phase.Item> items;

      private Long iterations;

      private Map<String, String> metadata;

      private Object onBehalfOf;

      private ProrationBehavior prorationBehavior;

      private Object startDate;

      private TransferData transferData;

      private Boolean trial;

      private Object trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionScheduleUpdateParams.Phase build() {
        return new SubscriptionScheduleUpdateParams.Phase(
            this.addInvoiceItems,
            this.applicationFeePercent,
            this.automaticTax,
            this.billingCycleAnchor,
            this.billingThresholds,
            this.collectionMethod,
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
            this.prorationBehavior,
            this.startDate,
            this.transferData,
            this.trial,
            this.trialEnd);
      }

      /**
       * Add an element to `addInvoiceItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAddInvoiceItem(
          SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem element) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.add(element);
        return this;
      }

      /**
       * Add all elements to `addInvoiceItems` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link SubscriptionScheduleUpdateParams.Phase#addInvoiceItems} for the field documentation.
       */
      public Builder addAllAddInvoiceItem(
          List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem> elements) {
        if (this.addInvoiceItems == null) {
          this.addInvoiceItems = new ArrayList<>();
        }
        this.addInvoiceItems.addAll(elements);
        return this;
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
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
      public Builder setAutomaticTax(
          SubscriptionScheduleUpdateParams.Phase.AutomaticTax automaticTax) {
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
          SubscriptionScheduleUpdateParams.Phase.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      public Builder setBillingThresholds(
          SubscriptionScheduleUpdateParams.Phase.BillingThresholds billingThresholds) {
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
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      public Builder setCollectionMethod(
          SubscriptionScheduleUpdateParams.Phase.CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
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
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(EmptyParam currency) {
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
       * ID of the default payment method for the subscription schedule. It must belong to the
       * customer associated with the subscription schedule. If not set, invoices will use the
       * default payment method in the customer's invoice settings.
       */
      public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#defaultTaxRates} for the field documentation.
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
       * {@link SubscriptionScheduleUpdateParams.Phase#defaultTaxRates} for the field documentation.
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
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(SubscriptionScheduleUpdateParams.Phase.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Discount>();
        }
        ((List<SubscriptionScheduleUpdateParams.Phase.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(
          List<SubscriptionScheduleUpdateParams.Phase.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Discount>();
        }
        ((List<SubscriptionScheduleUpdateParams.Phase.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(List<SubscriptionScheduleUpdateParams.Phase.Discount> discounts) {
        this.discounts = discounts;
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
       * The date at which this phase of the subscription schedule ends. If set, {@code iterations}
       * must not be set.
       */
      public Builder setEndDate(SubscriptionScheduleUpdateParams.Phase.EndDate endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.Phase#extraParams} for the field documentation.
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
          SubscriptionScheduleUpdateParams.Phase.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#items} for the field documentation.
       */
      public Builder addItem(SubscriptionScheduleUpdateParams.Phase.Item element) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SubscriptionScheduleUpdateParams.Phase#items} for the field documentation.
       */
      public Builder addAllItem(List<SubscriptionScheduleUpdateParams.Phase.Item> elements) {
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
       * SubscriptionScheduleUpdateParams.Phase#metadata} for the field documentation.
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
       * See {@link SubscriptionScheduleUpdateParams.Phase#metadata} for the field documentation.
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
       * The account on behalf of which to charge, for each of the associated subscription's
       * invoices.
       */
      public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
      }

      /**
       * Controls whether the subscription schedule should create <a
       * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> when
       * transitioning to this phase if there is a difference in billing configuration. It's
       * different from the request-level <a
       * href="https://stripe.com/docs/api/subscription_schedules/update#update_subscription_schedule-proration_behavior">proration_behavior</a>
       * parameter which controls what happens if the update request affects the billing
       * configuration (item price, quantity, etc.) of the current phase.
       */
      public Builder setProrationBehavior(
          SubscriptionScheduleUpdateParams.Phase.ProrationBehavior prorationBehavior) {
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
      public Builder setStartDate(SubscriptionScheduleUpdateParams.Phase.StartDate startDate) {
        this.startDate = startDate;
        return this;
      }

      /**
       * The data with which to automatically create a Transfer for each of the associated
       * subscription's invoices.
       */
      public Builder setTransferData(
          SubscriptionScheduleUpdateParams.Phase.TransferData transferData) {
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

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with {@code trial}
       */
      public Builder setTrialEnd(SubscriptionScheduleUpdateParams.Phase.TrialEnd trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddInvoiceItem {
      /** The coupons to redeem into discounts for the item. */
      @SerializedName("discounts")
      List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      @SerializedName("price")
      Object price;

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
       * The tax rates which apply to the item. When set, the {@code default_tax_rates} do not apply
       * to this item.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private AddInvoiceItem(
          List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts,
          Map<String, Object> extraParams,
          Object price,
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
        private List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> discounts;

        private Map<String, Object> extraParams;

        private Object price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem build() {
          return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem(
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
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#discounts} for the field
         * documentation.
         */
        public Builder addDiscount(
            SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount element) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#discounts} for the field
         * documentation.
         */
        public Builder addAllDiscount(
            List<SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount> elements) {
          if (this.discounts == null) {
            this.discounts = new ArrayList<>();
          }
          this.discounts.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#extraParams} for
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

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline. One of {@code price} or {@code price_data} is required.
         */
        public Builder setPriceData(
            SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData priceData) {
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
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#taxRates} for the field
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
         * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem#taxRates} for the field
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
      @EqualsAndHashCode(callSuper = false)
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        Object coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        Object discount;

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
        Object promotionCode;

        private Discount(
            Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount build() {
            return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount(
                this.coupon, this.discount, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.Discount#extraParams} for the
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

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        Object currency;

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
         * <strong>Required.</strong> The ID of the <a
         * href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
         */
        @SerializedName("product")
        Object product;

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
        Object unitAmountDecimal;

        private PriceData(
            Object currency,
            Map<String, Object> extraParams,
            Object product,
            TaxBehavior taxBehavior,
            Long unitAmount,
            Object unitAmountDecimal) {
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
          private Object currency;

          private Map<String, Object> extraParams;

          private Object product;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private Object unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData build() {
            return new SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData(
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
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData#extraParams} for the
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
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
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
              SubscriptionScheduleUpdateParams.Phase.AddInvoiceItem.PriceData.TaxBehavior
                  taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge or a negative integer representing the amount to credit to the
           * customer.
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

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public SubscriptionScheduleUpdateParams.Phase.AutomaticTax build() {
          return new SubscriptionScheduleUpdateParams.Phase.AutomaticTax(
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AutomaticTax#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.AutomaticTax#extraParams} for the
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
         * required to perform the tax calculation are loaded from this account. The tax transaction
         * is returned in the report of the connected account.
         */
        public Builder setLiability(
            SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability liability) {
          this.liability = liability;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Liability {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Liability(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability build() {
            return new SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability#extraParams} for the
           * field documentation.
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
              SubscriptionScheduleUpdateParams.Phase.AutomaticTax.Liability.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public SubscriptionScheduleUpdateParams.Phase.BillingThresholds build() {
          return new SubscriptionScheduleUpdateParams.Phase.BillingThresholds(
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.BillingThresholds#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.BillingThresholds#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      Object coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      Object discount;

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
      Object promotionCode;

      private Discount(
          Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private Map<String, Object> extraParams;

        private Object promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.Discount build() {
          return new SubscriptionScheduleUpdateParams.Phase.Discount(
              this.coupon, this.discount, this.extraParams, this.promotionCode);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(EmptyParam coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(EmptyParam discount) {
          this.discount = discount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Discount#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Discount#extraParams} for the
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

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(EmptyParam promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings {
      /**
       * The account tax IDs associated with this phase of the subscription schedule. Will be set on
       * invoices generated by this phase of the subscription schedule.
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
          Object accountTaxIds, Long daysUntilDue, Map<String, Object> extraParams, Issuer issuer) {
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
        public SubscriptionScheduleUpdateParams.Phase.InvoiceSettings build() {
          return new SubscriptionScheduleUpdateParams.Phase.InvoiceSettings(
              this.accountTaxIds, this.daysUntilDue, this.extraParams, this.issuer);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#accountTaxIds} for the field
         * documentation.
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
         * See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#accountTaxIds} for the
         * field documentation.
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
         * The account tax IDs associated with this phase of the subscription schedule. Will be set
         * on invoices generated by this phase of the subscription schedule.
         */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * The account tax IDs associated with this phase of the subscription schedule. Will be set
         * on invoices generated by this phase of the subscription schedule.
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#extraParams} for
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.InvoiceSettings#extraParams} for
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
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer build() {
            return new SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer#extraParams} for the
           * field documentation.
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
              SubscriptionScheduleUpdateParams.Phase.InvoiceSettings.Issuer.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Item {
      /**
       * Define thresholds at which an invoice will be sent, and the subscription advanced to a new
       * billing period. Pass an empty string to remove previously-defined thresholds.
       */
      @SerializedName("billing_thresholds")
      Object billingThresholds;

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

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to a configuration item. Metadata on a configuration item will update the underlying
       * subscription item's {@code metadata} when the phase is entered, adding new keys and
       * replacing existing keys. Individual keys in the subscription item's {@code metadata} can be
       * unset by posting an empty value to them in the configuration item's {@code metadata}. To
       * unset all keys in the subscription item's {@code metadata}, update the subscription item
       * directly or unset every key individually from the configuration item's {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code price}.
       */
      @SerializedName("plan")
      Object plan;

      /** The ID of the price object. */
      @SerializedName("price")
      Object price;

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
          Object discounts,
          Map<String, Object> extraParams,
          Map<String, String> metadata,
          Object plan,
          Object price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
        this.billingThresholds = billingThresholds;
        this.discounts = discounts;
        this.extraParams = extraParams;
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

        private Object discounts;

        private Map<String, Object> extraParams;

        private Map<String, String> metadata;

        private Object plan;

        private Object price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.Item build() {
          return new SubscriptionScheduleUpdateParams.Phase.Item(
              this.billingThresholds,
              this.discounts,
              this.extraParams,
              this.metadata,
              this.plan,
              this.price,
              this.priceData,
              this.quantity,
              this.taxRates);
        }

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a
         * new billing period. Pass an empty string to remove previously-defined thresholds.
         */
        public Builder setBillingThresholds(
            SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds billingThresholds) {
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
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDiscount(SubscriptionScheduleUpdateParams.Phase.Item.Discount element) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Item.Discount>();
          }
          ((List<SubscriptionScheduleUpdateParams.Phase.Item.Discount>) this.discounts)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDiscount(
            List<SubscriptionScheduleUpdateParams.Phase.Item.Discount> elements) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<SubscriptionScheduleUpdateParams.Phase.Item.Discount>();
          }
          ((List<SubscriptionScheduleUpdateParams.Phase.Item.Discount>) this.discounts)
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
            List<SubscriptionScheduleUpdateParams.Phase.Item.Discount> discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#extraParams} for the field
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#extraParams} for the field
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
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * SubscriptionScheduleUpdateParams.Phase.Item#metadata} for the field documentation.
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item#metadata} for the field
         * documentation.
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

        /**
         * The plan ID to subscribe to. You may specify the same ID in {@code plan} and {@code
         * price}.
         */
        public Builder setPlan(EmptyParam plan) {
          this.plan = plan;
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** The ID of the price object. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline.
         */
        public Builder setPriceData(
            SubscriptionScheduleUpdateParams.Phase.Item.PriceData priceData) {
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
         * SubscriptionScheduleUpdateParams.Phase.Item#taxRates} for the field documentation.
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
         * SubscriptionScheduleUpdateParams.Phase.Item#taxRates} for the field documentation.
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
      @EqualsAndHashCode(callSuper = false)
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
          public SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds(
                this.extraParams, this.usageGte);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds#extraParams} for the
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
           * SubscriptionScheduleUpdateParams.Phase.Item.BillingThresholds#extraParams} for the
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
      @EqualsAndHashCode(callSuper = false)
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        Object coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        Object discount;

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
        Object promotionCode;

        private Discount(
            Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.Discount build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.Discount(
                this.coupon, this.discount, this.extraParams, this.promotionCode);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Discount#extraParams} for
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
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.Discount#extraParams} for
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

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        Object currency;

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
         * <strong>Required.</strong> The ID of the <a
         * href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
         */
        @SerializedName("product")
        Object product;

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
        Object unitAmountDecimal;

        private PriceData(
            Object currency,
            Map<String, Object> extraParams,
            Object product,
            Recurring recurring,
            TaxBehavior taxBehavior,
            Long unitAmount,
            Object unitAmountDecimal) {
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
          private Object currency;

          private Map<String, Object> extraParams;

          private Object product;

          private Recurring recurring;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private Object unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public SubscriptionScheduleUpdateParams.Phase.Item.PriceData build() {
            return new SubscriptionScheduleUpdateParams.Phase.Item.PriceData(
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
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.PriceData#extraParams} for
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
           * map. See {@link SubscriptionScheduleUpdateParams.Phase.Item.PriceData#extraParams} for
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
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The ID of the <a
           * href="https://docs.stripe.com/api/products">Product</a> that this <a
           * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
           */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
            return this;
          }

          /**
           * <strong>Required.</strong> The recurring components of a price such as {@code interval}
           * and {@code interval_count}.
           */
          public Builder setRecurring(
              SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring recurring) {
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
              SubscriptionScheduleUpdateParams.Phase.Item.PriceData.TaxBehavior taxBehavior) {
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

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring build() {
              return new SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring#extraParams} for the
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
             * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
             * week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                SubscriptionScheduleUpdateParams.Phase.Item.PriceData.Recurring.Interval interval) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class TransferData {
      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination.
       */
      @SerializedName("amount_percent")
      BigDecimal amountPercent;

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      @SerializedName("destination")
      Object destination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TransferData(
          BigDecimal amountPercent, Object destination, Map<String, Object> extraParams) {
        this.amountPercent = amountPercent;
        this.destination = destination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BigDecimal amountPercent;

        private Object destination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SubscriptionScheduleUpdateParams.Phase.TransferData build() {
          return new SubscriptionScheduleUpdateParams.Phase.TransferData(
              this.amountPercent, this.destination, this.extraParams);
        }

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This
         * represents the percentage of the subscription invoice total that will be transferred to
         * the destination account. By default, the entire amount is transferred to the destination.
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

        /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
        public Builder setDestination(EmptyParam destination) {
          this.destination = destination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TransferData#extraParams} for the
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
         * map. See {@link SubscriptionScheduleUpdateParams.Phase.TransferData#extraParams} for the
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
