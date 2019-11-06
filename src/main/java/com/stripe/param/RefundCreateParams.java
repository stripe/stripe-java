package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RefundCreateParams extends ApiRequestParams {
  @SerializedName("amount")
  Long amount;

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

  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("payment_intent")
  String paymentIntent;

  @SerializedName("reason")
  Reason reason;

  @SerializedName("refund_application_fee")
  Boolean refundApplicationFee;

  @SerializedName("reverse_transfer")
  Boolean reverseTransfer;

  private RefundCreateParams(
      Long amount,
      String charge,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String paymentIntent,
      Reason reason,
      Boolean refundApplicationFee,
      Boolean reverseTransfer) {
    this.amount = amount;
    this.charge = charge;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentIntent = paymentIntent;
    this.reason = reason;
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

    private Map<String, String> metadata;

    private String paymentIntent;

    private Reason reason;

    private Boolean refundApplicationFee;

    private Boolean reverseTransfer;

    /** Finalize and obtain parameter instance from this builder. */
    public RefundCreateParams build() {
      return new RefundCreateParams(
          this.amount,
          this.charge,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentIntent,
          this.reason,
          this.refundApplicationFee,
          this.reverseTransfer);
    }

    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setCharge(String charge) {
      this.charge = charge;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RefundCreateParams#expand} for the field documentation.
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
     * RefundCreateParams#expand} for the field documentation.
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
     * RefundCreateParams#extraParams} for the field documentation.
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
     * See {@link RefundCreateParams#extraParams} for the field documentation.
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
     * RefundCreateParams#metadata} for the field documentation.
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
     * See {@link RefundCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    public Builder setReason(Reason reason) {
      this.reason = reason;
      return this;
    }

    public Builder setRefundApplicationFee(Boolean refundApplicationFee) {
      this.refundApplicationFee = refundApplicationFee;
      return this;
    }

    public Builder setReverseTransfer(Boolean reverseTransfer) {
      this.reverseTransfer = reverseTransfer;
      return this;
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("requested_by_customer")
    REQUESTED_BY_CUSTOMER("requested_by_customer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
