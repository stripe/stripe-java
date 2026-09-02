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
public class PaymentRetryEvaluationCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** ID of the PaymentIntent to evaluate. Mutually exclusive with payment_record. */
  @SerializedName("payment_intent")
  String paymentIntent;

  /** ID of the PaymentRecord to evaluate. Mutually exclusive with payment_intent. */
  @SerializedName("payment_record")
  String paymentRecord;

  private PaymentRetryEvaluationCreateParams(
      Map<String, Object> extraParams, String paymentIntent, String paymentRecord) {
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
    this.paymentRecord = paymentRecord;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String paymentIntent;

    private String paymentRecord;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRetryEvaluationCreateParams build() {
      return new PaymentRetryEvaluationCreateParams(
          this.extraParams, this.paymentIntent, this.paymentRecord);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRetryEvaluationCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentRetryEvaluationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** ID of the PaymentIntent to evaluate. Mutually exclusive with payment_record. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** ID of the PaymentRecord to evaluate. Mutually exclusive with payment_intent. */
    public Builder setPaymentRecord(String paymentRecord) {
      this.paymentRecord = paymentRecord;
      return this;
    }
  }
}
