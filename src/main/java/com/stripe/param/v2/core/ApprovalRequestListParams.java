// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ApprovalRequestListParams extends ApiRequestParams {
  /**
   * Filter by action type (e.g. &quot;refund.create&quot;, &quot;payment_intent.create&quot;,
   * &quot;payout.create&quot;).
   */
  @SerializedName("action")
  String action;

  /** Filter by creation time. */
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

  /** Maximum number of results to return. */
  @SerializedName("limit")
  Long limit;

  /**
   * Filter by approval request status (e.g. &quot;requires_review&quot;, &quot;approved&quot;,
   * &quot;succeeded&quot;, &quot;failed&quot;, &quot;rejected&quot;, &quot;canceled&quot;,
   * &quot;expired&quot;).
   */
  @SerializedName("status")
  String status;

  private ApprovalRequestListParams(
      String action, Created created, Map<String, Object> extraParams, Long limit, String status) {
    this.action = action;
    this.created = created;
    this.extraParams = extraParams;
    this.limit = limit;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String action;

    private Created created;

    private Map<String, Object> extraParams;

    private Long limit;

    private String status;

    /** Finalize and obtain parameter instance from this builder. */
    public ApprovalRequestListParams build() {
      return new ApprovalRequestListParams(
          this.action, this.created, this.extraParams, this.limit, this.status);
    }

    /**
     * Filter by action type (e.g. &quot;refund.create&quot;, &quot;payment_intent.create&quot;,
     * &quot;payout.create&quot;).
     */
    public Builder setAction(String action) {
      this.action = action;
      return this;
    }

    /** Filter by creation time. */
    public Builder setCreated(ApprovalRequestListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ApprovalRequestListParams#extraParams} for the field documentation.
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
     * See {@link ApprovalRequestListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Filter by approval request status (e.g. &quot;requires_review&quot;, &quot;approved&quot;,
     * &quot;succeeded&quot;, &quot;failed&quot;, &quot;rejected&quot;, &quot;canceled&quot;,
     * &quot;expired&quot;).
     */
    public Builder setStatus(String status) {
      this.status = status;
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

    /**
     * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
     * value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("gt")
    Instant gt;

    /**
     * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("gte")
    Instant gte;

    /**
     * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
     * time value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("lt")
    Instant lt;

    /**
     * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
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
      public ApprovalRequestListParams.Created build() {
        return new ApprovalRequestListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ApprovalRequestListParams.Created#extraParams} for the field documentation.
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
       * See {@link ApprovalRequestListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp;
       * time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /**
       * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
       * &amp; time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /**
       * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
       * time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /**
       * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
       * &amp; time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }
}
