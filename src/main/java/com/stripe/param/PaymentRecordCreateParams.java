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
public class PaymentRecordCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The amount that has been lost to the customer due to disputes on
   * this payment.
   */
  @SerializedName("amount")
  Amount amount;

  /** Information about the dispute closing. */
  @SerializedName("closed")
  Closed closed;

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

  /** Information about the dispute funding event. */
  @SerializedName("funded")
  Funded funded;

  /** When the reported payment was initiated. Measured in seconds since the Unix epoch. */
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

  /** <strong>Required.</strong> Processor information for this payment. */
  @SerializedName("processor_details")
  ProcessorDetails processorDetails;

  /** The reason the payment was disputed. */
  @SerializedName("reason")
  Reason reason;

  private PaymentRecordCreateParams(
      Amount amount,
      Closed closed,
      List<String> expand,
      Map<String, Object> extraParams,
      Funded funded,
      Long initiatedAt,
      Object metadata,
      ProcessorDetails processorDetails,
      Reason reason) {
    this.amount = amount;
    this.closed = closed;
    this.expand = expand;
    this.extraParams = extraParams;
    this.funded = funded;
    this.initiatedAt = initiatedAt;
    this.metadata = metadata;
    this.processorDetails = processorDetails;
    this.reason = reason;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Closed closed;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Funded funded;

    private Long initiatedAt;

    private Object metadata;

    private ProcessorDetails processorDetails;

    private Reason reason;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRecordCreateParams build() {
      return new PaymentRecordCreateParams(
          this.amount,
          this.closed,
          this.expand,
          this.extraParams,
          this.funded,
          this.initiatedAt,
          this.metadata,
          this.processorDetails,
          this.reason);
    }

    /**
     * <strong>Required.</strong> The amount that has been lost to the customer due to disputes on
     * this payment.
     */
    public Builder setAmount(PaymentRecordCreateParams.Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Information about the dispute closing. */
    public Builder setClosed(PaymentRecordCreateParams.Closed closed) {
      this.closed = closed;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentRecordCreateParams#expand} for the field documentation.
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
     * PaymentRecordCreateParams#expand} for the field documentation.
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
     * PaymentRecordCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentRecordCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the dispute funding event. */
    public Builder setFunded(PaymentRecordCreateParams.Funded funded) {
      this.funded = funded;
      return this;
    }

    /** When the reported payment was initiated. Measured in seconds since the Unix epoch. */
    public Builder setInitiatedAt(Long initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRecordCreateParams#metadata} for the field documentation.
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
     * See {@link PaymentRecordCreateParams#metadata} for the field documentation.
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

    /** <strong>Required.</strong> Processor information for this payment. */
    public Builder setProcessorDetails(
        PaymentRecordCreateParams.ProcessorDetails processorDetails) {
      this.processorDetails = processorDetails;
      return this;
    }

    /** The reason the payment was disputed. */
    public Builder setReason(PaymentRecordCreateParams.Reason reason) {
      this.reason = reason;
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
      public PaymentRecordCreateParams.Amount build() {
        return new PaymentRecordCreateParams.Amount(this.currency, this.extraParams, this.value);
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
       * PaymentRecordCreateParams.Amount#extraParams} for the field documentation.
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
       * See {@link PaymentRecordCreateParams.Amount#extraParams} for the field documentation.
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
  public static class Closed {
    /**
     * <strong>Required.</strong> When the dispute was closed. Measured in seconds since the Unix
     * epoch.
     */
    @SerializedName("closed_at")
    Long closedAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Closed(Long closedAt, Map<String, Object> extraParams) {
      this.closedAt = closedAt;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long closedAt;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordCreateParams.Closed build() {
        return new PaymentRecordCreateParams.Closed(this.closedAt, this.extraParams);
      }

      /**
       * <strong>Required.</strong> When the dispute was closed. Measured in seconds since the Unix
       * epoch.
       */
      public Builder setClosedAt(Long closedAt) {
        this.closedAt = closedAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordCreateParams.Closed#extraParams} for the field documentation.
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
       * See {@link PaymentRecordCreateParams.Closed#extraParams} for the field documentation.
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Funded {
    /**
     * <strong>Required.</strong> The amount that has been lost to the customer due to disputes on
     * this payment.
     */
    @SerializedName("amount")
    Amount amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the dispute funding event occurred. Measured in seconds since
     * the Unix epoch.
     */
    @SerializedName("funded_at")
    Long fundedAt;

    /** <strong>Required.</strong> The type of dispute funding event. */
    @SerializedName("type")
    Type type;

    private Funded(Amount amount, Map<String, Object> extraParams, Long fundedAt, Type type) {
      this.amount = amount;
      this.extraParams = extraParams;
      this.fundedAt = fundedAt;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Amount amount;

      private Map<String, Object> extraParams;

      private Long fundedAt;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordCreateParams.Funded build() {
        return new PaymentRecordCreateParams.Funded(
            this.amount, this.extraParams, this.fundedAt, this.type);
      }

      /**
       * <strong>Required.</strong> The amount that has been lost to the customer due to disputes on
       * this payment.
       */
      public Builder setAmount(PaymentRecordCreateParams.Funded.Amount amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordCreateParams.Funded#extraParams} for the field documentation.
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
       * See {@link PaymentRecordCreateParams.Funded#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> When the dispute funding event occurred. Measured in seconds
       * since the Unix epoch.
       */
      public Builder setFundedAt(Long fundedAt) {
        this.fundedAt = fundedAt;
        return this;
      }

      /** <strong>Required.</strong> The type of dispute funding event. */
      public Builder setType(PaymentRecordCreateParams.Funded.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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
        public PaymentRecordCreateParams.Funded.Amount build() {
          return new PaymentRecordCreateParams.Funded.Amount(
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordCreateParams.Funded.Amount#extraParams} for the field
         * documentation.
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
         * map. See {@link PaymentRecordCreateParams.Funded.Amount#extraParams} for the field
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
         * <strong>Required.</strong> A positive integer representing the amount in the currency's
         * <a href="https://docs.stripe.com/currencies#zero-decimal">minor unit</a>. For example,
         * {@code 100} can represent 1 USD or 100 JPY.
         */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("withdrawn")
      WITHDRAWN("withdrawn");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ProcessorDetails {
    /** Information about the custom processor used to make this payment. */
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
      public PaymentRecordCreateParams.ProcessorDetails build() {
        return new PaymentRecordCreateParams.ProcessorDetails(
            this.custom, this.extraParams, this.type);
      }

      /** Information about the custom processor used to make this payment. */
      public Builder setCustom(PaymentRecordCreateParams.ProcessorDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordCreateParams.ProcessorDetails#extraParams} for the field documentation.
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
       * See {@link PaymentRecordCreateParams.ProcessorDetails#extraParams} for the field
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
      public Builder setType(PaymentRecordCreateParams.ProcessorDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom {
      /**
       * <strong>Required.</strong> A reference to the external dispute. This field must be unique
       * across all disputes.
       */
      @SerializedName("dispute_reference")
      String disputeReference;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Custom(String disputeReference, Map<String, Object> extraParams) {
        this.disputeReference = disputeReference;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String disputeReference;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordCreateParams.ProcessorDetails.Custom build() {
          return new PaymentRecordCreateParams.ProcessorDetails.Custom(
              this.disputeReference, this.extraParams);
        }

        /**
         * <strong>Required.</strong> A reference to the external dispute. This field must be unique
         * across all disputes.
         */
        public Builder setDisputeReference(String disputeReference) {
          this.disputeReference = disputeReference;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordCreateParams.ProcessorDetails.Custom#extraParams} for the
         * field documentation.
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
         * map. See {@link PaymentRecordCreateParams.ProcessorDetails.Custom#extraParams} for the
         * field documentation.
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

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("bank_cannot_process")
    BANK_CANNOT_PROCESS("bank_cannot_process"),

    @SerializedName("check_returned")
    CHECK_RETURNED("check_returned"),

    @SerializedName("credit_not_processed")
    CREDIT_NOT_PROCESSED("credit_not_processed"),

    @SerializedName("customer_initiated")
    CUSTOMER_INITIATED("customer_initiated"),

    @SerializedName("debit_not_authorized")
    DEBIT_NOT_AUTHORIZED("debit_not_authorized"),

    @SerializedName("duplicate")
    DUPLICATE("duplicate"),

    @SerializedName("fraudulent")
    FRAUDULENT("fraudulent"),

    @SerializedName("general")
    GENERAL("general"),

    @SerializedName("incorrect_account_details")
    INCORRECT_ACCOUNT_DETAILS("incorrect_account_details"),

    @SerializedName("insufficient_funds")
    INSUFFICIENT_FUNDS("insufficient_funds"),

    @SerializedName("noncompliant")
    NONCOMPLIANT("noncompliant"),

    @SerializedName("product_not_received")
    PRODUCT_NOT_RECEIVED("product_not_received"),

    @SerializedName("product_unacceptable")
    PRODUCT_UNACCEPTABLE("product_unacceptable"),

    @SerializedName("subscription_canceled")
    SUBSCRIPTION_CANCELED("subscription_canceled"),

    @SerializedName("unrecognized")
    UNRECOGNIZED("unrecognized");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
