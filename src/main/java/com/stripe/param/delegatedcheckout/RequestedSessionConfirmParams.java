// File generated from our OpenAPI spec
package com.stripe.param.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RequestedSessionConfirmParams extends ApiRequestParams {
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

  /** The PaymentMethod to use with the requested session. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** The payment method data for this requested session. */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Risk details/signals associated with the requested session. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  private RequestedSessionConfirmParams(
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      PaymentMethodData paymentMethodData,
      RiskDetails riskDetails) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.riskDetails = riskDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private PaymentMethodData paymentMethodData;

    private RiskDetails riskDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionConfirmParams build() {
      return new RequestedSessionConfirmParams(
          this.expand,
          this.extraParams,
          this.paymentMethod,
          this.paymentMethodData,
          this.riskDetails);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#extraParams} for the field documentation.
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
     * See {@link RequestedSessionConfirmParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The PaymentMethod to use with the requested session. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The payment method data for this requested session. */
    public Builder setPaymentMethodData(
        RequestedSessionConfirmParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Risk details/signals associated with the requested session. */
    public Builder setRiskDetails(RequestedSessionConfirmParams.RiskDetails riskDetails) {
      this.riskDetails = riskDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodData {
    /** The billing details for the payment method data. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** The card for the payment method data. */
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

    /** The type of the payment method data. */
    @SerializedName("type")
    Type type;

    private PaymentMethodData(
        BillingDetails billingDetails, Card card, Map<String, Object> extraParams, Type type) {
      this.billingDetails = billingDetails;
      this.card = card;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Card card;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.PaymentMethodData build() {
        return new RequestedSessionConfirmParams.PaymentMethodData(
            this.billingDetails, this.card, this.extraParams, this.type);
      }

      /** The billing details for the payment method data. */
      public Builder setBillingDetails(
          RequestedSessionConfirmParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** The card for the payment method data. */
      public Builder setCard(RequestedSessionConfirmParams.PaymentMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link RequestedSessionConfirmParams.PaymentMethodData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The type of the payment method data. */
      public Builder setType(RequestedSessionConfirmParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails {
      /** The address for the billing details. */
      @SerializedName("address")
      Address address;

      /** The email for the billing details. */
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

      /** The name for the billing details. */
      @SerializedName("name")
      String name;

      /** The phone for the billing details. */
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
        public RequestedSessionConfirmParams.PaymentMethodData.BillingDetails build() {
          return new RequestedSessionConfirmParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** The address for the billing details. */
        public Builder setAddress(
            RequestedSessionConfirmParams.PaymentMethodData.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The email for the billing details. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionConfirmParams.PaymentMethodData.BillingDetails#extraParams} for the field
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
         * map. See {@link
         * RequestedSessionConfirmParams.PaymentMethodData.BillingDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name for the billing details. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The phone for the billing details. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** <strong>Required.</strong> City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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

        /**
         * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
         */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** <strong>Required.</strong> ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /**
         * <strong>Required.</strong> State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
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
          public RequestedSessionConfirmParams.PaymentMethodData.BillingDetails.Address build() {
            return new RequestedSessionConfirmParams.PaymentMethodData.BillingDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionConfirmParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * RequestedSessionConfirmParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** <strong>Required.</strong> ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /**
           * <strong>Required.</strong> State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /** The CVC of the card. */
      @SerializedName("cvc")
      String cvc;

      /** <strong>Required.</strong> The expiration month of the card. */
      @SerializedName("exp_month")
      Long expMonth;

      /** <strong>Required.</strong> The expiration year of the card. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The number of the card. */
      @SerializedName("number")
      String number;

      private Card(
          String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {
        this.cvc = cvc;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.extraParams = extraParams;
        this.number = number;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String cvc;

        private Long expMonth;

        private Long expYear;

        private Map<String, Object> extraParams;

        private String number;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.PaymentMethodData.Card build() {
          return new RequestedSessionConfirmParams.PaymentMethodData.Card(
              this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
        }

        /** The CVC of the card. */
        public Builder setCvc(String cvc) {
          this.cvc = cvc;
          return this;
        }

        /** <strong>Required.</strong> The expiration month of the card. */
        public Builder setExpMonth(Long expMonth) {
          this.expMonth = expMonth;
          return this;
        }

        /** <strong>Required.</strong> The expiration year of the card. */
        public Builder setExpYear(Long expYear) {
          this.expYear = expYear;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestedSessionConfirmParams.PaymentMethodData.Card#extraParams} for the
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
         * map. See {@link RequestedSessionConfirmParams.PaymentMethodData.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The number of the card. */
        public Builder setNumber(String number) {
          this.number = number;
          return this;
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskDetails {
    /** The client device metadata details for this requested session. */
    @SerializedName("client_device_metadata_details")
    ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RiskDetails(
        ClientDeviceMetadataDetails clientDeviceMetadataDetails, Map<String, Object> extraParams) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.RiskDetails build() {
        return new RequestedSessionConfirmParams.RiskDetails(
            this.clientDeviceMetadataDetails, this.extraParams);
      }

      /** The client device metadata details for this requested session. */
      public Builder setClientDeviceMetadataDetails(
          RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails
              clientDeviceMetadataDetails) {
        this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.RiskDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionConfirmParams.RiskDetails#extraParams} for the field
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDeviceMetadataDetails {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The radar session. */
      @SerializedName("radar_session")
      String radarSession;

      /** The referrer of the client device. */
      @SerializedName("referrer")
      String referrer;

      /** The remote IP address of the client device. */
      @SerializedName("remote_ip")
      String remoteIp;

      /** The time on page in milliseconds. */
      @SerializedName("time_on_page_ms")
      Long timeOnPageMs;

      /** The user agent of the client device. */
      @SerializedName("user_agent")
      String userAgent;

      private ClientDeviceMetadataDetails(
          Map<String, Object> extraParams,
          String radarSession,
          String referrer,
          String remoteIp,
          Long timeOnPageMs,
          String userAgent) {
        this.extraParams = extraParams;
        this.radarSession = radarSession;
        this.referrer = referrer;
        this.remoteIp = remoteIp;
        this.timeOnPageMs = timeOnPageMs;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String radarSession;

        private String referrer;

        private String remoteIp;

        private Long timeOnPageMs;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails build() {
          return new RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails(
              this.extraParams,
              this.radarSession,
              this.referrer,
              this.remoteIp,
              this.timeOnPageMs,
              this.userAgent);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
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
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The radar session. */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }

        /** The referrer of the client device. */
        public Builder setReferrer(String referrer) {
          this.referrer = referrer;
          return this;
        }

        /** The remote IP address of the client device. */
        public Builder setRemoteIp(String remoteIp) {
          this.remoteIp = remoteIp;
          return this;
        }

        /** The time on page in milliseconds. */
        public Builder setTimeOnPageMs(Long timeOnPageMs) {
          this.timeOnPageMs = timeOnPageMs;
          return this;
        }

        /** The user agent of the client device. */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }
  }
}
