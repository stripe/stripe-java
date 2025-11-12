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
  Map<String, String> metadata;

  /** The payment method for this requested session. */
  @SerializedName("payment_method")
  Object paymentMethod;

  /** The payment method data for this requested session. */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** The shared metadata for this requested session. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  private RequestedSessionUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      FulfillmentDetails fulfillmentDetails,
      List<RequestedSessionUpdateParams.LineItemDetail> lineItemDetails,
      Map<String, String> metadata,
      Object paymentMethod,
      PaymentMethodData paymentMethodData,
      Map<String, String> sharedMetadata) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.fulfillmentDetails = fulfillmentDetails;
    this.lineItemDetails = lineItemDetails;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
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

    private Map<String, String> metadata;

    private Object paymentMethod;

    private PaymentMethodData paymentMethodData;

    private Map<String, String> sharedMetadata;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionUpdateParams build() {
      return new RequestedSessionUpdateParams(
          this.expand,
          this.extraParams,
          this.fulfillmentDetails,
          this.lineItemDetails,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodData,
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
     * See {@link RequestedSessionUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
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

    /** The payment method data for this requested session. */
    public Builder setPaymentMethodData(
        RequestedSessionUpdateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /**
     * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RequestedSessionUpdateParams#sharedMetadata} for the field documentation.
     */
    public Builder putSharedMetadata(String key, String value) {
      if (this.sharedMetadata == null) {
        this.sharedMetadata = new HashMap<>();
      }
      this.sharedMetadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `sharedMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RequestedSessionUpdateParams#sharedMetadata} for the field documentation.
     */
    public Builder putAllSharedMetadata(Map<String, String> map) {
      if (this.sharedMetadata == null) {
        this.sharedMetadata = new HashMap<>();
      }
      this.sharedMetadata.putAll(map);
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

    private FulfillmentDetails(
        Address address,
        Object email,
        Map<String, Object> extraParams,
        Object name,
        Object phone,
        SelectedFulfillmentOption selectedFulfillmentOption) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.selectedFulfillmentOption = selectedFulfillmentOption;
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

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionUpdateParams.FulfillmentDetails build() {
        return new RequestedSessionUpdateParams.FulfillmentDetails(
            this.address,
            this.email,
            this.extraParams,
            this.name,
            this.phone,
            this.selectedFulfillmentOption);
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

      /** <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      Object line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      Object line2;

      /** <strong>Required.</strong> ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** <strong>Required.</strong> State, county, province, or region. */
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

        /**
         * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
         */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /**
         * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
         */
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

        /** <strong>Required.</strong> State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** <strong>Required.</strong> State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SelectedFulfillmentOption {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The shipping fulfillment option. */
      @SerializedName("shipping")
      Shipping shipping;

      /** <strong>Required.</strong> The type of fulfillment option. */
      @SerializedName("type")
      Object type;

      private SelectedFulfillmentOption(
          Map<String, Object> extraParams, Shipping shipping, Object type) {
        this.extraParams = extraParams;
        this.shipping = shipping;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Shipping shipping;

        private Object type;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption build() {
          return new RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption(
              this.extraParams, this.shipping, this.type);
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

        /** <strong>Required.</strong> The shipping fulfillment option. */
        public Builder setShipping(
            RequestedSessionUpdateParams.FulfillmentDetails.SelectedFulfillmentOption.Shipping
                shipping) {
          this.shipping = shipping;
          return this;
        }

        /** <strong>Required.</strong> The type of fulfillment option. */
        public Builder setType(String type) {
          this.type = type;
          return this;
        }

        /** <strong>Required.</strong> The type of fulfillment option. */
        public Builder setType(EmptyParam type) {
          this.type = type;
          return this;
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

        /** <strong>Required.</strong> The shipping option identifer. */
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

          /** <strong>Required.</strong> The shipping option identifer. */
          public Builder setShippingOption(String shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }

          /** <strong>Required.</strong> The shipping option identifer. */
          public Builder setShippingOption(EmptyParam shippingOption) {
            this.shippingOption = shippingOption;
            return this;
          }
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
      public RequestedSessionUpdateParams.PaymentMethodData build() {
        return new RequestedSessionUpdateParams.PaymentMethodData(
            this.billingDetails, this.card, this.extraParams, this.type);
      }

      /** The billing details for the payment method data. */
      public Builder setBillingDetails(
          RequestedSessionUpdateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** The card for the payment method data. */
      public Builder setCard(RequestedSessionUpdateParams.PaymentMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionUpdateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link RequestedSessionUpdateParams.PaymentMethodData#extraParams} for the field
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
      public Builder setType(RequestedSessionUpdateParams.PaymentMethodData.Type type) {
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
      Object email;

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
      Object name;

      /** The phone for the billing details. */
      @SerializedName("phone")
      Object phone;

      private BillingDetails(
          Address address,
          Object email,
          Map<String, Object> extraParams,
          Object name,
          Object phone) {
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

        private Object email;

        private Map<String, Object> extraParams;

        private Object name;

        private Object phone;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.PaymentMethodData.BillingDetails build() {
          return new RequestedSessionUpdateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** The address for the billing details. */
        public Builder setAddress(
            RequestedSessionUpdateParams.PaymentMethodData.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The email for the billing details. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /** The email for the billing details. */
        public Builder setEmail(EmptyParam email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionUpdateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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
         * RequestedSessionUpdateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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

        /** The name for the billing details. */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /** The phone for the billing details. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** The phone for the billing details. */
        public Builder setPhone(EmptyParam phone) {
          this.phone = phone;
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
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        Object line2;

        /** <strong>Required.</strong> ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** <strong>Required.</strong> State, county, province, or region. */
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
          public RequestedSessionUpdateParams.PaymentMethodData.BillingDetails.Address build() {
            return new RequestedSessionUpdateParams.PaymentMethodData.BillingDetails.Address(
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
           * map. See {@link
           * RequestedSessionUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * RequestedSessionUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
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

          /** <strong>Required.</strong> State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** <strong>Required.</strong> State, county, province, or region. */
          public Builder setState(EmptyParam state) {
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
      Object cvc;

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
      Object number;

      private Card(
          Object cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, Object number) {
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
        private Object cvc;

        private Long expMonth;

        private Long expYear;

        private Map<String, Object> extraParams;

        private Object number;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionUpdateParams.PaymentMethodData.Card build() {
          return new RequestedSessionUpdateParams.PaymentMethodData.Card(
              this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
        }

        /** The CVC of the card. */
        public Builder setCvc(String cvc) {
          this.cvc = cvc;
          return this;
        }

        /** The CVC of the card. */
        public Builder setCvc(EmptyParam cvc) {
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
         * map. See {@link RequestedSessionUpdateParams.PaymentMethodData.Card#extraParams} for the
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
         * map. See {@link RequestedSessionUpdateParams.PaymentMethodData.Card#extraParams} for the
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

        /** <strong>Required.</strong> The number of the card. */
        public Builder setNumber(EmptyParam number) {
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
}
