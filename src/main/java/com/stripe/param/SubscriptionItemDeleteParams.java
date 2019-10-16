package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class SubscriptionItemDeleteParams extends ApiRequestParams {
  /**
   * Delete all usage for the given subscription item. Allowed only when the current plan's
   * `usage_type` is `metered`.
   */
  @SerializedName("clear_usage")
  Boolean clearUsage;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Flag indicating whether to [prorate](https://stripe.com/docs/billing/subscriptions/prorations)
   * switching plans during a billing cycle.
   */
  @SerializedName("prorate")
  Boolean prorate;

  /**
   * If set, the proration will be calculated as though the subscription was updated at the given
   * time. This can be used to apply the same proration that was previewed with the [upcoming
   * invoice](#retrieve_customer_invoice) endpoint.
   */
  @SerializedName("proration_date")
  Long prorationDate;

  private SubscriptionItemDeleteParams(
      Boolean clearUsage, Map<String, Object> extraParams, Boolean prorate, Long prorationDate) {
    this.clearUsage = clearUsage;
    this.extraParams = extraParams;
    this.prorate = prorate;
    this.prorationDate = prorationDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean clearUsage;

    private Map<String, Object> extraParams;

    private Boolean prorate;

    private Long prorationDate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionItemDeleteParams build() {
      return new SubscriptionItemDeleteParams(
          this.clearUsage, this.extraParams, this.prorate, this.prorationDate);
    }

    /**
     * Delete all usage for the given subscription item. Allowed only when the current plan's
     * `usage_type` is `metered`.
     */
    public Builder setClearUsage(Boolean clearUsage) {
      this.clearUsage = clearUsage;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionItemDeleteParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionItemDeleteParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Flag indicating whether to
     * [prorate](https://stripe.com/docs/billing/subscriptions/prorations) switching plans during a
     * billing cycle.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given
     * time. This can be used to apply the same proration that was previewed with the [upcoming
     * invoice](#retrieve_customer_invoice) endpoint.
     */
    public Builder setProrationDate(Long prorationDate) {
      this.prorationDate = prorationDate;
      return this;
    }
  }
}
