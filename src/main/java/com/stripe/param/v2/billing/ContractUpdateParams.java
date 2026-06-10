// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ContractUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<ContractUpdateParams.Include> include;

  /** Schema-only: License quantity actions (implementation to follow). */
  @SerializedName("license_quantity_actions")
  List<ContractUpdateParams.LicenseQuantityAction> licenseQuantityActions;

  /** Pricing line actions to apply. */
  @SerializedName("pricing_line_actions")
  List<ContractUpdateParams.PricingLineAction> pricingLineActions;

  /** Pricing override actions to apply. */
  @SerializedName("pricing_override_actions")
  List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions;

  private ContractUpdateParams(
      Map<String, Object> extraParams,
      List<ContractUpdateParams.Include> include,
      List<ContractUpdateParams.LicenseQuantityAction> licenseQuantityActions,
      List<ContractUpdateParams.PricingLineAction> pricingLineActions,
      List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions) {
    this.extraParams = extraParams;
    this.include = include;
    this.licenseQuantityActions = licenseQuantityActions;
    this.pricingLineActions = pricingLineActions;
    this.pricingOverrideActions = pricingOverrideActions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<ContractUpdateParams.Include> include;

    private List<ContractUpdateParams.LicenseQuantityAction> licenseQuantityActions;

    private List<ContractUpdateParams.PricingLineAction> pricingLineActions;

    private List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractUpdateParams build() {
      return new ContractUpdateParams(
          this.extraParams,
          this.include,
          this.licenseQuantityActions,
          this.pricingLineActions,
          this.pricingOverrideActions);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#extraParams} for the field documentation.
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
     * See {@link ContractUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(ContractUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<ContractUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add an element to `licenseQuantityActions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractUpdateParams#licenseQuantityActions} for the field documentation.
     */
    public Builder addLicenseQuantityAction(ContractUpdateParams.LicenseQuantityAction element) {
      if (this.licenseQuantityActions == null) {
        this.licenseQuantityActions = new ArrayList<>();
      }
      this.licenseQuantityActions.add(element);
      return this;
    }

    /**
     * Add all elements to `licenseQuantityActions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractUpdateParams#licenseQuantityActions} for the field documentation.
     */
    public Builder addAllLicenseQuantityAction(
        List<ContractUpdateParams.LicenseQuantityAction> elements) {
      if (this.licenseQuantityActions == null) {
        this.licenseQuantityActions = new ArrayList<>();
      }
      this.licenseQuantityActions.addAll(elements);
      return this;
    }

    /**
     * Add an element to `pricingLineActions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#pricingLineActions} for the field documentation.
     */
    public Builder addPricingLineAction(ContractUpdateParams.PricingLineAction element) {
      if (this.pricingLineActions == null) {
        this.pricingLineActions = new ArrayList<>();
      }
      this.pricingLineActions.add(element);
      return this;
    }

    /**
     * Add all elements to `pricingLineActions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractUpdateParams#pricingLineActions} for the field documentation.
     */
    public Builder addAllPricingLineAction(List<ContractUpdateParams.PricingLineAction> elements) {
      if (this.pricingLineActions == null) {
        this.pricingLineActions = new ArrayList<>();
      }
      this.pricingLineActions.addAll(elements);
      return this;
    }

    /**
     * Add an element to `pricingOverrideActions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractUpdateParams#pricingOverrideActions} for the field documentation.
     */
    public Builder addPricingOverrideAction(ContractUpdateParams.PricingOverrideAction element) {
      if (this.pricingOverrideActions == null) {
        this.pricingOverrideActions = new ArrayList<>();
      }
      this.pricingOverrideActions.add(element);
      return this;
    }

    /**
     * Add all elements to `pricingOverrideActions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractUpdateParams#pricingOverrideActions} for the field documentation.
     */
    public Builder addAllPricingOverrideAction(
        List<ContractUpdateParams.PricingOverrideAction> elements) {
      if (this.pricingOverrideActions == null) {
        this.pricingOverrideActions = new ArrayList<>();
      }
      this.pricingOverrideActions.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LicenseQuantityAction {
    /** <strong>Required.</strong> The effective at for the license quantity action. */
    @SerializedName("effective_at")
    EffectiveAt effectiveAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the license pricing. */
    @SerializedName("license_pricing_id")
    Object licensePricingId;

    /** The lookup key for the license pricing. */
    @SerializedName("license_pricing_lookup_key")
    Object licensePricingLookupKey;

    /** <strong>Required.</strong> The type of the license pricing. */
    @SerializedName("license_pricing_type")
    LicensePricingType licensePricingType;

    /** The pricing line ID for the license quantity action. */
    @SerializedName("pricing_line")
    Object pricingLine;

    /** The pricing line lookup key for the license quantity action. */
    @SerializedName("pricing_line_lookup_key")
    Object pricingLineLookupKey;

    /** The set quantity for the license quantity action. */
    @SerializedName("set")
    Set set;

    /** <strong>Required.</strong> The type of the license quantity action. */
    @SerializedName("type")
    Type type;

    private LicenseQuantityAction(
        EffectiveAt effectiveAt,
        Map<String, Object> extraParams,
        Object licensePricingId,
        Object licensePricingLookupKey,
        LicensePricingType licensePricingType,
        Object pricingLine,
        Object pricingLineLookupKey,
        Set set,
        Type type) {
      this.effectiveAt = effectiveAt;
      this.extraParams = extraParams;
      this.licensePricingId = licensePricingId;
      this.licensePricingLookupKey = licensePricingLookupKey;
      this.licensePricingType = licensePricingType;
      this.pricingLine = pricingLine;
      this.pricingLineLookupKey = pricingLineLookupKey;
      this.set = set;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private EffectiveAt effectiveAt;

      private Map<String, Object> extraParams;

      private Object licensePricingId;

      private Object licensePricingLookupKey;

      private LicensePricingType licensePricingType;

      private Object pricingLine;

      private Object pricingLineLookupKey;

      private Set set;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractUpdateParams.LicenseQuantityAction build() {
        return new ContractUpdateParams.LicenseQuantityAction(
            this.effectiveAt,
            this.extraParams,
            this.licensePricingId,
            this.licensePricingLookupKey,
            this.licensePricingType,
            this.pricingLine,
            this.pricingLineLookupKey,
            this.set,
            this.type);
      }

      /** <strong>Required.</strong> The effective at for the license quantity action. */
      public Builder setEffectiveAt(
          ContractUpdateParams.LicenseQuantityAction.EffectiveAt effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractUpdateParams.LicenseQuantityAction#extraParams} for the field documentation.
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
       * See {@link ContractUpdateParams.LicenseQuantityAction#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the license pricing. */
      public Builder setLicensePricingId(String licensePricingId) {
        this.licensePricingId = licensePricingId;
        return this;
      }

      /** The ID of the license pricing. */
      public Builder setLicensePricingId(EmptyParam licensePricingId) {
        this.licensePricingId = licensePricingId;
        return this;
      }

      /** The lookup key for the license pricing. */
      public Builder setLicensePricingLookupKey(String licensePricingLookupKey) {
        this.licensePricingLookupKey = licensePricingLookupKey;
        return this;
      }

      /** The lookup key for the license pricing. */
      public Builder setLicensePricingLookupKey(EmptyParam licensePricingLookupKey) {
        this.licensePricingLookupKey = licensePricingLookupKey;
        return this;
      }

      /** <strong>Required.</strong> The type of the license pricing. */
      public Builder setLicensePricingType(
          ContractUpdateParams.LicenseQuantityAction.LicensePricingType licensePricingType) {
        this.licensePricingType = licensePricingType;
        return this;
      }

      /** The pricing line ID for the license quantity action. */
      public Builder setPricingLine(String pricingLine) {
        this.pricingLine = pricingLine;
        return this;
      }

      /** The pricing line ID for the license quantity action. */
      public Builder setPricingLine(EmptyParam pricingLine) {
        this.pricingLine = pricingLine;
        return this;
      }

      /** The pricing line lookup key for the license quantity action. */
      public Builder setPricingLineLookupKey(String pricingLineLookupKey) {
        this.pricingLineLookupKey = pricingLineLookupKey;
        return this;
      }

      /** The pricing line lookup key for the license quantity action. */
      public Builder setPricingLineLookupKey(EmptyParam pricingLineLookupKey) {
        this.pricingLineLookupKey = pricingLineLookupKey;
        return this;
      }

      /** The set quantity for the license quantity action. */
      public Builder setSet(ContractUpdateParams.LicenseQuantityAction.Set set) {
        this.set = set;
        return this;
      }

      /** <strong>Required.</strong> The type of the license quantity action. */
      public Builder setType(ContractUpdateParams.LicenseQuantityAction.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EffectiveAt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp for the effective at. */
      @SerializedName("timestamp")
      Instant timestamp;

      /** <strong>Required.</strong> The type of the effective at. */
      @SerializedName("type")
      Type type;

      private EffectiveAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Instant timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.LicenseQuantityAction.EffectiveAt build() {
          return new ContractUpdateParams.LicenseQuantityAction.EffectiveAt(
              this.extraParams, this.timestamp, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.LicenseQuantityAction.EffectiveAt#extraParams} for
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
         * map. See {@link ContractUpdateParams.LicenseQuantityAction.EffectiveAt#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp for the effective at. */
        public Builder setTimestamp(Instant timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> The type of the effective at. */
        public Builder setType(ContractUpdateParams.LicenseQuantityAction.EffectiveAt.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Set {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The quantity to set. */
      @SerializedName("quantity")
      Long quantity;

      private Set(Map<String, Object> extraParams, Long quantity) {
        this.extraParams = extraParams;
        this.quantity = quantity;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long quantity;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.LicenseQuantityAction.Set build() {
          return new ContractUpdateParams.LicenseQuantityAction.Set(
              this.extraParams, this.quantity);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.LicenseQuantityAction.Set#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.LicenseQuantityAction.Set#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The quantity to set. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }
      }
    }

    public enum LicensePricingType implements ApiRequestParams.EnumParam {
      @SerializedName("license_fee")
      LICENSE_FEE("license_fee"),

      @SerializedName("price")
      PRICE("price");

      @Getter(onMethod_ = {@Override})
      private final String value;

      LicensePricingType(String value) {
        this.value = value;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("set")
      SET("set");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingLineAction {
    /** Parameters for adding a pricing line. */
    @SerializedName("add")
    Add add;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameters for removing a pricing line. */
    @SerializedName("remove")
    Remove remove;

    /** <strong>Required.</strong> The type of pricing line action. */
    @SerializedName("type")
    Type type;

    /** Parameters for updating a pricing line. */
    @SerializedName("update")
    Update update;

    private PricingLineAction(
        Add add, Map<String, Object> extraParams, Remove remove, Type type, Update update) {
      this.add = add;
      this.extraParams = extraParams;
      this.remove = remove;
      this.type = type;
      this.update = update;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Add add;

      private Map<String, Object> extraParams;

      private Remove remove;

      private Type type;

      private Update update;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractUpdateParams.PricingLineAction build() {
        return new ContractUpdateParams.PricingLineAction(
            this.add, this.extraParams, this.remove, this.type, this.update);
      }

      /** Parameters for adding a pricing line. */
      public Builder setAdd(ContractUpdateParams.PricingLineAction.Add add) {
        this.add = add;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractUpdateParams.PricingLineAction#extraParams} for the field documentation.
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
       * See {@link ContractUpdateParams.PricingLineAction#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameters for removing a pricing line. */
      public Builder setRemove(ContractUpdateParams.PricingLineAction.Remove remove) {
        this.remove = remove;
        return this;
      }

      /** <strong>Required.</strong> The type of pricing line action. */
      public Builder setType(ContractUpdateParams.PricingLineAction.Type type) {
        this.type = type;
        return this;
      }

      /** Parameters for updating a pricing line. */
      public Builder setUpdate(ContractUpdateParams.PricingLineAction.Update update) {
        this.update = update;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Add {
      /** <strong>Required.</strong> The end time for the pricing line. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A lookup key for the pricing line. */
      @SerializedName("lookup_key")
      Object lookupKey;

      /** Metadata for the pricing line. */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** <strong>Required.</strong> The pricing configuration for the pricing line. */
      @SerializedName("pricing")
      Pricing pricing;

      /** <strong>Required.</strong> The start time for the pricing line. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private Add(
          EndsAt endsAt,
          Map<String, Object> extraParams,
          Object lookupKey,
          Map<String, String> metadata,
          Pricing pricing,
          StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.lookupKey = lookupKey;
        this.metadata = metadata;
        this.pricing = pricing;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Object lookupKey;

        private Map<String, String> metadata;

        private Pricing pricing;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingLineAction.Add build() {
          return new ContractUpdateParams.PricingLineAction.Add(
              this.endsAt,
              this.extraParams,
              this.lookupKey,
              this.metadata,
              this.pricing,
              this.startsAt);
        }

        /** <strong>Required.</strong> The end time for the pricing line. */
        public Builder setEndsAt(ContractUpdateParams.PricingLineAction.Add.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingLineAction.Add#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.PricingLineAction.Add#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A lookup key for the pricing line. */
        public Builder setLookupKey(String lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /** A lookup key for the pricing line. */
        public Builder setLookupKey(EmptyParam lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingLineAction.Add#metadata} for the field documentation.
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
         * map. See {@link ContractUpdateParams.PricingLineAction.Add#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The pricing configuration for the pricing line. */
        public Builder setPricing(ContractUpdateParams.PricingLineAction.Add.Pricing pricing) {
          this.pricing = pricing;
          return this;
        }

        /** <strong>Required.</strong> The start time for the pricing line. */
        public Builder setStartsAt(ContractUpdateParams.PricingLineAction.Add.StartsAt startsAt) {
          this.startsAt = startsAt;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of end time to apply. */
        @SerializedName("type")
        Type type;

        private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Add.EndsAt build() {
            return new ContractUpdateParams.PricingLineAction.Add.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.EndsAt#extraParams} for the
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.EndsAt#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item ends. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of end time to apply. */
          public Builder setType(ContractUpdateParams.PricingLineAction.Add.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_end")
          BILLING_PERIOD_END("billing_period_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Pricing {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** V1 price details. Required if {@code type} is {@code price}. */
        @SerializedName("price_details")
        PriceDetails priceDetails;

        /** <strong>Required.</strong> The type of pricing. */
        @SerializedName("type")
        Type type;

        private Pricing(Map<String, Object> extraParams, PriceDetails priceDetails, Type type) {
          this.extraParams = extraParams;
          this.priceDetails = priceDetails;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PriceDetails priceDetails;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Add.Pricing build() {
            return new ContractUpdateParams.PricingLineAction.Add.Pricing(
                this.extraParams, this.priceDetails, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.Pricing#extraParams} for the
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.Pricing#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** V1 price details. Required if {@code type} is {@code price}. */
          public Builder setPriceDetails(
              ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails priceDetails) {
            this.priceDetails = priceDetails;
            return this;
          }

          /** <strong>Required.</strong> The type of pricing. */
          public Builder setType(ContractUpdateParams.PricingLineAction.Add.Pricing.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PriceDetails {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The ID of the V1 price. */
          @SerializedName("price")
          Object price;

          /** The quantity for the price. Only applicable for licensed prices. */
          @SerializedName("quantity")
          Long quantity;

          private PriceDetails(Map<String, Object> extraParams, Object price, Long quantity) {
            this.extraParams = extraParams;
            this.price = price;
            this.quantity = quantity;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object price;

            private Long quantity;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails build() {
              return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails(
                  this.extraParams, this.price, this.quantity);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#extraParams} for the
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
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the V1 price. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }

            /** <strong>Required.</strong> The ID of the V1 price. */
            public Builder setPrice(EmptyParam price) {
              this.price = price;
              return this;
            }

            /** The quantity for the price. Only applicable for licensed prices. */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("price")
          PRICE("price");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of start time to apply. */
        @SerializedName("type")
        Type type;

        private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Add.StartsAt build() {
            return new ContractUpdateParams.PricingLineAction.Add.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.StartsAt#extraParams} for
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Add.StartsAt#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item starts. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of start time to apply. */
          public Builder setType(ContractUpdateParams.PricingLineAction.Add.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_start")
          BILLING_PERIOD_START("billing_period_start"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

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
    public static class Remove {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the pricing line to remove. */
      @SerializedName("id")
      Object id;

      private Remove(Map<String, Object> extraParams, Object id) {
        this.extraParams = extraParams;
        this.id = id;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object id;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingLineAction.Remove build() {
          return new ContractUpdateParams.PricingLineAction.Remove(this.extraParams, this.id);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingLineAction.Remove#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.PricingLineAction.Remove#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing line to remove. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing line to remove. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Update {
      /** The updated end time for the pricing line. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the pricing line. */
      @SerializedName("id")
      Object id;

      /** The updated start time for the pricing line. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private Update(EndsAt endsAt, Map<String, Object> extraParams, Object id, StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.id = id;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Object id;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingLineAction.Update build() {
          return new ContractUpdateParams.PricingLineAction.Update(
              this.endsAt, this.extraParams, this.id, this.startsAt);
        }

        /** The updated end time for the pricing line. */
        public Builder setEndsAt(ContractUpdateParams.PricingLineAction.Update.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingLineAction.Update#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.PricingLineAction.Update#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing line. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing line. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /** The updated start time for the pricing line. */
        public Builder setStartsAt(
            ContractUpdateParams.PricingLineAction.Update.StartsAt startsAt) {
          this.startsAt = startsAt;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of end time to apply. */
        @SerializedName("type")
        Type type;

        private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Update.EndsAt build() {
            return new ContractUpdateParams.PricingLineAction.Update.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.EndsAt#extraParams} for
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.EndsAt#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item ends. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of end time to apply. */
          public Builder setType(ContractUpdateParams.PricingLineAction.Update.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_end")
          BILLING_PERIOD_END("billing_period_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of start time to apply. */
        @SerializedName("type")
        Type type;

        private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Update.StartsAt build() {
            return new ContractUpdateParams.PricingLineAction.Update.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.StartsAt#extraParams} for
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.StartsAt#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item starts. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of start time to apply. */
          public Builder setType(ContractUpdateParams.PricingLineAction.Update.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_start")
          BILLING_PERIOD_START("billing_period_start"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("add")
      ADD("add"),

      @SerializedName("remove")
      REMOVE("remove"),

      @SerializedName("update")
      UPDATE("update");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingOverrideAction {
    /** Parameters for adding a pricing override. */
    @SerializedName("add")
    Add add;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameters for removing a pricing override. */
    @SerializedName("remove")
    Remove remove;

    /** <strong>Required.</strong> The type of pricing override action. */
    @SerializedName("type")
    Type type;

    /** Parameters for updating a pricing override. */
    @SerializedName("update")
    Update update;

    private PricingOverrideAction(
        Add add, Map<String, Object> extraParams, Remove remove, Type type, Update update) {
      this.add = add;
      this.extraParams = extraParams;
      this.remove = remove;
      this.type = type;
      this.update = update;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Add add;

      private Map<String, Object> extraParams;

      private Remove remove;

      private Type type;

      private Update update;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractUpdateParams.PricingOverrideAction build() {
        return new ContractUpdateParams.PricingOverrideAction(
            this.add, this.extraParams, this.remove, this.type, this.update);
      }

      /** Parameters for adding a pricing override. */
      public Builder setAdd(ContractUpdateParams.PricingOverrideAction.Add add) {
        this.add = add;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractUpdateParams.PricingOverrideAction#extraParams} for the field documentation.
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
       * See {@link ContractUpdateParams.PricingOverrideAction#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameters for removing a pricing override. */
      public Builder setRemove(ContractUpdateParams.PricingOverrideAction.Remove remove) {
        this.remove = remove;
        return this;
      }

      /** <strong>Required.</strong> The type of pricing override action. */
      public Builder setType(ContractUpdateParams.PricingOverrideAction.Type type) {
        this.type = type;
        return this;
      }

      /** Parameters for updating a pricing override. */
      public Builder setUpdate(ContractUpdateParams.PricingOverrideAction.Update update) {
        this.update = update;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Add {
      /** <strong>Required.</strong> The end time for the pricing override. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A lookup key for the pricing override. */
      @SerializedName("lookup_key")
      Object lookupKey;

      /** A multiplier override to add. */
      @SerializedName("multiplier")
      Multiplier multiplier;

      /** An overwrite price override to add. */
      @SerializedName("overwrite_price")
      OverwritePrice overwritePrice;

      /**
       * <strong>Required.</strong> The priority for the pricing override. The highest priority is 0
       * and the lowest is 100.
       */
      @SerializedName("priority")
      Long priority;

      /** <strong>Required.</strong> The start time for the pricing override. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /** <strong>Required.</strong> The type of pricing override to add. */
      @SerializedName("type")
      Type type;

      private Add(
          EndsAt endsAt,
          Map<String, Object> extraParams,
          Object lookupKey,
          Multiplier multiplier,
          OverwritePrice overwritePrice,
          Long priority,
          StartsAt startsAt,
          Type type) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.lookupKey = lookupKey;
        this.multiplier = multiplier;
        this.overwritePrice = overwritePrice;
        this.priority = priority;
        this.startsAt = startsAt;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Object lookupKey;

        private Multiplier multiplier;

        private OverwritePrice overwritePrice;

        private Long priority;

        private StartsAt startsAt;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingOverrideAction.Add build() {
          return new ContractUpdateParams.PricingOverrideAction.Add(
              this.endsAt,
              this.extraParams,
              this.lookupKey,
              this.multiplier,
              this.overwritePrice,
              this.priority,
              this.startsAt,
              this.type);
        }

        /** <strong>Required.</strong> The end time for the pricing override. */
        public Builder setEndsAt(ContractUpdateParams.PricingOverrideAction.Add.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Add#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Add#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A lookup key for the pricing override. */
        public Builder setLookupKey(String lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /** A lookup key for the pricing override. */
        public Builder setLookupKey(EmptyParam lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /** A multiplier override to add. */
        public Builder setMultiplier(
            ContractUpdateParams.PricingOverrideAction.Add.Multiplier multiplier) {
          this.multiplier = multiplier;
          return this;
        }

        /** An overwrite price override to add. */
        public Builder setOverwritePrice(
            ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice overwritePrice) {
          this.overwritePrice = overwritePrice;
          return this;
        }

        /**
         * <strong>Required.</strong> The priority for the pricing override. The highest priority is
         * 0 and the lowest is 100.
         */
        public Builder setPriority(Long priority) {
          this.priority = priority;
          return this;
        }

        /** <strong>Required.</strong> The start time for the pricing override. */
        public Builder setStartsAt(
            ContractUpdateParams.PricingOverrideAction.Add.StartsAt startsAt) {
          this.startsAt = startsAt;
          return this;
        }

        /** <strong>Required.</strong> The type of pricing override to add. */
        public Builder setType(ContractUpdateParams.PricingOverrideAction.Add.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of end time to apply. */
        @SerializedName("type")
        Type type;

        private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.EndsAt build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.EndsAt#extraParams} for
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
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.EndsAt#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item ends. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of end time to apply. */
          public Builder setType(ContractUpdateParams.PricingOverrideAction.Add.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_end")
          BILLING_PERIOD_END("billing_period_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Multiplier {
        /**
         * <strong>Required.</strong> Criteria determining which rates the multiplier applies to.
         */
        @SerializedName("criteria")
        List<ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion> criteria;

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
         * <strong>Required.</strong> The multiplier factor, represented as a decimal string. e.g.
         * &quot;0.8&quot; for a 20% reduction.
         */
        @SerializedName("factor")
        Object factor;

        private Multiplier(
            List<ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion> criteria,
            Map<String, Object> extraParams,
            Object factor) {
          this.criteria = criteria;
          this.extraParams = extraParams;
          this.factor = factor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion>
              criteria;

          private Map<String, Object> extraParams;

          private Object factor;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.Multiplier build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.Multiplier(
                this.criteria, this.extraParams, this.factor);
          }

          /**
           * Add an element to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.Multiplier#criteria} for the field
           * documentation.
           */
          public Builder addCriterion(
              ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion element) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.add(element);
            return this;
          }

          /**
           * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.Multiplier#criteria} for the field
           * documentation.
           */
          public Builder addAllCriterion(
              List<ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion> elements) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.Multiplier#extraParams}
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
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.Multiplier#extraParams}
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
           * <strong>Required.</strong> The multiplier factor, represented as a decimal string. e.g.
           * &quot;0.8&quot; for a 20% reduction.
           */
          public Builder setFactor(String factor) {
            this.factor = factor;
            return this;
          }

          /**
           * <strong>Required.</strong> The multiplier factor, represented as a decimal string. e.g.
           * &quot;0.8&quot; for a 20% reduction.
           */
          public Builder setFactor(EmptyParam factor) {
            this.factor = factor;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Criterion {
          /** <strong>Required.</strong> Filter by billable item IDs. */
          @SerializedName("billable_item_ids")
          List<String> billableItemIds;

          /** <strong>Required.</strong> Filter by billable item lookup keys. */
          @SerializedName("billable_item_lookup_keys")
          List<String> billableItemLookupKeys;

          /** <strong>Required.</strong> Filter by billable item type. */
          @SerializedName("billable_item_types")
          List<ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.BillableItemType>
              billableItemTypes;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Filter by metadata conditions. */
          @SerializedName("metadata_conditions")
          List<
                  ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                      .MetadataCondition>
              metadataConditions;

          /**
           * <strong>Required.</strong> Filter by rate card IDs. Only applicable for {@code
           * multiplier} overrides.
           */
          @SerializedName("rate_card_ids")
          List<String> rateCardIds;

          /**
           * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
           */
          @SerializedName("type")
          Type type;

          private Criterion(
              List<String> billableItemIds,
              List<String> billableItemLookupKeys,
              List<
                      ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                          .BillableItemType>
                  billableItemTypes,
              Map<String, Object> extraParams,
              List<
                      ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                          .MetadataCondition>
                  metadataConditions,
              List<String> rateCardIds,
              Type type) {
            this.billableItemIds = billableItemIds;
            this.billableItemLookupKeys = billableItemLookupKeys;
            this.billableItemTypes = billableItemTypes;
            this.extraParams = extraParams;
            this.metadataConditions = metadataConditions;
            this.rateCardIds = rateCardIds;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<String> billableItemIds;

            private List<String> billableItemLookupKeys;

            private List<
                    ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                        .BillableItemType>
                billableItemTypes;

            private Map<String, Object> extraParams;

            private List<
                    ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                        .MetadataCondition>
                metadataConditions;

            private List<String> rateCardIds;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion build() {
              return new ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion(
                  this.billableItemIds,
                  this.billableItemLookupKeys,
                  this.billableItemTypes,
                  this.extraParams,
                  this.metadataConditions,
                  this.rateCardIds,
                  this.type);
            }

            /**
             * Add an element to `billableItemIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemIds}
             * for the field documentation.
             */
            public Builder addBillableItemId(String element) {
              if (this.billableItemIds == null) {
                this.billableItemIds = new ArrayList<>();
              }
              this.billableItemIds.add(element);
              return this;
            }

            /**
             * Add all elements to `billableItemIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemIds}
             * for the field documentation.
             */
            public Builder addAllBillableItemId(List<String> elements) {
              if (this.billableItemIds == null) {
                this.billableItemIds = new ArrayList<>();
              }
              this.billableItemIds.addAll(elements);
              return this;
            }

            /**
             * Add an element to `billableItemLookupKeys` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemLookupKeys}
             * for the field documentation.
             */
            public Builder addBillableItemLookupKey(String element) {
              if (this.billableItemLookupKeys == null) {
                this.billableItemLookupKeys = new ArrayList<>();
              }
              this.billableItemLookupKeys.add(element);
              return this;
            }

            /**
             * Add all elements to `billableItemLookupKeys` list. A list is initialized for the
             * first `add/addAll` call, and subsequent calls adds additional elements to the
             * original list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemLookupKeys}
             * for the field documentation.
             */
            public Builder addAllBillableItemLookupKey(List<String> elements) {
              if (this.billableItemLookupKeys == null) {
                this.billableItemLookupKeys = new ArrayList<>();
              }
              this.billableItemLookupKeys.addAll(elements);
              return this;
            }

            /**
             * Add an element to `billableItemTypes` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemTypes}
             * for the field documentation.
             */
            public Builder addBillableItemType(
                ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.BillableItemType
                    element) {
              if (this.billableItemTypes == null) {
                this.billableItemTypes = new ArrayList<>();
              }
              this.billableItemTypes.add(element);
              return this;
            }

            /**
             * Add all elements to `billableItemTypes` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#billableItemTypes}
             * for the field documentation.
             */
            public Builder addAllBillableItemType(
                List<
                        ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                            .BillableItemType>
                    elements) {
              if (this.billableItemTypes == null) {
                this.billableItemTypes = new ArrayList<>();
              }
              this.billableItemTypes.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#extraParams} for
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
             * Add an element to `metadataConditions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#metadataConditions}
             * for the field documentation.
             */
            public Builder addMetadataCondition(
                ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                        .MetadataCondition
                    element) {
              if (this.metadataConditions == null) {
                this.metadataConditions = new ArrayList<>();
              }
              this.metadataConditions.add(element);
              return this;
            }

            /**
             * Add all elements to `metadataConditions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#metadataConditions}
             * for the field documentation.
             */
            public Builder addAllMetadataCondition(
                List<
                        ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                            .MetadataCondition>
                    elements) {
              if (this.metadataConditions == null) {
                this.metadataConditions = new ArrayList<>();
              }
              this.metadataConditions.addAll(elements);
              return this;
            }

            /**
             * Add an element to `rateCardIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#rateCardIds} for
             * the field documentation.
             */
            public Builder addRateCardId(String element) {
              if (this.rateCardIds == null) {
                this.rateCardIds = new ArrayList<>();
              }
              this.rateCardIds.add(element);
              return this;
            }

            /**
             * Add all elements to `rateCardIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion#rateCardIds} for
             * the field documentation.
             */
            public Builder addAllRateCardId(List<String> elements) {
              if (this.rateCardIds == null) {
                this.rateCardIds = new ArrayList<>();
              }
              this.rateCardIds.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> Whether to include or exclude items matching these
             * criteria.
             */
            public Builder setType(
                ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MetadataCondition {
            /** <strong>Required.</strong> All of these key-value conditions must match. */
            @SerializedName("all_of")
            List<
                    ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                        .MetadataCondition.AllOf>
                allOf;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private MetadataCondition(
                List<
                        ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                            .MetadataCondition.AllOf>
                    allOf,
                Map<String, Object> extraParams) {
              this.allOf = allOf;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private List<
                      ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                          .MetadataCondition.AllOf>
                  allOf;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                      .MetadataCondition
                  build() {
                return new ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                    .MetadataCondition(this.allOf, this.extraParams);
              }

              /**
               * Add an element to `allOf` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition#allOf}
               * for the field documentation.
               */
              public Builder addAllOf(
                  ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                          .MetadataCondition.AllOf
                      element) {
                if (this.allOf == null) {
                  this.allOf = new ArrayList<>();
                }
                this.allOf.add(element);
                return this;
              }

              /**
               * Add all elements to `allOf` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition#allOf}
               * for the field documentation.
               */
              public Builder addAllAllOf(
                  List<
                          ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                              .MetadataCondition.AllOf>
                      elements) {
                if (this.allOf == null) {
                  this.allOf = new ArrayList<>();
                }
                this.allOf.addAll(elements);
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition#extraParams}
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
               * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class AllOf {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** <strong>Required.</strong> The metadata key. */
              @SerializedName("key")
              Object key;

              /** <strong>Required.</strong> The metadata value. */
              @SerializedName("value")
              Object value;

              private AllOf(Map<String, Object> extraParams, Object key, Object value) {
                this.extraParams = extraParams;
                this.key = key;
                this.value = value;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private Object key;

                private Object value;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                        .MetadataCondition.AllOf
                    build() {
                  return new ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion
                      .MetadataCondition.AllOf(this.extraParams, this.key, this.value);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition.AllOf#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * ContractUpdateParams.PricingOverrideAction.Add.Multiplier.Criterion.MetadataCondition.AllOf#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** <strong>Required.</strong> The metadata key. */
                public Builder setKey(String key) {
                  this.key = key;
                  return this;
                }

                /** <strong>Required.</strong> The metadata key. */
                public Builder setKey(EmptyParam key) {
                  this.key = key;
                  return this;
                }

                /** <strong>Required.</strong> The metadata value. */
                public Builder setValue(String value) {
                  this.value = value;
                  return this;
                }

                /** <strong>Required.</strong> The metadata value. */
                public Builder setValue(EmptyParam value) {
                  this.value = value;
                  return this;
                }
              }
            }
          }

          public enum BillableItemType implements ApiRequestParams.EnumParam {
            @SerializedName("licensed")
            LICENSED("licensed"),

            @SerializedName("metered")
            METERED("metered");

            @Getter(onMethod_ = {@Override})
            private final String value;

            BillableItemType(String value) {
              this.value = value;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("exclude")
            EXCLUDE("exclude"),

            @SerializedName("include")
            INCLUDE("include");

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
      public static class OverwritePrice {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The ID of the V1 price to overwrite. */
        @SerializedName("price")
        Object price;

        /** Defines whether the tiered price should be graduated or volume-based. */
        @SerializedName("tiering_mode")
        TieringMode tieringMode;

        /** <strong>Required.</strong> Each element represents a pricing tier. */
        @SerializedName("tiers")
        List<ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier> tiers;

        /**
         * The per-unit amount to be charged, represented as a decimal string in minor currency
         * units.
         */
        @SerializedName("unit_amount")
        Object unitAmount;

        private OverwritePrice(
            Map<String, Object> extraParams,
            Object price,
            TieringMode tieringMode,
            List<ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier> tiers,
            Object unitAmount) {
          this.extraParams = extraParams;
          this.price = price;
          this.tieringMode = tieringMode;
          this.tiers = tiers;
          this.unitAmount = unitAmount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object price;

          private TieringMode tieringMode;

          private List<ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier> tiers;

          private Object unitAmount;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice(
                this.extraParams, this.price, this.tieringMode, this.tiers, this.unitAmount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice#extraParams} for the
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
           * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID of the V1 price to overwrite. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /** <strong>Required.</strong> The ID of the V1 price to overwrite. */
          public Builder setPrice(EmptyParam price) {
            this.price = price;
            return this;
          }

          /** Defines whether the tiered price should be graduated or volume-based. */
          public Builder setTieringMode(
              ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.TieringMode
                  tieringMode) {
            this.tieringMode = tieringMode;
            return this;
          }

          /**
           * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice#tiers} for the field
           * documentation.
           */
          public Builder addTier(
              ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier element) {
            if (this.tiers == null) {
              this.tiers = new ArrayList<>();
            }
            this.tiers.add(element);
            return this;
          }

          /**
           * Add all elements to `tiers` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice#tiers} for the field
           * documentation.
           */
          public Builder addAllTier(
              List<ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier> elements) {
            if (this.tiers == null) {
              this.tiers = new ArrayList<>();
            }
            this.tiers.addAll(elements);
            return this;
          }

          /**
           * The per-unit amount to be charged, represented as a decimal string in minor currency
           * units.
           */
          public Builder setUnitAmount(String unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * The per-unit amount to be charged, represented as a decimal string in minor currency
           * units.
           */
          public Builder setUnitAmount(EmptyParam unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tier {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Price for the entire tier, represented as a decimal string in minor currency units. */
          @SerializedName("flat_amount")
          Object flatAmount;

          /**
           * Per-unit price for units included in this tier, represented as a decimal string in
           * minor currency units.
           */
          @SerializedName("unit_amount")
          Object unitAmount;

          /** Up to and including this quantity will be contained in the tier. */
          @SerializedName("up_to_decimal")
          Object upToDecimal;

          /** No upper bound to this tier. */
          @SerializedName("up_to_inf")
          UpToInf upToInf;

          private Tier(
              Map<String, Object> extraParams,
              Object flatAmount,
              Object unitAmount,
              Object upToDecimal,
              UpToInf upToInf) {
            this.extraParams = extraParams;
            this.flatAmount = flatAmount;
            this.unitAmount = unitAmount;
            this.upToDecimal = upToDecimal;
            this.upToInf = upToInf;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object flatAmount;

            private Object unitAmount;

            private Object upToDecimal;

            private UpToInf upToInf;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier build() {
              return new ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier(
                  this.extraParams,
                  this.flatAmount,
                  this.unitAmount,
                  this.upToDecimal,
                  this.upToInf);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier#extraParams} for
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
             * Price for the entire tier, represented as a decimal string in minor currency units.
             */
            public Builder setFlatAmount(String flatAmount) {
              this.flatAmount = flatAmount;
              return this;
            }

            /**
             * Price for the entire tier, represented as a decimal string in minor currency units.
             */
            public Builder setFlatAmount(EmptyParam flatAmount) {
              this.flatAmount = flatAmount;
              return this;
            }

            /**
             * Per-unit price for units included in this tier, represented as a decimal string in
             * minor currency units.
             */
            public Builder setUnitAmount(String unitAmount) {
              this.unitAmount = unitAmount;
              return this;
            }

            /**
             * Per-unit price for units included in this tier, represented as a decimal string in
             * minor currency units.
             */
            public Builder setUnitAmount(EmptyParam unitAmount) {
              this.unitAmount = unitAmount;
              return this;
            }

            /** Up to and including this quantity will be contained in the tier. */
            public Builder setUpToDecimal(BigDecimal upToDecimal) {
              this.upToDecimal = upToDecimal;
              return this;
            }

            /** Up to and including this quantity will be contained in the tier. */
            public Builder setUpToDecimal(EmptyParam upToDecimal) {
              this.upToDecimal = upToDecimal;
              return this;
            }

            /** No upper bound to this tier. */
            public Builder setUpToInf(
                ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice.Tier.UpToInf
                    upToInf) {
              this.upToInf = upToInf;
              return this;
            }
          }

          public enum UpToInf implements ApiRequestParams.EnumParam {
            @SerializedName("inf")
            INF("inf");

            @Getter(onMethod_ = {@Override})
            private final String value;

            UpToInf(String value) {
              this.value = value;
            }
          }
        }

        public enum TieringMode implements ApiRequestParams.EnumParam {
          @SerializedName("graduated")
          GRADUATED("graduated"),

          @SerializedName("volume")
          VOLUME("volume");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TieringMode(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of start time to apply. */
        @SerializedName("type")
        Type type;

        private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.StartsAt build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.StartsAt#extraParams}
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
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Add.StartsAt#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item starts. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of start time to apply. */
          public Builder setType(
              ContractUpdateParams.PricingOverrideAction.Add.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_start")
          BILLING_PERIOD_START("billing_period_start"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("multiplier")
        MULTIPLIER("multiplier"),

        @SerializedName("overwrite_price")
        OVERWRITE_PRICE("overwrite_price");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Remove {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the pricing override to remove. */
      @SerializedName("id")
      Object id;

      private Remove(Map<String, Object> extraParams, Object id) {
        this.extraParams = extraParams;
        this.id = id;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object id;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingOverrideAction.Remove build() {
          return new ContractUpdateParams.PricingOverrideAction.Remove(this.extraParams, this.id);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Remove#extraParams} for the
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
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Remove#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing override to remove. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing override to remove. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Update {
      /** The updated end time for the pricing override. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the pricing override. */
      @SerializedName("id")
      Object id;

      /** The updated start time for the pricing override. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private Update(EndsAt endsAt, Map<String, Object> extraParams, Object id, StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.id = id;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Object id;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingOverrideAction.Update build() {
          return new ContractUpdateParams.PricingOverrideAction.Update(
              this.endsAt, this.extraParams, this.id, this.startsAt);
        }

        /** The updated end time for the pricing override. */
        public Builder setEndsAt(ContractUpdateParams.PricingOverrideAction.Update.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Update#extraParams} for the
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
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Update#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing override. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the pricing override. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /** The updated start time for the pricing override. */
        public Builder setStartsAt(
            ContractUpdateParams.PricingOverrideAction.Update.StartsAt startsAt) {
          this.startsAt = startsAt;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of end time to apply. */
        @SerializedName("type")
        Type type;

        private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Update.EndsAt build() {
            return new ContractUpdateParams.PricingOverrideAction.Update.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Update.EndsAt#extraParams}
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
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Update.EndsAt#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item ends. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of end time to apply. */
          public Builder setType(
              ContractUpdateParams.PricingOverrideAction.Update.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_end")
          BILLING_PERIOD_END("billing_period_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> The type of start time to apply. */
        @SerializedName("type")
        Type type;

        private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Instant timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Update.StartsAt build() {
            return new ContractUpdateParams.PricingOverrideAction.Update.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Update.StartsAt#extraParams}
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
           * map. See {@link ContractUpdateParams.PricingOverrideAction.Update.StartsAt#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The timestamp when the item starts. */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of start time to apply. */
          public Builder setType(
              ContractUpdateParams.PricingOverrideAction.Update.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("billing_period_start")
          BILLING_PERIOD_START("billing_period_start"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("add")
      ADD("add"),

      @SerializedName("remove")
      REMOVE("remove"),

      @SerializedName("update")
      UPDATE("update");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("contract_line_details")
    CONTRACT_LINE_DETAILS("contract_line_details"),

    @SerializedName("license_quantities")
    LICENSE_QUANTITIES("license_quantities"),

    @SerializedName("one_time_fees")
    ONE_TIME_FEES("one_time_fees"),

    @SerializedName("pricing_lines")
    PRICING_LINES("pricing_lines"),

    @SerializedName("pricing_overrides")
    PRICING_OVERRIDES("pricing_overrides");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
