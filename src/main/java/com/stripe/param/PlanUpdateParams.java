package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PlanUpdateParams extends ApiRequestParams {
  /** Whether the plan is currently available for new subscriptions. */
  @SerializedName("active")
  Boolean active;

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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A brief description of the plan, hidden from customers. */
  @SerializedName("nickname")
  Object nickname;

  /**
   * The product the plan belongs to. Note that after updating, statement descriptors and line items
   * of the plan in active subscriptions will be affected.
   */
  @SerializedName("product")
  Object product;

  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
   */
  @SerializedName("trial_period_days")
  Long trialPeriodDays;

  private PlanUpdateParams(
      Boolean active,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Object nickname,
      Object product,
      Long trialPeriodDays) {
    this.active = active;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.nickname = nickname;
    this.product = product;
    this.trialPeriodDays = trialPeriodDays;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Object nickname;

    private Object product;

    private Long trialPeriodDays;

    /** Finalize and obtain parameter instance from this builder. */
    public PlanUpdateParams build() {
      return new PlanUpdateParams(
          this.active,
          this.expand,
          this.extraParams,
          this.metadata,
          this.nickname,
          this.product,
          this.trialPeriodDays);
    }

    /** Whether the plan is currently available for new subscriptions. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PlanUpdateParams#expand} for the field documentation.
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
     * PlanUpdateParams#expand} for the field documentation.
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
     * PlanUpdateParams#extraParams} for the field documentation.
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
     * See {@link PlanUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PlanUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PlanUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** A brief description of the plan, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** A brief description of the plan, hidden from customers. */
    public Builder setNickname(EmptyParam nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * The product the plan belongs to. Note that after updating, statement descriptors and line
     * items of the plan in active subscriptions will be affected.
     */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /**
     * The product the plan belongs to. Note that after updating, statement descriptors and line
     * items of the plan in active subscriptions will be affected.
     */
    public Builder setProduct(EmptyParam product) {
      this.product = product;
      return this;
    }

    /**
     * Default number of trial days when subscribing a customer to this plan using
     * [`trial_from_plan=true`](https://stripe.com/docs/api#create_subscription-trial_from_plan).
     */
    public Builder setTrialPeriodDays(Long trialPeriodDays) {
      this.trialPeriodDays = trialPeriodDays;
      return this;
    }
  }
}
