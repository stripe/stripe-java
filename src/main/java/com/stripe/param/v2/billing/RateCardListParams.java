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
public class RateCardListParams extends ApiRequestParams {
  /** Optionally filter to active/inactive RateCards. */
  @SerializedName("active")
  Boolean active;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Optionally set the maximum number of results per page. Defaults to 20. */
  @SerializedName("limit")
  Integer limit;

  /** Filter by lookup keys. You can specify up to 10 lookup keys. */
  @SerializedName("lookup_keys")
  List<String> lookupKeys;

  private RateCardListParams(
      Boolean active, Map<String, Object> extraParams, Integer limit, List<String> lookupKeys) {
    this.active = active;
    this.extraParams = extraParams;
    this.limit = limit;
    this.lookupKeys = lookupKeys;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Map<String, Object> extraParams;

    private Integer limit;

    private List<String> lookupKeys;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCardListParams build() {
      return new RateCardListParams(this.active, this.extraParams, this.limit, this.lookupKeys);
    }

    /** Optionally filter to active/inactive RateCards. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCardListParams#extraParams} for the field documentation.
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
     * See {@link RateCardListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optionally set the maximum number of results per page. Defaults to 20. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * RateCardListParams#lookupKeys} for the field documentation.
     */
    public Builder addLookupKey(String element) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.add(element);
      return this;
    }

    /**
     * Add all elements to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * RateCardListParams#lookupKeys} for the field documentation.
     */
    public Builder addAllLookupKey(List<String> elements) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.addAll(elements);
      return this;
    }
  }
}
