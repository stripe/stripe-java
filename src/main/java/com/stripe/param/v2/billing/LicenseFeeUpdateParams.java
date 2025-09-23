// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

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
public class LicenseFeeUpdateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> A customer-facing name for the License Fee. This name is used in
   * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on Invoices.
   * Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Changes the version that new license fee will use. Providing {@code live_version = "latest"}
   * will set the license fee's {@code live_version} to its latest version.
   */
  @SerializedName("live_version")
  Object liveVersion;

  /**
   * An internal key you can use to search for a particular license fee. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /**
   * Defines whether the tiered price should be graduated or volume-based. In volume-based tiering,
   * the maximum quantity within a period determines the per-unit price. In graduated tiering, the
   * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is set.
   */
  @SerializedName("tiering_mode")
  TieringMode tieringMode;

  /** Each element represents a pricing tier. Cannot be set if {@code unit_amount} is provided. */
  @SerializedName("tiers")
  List<LicenseFeeUpdateParams.Tier> tiers;

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
  Object unitAmount;

  private LicenseFeeUpdateParams(
      Object displayName,
      Map<String, Object> extraParams,
      Object liveVersion,
      Object lookupKey,
      Map<String, Object> metadata,
      TieringMode tieringMode,
      List<LicenseFeeUpdateParams.Tier> tiers,
      TransformQuantity transformQuantity,
      Object unitAmount) {
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.liveVersion = liveVersion;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.tieringMode = tieringMode;
    this.tiers = tiers;
    this.transformQuantity = transformQuantity;
    this.unitAmount = unitAmount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object displayName;

    private Map<String, Object> extraParams;

    private Object liveVersion;

    private Object lookupKey;

    private Map<String, Object> metadata;

    private TieringMode tieringMode;

    private List<LicenseFeeUpdateParams.Tier> tiers;

    private TransformQuantity transformQuantity;

    private Object unitAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public LicenseFeeUpdateParams build() {
      return new LicenseFeeUpdateParams(
          this.displayName,
          this.extraParams,
          this.liveVersion,
          this.lookupKey,
          this.metadata,
          this.tieringMode,
          this.tiers,
          this.transformQuantity,
          this.unitAmount);
    }

    /**
     * <strong>Required.</strong> A customer-facing name for the License Fee. This name is used in
     * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on
     * Invoices. Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * <strong>Required.</strong> A customer-facing name for the License Fee. This name is used in
     * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on
     * Invoices. Maximum length of 250 characters.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicenseFeeUpdateParams#extraParams} for the field documentation.
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
     * See {@link LicenseFeeUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Changes the version that new license fee will use. Providing {@code live_version = "latest"}
     * will set the license fee's {@code live_version} to its latest version.
     */
    public Builder setLiveVersion(String liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * Changes the version that new license fee will use. Providing {@code live_version = "latest"}
     * will set the license fee's {@code live_version} to its latest version.
     */
    public Builder setLiveVersion(EmptyParam liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * An internal key you can use to search for a particular license fee. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * An internal key you can use to search for a particular license fee. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicenseFeeUpdateParams#metadata} for the field documentation.
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
     * LicenseFeeUpdateParams#metadata} for the field documentation.
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
     * LicenseFeeUpdateParams#metadata} for the field documentation.
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
     * Defines whether the tiered price should be graduated or volume-based. In volume-based
     * tiering, the maximum quantity within a period determines the per-unit price. In graduated
     * tiering, the pricing changes as the quantity grows into new tiers. Can only be set if {@code
     * tiers} is set.
     */
    public Builder setTieringMode(LicenseFeeUpdateParams.TieringMode tieringMode) {
      this.tieringMode = tieringMode;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LicenseFeeUpdateParams#tiers} for the field documentation.
     */
    public Builder addTier(LicenseFeeUpdateParams.Tier element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element);
      return this;
    }

    /**
     * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LicenseFeeUpdateParams#tiers} for the field documentation.
     */
    public Builder addAllTier(List<LicenseFeeUpdateParams.Tier> elements) {
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
        LicenseFeeUpdateParams.TransformQuantity transformQuantity) {
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

    /**
     * The per-unit amount to be charged, represented as a decimal string in minor currency units
     * with at most 12 decimal places. Cannot be set if {@code tiers} is provided.
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
    Object flatAmount;

    /**
     * Per-unit price for units included in this tier, represented as a decimal string in minor
     * currency units with at most 12 decimal places.
     */
    @SerializedName("unit_amount")
    Object unitAmount;

    /**
     * Up to and including this quantity will be contained in the tier. Only one of {@code
     * up_to_decimal} and {@code up_to_inf} may be set.
     */
    @SerializedName("up_to_decimal")
    Object upToDecimal;

    /**
     * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may be
     * set.
     */
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
      public LicenseFeeUpdateParams.Tier build() {
        return new LicenseFeeUpdateParams.Tier(
            this.extraParams, this.flatAmount, this.unitAmount, this.upToDecimal, this.upToInf);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LicenseFeeUpdateParams.Tier#extraParams} for the field documentation.
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
       * See {@link LicenseFeeUpdateParams.Tier#extraParams} for the field documentation.
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
       * Price for the entire tier, represented as a decimal string in minor currency units with at
       * most 12 decimal places.
       */
      public Builder setFlatAmount(EmptyParam flatAmount) {
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
       * Per-unit price for units included in this tier, represented as a decimal string in minor
       * currency units with at most 12 decimal places.
       */
      public Builder setUnitAmount(EmptyParam unitAmount) {
        this.unitAmount = unitAmount;
        return this;
      }

      /**
       * Up to and including this quantity will be contained in the tier. Only one of {@code
       * up_to_decimal} and {@code up_to_inf} may be set.
       */
      public Builder setUpToDecimal(BigDecimal upToDecimal) {
        this.upToDecimal = upToDecimal;
        return this;
      }

      /**
       * Up to and including this quantity will be contained in the tier. Only one of {@code
       * up_to_decimal} and {@code up_to_inf} may be set.
       */
      public Builder setUpToDecimal(EmptyParam upToDecimal) {
        this.upToDecimal = upToDecimal;
        return this;
      }

      /**
       * No upper bound to this tier. Only one of {@code up_to_decimal} and {@code up_to_inf} may be
       * set.
       */
      public Builder setUpToInf(LicenseFeeUpdateParams.Tier.UpToInf upToInf) {
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
      public LicenseFeeUpdateParams.TransformQuantity build() {
        return new LicenseFeeUpdateParams.TransformQuantity(
            this.divideBy, this.extraParams, this.round);
      }

      /** <strong>Required.</strong> Divide usage by this number. */
      public Builder setDivideBy(Long divideBy) {
        this.divideBy = divideBy;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LicenseFeeUpdateParams.TransformQuantity#extraParams} for the field documentation.
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
       * See {@link LicenseFeeUpdateParams.TransformQuantity#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> After division, round the result up or down. */
      public Builder setRound(LicenseFeeUpdateParams.TransformQuantity.Round round) {
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
