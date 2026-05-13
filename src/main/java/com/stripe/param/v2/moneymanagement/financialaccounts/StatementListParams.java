// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement.financialaccounts;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class StatementListParams extends ApiRequestParams {
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

  /** The field by which to sort results. Defaults to &quot;created&quot;. */
  @SerializedName("order_by")
  OrderBy orderBy;

  private StatementListParams(Map<String, Object> extraParams, Long limit, OrderBy orderBy) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.orderBy = orderBy;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private OrderBy orderBy;

    /** Finalize and obtain parameter instance from this builder. */
    public StatementListParams build() {
      return new StatementListParams(this.extraParams, this.limit, this.orderBy);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * StatementListParams#extraParams} for the field documentation.
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
     * See {@link StatementListParams#extraParams} for the field documentation.
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

    /** The field by which to sort results. Defaults to &quot;created&quot;. */
    public Builder setOrderBy(StatementListParams.OrderBy orderBy) {
      this.orderBy = orderBy;
      return this;
    }
  }

  public enum OrderBy implements ApiRequestParams.EnumParam {
    @SerializedName("created")
    CREATED("created"),

    @SerializedName("period_end_date")
    PERIOD_END_DATE("period_end_date");

    @Getter(onMethod_ = {@Override})
    private final String value;

    OrderBy(String value) {
      this.value = value;
    }
  }
}
