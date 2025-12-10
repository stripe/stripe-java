// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentRecordReportRefundParams extends ApiRequestParams {
  /**
   * A positive integer in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
   * currency unit</a> representing how much of this payment to refund. Can refund only up to the
   * remaining, unrefunded amount of the payment.
   */
  @SerializedName("amount")
  Amount amount;

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

  /** When the reported refund was initiated. Measured in seconds since the Unix epoch. */
  @SerializedName("initiated_at")
  Long initiatedAt;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** <strong>Required.</strong> The outcome of the reported refund. */
  @SerializedName("outcome")
  Outcome outcome;

  /** <strong>Required.</strong> Processor information for this refund. */
  @SerializedName("processor_details")
  ProcessorDetails processorDetails;

  /** <strong>Required.</strong> Information about the payment attempt refund. */
  @SerializedName("refunded")
  Refunded refunded;

  private PaymentRecordReportRefundParams(
      Amount amount,
      List<String> expand,
      Map<String, Object> extraParams,
      Long initiatedAt,
      Object metadata,
      Outcome outcome,
      ProcessorDetails processorDetails,
      Refunded refunded) {
    this.amount = amount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.initiatedAt = initiatedAt;
    this.metadata = metadata;
    this.outcome = outcome;
    this.processorDetails = processorDetails;
    this.refunded = refunded;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long initiatedAt;

    private Object metadata;

    private Outcome outcome;

    private ProcessorDetails processorDetails;

    private Refunded refunded;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRecordReportRefundParams build() {
      return new PaymentRecordReportRefundParams(
          this.amount,
          this.expand,
          this.extraParams,
          this.initiatedAt,
          this.metadata,
          this.outcome,
          this.processorDetails,
          this.refunded);
    }

    /**
     * A positive integer in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
     * currency unit</a> representing how much of this payment to refund. Can refund only up to the
     * remaining, unrefunded amount of the payment.
     */
    public Builder setAmount(PaymentRecordReportRefundParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentRecordReportRefundParams#expand} for the field documentation.
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
     * PaymentRecordReportRefundParams#expand} for the field documentation.
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
     * PaymentRecordReportRefundParams#extraParams} for the field documentation.
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
     * See {@link PaymentRecordReportRefundParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** When the reported refund was initiated. Measured in seconds since the Unix epoch. */
    public Builder setInitiatedAt(Long initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRecordReportRefundParams#metadata} for the field documentation.
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
     * See {@link PaymentRecordReportRefundParams#metadata} for the field documentation.
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
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** <strong>Required.</strong> The outcome of the reported refund. */
    public Builder setOutcome(PaymentRecordReportRefundParams.Outcome outcome) {
      this.outcome = outcome;
      return this;
    }

    /** <strong>Required.</strong> Processor information for this refund. */
    public Builder setProcessorDetails(
        PaymentRecordReportRefundParams.ProcessorDetails processorDetails) {
      this.processorDetails = processorDetails;
      return this;
    }

    /** <strong>Required.</strong> Information about the payment attempt refund. */
    public Builder setRefunded(PaymentRecordReportRefundParams.Refunded refunded) {
      this.refunded = refunded;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
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
     * <strong>Required.</strong> A positive integer representing the amount in the currency's <a
     * href="https://docs.stripe.com/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;

    private Amount(String currency, Map<String, Object> extraParams, Long value) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private Long value;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportRefundParams.Amount build() {
        return new PaymentRecordReportRefundParams.Amount(
            this.currency, this.extraParams, this.value);
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportRefundParams.Amount#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportRefundParams.Amount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> A positive integer representing the amount in the currency's <a
       * href="https://docs.stripe.com/currencies#zero-decimal">minor unit</a>. For example, {@code
       * 100} can represent 1 USD or 100 JPY.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ProcessorDetails {
    /** Information about the custom processor used to make this refund. */
    @SerializedName("custom")
    Custom custom;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The type of the processor details. An additional hash is included
     * on processor_details with a name matching this value. It contains additional information
     * specific to the processor.
     */
    @SerializedName("type")
    Type type;

    private ProcessorDetails(Custom custom, Map<String, Object> extraParams, Type type) {
      this.custom = custom;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Custom custom;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportRefundParams.ProcessorDetails build() {
        return new PaymentRecordReportRefundParams.ProcessorDetails(
            this.custom, this.extraParams, this.type);
      }

      /** Information about the custom processor used to make this refund. */
      public Builder setCustom(PaymentRecordReportRefundParams.ProcessorDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportRefundParams.ProcessorDetails#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportRefundParams.ProcessorDetails#extraParams} for the field
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
       * <strong>Required.</strong> The type of the processor details. An additional hash is
       * included on processor_details with a name matching this value. It contains additional
       * information specific to the processor.
       */
      public Builder setType(PaymentRecordReportRefundParams.ProcessorDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A reference to the external refund. This field must be unique
       * across all refunds.
       */
      @SerializedName("refund_reference")
      String refundReference;

      private Custom(Map<String, Object> extraParams, String refundReference) {
        this.extraParams = extraParams;
        this.refundReference = refundReference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String refundReference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportRefundParams.ProcessorDetails.Custom build() {
          return new PaymentRecordReportRefundParams.ProcessorDetails.Custom(
              this.extraParams, this.refundReference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordReportRefundParams.ProcessorDetails.Custom#extraParams} for
         * the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordReportRefundParams.ProcessorDetails.Custom#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> A reference to the external refund. This field must be unique
         * across all refunds.
         */
        public Builder setRefundReference(String refundReference) {
          this.refundReference = refundReference;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("custom")
      CUSTOM("custom");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Refunded {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the reported refund completed. Measured in seconds since the
     * Unix epoch.
     */
    @SerializedName("refunded_at")
    Long refundedAt;

    private Refunded(Map<String, Object> extraParams, Long refundedAt) {
      this.extraParams = extraParams;
      this.refundedAt = refundedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long refundedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportRefundParams.Refunded build() {
        return new PaymentRecordReportRefundParams.Refunded(this.extraParams, this.refundedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportRefundParams.Refunded#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportRefundParams.Refunded#extraParams} for the field
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
       * <strong>Required.</strong> When the reported refund completed. Measured in seconds since
       * the Unix epoch.
       */
      public Builder setRefundedAt(Long refundedAt) {
        this.refundedAt = refundedAt;
        return this;
      }
    }
  }

  public enum Outcome implements ApiRequestParams.EnumParam {
    @SerializedName("refunded")
    REFUNDED("refunded");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Outcome(String value) {
      this.value = value;
    }
  }
}
