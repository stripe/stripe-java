// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentRecordReportPaymentAttemptParams extends ApiRequestParams {
  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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

  /** Information about the payment attempt failure. */
  @SerializedName("failed")
  Failed failed;

  /** Information about the payment attempt guarantee. */
  @SerializedName("guaranteed")
  Guaranteed guaranteed;

  /**
   * <strong>Required.</strong> When the reported payment was initiated. Measured in seconds since
   * the Unix epoch.
   */
  @SerializedName("initiated_at")
  Long initiatedAt;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The outcome of the reported payment. */
  @SerializedName("outcome")
  Outcome outcome;

  /** Information about the Payment Method debited for this payment. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** Shipping information for this payment. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  private PaymentRecordReportPaymentAttemptParams(
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Failed failed,
      Guaranteed guaranteed,
      Long initiatedAt,
      Map<String, String> metadata,
      Outcome outcome,
      PaymentMethodDetails paymentMethodDetails,
      ShippingDetails shippingDetails) {
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.failed = failed;
    this.guaranteed = guaranteed;
    this.initiatedAt = initiatedAt;
    this.metadata = metadata;
    this.outcome = outcome;
    this.paymentMethodDetails = paymentMethodDetails;
    this.shippingDetails = shippingDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Failed failed;

    private Guaranteed guaranteed;

    private Long initiatedAt;

    private Map<String, String> metadata;

    private Outcome outcome;

    private PaymentMethodDetails paymentMethodDetails;

    private ShippingDetails shippingDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRecordReportPaymentAttemptParams build() {
      return new PaymentRecordReportPaymentAttemptParams(
          this.description,
          this.expand,
          this.extraParams,
          this.failed,
          this.guaranteed,
          this.initiatedAt,
          this.metadata,
          this.outcome,
          this.paymentMethodDetails,
          this.shippingDetails);
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentRecordReportPaymentAttemptParams#expand} for the field documentation.
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
     * PaymentRecordReportPaymentAttemptParams#expand} for the field documentation.
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
     * PaymentRecordReportPaymentAttemptParams#extraParams} for the field documentation.
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
     * See {@link PaymentRecordReportPaymentAttemptParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the payment attempt failure. */
    public Builder setFailed(PaymentRecordReportPaymentAttemptParams.Failed failed) {
      this.failed = failed;
      return this;
    }

    /** Information about the payment attempt guarantee. */
    public Builder setGuaranteed(PaymentRecordReportPaymentAttemptParams.Guaranteed guaranteed) {
      this.guaranteed = guaranteed;
      return this;
    }

    /**
     * <strong>Required.</strong> When the reported payment was initiated. Measured in seconds since
     * the Unix epoch.
     */
    public Builder setInitiatedAt(Long initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRecordReportPaymentAttemptParams#metadata} for the field documentation.
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
     * See {@link PaymentRecordReportPaymentAttemptParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The outcome of the reported payment. */
    public Builder setOutcome(PaymentRecordReportPaymentAttemptParams.Outcome outcome) {
      this.outcome = outcome;
      return this;
    }

    /** Information about the Payment Method debited for this payment. */
    public Builder setPaymentMethodDetails(
        PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    /** Shipping information for this payment. */
    public Builder setShippingDetails(
        PaymentRecordReportPaymentAttemptParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }
  }

  @Getter
  public static class Failed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the reported payment failed. Measured in seconds since the
     * Unix epoch.
     */
    @SerializedName("failed_at")
    Long failedAt;

    private Failed(Map<String, Object> extraParams, Long failedAt) {
      this.extraParams = extraParams;
      this.failedAt = failedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long failedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentAttemptParams.Failed build() {
        return new PaymentRecordReportPaymentAttemptParams.Failed(this.extraParams, this.failedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentAttemptParams.Failed#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentAttemptParams.Failed#extraParams} for the field
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
       * <strong>Required.</strong> When the reported payment failed. Measured in seconds since the
       * Unix epoch.
       */
      public Builder setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
      }
    }
  }

  @Getter
  public static class Guaranteed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the reported payment was guaranteed. Measured in seconds
     * since the Unix epoch.
     */
    @SerializedName("guaranteed_at")
    Long guaranteedAt;

    private Guaranteed(Map<String, Object> extraParams, Long guaranteedAt) {
      this.extraParams = extraParams;
      this.guaranteedAt = guaranteedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long guaranteedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentAttemptParams.Guaranteed build() {
        return new PaymentRecordReportPaymentAttemptParams.Guaranteed(
            this.extraParams, this.guaranteedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentAttemptParams.Guaranteed#extraParams} for the field
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
       * See {@link PaymentRecordReportPaymentAttemptParams.Guaranteed#extraParams} for the field
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
       * <strong>Required.</strong> When the reported payment was guaranteed. Measured in seconds
       * since the Unix epoch.
       */
      public Builder setGuaranteedAt(Long guaranteedAt) {
        this.guaranteedAt = guaranteedAt;
        return this;
      }
    }
  }

  @Getter
  public static class PaymentMethodDetails {
    /** The billing details associated with the method of payment. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** Information about the custom (user-defined) payment method used to make this payment. */
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

    /** ID of the Stripe Payment Method used to make this payment. */
    @SerializedName("payment_method")
    String paymentMethod;

    /**
     * The type of the payment method details. An additional hash is included on the
     * payment_method_details with a name matching this value. It contains additional information
     * specific to the type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodDetails(
        BillingDetails billingDetails,
        Custom custom,
        Map<String, Object> extraParams,
        String paymentMethod,
        Type type) {
      this.billingDetails = billingDetails;
      this.custom = custom;
      this.extraParams = extraParams;
      this.paymentMethod = paymentMethod;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Custom custom;

      private Map<String, Object> extraParams;

      private String paymentMethod;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails build() {
        return new PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails(
            this.billingDetails, this.custom, this.extraParams, this.paymentMethod, this.type);
      }

      /** The billing details associated with the method of payment. */
      public Builder setBillingDetails(
          PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails
              billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** Information about the custom (user-defined) payment method used to make this payment. */
      public Builder setCustom(
          PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails#extraParams} for the field
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
       * See {@link PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of the Stripe Payment Method used to make this payment. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /**
       * The type of the payment method details. An additional hash is included on the
       * payment_method_details with a name matching this value. It contains additional information
       * specific to the type.
       */
      public Builder setType(
          PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class BillingDetails {
      /** The billing address associated with the method of payment. */
      @SerializedName("address")
      Address address;

      /** The billing email associated with the method of payment. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The billing name associated with the method of payment. */
      @SerializedName("name")
      String name;

      /** The billing phone number associated with the method of payment. */
      @SerializedName("phone")
      String phone;

      private BillingDetails(
          Address address,
          String email,
          Map<String, Object> extraParams,
          String name,
          String phone) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private String email;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails build() {
          return new PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** The billing address associated with the method of payment. */
        public Builder setAddress(
            PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails.Address
                address) {
          this.address = address;
          return this;
        }

        /** The billing email associated with the method of payment. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails#extraParams}
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
         * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The billing name associated with the method of payment. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The billing phone number associated with the method of payment. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails.Address
              build() {
            return new PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails
                .Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails.Address#extraParams}
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
           * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.BillingDetails.Address#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Custom {
      /**
       * Display name for the custom (user-defined) payment method type used to make this payment.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The custom payment method type associated with this payment. */
      @SerializedName("type")
      String type;

      private Custom(String displayName, Map<String, Object> extraParams, String type) {
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String displayName;

        private Map<String, Object> extraParams;

        private String type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Custom build() {
          return new PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Custom(
              this.displayName, this.extraParams, this.type);
        }

        /**
         * Display name for the custom (user-defined) payment method type used to make this payment.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Custom#extraParams} for the
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
         * PaymentRecordReportPaymentAttemptParams.PaymentMethodDetails.Custom#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The custom payment method type associated with this payment. */
        public Builder setType(String type) {
          this.type = type;
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
  public static class ShippingDetails {
    /** The physical shipping address. */
    @SerializedName("address")
    Address address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The shipping recipient's name. */
    @SerializedName("name")
    String name;

    /** The shipping recipient's phone number. */
    @SerializedName("phone")
    String phone;

    private ShippingDetails(
        Address address, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentAttemptParams.ShippingDetails build() {
        return new PaymentRecordReportPaymentAttemptParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** The physical shipping address. */
      public Builder setAddress(
          PaymentRecordReportPaymentAttemptParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentAttemptParams.ShippingDetails#extraParams} for the field
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
       * See {@link PaymentRecordReportPaymentAttemptParams.ShippingDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The shipping recipient's name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The shipping recipient's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentAttemptParams.ShippingDetails.Address build() {
          return new PaymentRecordReportPaymentAttemptParams.ShippingDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentRecordReportPaymentAttemptParams.ShippingDetails.Address#extraParams} for the
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
         * PaymentRecordReportPaymentAttemptParams.ShippingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  public enum Outcome implements ApiRequestParams.EnumParam {
    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("guaranteed")
    GUARANTEED("guaranteed");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Outcome(String value) {
      this.value = value;
    }
  }
}
