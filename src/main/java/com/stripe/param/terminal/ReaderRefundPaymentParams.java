// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReaderRefundPaymentParams extends ApiRequestParams {
  /**
   * A positive integer in <strong>cents</strong> representing how much of this charge to refund.
   */
  @SerializedName("amount")
  Long amount;

  /** ID of the Charge to refund. */
  @SerializedName("charge")
  String charge;

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

  /** ID of the PaymentIntent to refund. */
  @SerializedName("payment_intent")
  String paymentIntent;

  /**
   * Boolean indicating whether the application fee should be refunded when refunding this charge.
   * If a full charge refund is given, the full application fee will be refunded. Otherwise, the
   * application fee will be refunded in an amount proportional to the amount of the charge
   * refunded. An application fee can be refunded only by the application that created the charge.
   */
  @SerializedName("refund_application_fee")
  Boolean refundApplicationFee;

  /**
   * Boolean indicating whether the transfer should be reversed when refunding this charge. The
   * transfer will be reversed proportionally to the amount being refunded (either the entire or
   * partial amount). A transfer can be reversed only by the application that created the charge.
   */
  @SerializedName("reverse_transfer")
  Boolean reverseTransfer;

  private ReaderRefundPaymentParams(
      Long amount,
      String charge,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentIntent,
      Boolean refundApplicationFee,
      Boolean reverseTransfer) {
    this.amount = amount;
    this.charge = charge;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
    this.refundApplicationFee = refundApplicationFee;
    this.reverseTransfer = reverseTransfer;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String charge;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentIntent;

    private Boolean refundApplicationFee;

    private Boolean reverseTransfer;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderRefundPaymentParams build() {
      return new ReaderRefundPaymentParams(
          this.amount,
          this.charge,
          this.expand,
          this.extraParams,
          this.paymentIntent,
          this.refundApplicationFee,
          this.reverseTransfer);
    }

    /**
     * A positive integer in <strong>cents</strong> representing how much of this charge to refund.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /** ID of the Charge to refund. */
    public Builder setCharge(String charge) {
      this.charge = charge;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderRefundPaymentParams#expand} for the field documentation.
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
     * ReaderRefundPaymentParams#expand} for the field documentation.
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
     * ReaderRefundPaymentParams#extraParams} for the field documentation.
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
     * See {@link ReaderRefundPaymentParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** ID of the PaymentIntent to refund. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /**
     * Boolean indicating whether the application fee should be refunded when refunding this charge.
     * If a full charge refund is given, the full application fee will be refunded. Otherwise, the
     * application fee will be refunded in an amount proportional to the amount of the charge
     * refunded. An application fee can be refunded only by the application that created the charge.
     */
    public Builder setRefundApplicationFee(Boolean refundApplicationFee) {
      this.refundApplicationFee = refundApplicationFee;
      return this;
    }

    /**
     * Boolean indicating whether the transfer should be reversed when refunding this charge. The
     * transfer will be reversed proportionally to the amount being refunded (either the entire or
     * partial amount). A transfer can be reversed only by the application that created the charge.
     */
    public Builder setReverseTransfer(Boolean reverseTransfer) {
      this.reverseTransfer = reverseTransfer;
      return this;
    }
  }
}
