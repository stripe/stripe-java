// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountListParams extends ApiRequestParams {
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
  Integer limit;

  /**
   * The status of the FinancialAccount to filter by. By default, closed FinancialAccounts are not
   * returned.
   */
  @SerializedName("status")
  Status status;

  private FinancialAccountListParams(
      Map<String, Object> extraParams, Integer limit, Status status) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Integer limit;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountListParams build() {
      return new FinancialAccountListParams(this.extraParams, this.limit, this.status);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountListParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * The status of the FinancialAccount to filter by. By default, closed FinancialAccounts are not
     * returned.
     */
    public Builder setStatus(FinancialAccountListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("closed")
    CLOSED("closed"),

    @SerializedName("open")
    OPEN("open"),

    @SerializedName("pending")
    PENDING("pending");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
