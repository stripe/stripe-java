// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class UsageRecordCreateOnSubscriptionItemParams extends ApiRequestParams {
  /**
   * Valid values are {@code increment} (default) or {@code set}. When using {@code increment} the
   * specified {@code quantity} will be added to the usage at the specified timestamp. The {@code
   * set} action will overwrite the usage quantity at that timestamp. If the subscription has <a
   * href="https://stripe.com/docs/api/subscriptions/object#subscription_object-billing_thresholds">billing
   * thresholds</a>, {@code increment} is the only allowed value.
   */
  @SerializedName("action")
  Action action;

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

  /** The usage quantity for the specified timestamp. */
  @SerializedName("quantity")
  Long quantity;

  /**
   * The timestamp for the usage event. This timestamp must be within the current billing period of
   * the subscription of the provided {@code subscription_item}, and must not be in the future. When
   * passing {@code "now"}, Stripe records usage for the current time. Default is {@code "now"} if a
   * value is not provided.
   */
  @SerializedName("timestamp")
  Object timestamp;

  private UsageRecordCreateOnSubscriptionItemParams(
      Action action,
      List<String> expand,
      Map<String, Object> extraParams,
      Long quantity,
      Object timestamp) {
    this.action = action;
    this.expand = expand;
    this.extraParams = extraParams;
    this.quantity = quantity;
    this.timestamp = timestamp;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Action action;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long quantity;

    private Object timestamp;

    /** Finalize and obtain parameter instance from this builder. */
    public UsageRecordCreateOnSubscriptionItemParams build() {
      return new UsageRecordCreateOnSubscriptionItemParams(
          this.action, this.expand, this.extraParams, this.quantity, this.timestamp);
    }

    /**
     * Valid values are {@code increment} (default) or {@code set}. When using {@code increment} the
     * specified {@code quantity} will be added to the usage at the specified timestamp. The {@code
     * set} action will overwrite the usage quantity at that timestamp. If the subscription has <a
     * href="https://stripe.com/docs/api/subscriptions/object#subscription_object-billing_thresholds">billing
     * thresholds</a>, {@code increment} is the only allowed value.
     */
    public Builder setAction(Action action) {
      this.action = action;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * UsageRecordCreateOnSubscriptionItemParams#expand} for the field documentation.
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
     * UsageRecordCreateOnSubscriptionItemParams#expand} for the field documentation.
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
     * UsageRecordCreateOnSubscriptionItemParams#extraParams} for the field documentation.
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
     * See {@link UsageRecordCreateOnSubscriptionItemParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The usage quantity for the specified timestamp. */
    public Builder setQuantity(Long quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The timestamp for the usage event. This timestamp must be within the current billing period
     * of the subscription of the provided {@code subscription_item}, and must not be in the future.
     * When passing {@code "now"}, Stripe records usage for the current time. Default is {@code
     * "now"} if a value is not provided.
     */
    public Builder setTimestamp(Timestamp timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * The timestamp for the usage event. This timestamp must be within the current billing period
     * of the subscription of the provided {@code subscription_item}, and must not be in the future.
     * When passing {@code "now"}, Stripe records usage for the current time. Default is {@code
     * "now"} if a value is not provided.
     */
    public Builder setTimestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }

  public enum Action implements ApiRequestParams.EnumParam {
    @SerializedName("increment")
    INCREMENT("increment"),

    @SerializedName("set")
    SET("set");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Action(String value) {
      this.value = value;
    }
  }

  public enum Timestamp implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Timestamp(String value) {
      this.value = value;
    }
  }
}
