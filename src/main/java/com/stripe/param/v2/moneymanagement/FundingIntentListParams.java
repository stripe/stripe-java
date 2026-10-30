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
public class FundingIntentListParams extends ApiRequestParams {
  /** Filters the results by their creation time. */
  @SerializedName("created")
  Created created;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The maximum number of results to return. */
  @SerializedName("limit")
  Long limit;

  private FundingIntentListParams(Created created, Map<String, Object> extraParams, Long limit) {
    this.created = created;
    this.extraParams = extraParams;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Created created;

    private Map<String, Object> extraParams;

    private Long limit;

    /** Finalize and obtain parameter instance from this builder. */
    public FundingIntentListParams build() {
      return new FundingIntentListParams(this.created, this.extraParams, this.limit);
    }

    /** Filters the results by their creation time. */
    public Builder setCreated(FundingIntentListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingIntentListParams#extraParams} for the field documentation.
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
     * See {@link FundingIntentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The maximum number of results to return. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Return FundingIntents created after this timestamp. */
    @SerializedName("gt")
    Instant gt;

    /** Return FundingIntents created at or after this timestamp. */
    @SerializedName("gte")
    Instant gte;

    /** Return FundingIntents created before this timestamp. */
    @SerializedName("lt")
    Instant lt;

    /** Return FundingIntents created at or before this timestamp. */
    @SerializedName("lte")
    Instant lte;

    private Created(
        Map<String, Object> extraParams, Instant gt, Instant gte, Instant lt, Instant lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Instant gt;

      private Instant gte;

      private Instant lt;

      private Instant lte;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingIntentListParams.Created build() {
        return new FundingIntentListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingIntentListParams.Created#extraParams} for the field documentation.
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
       * See {@link FundingIntentListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Return FundingIntents created after this timestamp. */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /** Return FundingIntents created at or after this timestamp. */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /** Return FundingIntents created before this timestamp. */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /** Return FundingIntents created at or before this timestamp. */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }
}
