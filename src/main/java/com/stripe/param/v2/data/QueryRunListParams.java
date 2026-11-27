// File generated from our OpenAPI spec
package com.stripe.param.v2.data;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class QueryRunListParams extends ApiRequestParams {
  /** If supplied, only return query runs created within this time range. */
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

  /** The maximum number of results per page. Defaults to 10. Maximum is 100. */
  @SerializedName("limit")
  Long limit;

  /** If supplied, only return query runs that have any of these statuses. */
  @SerializedName("statuses")
  List<QueryRunListParams.Status> statuses;

  private QueryRunListParams(
      Created created,
      Map<String, Object> extraParams,
      Long limit,
      List<QueryRunListParams.Status> statuses) {
    this.created = created;
    this.extraParams = extraParams;
    this.limit = limit;
    this.statuses = statuses;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Created created;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<QueryRunListParams.Status> statuses;

    /** Finalize and obtain parameter instance from this builder. */
    public QueryRunListParams build() {
      return new QueryRunListParams(this.created, this.extraParams, this.limit, this.statuses);
    }

    /** If supplied, only return query runs created within this time range. */
    public Builder setCreated(QueryRunListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QueryRunListParams#extraParams} for the field documentation.
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
     * See {@link QueryRunListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The maximum number of results per page. Defaults to 10. Maximum is 100. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `statuses` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QueryRunListParams#statuses} for the field documentation.
     */
    public Builder addStatus(QueryRunListParams.Status element) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.add(element);
      return this;
    }

    /**
     * Add all elements to `statuses` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QueryRunListParams#statuses} for the field documentation.
     */
    public Builder addAllStatus(List<QueryRunListParams.Status> elements) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.addAll(elements);
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

    /** Only return runs created after this time. */
    @SerializedName("gt")
    Instant gt;

    /** Only return runs created at or after this time. */
    @SerializedName("gte")
    Instant gte;

    /** Only return runs created before this time. */
    @SerializedName("lt")
    Instant lt;

    /** Only return runs created at or before this time. */
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
      public QueryRunListParams.Created build() {
        return new QueryRunListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QueryRunListParams.Created#extraParams} for the field documentation.
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
       * See {@link QueryRunListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Only return runs created after this time. */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /** Only return runs created at or after this time. */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /** Only return runs created before this time. */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /** Only return runs created at or before this time. */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("running")
    RUNNING("running"),

    @SerializedName("succeeded")
    SUCCEEDED("succeeded");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
