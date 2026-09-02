// File generated from our OpenAPI spec
package com.stripe.param.v2.signals;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentRetryEvaluationUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** PaymentIntent to update to. Must match the evaluation's signal type. */
  @SerializedName("payment_intent")
  Object paymentIntent;

  /** PaymentRecord to update to. Must match the evaluation's signal type. */
  @SerializedName("payment_record")
  Object paymentRecord;

  private PaymentRetryEvaluationUpdateParams(
      Map<String, Object> extraParams, Object paymentIntent, Object paymentRecord) {
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
    this.paymentRecord = paymentRecord;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Object paymentIntent;

    private Object paymentRecord;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRetryEvaluationUpdateParams build() {
      return new PaymentRetryEvaluationUpdateParams(
          this.extraParams, this.paymentIntent, this.paymentRecord);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRetryEvaluationUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentRetryEvaluationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** PaymentIntent to update to. Must match the evaluation's signal type. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** PaymentIntent to update to. Must match the evaluation's signal type. */
    public Builder setPaymentIntent(EmptyParam paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** PaymentRecord to update to. Must match the evaluation's signal type. */
    public Builder setPaymentRecord(String paymentRecord) {
      this.paymentRecord = paymentRecord;
      return this;
    }

    /** PaymentRecord to update to. Must match the evaluation's signal type. */
    public Builder setPaymentRecord(EmptyParam paymentRecord) {
      this.paymentRecord = paymentRecord;
      return this;
    }
  }
}
