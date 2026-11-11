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
public class PaymentAttemptRecordReportGuaranteedParams extends ApiRequestParams {
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

  /** When the reported payment was guaranteed. Measured in seconds since the Unix epoch. */
  @SerializedName("guaranteed_at")
  Long guaranteedAt;

  /**
   * Set to {@code true} to enable writing an anomalous guaranteed payment to an outdated
   * PaymentAttemptRecord. This parameter defaults to {@code false}.
   */
  @SerializedName("is_anomalous")
  Boolean isAnomalous;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Payment evaluations associated with this reported payment. */
  @SerializedName("payment_evaluations")
  List<String> paymentEvaluations;

  /** Information about the Payment Method debited for this payment. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** Processor information for this payment. */
  @SerializedName("processor_details")
  ProcessorDetails processorDetails;

  private PaymentAttemptRecordReportGuaranteedParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Long guaranteedAt,
      Boolean isAnomalous,
      Object metadata,
      List<String> paymentEvaluations,
      PaymentMethodDetails paymentMethodDetails,
      ProcessorDetails processorDetails) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.guaranteedAt = guaranteedAt;
    this.isAnomalous = isAnomalous;
    this.metadata = metadata;
    this.paymentEvaluations = paymentEvaluations;
    this.paymentMethodDetails = paymentMethodDetails;
    this.processorDetails = processorDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long guaranteedAt;

    private Boolean isAnomalous;

    private Object metadata;

    private List<String> paymentEvaluations;

    private PaymentMethodDetails paymentMethodDetails;

    private ProcessorDetails processorDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentAttemptRecordReportGuaranteedParams build() {
      return new PaymentAttemptRecordReportGuaranteedParams(
          this.expand,
          this.extraParams,
          this.guaranteedAt,
          this.isAnomalous,
          this.metadata,
          this.paymentEvaluations,
          this.paymentMethodDetails,
          this.processorDetails);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentAttemptRecordReportGuaranteedParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportGuaranteedParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportGuaranteedParams#extraParams} for the field documentation.
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
     * See {@link PaymentAttemptRecordReportGuaranteedParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** When the reported payment was guaranteed. Measured in seconds since the Unix epoch. */
    public Builder setGuaranteedAt(Long guaranteedAt) {
      this.guaranteedAt = guaranteedAt;
      return this;
    }

    /**
     * Set to {@code true} to enable writing an anomalous guaranteed payment to an outdated
     * PaymentAttemptRecord. This parameter defaults to {@code false}.
     */
    public Builder setIsAnomalous(Boolean isAnomalous) {
      this.isAnomalous = isAnomalous;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentAttemptRecordReportGuaranteedParams#metadata} for the field documentation.
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
     * See {@link PaymentAttemptRecordReportGuaranteedParams#metadata} for the field documentation.
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

    /**
     * Add an element to `paymentEvaluations` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentAttemptRecordReportGuaranteedParams#paymentEvaluations} for the field documentation.
     */
    public Builder addPaymentEvaluation(String element) {
      if (this.paymentEvaluations == null) {
        this.paymentEvaluations = new ArrayList<>();
      }
      this.paymentEvaluations.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentEvaluations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentAttemptRecordReportGuaranteedParams#paymentEvaluations} for the field
     * documentation.
     */
    public Builder addAllPaymentEvaluation(List<String> elements) {
      if (this.paymentEvaluations == null) {
        this.paymentEvaluations = new ArrayList<>();
      }
      this.paymentEvaluations.addAll(elements);
      return this;
    }

    /** Information about the Payment Method debited for this payment. */
    public Builder setPaymentMethodDetails(
        PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    /** Processor information for this payment. */
    public Builder setProcessorDetails(
        PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails processorDetails) {
      this.processorDetails = processorDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails {
    /** Information about the card payment method used to make this payment. */
    @SerializedName("card")
    Card card;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The type of the payment method details. An additional hash is
     * included on the payment_method_details with a name matching this value. It contains
     * additional information specific to the type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodDetails(Card card, Map<String, Object> extraParams, Type type) {
      this.card = card;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails build() {
        return new PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails(
            this.card, this.extraParams, this.type);
      }

      /** Information about the card payment method used to make this payment. */
      public Builder setCard(
          PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails#extraParams} for
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
       * <strong>Required.</strong> The type of the payment method details. An additional hash is
       * included on the payment_method_details with a name matching this value. It contains
       * additional information specific to the type.
       */
      public Builder setType(
          PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /** Verification checks performed on the card. */
      @SerializedName("checks")
      Checks checks;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Populated if this transaction used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      private Card(Checks checks, Map<String, Object> extraParams, ThreeDSecure threeDSecure) {
        this.checks = checks;
        this.extraParams = extraParams;
        this.threeDSecure = threeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Checks checks;

        private Map<String, Object> extraParams;

        private ThreeDSecure threeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card build() {
          return new PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card(
              this.checks, this.extraParams, this.threeDSecure);
        }

        /** Verification checks performed on the card. */
        public Builder setChecks(
            PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks checks) {
          this.checks = checks;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card#extraParams} for the
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
         * map. See {@link
         * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Populated if this transaction used 3D Secure authentication. */
        public Builder setThreeDSecure(
            PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                threeDSecure) {
          this.threeDSecure = threeDSecure;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Checks {
        /** The result of the check on the cardholder's address line 1. */
        @SerializedName("address_line1_check")
        AddressLine1Check addressLine1Check;

        /** The result of the check on the cardholder's postal code. */
        @SerializedName("address_postal_code_check")
        AddressPostalCodeCheck addressPostalCodeCheck;

        /** The result of the check on the card's CVC. */
        @SerializedName("cvc_check")
        CvcCheck cvcCheck;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Checks(
            AddressLine1Check addressLine1Check,
            AddressPostalCodeCheck addressPostalCodeCheck,
            CvcCheck cvcCheck,
            Map<String, Object> extraParams) {
          this.addressLine1Check = addressLine1Check;
          this.addressPostalCodeCheck = addressPostalCodeCheck;
          this.cvcCheck = cvcCheck;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AddressLine1Check addressLine1Check;

          private AddressPostalCodeCheck addressPostalCodeCheck;

          private CvcCheck cvcCheck;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks
              build() {
            return new PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks(
                this.addressLine1Check,
                this.addressPostalCodeCheck,
                this.cvcCheck,
                this.extraParams);
          }

          /** The result of the check on the cardholder's address line 1. */
          public Builder setAddressLine1Check(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks
                      .AddressLine1Check
                  addressLine1Check) {
            this.addressLine1Check = addressLine1Check;
            return this;
          }

          /** The result of the check on the cardholder's postal code. */
          public Builder setAddressPostalCodeCheck(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks
                      .AddressPostalCodeCheck
                  addressPostalCodeCheck) {
            this.addressPostalCodeCheck = addressPostalCodeCheck;
            return this;
          }

          /** The result of the check on the card's CVC. */
          public Builder setCvcCheck(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks.CvcCheck
                  cvcCheck) {
            this.cvcCheck = cvcCheck;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks#extraParams}
           * for the field documentation.
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
           * map. See {@link
           * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.Checks#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        public enum AddressLine1Check implements ApiRequestParams.EnumParam {
          @SerializedName("fail")
          FAIL("fail"),

          @SerializedName("pass")
          PASS("pass"),

          @SerializedName("unavailable")
          UNAVAILABLE("unavailable"),

          @SerializedName("unchecked")
          UNCHECKED("unchecked");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AddressLine1Check(String value) {
            this.value = value;
          }
        }

        public enum AddressPostalCodeCheck implements ApiRequestParams.EnumParam {
          @SerializedName("fail")
          FAIL("fail"),

          @SerializedName("pass")
          PASS("pass"),

          @SerializedName("unavailable")
          UNAVAILABLE("unavailable"),

          @SerializedName("unchecked")
          UNCHECKED("unchecked");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AddressPostalCodeCheck(String value) {
            this.value = value;
          }
        }

        public enum CvcCheck implements ApiRequestParams.EnumParam {
          @SerializedName("fail")
          FAIL("fail"),

          @SerializedName("pass")
          PASS("pass"),

          @SerializedName("unavailable")
          UNAVAILABLE("unavailable"),

          @SerializedName("unchecked")
          UNCHECKED("unchecked");

          @Getter(onMethod_ = {@Override})
          private final String value;

          CvcCheck(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure {
        /**
         * For authenticated transactions: Indicates how the issuing bank authenticated the
         * customer.
         */
        @SerializedName("authentication_flow")
        AuthenticationFlow authenticationFlow;

        /**
         * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of
         * authentication was performed.
         */
        @SerializedName("electronic_commerce_indicator")
        ElectronicCommerceIndicator electronicCommerceIndicator;

        /** The exemption requested via 3DS and accepted by the issuer at authentication time. */
        @SerializedName("exemption_indicator")
        ExemptionIndicator exemptionIndicator;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Indicates the outcome of 3D Secure authentication. */
        @SerializedName("result")
        Result result;

        /**
         * Additional information about why 3D Secure succeeded or failed, based on the {@code
         * result}.
         */
        @SerializedName("result_reason")
        ResultReason resultReason;

        /** <strong>Required.</strong> The version of 3D Secure that was used. */
        @SerializedName("version")
        Version version;

        private ThreeDSecure(
            AuthenticationFlow authenticationFlow,
            ElectronicCommerceIndicator electronicCommerceIndicator,
            ExemptionIndicator exemptionIndicator,
            Map<String, Object> extraParams,
            Result result,
            ResultReason resultReason,
            Version version) {
          this.authenticationFlow = authenticationFlow;
          this.electronicCommerceIndicator = electronicCommerceIndicator;
          this.exemptionIndicator = exemptionIndicator;
          this.extraParams = extraParams;
          this.result = result;
          this.resultReason = resultReason;
          this.version = version;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AuthenticationFlow authenticationFlow;

          private ElectronicCommerceIndicator electronicCommerceIndicator;

          private ExemptionIndicator exemptionIndicator;

          private Map<String, Object> extraParams;

          private Result result;

          private ResultReason resultReason;

          private Version version;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
              build() {
            return new PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card
                .ThreeDSecure(
                this.authenticationFlow,
                this.electronicCommerceIndicator,
                this.exemptionIndicator,
                this.extraParams,
                this.result,
                this.resultReason,
                this.version);
          }

          /**
           * For authenticated transactions: Indicates how the issuing bank authenticated the
           * customer.
           */
          public Builder setAuthenticationFlow(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .AuthenticationFlow
                  authenticationFlow) {
            this.authenticationFlow = authenticationFlow;
            return this;
          }

          /**
           * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree
           * of authentication was performed.
           */
          public Builder setElectronicCommerceIndicator(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .ElectronicCommerceIndicator
                  electronicCommerceIndicator) {
            this.electronicCommerceIndicator = electronicCommerceIndicator;
            return this;
          }

          /** The exemption requested via 3DS and accepted by the issuer at authentication time. */
          public Builder setExemptionIndicator(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .ExemptionIndicator
                  exemptionIndicator) {
            this.exemptionIndicator = exemptionIndicator;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure#extraParams}
           * for the field documentation.
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
           * map. See {@link
           * PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Indicates the outcome of 3D Secure authentication. */
          public Builder setResult(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .Result
                  result) {
            this.result = result;
            return this;
          }

          /**
           * Additional information about why 3D Secure succeeded or failed, based on the {@code
           * result}.
           */
          public Builder setResultReason(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .ResultReason
                  resultReason) {
            this.resultReason = resultReason;
            return this;
          }

          /** <strong>Required.</strong> The version of 3D Secure that was used. */
          public Builder setVersion(
              PaymentAttemptRecordReportGuaranteedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .Version
                  version) {
            this.version = version;
            return this;
          }
        }

        public enum AuthenticationFlow implements ApiRequestParams.EnumParam {
          @SerializedName("challenge")
          CHALLENGE("challenge"),

          @SerializedName("frictionless")
          FRICTIONLESS("frictionless");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AuthenticationFlow(String value) {
            this.value = value;
          }
        }

        public enum ElectronicCommerceIndicator implements ApiRequestParams.EnumParam {
          @SerializedName("01")
          N01("01"),

          @SerializedName("02")
          N02("02"),

          @SerializedName("05")
          N05("05"),

          @SerializedName("06")
          N06("06"),

          @SerializedName("07")
          N07("07");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ElectronicCommerceIndicator(String value) {
            this.value = value;
          }
        }

        public enum ExemptionIndicator implements ApiRequestParams.EnumParam {
          @SerializedName("low_risk")
          LOW_RISK("low_risk"),

          @SerializedName("none")
          NONE("none");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ExemptionIndicator(String value) {
            this.value = value;
          }
        }

        public enum Result implements ApiRequestParams.EnumParam {
          @SerializedName("attempt_acknowledged")
          ATTEMPT_ACKNOWLEDGED("attempt_acknowledged"),

          @SerializedName("authenticated")
          AUTHENTICATED("authenticated"),

          @SerializedName("exempted")
          EXEMPTED("exempted"),

          @SerializedName("failed")
          FAILED("failed"),

          @SerializedName("not_supported")
          NOT_SUPPORTED("not_supported"),

          @SerializedName("processing_error")
          PROCESSING_ERROR("processing_error");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Result(String value) {
            this.value = value;
          }
        }

        public enum ResultReason implements ApiRequestParams.EnumParam {
          @SerializedName("abandoned")
          ABANDONED("abandoned"),

          @SerializedName("canceled")
          CANCELED("canceled"),

          @SerializedName("card_not_enrolled")
          CARD_NOT_ENROLLED("card_not_enrolled"),

          @SerializedName("network_not_supported")
          NETWORK_NOT_SUPPORTED("network_not_supported"),

          @SerializedName("protocol_error")
          PROTOCOL_ERROR("protocol_error"),

          @SerializedName("rejected")
          REJECTED("rejected");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ResultReason(String value) {
            this.value = value;
          }
        }

        public enum Version implements ApiRequestParams.EnumParam {
          @SerializedName("1.0.2")
          N1__0__2("1.0.2"),

          @SerializedName("2.1.0")
          N2__1__0("2.1.0"),

          @SerializedName("2.2.0")
          N2__2__0("2.2.0"),

          @SerializedName("2.3.0")
          N2__3__0("2.3.0"),

          @SerializedName("2.3.1")
          N2__3__1("2.3.1");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Version(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("card")
      CARD("card"),

      @SerializedName("us_bank_account")
      US_BANK_ACCOUNT("us_bank_account");

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
      public PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails build() {
        return new PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails(
            this.custom, this.extraParams, this.type);
      }

      /** Information about the custom processor used to make this payment. */
      public Builder setCustom(
          PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails#extraParams} for the
       * field documentation.
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
      public Builder setType(
          PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Type type) {
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
       * <strong>Required.</strong> An opaque string for manual reconciliation of this payment, for
       * example a check number or a payment processor ID.
       */
      @SerializedName("payment_reference")
      String paymentReference;

      private Custom(Map<String, Object> extraParams, String paymentReference) {
        this.extraParams = extraParams;
        this.paymentReference = paymentReference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String paymentReference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Custom build() {
          return new PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Custom(
              this.extraParams, this.paymentReference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Custom#extraParams} for the
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
         * map. See {@link
         * PaymentAttemptRecordReportGuaranteedParams.ProcessorDetails.Custom#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> An opaque string for manual reconciliation of this payment,
         * for example a check number or a payment processor ID.
         */
        public Builder setPaymentReference(String paymentReference) {
          this.paymentReference = paymentReference;
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
}
