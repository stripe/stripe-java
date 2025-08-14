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
public class LicenseFeeCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The currency of this LicenseFee. */
  @SerializedName("currency")
  String currency;

  /**
   * <strong>Required.</strong> A customer-facing name for the LicenseFee. This name is used in
   * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on Invoices.
   * Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  String displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The LicensedItem that this rate binds to. */
  @SerializedName("licensed_item")
  String licensedItem;

  /**
   * An internal key you can use to search for a particular LicenseFee. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The interval for assessing service. For example, a monthly
   * LicenseFee with a rate of $1 for the first 10 &quot;workloads&quot; and $2 thereafter means
   * &quot;$1 per workload up to 10 workloads during a month of service.&quot; This is similar to
   * but distinct from billing interval; the service interval deals with the rate at which the
   * customer accumulates fees, while the billing interval in Cadence deals with the rate the
   * customer is billed.
   */
  @SerializedName("service_interval")
  ServiceInterval serviceInterval;

  /**
   * <strong>Required.</strong> The length of the interval for assessing service. For example, set
   * this to 3 and {@code service_interval} to {@code "month"} in order to specify quarterly
   * service.
   */
  @SerializedName("service_interval_count")
  Integer serviceIntervalCount;

  /**
   * <strong>Required.</strong> The Stripe Tax tax behavior - whether the license fee is inclusive
   * or exclusive of tax.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /**
   * Defines whether the tiered price should be graduated or volume-based. In volume-based tiering,
   * the maximum quantity within a period determines the per-unit price. In graduated tiering, the
   * pricing changes as the quantity grows into new tiers. Can only be set if {@code tiers} is set.
   */
  @SerializedName("tiering_mode")
  TieringMode tieringMode;

  /** Each element represents a pricing tier. Cannot be set if {@code unit_amount} is provided. */
  @SerializedName("tiers")
  List<LicenseFeeCreateParams.Tier> tiers;

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

  private LicenseFeeCreateParams(
      String currency,
      String displayName,
      Map<String, Object> extraParams,
      String licensedItem,
      String lookupKey,
      Map<String, String> metadata,
      ServiceInterval serviceInterval,
      Integer serviceIntervalCount,
      TaxBehavior taxBehavior,
      TieringMode tieringMode,
      List<LicenseFeeCreateParams.Tier> tiers,
      TransformQuantity transformQuantity,
      String unitAmount) {
    this.currency = currency;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.licensedItem = licensedItem;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.serviceInterval = serviceInterval;
    this.serviceIntervalCount = serviceIntervalCount;
    this.taxBehavior = taxBehavior;
    this.tieringMode = tieringMode;
    this.tiers = tiers;
    this.transformQuantity = transformQuantity;
    this.unitAmount = unitAmount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String displayName;

    private Map<String, Object> extraParams;

    private String licensedItem;

    private String lookupKey;

    private Map<String, String> metadata;

    private ServiceInterval serviceInterval;

    private Integer serviceIntervalCount;

    private TaxBehavior taxBehavior;

    private TieringMode tieringMode;

    private List<LicenseFeeCreateParams.Tier> tiers;

    private TransformQuantity transformQuantity;

    private String unitAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public LicenseFeeCreateParams build() {
      return new LicenseFeeCreateParams(
          this.currency,
          this.displayName,
          this.extraParams,
          this.licensedItem,
          this.lookupKey,
          this.metadata,
          this.serviceInterval,
          this.serviceIntervalCount,
          this.taxBehavior,
          this.tieringMode,
          this.tiers,
          this.transformQuantity,
          this.unitAmount);
    }

    /** <strong>Required.</strong> The currency of this LicenseFee. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <strong>Required.</strong> A customer-facing name for the LicenseFee. This name is used in
     * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on
     * Invoices. Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicenseFeeCreateParams#extraParams} for the field documentation.
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
     * See {@link LicenseFeeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The LicensedItem that this rate binds to. */
    public Builder setLicensedItem(String licensedItem) {
      this.licensedItem = licensedItem;
      return this;
    }

    /**
     * An internal key you can use to search for a particular LicenseFee. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicenseFeeCreateParams#metadata} for the field documentation.
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
     * See {@link LicenseFeeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The interval for assessing service. For example, a monthly
     * LicenseFee with a rate of $1 for the first 10 &quot;workloads&quot; and $2 thereafter means
     * &quot;$1 per workload up to 10 workloads during a month of service.&quot; This is similar to
     * but distinct from billing interval; the service interval deals with the rate at which the
     * customer accumulates fees, while the billing interval in Cadence deals with the rate the
     * customer is billed.
     */
    public Builder setServiceInterval(LicenseFeeCreateParams.ServiceInterval serviceInterval) {
      this.serviceInterval = serviceInterval;
      return this;
    }

    /**
     * <strong>Required.</strong> The length of the interval for assessing service. For example, set
     * this to 3 and {@code service_interval} to {@code "month"} in order to specify quarterly
     * service.
     */
    public Builder setServiceIntervalCount(Integer serviceIntervalCount) {
      this.serviceIntervalCount = serviceIntervalCount;
      return this;
    }

    /**
     * <strong>Required.</strong> The Stripe Tax tax behavior - whether the license fee is inclusive
     * or exclusive of tax.
     */
    public Builder setTaxBehavior(LicenseFeeCreateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * Defines whether the tiered price should be graduated or volume-based. In volume-based
     * tiering, the maximum quantity within a period determines the per-unit price. In graduated
     * tiering, the pricing changes as the quantity grows into new tiers. Can only be set if {@code
     * tiers} is set.
     */
    public Builder setTieringMode(LicenseFeeCreateParams.TieringMode tieringMode) {
      this.tieringMode = tieringMode;
      return this;
    }

    /**
     * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LicenseFeeCreateParams#tiers} for the field documentation.
     */
    public Builder addTier(LicenseFeeCreateParams.Tier element) {
      if (this.tiers == null) {
        this.tiers = new ArrayList<>();
      }
      this.tiers.add(element);
      return this;
    }

    /**
     * Add all elements to `tiers` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LicenseFeeCreateParams#tiers} for the field documentation.
     */
    public Builder addAllTier(List<LicenseFeeCreateParams.Tier> elements) {
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
        LicenseFeeCreateParams.TransformQuantity transformQuantity) {
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
      public LicenseFeeCreateParams.Tier build() {
        return new LicenseFeeCreateParams.Tier(
            this.extraParams, this.flatAmount, this.unitAmount, this.upToDecimal, this.upToInf);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LicenseFeeCreateParams.Tier#extraParams} for the field documentation.
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
       * See {@link LicenseFeeCreateParams.Tier#extraParams} for the field documentation.
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
      public Builder setUpToInf(LicenseFeeCreateParams.Tier.UpToInf upToInf) {
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
      public LicenseFeeCreateParams.TransformQuantity build() {
        return new LicenseFeeCreateParams.TransformQuantity(
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
       * LicenseFeeCreateParams.TransformQuantity#extraParams} for the field documentation.
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
       * See {@link LicenseFeeCreateParams.TransformQuantity#extraParams} for the field
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
      public Builder setRound(LicenseFeeCreateParams.TransformQuantity.Round round) {
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

  public enum TaxBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("exclusive")
    EXCLUSIVE("exclusive"),

    @SerializedName("inclusive")
    INCLUSIVE("inclusive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxBehavior(String value) {
      this.value = value;
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
