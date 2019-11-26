package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CreditNotePreviewParams extends ApiRequestParams {
  /** The integer amount in **%s** representing the total amount of the credit note. */
  @SerializedName("amount")
  Long amount;

  /**
   * The integer amount in **%s** representing the amount to credit the customer's balance, which
   * will be automatically applied to their next invoice.
   */
  @SerializedName("credit_amount")
  Long creditAmount;

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

  /** ID of the invoice. */
  @SerializedName("invoice")
  String invoice;

  /** The credit note's memo appears on the credit note PDF. */
  @SerializedName("memo")
  String memo;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The integer amount in **%s** representing the amount that is credited outside of Stripe. */
  @SerializedName("out_of_band_amount")
  Long outOfBandAmount;

  /**
   * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or
   * `product_unsatisfactory`.
   */
  @SerializedName("reason")
  Reason reason;

  /** ID of an existing refund to link this credit note to. */
  @SerializedName("refund")
  String refund;

  /**
   * The integer amount in **%s** representing the amount to refund. If set, a refund will be
   * created for the charge associated with the invoice.
   */
  @SerializedName("refund_amount")
  Long refundAmount;

  private CreditNotePreviewParams(
      Long amount,
      Long creditAmount,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoice,
      String memo,
      Map<String, String> metadata,
      Long outOfBandAmount,
      Reason reason,
      String refund,
      Long refundAmount) {
    this.amount = amount;
    this.creditAmount = creditAmount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.memo = memo;
    this.metadata = metadata;
    this.outOfBandAmount = outOfBandAmount;
    this.reason = reason;
    this.refund = refund;
    this.refundAmount = refundAmount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long creditAmount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoice;

    private String memo;

    private Map<String, String> metadata;

    private Long outOfBandAmount;

    private Reason reason;

    private String refund;

    private Long refundAmount;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditNotePreviewParams build() {
      return new CreditNotePreviewParams(
          this.amount,
          this.creditAmount,
          this.expand,
          this.extraParams,
          this.invoice,
          this.memo,
          this.metadata,
          this.outOfBandAmount,
          this.reason,
          this.refund,
          this.refundAmount);
    }

    /** The integer amount in **%s** representing the total amount of the credit note. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The integer amount in **%s** representing the amount to credit the customer's balance, which
     * will be automatically applied to their next invoice.
     */
    public Builder setCreditAmount(Long creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditNotePreviewParams#expand} for the field documentation.
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
     * CreditNotePreviewParams#expand} for the field documentation.
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
     * CreditNotePreviewParams#extraParams} for the field documentation.
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
     * See {@link CreditNotePreviewParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** ID of the invoice. */
    public Builder setInvoice(String invoice) {
      this.invoice = invoice;
      return this;
    }

    /** The credit note's memo appears on the credit note PDF. */
    public Builder setMemo(String memo) {
      this.memo = memo;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CreditNotePreviewParams#metadata} for the field documentation.
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
     * See {@link CreditNotePreviewParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The integer amount in **%s** representing the amount that is credited outside of Stripe. */
    public Builder setOutOfBandAmount(Long outOfBandAmount) {
      this.outOfBandAmount = outOfBandAmount;
      return this;
    }

    /**
     * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or
     * `product_unsatisfactory`.
     */
    public Builder setReason(Reason reason) {
      this.reason = reason;
      return this;
    }

    /** ID of an existing refund to link this credit note to. */
    public Builder setRefund(String refund) {
      this.refund = refund;
      return this;
    }

    /**
     * The integer amount in **%s** representing the amount to refund. If set, a refund will be
     * created for the charge associated with the invoice.
     */
    public Builder setRefundAmount(Long refundAmount) {
      this.refundAmount = refundAmount;
      return this;
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("order_change")
    ORDER_CHANGE("order_change"),

    @SerializedName("product_unsatisfactory")
    PRODUCT_UNSATISFACTORY("product_unsatisfactory");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
