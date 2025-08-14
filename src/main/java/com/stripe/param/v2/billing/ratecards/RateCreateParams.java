// File generated from our OpenAPI spec
package com.stripe.param.v2.billing.ratecards;

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
public class RateCreateParams extends ApiRequestParams {
  /** The custom pricing unit that this rate binds to. */
  @SerializedName("custom_pricing_unit_amount")
  CustomPricingUnitAmount customPricingUnitAmount;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The MeteredItem that this rate binds to. */
  @SerializedName("metered_item")
  String meteredItem;

  /**
   * The ID of the Price object to take price information from. The Price must have the same
   * interval as the RateCard. Updates to the Price will not be reflected in the RateCard or its
   * rates.
   */
  @SerializedName("price")
  String price;

  /**
   * Defines whether the tiered price should be graduated or volume-based. In volume-based tiering,
   * the maximum quantity within a period determines the per-unit price. In graduated tiering, the
   * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is set.
   */
  @SerializedName("tiering_mode")
  TieringMode tieringMode;

  /** Each element represents a pricing tier. Cannot be set if {@code unit_amount} is provided. */
  @SerializedName("tiers")
  List<RateCreateParams.Tier> tiers;

  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount
   * billed.
   */
  @SerializedName("transform_quantity")
  TransformQuantity transformQuantity;

  /**
   * The per-unit amount to be charged, represented as a decimal string in minor currency units with
   * at most 12 decimal places. Cannot be set if {@code tiers} is provided.
   */
  @SerializedName("unit_amount")
  String unitAmount;

  private RateCreateParams(
      CustomPricingUnitAmount customPricingUnitAmount,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String meteredItem,
      String price,
      TieringMode tieringMode,
      List<RateCreateParams.Tier> tiers,
      TransformQuantity transformQuantity,
      String unitAmount) {
    this.customPricingUnitAmount = customPricingUnitAmount;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.meteredItem = meteredItem;
    this.price = price;
    this.tieringMode = tieringMode;
    this.tiers = tiers;
    this.transformQuantity = transformQuantity;
    this.unitAmount = unitAmount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CustomPricingUnitAmount customPricingUnitAmount;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String meteredItem;

    private String price;

    private TieringMode tieringMode;

    private List<RateCreateParams.Tier> tiers;

    private TransformQuantity transformQuantity;

    private String unitAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCreateParams build() {
      return new RateCreateParams(
          this.customPricingUnitAmount,
          this.extraParams,
          this.metadata,
          this.meteredItem,
          this.price,
          this.tieringMode,
          this.tiers,
          this.transformQuantity,
          this.unitAmount);
    }

    /** The custom pricing unit that this rate binds to. */
    public Builder setCustomPricingUnitAmount(
        RateCreateParams.CustomPricingUnitAmount customPricingUnitAmount) {
      this.customPricingUnitAmount = customPricingUnitAmount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCreateParams#extraParams} for the field documentation.
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
     * See {@link RateCreateParams#extraParams} for the field documentation.
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
     * RateCreateParams#metadata} for the field documentation.
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
     * See {@link RateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The MeteredItem that this rate binds to. */
    public Builder setMeteredItem(String meteredItem) {
      this.meteredItem = meteredItem;
      return this;
    }

    /**
     * The ID of the Price object to take price information from. The Price must have the same
     * interval as the RateCard. Updates to the Price will not be reflected in the RateCard or its
     * rates.
     */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }

    /**
     * Defines whether the tiered price should be graduated or volume-based. In volume-based
     * tiering, the maximum quantity within a period determines the per-unit price. In graduated
     * tiering, the pricing changes as the quantity grows into new tiers. Can only be set if {@code
     * tiers} is set.
     */
    public Builder setTieringMode(RateCreateParams.TieringMode tieringMode) {
      this.tieringMode = tieringMode;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RateCreateParams#tiers} for the field documentation.
     */
    public Builder addTier(RateCreateParams.Tier element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element);
      return this;
    }

    /**
     * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RateCreateParams#tiers} for the field documentation.
     */
    public Builder addAllTier(List<RateCreateParams.Tier> elements) {
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
    public Builder setTransformQuantity(RateCreateParams.TransformQuantity transformQuantity) {
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
  public static class CustomPricingUnitAmount {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The id of the custom pricing unit. */
    @SerializedName("id")
    String id;

    /** <strong>Required.</strong> The unit value for the custom pricing unit, as a string. */
    @SerializedName("value")
    String value;

    private CustomPricingUnitAmount(Map<String, Object> extraParams, String id, String value) {
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
      public RateCreateParams.CustomPricingUnitAmount build() {
        return new RateCreateParams.CustomPricingUnitAmount(this.extraParams, this.id, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCreateParams.CustomPricingUnitAmount#extraParams} for the field documentation.
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
       * See {@link RateCreateParams.CustomPricingUnitAmount#extraParams} for the field
       * documentation.
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

      /** <strong>Required.</strong> The unit value for the custom pricing unit, as a string. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Tier {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
     * Up to and including this quantity will be contained in the tier. Only one of {@code
     * up_to_decimal} and {@code up_to_inf} may be set.
     */
    @SerializedName("up_to_decimal")
    String upToDecimal;

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
        String upToDecimal,
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

      private String upToDecimal;

      private UpToInf upToInf;

      /** Finalize and obtain parameter instance from this builder. */
      public RateCreateParams.Tier build() {
        return new RateCreateParams.Tier(
            this.extraParams, this.flatAmount, this.unitAmount, this.upToDecimal, this.upToInf);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCreateParams.Tier#extraParams} for the field documentation.
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
       * See {@link RateCreateParams.Tier#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Price for the entire tier, represented as a decimal string in minor currency units with at
       * most 12 decimal places.
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
       * Up to and including this quantity will be contained in the tier. Only one of {@code
       * up_to_decimal} and {@code up_to_inf} may be set.
       */
      public Builder setUpToDecimal(String upToDecimal) {
        this.upToDecimal = upToDecimal;
        return this;
      }

      /**
       * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may be
       * set.
       */
      public Builder setUpToInf(RateCreateParams.Tier.UpToInf upToInf) {
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
    Long divideBy;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public RateCreateParams.TransformQuantity build() {
        return new RateCreateParams.TransformQuantity(this.divideBy, this.extraParams, this.round);
      }

      /** <strong>Required.</strong> Divide usage by this number. */
      public Builder setDivideBy(Long divideBy) {
        this.divideBy = divideBy;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCreateParams.TransformQuantity#extraParams} for the field documentation.
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
       * See {@link RateCreateParams.TransformQuantity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> After division, round the result up or down. */
      public Builder setRound(RateCreateParams.TransformQuantity.Round round) {
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
