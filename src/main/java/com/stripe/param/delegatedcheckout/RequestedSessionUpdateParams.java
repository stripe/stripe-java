// File generated from our OpenAPI spec
package com.stripe.param.delegatedcheckout;

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
public class RequestedSessionUpdateParams extends ApiRequestParams {
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

  /** The details of the fulfillment. */
  @SerializedName("fulfillment_details")
  FulfillmentDetails fulfillmentDetails;

  /** The details of the line items. */
  @SerializedName("line_item_details")
  List<RequestedSessionUpdateParams.LineItemDetail> lineItemDetails;

  /** The metadata for this requested session. */
  @SerializedName("metadata")
  Object metadata;

  /** The payment method for this requested session. */
  @SerializedName("payment_method")
  Object paymentMethod;

  /** The payment method options for this requested session. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** The shared metadata for this requested session. */
  @SerializedName("shared_metadata")
  Object sharedMetadata;

  private RequestedSessionUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      FulfillmentDetails fulfillmentDetails,
      List<RequestedSessionUpdateParams.LineItemDetail> lineItemDetails,
      Object metadata,
      Object paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      Object sharedMetadata) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.fulfillmentDetails = fulfillmentDetails;
    this.lineItemDetails = lineItemDetails;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.sharedMetadata = sharedMetadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private FulfillmentDetails fulfillmentDetails;

    private List<RequestedSessionUpdateParams.LineItemDetail> lineItemDetails;

    private Object metadata;

    private Object paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private Object sharedMetadata;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionUpdateParams build() {
      return new RequestedSessionUpdateParams(
          this.expand,
          this.extraParams,
          this.fulfillmentDetails,
          this.lineItemDetails,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.sharedMetadata);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionUpdateParams#expand} for the field documentation.
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
     * RequestedSessionUpdateParams#expand} for the field documentation.
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
     * RequestedSessionUpdateParams#extraParams} for the field documentation.
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
     * See {@link RequestedSessionUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The details of the fulfillment. */
    public Builder setFulfillmentDetails(
        RequestedSessionUpdateParams.FulfillmentDetails fulfillmentDetails) {
      this.fulfillmentDetails = fulfillmentDetails;
      return this;
    }

    /**
     * Add an element to `lineItemDetails` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionUpdateParams#lineItemDetails} for the field documentation.
     */
    public Builder addLineItemDetail(RequestedSessionUpdateParams.LineItemDetail element) {
      if (this.lineItemDetails == null) {
        this.lineItemDetails = new ArrayList<>();
      }
      this.lineItemDetails.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItemDetails` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionUpdateParams#lineItemDetails} for the field documentation.
     */
    public Builder addAllLineItemDetail(
        List<RequestedSessionUpdateParams.LineItemDetail> elements) {
      if (this.lineItemDetails == null) {
        this.lineItemDetails = new ArrayList<>();
      }
      this.lineItemDetails.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RequestedSessionUpdateParams#metadata} for the field documentation.
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
     * See {@link RequestedSessionUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /** The metadata for this requested session. */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The metadata for this requested session. */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The payment method for this requested session. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The payment method for this requested session. */
    public Builder setPaymentMethod(EmptyParam paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The payment method options for this requested session. */
    public Builder setPaymentMethodOptions(
        RequestedSessionUpdateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RequestedSessionUpdateParams#sharedMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putSharedMetadata(String key, String value) {
      if (this.sharedMetadata == null || this.sharedMetadata instanceof EmptyParam) {
        this.sharedMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.sharedMetadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `sharedMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RequestedSessionUpdateParams#sharedMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllSharedMetadata(Map<String, String> map) {
      if (this.sharedMetadata == null || this.sharedMetadata instanceof EmptyParam) {
        this.sharedMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.sharedMetadata).putAll(map);
      return this;
    }

    /** The shared metadata for this requested session. */
    public Builder setSharedMetadata(EmptyParam sharedMetadata) {
      this.sharedMetadata = sharedMetadata;
      return this;
    }

    /** The shared metadata for this requested session. */
    public Builder setSharedMetadata(Map<String, String> sharedMetadata) {
      this.sharedMetadata = sharedMetadata;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FulfillmentDetails {
    /** The customer's address. */
    @SerializedName("address")
    Address address;

    /** The customer's email address. */
    @SerializedName("email")
    Object email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The customer's name. */
    @SerializedName("name")
    Object name;

    /** The customer's phone number. */
    @SerializedName("phone")
    Object phone;

    /** The fulfillment option to select. */
    @SerializedName("selected_fulfillment_option")
    SelectedFulfillmentOption selectedFulfillmentOption;

    /** The fulfillment option overrides for specific line items. */
    @SerializedName("selected_fulfillment_option_overrides")
    List<RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride>
        selectedFulfillmentOptionOverrides;

    private FulfillmentDetails(
        Address address,
        Object email,
        Map<String, Object> extraParams,
        Object name,
        Object phone,
        SelectedFulfillmentOption selectedFulfillmentOption,
        List<RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride>
            selectedFulfillmentOptionOverrides) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.selectedFulfillmentOption = selectedFulfillmentOption;
      this.selectedFulfillmentOptionOverrides = selectedFulfillmentOptionOverrides;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Object email;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      private SelectedFulfillmentOption selectedFulfillmentOption;

      private List<
              RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride>
          selectedFulfillmentOptionOverrides;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionUpdateParams.FulfillmentDetails build() {
        return new RequestedSessionUpdateParams.FulfillmentDetails(
            this.address,
            this.email,
            this.extraParams,
            this.name,
            this.phone,
            this.selectedFulfillmentOption,
            this.selectedFulfillmentOptionOverrides);
      }

      /** The customer's address. */
      public Builder setAddress(RequestedSessionUpdateParams.FulfillmentDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The customer's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** The customer's email address. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionUpdateParams.FulfillmentDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionUpdateParams.FulfillmentDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The customer's name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** The customer's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** The customer's phone number. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }

      /** The fulfillment option to select. */
      public Builder setSelectedFulfillmentOption(
          RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption
              selectedFulfillmentOption) {
        this.selectedFulfillmentOption = selectedFulfillmentOption;
        return this;
      }

      /**
       * Add an element to `selectedFulfillmentOptionOverrides` list. A list is initialized for the
       * first `add/addAll` call, and subsequent calls adds additional elements to the original
       * list. See {@link
       * RequestedSessionUpdateParams.FulfillmentDetails#selectedFulfillmentOptionOverrides} for the
       * field documentation.
       */
      public Builder addSelectedFulfillmentOptionOverride(
          RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
              element) {
        if (this.selectedFulfillmentOptionOverrides == null) {
          this.selectedFulfillmentOptionOverrides = new ArrayList<>();
        }
        this.selectedFulfillmentOptionOverrides.add(element);
        return this;
      }

      /**
       * Add all elements to `selectedFulfillmentOptionOverrides` list. A list is initialized for
       * the first `add/addAll` call, and subsequent calls adds additional elements to the original
       * list. See {@link
       * RequestedSessionUpdateParams.FulfillmentDetails#selectedFulfillmentOptionOverrides} for the
       * field documentation.
       */
      public Builder addAllSelectedFulfillmentOptionOverride(
          List<RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride>
              elements) {
        if (this.selectedFulfillmentOptionOverrides == null) {
          this.selectedFulfillmentOptionOverrides = new ArrayList<>();
        }
        this.selectedFulfillmentOptionOverrides.addAll(elements);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** <strong>Required.</strong> City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      Object line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      Object line2;

      /** <strong>Required.</strong> ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * <strong>Required.</strong> State, county, province, or region (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
       */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.FulfillmentDetails.Address build() {
          return new RequestedSessionUpdateParams.FulfillmentDetails.Address(
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

        /** <strong>Required.</strong> City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * <strong>Required.</strong> Two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestedSessionUpdateParams.FulfillmentDetails.Address#extraParams} for
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
         * map. See {@link RequestedSessionUpdateParams.FulfillmentDetails.Address#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** <strong>Required.</strong> ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** <strong>Required.</strong> ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
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

        /**
         * <strong>Required.</strong> State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SelectedFulfillmentOption {
      /** The digital fulfillment option. */
      @SerializedName("digital")
      Digital digital;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The shipping fulfillment option. */
      @SerializedName("shipping")
      Shipping shipping;

      /** <strong>Required.</strong> The type of fulfillment option. */
      @SerializedName("type")
      Type type;

      private SelectedFulfillmentOption(
          Digital digital, Map<String, Object> extraParams, Shipping shipping, Type type) {
        this.digital = digital;
        this.extraParams = extraParams;
        this.shipping = shipping;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Digital digital;

        private Map<String, Object> extraParams;

        private Shipping shipping;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption build() {
          return new RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption(
              this.digital, this.extraParams, this.shipping, this.type);
        }

        /** The digital fulfillment option. */
        public Builder setDigital(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Digital
                digital) {
          this.digital = digital;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption#extraParams}
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
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The shipping fulfillment option. */
        public Builder setShipping(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Shipping
                shipping) {
          this.shipping = shipping;
          return this;
        }

        /** <strong>Required.</strong> The type of fulfillment option. */
        public Builder setType(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Digital {
        /** <strong>Required.</strong> The digital option identifier. */
        @SerializedName("digital_option")
        Object digitalOption;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Digital(Object digitalOption, Map<String, Object> extraParams) {
          this.digitalOption = digitalOption;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object digitalOption;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Digital
              build() {
            return new RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption
                .Digital(this.digitalOption, this.extraParams);
          }

          /** <strong>Required.</strong> The digital option identifier. */
          public Builder setDigitalOption(String digitalOption) {
            this.digitalOption = digitalOption;
            return this;
          }

          /** <strong>Required.</strong> The digital option identifier. */
          public Builder setDigitalOption(EmptyParam digitalOption) {
            this.digitalOption = digitalOption;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Digital#extraParams}
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
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Digital#extraParams}
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The shipping option identifier. */
        @SerializedName("shipping_option")
        Object shippingOption;

        private Shipping(Map<String, Object> extraParams, Object shippingOption) {
          this.extraParams = extraParams;
          this.shippingOption = shippingOption;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object shippingOption;

          /** Finalize and obtain parameter instance from this builder. */
          public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Shipping
              build() {
            return new RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption
                .Shipping(this.extraParams, this.shippingOption);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Shipping#extraParams}
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
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Shipping#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The shipping option identifier. */
          public Builder setShippingOption(String shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }

          /** <strong>Required.</strong> The shipping option identifier. */
          public Builder setShippingOption(EmptyParam shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("digital")
        DIGITAL("digital"),

        @SerializedName("shipping")
        SHIPPING("shipping");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SelectedFulfillmentOptionOverride {
      /** The digital fulfillment option. */
      @SerializedName("digital")
      Digital digital;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The line item keys that this fulfillment option override applies
       * to.
       */
      @SerializedName("line_item_keys")
      List<String> lineItemKeys;

      /** The shipping fulfillment option. */
      @SerializedName("shipping")
      Shipping shipping;

      /** <strong>Required.</strong> The type of fulfillment option. */
      @SerializedName("type")
      Type type;

      private SelectedFulfillmentOptionOverride(
          Digital digital,
          Map<String, Object> extraParams,
          List<String> lineItemKeys,
          Shipping shipping,
          Type type) {
        this.digital = digital;
        this.extraParams = extraParams;
        this.lineItemKeys = lineItemKeys;
        this.shipping = shipping;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Digital digital;

        private Map<String, Object> extraParams;

        private List<String> lineItemKeys;

        private Shipping shipping;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
            build() {
          return new RequestedSessionUpdateParams.FulfillmentDetails
              .SelectedFulfillmentOptionOverride(
              this.digital, this.extraParams, this.lineItemKeys, this.shipping, this.type);
        }

        /** The digital fulfillment option. */
        public Builder setDigital(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
                    .Digital
                digital) {
          this.digital = digital;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride#extraParams}
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
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride#extraParams}
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
         * Add an element to `lineItemKeys` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride#lineItemKeys}
         * for the field documentation.
         */
        public Builder addLineItemKey(String element) {
          if (this.lineItemKeys == null) {
            this.lineItemKeys = new ArrayList<>();
          }
          this.lineItemKeys.add(element);
          return this;
        }

        /**
         * Add all elements to `lineItemKeys` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride#lineItemKeys}
         * for the field documentation.
         */
        public Builder addAllLineItemKey(List<String> elements) {
          if (this.lineItemKeys == null) {
            this.lineItemKeys = new ArrayList<>();
          }
          this.lineItemKeys.addAll(elements);
          return this;
        }

        /** The shipping fulfillment option. */
        public Builder setShipping(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
                    .Shipping
                shipping) {
          this.shipping = shipping;
          return this;
        }

        /** <strong>Required.</strong> The type of fulfillment option. */
        public Builder setType(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride.Type
                type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Digital {
        /** <strong>Required.</strong> The digital option identifier. */
        @SerializedName("digital_option")
        Object digitalOption;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Digital(Object digitalOption, Map<String, Object> extraParams) {
          this.digitalOption = digitalOption;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object digitalOption;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
                  .Digital
              build() {
            return new RequestedSessionUpdateParams.FulfillmentDetails
                .SelectedFulfillmentOptionOverride.Digital(this.digitalOption, this.extraParams);
          }

          /** <strong>Required.</strong> The digital option identifier. */
          public Builder setDigitalOption(String digitalOption) {
            this.digitalOption = digitalOption;
            return this;
          }

          /** <strong>Required.</strong> The digital option identifier. */
          public Builder setDigitalOption(EmptyParam digitalOption) {
            this.digitalOption = digitalOption;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride.Digital#extraParams}
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
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride.Digital#extraParams}
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The shipping option identifier. */
        @SerializedName("shipping_option")
        Object shippingOption;

        private Shipping(Map<String, Object> extraParams, Object shippingOption) {
          this.extraParams = extraParams;
          this.shippingOption = shippingOption;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object shippingOption;

          /** Finalize and obtain parameter instance from this builder. */
          public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride
                  .Shipping
              build() {
            return new RequestedSessionUpdateParams.FulfillmentDetails
                .SelectedFulfillmentOptionOverride.Shipping(this.extraParams, this.shippingOption);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride.Shipping#extraParams}
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
           * RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOptionOverride.Shipping#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The shipping option identifier. */
          public Builder setShippingOption(String shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }

          /** <strong>Required.</strong> The shipping option identifier. */
          public Builder setShippingOption(EmptyParam shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("digital")
        DIGITAL("digital"),

        @SerializedName("shipping")
        SHIPPING("shipping");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItemDetail {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The key of the line item. */
    @SerializedName("key")
    Object key;

    /** <strong>Required.</strong> The quantity of the line item. */
    @SerializedName("quantity")
    Long quantity;

    private LineItemDetail(Map<String, Object> extraParams, Object key, Long quantity) {
      this.extraParams = extraParams;
      this.key = key;
      this.quantity = quantity;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object key;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionUpdateParams.LineItemDetail build() {
        return new RequestedSessionUpdateParams.LineItemDetail(
            this.extraParams, this.key, this.quantity);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionUpdateParams.LineItemDetail#extraParams} for the field documentation.
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
       * See {@link RequestedSessionUpdateParams.LineItemDetail#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The key of the line item. */
      public Builder setKey(String key) {
        this.key = key;
        return this;
      }

      /** <strong>Required.</strong> The key of the line item. */
      public Builder setKey(EmptyParam key) {
        this.key = key;
        return this;
      }

      /** <strong>Required.</strong> The quantity of the line item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions {
    /** Card-specific payment method options. */
    @SerializedName("card")
    Card card;

    /** The payment method types to exclude from the session. */
    @SerializedName("excluded_payment_method_types")
    List<RequestedSessionUpdateParams.PaymentMethodOptions.ExcludedPaymentMethodType>
        excludedPaymentMethodTypes;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PaymentMethodOptions(
        Card card,
        List<RequestedSessionUpdateParams.PaymentMethodOptions.ExcludedPaymentMethodType>
            excludedPaymentMethodTypes,
        Map<String, Object> extraParams) {
      this.card = card;
      this.excludedPaymentMethodTypes = excludedPaymentMethodTypes;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private List<RequestedSessionUpdateParams.PaymentMethodOptions.ExcludedPaymentMethodType>
          excludedPaymentMethodTypes;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionUpdateParams.PaymentMethodOptions build() {
        return new RequestedSessionUpdateParams.PaymentMethodOptions(
            this.card, this.excludedPaymentMethodTypes, this.extraParams);
      }

      /** Card-specific payment method options. */
      public Builder setCard(RequestedSessionUpdateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add an element to `excludedPaymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RequestedSessionUpdateParams.PaymentMethodOptions#excludedPaymentMethodTypes} for
       * the field documentation.
       */
      public Builder addExcludedPaymentMethodType(
          RequestedSessionUpdateParams.PaymentMethodOptions.ExcludedPaymentMethodType element) {
        if (this.excludedPaymentMethodTypes == null) {
          this.excludedPaymentMethodTypes = new ArrayList<>();
        }
        this.excludedPaymentMethodTypes.add(element);
        return this;
      }

      /**
       * Add all elements to `excludedPaymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RequestedSessionUpdateParams.PaymentMethodOptions#excludedPaymentMethodTypes} for
       * the field documentation.
       */
      public Builder addAllExcludedPaymentMethodType(
          List<RequestedSessionUpdateParams.PaymentMethodOptions.ExcludedPaymentMethodType>
              elements) {
        if (this.excludedPaymentMethodTypes == null) {
          this.excludedPaymentMethodTypes = new ArrayList<>();
        }
        this.excludedPaymentMethodTypes.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionUpdateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link RequestedSessionUpdateParams.PaymentMethodOptions#extraParams} for the field
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
    public static class Card {
      /** The card brands to exclude from the session. */
      @SerializedName("brands_blocked")
      List<RequestedSessionUpdateParams.PaymentMethodOptions.Card.BrandsBlocked> brandsBlocked;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Card(
          List<RequestedSessionUpdateParams.PaymentMethodOptions.Card.BrandsBlocked> brandsBlocked,
          Map<String, Object> extraParams) {
        this.brandsBlocked = brandsBlocked;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<RequestedSessionUpdateParams.PaymentMethodOptions.Card.BrandsBlocked>
            brandsBlocked;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.PaymentMethodOptions.Card build() {
          return new RequestedSessionUpdateParams.PaymentMethodOptions.Card(
              this.brandsBlocked, this.extraParams);
        }

        /**
         * Add an element to `brandsBlocked` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * RequestedSessionUpdateParams.PaymentMethodOptions.Card#brandsBlocked} for the field
         * documentation.
         */
        public Builder addBrandsBlocked(
            RequestedSessionUpdateParams.PaymentMethodOptions.Card.BrandsBlocked element) {
          if (this.brandsBlocked == null) {
            this.brandsBlocked = new ArrayList<>();
          }
          this.brandsBlocked.add(element);
          return this;
        }

        /**
         * Add all elements to `brandsBlocked` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link RequestedSessionUpdateParams.PaymentMethodOptions.Card#brandsBlocked} for the
         * field documentation.
         */
        public Builder addAllBrandsBlocked(
            List<RequestedSessionUpdateParams.PaymentMethodOptions.Card.BrandsBlocked> elements) {
          if (this.brandsBlocked == null) {
            this.brandsBlocked = new ArrayList<>();
          }
          this.brandsBlocked.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestedSessionUpdateParams.PaymentMethodOptions.Card#extraParams} for
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
         * map. See {@link RequestedSessionUpdateParams.PaymentMethodOptions.Card#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum BrandsBlocked implements ApiRequestParams.EnumParam {
        @SerializedName("american_express")
        AMERICAN_EXPRESS("american_express"),

        @SerializedName("mastercard")
        MASTERCARD("mastercard"),

        @SerializedName("visa")
        VISA("visa");

        @Getter(onMethod_ = {@Override})
        private final String value;

        BrandsBlocked(String value) {
          this.value = value;
        }
      }
    }

    public enum ExcludedPaymentMethodType implements ApiRequestParams.EnumParam {
      @SerializedName("affirm")
      AFFIRM("affirm"),

      @SerializedName("card")
      CARD("card"),

      @SerializedName("klarna")
      KLARNA("klarna");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ExcludedPaymentMethodType(String value) {
        this.value = value;
      }
    }
  }
}
