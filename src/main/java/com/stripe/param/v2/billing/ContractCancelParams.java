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
public class ContractCancelParams extends ApiRequestParams {
  /**
   * Per-pricing-line proration behavior overrides. Falls back to {@code proration_behavior} if not
   * specified for a given line.
   */
  @SerializedName("cancel_pricing_lines")
  List<ContractCancelParams.CancelPricingLine> cancelPricingLines;

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
  List<ContractCancelParams.Include> include;

  /** Top-level proration behavior for the cancellation. Defaults to {@code prorated} if not set. */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  private ContractCancelParams(
      List<ContractCancelParams.CancelPricingLine> cancelPricingLines,
      Map<String, Object> extraParams,
      List<ContractCancelParams.Include> include,
      ProrationBehavior prorationBehavior) {
    this.cancelPricingLines = cancelPricingLines;
    this.extraParams = extraParams;
    this.include = include;
    this.prorationBehavior = prorationBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<ContractCancelParams.CancelPricingLine> cancelPricingLines;

    private Map<String, Object> extraParams;

    private List<ContractCancelParams.Include> include;

    private ProrationBehavior prorationBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractCancelParams build() {
      return new ContractCancelParams(
          this.cancelPricingLines, this.extraParams, this.include, this.prorationBehavior);
    }

    /**
     * Add an element to `cancelPricingLines` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractCancelParams#cancelPricingLines} for the field documentation.
     */
    public Builder addCancelPricingLine(ContractCancelParams.CancelPricingLine element) {
      if (this.cancelPricingLines == null) {
        this.cancelPricingLines = new ArrayList<>();
      }
      this.cancelPricingLines.add(element);
      return this;
    }

    /**
     * Add all elements to `cancelPricingLines` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ContractCancelParams#cancelPricingLines} for the field documentation.
     */
    public Builder addAllCancelPricingLine(List<ContractCancelParams.CancelPricingLine> elements) {
      if (this.cancelPricingLines == null) {
        this.cancelPricingLines = new ArrayList<>();
      }
      this.cancelPricingLines.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractCancelParams#extraParams} for the field documentation.
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
     * See {@link ContractCancelParams#extraParams} for the field documentation.
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
     * ContractCancelParams#include} for the field documentation.
     */
    public Builder addInclude(ContractCancelParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractCancelParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<ContractCancelParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Top-level proration behavior for the cancellation. Defaults to {@code prorated} if not set.
     */
    public Builder setProrationBehavior(ContractCancelParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CancelPricingLine {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the pricing line. */
    @SerializedName("id")
    String id;

    /** The lookup key of the pricing line. */
    @SerializedName("lookup_key")
    String lookupKey;

    /**
     * Proration behavior scoped to this pricing line. If not provided, falls back to the top-level
     * {@code proration_behavior} on the cancel request. Defaults to {@code prorated}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    private CancelPricingLine(
        Map<String, Object> extraParams,
        String id,
        String lookupKey,
        ProrationBehavior prorationBehavior) {
      this.extraParams = extraParams;
      this.id = id;
      this.lookupKey = lookupKey;
      this.prorationBehavior = prorationBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private String lookupKey;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCancelParams.CancelPricingLine build() {
        return new ContractCancelParams.CancelPricingLine(
            this.extraParams, this.id, this.lookupKey, this.prorationBehavior);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCancelParams.CancelPricingLine#extraParams} for the field documentation.
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
       * See {@link ContractCancelParams.CancelPricingLine#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the pricing line. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The lookup key of the pricing line. */
      public Builder setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
      }

      /**
       * Proration behavior scoped to this pricing line. If not provided, falls back to the
       * top-level {@code proration_behavior} on the cancel request. Defaults to {@code prorated}.
       */
      public Builder setProrationBehavior(
          ContractCancelParams.CancelPricingLine.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("none")
      NONE("none"),

      @SerializedName("prorated")
      PRORATED("prorated");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
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

  public enum ProrationBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("prorated")
    PRORATED("prorated");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ProrationBehavior(String value) {
      this.value = value;
    }
  }
}
