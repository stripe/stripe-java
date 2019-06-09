package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class PaymentIntentCancelParams extends ApiRequestParams {

  /**
   * Reason for canceling this PaymentIntent. Possible values are `duplicate`, `fraudulent`,
   * `requested_by_customer`, or `abandoned`
   */
  @SerializedName("cancellation_reason")
  PaymentIntentCancelParams.CancellationReason cancellationReason;

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

  private PaymentIntentCancelParams(
      PaymentIntentCancelParams.CancellationReason cancellationReason,
      List<String> expand,
      Map<String, Object> extraParams) {

    this.cancellationReason = cancellationReason;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static PaymentIntentCancelParams.Builder builder() {
    return new PaymentIntentCancelParams.Builder();
  }

  public static class Builder {
    private PaymentIntentCancelParams.CancellationReason cancellationReason;
    private List<String> expand;
    private Map<String, Object> extraParams;

    public PaymentIntentCancelParams build() {
      return new PaymentIntentCancelParams(this.cancellationReason, this.expand, this.extraParams);
    }

    /**
     * Reason for canceling this PaymentIntent. Possible values are `duplicate`, `fraudulent`,
     * `requested_by_customer`, or `abandoned`
     */
    public PaymentIntentCancelParams.Builder setCancellationReason(
        PaymentIntentCancelParams.CancellationReason cancellationReason) {

      this.cancellationReason = cancellationReason;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCancelParams#expand} for the field documentation.
     */
    public PaymentIntentCancelParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCancelParams#expand} for the field documentation.
     */
    public PaymentIntentCancelParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCancelParams#extraParams} for the field documentation.
     */
    public PaymentIntentCancelParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentCancelParams#extraParams} for the field documentation.
     */
    public PaymentIntentCancelParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  public enum CancellationReason implements ApiRequestParams.EnumParam {
    @SerializedName("abandoned")
    ABANDONED("abandoned"),
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),
    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),
    @SerializedName("requested_by_customer")
    REQUESTED_BY_CUSTOMER("requested_by_customer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private CancellationReason(String value) {
      this.value = value;
    }
  }
}
