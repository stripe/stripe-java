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
public class RequestedSessionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The currency for this requested session. */
  @SerializedName("currency")
  String currency;

  /** The customer for this requested session. */
  @SerializedName("customer")
  String customer;

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

  /** <strong>Required.</strong> The details of the line items. */
  @SerializedName("line_item_details")
  List<RequestedSessionCreateParams.LineItemDetail> lineItemDetails;

  /** The metadata for this requested session. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The payment method for this requested session. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** The payment method data for this requested session. */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** <strong>Required.</strong> The details of the seller. */
  @SerializedName("seller_details")
  SellerDetails sellerDetails;

  /** The setup future usage for this requested session. */
  @SerializedName("setup_future_usage")
  SetupFutureUsage setupFutureUsage;

  /** The shared metadata for this requested session. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  private RequestedSessionCreateParams(
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      FulfillmentDetails fulfillmentDetails,
      List<RequestedSessionCreateParams.LineItemDetail> lineItemDetails,
      Map<String, String> metadata,
      String paymentMethod,
      PaymentMethodData paymentMethodData,
      SellerDetails sellerDetails,
      SetupFutureUsage setupFutureUsage,
      Map<String, String> sharedMetadata) {
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fulfillmentDetails = fulfillmentDetails;
    this.lineItemDetails = lineItemDetails;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.sellerDetails = sellerDetails;
    this.setupFutureUsage = setupFutureUsage;
    this.sharedMetadata = sharedMetadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FulfillmentDetails fulfillmentDetails;

    private List<RequestedSessionCreateParams.LineItemDetail> lineItemDetails;

    private Map<String, String> metadata;

    private String paymentMethod;

    private PaymentMethodData paymentMethodData;

    private SellerDetails sellerDetails;

    private SetupFutureUsage setupFutureUsage;

    private Map<String, String> sharedMetadata;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionCreateParams build() {
      return new RequestedSessionCreateParams(
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.fulfillmentDetails,
          this.lineItemDetails,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodData,
          this.sellerDetails,
          this.setupFutureUsage,
          this.sharedMetadata);
    }

    /** <strong>Required.</strong> The currency for this requested session. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** The customer for this requested session. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionCreateParams#expand} for the field documentation.
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
     * RequestedSessionCreateParams#expand} for the field documentation.
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
     * RequestedSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link RequestedSessionCreateParams#extraParams} for the field documentation.
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
        RequestedSessionCreateParams.FulfillmentDetails fulfillmentDetails) {
      this.fulfillmentDetails = fulfillmentDetails;
      return this;
    }

    /**
     * Add an element to `lineItemDetails` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionCreateParams#lineItemDetails} for the field documentation.
     */
    public Builder addLineItemDetail(RequestedSessionCreateParams.LineItemDetail element) {
      if (this.lineItemDetails == null) {
        this.lineItemDetails = new ArrayList<>();
      }
      this.lineItemDetails.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItemDetails` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionCreateParams#lineItemDetails} for the field documentation.
     */
    public Builder addAllLineItemDetail(
        List<RequestedSessionCreateParams.LineItemDetail> elements) {
      if (this.lineItemDetails == null) {
        this.lineItemDetails = new ArrayList<>();
      }
      this.lineItemDetails.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RequestedSessionCreateParams#metadata} for the field documentation.
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
     * See {@link RequestedSessionCreateParams#metadata} for the field documentation.
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

    /** The payment method data for this requested session. */
    public Builder setPaymentMethodData(
        RequestedSessionCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** <strong>Required.</strong> The details of the seller. */
    public Builder setSellerDetails(RequestedSessionCreateParams.SellerDetails sellerDetails) {
      this.sellerDetails = sellerDetails;
      return this;
    }

    /** The setup future usage for this requested session. */
    public Builder setSetupFutureUsage(
        RequestedSessionCreateParams.SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /**
     * Add a key/value pair to `sharedMetadata` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RequestedSessionCreateParams#sharedMetadata} for the field documentation.
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
     * See {@link RequestedSessionCreateParams#sharedMetadata} for the field documentation.
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
    @SerializedName("address")
    Address address;

    /** The customer's email address. */
    @SerializedName("email")
    String email;

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
    String name;

    /** The customer's phone number. */
    @SerializedName("phone")
    String phone;

    private FulfillmentDetails(
        Address address, String email, Map<String, Object> extraParams, String name, String phone) {
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
      public RequestedSessionCreateParams.FulfillmentDetails build() {
        return new RequestedSessionCreateParams.FulfillmentDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      public Builder setAddress(RequestedSessionCreateParams.FulfillmentDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The customer's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionCreateParams.FulfillmentDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionCreateParams.FulfillmentDetails#extraParams} for the field
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

      /** The customer's phone number. */
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** <strong>Required.</strong> ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** <strong>Required.</strong> State, county, province, or region. */
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
        public RequestedSessionCreateParams.FulfillmentDetails.Address build() {
          return new RequestedSessionCreateParams.FulfillmentDetails.Address(
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
         * map. See {@link RequestedSessionCreateParams.FulfillmentDetails.Address#extraParams} for
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
         * map. See {@link RequestedSessionCreateParams.FulfillmentDetails.Address#extraParams} for
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

        /** <strong>Required.</strong> State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
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

    /** <strong>Required.</strong> The quantity of the line item. */
    @SerializedName("quantity")
    Long quantity;

    /** <strong>Required.</strong> The SKU ID of the line item. */
    @SerializedName("sku_id")
    String skuId;

    private LineItemDetail(Map<String, Object> extraParams, Long quantity, String skuId) {
      this.extraParams = extraParams;
      this.quantity = quantity;
      this.skuId = skuId;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long quantity;

      private String skuId;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionCreateParams.LineItemDetail build() {
        return new RequestedSessionCreateParams.LineItemDetail(
            this.extraParams, this.quantity, this.skuId);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionCreateParams.LineItemDetail#extraParams} for the field documentation.
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
       * See {@link RequestedSessionCreateParams.LineItemDetail#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The quantity of the line item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /** <strong>Required.</strong> The SKU ID of the line item. */
      public Builder setSkuId(String skuId) {
        this.skuId = skuId;
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
      public RequestedSessionCreateParams.PaymentMethodData build() {
        return new RequestedSessionCreateParams.PaymentMethodData(
            this.billingDetails, this.card, this.extraParams, this.type);
      }

      /** The billing details for the payment method data. */
      public Builder setBillingDetails(
          RequestedSessionCreateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** The card for the payment method data. */
      public Builder setCard(RequestedSessionCreateParams.PaymentMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionCreateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link RequestedSessionCreateParams.PaymentMethodData#extraParams} for the field
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
      public Builder setType(RequestedSessionCreateParams.PaymentMethodData.Type type) {
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
        public RequestedSessionCreateParams.PaymentMethodData.BillingDetails build() {
          return new RequestedSessionCreateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** The address for the billing details. */
        public Builder setAddress(
            RequestedSessionCreateParams.PaymentMethodData.BillingDetails.Address address) {
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
         * RequestedSessionCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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
         * RequestedSessionCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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

        /** <strong>Required.</strong> State, county, province, or region. */
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
          public RequestedSessionCreateParams.PaymentMethodData.BillingDetails.Address build() {
            return new RequestedSessionCreateParams.PaymentMethodData.BillingDetails.Address(
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
           * RequestedSessionCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * RequestedSessionCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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

          /** <strong>Required.</strong> State, county, province, or region. */
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
        public RequestedSessionCreateParams.PaymentMethodData.Card build() {
          return new RequestedSessionCreateParams.PaymentMethodData.Card(
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
         * map. See {@link RequestedSessionCreateParams.PaymentMethodData.Card#extraParams} for the
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
         * map. See {@link RequestedSessionCreateParams.PaymentMethodData.Card#extraParams} for the
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
  public static class SellerDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The network profile for the seller. */
    @SerializedName("network_profile")
    String networkProfile;

    private SellerDetails(Map<String, Object> extraParams, String networkProfile) {
      this.extraParams = extraParams;
      this.networkProfile = networkProfile;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String networkProfile;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionCreateParams.SellerDetails build() {
        return new RequestedSessionCreateParams.SellerDetails(
            this.extraParams, this.networkProfile);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionCreateParams.SellerDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionCreateParams.SellerDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The network profile for the seller. */
      public Builder setNetworkProfile(String networkProfile) {
        this.networkProfile = networkProfile;
        return this;
      }
    }
  }

  public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
    @SerializedName("on_session")
    ON_SESSION("on_session");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SetupFutureUsage(String value) {
      this.value = value;
    }
  }
}
