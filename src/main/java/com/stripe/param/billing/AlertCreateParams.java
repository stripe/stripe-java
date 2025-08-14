// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AlertCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The type of alert to create. */
  @SerializedName("alert_type")
  AlertType alertType;

  /** The configuration of the credit balance threshold. */
  @SerializedName("credit_balance_threshold")
  CreditBalanceThreshold creditBalanceThreshold;

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

  /** <strong>Required.</strong> The title of the alert. */
  @SerializedName("title")
  String title;

  /** The configuration of the usage threshold. */
  @SerializedName("usage_threshold")
  UsageThreshold usageThreshold;

  private AlertCreateParams(
      AlertType alertType,
      CreditBalanceThreshold creditBalanceThreshold,
      List<String> expand,
      Map<String, Object> extraParams,
      String title,
      UsageThreshold usageThreshold) {
    this.alertType = alertType;
    this.creditBalanceThreshold = creditBalanceThreshold;
    this.expand = expand;
    this.extraParams = extraParams;
    this.title = title;
    this.usageThreshold = usageThreshold;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AlertType alertType;

    private CreditBalanceThreshold creditBalanceThreshold;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String title;

    private UsageThreshold usageThreshold;

    /** Finalize and obtain parameter instance from this builder. */
    public AlertCreateParams build() {
      return new AlertCreateParams(
          this.alertType,
          this.creditBalanceThreshold,
          this.expand,
          this.extraParams,
          this.title,
          this.usageThreshold);
    }

    /** <strong>Required.</strong> The type of alert to create. */
    public Builder setAlertType(AlertCreateParams.AlertType alertType) {
      this.alertType = alertType;
      return this;
    }

    /** The configuration of the credit balance threshold. */
    public Builder setCreditBalanceThreshold(
        AlertCreateParams.CreditBalanceThreshold creditBalanceThreshold) {
      this.creditBalanceThreshold = creditBalanceThreshold;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertCreateParams#expand} for the field documentation.
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
     * AlertCreateParams#expand} for the field documentation.
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
     * AlertCreateParams#extraParams} for the field documentation.
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
     * See {@link AlertCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The title of the alert. */
    public Builder setTitle(String title) {
      this.title = title;
      return this;
    }

    /** The configuration of the usage threshold. */
    public Builder setUsageThreshold(AlertCreateParams.UsageThreshold usageThreshold) {
      this.usageThreshold = usageThreshold;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditBalanceThreshold {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The filters allows limiting the scope of this credit balance alert. You must specify a
     * customer filter at this time.
     */
    @SerializedName("filters")
    List<AlertCreateParams.CreditBalanceThreshold.Filter> filters;

    /** <strong>Required.</strong> Defines at which value the alert will fire. */
    @SerializedName("lte")
    Lte lte;

    /**
     * <strong>Required.</strong> Whether the alert should only fire only once, or once per billing
     * cycle.
     */
    @SerializedName("recurrence")
    Recurrence recurrence;

    private CreditBalanceThreshold(
        Map<String, Object> extraParams,
        List<AlertCreateParams.CreditBalanceThreshold.Filter> filters,
        Lte lte,
        Recurrence recurrence) {
      this.extraParams = extraParams;
      this.filters = filters;
      this.lte = lte;
      this.recurrence = recurrence;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<AlertCreateParams.CreditBalanceThreshold.Filter> filters;

      private Lte lte;

      private Recurrence recurrence;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertCreateParams.CreditBalanceThreshold build() {
        return new AlertCreateParams.CreditBalanceThreshold(
            this.extraParams, this.filters, this.lte, this.recurrence);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertCreateParams.CreditBalanceThreshold#extraParams} for the field documentation.
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
       * See {@link AlertCreateParams.CreditBalanceThreshold#extraParams} for the field
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
       * Add an element to `filters` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AlertCreateParams.CreditBalanceThreshold#filters} for the field documentation.
       */
      public Builder addFilter(AlertCreateParams.CreditBalanceThreshold.Filter element) {
        if (this.filters == null) {
          this.filters = new ArrayList<>();
        }
        this.filters.add(element);
        return this;
      }

      /**
       * Add all elements to `filters` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AlertCreateParams.CreditBalanceThreshold#filters} for the field documentation.
       */
      public Builder addAllFilter(List<AlertCreateParams.CreditBalanceThreshold.Filter> elements) {
        if (this.filters == null) {
          this.filters = new ArrayList<>();
        }
        this.filters.addAll(elements);
        return this;
      }

      /** <strong>Required.</strong> Defines at which value the alert will fire. */
      public Builder setLte(AlertCreateParams.CreditBalanceThreshold.Lte lte) {
        this.lte = lte;
        return this;
      }

      /**
       * <strong>Required.</strong> Whether the alert should only fire only once, or once per
       * billing cycle.
       */
      public Builder setRecurrence(AlertCreateParams.CreditBalanceThreshold.Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Filter {
      /** Limit the scope to this credit balance alert only to this customer. */
      @SerializedName("customer")
      String customer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> What type of filter is being applied to this credit balance
       * alert.
       */
      @SerializedName("type")
      Type type;

      private Filter(String customer, Map<String, Object> extraParams, Type type) {
        this.customer = customer;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String customer;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AlertCreateParams.CreditBalanceThreshold.Filter build() {
          return new AlertCreateParams.CreditBalanceThreshold.Filter(
              this.customer, this.extraParams, this.type);
        }

        /** Limit the scope to this credit balance alert only to this customer. */
        public Builder setCustomer(String customer) {
          this.customer = customer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AlertCreateParams.CreditBalanceThreshold.Filter#extraParams} for the
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
         * map. See {@link AlertCreateParams.CreditBalanceThreshold.Filter#extraParams} for the
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
         * <strong>Required.</strong> What type of filter is being applied to this credit balance
         * alert.
         */
        public Builder setType(AlertCreateParams.CreditBalanceThreshold.Filter.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("customer")
        CUSTOMER("customer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Lte {
      /**
       * <strong>Required.</strong> Specify the type of this balance. We currently only support
       * {@code monetary} billing credits.
       */
      @SerializedName("balance_type")
      BalanceType balanceType;

      /** The custom pricing unit amount. */
      @SerializedName("custom_pricing_unit")
      CustomPricingUnit customPricingUnit;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The monetary amount. */
      @SerializedName("monetary")
      Monetary monetary;

      private Lte(
          BalanceType balanceType,
          CustomPricingUnit customPricingUnit,
          Map<String, Object> extraParams,
          Monetary monetary) {
        this.balanceType = balanceType;
        this.customPricingUnit = customPricingUnit;
        this.extraParams = extraParams;
        this.monetary = monetary;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BalanceType balanceType;

        private CustomPricingUnit customPricingUnit;

        private Map<String, Object> extraParams;

        private Monetary monetary;

        /** Finalize and obtain parameter instance from this builder. */
        public AlertCreateParams.CreditBalanceThreshold.Lte build() {
          return new AlertCreateParams.CreditBalanceThreshold.Lte(
              this.balanceType, this.customPricingUnit, this.extraParams, this.monetary);
        }

        /**
         * <strong>Required.</strong> Specify the type of this balance. We currently only support
         * {@code monetary} billing credits.
         */
        public Builder setBalanceType(
            AlertCreateParams.CreditBalanceThreshold.Lte.BalanceType balanceType) {
          this.balanceType = balanceType;
          return this;
        }

        /** The custom pricing unit amount. */
        public Builder setCustomPricingUnit(
            AlertCreateParams.CreditBalanceThreshold.Lte.CustomPricingUnit customPricingUnit) {
          this.customPricingUnit = customPricingUnit;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AlertCreateParams.CreditBalanceThreshold.Lte#extraParams} for the field
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
         * map. See {@link AlertCreateParams.CreditBalanceThreshold.Lte#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The monetary amount. */
        public Builder setMonetary(AlertCreateParams.CreditBalanceThreshold.Lte.Monetary monetary) {
          this.monetary = monetary;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The ID of the custom pricing unit. */
        @SerializedName("id")
        String id;

        /**
         * <strong>Required.</strong> A positive decimal string representing the amount of the
         * custom pricing unit threshold.
         */
        @SerializedName("value")
        BigDecimal value;

        private CustomPricingUnit(Map<String, Object> extraParams, String id, BigDecimal value) {
          this.extraParams = extraParams;
          this.id = id;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String id;

          private BigDecimal value;

          /** Finalize and obtain parameter instance from this builder. */
          public AlertCreateParams.CreditBalanceThreshold.Lte.CustomPricingUnit build() {
            return new AlertCreateParams.CreditBalanceThreshold.Lte.CustomPricingUnit(
                this.extraParams, this.id, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AlertCreateParams.CreditBalanceThreshold.Lte.CustomPricingUnit#extraParams} for the
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
           * AlertCreateParams.CreditBalanceThreshold.Lte.CustomPricingUnit#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID of the custom pricing unit. */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /**
           * <strong>Required.</strong> A positive decimal string representing the amount of the
           * custom pricing unit threshold.
           */
          public Builder setValue(BigDecimal value) {
            this.value = value;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Monetary {
        /**
         * <strong>Required.</strong> Three-letter <a href="https://stripe.com/docs/currencies">ISO
         * code for the currency</a> of the {@code value} parameter.
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

        /** <strong>Required.</strong> An integer representing the amount of the threshold. */
        @SerializedName("value")
        Long value;

        private Monetary(String currency, Map<String, Object> extraParams, Long value) {
          this.currency = currency;
          this.extraParams = extraParams;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String currency;

          private Map<String, Object> extraParams;

          private Long value;

          /** Finalize and obtain parameter instance from this builder. */
          public AlertCreateParams.CreditBalanceThreshold.Lte.Monetary build() {
            return new AlertCreateParams.CreditBalanceThreshold.Lte.Monetary(
                this.currency, this.extraParams, this.value);
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://stripe.com/docs/currencies">ISO code for the currency</a> of the {@code
           * value} parameter.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AlertCreateParams.CreditBalanceThreshold.Lte.Monetary#extraParams} for
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
           * map. See {@link AlertCreateParams.CreditBalanceThreshold.Lte.Monetary#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> An integer representing the amount of the threshold. */
          public Builder setValue(Long value) {
            this.value = value;
            return this;
          }
        }
      }

      public enum BalanceType implements ApiRequestParams.EnumParam {
        @SerializedName("custom_pricing_unit")
        CUSTOM_PRICING_UNIT("custom_pricing_unit"),

        @SerializedName("monetary")
        MONETARY("monetary");

        @Getter(onMethod_ = {@Override})
        private final String value;

        BalanceType(String value) {
          this.value = value;
        }
      }
    }

    public enum Recurrence implements ApiRequestParams.EnumParam {
      @SerializedName("one_time")
      ONE_TIME("one_time");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Recurrence(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageThreshold {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The filters allows limiting the scope of this usage alert. You can only specify up to one
     * filter at this time.
     */
    @SerializedName("filters")
    List<AlertCreateParams.UsageThreshold.Filter> filters;

    /** <strong>Required.</strong> Defines at which value the alert will fire. */
    @SerializedName("gte")
    Long gte;

    /**
     * <strong>Required.</strong> The <a href="https://stripe.com/api/billing/meter">Billing
     * Meter</a> ID whose usage is monitored.
     */
    @SerializedName("meter")
    String meter;

    /**
     * <strong>Required.</strong> Whether the alert should only fire only once, or once per billing
     * cycle.
     */
    @SerializedName("recurrence")
    Recurrence recurrence;

    private UsageThreshold(
        Map<String, Object> extraParams,
        List<AlertCreateParams.UsageThreshold.Filter> filters,
        Long gte,
        String meter,
        Recurrence recurrence) {
      this.extraParams = extraParams;
      this.filters = filters;
      this.gte = gte;
      this.meter = meter;
      this.recurrence = recurrence;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<AlertCreateParams.UsageThreshold.Filter> filters;

      private Long gte;

      private String meter;

      private Recurrence recurrence;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertCreateParams.UsageThreshold build() {
        return new AlertCreateParams.UsageThreshold(
            this.extraParams, this.filters, this.gte, this.meter, this.recurrence);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertCreateParams.UsageThreshold#extraParams} for the field documentation.
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
       * See {@link AlertCreateParams.UsageThreshold#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `filters` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AlertCreateParams.UsageThreshold#filters} for the field documentation.
       */
      public Builder addFilter(AlertCreateParams.UsageThreshold.Filter element) {
        if (this.filters == null) {
          this.filters = new ArrayList<>();
        }
        this.filters.add(element);
        return this;
      }

      /**
       * Add all elements to `filters` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AlertCreateParams.UsageThreshold#filters} for the field documentation.
       */
      public Builder addAllFilter(List<AlertCreateParams.UsageThreshold.Filter> elements) {
        if (this.filters == null) {
          this.filters = new ArrayList<>();
        }
        this.filters.addAll(elements);
        return this;
      }

      /** <strong>Required.</strong> Defines at which value the alert will fire. */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /**
       * <strong>Required.</strong> The <a href="https://stripe.com/api/billing/meter">Billing
       * Meter</a> ID whose usage is monitored.
       */
      public Builder setMeter(String meter) {
        this.meter = meter;
        return this;
      }

      /**
       * <strong>Required.</strong> Whether the alert should only fire only once, or once per
       * billing cycle.
       */
      public Builder setRecurrence(AlertCreateParams.UsageThreshold.Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Filter {
      /** Limit the scope to this usage alert only to this customer. */
      @SerializedName("customer")
      String customer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> What type of filter is being applied to this usage alert. */
      @SerializedName("type")
      Type type;

      private Filter(String customer, Map<String, Object> extraParams, Type type) {
        this.customer = customer;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String customer;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AlertCreateParams.UsageThreshold.Filter build() {
          return new AlertCreateParams.UsageThreshold.Filter(
              this.customer, this.extraParams, this.type);
        }

        /** Limit the scope to this usage alert only to this customer. */
        public Builder setCustomer(String customer) {
          this.customer = customer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AlertCreateParams.UsageThreshold.Filter#extraParams} for the field
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
         * map. See {@link AlertCreateParams.UsageThreshold.Filter#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> What type of filter is being applied to this usage alert. */
        public Builder setType(AlertCreateParams.UsageThreshold.Filter.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("customer")
        CUSTOMER("customer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Recurrence implements ApiRequestParams.EnumParam {
      @SerializedName("one_time")
      ONE_TIME("one_time");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Recurrence(String value) {
        this.value = value;
      }
    }
  }

  public enum AlertType implements ApiRequestParams.EnumParam {
    @SerializedName("credit_balance_threshold")
    CREDIT_BALANCE_THRESHOLD("credit_balance_threshold"),

    @SerializedName("usage_threshold")
    USAGE_THRESHOLD("usage_threshold");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AlertType(String value) {
      this.value = value;
    }
  }
}
