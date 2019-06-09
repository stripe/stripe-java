package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentIntentCaptureParams extends ApiRequestParams {

  /**
   * The amount to capture from the PaymentIntent, which must be less than or equal to the original
   * amount. Any additional amount will be automatically refunded. Defaults to the full
   * `amount_capturable` if not provided.
   */
  @SerializedName("amount_to_capture")
  Long amountToCapture;

  /**
   * The amount of the application fee (if any) that will be applied to the payment and transferred
   * to the application owner's Stripe account. For more information, see the PaymentIntents [use
   * case for connected
   * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

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

  private PaymentIntentCaptureParams(
      Long amountToCapture,
      Long applicationFeeAmount,
      List<String> expand,
      Map<String, Object> extraParams) {

    this.amountToCapture = amountToCapture;
    this.applicationFeeAmount = applicationFeeAmount;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static PaymentIntentCaptureParams.Builder builder() {
    return new PaymentIntentCaptureParams.Builder();
  }

  public static class Builder {
    private Long amountToCapture;
    private Long applicationFeeAmount;
    private List<String> expand;
    private Map<String, Object> extraParams;

    public PaymentIntentCaptureParams build() {
      return new PaymentIntentCaptureParams(
          this.amountToCapture, this.applicationFeeAmount, this.expand, this.extraParams);
    }

    /**
     * The amount to capture from the PaymentIntent, which must be less than or equal to the
     * original amount. Any additional amount will be automatically refunded. Defaults to the full
     * `amount_capturable` if not provided.
     */
    public PaymentIntentCaptureParams.Builder setAmountToCapture(Long amountToCapture) {

      this.amountToCapture = amountToCapture;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be applied to the payment and
     * transferred to the application owner's Stripe account. For more information, see the
     * PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/payment-intents/use-cases#connected-accounts).
     */
    public PaymentIntentCaptureParams.Builder setApplicationFeeAmount(Long applicationFeeAmount) {

      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCaptureParams#expand} for the field documentation.
     */
    public PaymentIntentCaptureParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCaptureParams#expand} for the field documentation.
     */
    public PaymentIntentCaptureParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCaptureParams#extraParams} for the field documentation.
     */
    public PaymentIntentCaptureParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentCaptureParams#extraParams} for the field documentation.
     */
    public PaymentIntentCaptureParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }
}
