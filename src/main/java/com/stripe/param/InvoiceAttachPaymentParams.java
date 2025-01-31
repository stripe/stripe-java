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
public class InvoiceAttachPaymentParams extends ApiRequestParams {
  /**
   * The portion of the {@code amount} on the PaymentIntent or out of band payment to apply to this
   * invoice. It defaults to the entire amount.
   */
  @SerializedName("amount_requested")
  Long amountRequested;

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

  /** The ID of the PaymentIntent to attach to the invoice. */
  @SerializedName("payment_intent")
  String paymentIntent;

  /** The ID of the PaymentRecord to attach to the invoice. */
  @SerializedName("payment_record")
  String paymentRecord;

  /** The PaymentRecord data for attaching an out of band payment to the invoice. */
  @SerializedName("payment_record_data")
  PaymentRecordData paymentRecordData;

  private InvoiceAttachPaymentParams(
      Long amountRequested,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentIntent,
      String paymentRecord,
      PaymentRecordData paymentRecordData) {
    this.amountRequested = amountRequested;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentIntent = paymentIntent;
    this.paymentRecord = paymentRecord;
    this.paymentRecordData = paymentRecordData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amountRequested;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentIntent;

    private String paymentRecord;

    private PaymentRecordData paymentRecordData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceAttachPaymentParams build() {
      return new InvoiceAttachPaymentParams(
          this.amountRequested,
          this.expand,
          this.extraParams,
          this.paymentIntent,
          this.paymentRecord,
          this.paymentRecordData);
    }

    /**
     * The portion of the {@code amount} on the PaymentIntent or out of band payment to apply to
     * this invoice. It defaults to the entire amount.
     */
    public Builder setAmountRequested(Long amountRequested) {
      this.amountRequested = amountRequested;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceAttachPaymentParams#expand} for the field documentation.
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
     * InvoiceAttachPaymentParams#expand} for the field documentation.
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
     * InvoiceAttachPaymentParams#extraParams} for the field documentation.
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
     * See {@link InvoiceAttachPaymentParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The ID of the PaymentIntent to attach to the invoice. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** The ID of the PaymentRecord to attach to the invoice. */
    public Builder setPaymentRecord(String paymentRecord) {
      this.paymentRecord = paymentRecord;
      return this;
    }

    /** The PaymentRecord data for attaching an out of band payment to the invoice. */
    public Builder setPaymentRecordData(
        InvoiceAttachPaymentParams.PaymentRecordData paymentRecordData) {
      this.paymentRecordData = paymentRecordData;
      return this;
    }
  }

  @Getter
  public static class PaymentRecordData {
    /** <strong>Required.</strong> The amount that was paid out of band. */
    @SerializedName("amount")
    Long amount;

    /** <strong>Required.</strong> The currency that was paid out of band. */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Object metadata;

    /**
     * <strong>Required.</strong> The type of money movement for this out of band payment record.
     */
    @SerializedName("money_movement_type")
    String moneyMovementType;

    /** The timestamp when this out of band payment was paid. */
    @SerializedName("paid_at")
    Long paidAt;

    /** The reference for this out of band payment record. */
    @SerializedName("payment_reference")
    String paymentReference;

    private PaymentRecordData(
        Long amount,
        String currency,
        Map<String, Object> extraParams,
        Object metadata,
        String moneyMovementType,
        Long paidAt,
        String paymentReference) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.moneyMovementType = moneyMovementType;
      this.paidAt = paidAt;
      this.paymentReference = paymentReference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private Map<String, Object> extraParams;

      private Object metadata;

      private String moneyMovementType;

      private Long paidAt;

      private String paymentReference;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceAttachPaymentParams.PaymentRecordData build() {
        return new InvoiceAttachPaymentParams.PaymentRecordData(
            this.amount,
            this.currency,
            this.extraParams,
            this.metadata,
            this.moneyMovementType,
            this.paidAt,
            this.paymentReference);
      }

      /** <strong>Required.</strong> The amount that was paid out of band. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** <strong>Required.</strong> The currency that was paid out of band. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceAttachPaymentParams.PaymentRecordData#extraParams} for the field documentation.
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
       * See {@link InvoiceAttachPaymentParams.PaymentRecordData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceAttachPaymentParams.PaymentRecordData#metadata} for the field documentation.
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
       * See {@link InvoiceAttachPaymentParams.PaymentRecordData#metadata} for the field
       * documentation.
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
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of money movement for this out of band payment record.
       */
      public Builder setMoneyMovementType(String moneyMovementType) {
        this.moneyMovementType = moneyMovementType;
        return this;
      }

      /** The timestamp when this out of band payment was paid. */
      public Builder setPaidAt(Long paidAt) {
        this.paidAt = paidAt;
        return this;
      }

      /** The reference for this out of band payment record. */
      public Builder setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
        return this;
      }
    }
  }
}
