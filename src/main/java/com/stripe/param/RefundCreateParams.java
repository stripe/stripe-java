// File generated from our OpenAPI spec
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
public class RefundCreateParams extends ApiRequestParams {
  /** A positive integer representing how much to refund. */
  @SerializedName("amount")
  Long amount;

  @SerializedName("charge")
  String charge;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Customer whose customer balance to refund from. */
  @SerializedName("customer")
  String customer;

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

  /** Address to send refund email, use customer email if not specified. */
  @SerializedName("instructions_email")
  String instructionsEmail;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Origin of the refund. */
  @SerializedName("origin")
  Origin origin;

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
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String instructionsEmail,
      Object metadata,
      Origin origin,
      String paymentIntent,
      Reason reason,
      Boolean refundApplicationFee,
      Boolean reverseTransfer) {
    this.amount = amount;
    this.charge = charge;
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.instructionsEmail = instructionsEmail;
    this.metadata = metadata;
    this.origin = origin;
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

    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String instructionsEmail;

    private Object metadata;

    private Origin origin;

    private String paymentIntent;

    private Reason reason;

    private Boolean refundApplicationFee;

    private Boolean reverseTransfer;

    /** Finalize and obtain parameter instance from this builder. */
    public RefundCreateParams build() {
      return new RefundCreateParams(
          this.amount,
          this.charge,
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.instructionsEmail,
          this.metadata,
          this.origin,
          this.paymentIntent,
          this.reason,
          this.refundApplicationFee,
          this.reverseTransfer);
    }

    /** A positive integer representing how much to refund. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setCharge(String charge) {
      this.charge = charge;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** Customer whose customer balance to refund from. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
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

    /** Address to send refund email, use customer email if not specified. */
    public Builder setInstructionsEmail(String instructionsEmail) {
      this.instructionsEmail = instructionsEmail;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RefundCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RefundCreateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** Origin of the refund. */
    public Builder setOrigin(RefundCreateParams.Origin origin) {
      this.origin = origin;
      return this;
    }

    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    public Builder setReason(RefundCreateParams.Reason reason) {
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

  public enum Origin implements ApiRequestParams.EnumParam {
    @SerializedName("customer_balance")
    CUSTOMER_BALANCE("customer_balance");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Origin(String value) {
      this.value = value;
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
