// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
  Long limit;

  /**
   * The status of the FinancialAccount to filter by. By default, closed FinancialAccounts are not
   * returned.
   */
  @SerializedName("status")
  Status status;

  /**
   * Filter for FinancialAccount {@code type}. By default, FinancialAccounts of any {@code type} are
   * returned.
   */
  @SerializedName("types")
  List<FinancialAccountListParams.Type> types;

  private FinancialAccountListParams(
      Map<String, Object> extraParams,
      Long limit,
      Status status,
      List<FinancialAccountListParams.Type> types) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.status = status;
    this.types = types;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private Status status;

    private List<FinancialAccountListParams.Type> types;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountListParams build() {
      return new FinancialAccountListParams(this.extraParams, this.limit, this.status, this.types);
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
    public Builder setLimit(Long limit) {
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

    /**
     * Add an element to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountListParams#types} for the field documentation.
     */
    public Builder addType(FinancialAccountListParams.Type element) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.add(element);
      return this;
    }

    /**
     * Add all elements to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancialAccountListParams#types} for the field documentation.
     */
    public Builder addAllType(List<FinancialAccountListParams.Type> elements) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.addAll(elements);
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

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("payments")
    PAYMENTS("payments"),

    @SerializedName("storage")
    STORAGE("storage");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
