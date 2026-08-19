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

  /** Set of key-value pairs. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** Pricing line actions to apply. */
  @SerializedName("pricing_line_actions")
  List<ContractUpdateParams.PricingLineAction> pricingLineActions;

  /** Pricing override actions to apply. */
  @SerializedName("pricing_override_actions")
  List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions;

  private ContractUpdateParams(
      Map<String, Object> extraParams,
      List<ContractUpdateParams.Include> include,
      Map<String, Object> metadata,
      List<ContractUpdateParams.PricingLineAction> pricingLineActions,
      List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions) {
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.pricingLineActions = pricingLineActions;
    this.pricingOverrideActions = pricingOverrideActions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<ContractUpdateParams.Include> include;

    private Map<String, Object> metadata;

    private List<ContractUpdateParams.PricingLineAction> pricingLineActions;

    private List<ContractUpdateParams.PricingOverrideAction> pricingOverrideActions;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractUpdateParams build() {
      return new ContractUpdateParams(
          this.extraParams,
          this.include,
          this.metadata,
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
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
  public static class PricingLineAction {
    /** Add a pricing line. */
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

    /** Remove a pricing line. */
    @SerializedName("remove")
    Remove remove;

    /** <strong>Required.</strong> The type of pricing line action. */
    @SerializedName("type")
    Type type;

    /** Update a pricing line. */
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

      /** Add a pricing line. */
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

      /** Remove a pricing line. */
      public Builder setRemove(ContractUpdateParams.PricingLineAction.Remove remove) {
        this.remove = remove;
        return this;
      }

      /** <strong>Required.</strong> The type of pricing line action. */
      public Builder setType(ContractUpdateParams.PricingLineAction.Type type) {
        this.type = type;
        return this;
      }

      /** Update a pricing line. */
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

        /** The timestamp when the pricing ends. */
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

          /** The timestamp when the pricing ends. */
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

          /** <strong>Required.</strong> The id of the price. */
          @SerializedName("price")
          Object price;

          /** Pricing overrides embedded directly on this pricing line. */
          @SerializedName("pricing_overrides")
          List<ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride>
              pricingOverrides;

          /**
           * Quantity changes for the pricing line. For now, at most one entry is allowed. A
           * quantity change clears all future quantity changes on this pricing line. Defaults to 1.
           */
          @SerializedName("quantity_changes")
          List<ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange>
              quantityChanges;

          private PriceDetails(
              Map<String, Object> extraParams,
              Object price,
              List<ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride>
                  pricingOverrides,
              List<ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange>
                  quantityChanges) {
            this.extraParams = extraParams;
            this.price = price;
            this.pricingOverrides = pricingOverrides;
            this.quantityChanges = quantityChanges;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object price;

            private List<
                    ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride>
                pricingOverrides;

            private List<
                    ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange>
                quantityChanges;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails build() {
              return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails(
                  this.extraParams, this.price, this.pricingOverrides, this.quantityChanges);
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

            /** <strong>Required.</strong> The id of the price. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }

            /** <strong>Required.</strong> The id of the price. */
            public Builder setPrice(EmptyParam price) {
              this.price = price;
              return this;
            }

            /**
             * Add an element to `pricingOverrides` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#pricingOverrides} for
             * the field documentation.
             */
            public Builder addPricingOverride(
                ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                    element) {
              if (this.pricingOverrides == null) {
                this.pricingOverrides = new ArrayList<>();
              }
              this.pricingOverrides.add(element);
              return this;
            }

            /**
             * Add all elements to `pricingOverrides` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#pricingOverrides} for
             * the field documentation.
             */
            public Builder addAllPricingOverride(
                List<
                        ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                            .PricingOverride>
                    elements) {
              if (this.pricingOverrides == null) {
                this.pricingOverrides = new ArrayList<>();
              }
              this.pricingOverrides.addAll(elements);
              return this;
            }

            /**
             * Add an element to `quantityChanges` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#quantityChanges} for
             * the field documentation.
             */
            public Builder addQuantityChange(
                ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange
                    element) {
              if (this.quantityChanges == null) {
                this.quantityChanges = new ArrayList<>();
              }
              this.quantityChanges.add(element);
              return this;
            }

            /**
             * Add all elements to `quantityChanges` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails#quantityChanges} for
             * the field documentation.
             */
            public Builder addAllQuantityChange(
                List<ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange>
                    elements) {
              if (this.quantityChanges == null) {
                this.quantityChanges = new ArrayList<>();
              }
              this.quantityChanges.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class PricingOverride {
            /** When the override ends. Defaults to the pricing line's end if not specified. */
            @SerializedName("ends_at")
            EndsAt endsAt;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A user-provided lookup key to reference this override. */
            @SerializedName("lookup_key")
            Object lookupKey;

            /** Set of key-value pairs that you can attach to an object. */
            @SerializedName("metadata")
            Map<String, String> metadata;

            /**
             * Parameters for the overwrite_price override. Required if {@code type} is {@code
             * overwrite_price}.
             */
            @SerializedName("overwrite_price")
            OverwritePrice overwritePrice;

            /**
             * The priority of this override relative to others. 0 is highest, 100 is lowest.
             * Defaults to 50.
             */
            @SerializedName("priority")
            Long priority;

            /** When the override starts. Defaults to the pricing line's start if not specified. */
            @SerializedName("starts_at")
            StartsAt startsAt;

            /** <strong>Required.</strong> The type of override. */
            @SerializedName("type")
            Type type;

            private PricingOverride(
                EndsAt endsAt,
                Map<String, Object> extraParams,
                Object lookupKey,
                Map<String, String> metadata,
                OverwritePrice overwritePrice,
                Long priority,
                StartsAt startsAt,
                Type type) {
              this.endsAt = endsAt;
              this.extraParams = extraParams;
              this.lookupKey = lookupKey;
              this.metadata = metadata;
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

              private Map<String, String> metadata;

              private OverwritePrice overwritePrice;

              private Long priority;

              private StartsAt startsAt;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                  build() {
                return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                    .PricingOverride(
                    this.endsAt,
                    this.extraParams,
                    this.lookupKey,
                    this.metadata,
                    this.overwritePrice,
                    this.priority,
                    this.startsAt,
                    this.type);
              }

              /** When the override ends. Defaults to the pricing line's end if not specified. */
              public Builder setEndsAt(
                  ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                          .EndsAt
                      endsAt) {
                this.endsAt = endsAt;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride#extraParams}
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
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** A user-provided lookup key to reference this override. */
              public Builder setLookupKey(String lookupKey) {
                this.lookupKey = lookupKey;
                return this;
              }

              /** A user-provided lookup key to reference this override. */
              public Builder setLookupKey(EmptyParam lookupKey) {
                this.lookupKey = lookupKey;
                return this;
              }

              /**
               * Add a key/value pair to `metadata` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride#metadata}
               * for the field documentation.
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
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride#metadata}
               * for the field documentation.
               */
              public Builder putAllMetadata(Map<String, String> map) {
                if (this.metadata == null) {
                  this.metadata = new HashMap<>();
                }
                this.metadata.putAll(map);
                return this;
              }

              /**
               * Parameters for the overwrite_price override. Required if {@code type} is {@code
               * overwrite_price}.
               */
              public Builder setOverwritePrice(
                  ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                          .OverwritePrice
                      overwritePrice) {
                this.overwritePrice = overwritePrice;
                return this;
              }

              /**
               * The priority of this override relative to others. 0 is highest, 100 is lowest.
               * Defaults to 50.
               */
              public Builder setPriority(Long priority) {
                this.priority = priority;
                return this;
              }

              /**
               * When the override starts. Defaults to the pricing line's start if not specified.
               */
              public Builder setStartsAt(
                  ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                          .StartsAt
                      startsAt) {
                this.startsAt = startsAt;
                return this;
              }

              /** <strong>Required.</strong> The type of override. */
              public Builder setType(
                  ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EndsAt {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * The timestamp when the item ends. Required if {@code type} is {@code timestamp}.
               */
              @SerializedName("timestamp")
              Instant timestamp;

              /** <strong>Required.</strong> The type of the ends_at. */
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
                public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                        .PricingOverride.EndsAt
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                      .PricingOverride.EndsAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.EndsAt#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.EndsAt#extraParams}
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
                 * The timestamp when the item ends. Required if {@code type} is {@code timestamp}.
                 */
                public Builder setTimestamp(Instant timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /** <strong>Required.</strong> The type of the ends_at. */
                public Builder setType(
                    ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                            .EndsAt.Type
                        type) {
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
            public static class OverwritePrice {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * The per-unit amount to be charged, represented as a decimal string in minor
               * currency units.
               */
              @SerializedName("unit_amount")
              Object unitAmount;

              private OverwritePrice(Map<String, Object> extraParams, Object unitAmount) {
                this.extraParams = extraParams;
                this.unitAmount = unitAmount;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private Object unitAmount;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                        .PricingOverride.OverwritePrice
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                      .PricingOverride.OverwritePrice(this.extraParams, this.unitAmount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.OverwritePrice#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.OverwritePrice#extraParams}
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
                 * The per-unit amount to be charged, represented as a decimal string in minor
                 * currency units.
                 */
                public Builder setUnitAmount(String unitAmount) {
                  this.unitAmount = unitAmount;
                  return this;
                }

                /**
                 * The per-unit amount to be charged, represented as a decimal string in minor
                 * currency units.
                 */
                public Builder setUnitAmount(EmptyParam unitAmount) {
                  this.unitAmount = unitAmount;
                  return this;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class StartsAt {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
               */
              @SerializedName("timestamp")
              Instant timestamp;

              /** <strong>Required.</strong> The type of the starts_at. */
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
                public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                        .PricingOverride.StartsAt
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                      .PricingOverride.StartsAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.StartsAt#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride.StartsAt#extraParams}
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
                 * The timestamp when the item starts. Required if {@code type} is {@code
                 * timestamp}.
                 */
                public Builder setTimestamp(Instant timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /** <strong>Required.</strong> The type of the starts_at. */
                public Builder setType(
                    ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.PricingOverride
                            .StartsAt.Type
                        type) {
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

            public enum Type implements ApiRequestParams.EnumParam {
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
          public static class QuantityChange {
            /** <strong>Required.</strong> When this quantity change takes effect. */
            @SerializedName("effective_at")
            EffectiveAt effectiveAt;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The quantity to set. */
            @SerializedName("set")
            Object set;

            private QuantityChange(
                EffectiveAt effectiveAt, Map<String, Object> extraParams, Object set) {
              this.effectiveAt = effectiveAt;
              this.extraParams = extraParams;
              this.set = set;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private EffectiveAt effectiveAt;

              private Map<String, Object> extraParams;

              private Object set;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange
                  build() {
                return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                    .QuantityChange(this.effectiveAt, this.extraParams, this.set);
              }

              /** <strong>Required.</strong> When this quantity change takes effect. */
              public Builder setEffectiveAt(
                  ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange
                          .EffectiveAt
                      effectiveAt) {
                this.effectiveAt = effectiveAt;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange#extraParams}
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
               * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The quantity to set. */
              public Builder setSet(BigDecimal set) {
                this.set = set;
                return this;
              }

              /** <strong>Required.</strong> The quantity to set. */
              public Builder setSet(EmptyParam set) {
                this.set = set;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EffectiveAt {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
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
                public ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                        .QuantityChange.EffectiveAt
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails
                      .QuantityChange.EffectiveAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
                 * for the field documentation.
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
                public Builder setType(
                    ContractUpdateParams.PricingLineAction.Add.Pricing.PriceDetails.QuantityChange
                            .EffectiveAt.Type
                        type) {
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

        /** The timestamp when the pricing starts. */
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

          /** The timestamp when the pricing starts. */
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

      /** <strong>Required.</strong> The id of the pricing line to remove. */
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

        /** <strong>Required.</strong> The id of the pricing line to remove. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The id of the pricing line to remove. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Update {
      /** Updated end time. */
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

      /** <strong>Required.</strong> The id of the pricing line. */
      @SerializedName("id")
      Object id;

      /** Metadata mutations to apply to the pricing line. */
      @SerializedName("metadata")
      Map<String, Object> metadata;

      /** Updated pricing configuration. */
      @SerializedName("pricing")
      Pricing pricing;

      /** Updated start time. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private Update(
          EndsAt endsAt,
          Map<String, Object> extraParams,
          Object id,
          Map<String, Object> metadata,
          Pricing pricing,
          StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.id = id;
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

        private Object id;

        private Map<String, Object> metadata;

        private Pricing pricing;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingLineAction.Update build() {
          return new ContractUpdateParams.PricingLineAction.Update(
              this.endsAt, this.extraParams, this.id, this.metadata, this.pricing, this.startsAt);
        }

        /** Updated end time. */
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

        /** <strong>Required.</strong> The id of the pricing line. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The id of the pricing line. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingLineAction.Update#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingLineAction.Update#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, EmptyParam value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. Map values can only be one of the following types: `String`, `EmptyParam`. See
         * {@link ContractUpdateParams.PricingLineAction.Update#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, Object> map) {
          if (!map.values().stream()
              .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
            throw new IllegalArgumentException(
                "All map values must one of the following types: String, EmptyParam");
          }
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** Updated pricing configuration. */
        public Builder setPricing(ContractUpdateParams.PricingLineAction.Update.Pricing pricing) {
          this.pricing = pricing;
          return this;
        }

        /** Updated start time. */
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

        /** The timestamp when the pricing ends. */
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

          /** The timestamp when the pricing ends. */
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

        /** V1 price details. Present when the pricing line type is {@code price}. */
        @SerializedName("price_details")
        PriceDetails priceDetails;

        private Pricing(Map<String, Object> extraParams, PriceDetails priceDetails) {
          this.extraParams = extraParams;
          this.priceDetails = priceDetails;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PriceDetails priceDetails;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingLineAction.Update.Pricing build() {
            return new ContractUpdateParams.PricingLineAction.Update.Pricing(
                this.extraParams, this.priceDetails);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.Pricing#extraParams} for
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
           * map. See {@link ContractUpdateParams.PricingLineAction.Update.Pricing#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** V1 price details. Present when the pricing line type is {@code price}. */
          public Builder setPriceDetails(
              ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails priceDetails) {
            this.priceDetails = priceDetails;
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

          /** Pricing override actions to apply to the overrides embedded on this pricing line. */
          @SerializedName("pricing_override_actions")
          List<
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .PricingOverrideAction>
              pricingOverrideActions;

          /**
           * Quantity changes for the pricing line. Setting this clears all future quantity changes.
           */
          @SerializedName("quantity_changes")
          List<ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange>
              quantityChanges;

          private PriceDetails(
              Map<String, Object> extraParams,
              List<
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction>
                  pricingOverrideActions,
              List<
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .QuantityChange>
                  quantityChanges) {
            this.extraParams = extraParams;
            this.pricingOverrideActions = pricingOverrideActions;
            this.quantityChanges = quantityChanges;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction>
                pricingOverrideActions;

            private List<
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .QuantityChange>
                quantityChanges;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails build() {
              return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails(
                  this.extraParams, this.pricingOverrideActions, this.quantityChanges);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#extraParams} for
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
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#extraParams} for
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
             * Add an element to `pricingOverrideActions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#pricingOverrideActions}
             * for the field documentation.
             */
            public Builder addPricingOverrideAction(
                ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction
                    element) {
              if (this.pricingOverrideActions == null) {
                this.pricingOverrideActions = new ArrayList<>();
              }
              this.pricingOverrideActions.add(element);
              return this;
            }

            /**
             * Add all elements to `pricingOverrideActions` list. A list is initialized for the
             * first `add/addAll` call, and subsequent calls adds additional elements to the
             * original list. See {@link
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#pricingOverrideActions}
             * for the field documentation.
             */
            public Builder addAllPricingOverrideAction(
                List<
                        ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction>
                    elements) {
              if (this.pricingOverrideActions == null) {
                this.pricingOverrideActions = new ArrayList<>();
              }
              this.pricingOverrideActions.addAll(elements);
              return this;
            }

            /**
             * Add an element to `quantityChanges` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#quantityChanges}
             * for the field documentation.
             */
            public Builder addQuantityChange(
                ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange
                    element) {
              if (this.quantityChanges == null) {
                this.quantityChanges = new ArrayList<>();
              }
              this.quantityChanges.add(element);
              return this;
            }

            /**
             * Add all elements to `quantityChanges` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails#quantityChanges}
             * for the field documentation.
             */
            public Builder addAllQuantityChange(
                List<
                        ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .QuantityChange>
                    elements) {
              if (this.quantityChanges == null) {
                this.quantityChanges = new ArrayList<>();
              }
              this.quantityChanges.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class PricingOverrideAction {
            /** Add a pricing line override. */
            @SerializedName("add")
            Add add;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Remove a pricing line override. */
            @SerializedName("remove")
            Remove remove;

            /** <strong>Required.</strong> The type of pricing line override action. */
            @SerializedName("type")
            Type type;

            /** Update a pricing line override. */
            @SerializedName("update")
            InnerUpdate update;

            private PricingOverrideAction(
                Add add,
                Map<String, Object> extraParams,
                Remove remove,
                Type type,
                InnerUpdate update) {
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

              private InnerUpdate update;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .PricingOverrideAction
                  build() {
                return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                    .PricingOverrideAction(
                    this.add, this.extraParams, this.remove, this.type, this.update);
              }

              /** Add a pricing line override. */
              public Builder setAdd(
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Add
                      add) {
                this.add = add;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction#extraParams}
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
               * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Remove a pricing line override. */
              public Builder setRemove(
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Remove
                      remove) {
                this.remove = remove;
                return this;
              }

              /** <strong>Required.</strong> The type of pricing line override action. */
              public Builder setType(
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Type
                      type) {
                this.type = type;
                return this;
              }

              /** Update a pricing line override. */
              public Builder setUpdate(
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.InnerUpdate
                      update) {
                this.update = update;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Add {
              /** <strong>Required.</strong> The end time for the override. */
              @SerializedName("ends_at")
              EndsAt endsAt;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** A lookup key for the override. */
              @SerializedName("lookup_key")
              Object lookupKey;

              /** Metadata for the pricing override. */
              @SerializedName("metadata")
              Map<String, String> metadata;

              /**
               * Parameters for an overwrite_price override. Required if {@code type} is {@code
               * overwrite_price}.
               */
              @SerializedName("overwrite_price")
              OverwritePrice overwritePrice;

              /**
               * The priority of this override relative to others. 0 is highest, 100 is lowest.
               * Defaults to 50.
               */
              @SerializedName("priority")
              Long priority;

              /** <strong>Required.</strong> The start time for the override. */
              @SerializedName("starts_at")
              StartsAt startsAt;

              /** <strong>Required.</strong> The type of override to add. */
              @SerializedName("type")
              Type type;

              private Add(
                  EndsAt endsAt,
                  Map<String, Object> extraParams,
                  Object lookupKey,
                  Map<String, String> metadata,
                  OverwritePrice overwritePrice,
                  Long priority,
                  StartsAt startsAt,
                  Type type) {
                this.endsAt = endsAt;
                this.extraParams = extraParams;
                this.lookupKey = lookupKey;
                this.metadata = metadata;
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

                private Map<String, String> metadata;

                private OverwritePrice overwritePrice;

                private Long priority;

                private StartsAt startsAt;

                private Type type;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.Add
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .PricingOverrideAction.Add(
                      this.endsAt,
                      this.extraParams,
                      this.lookupKey,
                      this.metadata,
                      this.overwritePrice,
                      this.priority,
                      this.startsAt,
                      this.type);
                }

                /** <strong>Required.</strong> The end time for the override. */
                public Builder setEndsAt(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.Add.EndsAt
                        endsAt) {
                  this.endsAt = endsAt;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** A lookup key for the override. */
                public Builder setLookupKey(String lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
                }

                /** A lookup key for the override. */
                public Builder setLookupKey(EmptyParam lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
                }

                /**
                 * Add a key/value pair to `metadata` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add#metadata}
                 * for the field documentation.
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
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add#metadata}
                 * for the field documentation.
                 */
                public Builder putAllMetadata(Map<String, String> map) {
                  if (this.metadata == null) {
                    this.metadata = new HashMap<>();
                  }
                  this.metadata.putAll(map);
                  return this;
                }

                /**
                 * Parameters for an overwrite_price override. Required if {@code type} is {@code
                 * overwrite_price}.
                 */
                public Builder setOverwritePrice(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.Add.OverwritePrice
                        overwritePrice) {
                  this.overwritePrice = overwritePrice;
                  return this;
                }

                /**
                 * The priority of this override relative to others. 0 is highest, 100 is lowest.
                 * Defaults to 50.
                 */
                public Builder setPriority(Long priority) {
                  this.priority = priority;
                  return this;
                }

                /** <strong>Required.</strong> The start time for the override. */
                public Builder setStartsAt(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.Add.StartsAt
                        startsAt) {
                  this.startsAt = startsAt;
                  return this;
                }

                /** <strong>Required.</strong> The type of override to add. */
                public Builder setType(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.Add.Type
                        type) {
                  this.type = type;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class EndsAt {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The timestamp when the pricing ends. */
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
                  public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Add.EndsAt
                      build() {
                    return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.Add.EndsAt(
                        this.extraParams, this.timestamp, this.type);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.EndsAt#extraParams}
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
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.EndsAt#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The timestamp when the pricing ends. */
                  public Builder setTimestamp(Instant timestamp) {
                    this.timestamp = timestamp;
                    return this;
                  }

                  /** <strong>Required.</strong> The type of end time to apply. */
                  public Builder setType(
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                              .PricingOverrideAction.Add.EndsAt.Type
                          type) {
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
              public static class OverwritePrice {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /**
                 * The per-unit amount to be charged, represented as a decimal string in minor
                 * currency units.
                 */
                @SerializedName("unit_amount")
                Object unitAmount;

                private OverwritePrice(Map<String, Object> extraParams, Object unitAmount) {
                  this.extraParams = extraParams;
                  this.unitAmount = unitAmount;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private Object unitAmount;

                  /** Finalize and obtain parameter instance from this builder. */
                  public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Add.OverwritePrice
                      build() {
                    return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.Add.OverwritePrice(
                        this.extraParams, this.unitAmount);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.OverwritePrice#extraParams}
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
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.OverwritePrice#extraParams}
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
                   * The per-unit amount to be charged, represented as a decimal string in minor
                   * currency units.
                   */
                  public Builder setUnitAmount(String unitAmount) {
                    this.unitAmount = unitAmount;
                    return this;
                  }

                  /**
                   * The per-unit amount to be charged, represented as a decimal string in minor
                   * currency units.
                   */
                  public Builder setUnitAmount(EmptyParam unitAmount) {
                    this.unitAmount = unitAmount;
                    return this;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class StartsAt {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The timestamp when the pricing starts. */
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
                  public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.Add.StartsAt
                      build() {
                    return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.Add.StartsAt(
                        this.extraParams, this.timestamp, this.type);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.StartsAt#extraParams}
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
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Add.StartsAt#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The timestamp when the pricing starts. */
                  public Builder setTimestamp(Instant timestamp) {
                    this.timestamp = timestamp;
                    return this;
                  }

                  /** <strong>Required.</strong> The type of start time to apply. */
                  public Builder setType(
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                              .PricingOverrideAction.Add.StartsAt.Type
                          type) {
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

              public enum Type implements ApiRequestParams.EnumParam {
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
            public static class InnerUpdate {
              /** Updated end time. */
              @SerializedName("ends_at")
              EndsAt endsAt;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The id of the pricing override to update. */
              @SerializedName("id")
              Object id;

              /** Updated lookup key. */
              @SerializedName("lookup_key")
              Object lookupKey;

              /** Metadata mutations to apply to the pricing override. */
              @SerializedName("metadata")
              Map<String, Object> metadata;

              /** Updated start time. */
              @SerializedName("starts_at")
              StartsAt startsAt;

              private InnerUpdate(
                  EndsAt endsAt,
                  Map<String, Object> extraParams,
                  Object id,
                  Object lookupKey,
                  Map<String, Object> metadata,
                  StartsAt startsAt) {
                this.endsAt = endsAt;
                this.extraParams = extraParams;
                this.id = id;
                this.lookupKey = lookupKey;
                this.metadata = metadata;
                this.startsAt = startsAt;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private EndsAt endsAt;

                private Map<String, Object> extraParams;

                private Object id;

                private Object lookupKey;

                private Map<String, Object> metadata;

                private StartsAt startsAt;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.InnerUpdate
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .PricingOverrideAction.InnerUpdate(
                      this.endsAt,
                      this.extraParams,
                      this.id,
                      this.lookupKey,
                      this.metadata,
                      this.startsAt);
                }

                /** Updated end time. */
                public Builder setEndsAt(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.InnerUpdate.EndsAt
                        endsAt) {
                  this.endsAt = endsAt;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The id of the pricing override to update. */
                public Builder setId(String id) {
                  this.id = id;
                  return this;
                }

                /** The id of the pricing override to update. */
                public Builder setId(EmptyParam id) {
                  this.id = id;
                  return this;
                }

                /** Updated lookup key. */
                public Builder setLookupKey(String lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
                }

                /** Updated lookup key. */
                public Builder setLookupKey(EmptyParam lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
                }

                /**
                 * Add a key/value pair to `metadata` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate#metadata}
                 * for the field documentation.
                 */
                public Builder putMetadata(String key, String value) {
                  if (this.metadata == null) {
                    this.metadata = new HashMap<>();
                  }
                  this.metadata.put(key, value);
                  return this;
                }

                /**
                 * Add a key/value pair to `metadata` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate#metadata}
                 * for the field documentation.
                 */
                public Builder putMetadata(String key, EmptyParam value) {
                  if (this.metadata == null) {
                    this.metadata = new HashMap<>();
                  }
                  this.metadata.put(key, value);
                  return this;
                }

                /**
                 * Add all map key/value pairs to `metadata` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. Map values can only be one of the following types: `String`,
                 * `EmptyParam`. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate#metadata}
                 * for the field documentation.
                 */
                public Builder putAllMetadata(Map<String, Object> map) {
                  if (!map.values().stream()
                      .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
                    throw new IllegalArgumentException(
                        "All map values must one of the following types: String, EmptyParam");
                  }
                  if (this.metadata == null) {
                    this.metadata = new HashMap<>();
                  }
                  this.metadata.putAll(map);
                  return this;
                }

                /** Updated start time. */
                public Builder setStartsAt(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .PricingOverrideAction.InnerUpdate.StartsAt
                        startsAt) {
                  this.startsAt = startsAt;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class EndsAt {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The timestamp when the pricing ends. */
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
                  public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.InnerUpdate.EndsAt
                      build() {
                    return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.InnerUpdate.EndsAt(
                        this.extraParams, this.timestamp, this.type);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate.EndsAt#extraParams}
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
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate.EndsAt#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The timestamp when the pricing ends. */
                  public Builder setTimestamp(Instant timestamp) {
                    this.timestamp = timestamp;
                    return this;
                  }

                  /** <strong>Required.</strong> The type of end time to apply. */
                  public Builder setType(
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                              .PricingOverrideAction.InnerUpdate.EndsAt.Type
                          type) {
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
              public static class StartsAt {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The timestamp when the pricing starts. */
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
                  public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                          .PricingOverrideAction.InnerUpdate.StartsAt
                      build() {
                    return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.InnerUpdate.StartsAt(
                        this.extraParams, this.timestamp, this.type);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate.StartsAt#extraParams}
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
                   * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.InnerUpdate.StartsAt#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The timestamp when the pricing starts. */
                  public Builder setTimestamp(Instant timestamp) {
                    this.timestamp = timestamp;
                    return this;
                  }

                  /** <strong>Required.</strong> The type of start time to apply. */
                  public Builder setType(
                      ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                              .PricingOverrideAction.InnerUpdate.StartsAt.Type
                          type) {
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
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Remove {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The id of the pricing override to remove. */
              @SerializedName("id")
              Object id;

              /** Lookup key of the override to remove. */
              @SerializedName("lookup_key")
              Object lookupKey;

              private Remove(Map<String, Object> extraParams, Object id, Object lookupKey) {
                this.extraParams = extraParams;
                this.id = id;
                this.lookupKey = lookupKey;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private Object id;

                private Object lookupKey;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .PricingOverrideAction.Remove
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .PricingOverrideAction.Remove(this.extraParams, this.id, this.lookupKey);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Remove#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.PricingOverrideAction.Remove#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The id of the pricing override to remove. */
                public Builder setId(String id) {
                  this.id = id;
                  return this;
                }

                /** The id of the pricing override to remove. */
                public Builder setId(EmptyParam id) {
                  this.id = id;
                  return this;
                }

                /** Lookup key of the override to remove. */
                public Builder setLookupKey(String lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
                }

                /** Lookup key of the override to remove. */
                public Builder setLookupKey(EmptyParam lookupKey) {
                  this.lookupKey = lookupKey;
                  return this;
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
          public static class QuantityChange {
            /** <strong>Required.</strong> When this quantity change takes effect. */
            @SerializedName("effective_at")
            EffectiveAt effectiveAt;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The quantity to set. */
            @SerializedName("set")
            Object set;

            private QuantityChange(
                EffectiveAt effectiveAt, Map<String, Object> extraParams, Object set) {
              this.effectiveAt = effectiveAt;
              this.extraParams = extraParams;
              this.set = set;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private EffectiveAt effectiveAt;

              private Map<String, Object> extraParams;

              private Object set;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .QuantityChange
                  build() {
                return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                    .QuantityChange(this.effectiveAt, this.extraParams, this.set);
              }

              /** <strong>Required.</strong> When this quantity change takes effect. */
              public Builder setEffectiveAt(
                  ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange
                          .EffectiveAt
                      effectiveAt) {
                this.effectiveAt = effectiveAt;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange#extraParams}
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
               * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The quantity to set. */
              public Builder setSet(BigDecimal set) {
                this.set = set;
                return this;
              }

              /** <strong>Required.</strong> The quantity to set. */
              public Builder setSet(EmptyParam set) {
                this.set = set;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EffectiveAt {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
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
                public ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                        .QuantityChange.EffectiveAt
                    build() {
                  return new ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                      .QuantityChange.EffectiveAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
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
                 * ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
                 * for the field documentation.
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
                public Builder setType(
                    ContractUpdateParams.PricingLineAction.Update.Pricing.PriceDetails
                            .QuantityChange.EffectiveAt.Type
                        type) {
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

        /** The timestamp when the pricing starts. */
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

          /** The timestamp when the pricing starts. */
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
    /** Add a pricing override. */
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

    /** Remove a pricing override. */
    @SerializedName("remove")
    Remove remove;

    /** <strong>Required.</strong> The type of pricing override action. */
    @SerializedName("type")
    Type type;

    /** Update a pricing override. */
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

      /** Add a pricing override. */
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

      /** Remove a pricing override. */
      public Builder setRemove(ContractUpdateParams.PricingOverrideAction.Remove remove) {
        this.remove = remove;
        return this;
      }

      /** <strong>Required.</strong> The type of pricing override action. */
      public Builder setType(ContractUpdateParams.PricingOverrideAction.Type type) {
        this.type = type;
        return this;
      }

      /** Update a pricing override. */
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

      /** Metadata for the pricing override. */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** A multiply_pricing override to add. */
      @SerializedName("multiply_pricing")
      MultiplyPricing multiplyPricing;

      /** An overwrite price override to add. */
      @SerializedName("overwrite_price")
      OverwritePrice overwritePrice;

      /** The priority for the pricing override. The highest priority is 0 and the lowest is 100. */
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
          Map<String, String> metadata,
          MultiplyPricing multiplyPricing,
          OverwritePrice overwritePrice,
          Long priority,
          StartsAt startsAt,
          Type type) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.lookupKey = lookupKey;
        this.metadata = metadata;
        this.multiplyPricing = multiplyPricing;
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

        private Map<String, String> metadata;

        private MultiplyPricing multiplyPricing;

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
              this.metadata,
              this.multiplyPricing,
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

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingOverrideAction.Add#metadata} for the field documentation.
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
         * map. See {@link ContractUpdateParams.PricingOverrideAction.Add#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** A multiply_pricing override to add. */
        public Builder setMultiplyPricing(
            ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing multiplyPricing) {
          this.multiplyPricing = multiplyPricing;
          return this;
        }

        /** An overwrite price override to add. */
        public Builder setOverwritePrice(
            ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice overwritePrice) {
          this.overwritePrice = overwritePrice;
          return this;
        }

        /**
         * The priority for the pricing override. The highest priority is 0 and the lowest is 100.
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

        /** The timestamp when the pricing ends. */
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

          /** The timestamp when the pricing ends. */
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
      public static class MultiplyPricing {
        /**
         * <strong>Required.</strong> Criteria determining which rates the multiply_pricing override
         * applies to.
         */
        @SerializedName("criteria")
        List<ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion> criteria;

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
         * <strong>Required.</strong> The multiply_pricing factor, represented as a decimal string.
         * e.g. &quot;0.8&quot; for a 20% reduction.
         */
        @SerializedName("factor")
        Object factor;

        private MultiplyPricing(
            List<ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion> criteria,
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
          private List<ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion>
              criteria;

          private Map<String, Object> extraParams;

          private Object factor;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing(
                this.criteria, this.extraParams, this.factor);
          }

          /**
           * Add an element to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing#criteria} for the field
           * documentation.
           */
          public Builder addCriterion(
              ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion element) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.add(element);
            return this;
          }

          /**
           * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing#criteria} for the field
           * documentation.
           */
          public Builder addAllCriterion(
              List<ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion>
                  elements) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing#extraParams} for the
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
           * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing#extraParams} for the
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
           * <strong>Required.</strong> The multiply_pricing factor, represented as a decimal
           * string. e.g. &quot;0.8&quot; for a 20% reduction.
           */
          public Builder setFactor(String factor) {
            this.factor = factor;
            return this;
          }

          /**
           * <strong>Required.</strong> The multiply_pricing factor, represented as a decimal
           * string. e.g. &quot;0.8&quot; for a 20% reduction.
           */
          public Builder setFactor(EmptyParam factor) {
            this.factor = factor;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Criterion {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Filter by pricing line IDs. */
          @SerializedName("pricing_line_ids")
          List<String> pricingLineIds;

          /** Filter by pricing line lookup keys. */
          @SerializedName("pricing_line_lookup_keys")
          List<String> pricingLineLookupKeys;

          /**
           * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
           */
          @SerializedName("type")
          Type type;

          private Criterion(
              Map<String, Object> extraParams,
              List<String> pricingLineIds,
              List<String> pricingLineLookupKeys,
              Type type) {
            this.extraParams = extraParams;
            this.pricingLineIds = pricingLineIds;
            this.pricingLineLookupKeys = pricingLineLookupKeys;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> pricingLineIds;

            private List<String> pricingLineLookupKeys;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion
                build() {
              return new ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion(
                  this.extraParams, this.pricingLineIds, this.pricingLineLookupKeys, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#extraParams}
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
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#extraParams}
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
             * Add an element to `pricingLineIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#pricingLineIds}
             * for the field documentation.
             */
            public Builder addPricingLineId(String element) {
              if (this.pricingLineIds == null) {
                this.pricingLineIds = new ArrayList<>();
              }
              this.pricingLineIds.add(element);
              return this;
            }

            /**
             * Add all elements to `pricingLineIds` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#pricingLineIds}
             * for the field documentation.
             */
            public Builder addAllPricingLineId(List<String> elements) {
              if (this.pricingLineIds == null) {
                this.pricingLineIds = new ArrayList<>();
              }
              this.pricingLineIds.addAll(elements);
              return this;
            }

            /**
             * Add an element to `pricingLineLookupKeys` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#pricingLineLookupKeys}
             * for the field documentation.
             */
            public Builder addPricingLineLookupKey(String element) {
              if (this.pricingLineLookupKeys == null) {
                this.pricingLineLookupKeys = new ArrayList<>();
              }
              this.pricingLineLookupKeys.add(element);
              return this;
            }

            /**
             * Add all elements to `pricingLineLookupKeys` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion#pricingLineLookupKeys}
             * for the field documentation.
             */
            public Builder addAllPricingLineLookupKey(List<String> elements) {
              if (this.pricingLineLookupKeys == null) {
                this.pricingLineLookupKeys = new ArrayList<>();
              }
              this.pricingLineLookupKeys.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> Whether to include or exclude items matching these
             * criteria.
             */
            public Builder setType(
                ContractUpdateParams.PricingOverrideAction.Add.MultiplyPricing.Criterion.Type
                    type) {
              this.type = type;
              return this;
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

        /**
         * The per-unit amount to be charged, represented as a decimal string in minor currency
         * units.
         */
        @SerializedName("unit_amount")
        Object unitAmount;

        private OverwritePrice(Map<String, Object> extraParams, Object unitAmount) {
          this.extraParams = extraParams;
          this.unitAmount = unitAmount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object unitAmount;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice build() {
            return new ContractUpdateParams.PricingOverrideAction.Add.OverwritePrice(
                this.extraParams, this.unitAmount);
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

        /** The timestamp when the pricing starts. */
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

          /** The timestamp when the pricing starts. */
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
        @SerializedName("multiply_pricing")
        MULTIPLY_PRICING("multiply_pricing");

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

      /** <strong>Required.</strong> The id of the pricing override to remove. */
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

        /** <strong>Required.</strong> The id of the pricing override to remove. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The id of the pricing override to remove. */
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

      /** Metadata mutations to apply to the pricing override. */
      @SerializedName("metadata")
      Map<String, Object> metadata;

      /** The updated start time for the pricing override. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private Update(
          EndsAt endsAt,
          Map<String, Object> extraParams,
          Object id,
          Map<String, Object> metadata,
          StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.id = id;
        this.metadata = metadata;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Object id;

        private Map<String, Object> metadata;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.PricingOverrideAction.Update build() {
          return new ContractUpdateParams.PricingOverrideAction.Update(
              this.endsAt, this.extraParams, this.id, this.metadata, this.startsAt);
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

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingOverrideAction.Update#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.PricingOverrideAction.Update#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, EmptyParam value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. Map values can only be one of the following types: `String`, `EmptyParam`. See
         * {@link ContractUpdateParams.PricingOverrideAction.Update#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, Object> map) {
          if (!map.values().stream()
              .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
            throw new IllegalArgumentException(
                "All map values must one of the following types: String, EmptyParam");
          }
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
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

        /** The timestamp when the pricing ends. */
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

          /** The timestamp when the pricing ends. */
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

        /** The timestamp when the pricing starts. */
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

          /** The timestamp when the pricing starts. */
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
    @SerializedName("billing_settings")
    BILLING_SETTINGS("billing_settings"),

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
