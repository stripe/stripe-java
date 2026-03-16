// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ActionServiceCreateParams extends ApiRequestParams {
  /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
  @SerializedName("credit_grant")
  CreditGrant creditGrant;

  /**
   * Details for the credit grant per tenant. Required if {@code type} is {@code
   * credit_grant_per_tenant}.
   */
  @SerializedName("credit_grant_per_tenant")
  CreditGrantPerTenant creditGrantPerTenant;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An internal key you can use to search for this service action. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /** <strong>Required.</strong> The interval for assessing service. */
  @SerializedName("service_interval")
  ServiceInterval serviceInterval;

  /** <strong>Required.</strong> The length of the interval for assessing service. */
  @SerializedName("service_interval_count")
  Long serviceIntervalCount;

  /** <strong>Required.</strong> The type of the service action. */
  @SerializedName("type")
  Type type;

  private ActionServiceCreateParams(
      CreditGrant creditGrant,
      CreditGrantPerTenant creditGrantPerTenant,
      Map<String, Object> extraParams,
      String lookupKey,
      ServiceInterval serviceInterval,
      Long serviceIntervalCount,
      Type type) {
    this.creditGrant = creditGrant;
    this.creditGrantPerTenant = creditGrantPerTenant;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.serviceInterval = serviceInterval;
    this.serviceIntervalCount = serviceIntervalCount;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CreditGrant creditGrant;

    private CreditGrantPerTenant creditGrantPerTenant;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private ServiceInterval serviceInterval;

    private Long serviceIntervalCount;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ActionServiceCreateParams build() {
      return new ActionServiceCreateParams(
          this.creditGrant,
          this.creditGrantPerTenant,
          this.extraParams,
          this.lookupKey,
          this.serviceInterval,
          this.serviceIntervalCount,
          this.type);
    }

    /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
    public Builder setCreditGrant(ActionServiceCreateParams.CreditGrant creditGrant) {
      this.creditGrant = creditGrant;
      return this;
    }

    /**
     * Details for the credit grant per tenant. Required if {@code type} is {@code
     * credit_grant_per_tenant}.
     */
    public Builder setCreditGrantPerTenant(
        ActionServiceCreateParams.CreditGrantPerTenant creditGrantPerTenant) {
      this.creditGrantPerTenant = creditGrantPerTenant;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ActionServiceCreateParams#extraParams} for the field documentation.
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
     * See {@link ActionServiceCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for this service action. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /** <strong>Required.</strong> The interval for assessing service. */
    public Builder setServiceInterval(ActionServiceCreateParams.ServiceInterval serviceInterval) {
      this.serviceInterval = serviceInterval;
      return this;
    }

    /** <strong>Required.</strong> The length of the interval for assessing service. */
    public Builder setServiceIntervalCount(Long serviceIntervalCount) {
      this.serviceIntervalCount = serviceIntervalCount;
      return this;
    }

    /** <strong>Required.</strong> The type of the service action. */
    public Builder setType(ActionServiceCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrant {
    /** <strong>Required.</strong> The amount of the credit grant. */
    @SerializedName("amount")
    com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrant.Amount amount;

    /** <strong>Required.</strong> Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /** The category of the credit grant. */
    @SerializedName("category")
    Category category;

    /** <strong>Required.</strong> The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> A descriptive name shown in dashboard. */
    @SerializedName("name")
    String name;

    /**
     * The desired priority for applying this credit grant. If not specified, it will be set to the
     * default value of 50. The highest priority is 0 and the lowest is 100.
     */
    @SerializedName("priority")
    Long priority;

    private CreditGrant(
        com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrant.Amount amount,
        ApplicabilityConfig applicabilityConfig,
        Category category,
        ExpiryConfig expiryConfig,
        Map<String, Object> extraParams,
        String name,
        Long priority) {
      this.amount = amount;
      this.applicabilityConfig = applicabilityConfig;
      this.category = category;
      this.expiryConfig = expiryConfig;
      this.extraParams = extraParams;
      this.name = name;
      this.priority = priority;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrant.Amount amount;

      private ApplicabilityConfig applicabilityConfig;

      private Category category;

      private ExpiryConfig expiryConfig;

      private Map<String, Object> extraParams;

      private String name;

      private Long priority;

      /** Finalize and obtain parameter instance from this builder. */
      public ActionServiceCreateParams.CreditGrant build() {
        return new ActionServiceCreateParams.CreditGrant(
            this.amount,
            this.applicabilityConfig,
            this.category,
            this.expiryConfig,
            this.extraParams,
            this.name,
            this.priority);
      }

      /** <strong>Required.</strong> The amount of the credit grant. */
      public Builder setAmount(ActionServiceCreateParams.CreditGrant.Amount amount) {
        this.amount = amount;
        return this;
      }

      /** <strong>Required.</strong> Defines the scope where the credit grant is applicable. */
      public Builder setApplicabilityConfig(
          ActionServiceCreateParams.CreditGrant.ApplicabilityConfig applicabilityConfig) {
        this.applicabilityConfig = applicabilityConfig;
        return this;
      }

      /** The category of the credit grant. */
      public Builder setCategory(ActionServiceCreateParams.CreditGrant.Category category) {
        this.category = category;
        return this;
      }

      /** <strong>Required.</strong> The expiry configuration for the credit grant. */
      public Builder setExpiryConfig(
          ActionServiceCreateParams.CreditGrant.ExpiryConfig expiryConfig) {
        this.expiryConfig = expiryConfig;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ActionServiceCreateParams.CreditGrant#extraParams} for the field documentation.
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
       * See {@link ActionServiceCreateParams.CreditGrant#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> A descriptive name shown in dashboard. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * The desired priority for applying this credit grant. If not specified, it will be set to
       * the default value of 50. The highest priority is 0 and the lowest is 100.
       */
      public Builder setPriority(Long priority) {
        this.priority = priority;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
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

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      com.stripe.v2.Amount monetary;

      /**
       * <strong>Required.</strong> The type of the credit grant amount. We currently support {@code
       * monetary} and {@code custom_pricing_unit} billing credits.
       */
      @SerializedName("type")
      Type type;

      private Amount(
          CustomPricingUnit customPricingUnit,
          Map<String, Object> extraParams,
          com.stripe.v2.Amount monetary,
          Type type) {
        this.customPricingUnit = customPricingUnit;
        this.extraParams = extraParams;
        this.monetary = monetary;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CustomPricingUnit customPricingUnit;

        private Map<String, Object> extraParams;

        private com.stripe.v2.Amount monetary;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrant.Amount build() {
          return new ActionServiceCreateParams.CreditGrant.Amount(
              this.customPricingUnit, this.extraParams, this.monetary, this.type);
        }

        /**
         * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
         * custom_pricing_unit}.
         */
        public Builder setCustomPricingUnit(
            ActionServiceCreateParams.CreditGrant.Amount.CustomPricingUnit customPricingUnit) {
          this.customPricingUnit = customPricingUnit;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ActionServiceCreateParams.CreditGrant.Amount#extraParams} for the field
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
         * map. See {@link ActionServiceCreateParams.CreditGrant.Amount#extraParams} for the field
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
         * The monetary amount of the credit grant. Required if {@code type} is {@code monetary}.
         */
        public Builder setMonetary(com.stripe.v2.Amount monetary) {
          this.monetary = monetary;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of the credit grant amount. We currently support
         * {@code monetary} and {@code custom_pricing_unit} billing credits.
         */
        public Builder setType(ActionServiceCreateParams.CreditGrant.Amount.Type type) {
          this.type = type;
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

        /** <strong>Required.</strong> The id of the custom pricing unit. */
        @SerializedName("id")
        String id;

        /**
         * <strong>Required.</strong> The value of the credit grant, decimal value represented as a
         * string.
         */
        @SerializedName("value")
        String value;

        private CustomPricingUnit(Map<String, Object> extraParams, String id, String value) {
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

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public ActionServiceCreateParams.CreditGrant.Amount.CustomPricingUnit build() {
            return new ActionServiceCreateParams.CreditGrant.Amount.CustomPricingUnit(
                this.extraParams, this.id, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ActionServiceCreateParams.CreditGrant.Amount.CustomPricingUnit#extraParams} for the
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
           * ActionServiceCreateParams.CreditGrant.Amount.CustomPricingUnit#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The id of the custom pricing unit. */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the credit grant, decimal value represented as
           * a string.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("custom_pricing_unit")
        CUSTOM_PRICING_UNIT("custom_pricing_unit"),

        @SerializedName("monetary")
        MONETARY("monetary");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      private ApplicabilityConfig(Map<String, Object> extraParams, Scope scope) {
        this.extraParams = extraParams;
        this.scope = scope;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Scope scope;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrant.ApplicabilityConfig build() {
          return new ActionServiceCreateParams.CreditGrant.ApplicabilityConfig(
              this.extraParams, this.scope);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ActionServiceCreateParams.CreditGrant.ApplicabilityConfig#extraParams}
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
         * map. See {@link ActionServiceCreateParams.CreditGrant.ApplicabilityConfig#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The applicability scope of the credit grant. */
        public Builder setScope(
            ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope scope) {
          this.scope = scope;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Scope {
        /** The billable items to apply the credit grant to. */
        @SerializedName("billable_items")
        List<String> billableItems;

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
         * The price type that credit grants can apply to. We currently only support the {@code
         * metered} price type. This will apply to metered prices and rate cards. Cannot be used in
         * combination with {@code billable_items}.
         */
        @SerializedName("price_type")
        PriceType priceType;

        private Scope(
            List<String> billableItems, Map<String, Object> extraParams, PriceType priceType) {
          this.billableItems = billableItems;
          this.extraParams = extraParams;
          this.priceType = priceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<String> billableItems;

          private Map<String, Object> extraParams;

          private PriceType priceType;

          /** Finalize and obtain parameter instance from this builder. */
          public ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope build() {
            return new ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope(
                this.billableItems, this.extraParams, this.priceType);
          }

          /**
           * Add an element to `billableItems` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope#billableItems} for the
           * field documentation.
           */
          public Builder addBillableItem(String element) {
            if (this.billableItems == null) {
              this.billableItems = new ArrayList<>();
            }
            this.billableItems.add(element);
            return this;
          }

          /**
           * Add all elements to `billableItems` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope#billableItems} for the
           * field documentation.
           */
          public Builder addAllBillableItem(List<String> elements) {
            if (this.billableItems == null) {
              this.billableItems = new ArrayList<>();
            }
            this.billableItems.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope#extraParams} for the
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
           * ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope#extraParams} for the
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
           * The price type that credit grants can apply to. We currently only support the {@code
           * metered} price type. This will apply to metered prices and rate cards. Cannot be used
           * in combination with {@code billable_items}.
           */
          public Builder setPriceType(
              ActionServiceCreateParams.CreditGrant.ApplicabilityConfig.Scope.PriceType priceType) {
            this.priceType = priceType;
            return this;
          }
        }

        public enum PriceType implements ApiRequestParams.EnumParam {
          @SerializedName("metered")
          METERED("metered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PriceType(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ExpiryConfig {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The type of the expiry configuration. We currently support
       * {@code end_of_service_period}.
       */
      @SerializedName("type")
      Type type;

      private ExpiryConfig(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrant.ExpiryConfig build() {
          return new ActionServiceCreateParams.CreditGrant.ExpiryConfig(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ActionServiceCreateParams.CreditGrant.ExpiryConfig#extraParams} for the
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
         * map. See {@link ActionServiceCreateParams.CreditGrant.ExpiryConfig#extraParams} for the
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
         * <strong>Required.</strong> The type of the expiry configuration. We currently support
         * {@code end_of_service_period}.
         */
        public Builder setType(ActionServiceCreateParams.CreditGrant.ExpiryConfig.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("end_of_service_period")
        END_OF_SERVICE_PERIOD("end_of_service_period");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Category implements ApiRequestParams.EnumParam {
      @SerializedName("paid")
      PAID("paid"),

      @SerializedName("promotional")
      PROMOTIONAL("promotional");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Category(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrantPerTenant {
    /** <strong>Required.</strong> The amount of the credit grant. */
    @SerializedName("amount")
    com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrantPerTenant.Amount amount;

    /** <strong>Required.</strong> Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /** The category of the credit grant. */
    @SerializedName("category")
    Category category;

    /** <strong>Required.</strong> The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The grant condition for the credit grant. */
    @SerializedName("grant_condition")
    GrantCondition grantCondition;

    /** <strong>Required.</strong> Customer-facing name for the credit grant. */
    @SerializedName("name")
    String name;

    /**
     * The desired priority for applying this credit grant. If not specified, it will be set to the
     * default value of 50. The highest priority is 0 and the lowest is 100.
     */
    @SerializedName("priority")
    Long priority;

    private CreditGrantPerTenant(
        com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrantPerTenant.Amount amount,
        ApplicabilityConfig applicabilityConfig,
        Category category,
        ExpiryConfig expiryConfig,
        Map<String, Object> extraParams,
        GrantCondition grantCondition,
        String name,
        Long priority) {
      this.amount = amount;
      this.applicabilityConfig = applicabilityConfig;
      this.category = category;
      this.expiryConfig = expiryConfig;
      this.extraParams = extraParams;
      this.grantCondition = grantCondition;
      this.name = name;
      this.priority = priority;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private com.stripe.param.v2.billing.ActionServiceCreateParams.CreditGrantPerTenant.Amount
          amount;

      private ApplicabilityConfig applicabilityConfig;

      private Category category;

      private ExpiryConfig expiryConfig;

      private Map<String, Object> extraParams;

      private GrantCondition grantCondition;

      private String name;

      private Long priority;

      /** Finalize and obtain parameter instance from this builder. */
      public ActionServiceCreateParams.CreditGrantPerTenant build() {
        return new ActionServiceCreateParams.CreditGrantPerTenant(
            this.amount,
            this.applicabilityConfig,
            this.category,
            this.expiryConfig,
            this.extraParams,
            this.grantCondition,
            this.name,
            this.priority);
      }

      /** <strong>Required.</strong> The amount of the credit grant. */
      public Builder setAmount(ActionServiceCreateParams.CreditGrantPerTenant.Amount amount) {
        this.amount = amount;
        return this;
      }

      /** <strong>Required.</strong> Defines the scope where the credit grant is applicable. */
      public Builder setApplicabilityConfig(
          ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig applicabilityConfig) {
        this.applicabilityConfig = applicabilityConfig;
        return this;
      }

      /** The category of the credit grant. */
      public Builder setCategory(ActionServiceCreateParams.CreditGrantPerTenant.Category category) {
        this.category = category;
        return this;
      }

      /** <strong>Required.</strong> The expiry configuration for the credit grant. */
      public Builder setExpiryConfig(
          ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig expiryConfig) {
        this.expiryConfig = expiryConfig;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ActionServiceCreateParams.CreditGrantPerTenant#extraParams} for the field documentation.
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
       * See {@link ActionServiceCreateParams.CreditGrantPerTenant#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The grant condition for the credit grant. */
      public Builder setGrantCondition(
          ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition grantCondition) {
        this.grantCondition = grantCondition;
        return this;
      }

      /** <strong>Required.</strong> Customer-facing name for the credit grant. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * The desired priority for applying this credit grant. If not specified, it will be set to
       * the default value of 50. The highest priority is 0 and the lowest is 100.
       */
      public Builder setPriority(Long priority) {
        this.priority = priority;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
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

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      com.stripe.v2.Amount monetary;

      /**
       * <strong>Required.</strong> The type of the credit grant amount. We currently support {@code
       * monetary} and {@code custom_pricing_unit} billing credits.
       */
      @SerializedName("type")
      Type type;

      private Amount(
          CustomPricingUnit customPricingUnit,
          Map<String, Object> extraParams,
          com.stripe.v2.Amount monetary,
          Type type) {
        this.customPricingUnit = customPricingUnit;
        this.extraParams = extraParams;
        this.monetary = monetary;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CustomPricingUnit customPricingUnit;

        private Map<String, Object> extraParams;

        private com.stripe.v2.Amount monetary;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrantPerTenant.Amount build() {
          return new ActionServiceCreateParams.CreditGrantPerTenant.Amount(
              this.customPricingUnit, this.extraParams, this.monetary, this.type);
        }

        /**
         * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
         * custom_pricing_unit}.
         */
        public Builder setCustomPricingUnit(
            ActionServiceCreateParams.CreditGrantPerTenant.Amount.CustomPricingUnit
                customPricingUnit) {
          this.customPricingUnit = customPricingUnit;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ActionServiceCreateParams.CreditGrantPerTenant.Amount#extraParams} for
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
         * map. See {@link ActionServiceCreateParams.CreditGrantPerTenant.Amount#extraParams} for
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
         * The monetary amount of the credit grant. Required if {@code type} is {@code monetary}.
         */
        public Builder setMonetary(com.stripe.v2.Amount monetary) {
          this.monetary = monetary;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of the credit grant amount. We currently support
         * {@code monetary} and {@code custom_pricing_unit} billing credits.
         */
        public Builder setType(ActionServiceCreateParams.CreditGrantPerTenant.Amount.Type type) {
          this.type = type;
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

        /** <strong>Required.</strong> The id of the custom pricing unit. */
        @SerializedName("id")
        String id;

        /**
         * <strong>Required.</strong> The value of the credit grant, decimal value represented as a
         * string.
         */
        @SerializedName("value")
        String value;

        private CustomPricingUnit(Map<String, Object> extraParams, String id, String value) {
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

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public ActionServiceCreateParams.CreditGrantPerTenant.Amount.CustomPricingUnit build() {
            return new ActionServiceCreateParams.CreditGrantPerTenant.Amount.CustomPricingUnit(
                this.extraParams, this.id, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.Amount.CustomPricingUnit#extraParams}
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
           * ActionServiceCreateParams.CreditGrantPerTenant.Amount.CustomPricingUnit#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The id of the custom pricing unit. */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the credit grant, decimal value represented as
           * a string.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("custom_pricing_unit")
        CUSTOM_PRICING_UNIT("custom_pricing_unit"),

        @SerializedName("monetary")
        MONETARY("monetary");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      private ApplicabilityConfig(Map<String, Object> extraParams, Scope scope) {
        this.extraParams = extraParams;
        this.scope = scope;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Scope scope;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig build() {
          return new ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig(
              this.extraParams, this.scope);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig#extraParams} for the
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
         * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The applicability scope of the credit grant. */
        public Builder setScope(
            ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope scope) {
          this.scope = scope;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Scope {
        /** The billable items to apply the credit grant to. */
        @SerializedName("billable_items")
        List<String> billableItems;

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
         * The price type that credit grants can apply to. We currently only support the {@code
         * metered} price type. This will apply to metered prices and rate cards. Cannot be used in
         * combination with {@code billable_items}.
         */
        @SerializedName("price_type")
        PriceType priceType;

        private Scope(
            List<String> billableItems, Map<String, Object> extraParams, PriceType priceType) {
          this.billableItems = billableItems;
          this.extraParams = extraParams;
          this.priceType = priceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<String> billableItems;

          private Map<String, Object> extraParams;

          private PriceType priceType;

          /** Finalize and obtain parameter instance from this builder. */
          public ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope build() {
            return new ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope(
                this.billableItems, this.extraParams, this.priceType);
          }

          /**
           * Add an element to `billableItems` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope#billableItems}
           * for the field documentation.
           */
          public Builder addBillableItem(String element) {
            if (this.billableItems == null) {
              this.billableItems = new ArrayList<>();
            }
            this.billableItems.add(element);
            return this;
          }

          /**
           * Add all elements to `billableItems` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope#billableItems}
           * for the field documentation.
           */
          public Builder addAllBillableItem(List<String> elements) {
            if (this.billableItems == null) {
              this.billableItems = new ArrayList<>();
            }
            this.billableItems.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope#extraParams}
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
           * ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope#extraParams}
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
           * The price type that credit grants can apply to. We currently only support the {@code
           * metered} price type. This will apply to metered prices and rate cards. Cannot be used
           * in combination with {@code billable_items}.
           */
          public Builder setPriceType(
              ActionServiceCreateParams.CreditGrantPerTenant.ApplicabilityConfig.Scope.PriceType
                  priceType) {
            this.priceType = priceType;
            return this;
          }
        }

        public enum PriceType implements ApiRequestParams.EnumParam {
          @SerializedName("metered")
          METERED("metered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PriceType(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ExpiryConfig {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The type of the expiry configuration. We currently support
       * {@code end_of_service_period}.
       */
      @SerializedName("type")
      Type type;

      private ExpiryConfig(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig build() {
          return new ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig#extraParams}
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
         * map. See {@link ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig#extraParams}
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
         * <strong>Required.</strong> The type of the expiry configuration. We currently support
         * {@code end_of_service_period}.
         */
        public Builder setType(
            ActionServiceCreateParams.CreditGrantPerTenant.ExpiryConfig.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("end_of_service_period")
        END_OF_SERVICE_PERIOD("end_of_service_period");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GrantCondition {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The grant condition for the meter event first per period. */
      @SerializedName("meter_event_first_per_period")
      MeterEventFirstPerPeriod meterEventFirstPerPeriod;

      /**
       * <strong>Required.</strong> The type of the grant condition. We currently support {@code
       * meter_event_first_per_period}.
       */
      @SerializedName("type")
      Type type;

      private GrantCondition(
          Map<String, Object> extraParams,
          MeterEventFirstPerPeriod meterEventFirstPerPeriod,
          Type type) {
        this.extraParams = extraParams;
        this.meterEventFirstPerPeriod = meterEventFirstPerPeriod;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MeterEventFirstPerPeriod meterEventFirstPerPeriod;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition build() {
          return new ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition(
              this.extraParams, this.meterEventFirstPerPeriod, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition#extraParams} for the field
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
         * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The grant condition for the meter event first per period. */
        public Builder setMeterEventFirstPerPeriod(
            ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod
                meterEventFirstPerPeriod) {
          this.meterEventFirstPerPeriod = meterEventFirstPerPeriod;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of the grant condition. We currently support {@code
         * meter_event_first_per_period}.
         */
        public Builder setType(
            ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MeterEventFirstPerPeriod {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The meter segment conditions for the grant condition. */
        @SerializedName("meter_segment_conditions")
        List<
                ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                    .MeterEventFirstPerPeriod.MeterSegmentCondition>
            meterSegmentConditions;

        private MeterEventFirstPerPeriod(
            Map<String, Object> extraParams,
            List<
                    ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                        .MeterEventFirstPerPeriod.MeterSegmentCondition>
                meterSegmentConditions) {
          this.extraParams = extraParams;
          this.meterSegmentConditions = meterSegmentConditions;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                      .MeterEventFirstPerPeriod.MeterSegmentCondition>
              meterSegmentConditions;

          /** Finalize and obtain parameter instance from this builder. */
          public ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                  .MeterEventFirstPerPeriod
              build() {
            return new ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                .MeterEventFirstPerPeriod(this.extraParams, this.meterSegmentConditions);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod#extraParams}
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
           * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod#extraParams}
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
           * Add an element to `meterSegmentConditions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod#meterSegmentConditions}
           * for the field documentation.
           */
          public Builder addMeterSegmentCondition(
              ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod
                      .MeterSegmentCondition
                  element) {
            if (this.meterSegmentConditions == null) {
              this.meterSegmentConditions = new ArrayList<>();
            }
            this.meterSegmentConditions.add(element);
            return this;
          }

          /**
           * Add all elements to `meterSegmentConditions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod#meterSegmentConditions}
           * for the field documentation.
           */
          public Builder addAllMeterSegmentCondition(
              List<
                      ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                          .MeterEventFirstPerPeriod.MeterSegmentCondition>
                  elements) {
            if (this.meterSegmentConditions == null) {
              this.meterSegmentConditions = new ArrayList<>();
            }
            this.meterSegmentConditions.addAll(elements);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MeterSegmentCondition {
          /** Dimension-based meter segment condition. */
          @SerializedName("dimension")
          Dimension dimension;

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
           * <strong>Required.</strong> The type of the meter segment condition. We currently
           * support {@code dimension}.
           */
          @SerializedName("type")
          Type type;

          private MeterSegmentCondition(
              Dimension dimension, Map<String, Object> extraParams, Type type) {
            this.dimension = dimension;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Dimension dimension;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                    .MeterEventFirstPerPeriod.MeterSegmentCondition
                build() {
              return new ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                  .MeterEventFirstPerPeriod.MeterSegmentCondition(
                  this.dimension, this.extraParams, this.type);
            }

            /** Dimension-based meter segment condition. */
            public Builder setDimension(
                ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                        .MeterEventFirstPerPeriod.MeterSegmentCondition.Dimension
                    dimension) {
              this.dimension = dimension;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod.MeterSegmentCondition#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod.MeterSegmentCondition#extraParams}
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
             * <strong>Required.</strong> The type of the meter segment condition. We currently
             * support {@code dimension}.
             */
            public Builder setType(
                ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                        .MeterEventFirstPerPeriod.MeterSegmentCondition.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Dimension {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The payload key for the dimension. */
            @SerializedName("payload_key")
            String payloadKey;

            /** <strong>Required.</strong> The value for the dimension. */
            @SerializedName("value")
            String value;

            private Dimension(Map<String, Object> extraParams, String payloadKey, String value) {
              this.extraParams = extraParams;
              this.payloadKey = payloadKey;
              this.value = value;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String payloadKey;

              private String value;

              /** Finalize and obtain parameter instance from this builder. */
              public ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                      .MeterEventFirstPerPeriod.MeterSegmentCondition.Dimension
                  build() {
                return new ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition
                    .MeterEventFirstPerPeriod.MeterSegmentCondition.Dimension(
                    this.extraParams, this.payloadKey, this.value);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod.MeterSegmentCondition.Dimension#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ActionServiceCreateParams.CreditGrantPerTenant.GrantCondition.MeterEventFirstPerPeriod.MeterSegmentCondition.Dimension#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The payload key for the dimension. */
              public Builder setPayloadKey(String payloadKey) {
                this.payloadKey = payloadKey;
                return this;
              }

              /** <strong>Required.</strong> The value for the dimension. */
              public Builder setValue(String value) {
                this.value = value;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("dimension")
            DIMENSION("dimension");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("meter_event_first_per_period")
        METER_EVENT_FIRST_PER_PERIOD("meter_event_first_per_period");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Category implements ApiRequestParams.EnumParam {
      @SerializedName("paid")
      PAID("paid"),

      @SerializedName("promotional")
      PROMOTIONAL("promotional");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Category(String value) {
        this.value = value;
      }
    }
  }

  public enum ServiceInterval implements ApiRequestParams.EnumParam {
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

    ServiceInterval(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("credit_grant")
    CREDIT_GRANT("credit_grant"),

    @SerializedName("credit_grant_per_tenant")
    CREDIT_GRANT_PER_TENANT("credit_grant_per_tenant");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
