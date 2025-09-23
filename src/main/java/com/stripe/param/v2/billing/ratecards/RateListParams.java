// File generated from our OpenAPI spec
package com.stripe.param.v2.billing.ratecards;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RateListParams extends ApiRequestParams {
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
  Long limit;

  /** Optionally filter by a Metered Item. */
  @SerializedName("metered_item")
  String meteredItem;

  /** Optionally filter by a RateCard version. If not specified, defaults to the latest version. */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  private RateListParams(
      Map<String, Object> extraParams, Long limit, String meteredItem, String rateCardVersion) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.meteredItem = meteredItem;
    this.rateCardVersion = rateCardVersion;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private String meteredItem;

    private String rateCardVersion;

    /** Finalize and obtain parameter instance from this builder. */
    public RateListParams build() {
      return new RateListParams(
          this.extraParams, this.limit, this.meteredItem, this.rateCardVersion);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateListParams#extraParams} for the field documentation.
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
     * See {@link RateListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optionally set the maximum number of results per page. Defaults to 20. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Optionally filter by a Metered Item. */
    public Builder setMeteredItem(String meteredItem) {
      this.meteredItem = meteredItem;
      return this;
    }

    /**
     * Optionally filter by a RateCard version. If not specified, defaults to the latest version.
     */
    public Builder setRateCardVersion(String rateCardVersion) {
      this.rateCardVersion = rateCardVersion;
      return this;
    }
  }
}
