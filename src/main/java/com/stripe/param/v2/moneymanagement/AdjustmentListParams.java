// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AdjustmentListParams extends ApiRequestParams {
  /** Filter for Adjustments linked to a Flow. */
  @SerializedName("adjusted_flow")
  String adjustedFlow;

  /**
   * Filter for objects created at the specified timestamp. Must be an RFC 3339 date &amp; time
   * value, for example: 2022-09-18T13:22:00Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
   * value, for example: 2022-09-18T13:22:00Z.
   */
  @SerializedName("created_gt")
  Instant createdGt;

  /**
   * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date &amp;
   * time value, for example: 2022-09-18T13:22:00Z.
   */
  @SerializedName("created_gte")
  Instant createdGte;

  /**
   * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp; time
   * value, for example: 2022-09-18T13:22:00Z.
   */
  @SerializedName("created_lt")
  Instant createdLt;

  /**
   * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date &amp;
   * time value, for example: 2022-09-18T13:22:00Z.
   */
  @SerializedName("created_lte")
  Instant createdLte;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page limit. */
  @SerializedName("limit")
  Long limit;

  private AdjustmentListParams(
      String adjustedFlow,
      Instant created,
      Instant createdGt,
      Instant createdGte,
      Instant createdLt,
      Instant createdLte,
      Map<String, Object> extraParams,
      Long limit) {
    this.adjustedFlow = adjustedFlow;
    this.created = created;
    this.createdGt = createdGt;
    this.createdGte = createdGte;
    this.createdLt = createdLt;
    this.createdLte = createdLte;
    this.extraParams = extraParams;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String adjustedFlow;

    private Instant created;

    private Instant createdGt;

    private Instant createdGte;

    private Instant createdLt;

    private Instant createdLte;

    private Map<String, Object> extraParams;

    private Long limit;

    /** Finalize and obtain parameter instance from this builder. */
    public AdjustmentListParams build() {
      return new AdjustmentListParams(
          this.adjustedFlow,
          this.created,
          this.createdGt,
          this.createdGte,
          this.createdLt,
          this.createdLte,
          this.extraParams,
          this.limit);
    }

    /** Filter for Adjustments linked to a Flow. */
    public Builder setAdjustedFlow(String adjustedFlow) {
      this.adjustedFlow = adjustedFlow;
      return this;
    }

    /**
     * Filter for objects created at the specified timestamp. Must be an RFC 3339 date &amp; time
     * value, for example: 2022-09-18T13:22:00Z.
     */
    public Builder setCreated(Instant created) {
      this.created = created;
      return this;
    }

    /**
     * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
     * value, for example: 2022-09-18T13:22:00Z.
     */
    public Builder setCreatedGt(Instant createdGt) {
      this.createdGt = createdGt;
      return this;
    }

    /**
     * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
    public Builder setCreatedGte(Instant createdGte) {
      this.createdGte = createdGte;
      return this;
    }

    /**
     * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
     * time value, for example: 2022-09-18T13:22:00Z.
     */
    public Builder setCreatedLt(Instant createdLt) {
      this.createdLt = createdLt;
      return this;
    }

    /**
     * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
    public Builder setCreatedLte(Instant createdLte) {
      this.createdLte = createdLte;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AdjustmentListParams#extraParams} for the field documentation.
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
     * See {@link AdjustmentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }
  }
}
