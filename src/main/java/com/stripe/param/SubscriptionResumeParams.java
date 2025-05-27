// File generated from our OpenAPI spec
package com.stripe.param;

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
public class SubscriptionResumeParams extends ApiRequestParams {
  /**
   * The billing cycle anchor that applies when the subscription is resumed. Either {@code now} or
   * {@code unchanged}. The default is {@code now}. For more information, see the billing cycle <a
   * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
   */
  @SerializedName("billing_cycle_anchor")
  BillingCycleAnchor billingCycleAnchor;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

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
   * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> resulting from
   * the {@code billing_cycle_anchor} being {@code unchanged}. When the {@code billing_cycle_anchor}
   * is set to {@code now} (default value), no prorations are generated. If no value is passed, the
   * default is {@code create_prorations}.
   */
  @SerializedName("proration_behavior")
  ProrationBehavior prorationBehavior;

  /**
   * If set, prorations will be calculated as though the subscription was resumed at the given time.
   * This can be used to apply exactly the same prorations that were previewed with the <a
   * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
   */
  @SerializedName("proration_date")
  Long prorationDate;

  private SubscriptionResumeParams(
      BillingCycleAnchor billingCycleAnchor,
      List<String> expand,
      Map<String, Object> extraParams,
      ProrationBehavior prorationBehavior,
      Long prorationDate) {
    this.billingCycleAnchor = billingCycleAnchor;
    this.expand = expand;
    this.extraParams = extraParams;
    this.prorationBehavior = prorationBehavior;
    this.prorationDate = prorationDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingCycleAnchor billingCycleAnchor;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private ProrationBehavior prorationBehavior;

    private Long prorationDate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionResumeParams build() {
      return new SubscriptionResumeParams(
          this.billingCycleAnchor,
          this.expand,
          this.extraParams,
          this.prorationBehavior,
          this.prorationDate);
    }

    /**
     * The billing cycle anchor that applies when the subscription is resumed. Either {@code now} or
     * {@code unchanged}. The default is {@code now}. For more information, see the billing cycle <a
     * href="https://stripe.com/docs/billing/subscriptions/billing-cycle">documentation</a>.
     */
    public Builder setBillingCycleAnchor(
        SubscriptionResumeParams.BillingCycleAnchor billingCycleAnchor) {
      this.billingCycleAnchor = billingCycleAnchor;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionResumeParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionResumeParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SubscriptionResumeParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionResumeParams#extraParams} for the field documentation.
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
     * href="https://stripe.com/docs/billing/subscriptions/prorations">prorations</a> resulting from
     * the {@code billing_cycle_anchor} being {@code unchanged}. When the {@code
     * billing_cycle_anchor} is set to {@code now} (default value), no prorations are generated. If
     * no value is passed, the default is {@code create_prorations}.
     */
    public Builder setProrationBehavior(
        SubscriptionResumeParams.ProrationBehavior prorationBehavior) {
      this.prorationBehavior = prorationBehavior;
      return this;
    }

    /**
     * If set, prorations will be calculated as though the subscription was resumed at the given
     * time. This can be used to apply exactly the same prorations that were previewed with the <a
     * href="https://stripe.com/docs/api/invoices/create_preview">create preview</a> endpoint.
     */
    public Builder setProrationDate(Long prorationDate) {
      this.prorationDate = prorationDate;
      return this;
    }
  }

  public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now"),

    @SerializedName("unchanged")
    UNCHANGED("unchanged");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingCycleAnchor(String value) {
      this.value = value;
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
