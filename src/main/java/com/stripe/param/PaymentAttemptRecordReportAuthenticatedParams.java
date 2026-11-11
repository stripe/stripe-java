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
public class PaymentAttemptRecordReportAuthenticatedParams extends ApiRequestParams {
  /** When the reported payment was authenticated. Measured in seconds since the Unix epoch. */
  @SerializedName("authenticated_at")
  Long authenticatedAt;

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

  private PaymentAttemptRecordReportAuthenticatedParams(
      Long authenticatedAt,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      List<String> paymentEvaluations,
      PaymentMethodDetails paymentMethodDetails) {
    this.authenticatedAt = authenticatedAt;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentEvaluations = paymentEvaluations;
    this.paymentMethodDetails = paymentMethodDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long authenticatedAt;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private List<String> paymentEvaluations;

    private PaymentMethodDetails paymentMethodDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentAttemptRecordReportAuthenticatedParams build() {
      return new PaymentAttemptRecordReportAuthenticatedParams(
          this.authenticatedAt,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentEvaluations,
          this.paymentMethodDetails);
    }

    /** When the reported payment was authenticated. Measured in seconds since the Unix epoch. */
    public Builder setAuthenticatedAt(Long authenticatedAt) {
      this.authenticatedAt = authenticatedAt;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentAttemptRecordReportAuthenticatedParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportAuthenticatedParams#expand} for the field documentation.
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
     * PaymentAttemptRecordReportAuthenticatedParams#extraParams} for the field documentation.
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
     * See {@link PaymentAttemptRecordReportAuthenticatedParams#extraParams} for the field
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentAttemptRecordReportAuthenticatedParams#metadata} for the field documentation.
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
     * See {@link PaymentAttemptRecordReportAuthenticatedParams#metadata} for the field
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
     * PaymentAttemptRecordReportAuthenticatedParams#paymentEvaluations} for the field
     * documentation.
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
     * {@link PaymentAttemptRecordReportAuthenticatedParams#paymentEvaluations} for the field
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
        PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
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
      public PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails build() {
        return new PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails(
            this.card, this.extraParams, this.type);
      }

      /** Information about the card payment method used to make this payment. */
      public Builder setCard(
          PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails#extraParams} for the
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails#extraParams}
       * for the field documentation.
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
          PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
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

      private Card(Map<String, Object> extraParams, ThreeDSecure threeDSecure) {
        this.extraParams = extraParams;
        this.threeDSecure = threeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ThreeDSecure threeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card build() {
          return new PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card(
              this.extraParams, this.threeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card#extraParams} for
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
         * map. See {@link
         * PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card#extraParams} for
         * the field documentation.
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
            PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
                threeDSecure) {
          this.threeDSecure = threeDSecure;
          return this;
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

        /** <strong>Required.</strong> The version of 3D Secure that was used. */
        @SerializedName("version")
        Version version;

        private ThreeDSecure(
            AuthenticationFlow authenticationFlow,
            ElectronicCommerceIndicator electronicCommerceIndicator,
            ExemptionIndicator exemptionIndicator,
            Map<String, Object> extraParams,
            Result result,
            Version version) {
          this.authenticationFlow = authenticationFlow;
          this.electronicCommerceIndicator = electronicCommerceIndicator;
          this.exemptionIndicator = exemptionIndicator;
          this.extraParams = extraParams;
          this.result = result;
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

          private Version version;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card
                  .ThreeDSecure
              build() {
            return new PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card
                .ThreeDSecure(
                this.authenticationFlow,
                this.electronicCommerceIndicator,
                this.exemptionIndicator,
                this.extraParams,
                this.result,
                this.version);
          }

          /**
           * For authenticated transactions: Indicates how the issuing bank authenticated the
           * customer.
           */
          public Builder setAuthenticationFlow(
              PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
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
              PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .ElectronicCommerceIndicator
                  electronicCommerceIndicator) {
            this.electronicCommerceIndicator = electronicCommerceIndicator;
            return this;
          }

          /** The exemption requested via 3DS and accepted by the issuer at authentication time. */
          public Builder setExemptionIndicator(
              PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .ExemptionIndicator
                  exemptionIndicator) {
            this.exemptionIndicator = exemptionIndicator;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure#extraParams}
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
           * PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure#extraParams}
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
              PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
                      .Result
                  result) {
            this.result = result;
            return this;
          }

          /** <strong>Required.</strong> The version of 3D Secure that was used. */
          public Builder setVersion(
              PaymentAttemptRecordReportAuthenticatedParams.PaymentMethodDetails.Card.ThreeDSecure
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
          EXEMPTED("exempted");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Result(String value) {
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
      CARD("card");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
