// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
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
public class RateCardModifyRatesParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> The list of RateCard rates to create or update. Maximum of 100
   * rates.
   */
  @SerializedName("rates_to_create")
  List<RateCardModifyRatesParams.RatesToCreate> ratesToCreate;

  /** <strong>Required.</strong> The list of RateCard rates to delete. Maximum of 100 rates. */
  @SerializedName("rates_to_delete")
  List<RateCardModifyRatesParams.RatesToDelete> ratesToDelete;

  private RateCardModifyRatesParams(
      Map<String, Object> extraParams,
      List<RateCardModifyRatesParams.RatesToCreate> ratesToCreate,
      List<RateCardModifyRatesParams.RatesToDelete> ratesToDelete) {
    this.extraParams = extraParams;
    this.ratesToCreate = ratesToCreate;
    this.ratesToDelete = ratesToDelete;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<RateCardModifyRatesParams.RatesToCreate> ratesToCreate;

    private List<RateCardModifyRatesParams.RatesToDelete> ratesToDelete;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCardModifyRatesParams build() {
      return new RateCardModifyRatesParams(
          this.extraParams, this.ratesToCreate, this.ratesToDelete);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCardModifyRatesParams#extraParams} for the field documentation.
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
     * See {@link RateCardModifyRatesParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `ratesToCreate` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RateCardModifyRatesParams#ratesToCreate} for the field documentation.
     */
    public Builder addRatesToCreate(RateCardModifyRatesParams.RatesToCreate element) {
      if (this.ratesToCreate == null) {
        this.ratesToCreate = new ArrayList<>();
      }
      this.ratesToCreate.add(element);
      return this;
    }

    /**
     * Add all elements to `ratesToCreate` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RateCardModifyRatesParams#ratesToCreate} for the field documentation.
     */
    public Builder addAllRatesToCreate(List<RateCardModifyRatesParams.RatesToCreate> elements) {
      if (this.ratesToCreate == null) {
        this.ratesToCreate = new ArrayList<>();
      }
      this.ratesToCreate.addAll(elements);
      return this;
    }

    /**
     * Add an element to `ratesToDelete` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RateCardModifyRatesParams#ratesToDelete} for the field documentation.
     */
    public Builder addRatesToDelete(RateCardModifyRatesParams.RatesToDelete element) {
      if (this.ratesToDelete == null) {
        this.ratesToDelete = new ArrayList<>();
      }
      this.ratesToDelete.add(element);
      return this;
    }

    /**
     * Add all elements to `ratesToDelete` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RateCardModifyRatesParams#ratesToDelete} for the field documentation.
     */
    public Builder addAllRatesToDelete(List<RateCardModifyRatesParams.RatesToDelete> elements) {
      if (this.ratesToDelete == null) {
        this.ratesToDelete = new ArrayList<>();
      }
      this.ratesToDelete.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RatesToCreate {
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
     * structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The Metered Item that this rate binds to. Cannot be set if {@code metered_item_data} is
     * provided, and must be set if it isn't.
     */
    @SerializedName("metered_item")
    String meteredItem;

    /**
     * The data to create a metered item that binds to this rate. Cannot be set if {@code
     * metered_item} is provided, and must be set if it isn't.
     */
    @SerializedName("metered_item_data")
    MeteredItemData meteredItemData;

    /**
     * Defines whether the tiered price is graduated or volume-based. In volume-based tiering, the
     * maximum quantity within a period determines the per-unit price. In graduated tiering, the
     * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is
     * set.
     */
    @SerializedName("tiering_mode")
    TieringMode tieringMode;

    /** Each element represents a pricing tier. Cannot be set if {@code unit_amount} is provided. */
    @SerializedName("tiers")
    List<RateCardModifyRatesParams.RatesToCreate.Tier> tiers;

    /**
     * Apply a transformation to the reported usage or set quantity before computing the amount
     * billed.
     */
    @SerializedName("transform_quantity")
    TransformQuantity transformQuantity;

    /**
     * The per-unit amount to be charged, represented as a decimal string in minor currency units
     * with at most 12 decimal places. Cannot be set if {@code tiers} is provided.
     */
    @SerializedName("unit_amount")
    String unitAmount;

    private RatesToCreate(
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        String meteredItem,
        MeteredItemData meteredItemData,
        TieringMode tieringMode,
        List<RateCardModifyRatesParams.RatesToCreate.Tier> tiers,
        TransformQuantity transformQuantity,
        String unitAmount) {
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.meteredItem = meteredItem;
      this.meteredItemData = meteredItemData;
      this.tieringMode = tieringMode;
      this.tiers = tiers;
      this.transformQuantity = transformQuantity;
      this.unitAmount = unitAmount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private String meteredItem;

      private MeteredItemData meteredItemData;

      private TieringMode tieringMode;

      private List<RateCardModifyRatesParams.RatesToCreate.Tier> tiers;

      private TransformQuantity transformQuantity;

      private String unitAmount;

      /** Finalize and obtain parameter instance from this builder. */
      public RateCardModifyRatesParams.RatesToCreate build() {
        return new RateCardModifyRatesParams.RatesToCreate(
            this.extraParams,
            this.metadata,
            this.meteredItem,
            this.meteredItemData,
            this.tieringMode,
            this.tiers,
            this.transformQuantity,
            this.unitAmount);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCardModifyRatesParams.RatesToCreate#extraParams} for the field documentation.
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
       * See {@link RateCardModifyRatesParams.RatesToCreate#extraParams} for the field
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
       * RateCardModifyRatesParams.RatesToCreate#metadata} for the field documentation.
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
       * See {@link RateCardModifyRatesParams.RatesToCreate#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * The Metered Item that this rate binds to. Cannot be set if {@code metered_item_data} is
       * provided, and must be set if it isn't.
       */
      public Builder setMeteredItem(String meteredItem) {
        this.meteredItem = meteredItem;
        return this;
      }

      /**
       * The data to create a metered item that binds to this rate. Cannot be set if {@code
       * metered_item} is provided, and must be set if it isn't.
       */
      public Builder setMeteredItemData(
          RateCardModifyRatesParams.RatesToCreate.MeteredItemData meteredItemData) {
        this.meteredItemData = meteredItemData;
        return this;
      }

      /**
       * Defines whether the tiered price is graduated or volume-based. In volume-based tiering, the
       * maximum quantity within a period determines the per-unit price. In graduated tiering, the
       * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is
       * set.
       */
      public Builder setTieringMode(
          RateCardModifyRatesParams.RatesToCreate.TieringMode tieringMode) {
        this.tieringMode = tieringMode;
        return this;
      }

      /**
       * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * RateCardModifyRatesParams.RatesToCreate#tiers} for the field documentation.
       */
      public Builder addTier(RateCardModifyRatesParams.RatesToCreate.Tier element) {
        if (this.tiers == null) {
          this.tiers = new ArrayList<>();
        }
        this.tiers.add(element);
        return this;
      }

      /**
       * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RateCardModifyRatesParams.RatesToCreate#tiers} for the field documentation.
       */
      public Builder addAllTier(List<RateCardModifyRatesParams.RatesToCreate.Tier> elements) {
        if (this.tiers == null) {
          this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(elements);
        return this;
      }

      /**
       * Apply a transformation to the reported usage or set quantity before computing the amount
       * billed.
       */
      public Builder setTransformQuantity(
          RateCardModifyRatesParams.RatesToCreate.TransformQuantity transformQuantity) {
        this.transformQuantity = transformQuantity;
        return this;
      }

      /**
       * The per-unit amount to be charged, represented as a decimal string in minor currency units
       * with at most 12 decimal places. Cannot be set if {@code tiers} is provided.
       */
      public Builder setUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MeteredItemData {
      /**
       * <strong>Required.</strong> Description that customers see in the invoice line item. Maximum
       * length of 250 characters.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * An internal key you can use to search for a particular metered item. Must be unique among
       * metered items. Maximum length of 200 characters.
       */
      @SerializedName("lookup_key")
      String lookupKey;

      /** <strong>Required.</strong> ID of the Meter that measures usage for this Metered Item. */
      @SerializedName("meter")
      String meter;

      /**
       * <strong>Required.</strong> Optional array of Meter segments to filter event dimension keys
       * for billing.
       */
      @SerializedName("meter_segment_conditions")
      List<RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition>
          meterSegmentConditions;

      /**
       * The unit to use when displaying prices for this billable item in places like Checkout. For
       * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
       * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
       * events&quot;. Maximum length of 100 characters.
       */
      @SerializedName("unit_label")
      String unitLabel;

      private MeteredItemData(
          String displayName,
          Map<String, Object> extraParams,
          String lookupKey,
          String meter,
          List<RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition>
              meterSegmentConditions,
          String unitLabel) {
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.lookupKey = lookupKey;
        this.meter = meter;
        this.meterSegmentConditions = meterSegmentConditions;
        this.unitLabel = unitLabel;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String displayName;

        private Map<String, Object> extraParams;

        private String lookupKey;

        private String meter;

        private List<RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition>
            meterSegmentConditions;

        private String unitLabel;

        /** Finalize and obtain parameter instance from this builder. */
        public RateCardModifyRatesParams.RatesToCreate.MeteredItemData build() {
          return new RateCardModifyRatesParams.RatesToCreate.MeteredItemData(
              this.displayName,
              this.extraParams,
              this.lookupKey,
              this.meter,
              this.meterSegmentConditions,
              this.unitLabel);
        }

        /**
         * <strong>Required.</strong> Description that customers see in the invoice line item.
         * Maximum length of 250 characters.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.MeteredItemData#extraParams} for
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
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.MeteredItemData#extraParams} for
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
         * An internal key you can use to search for a particular metered item. Must be unique among
         * metered items. Maximum length of 200 characters.
         */
        public Builder setLookupKey(String lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /** <strong>Required.</strong> ID of the Meter that measures usage for this Metered Item. */
        public Builder setMeter(String meter) {
          this.meter = meter;
          return this;
        }

        /**
         * Add an element to `meterSegmentConditions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link
         * RateCardModifyRatesParams.RatesToCreate.MeteredItemData#meterSegmentConditions} for the
         * field documentation.
         */
        public Builder addMeterSegmentCondition(
            RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition element) {
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
         * RateCardModifyRatesParams.RatesToCreate.MeteredItemData#meterSegmentConditions} for the
         * field documentation.
         */
        public Builder addAllMeterSegmentCondition(
            List<RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition>
                elements) {
          if (this.meterSegmentConditions == null) {
            this.meterSegmentConditions = new ArrayList<>();
          }
          this.meterSegmentConditions.addAll(elements);
          return this;
        }

        /**
         * The unit to use when displaying prices for this billable item in places like Checkout.
         * For example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price)
         * per CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1
         * million events&quot;. Maximum length of 100 characters.
         */
        public Builder setUnitLabel(String unitLabel) {
          this.unitLabel = unitLabel;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MeterSegmentCondition {
        /** <strong>Required.</strong> A Meter dimension. */
        @SerializedName("dimension")
        String dimension;

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
         * <strong>Required.</strong> To count usage towards this metered item, the dimension must
         * have this value.
         */
        @SerializedName("value")
        String value;

        private MeterSegmentCondition(
            String dimension, Map<String, Object> extraParams, String value) {
          this.dimension = dimension;
          this.extraParams = extraParams;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String dimension;

          private Map<String, Object> extraParams;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition
              build() {
            return new RateCardModifyRatesParams.RatesToCreate.MeteredItemData
                .MeterSegmentCondition(this.dimension, this.extraParams, this.value);
          }

          /** <strong>Required.</strong> A Meter dimension. */
          public Builder setDimension(String dimension) {
            this.dimension = dimension;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition#extraParams}
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
           * RateCardModifyRatesParams.RatesToCreate.MeteredItemData.MeterSegmentCondition#extraParams}
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
           * <strong>Required.</strong> To count usage towards this metered item, the dimension must
           * have this value.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Tier {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Price for the entire tier, represented as a decimal string in minor currency units with at
       * most 12 decimal places.
       */
      @SerializedName("flat_amount")
      String flatAmount;

      /**
       * Per-unit price for units included in this tier, represented as a decimal string in minor
       * currency units with at most 12 decimal places.
       */
      @SerializedName("unit_amount")
      String unitAmount;

      /**
       * Up to and including this quantity is contained in the tier. Only one of {@code
       * up_to_decimal} and {@code up_to_inf} may be set.
       */
      @SerializedName("up_to_decimal")
      BigDecimal upToDecimal;

      /**
       * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may be
       * set.
       */
      @SerializedName("up_to_inf")
      UpToInf upToInf;

      private Tier(
          Map<String, Object> extraParams,
          String flatAmount,
          String unitAmount,
          BigDecimal upToDecimal,
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

        private String flatAmount;

        private String unitAmount;

        private BigDecimal upToDecimal;

        private UpToInf upToInf;

        /** Finalize and obtain parameter instance from this builder. */
        public RateCardModifyRatesParams.RatesToCreate.Tier build() {
          return new RateCardModifyRatesParams.RatesToCreate.Tier(
              this.extraParams, this.flatAmount, this.unitAmount, this.upToDecimal, this.upToInf);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.Tier#extraParams} for the field
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
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.Tier#extraParams} for the field
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
         * Price for the entire tier, represented as a decimal string in minor currency units with
         * at most 12 decimal places.
         */
        public Builder setFlatAmount(String flatAmount) {
          this.flatAmount = flatAmount;
          return this;
        }

        /**
         * Per-unit price for units included in this tier, represented as a decimal string in minor
         * currency units with at most 12 decimal places.
         */
        public Builder setUnitAmount(String unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Up to and including this quantity is contained in the tier. Only one of {@code
         * up_to_decimal} and {@code up_to_inf} may be set.
         */
        public Builder setUpToDecimal(BigDecimal upToDecimal) {
          this.upToDecimal = upToDecimal;
          return this;
        }

        /**
         * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may
         * be set.
         */
        public Builder setUpToInf(RateCardModifyRatesParams.RatesToCreate.Tier.UpToInf upToInf) {
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TransformQuantity {
      /** <strong>Required.</strong> Divide usage by this number. */
      @SerializedName("divide_by")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long divideBy;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> After division, round the result up or down. */
      @SerializedName("round")
      Round round;

      private TransformQuantity(Long divideBy, Map<String, Object> extraParams, Round round) {
        this.divideBy = divideBy;
        this.extraParams = extraParams;
        this.round = round;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long divideBy;

        private Map<String, Object> extraParams;

        private Round round;

        /** Finalize and obtain parameter instance from this builder. */
        public RateCardModifyRatesParams.RatesToCreate.TransformQuantity build() {
          return new RateCardModifyRatesParams.RatesToCreate.TransformQuantity(
              this.divideBy, this.extraParams, this.round);
        }

        /** <strong>Required.</strong> Divide usage by this number. */
        public Builder setDivideBy(Long divideBy) {
          this.divideBy = divideBy;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.TransformQuantity#extraParams}
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
         * map. See {@link RateCardModifyRatesParams.RatesToCreate.TransformQuantity#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> After division, round the result up or down. */
        public Builder setRound(
            RateCardModifyRatesParams.RatesToCreate.TransformQuantity.Round round) {
          this.round = round;
          return this;
        }
      }

      public enum Round implements ApiRequestParams.EnumParam {
        @SerializedName("down")
        DOWN("down"),

        @SerializedName("up")
        UP("up");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Round(String value) {
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
  public static class RatesToDelete {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the RateCard rate to delete. */
    @SerializedName("id")
    String id;

    private RatesToDelete(Map<String, Object> extraParams, String id) {
      this.extraParams = extraParams;
      this.id = id;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      /** Finalize and obtain parameter instance from this builder. */
      public RateCardModifyRatesParams.RatesToDelete build() {
        return new RateCardModifyRatesParams.RatesToDelete(this.extraParams, this.id);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCardModifyRatesParams.RatesToDelete#extraParams} for the field documentation.
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
       * See {@link RateCardModifyRatesParams.RatesToDelete#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the RateCard rate to delete. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }
    }
  }
}
