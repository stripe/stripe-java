// File generated from our OpenAPI spec
package com.stripe.param.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentRetryEvaluationCancelParams extends ApiRequestParams {
  /** Optional reason for canceling the evaluation. */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private PaymentRetryEvaluationCancelParams(
      String cancellationReason, Map<String, Object> extraParams) {
    this.cancellationReason = cancellationReason;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String cancellationReason;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRetryEvaluationCancelParams build() {
      return new PaymentRetryEvaluationCancelParams(this.cancellationReason, this.extraParams);
    }

    /** Optional reason for canceling the evaluation. */
    public Builder setCancellationReason(String cancellationReason) {
      this.cancellationReason = cancellationReason;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRetryEvaluationCancelParams#extraParams} for the field documentation.
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
     * See {@link PaymentRetryEvaluationCancelParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }
}
