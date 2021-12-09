// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class SubscriptionItemDeleteParams extends ApiRequestParams {
  /**
   * Delete all usage for the given subscription item. Allowed only when the current plan's {@code
   * usage_type} is {@code metered}.
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
   * Determines how to handle <a
   * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
   * billing cycle changes (e.g., when switching plans, resetting {@code billing_cycle_anchor=now},
   * or starting a trial), or if an item's {@code quantity} changes. Valid values are {@code
   * create_prorations}, {@code none}, or {@code always_invoice}.
   *
   * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
   * applicable. These proration items will only be invoiced immediately under <a
   * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
   * conditions</a>. In order to always invoice immediately for prorations, pass {@code
   * always_invoice}.
   *
   * <p>Prorations can be disabled by passing {@code none}.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  /**
   * If set, the proration will be calculated as though the subscription was updated at the given
   * time. This can be used to apply the same proration that was previewed with the <a
   * href="https://stripe.com/docs/api#retrieve_customer_invoice">upcoming invoice</a> endpoint.
   */
  @SerializedName("proration_date")
  Long prorationDate;

  private SubscriptionItemDeleteParams(
      Boolean clearUsage,
      Map<String, Object> extraParams,
      ProrationBehavior prorationBehavior,
      Long prorationDate) {
    this.clearUsage = clearUsage;
    this.extraParams = extraParams;
    this.prorationBehavior = prorationBehavior;
    this.prorationDate = prorationDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean clearUsage;

    private Map<String, Object> extraParams;

    private ProrationBehavior prorationBehavior;

    private Long prorationDate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionItemDeleteParams build() {
      return new SubscriptionItemDeleteParams(
          this.clearUsage, this.extraParams, this.prorationBehavior, this.prorationDate);
    }

    /**
     * Delete all usage for the given subscription item. Allowed only when the current plan's {@code
     * usage_type} is {@code metered}.
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
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
     * billing cycle changes (e.g., when switching plans, resetting {@code
     * billing_cycle_anchor=now}, or starting a trial), or if an item's {@code quantity} changes.
     * Valid values are {@code create_prorations}, {@code none}, or {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
     * conditions</a>. In order to always invoice immediately for prorations, pass {@code
     * always_invoice}.
     *
     * <p>Prorations can be disabled by passing {@code none}.
     */
    public Builder setProrationBehavior(ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given
     * time. This can be used to apply the same proration that was previewed with the <a
     * href="https://stripe.com/docs/api#retrieve_customer_invoice">upcoming invoice</a> endpoint.
     */
    public Builder setProrationDate(Long prorationDate) {
      this.prorationDate = prorationDate;
      return this;
    }
  }

  public enum ProrationBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("always_invoice")
    ALWAYS_INVOICE("always_invoice"),

    @SerializedName("create_prorations")
    CREATE_PRORATIONS("create_prorations"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ProrationBehavior(String value) {
      this.value = value;
    }
  }
}
