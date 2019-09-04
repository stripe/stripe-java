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
  CancellationReason cancellationReason;

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
      CancellationReason cancellationReason, List<String> expand, Map<String, Object> extraParams) {
    this.cancellationReason = cancellationReason;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CancellationReason cancellationReason;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentCancelParams build() {
      return new PaymentIntentCancelParams(this.cancellationReason, this.expand, this.extraParams);
    }

    /**
     * Reason for canceling this PaymentIntent. Possible values are `duplicate`, `fraudulent`,
     * `requested_by_customer`, or `abandoned`
     */
    public Builder setCancellationReason(CancellationReason cancellationReason) {
      this.cancellationReason = cancellationReason;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCancelParams#expand} for the field documentation.
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
     * PaymentIntentCancelParams#expand} for the field documentation.
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
     * PaymentIntentCancelParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentCancelParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
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

    CancellationReason(String value) {
      this.value = value;
    }
  }
}
