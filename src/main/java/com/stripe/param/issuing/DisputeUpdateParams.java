// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class DisputeUpdateParams extends ApiRequestParams {
  /** Evidence provided for the dispute. */
  @SerializedName("evidence")
  Evidence evidence;

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

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  private DisputeUpdateParams(
      Evidence evidence, List<String> expand, Map<String, Object> extraParams, Object metadata) {
    this.evidence = evidence;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Evidence evidence;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeUpdateParams build() {
      return new DisputeUpdateParams(this.evidence, this.expand, this.extraParams, this.metadata);
    }

    /** Evidence provided for the dispute. */
    public Builder setEvidence(Evidence evidence) {
      this.evidence = evidence;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeUpdateParams#expand} for the field documentation.
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
     * DisputeUpdateParams#expand} for the field documentation.
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
     * DisputeUpdateParams#extraParams} for the field documentation.
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
     * See {@link DisputeUpdateParams#extraParams} for the field documentation.
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
     * DisputeUpdateParams#metadata} for the field documentation.
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
     * See {@link DisputeUpdateParams#metadata} for the field documentation.
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
  }

  @Getter
  public static class Evidence {
    /** Evidence provided when {@code reason} is 'canceled'. */
    @SerializedName("canceled")
    Object canceled;

    /** Evidence provided when {@code reason} is 'duplicate'. */
    @SerializedName("duplicate")
    Object duplicate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Evidence provided when {@code reason} is 'fraudulent'. */
    @SerializedName("fraudulent")
    Object fraudulent;

    /** Evidence provided when {@code reason} is 'merchandise_not_as_described'. */
    @SerializedName("merchandise_not_as_described")
    Object merchandiseNotAsDescribed;

    /** Evidence provided when {@code reason} is 'not_received'. */
    @SerializedName("not_received")
    Object notReceived;

    /** Evidence provided when {@code reason} is 'other'. */
    @SerializedName("other")
    Object other;

    /**
     * The reason for filing the dispute. The evidence should be submitted in the field of the same
     * name.
     */
    @SerializedName("reason")
    Reason reason;

    /** Evidence provided when {@code reason} is 'service_not_as_described'. */
    @SerializedName("service_not_as_described")
    Object serviceNotAsDescribed;

    private Evidence(
        Object canceled,
        Object duplicate,
        Map<String, Object> extraParams,
        Object fraudulent,
        Object merchandiseNotAsDescribed,
        Object notReceived,
        Object other,
        Reason reason,
        Object serviceNotAsDescribed) {
      this.canceled = canceled;
      this.duplicate = duplicate;
      this.extraParams = extraParams;
      this.fraudulent = fraudulent;
      this.merchandiseNotAsDescribed = merchandiseNotAsDescribed;
      this.notReceived = notReceived;
      this.other = other;
      this.reason = reason;
      this.serviceNotAsDescribed = serviceNotAsDescribed;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object canceled;

      private Object duplicate;

      private Map<String, Object> extraParams;

      private Object fraudulent;

      private Object merchandiseNotAsDescribed;

      private Object notReceived;

      private Object other;

      private Reason reason;

      private Object serviceNotAsDescribed;

      /** Finalize and obtain parameter instance from this builder. */
      public Evidence build() {
        return new Evidence(
            this.canceled,
            this.duplicate,
            this.extraParams,
            this.fraudulent,
            this.merchandiseNotAsDescribed,
            this.notReceived,
            this.other,
            this.reason,
            this.serviceNotAsDescribed);
      }

      /** Evidence provided when {@code reason} is 'canceled'. */
      public Builder setCanceled(Canceled canceled) {
        this.canceled = canceled;
        return this;
      }

      /** Evidence provided when {@code reason} is 'canceled'. */
      public Builder setCanceled(EmptyParam canceled) {
        this.canceled = canceled;
        return this;
      }

      /** Evidence provided when {@code reason} is 'duplicate'. */
      public Builder setDuplicate(Duplicate duplicate) {
        this.duplicate = duplicate;
        return this;
      }

      /** Evidence provided when {@code reason} is 'duplicate'. */
      public Builder setDuplicate(EmptyParam duplicate) {
        this.duplicate = duplicate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeUpdateParams.Evidence#extraParams} for the field documentation.
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
       * See {@link DisputeUpdateParams.Evidence#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Evidence provided when {@code reason} is 'fraudulent'. */
      public Builder setFraudulent(Fraudulent fraudulent) {
        this.fraudulent = fraudulent;
        return this;
      }

      /** Evidence provided when {@code reason} is 'fraudulent'. */
      public Builder setFraudulent(EmptyParam fraudulent) {
        this.fraudulent = fraudulent;
        return this;
      }

      /** Evidence provided when {@code reason} is 'merchandise_not_as_described'. */
      public Builder setMerchandiseNotAsDescribed(
          MerchandiseNotAsDescribed merchandiseNotAsDescribed) {
        this.merchandiseNotAsDescribed = merchandiseNotAsDescribed;
        return this;
      }

      /** Evidence provided when {@code reason} is 'merchandise_not_as_described'. */
      public Builder setMerchandiseNotAsDescribed(EmptyParam merchandiseNotAsDescribed) {
        this.merchandiseNotAsDescribed = merchandiseNotAsDescribed;
        return this;
      }

      /** Evidence provided when {@code reason} is 'not_received'. */
      public Builder setNotReceived(NotReceived notReceived) {
        this.notReceived = notReceived;
        return this;
      }

      /** Evidence provided when {@code reason} is 'not_received'. */
      public Builder setNotReceived(EmptyParam notReceived) {
        this.notReceived = notReceived;
        return this;
      }

      /** Evidence provided when {@code reason} is 'other'. */
      public Builder setOther(Other other) {
        this.other = other;
        return this;
      }

      /** Evidence provided when {@code reason} is 'other'. */
      public Builder setOther(EmptyParam other) {
        this.other = other;
        return this;
      }

      /**
       * The reason for filing the dispute. The evidence should be submitted in the field of the
       * same name.
       */
      public Builder setReason(Reason reason) {
        this.reason = reason;
        return this;
      }

      /** Evidence provided when {@code reason} is 'service_not_as_described'. */
      public Builder setServiceNotAsDescribed(ServiceNotAsDescribed serviceNotAsDescribed) {
        this.serviceNotAsDescribed = serviceNotAsDescribed;
        return this;
      }

      /** Evidence provided when {@code reason} is 'service_not_as_described'. */
      public Builder setServiceNotAsDescribed(EmptyParam serviceNotAsDescribed) {
        this.serviceNotAsDescribed = serviceNotAsDescribed;
        return this;
      }
    }

    @Getter
    public static class Canceled {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Date when order was canceled. */
      @SerializedName("canceled_at")
      Object canceledAt;

      /** Whether the cardholder was provided with a cancellation policy. */
      @SerializedName("cancellation_policy_provided")
      Object cancellationPolicyProvided;

      /** Reason for canceling the order. */
      @SerializedName("cancellation_reason")
      Object cancellationReason;

      /** Date when the cardholder expected to receive the product. */
      @SerializedName("expected_at")
      Object expectedAt;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      Object productDescription;

      /** Whether the product was a merchandise or service. */
      @SerializedName("product_type")
      EnumParam productType;

      /** Result of cardholder's attempt to return the product. */
      @SerializedName("return_status")
      EnumParam returnStatus;

      /** Date when the product was returned or attempted to be returned. */
      @SerializedName("returned_at")
      Object returnedAt;

      private Canceled(
          Object additionalDocumentation,
          Object canceledAt,
          Object cancellationPolicyProvided,
          Object cancellationReason,
          Object expectedAt,
          Object explanation,
          Map<String, Object> extraParams,
          Object productDescription,
          EnumParam productType,
          EnumParam returnStatus,
          Object returnedAt) {
        this.additionalDocumentation = additionalDocumentation;
        this.canceledAt = canceledAt;
        this.cancellationPolicyProvided = cancellationPolicyProvided;
        this.cancellationReason = cancellationReason;
        this.expectedAt = expectedAt;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.productDescription = productDescription;
        this.productType = productType;
        this.returnStatus = returnStatus;
        this.returnedAt = returnedAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object canceledAt;

        private Object cancellationPolicyProvided;

        private Object cancellationReason;

        private Object expectedAt;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object productDescription;

        private EnumParam productType;

        private EnumParam returnStatus;

        private Object returnedAt;

        /** Finalize and obtain parameter instance from this builder. */
        public Canceled build() {
          return new Canceled(
              this.additionalDocumentation,
              this.canceledAt,
              this.cancellationPolicyProvided,
              this.cancellationReason,
              this.expectedAt,
              this.explanation,
              this.extraParams,
              this.productDescription,
              this.productType,
              this.returnStatus,
              this.returnedAt);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Date when order was canceled. */
        public Builder setCanceledAt(Long canceledAt) {
          this.canceledAt = canceledAt;
          return this;
        }

        /** Date when order was canceled. */
        public Builder setCanceledAt(EmptyParam canceledAt) {
          this.canceledAt = canceledAt;
          return this;
        }

        /** Whether the cardholder was provided with a cancellation policy. */
        public Builder setCancellationPolicyProvided(Boolean cancellationPolicyProvided) {
          this.cancellationPolicyProvided = cancellationPolicyProvided;
          return this;
        }

        /** Whether the cardholder was provided with a cancellation policy. */
        public Builder setCancellationPolicyProvided(EmptyParam cancellationPolicyProvided) {
          this.cancellationPolicyProvided = cancellationPolicyProvided;
          return this;
        }

        /** Reason for canceling the order. */
        public Builder setCancellationReason(String cancellationReason) {
          this.cancellationReason = cancellationReason;
          return this;
        }

        /** Reason for canceling the order. */
        public Builder setCancellationReason(EmptyParam cancellationReason) {
          this.cancellationReason = cancellationReason;
          return this;
        }

        /** Date when the cardholder expected to receive the product. */
        public Builder setExpectedAt(Long expectedAt) {
          this.expectedAt = expectedAt;
          return this;
        }

        /** Date when the cardholder expected to receive the product. */
        public Builder setExpectedAt(EmptyParam expectedAt) {
          this.expectedAt = expectedAt;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.Canceled#extraParams} for the field
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
         * map. See {@link DisputeUpdateParams.Evidence.Canceled#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(EmptyParam productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(ProductType productType) {
          this.productType = productType;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(EmptyParam productType) {
          this.productType = productType;
          return this;
        }

        /** Result of cardholder's attempt to return the product. */
        public Builder setReturnStatus(ReturnStatus returnStatus) {
          this.returnStatus = returnStatus;
          return this;
        }

        /** Result of cardholder's attempt to return the product. */
        public Builder setReturnStatus(EmptyParam returnStatus) {
          this.returnStatus = returnStatus;
          return this;
        }

        /** Date when the product was returned or attempted to be returned. */
        public Builder setReturnedAt(Long returnedAt) {
          this.returnedAt = returnedAt;
          return this;
        }

        /** Date when the product was returned or attempted to be returned. */
        public Builder setReturnedAt(EmptyParam returnedAt) {
          this.returnedAt = returnedAt;
          return this;
        }
      }

      public enum ProductType implements ApiRequestParams.EnumParam {
        @SerializedName("merchandise")
        MERCHANDISE("merchandise"),

        @SerializedName("service")
        SERVICE("service");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProductType(String value) {
          this.value = value;
        }
      }

      public enum ReturnStatus implements ApiRequestParams.EnumParam {
        @SerializedName("merchant_rejected")
        MERCHANT_REJECTED("merchant_rejected"),

        @SerializedName("successful")
        SUCCESSFUL("successful");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ReturnStatus(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Duplicate {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of the
       * card statement showing that the product had already been paid for.
       */
      @SerializedName("card_statement")
      Object cardStatement;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of the
       * receipt showing that the product had been paid for in cash.
       */
      @SerializedName("cash_receipt")
      Object cashReceipt;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Image of the
       * front and back of the check that was used to pay for the product.
       */
      @SerializedName("check_image")
      Object checkImage;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two or
       * more transactions that are copies of each other, this is original undisputed one.
       */
      @SerializedName("original_transaction")
      Object originalTransaction;

      private Duplicate(
          Object additionalDocumentation,
          Object cardStatement,
          Object cashReceipt,
          Object checkImage,
          Object explanation,
          Map<String, Object> extraParams,
          Object originalTransaction) {
        this.additionalDocumentation = additionalDocumentation;
        this.cardStatement = cardStatement;
        this.cashReceipt = cashReceipt;
        this.checkImage = checkImage;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.originalTransaction = originalTransaction;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object cardStatement;

        private Object cashReceipt;

        private Object checkImage;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object originalTransaction;

        /** Finalize and obtain parameter instance from this builder. */
        public Duplicate build() {
          return new Duplicate(
              this.additionalDocumentation,
              this.cardStatement,
              this.cashReceipt,
              this.checkImage,
              this.explanation,
              this.extraParams,
              this.originalTransaction);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of
         * the card statement showing that the product had already been paid for.
         */
        public Builder setCardStatement(String cardStatement) {
          this.cardStatement = cardStatement;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of
         * the card statement showing that the product had already been paid for.
         */
        public Builder setCardStatement(EmptyParam cardStatement) {
          this.cardStatement = cardStatement;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of
         * the receipt showing that the product had been paid for in cash.
         */
        public Builder setCashReceipt(String cashReceipt) {
          this.cashReceipt = cashReceipt;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of
         * the receipt showing that the product had been paid for in cash.
         */
        public Builder setCashReceipt(EmptyParam cashReceipt) {
          this.cashReceipt = cashReceipt;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Image of
         * the front and back of the check that was used to pay for the product.
         */
        public Builder setCheckImage(String checkImage) {
          this.checkImage = checkImage;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Image of
         * the front and back of the check that was used to pay for the product.
         */
        public Builder setCheckImage(EmptyParam checkImage) {
          this.checkImage = checkImage;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.Duplicate#extraParams} for the field
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
         * map. See {@link DisputeUpdateParams.Evidence.Duplicate#extraParams} for the field
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
         * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two
         * or more transactions that are copies of each other, this is original undisputed one.
         */
        public Builder setOriginalTransaction(String originalTransaction) {
          this.originalTransaction = originalTransaction;
          return this;
        }

        /**
         * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two
         * or more transactions that are copies of each other, this is original undisputed one.
         */
        public Builder setOriginalTransaction(EmptyParam originalTransaction) {
          this.originalTransaction = originalTransaction;
          return this;
        }
      }
    }

    @Getter
    public static class Fraudulent {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Fraudulent(
          Object additionalDocumentation, Object explanation, Map<String, Object> extraParams) {
        this.additionalDocumentation = additionalDocumentation;
        this.explanation = explanation;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object explanation;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public Fraudulent build() {
          return new Fraudulent(this.additionalDocumentation, this.explanation, this.extraParams);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.Fraudulent#extraParams} for the field
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
         * map. See {@link DisputeUpdateParams.Evidence.Fraudulent#extraParams} for the field
         * documentation.
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
    public static class MerchandiseNotAsDescribed {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Date when the product was received. */
      @SerializedName("received_at")
      Object receivedAt;

      /** Description of the cardholder's attempt to return the product. */
      @SerializedName("return_description")
      Object returnDescription;

      /** Result of cardholder's attempt to return the product. */
      @SerializedName("return_status")
      EnumParam returnStatus;

      /** Date when the product was returned or attempted to be returned. */
      @SerializedName("returned_at")
      Object returnedAt;

      private MerchandiseNotAsDescribed(
          Object additionalDocumentation,
          Object explanation,
          Map<String, Object> extraParams,
          Object receivedAt,
          Object returnDescription,
          EnumParam returnStatus,
          Object returnedAt) {
        this.additionalDocumentation = additionalDocumentation;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.receivedAt = receivedAt;
        this.returnDescription = returnDescription;
        this.returnStatus = returnStatus;
        this.returnedAt = returnedAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object receivedAt;

        private Object returnDescription;

        private EnumParam returnStatus;

        private Object returnedAt;

        /** Finalize and obtain parameter instance from this builder. */
        public MerchandiseNotAsDescribed build() {
          return new MerchandiseNotAsDescribed(
              this.additionalDocumentation,
              this.explanation,
              this.extraParams,
              this.receivedAt,
              this.returnDescription,
              this.returnStatus,
              this.returnedAt);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.MerchandiseNotAsDescribed#extraParams} for
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
         * map. See {@link DisputeUpdateParams.Evidence.MerchandiseNotAsDescribed#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Date when the product was received. */
        public Builder setReceivedAt(Long receivedAt) {
          this.receivedAt = receivedAt;
          return this;
        }

        /** Date when the product was received. */
        public Builder setReceivedAt(EmptyParam receivedAt) {
          this.receivedAt = receivedAt;
          return this;
        }

        /** Description of the cardholder's attempt to return the product. */
        public Builder setReturnDescription(String returnDescription) {
          this.returnDescription = returnDescription;
          return this;
        }

        /** Description of the cardholder's attempt to return the product. */
        public Builder setReturnDescription(EmptyParam returnDescription) {
          this.returnDescription = returnDescription;
          return this;
        }

        /** Result of cardholder's attempt to return the product. */
        public Builder setReturnStatus(ReturnStatus returnStatus) {
          this.returnStatus = returnStatus;
          return this;
        }

        /** Result of cardholder's attempt to return the product. */
        public Builder setReturnStatus(EmptyParam returnStatus) {
          this.returnStatus = returnStatus;
          return this;
        }

        /** Date when the product was returned or attempted to be returned. */
        public Builder setReturnedAt(Long returnedAt) {
          this.returnedAt = returnedAt;
          return this;
        }

        /** Date when the product was returned or attempted to be returned. */
        public Builder setReturnedAt(EmptyParam returnedAt) {
          this.returnedAt = returnedAt;
          return this;
        }
      }

      public enum ReturnStatus implements ApiRequestParams.EnumParam {
        @SerializedName("merchant_rejected")
        MERCHANT_REJECTED("merchant_rejected"),

        @SerializedName("successful")
        SUCCESSFUL("successful");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ReturnStatus(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class NotReceived {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Date when the cardholder expected to receive the product. */
      @SerializedName("expected_at")
      Object expectedAt;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      Object productDescription;

      /** Whether the product was a merchandise or service. */
      @SerializedName("product_type")
      EnumParam productType;

      private NotReceived(
          Object additionalDocumentation,
          Object expectedAt,
          Object explanation,
          Map<String, Object> extraParams,
          Object productDescription,
          EnumParam productType) {
        this.additionalDocumentation = additionalDocumentation;
        this.expectedAt = expectedAt;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.productDescription = productDescription;
        this.productType = productType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object expectedAt;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object productDescription;

        private EnumParam productType;

        /** Finalize and obtain parameter instance from this builder. */
        public NotReceived build() {
          return new NotReceived(
              this.additionalDocumentation,
              this.expectedAt,
              this.explanation,
              this.extraParams,
              this.productDescription,
              this.productType);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Date when the cardholder expected to receive the product. */
        public Builder setExpectedAt(Long expectedAt) {
          this.expectedAt = expectedAt;
          return this;
        }

        /** Date when the cardholder expected to receive the product. */
        public Builder setExpectedAt(EmptyParam expectedAt) {
          this.expectedAt = expectedAt;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.NotReceived#extraParams} for the field
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
         * map. See {@link DisputeUpdateParams.Evidence.NotReceived#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(EmptyParam productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(ProductType productType) {
          this.productType = productType;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(EmptyParam productType) {
          this.productType = productType;
          return this;
        }
      }

      public enum ProductType implements ApiRequestParams.EnumParam {
        @SerializedName("merchandise")
        MERCHANDISE("merchandise"),

        @SerializedName("service")
        SERVICE("service");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProductType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Other {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      Object productDescription;

      /** Whether the product was a merchandise or service. */
      @SerializedName("product_type")
      EnumParam productType;

      private Other(
          Object additionalDocumentation,
          Object explanation,
          Map<String, Object> extraParams,
          Object productDescription,
          EnumParam productType) {
        this.additionalDocumentation = additionalDocumentation;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.productDescription = productDescription;
        this.productType = productType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object productDescription;

        private EnumParam productType;

        /** Finalize and obtain parameter instance from this builder. */
        public Other build() {
          return new Other(
              this.additionalDocumentation,
              this.explanation,
              this.extraParams,
              this.productDescription,
              this.productType);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.Other#extraParams} for the field
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
         * map. See {@link DisputeUpdateParams.Evidence.Other#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Description of the merchandise or service that was purchased. */
        public Builder setProductDescription(EmptyParam productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(ProductType productType) {
          this.productType = productType;
          return this;
        }

        /** Whether the product was a merchandise or service. */
        public Builder setProductType(EmptyParam productType) {
          this.productType = productType;
          return this;
        }
      }

      public enum ProductType implements ApiRequestParams.EnumParam {
        @SerializedName("merchandise")
        MERCHANDISE("merchandise"),

        @SerializedName("service")
        SERVICE("service");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ProductType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class ServiceNotAsDescribed {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      Object additionalDocumentation;

      /** Date when order was canceled. */
      @SerializedName("canceled_at")
      Object canceledAt;

      /** Reason for canceling the order. */
      @SerializedName("cancellation_reason")
      Object cancellationReason;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      Object explanation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Date when the product was received. */
      @SerializedName("received_at")
      Object receivedAt;

      private ServiceNotAsDescribed(
          Object additionalDocumentation,
          Object canceledAt,
          Object cancellationReason,
          Object explanation,
          Map<String, Object> extraParams,
          Object receivedAt) {
        this.additionalDocumentation = additionalDocumentation;
        this.canceledAt = canceledAt;
        this.cancellationReason = cancellationReason;
        this.explanation = explanation;
        this.extraParams = extraParams;
        this.receivedAt = receivedAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalDocumentation;

        private Object canceledAt;

        private Object cancellationReason;

        private Object explanation;

        private Map<String, Object> extraParams;

        private Object receivedAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ServiceNotAsDescribed build() {
          return new ServiceNotAsDescribed(
              this.additionalDocumentation,
              this.canceledAt,
              this.cancellationReason,
              this.explanation,
              this.extraParams,
              this.receivedAt);
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(String additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /**
         * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
         * documentation supporting the dispute.
         */
        public Builder setAdditionalDocumentation(EmptyParam additionalDocumentation) {
          this.additionalDocumentation = additionalDocumentation;
          return this;
        }

        /** Date when order was canceled. */
        public Builder setCanceledAt(Long canceledAt) {
          this.canceledAt = canceledAt;
          return this;
        }

        /** Date when order was canceled. */
        public Builder setCanceledAt(EmptyParam canceledAt) {
          this.canceledAt = canceledAt;
          return this;
        }

        /** Reason for canceling the order. */
        public Builder setCancellationReason(String cancellationReason) {
          this.cancellationReason = cancellationReason;
          return this;
        }

        /** Reason for canceling the order. */
        public Builder setCancellationReason(EmptyParam cancellationReason) {
          this.cancellationReason = cancellationReason;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(String explanation) {
          this.explanation = explanation;
          return this;
        }

        /** Explanation of why the cardholder is disputing this transaction. */
        public Builder setExplanation(EmptyParam explanation) {
          this.explanation = explanation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link DisputeUpdateParams.Evidence.ServiceNotAsDescribed#extraParams} for the
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
         * map. See {@link DisputeUpdateParams.Evidence.ServiceNotAsDescribed#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Date when the product was received. */
        public Builder setReceivedAt(Long receivedAt) {
          this.receivedAt = receivedAt;
          return this;
        }

        /** Date when the product was received. */
        public Builder setReceivedAt(EmptyParam receivedAt) {
          this.receivedAt = receivedAt;
          return this;
        }
      }
    }

    public enum Reason implements ApiRequestParams.EnumParam {
      @SerializedName("canceled")
      CANCELED("canceled"),

      @SerializedName("duplicate")
      DUPLICATE("duplicate"),

      @SerializedName("fraudulent")
      FRAUDULENT("fraudulent"),

      @SerializedName("merchandise_not_as_described")
      MERCHANDISE_NOT_AS_DESCRIBED("merchandise_not_as_described"),

      @SerializedName("not_received")
      NOT_RECEIVED("not_received"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("service_not_as_described")
      SERVICE_NOT_AS_DESCRIBED("service_not_as_described");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Reason(String value) {
        this.value = value;
      }
    }
  }
}
