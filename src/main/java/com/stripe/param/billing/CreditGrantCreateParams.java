// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CreditGrantCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Amount of this credit grant. */
  @SerializedName("amount")
  Amount amount;

  /** <strong>Required.</strong> Configuration specifying what this credit grant applies to. */
  @SerializedName("applicability_config")
  ApplicabilityConfig applicabilityConfig;

  /** <strong>Required.</strong> The category of this credit grant. */
  @SerializedName("category")
  Category category;

  /** <strong>Required.</strong> ID of the customer to receive the billing credits. */
  @SerializedName("customer")
  String customer;

  /**
   * The time when the billing credits become effective-when they're eligible for use. It defaults
   * to the current timestamp if not specified.
   */
  @SerializedName("effective_at")
  Long effectiveAt;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * The time when the billing credits expire. If not specified, the billing credits don't expire.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. You can use this to store additional
   * information about the object (for example, cost basis) in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A descriptive name shown in the Dashboard. */
  @SerializedName("name")
  String name;

  private CreditGrantCreateParams(
      Amount amount,
      ApplicabilityConfig applicabilityConfig,
      Category category,
      String customer,
      Long effectiveAt,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String name) {
    this.amount = amount;
    this.applicabilityConfig = applicabilityConfig;
    this.category = category;
    this.customer = customer;
    this.effectiveAt = effectiveAt;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private ApplicabilityConfig applicabilityConfig;

    private Category category;

    private String customer;

    private Long effectiveAt;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String name;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditGrantCreateParams build() {
      return new CreditGrantCreateParams(
          this.amount,
          this.applicabilityConfig,
          this.category,
          this.customer,
          this.effectiveAt,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.metadata,
          this.name);
    }

    /** <strong>Required.</strong> Amount of this credit grant. */
    public Builder setAmount(CreditGrantCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /** <strong>Required.</strong> Configuration specifying what this credit grant applies to. */
    public Builder setApplicabilityConfig(
        CreditGrantCreateParams.ApplicabilityConfig applicabilityConfig) {
      this.applicabilityConfig = applicabilityConfig;
      return this;
    }

    /** <strong>Required.</strong> The category of this credit grant. */
    public Builder setCategory(CreditGrantCreateParams.Category category) {
      this.category = category;
      return this;
    }

    /** <strong>Required.</strong> ID of the customer to receive the billing credits. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The time when the billing credits become effective-when they're eligible for use. It defaults
     * to the current timestamp if not specified.
     */
    public Builder setEffectiveAt(Long effectiveAt) {
      this.effectiveAt = effectiveAt;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditGrantCreateParams#expand} for the field documentation.
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
     * CreditGrantCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * The time when the billing credits expire. If not specified, the billing credits don't expire.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditGrantCreateParams#extraParams} for the field documentation.
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
     * See {@link CreditGrantCreateParams#extraParams} for the field documentation.
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
     * CreditGrantCreateParams#metadata} for the field documentation.
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
     * See {@link CreditGrantCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** A descriptive name shown in the Dashboard. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }
  }

  @Getter
  public static class Amount {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The monetary amount. */
    @SerializedName("monetary")
    Monetary monetary;

    /**
     * <strong>Required.</strong> Specify the type of this amount. We currently only support {@code
     * monetary} billing credits.
     */
    @SerializedName("type")
    Type type;

    private Amount(Map<String, Object> extraParams, Monetary monetary, Type type) {
      this.extraParams = extraParams;
      this.monetary = monetary;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Monetary monetary;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditGrantCreateParams.Amount build() {
        return new CreditGrantCreateParams.Amount(this.extraParams, this.monetary, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditGrantCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link CreditGrantCreateParams.Amount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The monetary amount. */
      public Builder setMonetary(CreditGrantCreateParams.Amount.Monetary monetary) {
        this.monetary = monetary;
        return this;
      }

      /**
       * <strong>Required.</strong> Specify the type of this amount. We currently only support
       * {@code monetary} billing credits.
       */
      public Builder setType(CreditGrantCreateParams.Amount.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A positive integer representing the amount of the credit grant.
       */
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
        public CreditGrantCreateParams.Amount.Monetary build() {
          return new CreditGrantCreateParams.Amount.Monetary(
              this.currency, this.extraParams, this.value);
        }

        /**
         * <strong>Required.</strong> Three-letter <a href="https://stripe.com/docs/currencies">ISO
         * code for the currency</a> of the {@code value} parameter.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CreditGrantCreateParams.Amount.Monetary#extraParams} for the field
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
         * map. See {@link CreditGrantCreateParams.Amount.Monetary#extraParams} for the field
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
         * <strong>Required.</strong> A positive integer representing the amount of the credit
         * grant.
         */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
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
  public static class ApplicabilityConfig {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Specify the scope of this applicability config. */
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
      public CreditGrantCreateParams.ApplicabilityConfig build() {
        return new CreditGrantCreateParams.ApplicabilityConfig(this.extraParams, this.scope);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditGrantCreateParams.ApplicabilityConfig#extraParams} for the field documentation.
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
       * See {@link CreditGrantCreateParams.ApplicabilityConfig#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Specify the scope of this applicability config. */
      public Builder setScope(CreditGrantCreateParams.ApplicabilityConfig.Scope scope) {
        this.scope = scope;
        return this;
      }
    }

    @Getter
    public static class Scope {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The price type that credit grants can apply to. We currently
       * only support the {@code metered} price type.
       */
      @SerializedName("price_type")
      PriceType priceType;

      private Scope(Map<String, Object> extraParams, PriceType priceType) {
        this.extraParams = extraParams;
        this.priceType = priceType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PriceType priceType;

        /** Finalize and obtain parameter instance from this builder. */
        public CreditGrantCreateParams.ApplicabilityConfig.Scope build() {
          return new CreditGrantCreateParams.ApplicabilityConfig.Scope(
              this.extraParams, this.priceType);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CreditGrantCreateParams.ApplicabilityConfig.Scope#extraParams} for the
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
         * map. See {@link CreditGrantCreateParams.ApplicabilityConfig.Scope#extraParams} for the
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
         * <strong>Required.</strong> The price type that credit grants can apply to. We currently
         * only support the {@code metered} price type.
         */
        public Builder setPriceType(
            CreditGrantCreateParams.ApplicabilityConfig.Scope.PriceType priceType) {
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
