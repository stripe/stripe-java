// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OrderCreateParams extends ApiRequestParams {
  /** Settings for automatic tax calculation for this order. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Billing details for the customer. If a customer is provided, this will be automatically
   * populated with values from that customer if override values are not provided.
   */
  @SerializedName("billing_details")
  Object billingDetails;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The customer associated with this order. */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The coupons, promotion codes, and/or discounts to apply to the order. */
  @SerializedName("discounts")
  Object discounts;

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

  /** The IP address of the purchaser for this order. */
  @SerializedName("ip_address")
  String ipAddress;

  /**
   * <strong>Required.</strong> A list of line items the customer is ordering. Each line item
   * includes information about the product, the quantity, and the resulting cost.
   */
  @SerializedName("line_items")
  List<OrderCreateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Payment information associated with the order, including payment settings. */
  @SerializedName("payment")
  Payment payment;

  /** Settings for the customer cost of shipping for this order. */
  @SerializedName("shipping_cost")
  Object shippingCost;

  /** Shipping details for the order. */
  @SerializedName("shipping_details")
  Object shippingDetails;

  /** Additional tax details about the purchaser to be used for this order. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  private OrderCreateParams(
      AutomaticTax automaticTax,
      Object billingDetails,
      String currency,
      String customer,
      String description,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      String ipAddress,
      List<OrderCreateParams.LineItem> lineItems,
      Map<String, String> metadata,
      Payment payment,
      Object shippingCost,
      Object shippingDetails,
      TaxDetails taxDetails) {
    this.automaticTax = automaticTax;
    this.billingDetails = billingDetails;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.discounts = discounts;
    this.expand = expand;
    this.extraParams = extraParams;
    this.ipAddress = ipAddress;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.payment = payment;
    this.shippingCost = shippingCost;
    this.shippingDetails = shippingDetails;
    this.taxDetails = taxDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AutomaticTax automaticTax;

    private Object billingDetails;

    private String currency;

    private String customer;

    private String description;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String ipAddress;

    private List<OrderCreateParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private Payment payment;

    private Object shippingCost;

    private Object shippingDetails;

    private TaxDetails taxDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderCreateParams build() {
      return new OrderCreateParams(
          this.automaticTax,
          this.billingDetails,
          this.currency,
          this.customer,
          this.description,
          this.discounts,
          this.expand,
          this.extraParams,
          this.ipAddress,
          this.lineItems,
          this.metadata,
          this.payment,
          this.shippingCost,
          this.shippingDetails,
          this.taxDetails);
    }

    /** Settings for automatic tax calculation for this order. */
    public Builder setAutomaticTax(OrderCreateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Billing details for the customer. If a customer is provided, this will be automatically
     * populated with values from that customer if override values are not provided.
     */
    public Builder setBillingDetails(OrderCreateParams.BillingDetails billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * Billing details for the customer. If a customer is provided, this will be automatically
     * populated with values from that customer if override values are not provided.
     */
    public Builder setBillingDetails(EmptyParam billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** The customer associated with this order. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(OrderCreateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<OrderCreateParams.Discount>();
      }
      ((List<OrderCreateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<OrderCreateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<OrderCreateParams.Discount>();
      }
      ((List<OrderCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** The coupons, promotion codes, and/or discounts to apply to the order. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** The coupons, promotion codes, and/or discounts to apply to the order. */
    public Builder setDiscounts(List<OrderCreateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#expand} for the field documentation.
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
     * OrderCreateParams#expand} for the field documentation.
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
     * OrderCreateParams#extraParams} for the field documentation.
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
     * See {@link OrderCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The IP address of the purchaser for this order. */
    public Builder setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(OrderCreateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<OrderCreateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OrderCreateParams#metadata} for the field documentation.
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
     * See {@link OrderCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Payment information associated with the order, including payment settings. */
    public Builder setPayment(OrderCreateParams.Payment payment) {
      this.payment = payment;
      return this;
    }

    /** Settings for the customer cost of shipping for this order. */
    public Builder setShippingCost(OrderCreateParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /** Settings for the customer cost of shipping for this order. */
    public Builder setShippingCost(EmptyParam shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /** Shipping details for the order. */
    public Builder setShippingDetails(OrderCreateParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /** Shipping details for the order. */
    public Builder setShippingDetails(EmptyParam shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /** Additional tax details about the purchaser to be used for this order. */
    public Builder setTaxDetails(OrderCreateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> Enable automatic tax calculation which will automatically compute
     * tax rates on this order.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.AutomaticTax build() {
        return new OrderCreateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Enable automatic tax calculation which will automatically
       * compute tax rates on this order.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class BillingDetails {
    /** The billing address provided by the customer. */
    @SerializedName("address")
    Address address;

    /** The billing email provided by the customer. */
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

    /** The billing name provided by the customer. */
    @SerializedName("name")
    String name;

    /** The billing phone number provided by the customer. */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
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
      public OrderCreateParams.BillingDetails build() {
        return new OrderCreateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** The billing address provided by the customer. */
      public Builder setAddress(OrderCreateParams.BillingDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The billing email provided by the customer. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.BillingDetails#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.BillingDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The billing name provided by the customer. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The billing phone number provided by the customer. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
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
        public OrderCreateParams.BillingDetails.Address build() {
          return new OrderCreateParams.BillingDetails.Address(
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
         * map. See {@link OrderCreateParams.BillingDetails.Address#extraParams} for the field
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
         * map. See {@link OrderCreateParams.BillingDetails.Address#extraParams} for the field
         * documentation.
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

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
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
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    String promotionCode;

    private Discount(
        String coupon, String discount, Map<String, Object> extraParams, String promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private String discount;

      private Map<String, Object> extraParams;

      private String promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.Discount build() {
        return new OrderCreateParams.Discount(
            this.coupon, this.discount, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.Discount#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.Discount#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItem {
    /** The description for the line item. Will default to the name of the associated product. */
    @SerializedName("description")
    String description;

    /** The discounts applied to this line item. */
    @SerializedName("discounts")
    Object discounts;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The ID of a <a href="https://docs.stripe.com/api/prices">Price</a> to add to the Order.
     *
     * <p>The {@code price} parameter is an alternative to using the {@code product} parameter. If
     * each of your products are sold at a single price, you can set {@code Product.default_price}
     * and then pass the {@code product} parameter when creating a line item. If your products are
     * sold at several possible prices, use the {@code price} parameter to explicitly specify which
     * one to use.
     */
    @SerializedName("price")
    String price;

    /**
     * Data used to generate a new Price object inline.
     *
     * <p>The {@code price_data} parameter is an alternative to using the {@code product} or {@code
     * price} parameters. If you create a Product upfront and configure a {@code
     * Product.default_price}, pass the {@code product} parameter when creating a line item. If you
     * prefer not to define Products upfront, or if you charge variable prices, pass the {@code
     * price_data} parameter to describe the price for this line item.
     *
     * <p>Each time you pass {@code price_data} we create a Price for the Product. This Price is
     * hidden in both the Dashboard and API lists and cannot be reused.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /**
     * The ID of a <a href="https://docs.stripe.com/api/products">Product</a> to add to the Order.
     *
     * <p>The Product must have a {@code default_price} specified. Otherwise, specify the price by
     * passing the {@code price} or {@code price_data} parameter.
     */
    @SerializedName("product")
    String product;

    /**
     * Defines a <a href="https://docs.stripe.com/api/products">Product</a> inline and adds it to
     * the Order.
     *
     * <p>{@code product_data} is an alternative to the {@code product} parameter. If you created a
     * Product upfront, use the {@code product} parameter to refer to the existing Product. But if
     * you prefer not to create Products upfront, pass the {@code product_data} parameter to define
     * a Product inline as part of configuring the Order.
     *
     * <p>{@code product_data} automatically creates a Product, just as if you had manually created
     * the Product. If a Product with the same ID already exists, then {@code product_data} re-uses
     * it to avoid duplicates.
     */
    @SerializedName("product_data")
    ProductData productData;

    /** The quantity of the line item. */
    @SerializedName("quantity")
    Long quantity;

    /** The tax rates applied to this line item. */
    @SerializedName("tax_rates")
    Object taxRates;

    private LineItem(
        String description,
        Object discounts,
        Map<String, Object> extraParams,
        String price,
        PriceData priceData,
        String product,
        ProductData productData,
        Long quantity,
        Object taxRates) {
      this.description = description;
      this.discounts = discounts;
      this.extraParams = extraParams;
      this.price = price;
      this.priceData = priceData;
      this.product = product;
      this.productData = productData;
      this.quantity = quantity;
      this.taxRates = taxRates;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String description;

      private Object discounts;

      private Map<String, Object> extraParams;

      private String price;

      private PriceData priceData;

      private String product;

      private ProductData productData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.LineItem build() {
        return new OrderCreateParams.LineItem(
            this.description,
            this.discounts,
            this.extraParams,
            this.price,
            this.priceData,
            this.product,
            this.productData,
            this.quantity,
            this.taxRates);
      }

      /** The description for the line item. Will default to the name of the associated product. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(OrderCreateParams.LineItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<OrderCreateParams.LineItem.Discount>();
        }
        ((List<OrderCreateParams.LineItem.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(List<OrderCreateParams.LineItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<OrderCreateParams.LineItem.Discount>();
        }
        ((List<OrderCreateParams.LineItem.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(List<OrderCreateParams.LineItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The ID of a <a href="https://docs.stripe.com/api/prices">Price</a> to add to the Order.
       *
       * <p>The {@code price} parameter is an alternative to using the {@code product} parameter. If
       * each of your products are sold at a single price, you can set {@code Product.default_price}
       * and then pass the {@code product} parameter when creating a line item. If your products are
       * sold at several possible prices, use the {@code price} parameter to explicitly specify
       * which one to use.
       */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new Price object inline.
       *
       * <p>The {@code price_data} parameter is an alternative to using the {@code product} or
       * {@code price} parameters. If you create a Product upfront and configure a {@code
       * Product.default_price}, pass the {@code product} parameter when creating a line item. If
       * you prefer not to define Products upfront, or if you charge variable prices, pass the
       * {@code price_data} parameter to describe the price for this line item.
       *
       * <p>Each time you pass {@code price_data} we create a Price for the Product. This Price is
       * hidden in both the Dashboard and API lists and cannot be reused.
       */
      public Builder setPriceData(OrderCreateParams.LineItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /**
       * The ID of a <a href="https://docs.stripe.com/api/products">Product</a> to add to the Order.
       *
       * <p>The Product must have a {@code default_price} specified. Otherwise, specify the price by
       * passing the {@code price} or {@code price_data} parameter.
       */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /**
       * Defines a <a href="https://docs.stripe.com/api/products">Product</a> inline and adds it to
       * the Order.
       *
       * <p>{@code product_data} is an alternative to the {@code product} parameter. If you created
       * a Product upfront, use the {@code product} parameter to refer to the existing Product. But
       * if you prefer not to create Products upfront, pass the {@code product_data} parameter to
       * define a Product inline as part of configuring the Order.
       *
       * <p>{@code product_data} automatically creates a Product, just as if you had manually
       * created the Product. If a Product with the same ID already exists, then {@code
       * product_data} re-uses it to avoid duplicates.
       */
      public Builder setProductData(OrderCreateParams.LineItem.ProductData productData) {
        this.productData = productData;
        return this;
      }

      /** The quantity of the line item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addTaxRate(String element) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      /** The tax rates applied to this line item. */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /** The tax rates applied to this line item. */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      String coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      String discount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Discount(String coupon, String discount, Map<String, Object> extraParams) {
        this.coupon = coupon;
        this.discount = discount;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String coupon;

        private String discount;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.LineItem.Discount build() {
          return new OrderCreateParams.LineItem.Discount(
              this.coupon, this.discount, this.extraParams);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.LineItem.Discount#extraParams} for the field
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
         * map. See {@link OrderCreateParams.LineItem.Discount#extraParams} for the field
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
    @EqualsAndHashCode(callSuper = false)
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
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
       * ID of the <a href="https://docs.stripe.com/api/products">Product</a> this <a
       * href="https://docs.stripe.com/api/prices">Price</a> belongs to.
       *
       * <p>Use this to implement a variable-pricing model in your integration. This is required if
       * {@code product_data} is not specified.
       */
      @SerializedName("product")
      String product;

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          TaxBehavior taxBehavior,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String currency;

        private Map<String, Object> extraParams;

        private String product;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.LineItem.PriceData build() {
          return new OrderCreateParams.LineItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link OrderCreateParams.LineItem.PriceData#extraParams} for the field
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
         * ID of the <a href="https://docs.stripe.com/api/products">Product</a> this <a
         * href="https://docs.stripe.com/api/prices">Price</a> belongs to.
         *
         * <p>Use this to implement a variable-pricing model in your integration. This is required
         * if {@code product_data} is not specified.
         */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            OrderCreateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ProductData {
      /**
       * The product's description, meant to be displayable to the customer. Use this field to
       * optionally store a long form explanation of the product being sold for your own rendering
       * purposes.
       */
      @SerializedName("description")
      Object description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A unique identifier for this product.
       *
       * <p>{@code product_data} automatically creates a Product with this ID. If a Product with the
       * same ID already exists, then {@code product_data} re-uses it to avoid duplicates. If any of
       * the fields in the existing Product are different from the values in {@code product_data},
       * {@code product_data} updates the existing Product with the new information. So set {@code
       * product_data[id]} to the same string every time you sell the same product, but don't re-use
       * the same string for different products.
       */
      @SerializedName("id")
      String id;

      /**
       * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
       */
      @SerializedName("images")
      Object images;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Object metadata;

      /** <strong>Required.</strong> The product's name, meant to be displayable to the customer. */
      @SerializedName("name")
      String name;

      /** The dimensions of this product for shipping purposes. */
      @SerializedName("package_dimensions")
      Object packageDimensions;

      /** Whether this product is shipped (i.e., physical goods). */
      @SerializedName("shippable")
      Boolean shippable;

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      @SerializedName("tax_code")
      Object taxCode;

      /** A URL of a publicly-accessible webpage for this product. */
      @SerializedName("url")
      Object url;

      private ProductData(
          Object description,
          Map<String, Object> extraParams,
          String id,
          Object images,
          Object metadata,
          String name,
          Object packageDimensions,
          Boolean shippable,
          Object taxCode,
          Object url) {
        this.description = description;
        this.extraParams = extraParams;
        this.id = id;
        this.images = images;
        this.metadata = metadata;
        this.name = name;
        this.packageDimensions = packageDimensions;
        this.shippable = shippable;
        this.taxCode = taxCode;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object description;

        private Map<String, Object> extraParams;

        private String id;

        private Object images;

        private Object metadata;

        private String name;

        private Object packageDimensions;

        private Boolean shippable;

        private Object taxCode;

        private Object url;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.LineItem.ProductData build() {
          return new OrderCreateParams.LineItem.ProductData(
              this.description,
              this.extraParams,
              this.id,
              this.images,
              this.metadata,
              this.name,
              this.packageDimensions,
              this.shippable,
              this.taxCode,
              this.url);
        }

        /**
         * The product's description, meant to be displayable to the customer. Use this field to
         * optionally store a long form explanation of the product being sold for your own rendering
         * purposes.
         */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * The product's description, meant to be displayable to the customer. Use this field to
         * optionally store a long form explanation of the product being sold for your own rendering
         * purposes.
         */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.LineItem.ProductData#extraParams} for the field
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
         * map. See {@link OrderCreateParams.LineItem.ProductData#extraParams} for the field
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
         * <strong>Required.</strong> A unique identifier for this product.
         *
         * <p>{@code product_data} automatically creates a Product with this ID. If a Product with
         * the same ID already exists, then {@code product_data} re-uses it to avoid duplicates. If
         * any of the fields in the existing Product are different from the values in {@code
         * product_data}, {@code product_data} updates the existing Product with the new
         * information. So set {@code product_data[id]} to the same string every time you sell the
         * same product, but don't re-use the same string for different products.
         */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /**
         * Add an element to `images` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * OrderCreateParams.LineItem.ProductData#images} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addImage(String element) {
          if (this.images == null || this.images instanceof EmptyParam) {
            this.images = new ArrayList<String>();
          }
          ((List<String>) this.images).add(element);
          return this;
        }

        /**
         * Add all elements to `images` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * OrderCreateParams.LineItem.ProductData#images} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllImage(List<String> elements) {
          if (this.images == null || this.images instanceof EmptyParam) {
            this.images = new ArrayList<String>();
          }
          ((List<String>) this.images).addAll(elements);
          return this;
        }

        /**
         * A list of up to 8 URLs of images for this product, meant to be displayable to the
         * customer.
         */
        public Builder setImages(EmptyParam images) {
          this.images = images;
          return this;
        }

        /**
         * A list of up to 8 URLs of images for this product, meant to be displayable to the
         * customer.
         */
        public Builder setImages(List<String> images) {
          this.images = images;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * OrderCreateParams.LineItem.ProductData#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.LineItem.ProductData#metadata} for the field
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
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(EmptyParam metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(Map<String, String> metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The dimensions of this product for shipping purposes. */
        public Builder setPackageDimensions(
            OrderCreateParams.LineItem.ProductData.PackageDimensions packageDimensions) {
          this.packageDimensions = packageDimensions;
          return this;
        }

        /** The dimensions of this product for shipping purposes. */
        public Builder setPackageDimensions(EmptyParam packageDimensions) {
          this.packageDimensions = packageDimensions;
          return this;
        }

        /** Whether this product is shipped (i.e., physical goods). */
        public Builder setShippable(Boolean shippable) {
          this.shippable = shippable;
          return this;
        }

        /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
        public Builder setTaxCode(String taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
        public Builder setTaxCode(EmptyParam taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** A URL of a publicly-accessible webpage for this product. */
        public Builder setUrl(String url) {
          this.url = url;
          return this;
        }

        /** A URL of a publicly-accessible webpage for this product. */
        public Builder setUrl(EmptyParam url) {
          this.url = url;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PackageDimensions {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Height, in inches. Maximum precision is 2 decimal places. */
        @SerializedName("height")
        BigDecimal height;

        /** <strong>Required.</strong> Length, in inches. Maximum precision is 2 decimal places. */
        @SerializedName("length")
        BigDecimal length;

        /** <strong>Required.</strong> Weight, in ounces. Maximum precision is 2 decimal places. */
        @SerializedName("weight")
        BigDecimal weight;

        /** <strong>Required.</strong> Width, in inches. Maximum precision is 2 decimal places. */
        @SerializedName("width")
        BigDecimal width;

        private PackageDimensions(
            Map<String, Object> extraParams,
            BigDecimal height,
            BigDecimal length,
            BigDecimal weight,
            BigDecimal width) {
          this.extraParams = extraParams;
          this.height = height;
          this.length = length;
          this.weight = weight;
          this.width = width;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private BigDecimal height;

          private BigDecimal length;

          private BigDecimal weight;

          private BigDecimal width;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderCreateParams.LineItem.ProductData.PackageDimensions build() {
            return new OrderCreateParams.LineItem.ProductData.PackageDimensions(
                this.extraParams, this.height, this.length, this.weight, this.width);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderCreateParams.LineItem.ProductData.PackageDimensions#extraParams}
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
           * map. See {@link OrderCreateParams.LineItem.ProductData.PackageDimensions#extraParams}
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
           * <strong>Required.</strong> Height, in inches. Maximum precision is 2 decimal places.
           */
          public Builder setHeight(BigDecimal height) {
            this.height = height;
            return this;
          }

          /**
           * <strong>Required.</strong> Length, in inches. Maximum precision is 2 decimal places.
           */
          public Builder setLength(BigDecimal length) {
            this.length = length;
            return this;
          }

          /**
           * <strong>Required.</strong> Weight, in ounces. Maximum precision is 2 decimal places.
           */
          public Builder setWeight(BigDecimal weight) {
            this.weight = weight;
            return this;
          }

          /** <strong>Required.</strong> Width, in inches. Maximum precision is 2 decimal places. */
          public Builder setWidth(BigDecimal width) {
            this.width = width;
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payment {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Settings describing how the order should configure generated
     * PaymentIntents.
     */
    @SerializedName("settings")
    Settings settings;

    private Payment(Map<String, Object> extraParams, Settings settings) {
      this.extraParams = extraParams;
      this.settings = settings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Settings settings;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.Payment build() {
        return new OrderCreateParams.Payment(this.extraParams, this.settings);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.Payment#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.Payment#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Settings describing how the order should configure generated
       * PaymentIntents.
       */
      public Builder setSettings(OrderCreateParams.Payment.Settings settings) {
        this.settings = settings;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Settings {
      /**
       * The amount of the application fee (if any) that will be requested to be applied to the
       * payment and transferred to the application owner's Stripe account.
       */
      @SerializedName("application_fee_amount")
      Long applicationFeeAmount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** PaymentMethod-specific configuration to provide to the order's PaymentIntent. */
      @SerializedName("payment_method_options")
      PaymentMethodOptions paymentMethodOptions;

      /**
       * The list of <a href="https://stripe.com/docs/payments/payment-methods/overview">payment
       * method types</a> to provide to the order's PaymentIntent. Do not include this attribute if
       * you prefer to manage your payment methods from the <a
       * href="https://dashboard.stripe.com/settings/payment_methods">Stripe Dashboard</a>.
       */
      @SerializedName("payment_method_types")
      List<OrderCreateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes;

      /** The URL to redirect the customer to after they authenticate their payment. */
      @SerializedName("return_url")
      String returnUrl;

      /**
       * For non-card charges, you can use this value as the complete description that appears on
       * your customers' statements. Must contain at least one letter, maximum 22 characters.
       */
      @SerializedName("statement_descriptor")
      String statementDescriptor;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on
       * the account to form the complete statement descriptor. Maximum 22 characters for the
       * concatenated descriptor.
       */
      @SerializedName("statement_descriptor_suffix")
      String statementDescriptorSuffix;

      /** Provides configuration for completing a transfer for the order after it is paid. */
      @SerializedName("transfer_data")
      TransferData transferData;

      private Settings(
          Long applicationFeeAmount,
          Map<String, Object> extraParams,
          PaymentMethodOptions paymentMethodOptions,
          List<OrderCreateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes,
          String returnUrl,
          String statementDescriptor,
          String statementDescriptorSuffix,
          TransferData transferData) {
        this.applicationFeeAmount = applicationFeeAmount;
        this.extraParams = extraParams;
        this.paymentMethodOptions = paymentMethodOptions;
        this.paymentMethodTypes = paymentMethodTypes;
        this.returnUrl = returnUrl;
        this.statementDescriptor = statementDescriptor;
        this.statementDescriptorSuffix = statementDescriptorSuffix;
        this.transferData = transferData;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long applicationFeeAmount;

        private Map<String, Object> extraParams;

        private PaymentMethodOptions paymentMethodOptions;

        private List<OrderCreateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes;

        private String returnUrl;

        private String statementDescriptor;

        private String statementDescriptorSuffix;

        private TransferData transferData;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.Payment.Settings build() {
          return new OrderCreateParams.Payment.Settings(
              this.applicationFeeAmount,
              this.extraParams,
              this.paymentMethodOptions,
              this.paymentMethodTypes,
              this.returnUrl,
              this.statementDescriptor,
              this.statementDescriptorSuffix,
              this.transferData);
        }

        /**
         * The amount of the application fee (if any) that will be requested to be applied to the
         * payment and transferred to the application owner's Stripe account.
         */
        public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
          this.applicationFeeAmount = applicationFeeAmount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.Payment.Settings#extraParams} for the field
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
         * map. See {@link OrderCreateParams.Payment.Settings#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** PaymentMethod-specific configuration to provide to the order's PaymentIntent. */
        public Builder setPaymentMethodOptions(
            OrderCreateParams.Payment.Settings.PaymentMethodOptions paymentMethodOptions) {
          this.paymentMethodOptions = paymentMethodOptions;
          return this;
        }

        /**
         * Add an element to `paymentMethodTypes` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link OrderCreateParams.Payment.Settings#paymentMethodTypes} for the field
         * documentation.
         */
        public Builder addPaymentMethodType(
            OrderCreateParams.Payment.Settings.PaymentMethodType element) {
          if (this.paymentMethodTypes == null) {
            this.paymentMethodTypes = new ArrayList<>();
          }
          this.paymentMethodTypes.add(element);
          return this;
        }

        /**
         * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link OrderCreateParams.Payment.Settings#paymentMethodTypes} for the field
         * documentation.
         */
        public Builder addAllPaymentMethodType(
            List<OrderCreateParams.Payment.Settings.PaymentMethodType> elements) {
          if (this.paymentMethodTypes == null) {
            this.paymentMethodTypes = new ArrayList<>();
          }
          this.paymentMethodTypes.addAll(elements);
          return this;
        }

        /** The URL to redirect the customer to after they authenticate their payment. */
        public Builder setReturnUrl(String returnUrl) {
          this.returnUrl = returnUrl;
          return this;
        }

        /**
         * For non-card charges, you can use this value as the complete description that appears on
         * your customers' statements. Must contain at least one letter, maximum 22 characters.
         */
        public Builder setStatementDescriptor(String statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on
         * the account to form the complete statement descriptor. Maximum 22 characters for the
         * concatenated descriptor.
         */
        public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
          this.statementDescriptorSuffix = statementDescriptorSuffix;
          return this;
        }

        /** Provides configuration for completing a transfer for the order after it is paid. */
        public Builder setTransferData(
            OrderCreateParams.Payment.Settings.TransferData transferData) {
          this.transferData = transferData;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentMethodOptions {
        /**
         * If paying by {@code acss_debit}, this sub-hash contains details about the ACSS Debit
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("acss_debit")
        AcssDebit acssDebit;

        /**
         * If paying by {@code afterpay_clearpay}, this sub-hash contains details about the
         * AfterpayClearpay payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("afterpay_clearpay")
        AfterpayClearpay afterpayClearpay;

        /**
         * If paying by {@code alipay}, this sub-hash contains details about the Alipay payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("alipay")
        Alipay alipay;

        /**
         * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("bancontact")
        Bancontact bancontact;

        /**
         * If paying by {@code card}, this sub-hash contains details about the Card payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("card")
        Card card;

        /**
         * If paying by {@code customer_balance}, this sub-hash contains details about the Customer
         * Balance payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("customer_balance")
        CustomerBalance customerBalance;

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
         * If paying by {@code ideal}, this sub-hash contains details about the iDEAL payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("ideal")
        Ideal ideal;

        /**
         * If paying by {@code klarna}, this sub-hash contains details about the Klarna payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("klarna")
        Klarna klarna;

        /**
         * If paying by {@code link}, this sub-hash contains details about the Link payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("link")
        Link link;

        /**
         * If paying by {@code oxxo}, this sub-hash contains details about the OXXO payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("oxxo")
        Oxxo oxxo;

        /**
         * If paying by {@code p24}, this sub-hash contains details about the P24 payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("p24")
        P24 p24;

        /**
         * If paying by {@code paypal}, this sub-hash contains details about the PayPal payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("paypal")
        Paypal paypal;

        /**
         * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Debit
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("sepa_debit")
        SepaDebit sepaDebit;

        /**
         * If paying by {@code sofort}, this sub-hash contains details about the Sofort payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("sofort")
        Sofort sofort;

        /**
         * If paying by {@code wechat_pay}, this sub-hash contains details about the WeChat Pay
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("wechat_pay")
        WechatPay wechatPay;

        private PaymentMethodOptions(
            AcssDebit acssDebit,
            AfterpayClearpay afterpayClearpay,
            Alipay alipay,
            Bancontact bancontact,
            Card card,
            CustomerBalance customerBalance,
            Map<String, Object> extraParams,
            Ideal ideal,
            Klarna klarna,
            Link link,
            Oxxo oxxo,
            P24 p24,
            Paypal paypal,
            SepaDebit sepaDebit,
            Sofort sofort,
            WechatPay wechatPay) {
          this.acssDebit = acssDebit;
          this.afterpayClearpay = afterpayClearpay;
          this.alipay = alipay;
          this.bancontact = bancontact;
          this.card = card;
          this.customerBalance = customerBalance;
          this.extraParams = extraParams;
          this.ideal = ideal;
          this.klarna = klarna;
          this.link = link;
          this.oxxo = oxxo;
          this.p24 = p24;
          this.paypal = paypal;
          this.sepaDebit = sepaDebit;
          this.sofort = sofort;
          this.wechatPay = wechatPay;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AcssDebit acssDebit;

          private AfterpayClearpay afterpayClearpay;

          private Alipay alipay;

          private Bancontact bancontact;

          private Card card;

          private CustomerBalance customerBalance;

          private Map<String, Object> extraParams;

          private Ideal ideal;

          private Klarna klarna;

          private Link link;

          private Oxxo oxxo;

          private P24 p24;

          private Paypal paypal;

          private SepaDebit sepaDebit;

          private Sofort sofort;

          private WechatPay wechatPay;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderCreateParams.Payment.Settings.PaymentMethodOptions build() {
            return new OrderCreateParams.Payment.Settings.PaymentMethodOptions(
                this.acssDebit,
                this.afterpayClearpay,
                this.alipay,
                this.bancontact,
                this.card,
                this.customerBalance,
                this.extraParams,
                this.ideal,
                this.klarna,
                this.link,
                this.oxxo,
                this.p24,
                this.paypal,
                this.sepaDebit,
                this.sofort,
                this.wechatPay);
          }

          /**
           * If paying by {@code acss_debit}, this sub-hash contains details about the ACSS Debit
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setAcssDebit(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit acssDebit) {
            this.acssDebit = acssDebit;
            return this;
          }

          /**
           * If paying by {@code afterpay_clearpay}, this sub-hash contains details about the
           * AfterpayClearpay payment method options to pass to the order's PaymentIntent.
           */
          public Builder setAfterpayClearpay(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                  afterpayClearpay) {
            this.afterpayClearpay = afterpayClearpay;
            return this;
          }

          /**
           * If paying by {@code alipay}, this sub-hash contains details about the Alipay payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setAlipay(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay alipay) {
            this.alipay = alipay;
            return this;
          }

          /**
           * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setBancontact(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact bancontact) {
            this.bancontact = bancontact;
            return this;
          }

          /**
           * If paying by {@code card}, this sub-hash contains details about the Card payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setCard(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card card) {
            this.card = card;
            return this;
          }

          /**
           * If paying by {@code customer_balance}, this sub-hash contains details about the
           * Customer Balance payment method options to pass to the order's PaymentIntent.
           */
          public Builder setCustomerBalance(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                  customerBalance) {
            this.customerBalance = customerBalance;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderCreateParams.Payment.Settings.PaymentMethodOptions#extraParams}
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
           * map. See {@link OrderCreateParams.Payment.Settings.PaymentMethodOptions#extraParams}
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
           * If paying by {@code ideal}, this sub-hash contains details about the iDEAL payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setIdeal(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal ideal) {
            this.ideal = ideal;
            return this;
          }

          /**
           * If paying by {@code klarna}, this sub-hash contains details about the Klarna payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setKlarna(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna klarna) {
            this.klarna = klarna;
            return this;
          }

          /**
           * If paying by {@code link}, this sub-hash contains details about the Link payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setLink(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link link) {
            this.link = link;
            return this;
          }

          /**
           * If paying by {@code oxxo}, this sub-hash contains details about the OXXO payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setOxxo(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo oxxo) {
            this.oxxo = oxxo;
            return this;
          }

          /**
           * If paying by {@code p24}, this sub-hash contains details about the P24 payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setP24(OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24 p24) {
            this.p24 = p24;
            return this;
          }

          /**
           * If paying by {@code paypal}, this sub-hash contains details about the PayPal payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setPaypal(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal paypal) {
            this.paypal = paypal;
            return this;
          }

          /**
           * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Debit
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setSepaDebit(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
          }

          /**
           * If paying by {@code sofort}, this sub-hash contains details about the Sofort payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setSofort(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort sofort) {
            this.sofort = sofort;
            return this;
          }

          /**
           * If paying by {@code wechat_pay}, this sub-hash contains details about the WeChat Pay
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setWechatPay(
              OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay wechatPay) {
            this.wechatPay = wechatPay;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebit {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Additional fields for Mandate creation. */
          @SerializedName("mandate_options")
          MandateOptions mandateOptions;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          /**
           * Controls when Stripe will attempt to debit the funds from the customer's account. The
           * date must be a string in YYYY-MM-DD format. The date must be in the future and between
           * 3 and 15 calendar days from now.
           */
          @SerializedName("target_date")
          String targetDate;

          /** Bank account verification method. */
          @SerializedName("verification_method")
          VerificationMethod verificationMethod;

          private AcssDebit(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              ApiRequestParams.EnumParam setupFutureUsage,
              String targetDate,
              VerificationMethod verificationMethod) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.setupFutureUsage = setupFutureUsage;
            this.targetDate = targetDate;
            this.verificationMethod = verificationMethod;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private ApiRequestParams.EnumParam setupFutureUsage;

            private String targetDate;

            private VerificationMethod verificationMethod;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit(
                  this.extraParams,
                  this.mandateOptions,
                  this.setupFutureUsage,
                  this.targetDate,
                  this.verificationMethod);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Additional fields for Mandate creation. */
            public Builder setMandateOptions(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
                    mandateOptions) {
              this.mandateOptions = mandateOptions;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Controls when Stripe will attempt to debit the funds from the customer's account. The
             * date must be a string in YYYY-MM-DD format. The date must be in the future and
             * between 3 and 15 calendar days from now.
             */
            public Builder setTargetDate(String targetDate) {
              this.targetDate = targetDate;
              return this;
            }

            /** Bank account verification method. */
            public Builder setVerificationMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.VerificationMethod
                    verificationMethod) {
              this.verificationMethod = verificationMethod;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MandateOptions {
            /**
             * A URL for custom mandate text to render during confirmation step. The URL will be
             * rendered with additional GET parameters {@code payment_intent} and {@code
             * payment_intent_client_secret} when confirming a Payment Intent, or {@code
             * setup_intent} and {@code setup_intent_client_secret} when confirming a Setup Intent.
             */
            @SerializedName("custom_mandate_url")
            Object customMandateUrl;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * Description of the mandate interval. Only required if 'payment_schedule' parameter is
             * 'interval' or 'combined'.
             */
            @SerializedName("interval_description")
            String intervalDescription;

            /** Payment schedule for the mandate. */
            @SerializedName("payment_schedule")
            PaymentSchedule paymentSchedule;

            /** Transaction type of the mandate. */
            @SerializedName("transaction_type")
            TransactionType transactionType;

            private MandateOptions(
                Object customMandateUrl,
                Map<String, Object> extraParams,
                String intervalDescription,
                PaymentSchedule paymentSchedule,
                TransactionType transactionType) {
              this.customMandateUrl = customMandateUrl;
              this.extraParams = extraParams;
              this.intervalDescription = intervalDescription;
              this.paymentSchedule = paymentSchedule;
              this.transactionType = transactionType;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Object customMandateUrl;

              private Map<String, Object> extraParams;

              private String intervalDescription;

              private PaymentSchedule paymentSchedule;

              private TransactionType transactionType;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit
                      .MandateOptions
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit
                    .MandateOptions(
                    this.customMandateUrl,
                    this.extraParams,
                    this.intervalDescription,
                    this.paymentSchedule,
                    this.transactionType);
              }

              /**
               * A URL for custom mandate text to render during confirmation step. The URL will be
               * rendered with additional GET parameters {@code payment_intent} and {@code
               * payment_intent_client_secret} when confirming a Payment Intent, or {@code
               * setup_intent} and {@code setup_intent_client_secret} when confirming a Setup
               * Intent.
               */
              public Builder setCustomMandateUrl(String customMandateUrl) {
                this.customMandateUrl = customMandateUrl;
                return this;
              }

              /**
               * A URL for custom mandate text to render during confirmation step. The URL will be
               * rendered with additional GET parameters {@code payment_intent} and {@code
               * payment_intent_client_secret} when confirming a Payment Intent, or {@code
               * setup_intent} and {@code setup_intent_client_secret} when confirming a Setup
               * Intent.
               */
              public Builder setCustomMandateUrl(EmptyParam customMandateUrl) {
                this.customMandateUrl = customMandateUrl;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
               * Description of the mandate interval. Only required if 'payment_schedule' parameter
               * is 'interval' or 'combined'.
               */
              public Builder setIntervalDescription(String intervalDescription) {
                this.intervalDescription = intervalDescription;
                return this;
              }

              /** Payment schedule for the mandate. */
              public Builder setPaymentSchedule(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
                          .PaymentSchedule
                      paymentSchedule) {
                this.paymentSchedule = paymentSchedule;
                return this;
              }

              /** Transaction type of the mandate. */
              public Builder setTransactionType(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
                          .TransactionType
                      transactionType) {
                this.transactionType = transactionType;
                return this;
              }
            }

            public enum PaymentSchedule implements ApiRequestParams.EnumParam {
              @SerializedName("combined")
              COMBINED("combined"),

              @SerializedName("interval")
              INTERVAL("interval"),

              @SerializedName("sporadic")
              SPORADIC("sporadic");

              @Getter(onMethod_ = {@Override})
              private final String value;

              PaymentSchedule(String value) {
                this.value = value;
              }
            }

            public enum TransactionType implements ApiRequestParams.EnumParam {
              @SerializedName("business")
              BUSINESS("business"),

              @SerializedName("personal")
              PERSONAL("personal");

              @Getter(onMethod_ = {@Override})
              private final String value;

              TransactionType(String value) {
                this.value = value;
              }
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session"),

            @SerializedName("on_session")
            ON_SESSION("on_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }

          public enum VerificationMethod implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("instant")
            INSTANT("instant"),

            @SerializedName("microdeposits")
            MICRODEPOSITS("microdeposits");

            @Getter(onMethod_ = {@Override})
            private final String value;

            VerificationMethod(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AfterpayClearpay {
          /**
           * Controls when the funds are captured from the customer's account.
           *
           * <p>If provided, this parameter overrides the behavior of the top-level <a
           * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
           * for this payment method type when finalizing the payment with this payment method type.
           *
           * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
           * value for this parameter unsets the stored value for this payment method type.
           */
          @SerializedName("capture_method")
          CaptureMethod captureMethod;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * An internal identifier or reference this payment corresponds to. The identifier is
           * limited to 128 characters and may contain only letters, digits, underscores,
           * backslashes and dashes.
           */
          @SerializedName("reference")
          String reference;

          /**
           * Indicates that you intend to make future payments with the payment method.
           *
           * <p>Providing this parameter will <a
           * href="https://stripe.com/docs/payments/save-during-payment">attach the payment
           * method</a> to the order's Customer, if present, after the order's PaymentIntent is
           * confirmed and any required actions from the user are complete. If no Customer was
           * provided, the payment method can still be <a
           * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
           * after the transaction completes.
           *
           * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
           * dynamically optimize your payment flow and comply with regional legislation and network
           * rules, such as <a
           * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
           *
           * <p>If {@code setup_future_usage} is already set and you are performing a request using
           * a publishable key, you may only update the value from {@code on_session} to {@code
           * off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          private AfterpayClearpay(
              CaptureMethod captureMethod,
              Map<String, Object> extraParams,
              String reference,
              SetupFutureUsage setupFutureUsage) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.reference = reference;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private CaptureMethod captureMethod;

            private Map<String, Object> extraParams;

            private String reference;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay(
                  this.captureMethod, this.extraParams, this.reference, this.setupFutureUsage);
            }

            /**
             * Controls when the funds are captured from the customer's account.
             *
             * <p>If provided, this parameter overrides the behavior of the top-level <a
             * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
             * for this payment method type when finalizing the payment with this payment method
             * type.
             *
             * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
             * value for this parameter unsets the stored value for this payment method type.
             */
            public Builder setCaptureMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                        .CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay#extraParams}
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
             * An internal identifier or reference this payment corresponds to. The identifier is
             * limited to 128 characters and may contain only letters, digits, underscores,
             * backslashes and dashes.
             */
            public Builder setReference(String reference) {
              this.reference = reference;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with the payment method.
             *
             * <p>Providing this parameter will <a
             * href="https://stripe.com/docs/payments/save-during-payment">attach the payment
             * method</a> to the order's Customer, if present, after the order's PaymentIntent is
             * confirmed and any required actions from the user are complete. If no Customer was
             * provided, the payment method can still be <a
             * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
             * after the transaction completes.
             *
             * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
             * dynamically optimize your payment flow and comply with regional legislation and
             * network rules, such as <a
             * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
             *
             * <p>If {@code setup_future_usage} is already set and you are performing a request
             * using a publishable key, you may only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                        .SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum CaptureMethod implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("automatic_async")
            AUTOMATIC_ASYNC("automatic_async"),

            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            CaptureMethod(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Alipay {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          private Alipay(
              Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay(
                  this.extraParams, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay#extraParams} for the
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
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Alipay.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Bancontact {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
           */
          @SerializedName("preferred_language")
          PreferredLanguage preferredLanguage;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          private Bancontact(
              Map<String, Object> extraParams,
              PreferredLanguage preferredLanguage,
              ApiRequestParams.EnumParam setupFutureUsage) {
            this.extraParams = extraParams;
            this.preferredLanguage = preferredLanguage;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private PreferredLanguage preferredLanguage;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact(
                  this.extraParams, this.preferredLanguage, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact#extraParams} for
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
             * Preferred language of the Bancontact authorization page that the customer is
             * redirected to.
             */
            public Builder setPreferredLanguage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact.PreferredLanguage
                    preferredLanguage) {
              this.preferredLanguage = preferredLanguage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Bancontact.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum PreferredLanguage implements ApiRequestParams.EnumParam {
            @SerializedName("de")
            DE("de"),

            @SerializedName("en")
            EN("en"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("nl")
            NL("nl");

            @Getter(onMethod_ = {@Override})
            private final String value;

            PreferredLanguage(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Card {
          /** Controls when the funds will be captured from the customer's account. */
          @SerializedName("capture_method")
          CaptureMethod captureMethod;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with the payment method.
           *
           * <p>Providing this parameter will <a
           * href="https://stripe.com/docs/payments/save-during-payment">attach the payment
           * method</a> to the order's Customer, if present, after the order's PaymentIntent is
           * confirmed and any required actions from the user are complete. If no Customer was
           * provided, the payment method can still be <a
           * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
           * after the transaction completes.
           *
           * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
           * dynamically optimize your payment flow and comply with regional legislation and network
           * rules, such as <a
           * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
           *
           * <p>If {@code setup_future_usage} is already set and you are performing a request using
           * a publishable key, you may only update the value from {@code on_session} to {@code
           * off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          private Card(
              CaptureMethod captureMethod,
              Map<String, Object> extraParams,
              SetupFutureUsage setupFutureUsage) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private CaptureMethod captureMethod;

            private Map<String, Object> extraParams;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card(
                  this.captureMethod, this.extraParams, this.setupFutureUsage);
            }

            /** Controls when the funds will be captured from the customer's account. */
            public Builder setCaptureMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card.CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card#extraParams} for the
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
             * Indicates that you intend to make future payments with the payment method.
             *
             * <p>Providing this parameter will <a
             * href="https://stripe.com/docs/payments/save-during-payment">attach the payment
             * method</a> to the order's Customer, if present, after the order's PaymentIntent is
             * confirmed and any required actions from the user are complete. If no Customer was
             * provided, the payment method can still be <a
             * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
             * after the transaction completes.
             *
             * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
             * dynamically optimize your payment flow and comply with regional legislation and
             * network rules, such as <a
             * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
             *
             * <p>If {@code setup_future_usage} is already set and you are performing a request
             * using a publishable key, you may only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Card.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum CaptureMethod implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("automatic_async")
            AUTOMATIC_ASYNC("automatic_async"),

            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            CaptureMethod(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session"),

            @SerializedName("on_session")
            ON_SESSION("on_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CustomerBalance {
          /**
           * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
           * {@code bank_transfer}.
           */
          @SerializedName("bank_transfer")
          BankTransfer bankTransfer;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Permitted values include: {@code bank_transfer}.
           */
          @SerializedName("funding_type")
          FundingType fundingType;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          private CustomerBalance(
              BankTransfer bankTransfer,
              Map<String, Object> extraParams,
              FundingType fundingType,
              SetupFutureUsage setupFutureUsage) {
            this.bankTransfer = bankTransfer;
            this.extraParams = extraParams;
            this.fundingType = fundingType;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankTransfer bankTransfer;

            private Map<String, Object> extraParams;

            private FundingType fundingType;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance(
                  this.bankTransfer, this.extraParams, this.fundingType, this.setupFutureUsage);
            }

            /**
             * Configuration for the bank transfer funding type, if the {@code funding_type} is set
             * to {@code bank_transfer}.
             */
            public Builder setBankTransfer(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer
                    bankTransfer) {
              this.bankTransfer = bankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance#extraParams}
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
             * The funding method type to be used when there are not enough funds in the customer
             * balance. Permitted values include: {@code bank_transfer}.
             */
            public Builder setFundingType(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.FundingType
                    fundingType) {
              this.fundingType = fundingType;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                        .SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class BankTransfer {
            /** Configuration for the eu_bank_transfer funding type. */
            @SerializedName("eu_bank_transfer")
            EuBankTransfer euBankTransfer;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * List of address types that should be returned in the financial_addresses response. If
             * not specified, all valid types will be returned.
             *
             * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or
             * {@code spei}.
             */
            @SerializedName("requested_address_types")
            List<
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                        .BankTransfer.RequestedAddressType>
                requestedAddressTypes;

            /**
             * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent is
             * allowed to use for funding Permitted values include: {@code eu_bank_transfer}, {@code
             * gb_bank_transfer}, {@code jp_bank_transfer}, {@code mx_bank_transfer}, or {@code
             * us_bank_transfer}.
             */
            @SerializedName("type")
            Type type;

            private BankTransfer(
                EuBankTransfer euBankTransfer,
                Map<String, Object> extraParams,
                List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                            .BankTransfer.RequestedAddressType>
                    requestedAddressTypes,
                Type type) {
              this.euBankTransfer = euBankTransfer;
              this.extraParams = extraParams;
              this.requestedAddressTypes = requestedAddressTypes;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private EuBankTransfer euBankTransfer;

              private Map<String, Object> extraParams;

              private List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.RequestedAddressType>
                  requestedAddressTypes;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer(
                    this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
              }

              /** Configuration for the eu_bank_transfer funding type. */
              public Builder setEuBankTransfer(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.EuBankTransfer
                      euBankTransfer) {
                this.euBankTransfer = euBankTransfer;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
               * Add an element to `requestedAddressTypes` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
               * for the field documentation.
               */
              public Builder addRequestedAddressType(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.RequestedAddressType
                      element) {
                if (this.requestedAddressTypes == null) {
                  this.requestedAddressTypes = new ArrayList<>();
                }
                this.requestedAddressTypes.add(element);
                return this;
              }

              /**
               * Add all elements to `requestedAddressTypes` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
               * for the field documentation.
               */
              public Builder addAllRequestedAddressType(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                              .BankTransfer.RequestedAddressType>
                      elements) {
                if (this.requestedAddressTypes == null) {
                  this.requestedAddressTypes = new ArrayList<>();
                }
                this.requestedAddressTypes.addAll(elements);
                return this;
              }

              /**
               * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent
               * is allowed to use for funding Permitted values include: {@code eu_bank_transfer},
               * {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code mx_bank_transfer}, or
               * {@code us_bank_transfer}.
               */
              public Builder setType(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EuBankTransfer {
              /**
               * <strong>Required.</strong> The desired country code of the bank account
               * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
               * FR}, {@code IE}, or {@code NL}.
               */
              @SerializedName("country")
              String country;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private EuBankTransfer(String country, Map<String, Object> extraParams) {
                this.country = country;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String country;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                        .BankTransfer.EuBankTransfer
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer.EuBankTransfer(this.country, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The desired country code of the bank account
                 * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
                 * FR}, {@code IE}, or {@code NL}.
                 */
                public Builder setCountry(String country) {
                  this.country = country;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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

            public enum RequestedAddressType implements ApiRequestParams.EnumParam {
              @SerializedName("aba")
              ABA("aba"),

              @SerializedName("iban")
              IBAN("iban"),

              @SerializedName("sepa")
              SEPA("sepa"),

              @SerializedName("sort_code")
              SORT_CODE("sort_code"),

              @SerializedName("spei")
              SPEI("spei"),

              @SerializedName("swift")
              SWIFT("swift"),

              @SerializedName("zengin")
              ZENGIN("zengin");

              @Getter(onMethod_ = {@Override})
              private final String value;

              RequestedAddressType(String value) {
                this.value = value;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("eu_bank_transfer")
              EU_BANK_TRANSFER("eu_bank_transfer"),

              @SerializedName("gb_bank_transfer")
              GB_BANK_TRANSFER("gb_bank_transfer"),

              @SerializedName("jp_bank_transfer")
              JP_BANK_TRANSFER("jp_bank_transfer"),

              @SerializedName("mx_bank_transfer")
              MX_BANK_TRANSFER("mx_bank_transfer"),

              @SerializedName("us_bank_transfer")
              US_BANK_TRANSFER("us_bank_transfer");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          public enum FundingType implements ApiRequestParams.EnumParam {
            @SerializedName("bank_transfer")
            BANK_TRANSFER("bank_transfer");

            @Getter(onMethod_ = {@Override})
            private final String value;

            FundingType(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Ideal {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          private Ideal(
              Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal(
                  this.extraParams, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal#extraParams} for the
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
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Ideal.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Klarna {
          /**
           * Controls when the funds are captured from the customer's account.
           *
           * <p>If provided, this parameter overrides the behavior of the top-level <a
           * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
           * for this payment method type when finalizing the payment with this payment method type.
           *
           * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
           * value for this parameter unsets the stored value for this payment method type.
           */
          @SerializedName("capture_method")
          ApiRequestParams.EnumParam captureMethod;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** On-demand details if setting up or charging an on-demand payment. */
          @SerializedName("on_demand")
          OnDemand onDemand;

          /**
           * Preferred language of the Klarna authorization page that the customer is redirected to.
           */
          @SerializedName("preferred_locale")
          PreferredLocale preferredLocale;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          /** Subscription details if setting up or charging a subscription. */
          @SerializedName("subscriptions")
          Object subscriptions;

          /** Supplementary Purchase Data for the corresponding Klarna payment. */
          @SerializedName("supplementary_purchase_data")
          Object supplementaryPurchaseData;

          private Klarna(
              ApiRequestParams.EnumParam captureMethod,
              Map<String, Object> extraParams,
              OnDemand onDemand,
              PreferredLocale preferredLocale,
              SetupFutureUsage setupFutureUsage,
              Object subscriptions,
              Object supplementaryPurchaseData) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.onDemand = onDemand;
            this.preferredLocale = preferredLocale;
            this.setupFutureUsage = setupFutureUsage;
            this.subscriptions = subscriptions;
            this.supplementaryPurchaseData = supplementaryPurchaseData;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private ApiRequestParams.EnumParam captureMethod;

            private Map<String, Object> extraParams;

            private OnDemand onDemand;

            private PreferredLocale preferredLocale;

            private SetupFutureUsage setupFutureUsage;

            private Object subscriptions;

            private Object supplementaryPurchaseData;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna(
                  this.captureMethod,
                  this.extraParams,
                  this.onDemand,
                  this.preferredLocale,
                  this.setupFutureUsage,
                  this.subscriptions,
                  this.supplementaryPurchaseData);
            }

            /**
             * Controls when the funds are captured from the customer's account.
             *
             * <p>If provided, this parameter overrides the behavior of the top-level <a
             * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
             * for this payment method type when finalizing the payment with this payment method
             * type.
             *
             * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
             * value for this parameter unsets the stored value for this payment method type.
             */
            public Builder setCaptureMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Controls when the funds are captured from the customer's account.
             *
             * <p>If provided, this parameter overrides the behavior of the top-level <a
             * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
             * for this payment method type when finalizing the payment with this payment method
             * type.
             *
             * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
             * value for this parameter unsets the stored value for this payment method type.
             */
            public Builder setCaptureMethod(EmptyParam captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** On-demand details if setting up or charging an on-demand payment. */
            public Builder setOnDemand(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand onDemand) {
              this.onDemand = onDemand;
              return this;
            }

            /**
             * Preferred language of the Klarna authorization page that the customer is redirected
             * to.
             */
            public Builder setPreferredLocale(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.PreferredLocale
                    preferredLocale) {
              this.preferredLocale = preferredLocale;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Add an element to `subscriptions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna#subscriptions} for the
             * field documentation.
             */
            @SuppressWarnings("unchecked")
            public Builder addSubscription(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription
                    element) {
              if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
                this.subscriptions =
                    new ArrayList<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .Subscription>();
              }
              ((List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription>)
                      this.subscriptions)
                  .add(element);
              return this;
            }

            /**
             * Add all elements to `subscriptions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna#subscriptions} for the
             * field documentation.
             */
            @SuppressWarnings("unchecked")
            public Builder addAllSubscription(
                List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription>
                    elements) {
              if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
                this.subscriptions =
                    new ArrayList<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .Subscription>();
              }
              ((List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription>)
                      this.subscriptions)
                  .addAll(elements);
              return this;
            }

            /** Subscription details if setting up or charging a subscription. */
            public Builder setSubscriptions(EmptyParam subscriptions) {
              this.subscriptions = subscriptions;
              return this;
            }

            /** Subscription details if setting up or charging a subscription. */
            public Builder setSubscriptions(
                List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription>
                    subscriptions) {
              this.subscriptions = subscriptions;
              return this;
            }

            /** Supplementary Purchase Data for the corresponding Klarna payment. */
            public Builder setSupplementaryPurchaseData(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData
                    supplementaryPurchaseData) {
              this.supplementaryPurchaseData = supplementaryPurchaseData;
              return this;
            }

            /** Supplementary Purchase Data for the corresponding Klarna payment. */
            public Builder setSupplementaryPurchaseData(EmptyParam supplementaryPurchaseData) {
              this.supplementaryPurchaseData = supplementaryPurchaseData;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class OnDemand {
            /**
             * Your average amount value. You can use a value across your customer base, or segment
             * based on customer type, country, etc.
             */
            @SerializedName("average_amount")
            Long averageAmount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * The maximum value you may charge a customer per purchase. You can use a value across
             * your customer base, or segment based on customer type, country, etc.
             */
            @SerializedName("maximum_amount")
            Long maximumAmount;

            /**
             * The lowest or minimum value you may charge a customer per purchase. You can use a
             * value across your customer base, or segment based on customer type, country, etc.
             */
            @SerializedName("minimum_amount")
            Long minimumAmount;

            /** Interval at which the customer is making purchases. */
            @SerializedName("purchase_interval")
            PurchaseInterval purchaseInterval;

            /** The number of {@code purchase_interval} between charges. */
            @SerializedName("purchase_interval_count")
            Long purchaseIntervalCount;

            private OnDemand(
                Long averageAmount,
                Map<String, Object> extraParams,
                Long maximumAmount,
                Long minimumAmount,
                PurchaseInterval purchaseInterval,
                Long purchaseIntervalCount) {
              this.averageAmount = averageAmount;
              this.extraParams = extraParams;
              this.maximumAmount = maximumAmount;
              this.minimumAmount = minimumAmount;
              this.purchaseInterval = purchaseInterval;
              this.purchaseIntervalCount = purchaseIntervalCount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long averageAmount;

              private Map<String, Object> extraParams;

              private Long maximumAmount;

              private Long minimumAmount;

              private PurchaseInterval purchaseInterval;

              private Long purchaseIntervalCount;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand(
                    this.averageAmount,
                    this.extraParams,
                    this.maximumAmount,
                    this.minimumAmount,
                    this.purchaseInterval,
                    this.purchaseIntervalCount);
              }

              /**
               * Your average amount value. You can use a value across your customer base, or
               * segment based on customer type, country, etc.
               */
              public Builder setAverageAmount(Long averageAmount) {
                this.averageAmount = averageAmount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand#extraParams}
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
               * The maximum value you may charge a customer per purchase. You can use a value
               * across your customer base, or segment based on customer type, country, etc.
               */
              public Builder setMaximumAmount(Long maximumAmount) {
                this.maximumAmount = maximumAmount;
                return this;
              }

              /**
               * The lowest or minimum value you may charge a customer per purchase. You can use a
               * value across your customer base, or segment based on customer type, country, etc.
               */
              public Builder setMinimumAmount(Long minimumAmount) {
                this.minimumAmount = minimumAmount;
                return this;
              }

              /** Interval at which the customer is making purchases. */
              public Builder setPurchaseInterval(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.OnDemand
                          .PurchaseInterval
                      purchaseInterval) {
                this.purchaseInterval = purchaseInterval;
                return this;
              }

              /** The number of {@code purchase_interval} between charges. */
              public Builder setPurchaseIntervalCount(Long purchaseIntervalCount) {
                this.purchaseIntervalCount = purchaseIntervalCount;
                return this;
              }
            }

            public enum PurchaseInterval implements ApiRequestParams.EnumParam {
              @SerializedName("day")
              DAY("day"),

              @SerializedName("month")
              MONTH("month"),

              @SerializedName("week")
              WEEK("week"),

              @SerializedName("year")
              YEAR("year");

              @Getter(onMethod_ = {@Override})
              private final String value;

              PurchaseInterval(String value) {
                this.value = value;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Subscription {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> Unit of time between subscription charges. */
            @SerializedName("interval")
            Interval interval;

            /**
             * The number of intervals (specified in the {@code interval} attribute) between
             * subscription charges. For example, {@code interval=month} and {@code
             * interval_count=3} charges every 3 months.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            /** Name for subscription. */
            @SerializedName("name")
            String name;

            /** Describes the upcoming charge for this subscription. */
            @SerializedName("next_billing")
            NextBilling nextBilling;

            /**
             * <strong>Required.</strong> A non-customer-facing reference to correlate subscription
             * charges in the Klarna app. Use a value that persists across subscription charges.
             */
            @SerializedName("reference")
            String reference;

            private Subscription(
                Map<String, Object> extraParams,
                Interval interval,
                Long intervalCount,
                String name,
                NextBilling nextBilling,
                String reference) {
              this.extraParams = extraParams;
              this.interval = interval;
              this.intervalCount = intervalCount;
              this.name = name;
              this.nextBilling = nextBilling;
              this.reference = reference;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Interval interval;

              private Long intervalCount;

              private String name;

              private NextBilling nextBilling;

              private String reference;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                    .Subscription(
                    this.extraParams,
                    this.interval,
                    this.intervalCount,
                    this.name,
                    this.nextBilling,
                    this.reference);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> Unit of time between subscription charges. */
              public Builder setInterval(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription
                          .Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * The number of intervals (specified in the {@code interval} attribute) between
               * subscription charges. For example, {@code interval=month} and {@code
               * interval_count=3} charges every 3 months.
               */
              public Builder setIntervalCount(Long intervalCount) {
                this.intervalCount = intervalCount;
                return this;
              }

              /** Name for subscription. */
              public Builder setName(String name) {
                this.name = name;
                return this;
              }

              /** Describes the upcoming charge for this subscription. */
              public Builder setNextBilling(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription
                          .NextBilling
                      nextBilling) {
                this.nextBilling = nextBilling;
                return this;
              }

              /**
               * <strong>Required.</strong> A non-customer-facing reference to correlate
               * subscription charges in the Klarna app. Use a value that persists across
               * subscription charges.
               */
              public Builder setReference(String reference) {
                this.reference = reference;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class NextBilling {
              /** <strong>Required.</strong> The amount of the next charge for the subscription. */
              @SerializedName("amount")
              Long amount;

              /**
               * <strong>Required.</strong> The date of the next charge for the subscription in
               * YYYY-MM-DD format.
               */
              @SerializedName("date")
              String date;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private NextBilling(Long amount, String date, Map<String, Object> extraParams) {
                this.amount = amount;
                this.date = date;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Long amount;

                private String date;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription
                        .NextBilling
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .Subscription.NextBilling(this.amount, this.date, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The amount of the next charge for the subscription.
                 */
                public Builder setAmount(Long amount) {
                  this.amount = amount;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The date of the next charge for the subscription in
                 * YYYY-MM-DD format.
                 */
                public Builder setDate(String date) {
                  this.date = date;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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

            public enum Interval implements ApiRequestParams.EnumParam {
              @SerializedName("day")
              DAY("day"),

              @SerializedName("month")
              MONTH("month"),

              @SerializedName("week")
              WEEK("week"),

              @SerializedName("year")
              YEAR("year");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Interval(String value) {
                this.value = value;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class SupplementaryPurchaseData {
            /** Supplementary bus reservation details. */
            @SerializedName("bus_reservation_details")
            Object busReservationDetails;

            /** Supplementary event reservation details. */
            @SerializedName("event_reservation_details")
            Object eventReservationDetails;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Supplementary ferry reservation details. */
            @SerializedName("ferry_reservation_details")
            Object ferryReservationDetails;

            /** Supplementary insurance details. */
            @SerializedName("insurances")
            Object insurances;

            /** Supplementary marketplace seller details. */
            @SerializedName("marketplace_sellers")
            Object marketplaceSellers;

            /** Supplementary round trip reservation details. */
            @SerializedName("round_trip_reservation_details")
            Object roundTripReservationDetails;

            /** Supplementary train reservation details. */
            @SerializedName("train_reservation_details")
            Object trainReservationDetails;

            /** Voucher details, such as a gift card or discount code. */
            @SerializedName("vouchers")
            Object vouchers;

            private SupplementaryPurchaseData(
                Object busReservationDetails,
                Object eventReservationDetails,
                Map<String, Object> extraParams,
                Object ferryReservationDetails,
                Object insurances,
                Object marketplaceSellers,
                Object roundTripReservationDetails,
                Object trainReservationDetails,
                Object vouchers) {
              this.busReservationDetails = busReservationDetails;
              this.eventReservationDetails = eventReservationDetails;
              this.extraParams = extraParams;
              this.ferryReservationDetails = ferryReservationDetails;
              this.insurances = insurances;
              this.marketplaceSellers = marketplaceSellers;
              this.roundTripReservationDetails = roundTripReservationDetails;
              this.trainReservationDetails = trainReservationDetails;
              this.vouchers = vouchers;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Object busReservationDetails;

              private Object eventReservationDetails;

              private Map<String, Object> extraParams;

              private Object ferryReservationDetails;

              private Object insurances;

              private Object marketplaceSellers;

              private Object roundTripReservationDetails;

              private Object trainReservationDetails;

              private Object vouchers;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                    .SupplementaryPurchaseData(
                    this.busReservationDetails,
                    this.eventReservationDetails,
                    this.extraParams,
                    this.ferryReservationDetails,
                    this.insurances,
                    this.marketplaceSellers,
                    this.roundTripReservationDetails,
                    this.trainReservationDetails,
                    this.vouchers);
              }

              /**
               * Add an element to `busReservationDetails` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#busReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addBusReservationDetail(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail
                      element) {
                if (this.busReservationDetails == null
                    || this.busReservationDetails instanceof EmptyParam) {
                  this.busReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.BusReservationDetail>)
                        this.busReservationDetails)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `busReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#busReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllBusReservationDetail(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail>
                      elements) {
                if (this.busReservationDetails == null
                    || this.busReservationDetails instanceof EmptyParam) {
                  this.busReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.BusReservationDetail>)
                        this.busReservationDetails)
                    .addAll(elements);
                return this;
              }

              /** Supplementary bus reservation details. */
              public Builder setBusReservationDetails(EmptyParam busReservationDetails) {
                this.busReservationDetails = busReservationDetails;
                return this;
              }

              /** Supplementary bus reservation details. */
              public Builder setBusReservationDetails(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail>
                      busReservationDetails) {
                this.busReservationDetails = busReservationDetails;
                return this;
              }

              /**
               * Add an element to `eventReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#eventReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addEventReservationDetail(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.EventReservationDetail
                      element) {
                if (this.eventReservationDetails == null
                    || this.eventReservationDetails instanceof EmptyParam) {
                  this.eventReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.EventReservationDetail>)
                        this.eventReservationDetails)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `eventReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#eventReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllEventReservationDetail(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail>
                      elements) {
                if (this.eventReservationDetails == null
                    || this.eventReservationDetails instanceof EmptyParam) {
                  this.eventReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.EventReservationDetail>)
                        this.eventReservationDetails)
                    .addAll(elements);
                return this;
              }

              /** Supplementary event reservation details. */
              public Builder setEventReservationDetails(EmptyParam eventReservationDetails) {
                this.eventReservationDetails = eventReservationDetails;
                return this;
              }

              /** Supplementary event reservation details. */
              public Builder setEventReservationDetails(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail>
                      eventReservationDetails) {
                this.eventReservationDetails = eventReservationDetails;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#extraParams}
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
               * Add an element to `ferryReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#ferryReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addFerryReservationDetail(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail
                      element) {
                if (this.ferryReservationDetails == null
                    || this.ferryReservationDetails instanceof EmptyParam) {
                  this.ferryReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.FerryReservationDetail>)
                        this.ferryReservationDetails)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `ferryReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#ferryReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllFerryReservationDetail(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail>
                      elements) {
                if (this.ferryReservationDetails == null
                    || this.ferryReservationDetails instanceof EmptyParam) {
                  this.ferryReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.FerryReservationDetail>)
                        this.ferryReservationDetails)
                    .addAll(elements);
                return this;
              }

              /** Supplementary ferry reservation details. */
              public Builder setFerryReservationDetails(EmptyParam ferryReservationDetails) {
                this.ferryReservationDetails = ferryReservationDetails;
                return this;
              }

              /** Supplementary ferry reservation details. */
              public Builder setFerryReservationDetails(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail>
                      ferryReservationDetails) {
                this.ferryReservationDetails = ferryReservationDetails;
                return this;
              }

              /**
               * Add an element to `insurances` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#insurances}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addInsurance(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.Insurance
                      element) {
                if (this.insurances == null || this.insurances instanceof EmptyParam) {
                  this.insurances =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Insurance>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.Insurance>)
                        this.insurances)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `insurances` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#insurances}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllInsurance(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Insurance>
                      elements) {
                if (this.insurances == null || this.insurances instanceof EmptyParam) {
                  this.insurances =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Insurance>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.Insurance>)
                        this.insurances)
                    .addAll(elements);
                return this;
              }

              /** Supplementary insurance details. */
              public Builder setInsurances(EmptyParam insurances) {
                this.insurances = insurances;
                return this;
              }

              /** Supplementary insurance details. */
              public Builder setInsurances(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Insurance>
                      insurances) {
                this.insurances = insurances;
                return this;
              }

              /**
               * Add an element to `marketplaceSellers` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#marketplaceSellers}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addMarketplaceSeller(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.MarketplaceSeller
                      element) {
                if (this.marketplaceSellers == null
                    || this.marketplaceSellers instanceof EmptyParam) {
                  this.marketplaceSellers =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.MarketplaceSeller>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.MarketplaceSeller>)
                        this.marketplaceSellers)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `marketplaceSellers` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#marketplaceSellers}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllMarketplaceSeller(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.MarketplaceSeller>
                      elements) {
                if (this.marketplaceSellers == null
                    || this.marketplaceSellers instanceof EmptyParam) {
                  this.marketplaceSellers =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.MarketplaceSeller>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.MarketplaceSeller>)
                        this.marketplaceSellers)
                    .addAll(elements);
                return this;
              }

              /** Supplementary marketplace seller details. */
              public Builder setMarketplaceSellers(EmptyParam marketplaceSellers) {
                this.marketplaceSellers = marketplaceSellers;
                return this;
              }

              /** Supplementary marketplace seller details. */
              public Builder setMarketplaceSellers(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.MarketplaceSeller>
                      marketplaceSellers) {
                this.marketplaceSellers = marketplaceSellers;
                return this;
              }

              /**
               * Add an element to `roundTripReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#roundTripReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addRoundTripReservationDetail(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail
                      element) {
                if (this.roundTripReservationDetails == null
                    || this.roundTripReservationDetails instanceof EmptyParam) {
                  this.roundTripReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.RoundTripReservationDetail>)
                        this.roundTripReservationDetails)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `roundTripReservationDetails` list. A list is initialized for
               * the first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#roundTripReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllRoundTripReservationDetail(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail>
                      elements) {
                if (this.roundTripReservationDetails == null
                    || this.roundTripReservationDetails instanceof EmptyParam) {
                  this.roundTripReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.RoundTripReservationDetail>)
                        this.roundTripReservationDetails)
                    .addAll(elements);
                return this;
              }

              /** Supplementary round trip reservation details. */
              public Builder setRoundTripReservationDetails(
                  EmptyParam roundTripReservationDetails) {
                this.roundTripReservationDetails = roundTripReservationDetails;
                return this;
              }

              /** Supplementary round trip reservation details. */
              public Builder setRoundTripReservationDetails(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail>
                      roundTripReservationDetails) {
                this.roundTripReservationDetails = roundTripReservationDetails;
                return this;
              }

              /**
               * Add an element to `trainReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#trainReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addTrainReservationDetail(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail
                      element) {
                if (this.trainReservationDetails == null
                    || this.trainReservationDetails instanceof EmptyParam) {
                  this.trainReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.TrainReservationDetail>)
                        this.trainReservationDetails)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `trainReservationDetails` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#trainReservationDetails}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllTrainReservationDetail(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail>
                      elements) {
                if (this.trainReservationDetails == null
                    || this.trainReservationDetails instanceof EmptyParam) {
                  this.trainReservationDetails =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.TrainReservationDetail>)
                        this.trainReservationDetails)
                    .addAll(elements);
                return this;
              }

              /** Supplementary train reservation details. */
              public Builder setTrainReservationDetails(EmptyParam trainReservationDetails) {
                this.trainReservationDetails = trainReservationDetails;
                return this;
              }

              /** Supplementary train reservation details. */
              public Builder setTrainReservationDetails(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail>
                      trainReservationDetails) {
                this.trainReservationDetails = trainReservationDetails;
                return this;
              }

              /**
               * Add an element to `vouchers` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#vouchers}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addVoucher(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.Voucher
                      element) {
                if (this.vouchers == null || this.vouchers instanceof EmptyParam) {
                  this.vouchers =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Voucher>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.Voucher>)
                        this.vouchers)
                    .add(element);
                return this;
              }

              /**
               * Add all elements to `vouchers` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData#vouchers}
               * for the field documentation.
               */
              @SuppressWarnings("unchecked")
              public Builder addAllVoucher(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Voucher>
                      elements) {
                if (this.vouchers == null || this.vouchers instanceof EmptyParam) {
                  this.vouchers =
                      new ArrayList<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Voucher>();
                }
                ((List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.Voucher>)
                        this.vouchers)
                    .addAll(elements);
                return this;
              }

              /** Voucher details, such as a gift card or discount code. */
              public Builder setVouchers(EmptyParam vouchers) {
                this.vouchers = vouchers;
                return this;
              }

              /** Voucher details, such as a gift card or discount code. */
              public Builder setVouchers(
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.Voucher>
                      vouchers) {
                this.vouchers = vouchers;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class BusReservationDetail {
              /** Name of associated or partner company for the service. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** Arrival details. */
              @SerializedName("arrival")
              Arrival arrival;

              /** Name of transportation company. */
              @SerializedName("carrier_name")
              String carrierName;

              /** Currency. */
              @SerializedName("currency")
              String currency;

              /** Departure details. */
              @SerializedName("departure")
              Departure departure;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** List of insurances for this reservation. */
              @SerializedName("insurances")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Insurance>
                  insurances;

              /** List of passengers that this reservation applies to. */
              @SerializedName("passengers")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Passenger>
                  passengers;

              /** Price in cents. */
              @SerializedName("price")
              Long price;

              /** Ticket class. */
              @SerializedName("ticket_class")
              TicketClass ticketClass;

              private BusReservationDetail(
                  String affiliateName,
                  Arrival arrival,
                  String carrierName,
                  String currency,
                  Departure departure,
                  Map<String, Object> extraParams,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail.Insurance>
                      insurances,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail.Passenger>
                      passengers,
                  Long price,
                  TicketClass ticketClass) {
                this.affiliateName = affiliateName;
                this.arrival = arrival;
                this.carrierName = carrierName;
                this.currency = currency;
                this.departure = departure;
                this.extraParams = extraParams;
                this.insurances = insurances;
                this.passengers = passengers;
                this.price = price;
                this.ticketClass = ticketClass;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String affiliateName;

                private Arrival arrival;

                private String carrierName;

                private String currency;

                private Departure departure;

                private Map<String, Object> extraParams;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Insurance>
                    insurances;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Passenger>
                    passengers;

                private Long price;

                private TicketClass ticketClass;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.BusReservationDetail
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.BusReservationDetail(
                      this.affiliateName,
                      this.arrival,
                      this.carrierName,
                      this.currency,
                      this.departure,
                      this.extraParams,
                      this.insurances,
                      this.passengers,
                      this.price,
                      this.ticketClass);
                }

                /** Name of associated or partner company for the service. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** Arrival details. */
                public Builder setArrival(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Arrival
                        arrival) {
                  this.arrival = arrival;
                  return this;
                }

                /** Name of transportation company. */
                public Builder setCarrierName(String carrierName) {
                  this.carrierName = carrierName;
                  return this;
                }

                /** Currency. */
                public Builder setCurrency(String currency) {
                  this.currency = currency;
                  return this;
                }

                /** Departure details. */
                public Builder setDeparture(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Departure
                        departure) {
                  this.departure = departure;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#extraParams}
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
                 * Add an element to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addInsurance(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Insurance
                        element) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.add(element);
                  return this;
                }

                /**
                 * Add all elements to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addAllInsurance(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.BusReservationDetail.Insurance>
                        elements) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.addAll(elements);
                  return this;
                }

                /**
                 * Add an element to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addPassenger(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Passenger
                        element) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.add(element);
                  return this;
                }

                /**
                 * Add all elements to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addAllPassenger(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.BusReservationDetail.Passenger>
                        elements) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.addAll(elements);
                  return this;
                }

                /** Price in cents. */
                public Builder setPrice(Long price) {
                  this.price = price;
                  return this;
                }

                /** Ticket class. */
                public Builder setTicketClass(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.TicketClass
                        ticketClass) {
                  this.ticketClass = ticketClass;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Arrival {
                /** Address of the arrival location. */
                @SerializedName("address")
                Address address;

                /** Identifier name or reference for the arrival location. */
                @SerializedName("arrival_location")
                String arrivalLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Arrival(
                    Address address, String arrivalLocation, Map<String, Object> extraParams) {
                  this.address = address;
                  this.arrivalLocation = arrivalLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private String arrivalLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Arrival
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.BusReservationDetail.Arrival(
                        this.address, this.arrivalLocation, this.extraParams);
                  }

                  /** Address of the arrival location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail.Arrival.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Identifier name or reference for the arrival location. */
                  public Builder setArrivalLocation(String arrivalLocation) {
                    this.arrivalLocation = arrivalLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Arrival#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Arrival#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Arrival.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Arrival.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Arrival.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Arrival.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Departure {
                /** Address of the departure location. */
                @SerializedName("address")
                Address address;

                /** Timestamp of departure. */
                @SerializedName("departs_at")
                Long departsAt;

                /** Identifier name or reference for the origin location. */
                @SerializedName("departure_location")
                String departureLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Departure(
                    Address address,
                    Long departsAt,
                    String departureLocation,
                    Map<String, Object> extraParams) {
                  this.address = address;
                  this.departsAt = departsAt;
                  this.departureLocation = departureLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private Long departsAt;

                  private String departureLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Departure
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.BusReservationDetail.Departure(
                        this.address, this.departsAt, this.departureLocation, this.extraParams);
                  }

                  /** Address of the departure location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail.Departure.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Timestamp of departure. */
                  public Builder setDepartsAt(Long departsAt) {
                    this.departsAt = departsAt;
                    return this;
                  }

                  /** Identifier name or reference for the origin location. */
                  public Builder setDepartureLocation(String departureLocation) {
                    this.departureLocation = departureLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Departure#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Departure#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.BusReservationDetail.Departure.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Departure.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Departure.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Departure.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Insurance {
                /** Insurance currency. */
                @SerializedName("currency")
                String currency;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** Name of the company providing the insurance. */
                @SerializedName("insurance_company_name")
                String insuranceCompanyName;

                /** Type of insurance. */
                @SerializedName("insurance_type")
                InsuranceType insuranceType;

                /** Price of insurance in cents. */
                @SerializedName("price")
                Long price;

                private Insurance(
                    String currency,
                    Map<String, Object> extraParams,
                    String insuranceCompanyName,
                    InsuranceType insuranceType,
                    Long price) {
                  this.currency = currency;
                  this.extraParams = extraParams;
                  this.insuranceCompanyName = insuranceCompanyName;
                  this.insuranceType = insuranceType;
                  this.price = price;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String currency;

                  private Map<String, Object> extraParams;

                  private String insuranceCompanyName;

                  private InsuranceType insuranceType;

                  private Long price;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Insurance
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.BusReservationDetail.Insurance(
                        this.currency,
                        this.extraParams,
                        this.insuranceCompanyName,
                        this.insuranceType,
                        this.price);
                  }

                  /** Insurance currency. */
                  public Builder setCurrency(String currency) {
                    this.currency = currency;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Insurance#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Insurance#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** Name of the company providing the insurance. */
                  public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                    this.insuranceCompanyName = insuranceCompanyName;
                    return this;
                  }

                  /** Type of insurance. */
                  public Builder setInsuranceType(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.BusReservationDetail.Insurance
                              .InsuranceType
                          insuranceType) {
                    this.insuranceType = insuranceType;
                    return this;
                  }

                  /** Price of insurance in cents. */
                  public Builder setPrice(Long price) {
                    this.price = price;
                    return this;
                  }
                }

                public enum InsuranceType implements ApiRequestParams.EnumParam {
                  @SerializedName("baggage")
                  BAGGAGE("baggage"),

                  @SerializedName("bankruptcy")
                  BANKRUPTCY("bankruptcy"),

                  @SerializedName("cancelation")
                  CANCELATION("cancelation"),

                  @SerializedName("emergency")
                  EMERGENCY("emergency"),

                  @SerializedName("medical")
                  MEDICAL("medical");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  InsuranceType(String value) {
                    this.value = value;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Passenger {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The family name of the person. */
                @SerializedName("family_name")
                String familyName;

                /** The given name of the person. */
                @SerializedName("given_name")
                String givenName;

                private Passenger(
                    Map<String, Object> extraParams, String familyName, String givenName) {
                  this.extraParams = extraParams;
                  this.familyName = familyName;
                  this.givenName = givenName;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private String familyName;

                  private String givenName;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.BusReservationDetail.Passenger
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.BusReservationDetail.Passenger(
                        this.extraParams, this.familyName, this.givenName);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Passenger#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.BusReservationDetail.Passenger#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The family name of the person. */
                  public Builder setFamilyName(String familyName) {
                    this.familyName = familyName;
                    return this;
                  }

                  /** The given name of the person. */
                  public Builder setGivenName(String givenName) {
                    this.givenName = givenName;
                    return this;
                  }
                }
              }

              public enum TicketClass implements ApiRequestParams.EnumParam {
                @SerializedName("business")
                BUSINESS("business"),

                @SerializedName("economy")
                ECONOMY("economy"),

                @SerializedName("first_class")
                FIRST_CLASS("first_class"),

                @SerializedName("premium_economy")
                PREMIUM_ECONOMY("premium_economy");

                @Getter(onMethod_ = {@Override})
                private final String value;

                TicketClass(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EventReservationDetail {
              /** Indicates if the tickets are digitally checked when entering the venue. */
              @SerializedName("access_controlled_venue")
              Boolean accessControlledVenue;

              /** Address of the event. */
              @SerializedName("address")
              Address address;

              /** Name of associated or partner company for the service. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** End timestamp of the event. */
              @SerializedName("ends_at")
              Long endsAt;

              /** Company selling the ticket. */
              @SerializedName("event_company_name")
              String eventCompanyName;

              /** Name of the event. */
              @SerializedName("event_name")
              String eventName;

              /** Type of the event. */
              @SerializedName("event_type")
              EventType eventType;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** List of insurances for this event. */
              @SerializedName("insurances")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.EventReservationDetail.Insurance>
                  insurances;

              /** Start timestamp of the event. */
              @SerializedName("starts_at")
              Long startsAt;

              /** Name of the venue where the event takes place. */
              @SerializedName("venue_name")
              String venueName;

              private EventReservationDetail(
                  Boolean accessControlledVenue,
                  Address address,
                  String affiliateName,
                  Long endsAt,
                  String eventCompanyName,
                  String eventName,
                  EventType eventType,
                  Map<String, Object> extraParams,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail.Insurance>
                      insurances,
                  Long startsAt,
                  String venueName) {
                this.accessControlledVenue = accessControlledVenue;
                this.address = address;
                this.affiliateName = affiliateName;
                this.endsAt = endsAt;
                this.eventCompanyName = eventCompanyName;
                this.eventName = eventName;
                this.eventType = eventType;
                this.extraParams = extraParams;
                this.insurances = insurances;
                this.startsAt = startsAt;
                this.venueName = venueName;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Boolean accessControlledVenue;

                private Address address;

                private String affiliateName;

                private Long endsAt;

                private String eventCompanyName;

                private String eventName;

                private EventType eventType;

                private Map<String, Object> extraParams;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.EventReservationDetail.Insurance>
                    insurances;

                private Long startsAt;

                private String venueName;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.EventReservationDetail
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.EventReservationDetail(
                      this.accessControlledVenue,
                      this.address,
                      this.affiliateName,
                      this.endsAt,
                      this.eventCompanyName,
                      this.eventName,
                      this.eventType,
                      this.extraParams,
                      this.insurances,
                      this.startsAt,
                      this.venueName);
                }

                /** Indicates if the tickets are digitally checked when entering the venue. */
                public Builder setAccessControlledVenue(Boolean accessControlledVenue) {
                  this.accessControlledVenue = accessControlledVenue;
                  return this;
                }

                /** Address of the event. */
                public Builder setAddress(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.EventReservationDetail.Address
                        address) {
                  this.address = address;
                  return this;
                }

                /** Name of associated or partner company for the service. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** End timestamp of the event. */
                public Builder setEndsAt(Long endsAt) {
                  this.endsAt = endsAt;
                  return this;
                }

                /** Company selling the ticket. */
                public Builder setEventCompanyName(String eventCompanyName) {
                  this.eventCompanyName = eventCompanyName;
                  return this;
                }

                /** Name of the event. */
                public Builder setEventName(String eventName) {
                  this.eventName = eventName;
                  return this;
                }

                /** Type of the event. */
                public Builder setEventType(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.EventReservationDetail.EventType
                        eventType) {
                  this.eventType = eventType;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail#extraParams}
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
                 * Add an element to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addInsurance(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.EventReservationDetail.Insurance
                        element) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.add(element);
                  return this;
                }

                /**
                 * Add all elements to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addAllInsurance(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.EventReservationDetail.Insurance>
                        elements) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.addAll(elements);
                  return this;
                }

                /** Start timestamp of the event. */
                public Builder setStartsAt(Long startsAt) {
                  this.startsAt = startsAt;
                  return this;
                }

                /** Name of the venue where the event takes place. */
                public Builder setVenueName(String venueName) {
                  this.venueName = venueName;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Address {
                /** The city or town. */
                @SerializedName("city")
                String city;

                /** The country in ISO 3166-1 alpha-2 format. */
                @SerializedName("country")
                String country;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The postal code formatted according to country. */
                @SerializedName("postal_code")
                String postalCode;

                /** The state, county, province, or region formatted according to country. */
                @SerializedName("region")
                String region;

                /** Line 1 of the street address. */
                @SerializedName("street_address")
                String streetAddress;

                /** Line 2 of the street address. */
                @SerializedName("street_address2")
                String streetAddress2;

                private Address(
                    String city,
                    String country,
                    Map<String, Object> extraParams,
                    String postalCode,
                    String region,
                    String streetAddress,
                    String streetAddress2) {
                  this.city = city;
                  this.country = country;
                  this.extraParams = extraParams;
                  this.postalCode = postalCode;
                  this.region = region;
                  this.streetAddress = streetAddress;
                  this.streetAddress2 = streetAddress2;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String city;

                  private String country;

                  private Map<String, Object> extraParams;

                  private String postalCode;

                  private String region;

                  private String streetAddress;

                  private String streetAddress2;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.EventReservationDetail.Address
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.EventReservationDetail.Address(
                        this.city,
                        this.country,
                        this.extraParams,
                        this.postalCode,
                        this.region,
                        this.streetAddress,
                        this.streetAddress2);
                  }

                  /** The city or town. */
                  public Builder setCity(String city) {
                    this.city = city;
                    return this;
                  }

                  /** The country in ISO 3166-1 alpha-2 format. */
                  public Builder setCountry(String country) {
                    this.country = country;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail.Address#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail.Address#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The postal code formatted according to country. */
                  public Builder setPostalCode(String postalCode) {
                    this.postalCode = postalCode;
                    return this;
                  }

                  /** The state, county, province, or region formatted according to country. */
                  public Builder setRegion(String region) {
                    this.region = region;
                    return this;
                  }

                  /** Line 1 of the street address. */
                  public Builder setStreetAddress(String streetAddress) {
                    this.streetAddress = streetAddress;
                    return this;
                  }

                  /** Line 2 of the street address. */
                  public Builder setStreetAddress2(String streetAddress2) {
                    this.streetAddress2 = streetAddress2;
                    return this;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Insurance {
                /** Insurance currency. */
                @SerializedName("currency")
                String currency;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** Name of the company providing the insurance. */
                @SerializedName("insurance_company_name")
                String insuranceCompanyName;

                /** Type of insurance. */
                @SerializedName("insurance_type")
                InsuranceType insuranceType;

                /** Price of insurance in cents. */
                @SerializedName("price")
                Long price;

                private Insurance(
                    String currency,
                    Map<String, Object> extraParams,
                    String insuranceCompanyName,
                    InsuranceType insuranceType,
                    Long price) {
                  this.currency = currency;
                  this.extraParams = extraParams;
                  this.insuranceCompanyName = insuranceCompanyName;
                  this.insuranceType = insuranceType;
                  this.price = price;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String currency;

                  private Map<String, Object> extraParams;

                  private String insuranceCompanyName;

                  private InsuranceType insuranceType;

                  private Long price;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.EventReservationDetail.Insurance
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.EventReservationDetail.Insurance(
                        this.currency,
                        this.extraParams,
                        this.insuranceCompanyName,
                        this.insuranceType,
                        this.price);
                  }

                  /** Insurance currency. */
                  public Builder setCurrency(String currency) {
                    this.currency = currency;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail.Insurance#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.EventReservationDetail.Insurance#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** Name of the company providing the insurance. */
                  public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                    this.insuranceCompanyName = insuranceCompanyName;
                    return this;
                  }

                  /** Type of insurance. */
                  public Builder setInsuranceType(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.EventReservationDetail.Insurance
                              .InsuranceType
                          insuranceType) {
                    this.insuranceType = insuranceType;
                    return this;
                  }

                  /** Price of insurance in cents. */
                  public Builder setPrice(Long price) {
                    this.price = price;
                    return this;
                  }
                }

                public enum InsuranceType implements ApiRequestParams.EnumParam {
                  @SerializedName("bankruptcy")
                  BANKRUPTCY("bankruptcy"),

                  @SerializedName("cancelation")
                  CANCELATION("cancelation"),

                  @SerializedName("emergency")
                  EMERGENCY("emergency"),

                  @SerializedName("medical")
                  MEDICAL("medical");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  InsuranceType(String value) {
                    this.value = value;
                  }
                }
              }

              public enum EventType implements ApiRequestParams.EnumParam {
                @SerializedName("concert")
                CONCERT("concert"),

                @SerializedName("conference")
                CONFERENCE("conference"),

                @SerializedName("digital_education")
                DIGITAL_EDUCATION("digital_education"),

                @SerializedName("expo")
                EXPO("expo"),

                @SerializedName("festival")
                FESTIVAL("festival"),

                @SerializedName("in_person_education")
                IN_PERSON_EDUCATION("in_person_education"),

                @SerializedName("sport")
                SPORT("sport"),

                @SerializedName("tour")
                TOUR("tour");

                @Getter(onMethod_ = {@Override})
                private final String value;

                EventType(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class FerryReservationDetail {
              /** Name of associated or partner company for the service. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** Arrival details. */
              @SerializedName("arrival")
              Arrival arrival;

              /** Name of transportation company. */
              @SerializedName("carrier_name")
              String carrierName;

              /** Currency. */
              @SerializedName("currency")
              String currency;

              /** Departure details. */
              @SerializedName("departure")
              Departure departure;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** List of insurances for this reservation. */
              @SerializedName("insurances")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Insurance>
                  insurances;

              /** List of passengers that this reservation applies to. */
              @SerializedName("passengers")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Passenger>
                  passengers;

              /** Price in cents. */
              @SerializedName("price")
              Long price;

              /** Ticket class. */
              @SerializedName("ticket_class")
              TicketClass ticketClass;

              private FerryReservationDetail(
                  String affiliateName,
                  Arrival arrival,
                  String carrierName,
                  String currency,
                  Departure departure,
                  Map<String, Object> extraParams,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail.Insurance>
                      insurances,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail.Passenger>
                      passengers,
                  Long price,
                  TicketClass ticketClass) {
                this.affiliateName = affiliateName;
                this.arrival = arrival;
                this.carrierName = carrierName;
                this.currency = currency;
                this.departure = departure;
                this.extraParams = extraParams;
                this.insurances = insurances;
                this.passengers = passengers;
                this.price = price;
                this.ticketClass = ticketClass;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String affiliateName;

                private Arrival arrival;

                private String carrierName;

                private String currency;

                private Departure departure;

                private Map<String, Object> extraParams;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Insurance>
                    insurances;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Passenger>
                    passengers;

                private Long price;

                private TicketClass ticketClass;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.FerryReservationDetail
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.FerryReservationDetail(
                      this.affiliateName,
                      this.arrival,
                      this.carrierName,
                      this.currency,
                      this.departure,
                      this.extraParams,
                      this.insurances,
                      this.passengers,
                      this.price,
                      this.ticketClass);
                }

                /** Name of associated or partner company for the service. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** Arrival details. */
                public Builder setArrival(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Arrival
                        arrival) {
                  this.arrival = arrival;
                  return this;
                }

                /** Name of transportation company. */
                public Builder setCarrierName(String carrierName) {
                  this.carrierName = carrierName;
                  return this;
                }

                /** Currency. */
                public Builder setCurrency(String currency) {
                  this.currency = currency;
                  return this;
                }

                /** Departure details. */
                public Builder setDeparture(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Departure
                        departure) {
                  this.departure = departure;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#extraParams}
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
                 * Add an element to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addInsurance(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Insurance
                        element) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.add(element);
                  return this;
                }

                /**
                 * Add all elements to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addAllInsurance(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.FerryReservationDetail.Insurance>
                        elements) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.addAll(elements);
                  return this;
                }

                /**
                 * Add an element to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addPassenger(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Passenger
                        element) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.add(element);
                  return this;
                }

                /**
                 * Add all elements to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addAllPassenger(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.FerryReservationDetail.Passenger>
                        elements) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.addAll(elements);
                  return this;
                }

                /** Price in cents. */
                public Builder setPrice(Long price) {
                  this.price = price;
                  return this;
                }

                /** Ticket class. */
                public Builder setTicketClass(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.TicketClass
                        ticketClass) {
                  this.ticketClass = ticketClass;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Arrival {
                /** Address of the arrival location. */
                @SerializedName("address")
                Address address;

                /** Identifier name or reference for the arrival location. */
                @SerializedName("arrival_location")
                String arrivalLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Arrival(
                    Address address, String arrivalLocation, Map<String, Object> extraParams) {
                  this.address = address;
                  this.arrivalLocation = arrivalLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private String arrivalLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Arrival
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.FerryReservationDetail.Arrival(
                        this.address, this.arrivalLocation, this.extraParams);
                  }

                  /** Address of the arrival location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail.Arrival.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Identifier name or reference for the arrival location. */
                  public Builder setArrivalLocation(String arrivalLocation) {
                    this.arrivalLocation = arrivalLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Arrival#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Arrival#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Arrival.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Arrival.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Arrival.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Arrival.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Departure {
                /** Address of the departure location. */
                @SerializedName("address")
                Address address;

                /** Timestamp of departure. */
                @SerializedName("departs_at")
                Long departsAt;

                /** Identifier name or reference for the origin location. */
                @SerializedName("departure_location")
                String departureLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Departure(
                    Address address,
                    Long departsAt,
                    String departureLocation,
                    Map<String, Object> extraParams) {
                  this.address = address;
                  this.departsAt = departsAt;
                  this.departureLocation = departureLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private Long departsAt;

                  private String departureLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Departure
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.FerryReservationDetail.Departure(
                        this.address, this.departsAt, this.departureLocation, this.extraParams);
                  }

                  /** Address of the departure location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail.Departure.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Timestamp of departure. */
                  public Builder setDepartsAt(Long departsAt) {
                    this.departsAt = departsAt;
                    return this;
                  }

                  /** Identifier name or reference for the origin location. */
                  public Builder setDepartureLocation(String departureLocation) {
                    this.departureLocation = departureLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Departure#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Departure#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.FerryReservationDetail.Departure.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Departure.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Departure.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Departure.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Insurance {
                /** Insurance currency. */
                @SerializedName("currency")
                String currency;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** Name of the company providing the insurance. */
                @SerializedName("insurance_company_name")
                String insuranceCompanyName;

                /** Type of insurance. */
                @SerializedName("insurance_type")
                InsuranceType insuranceType;

                /** Price of insurance in cents. */
                @SerializedName("price")
                Long price;

                private Insurance(
                    String currency,
                    Map<String, Object> extraParams,
                    String insuranceCompanyName,
                    InsuranceType insuranceType,
                    Long price) {
                  this.currency = currency;
                  this.extraParams = extraParams;
                  this.insuranceCompanyName = insuranceCompanyName;
                  this.insuranceType = insuranceType;
                  this.price = price;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String currency;

                  private Map<String, Object> extraParams;

                  private String insuranceCompanyName;

                  private InsuranceType insuranceType;

                  private Long price;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Insurance
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.FerryReservationDetail.Insurance(
                        this.currency,
                        this.extraParams,
                        this.insuranceCompanyName,
                        this.insuranceType,
                        this.price);
                  }

                  /** Insurance currency. */
                  public Builder setCurrency(String currency) {
                    this.currency = currency;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Insurance#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Insurance#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** Name of the company providing the insurance. */
                  public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                    this.insuranceCompanyName = insuranceCompanyName;
                    return this;
                  }

                  /** Type of insurance. */
                  public Builder setInsuranceType(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.FerryReservationDetail.Insurance
                              .InsuranceType
                          insuranceType) {
                    this.insuranceType = insuranceType;
                    return this;
                  }

                  /** Price of insurance in cents. */
                  public Builder setPrice(Long price) {
                    this.price = price;
                    return this;
                  }
                }

                public enum InsuranceType implements ApiRequestParams.EnumParam {
                  @SerializedName("baggage")
                  BAGGAGE("baggage"),

                  @SerializedName("bankruptcy")
                  BANKRUPTCY("bankruptcy"),

                  @SerializedName("cancelation")
                  CANCELATION("cancelation"),

                  @SerializedName("emergency")
                  EMERGENCY("emergency"),

                  @SerializedName("medical")
                  MEDICAL("medical");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  InsuranceType(String value) {
                    this.value = value;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Passenger {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The family name of the person. */
                @SerializedName("family_name")
                String familyName;

                /** The given name of the person. */
                @SerializedName("given_name")
                String givenName;

                private Passenger(
                    Map<String, Object> extraParams, String familyName, String givenName) {
                  this.extraParams = extraParams;
                  this.familyName = familyName;
                  this.givenName = givenName;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private String familyName;

                  private String givenName;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.FerryReservationDetail.Passenger
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.FerryReservationDetail.Passenger(
                        this.extraParams, this.familyName, this.givenName);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Passenger#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.FerryReservationDetail.Passenger#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The family name of the person. */
                  public Builder setFamilyName(String familyName) {
                    this.familyName = familyName;
                    return this;
                  }

                  /** The given name of the person. */
                  public Builder setGivenName(String givenName) {
                    this.givenName = givenName;
                    return this;
                  }
                }
              }

              public enum TicketClass implements ApiRequestParams.EnumParam {
                @SerializedName("business")
                BUSINESS("business"),

                @SerializedName("economy")
                ECONOMY("economy"),

                @SerializedName("first_class")
                FIRST_CLASS("first_class"),

                @SerializedName("premium_economy")
                PREMIUM_ECONOMY("premium_economy");

                @Getter(onMethod_ = {@Override})
                private final String value;

                TicketClass(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Insurance {
              /** Insurance currency. */
              @SerializedName("currency")
              String currency;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** Name of the company providing the insurance. */
              @SerializedName("insurance_company_name")
              String insuranceCompanyName;

              /** Type of insurance. */
              @SerializedName("insurance_type")
              InsuranceType insuranceType;

              /** Price of insurance in cents. */
              @SerializedName("price")
              Long price;

              private Insurance(
                  String currency,
                  Map<String, Object> extraParams,
                  String insuranceCompanyName,
                  InsuranceType insuranceType,
                  Long price) {
                this.currency = currency;
                this.extraParams = extraParams;
                this.insuranceCompanyName = insuranceCompanyName;
                this.insuranceType = insuranceType;
                this.price = price;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String currency;

                private Map<String, Object> extraParams;

                private String insuranceCompanyName;

                private InsuranceType insuranceType;

                private Long price;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.Insurance
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.Insurance(
                      this.currency,
                      this.extraParams,
                      this.insuranceCompanyName,
                      this.insuranceType,
                      this.price);
                }

                /** Insurance currency. */
                public Builder setCurrency(String currency) {
                  this.currency = currency;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.Insurance#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.Insurance#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** Name of the company providing the insurance. */
                public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                  this.insuranceCompanyName = insuranceCompanyName;
                  return this;
                }

                /** Type of insurance. */
                public Builder setInsuranceType(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.Insurance.InsuranceType
                        insuranceType) {
                  this.insuranceType = insuranceType;
                  return this;
                }

                /** Price of insurance in cents. */
                public Builder setPrice(Long price) {
                  this.price = price;
                  return this;
                }
              }

              public enum InsuranceType implements ApiRequestParams.EnumParam {
                @SerializedName("bankruptcy")
                BANKRUPTCY("bankruptcy"),

                @SerializedName("cancelation")
                CANCELATION("cancelation"),

                @SerializedName("emergency")
                EMERGENCY("emergency"),

                @SerializedName("medical")
                MEDICAL("medical");

                @Getter(onMethod_ = {@Override})
                private final String value;

                InsuranceType(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class MarketplaceSeller {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * The references to line items for purchases with multiple associated sub-sellers.
               */
              @SerializedName("line_item_references")
              List<String> lineItemReferences;

              /** The address of the selling or delivering merchant. */
              @SerializedName("marketplace_seller_address")
              MarketplaceSellerAddress marketplaceSellerAddress;

              /** The name of the marketplace seller. */
              @SerializedName("marketplace_seller_name")
              String marketplaceSellerName;

              /** The unique identifier for the marketplace seller. */
              @SerializedName("marketplace_seller_reference")
              String marketplaceSellerReference;

              /** The number of transactions the sub-seller completed in the last 12 months. */
              @SerializedName("number_of_transactions")
              Long numberOfTransactions;

              /** The category of the product. */
              @SerializedName("product_category")
              ProductCategory productCategory;

              /** The date when the seller's account with the marketplace was last logged in. */
              @SerializedName("seller_last_login_at")
              Long sellerLastLoginAt;

              /**
               * The current rating of the marketplace seller. If the marketplace uses numeric
               * ranking, map these to the enum values.
               */
              @SerializedName("seller_rating")
              SellerRating sellerRating;

              /** The date when the seller's account with the marketplace was created. */
              @SerializedName("seller_registered_at")
              Long sellerRegisteredAt;

              /** The date when the seller's account with the marketplace was last updated. */
              @SerializedName("seller_updated_at")
              Long sellerUpdatedAt;

              /**
               * The references to shipping addresses for purchases with multiple associated
               * sub-sellers.
               */
              @SerializedName("shipping_references")
              List<String> shippingReferences;

              /**
               * The accumulated amount of sales transactions made by the sub-merchant or sub-seller
               * within the past 12 months in the payment currency. These transactions are in minor
               * currency units.
               */
              @SerializedName("volume_of_transactions")
              Long volumeOfTransactions;

              private MarketplaceSeller(
                  Map<String, Object> extraParams,
                  List<String> lineItemReferences,
                  MarketplaceSellerAddress marketplaceSellerAddress,
                  String marketplaceSellerName,
                  String marketplaceSellerReference,
                  Long numberOfTransactions,
                  ProductCategory productCategory,
                  Long sellerLastLoginAt,
                  SellerRating sellerRating,
                  Long sellerRegisteredAt,
                  Long sellerUpdatedAt,
                  List<String> shippingReferences,
                  Long volumeOfTransactions) {
                this.extraParams = extraParams;
                this.lineItemReferences = lineItemReferences;
                this.marketplaceSellerAddress = marketplaceSellerAddress;
                this.marketplaceSellerName = marketplaceSellerName;
                this.marketplaceSellerReference = marketplaceSellerReference;
                this.numberOfTransactions = numberOfTransactions;
                this.productCategory = productCategory;
                this.sellerLastLoginAt = sellerLastLoginAt;
                this.sellerRating = sellerRating;
                this.sellerRegisteredAt = sellerRegisteredAt;
                this.sellerUpdatedAt = sellerUpdatedAt;
                this.shippingReferences = shippingReferences;
                this.volumeOfTransactions = volumeOfTransactions;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private List<String> lineItemReferences;

                private MarketplaceSellerAddress marketplaceSellerAddress;

                private String marketplaceSellerName;

                private String marketplaceSellerReference;

                private Long numberOfTransactions;

                private ProductCategory productCategory;

                private Long sellerLastLoginAt;

                private SellerRating sellerRating;

                private Long sellerRegisteredAt;

                private Long sellerUpdatedAt;

                private List<String> shippingReferences;

                private Long volumeOfTransactions;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.MarketplaceSeller
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.MarketplaceSeller(
                      this.extraParams,
                      this.lineItemReferences,
                      this.marketplaceSellerAddress,
                      this.marketplaceSellerName,
                      this.marketplaceSellerReference,
                      this.numberOfTransactions,
                      this.productCategory,
                      this.sellerLastLoginAt,
                      this.sellerRating,
                      this.sellerRegisteredAt,
                      this.sellerUpdatedAt,
                      this.shippingReferences,
                      this.volumeOfTransactions);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#extraParams}
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
                 * Add an element to `lineItemReferences` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#lineItemReferences}
                 * for the field documentation.
                 */
                public Builder addLineItemReference(String element) {
                  if (this.lineItemReferences == null) {
                    this.lineItemReferences = new ArrayList<>();
                  }
                  this.lineItemReferences.add(element);
                  return this;
                }

                /**
                 * Add all elements to `lineItemReferences` list. A list is initialized for the
                 * first `add/addAll` call, and subsequent calls adds additional elements to the
                 * original list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#lineItemReferences}
                 * for the field documentation.
                 */
                public Builder addAllLineItemReference(List<String> elements) {
                  if (this.lineItemReferences == null) {
                    this.lineItemReferences = new ArrayList<>();
                  }
                  this.lineItemReferences.addAll(elements);
                  return this;
                }

                /** The address of the selling or delivering merchant. */
                public Builder setMarketplaceSellerAddress(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.MarketplaceSeller.MarketplaceSellerAddress
                        marketplaceSellerAddress) {
                  this.marketplaceSellerAddress = marketplaceSellerAddress;
                  return this;
                }

                /** The name of the marketplace seller. */
                public Builder setMarketplaceSellerName(String marketplaceSellerName) {
                  this.marketplaceSellerName = marketplaceSellerName;
                  return this;
                }

                /** The unique identifier for the marketplace seller. */
                public Builder setMarketplaceSellerReference(String marketplaceSellerReference) {
                  this.marketplaceSellerReference = marketplaceSellerReference;
                  return this;
                }

                /** The number of transactions the sub-seller completed in the last 12 months. */
                public Builder setNumberOfTransactions(Long numberOfTransactions) {
                  this.numberOfTransactions = numberOfTransactions;
                  return this;
                }

                /** The category of the product. */
                public Builder setProductCategory(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.MarketplaceSeller.ProductCategory
                        productCategory) {
                  this.productCategory = productCategory;
                  return this;
                }

                /** The date when the seller's account with the marketplace was last logged in. */
                public Builder setSellerLastLoginAt(Long sellerLastLoginAt) {
                  this.sellerLastLoginAt = sellerLastLoginAt;
                  return this;
                }

                /**
                 * The current rating of the marketplace seller. If the marketplace uses numeric
                 * ranking, map these to the enum values.
                 */
                public Builder setSellerRating(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.MarketplaceSeller.SellerRating
                        sellerRating) {
                  this.sellerRating = sellerRating;
                  return this;
                }

                /** The date when the seller's account with the marketplace was created. */
                public Builder setSellerRegisteredAt(Long sellerRegisteredAt) {
                  this.sellerRegisteredAt = sellerRegisteredAt;
                  return this;
                }

                /** The date when the seller's account with the marketplace was last updated. */
                public Builder setSellerUpdatedAt(Long sellerUpdatedAt) {
                  this.sellerUpdatedAt = sellerUpdatedAt;
                  return this;
                }

                /**
                 * Add an element to `shippingReferences` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#shippingReferences}
                 * for the field documentation.
                 */
                public Builder addShippingReference(String element) {
                  if (this.shippingReferences == null) {
                    this.shippingReferences = new ArrayList<>();
                  }
                  this.shippingReferences.add(element);
                  return this;
                }

                /**
                 * Add all elements to `shippingReferences` list. A list is initialized for the
                 * first `add/addAll` call, and subsequent calls adds additional elements to the
                 * original list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller#shippingReferences}
                 * for the field documentation.
                 */
                public Builder addAllShippingReference(List<String> elements) {
                  if (this.shippingReferences == null) {
                    this.shippingReferences = new ArrayList<>();
                  }
                  this.shippingReferences.addAll(elements);
                  return this;
                }

                /**
                 * The accumulated amount of sales transactions made by the sub-merchant or
                 * sub-seller within the past 12 months in the payment currency. These transactions
                 * are in minor currency units.
                 */
                public Builder setVolumeOfTransactions(Long volumeOfTransactions) {
                  this.volumeOfTransactions = volumeOfTransactions;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class MarketplaceSellerAddress {
                /** The city or town. */
                @SerializedName("city")
                String city;

                /** The country in ISO 3166-1 alpha-2 format. */
                @SerializedName("country")
                String country;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The postal code formatted according to country. */
                @SerializedName("postal_code")
                String postalCode;

                /** The state, county, province, or region formatted according to country. */
                @SerializedName("region")
                String region;

                /** Line 1 of the street address. */
                @SerializedName("street_address")
                String streetAddress;

                /** Line 2 of the street address. */
                @SerializedName("street_address2")
                String streetAddress2;

                private MarketplaceSellerAddress(
                    String city,
                    String country,
                    Map<String, Object> extraParams,
                    String postalCode,
                    String region,
                    String streetAddress,
                    String streetAddress2) {
                  this.city = city;
                  this.country = country;
                  this.extraParams = extraParams;
                  this.postalCode = postalCode;
                  this.region = region;
                  this.streetAddress = streetAddress;
                  this.streetAddress2 = streetAddress2;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String city;

                  private String country;

                  private Map<String, Object> extraParams;

                  private String postalCode;

                  private String region;

                  private String streetAddress;

                  private String streetAddress2;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.MarketplaceSeller.MarketplaceSellerAddress
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.MarketplaceSeller.MarketplaceSellerAddress(
                        this.city,
                        this.country,
                        this.extraParams,
                        this.postalCode,
                        this.region,
                        this.streetAddress,
                        this.streetAddress2);
                  }

                  /** The city or town. */
                  public Builder setCity(String city) {
                    this.city = city;
                    return this;
                  }

                  /** The country in ISO 3166-1 alpha-2 format. */
                  public Builder setCountry(String country) {
                    this.country = country;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller.MarketplaceSellerAddress#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.MarketplaceSeller.MarketplaceSellerAddress#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The postal code formatted according to country. */
                  public Builder setPostalCode(String postalCode) {
                    this.postalCode = postalCode;
                    return this;
                  }

                  /** The state, county, province, or region formatted according to country. */
                  public Builder setRegion(String region) {
                    this.region = region;
                    return this;
                  }

                  /** Line 1 of the street address. */
                  public Builder setStreetAddress(String streetAddress) {
                    this.streetAddress = streetAddress;
                    return this;
                  }

                  /** Line 2 of the street address. */
                  public Builder setStreetAddress2(String streetAddress2) {
                    this.streetAddress2 = streetAddress2;
                    return this;
                  }
                }
              }

              public enum ProductCategory implements ApiRequestParams.EnumParam {
                @SerializedName("accessories")
                ACCESSORIES("accessories"),

                @SerializedName("appliances")
                APPLIANCES("appliances"),

                @SerializedName("apps_and_games")
                APPS_AND_GAMES("apps_and_games"),

                @SerializedName("arts_crafts_and_sewing")
                ARTS_CRAFTS_AND_SEWING("arts_crafts_and_sewing"),

                @SerializedName("automotive")
                AUTOMOTIVE("automotive"),

                @SerializedName("baby")
                BABY("baby"),

                @SerializedName("baby_clothing")
                BABY_CLOTHING("baby_clothing"),

                @SerializedName("bags_and_purses")
                BAGS_AND_PURSES("bags_and_purses"),

                @SerializedName("beauty")
                BEAUTY("beauty"),

                @SerializedName("books")
                BOOKS("books"),

                @SerializedName("cds_and_vinyl")
                CDS_AND_VINYL("cds_and_vinyl"),

                @SerializedName("cell_phones_and_accessories")
                CELL_PHONES_AND_ACCESSORIES("cell_phones_and_accessories"),

                @SerializedName("collectibles_and_fine_arts")
                COLLECTIBLES_AND_FINE_ARTS("collectibles_and_fine_arts"),

                @SerializedName("digital_music")
                DIGITAL_MUSIC("digital_music"),

                @SerializedName("electronics")
                ELECTRONICS("electronics"),

                @SerializedName("grocery_and_gourmet_food")
                GROCERY_AND_GOURMET_FOOD("grocery_and_gourmet_food"),

                @SerializedName("handmade")
                HANDMADE("handmade"),

                @SerializedName("health_and_personal_care")
                HEALTH_AND_PERSONAL_CARE("health_and_personal_care"),

                @SerializedName("home_and_kitchen")
                HOME_AND_KITCHEN("home_and_kitchen"),

                @SerializedName("industrial_and_scientific")
                INDUSTRIAL_AND_SCIENTIFIC("industrial_and_scientific"),

                @SerializedName("luggage_and_travel_gear")
                LUGGAGE_AND_TRAVEL_GEAR("luggage_and_travel_gear"),

                @SerializedName("magazine_subscriptions")
                MAGAZINE_SUBSCRIPTIONS("magazine_subscriptions"),

                @SerializedName("men_clothing")
                MEN_CLOTHING("men_clothing"),

                @SerializedName("musical_instruments")
                MUSICAL_INSTRUMENTS("musical_instruments"),

                @SerializedName("office_products")
                OFFICE_PRODUCTS("office_products"),

                @SerializedName("patio_lawn_and_garden")
                PATIO_LAWN_AND_GARDEN("patio_lawn_and_garden"),

                @SerializedName("pet_supplies")
                PET_SUPPLIES("pet_supplies"),

                @SerializedName("shoes")
                SHOES("shoes"),

                @SerializedName("software")
                SOFTWARE("software"),

                @SerializedName("sports_and_outdoors")
                SPORTS_AND_OUTDOORS("sports_and_outdoors"),

                @SerializedName("tools_and_home_improvement")
                TOOLS_AND_HOME_IMPROVEMENT("tools_and_home_improvement"),

                @SerializedName("toys_and_games")
                TOYS_AND_GAMES("toys_and_games"),

                @SerializedName("video_games")
                VIDEO_GAMES("video_games"),

                @SerializedName("women_clothing")
                WOMEN_CLOTHING("women_clothing");

                @Getter(onMethod_ = {@Override})
                private final String value;

                ProductCategory(String value) {
                  this.value = value;
                }
              }

              public enum SellerRating implements ApiRequestParams.EnumParam {
                @SerializedName("high")
                HIGH("high"),

                @SerializedName("low")
                LOW("low"),

                @SerializedName("medium")
                MEDIUM("medium"),

                @SerializedName("very_high")
                VERY_HIGH("very_high"),

                @SerializedName("very_low")
                VERY_LOW("very_low");

                @Getter(onMethod_ = {@Override})
                private final String value;

                SellerRating(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class RoundTripReservationDetail {
              /** Name of associated or partner company for the service. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** Arrival details. */
              @SerializedName("arrival")
              Arrival arrival;

              /** Name of transportation company. */
              @SerializedName("carrier_name")
              String carrierName;

              /** Currency. */
              @SerializedName("currency")
              String currency;

              /** Departure details. */
              @SerializedName("departure")
              Departure departure;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** List of insurances for this reservation. */
              @SerializedName("insurances")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance>
                  insurances;

              /** List of passengers that this reservation applies to. */
              @SerializedName("passengers")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger>
                  passengers;

              /** Price in cents. */
              @SerializedName("price")
              Long price;

              /** Ticket class. */
              @SerializedName("ticket_class")
              TicketClass ticketClass;

              private RoundTripReservationDetail(
                  String affiliateName,
                  Arrival arrival,
                  String carrierName,
                  String currency,
                  Departure departure,
                  Map<String, Object> extraParams,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance>
                      insurances,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger>
                      passengers,
                  Long price,
                  TicketClass ticketClass) {
                this.affiliateName = affiliateName;
                this.arrival = arrival;
                this.carrierName = carrierName;
                this.currency = currency;
                this.departure = departure;
                this.extraParams = extraParams;
                this.insurances = insurances;
                this.passengers = passengers;
                this.price = price;
                this.ticketClass = ticketClass;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String affiliateName;

                private Arrival arrival;

                private String carrierName;

                private String currency;

                private Departure departure;

                private Map<String, Object> extraParams;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance>
                    insurances;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger>
                    passengers;

                private Long price;

                private TicketClass ticketClass;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.RoundTripReservationDetail
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.RoundTripReservationDetail(
                      this.affiliateName,
                      this.arrival,
                      this.carrierName,
                      this.currency,
                      this.departure,
                      this.extraParams,
                      this.insurances,
                      this.passengers,
                      this.price,
                      this.ticketClass);
                }

                /** Name of associated or partner company for the service. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** Arrival details. */
                public Builder setArrival(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival
                        arrival) {
                  this.arrival = arrival;
                  return this;
                }

                /** Name of transportation company. */
                public Builder setCarrierName(String carrierName) {
                  this.carrierName = carrierName;
                  return this;
                }

                /** Currency. */
                public Builder setCurrency(String currency) {
                  this.currency = currency;
                  return this;
                }

                /** Departure details. */
                public Builder setDeparture(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Departure
                        departure) {
                  this.departure = departure;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#extraParams}
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
                 * Add an element to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addInsurance(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance
                        element) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.add(element);
                  return this;
                }

                /**
                 * Add all elements to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addAllInsurance(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance>
                        elements) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.addAll(elements);
                  return this;
                }

                /**
                 * Add an element to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addPassenger(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger
                        element) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.add(element);
                  return this;
                }

                /**
                 * Add all elements to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addAllPassenger(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger>
                        elements) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.addAll(elements);
                  return this;
                }

                /** Price in cents. */
                public Builder setPrice(Long price) {
                  this.price = price;
                  return this;
                }

                /** Ticket class. */
                public Builder setTicketClass(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.TicketClass
                        ticketClass) {
                  this.ticketClass = ticketClass;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Arrival {
                /** Address of the arrival location. */
                @SerializedName("address")
                Address address;

                /** Identifier name or reference for the arrival location. */
                @SerializedName("arrival_location")
                String arrivalLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Arrival(
                    Address address, String arrivalLocation, Map<String, Object> extraParams) {
                  this.address = address;
                  this.arrivalLocation = arrivalLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private String arrivalLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival(
                        this.address, this.arrivalLocation, this.extraParams);
                  }

                  /** Address of the arrival location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Identifier name or reference for the arrival location. */
                  public Builder setArrivalLocation(String arrivalLocation) {
                    this.arrivalLocation = arrivalLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Arrival#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Arrival#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Arrival.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Arrival.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Arrival.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Departure {
                /** Address of the departure location. */
                @SerializedName("address")
                Address address;

                /** Timestamp of departure. */
                @SerializedName("departs_at")
                Long departsAt;

                /** Identifier name or reference for the origin location. */
                @SerializedName("departure_location")
                String departureLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Departure(
                    Address address,
                    Long departsAt,
                    String departureLocation,
                    Map<String, Object> extraParams) {
                  this.address = address;
                  this.departsAt = departsAt;
                  this.departureLocation = departureLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private Long departsAt;

                  private String departureLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Departure
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.RoundTripReservationDetail.Departure(
                        this.address, this.departsAt, this.departureLocation, this.extraParams);
                  }

                  /** Address of the departure location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail.Departure
                              .Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Timestamp of departure. */
                  public Builder setDepartsAt(Long departsAt) {
                    this.departsAt = departsAt;
                    return this;
                  }

                  /** Identifier name or reference for the origin location. */
                  public Builder setDepartureLocation(String departureLocation) {
                    this.departureLocation = departureLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Departure#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Departure#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.RoundTripReservationDetail.Departure.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Departure.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Departure.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Departure.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Insurance {
                /** Insurance currency. */
                @SerializedName("currency")
                String currency;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** Name of the company providing the insurance. */
                @SerializedName("insurance_company_name")
                String insuranceCompanyName;

                /** Type of insurance. */
                @SerializedName("insurance_type")
                InsuranceType insuranceType;

                /** Price of insurance in cents. */
                @SerializedName("price")
                Long price;

                private Insurance(
                    String currency,
                    Map<String, Object> extraParams,
                    String insuranceCompanyName,
                    InsuranceType insuranceType,
                    Long price) {
                  this.currency = currency;
                  this.extraParams = extraParams;
                  this.insuranceCompanyName = insuranceCompanyName;
                  this.insuranceType = insuranceType;
                  this.price = price;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String currency;

                  private Map<String, Object> extraParams;

                  private String insuranceCompanyName;

                  private InsuranceType insuranceType;

                  private Long price;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance(
                        this.currency,
                        this.extraParams,
                        this.insuranceCompanyName,
                        this.insuranceType,
                        this.price);
                  }

                  /** Insurance currency. */
                  public Builder setCurrency(String currency) {
                    this.currency = currency;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Insurance#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Insurance#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** Name of the company providing the insurance. */
                  public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                    this.insuranceCompanyName = insuranceCompanyName;
                    return this;
                  }

                  /** Type of insurance. */
                  public Builder setInsuranceType(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.RoundTripReservationDetail.Insurance
                              .InsuranceType
                          insuranceType) {
                    this.insuranceType = insuranceType;
                    return this;
                  }

                  /** Price of insurance in cents. */
                  public Builder setPrice(Long price) {
                    this.price = price;
                    return this;
                  }
                }

                public enum InsuranceType implements ApiRequestParams.EnumParam {
                  @SerializedName("baggage")
                  BAGGAGE("baggage"),

                  @SerializedName("bankruptcy")
                  BANKRUPTCY("bankruptcy"),

                  @SerializedName("cancelation")
                  CANCELATION("cancelation"),

                  @SerializedName("emergency")
                  EMERGENCY("emergency"),

                  @SerializedName("medical")
                  MEDICAL("medical");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  InsuranceType(String value) {
                    this.value = value;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Passenger {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The family name of the person. */
                @SerializedName("family_name")
                String familyName;

                /** The given name of the person. */
                @SerializedName("given_name")
                String givenName;

                private Passenger(
                    Map<String, Object> extraParams, String familyName, String givenName) {
                  this.extraParams = extraParams;
                  this.familyName = familyName;
                  this.givenName = givenName;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private String familyName;

                  private String givenName;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.RoundTripReservationDetail.Passenger(
                        this.extraParams, this.familyName, this.givenName);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Passenger#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.RoundTripReservationDetail.Passenger#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The family name of the person. */
                  public Builder setFamilyName(String familyName) {
                    this.familyName = familyName;
                    return this;
                  }

                  /** The given name of the person. */
                  public Builder setGivenName(String givenName) {
                    this.givenName = givenName;
                    return this;
                  }
                }
              }

              public enum TicketClass implements ApiRequestParams.EnumParam {
                @SerializedName("business")
                BUSINESS("business"),

                @SerializedName("economy")
                ECONOMY("economy"),

                @SerializedName("first_class")
                FIRST_CLASS("first_class"),

                @SerializedName("premium_economy")
                PREMIUM_ECONOMY("premium_economy");

                @Getter(onMethod_ = {@Override})
                private final String value;

                TicketClass(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class TrainReservationDetail {
              /** Name of associated or partner company for the service. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** Arrival details. */
              @SerializedName("arrival")
              Arrival arrival;

              /** Name of transportation company. */
              @SerializedName("carrier_name")
              String carrierName;

              /** Currency. */
              @SerializedName("currency")
              String currency;

              /** Departure details. */
              @SerializedName("departure")
              Departure departure;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** List of insurances for this reservation. */
              @SerializedName("insurances")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Insurance>
                  insurances;

              /** List of passengers that this reservation applies to. */
              @SerializedName("passengers")
              List<
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Passenger>
                  passengers;

              /** Price in cents. */
              @SerializedName("price")
              Long price;

              /** Ticket class. */
              @SerializedName("ticket_class")
              TicketClass ticketClass;

              private TrainReservationDetail(
                  String affiliateName,
                  Arrival arrival,
                  String carrierName,
                  String currency,
                  Departure departure,
                  Map<String, Object> extraParams,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail.Insurance>
                      insurances,
                  List<
                          OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail.Passenger>
                      passengers,
                  Long price,
                  TicketClass ticketClass) {
                this.affiliateName = affiliateName;
                this.arrival = arrival;
                this.carrierName = carrierName;
                this.currency = currency;
                this.departure = departure;
                this.extraParams = extraParams;
                this.insurances = insurances;
                this.passengers = passengers;
                this.price = price;
                this.ticketClass = ticketClass;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String affiliateName;

                private Arrival arrival;

                private String carrierName;

                private String currency;

                private Departure departure;

                private Map<String, Object> extraParams;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Insurance>
                    insurances;

                private List<
                        OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Passenger>
                    passengers;

                private Long price;

                private TicketClass ticketClass;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.TrainReservationDetail
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.TrainReservationDetail(
                      this.affiliateName,
                      this.arrival,
                      this.carrierName,
                      this.currency,
                      this.departure,
                      this.extraParams,
                      this.insurances,
                      this.passengers,
                      this.price,
                      this.ticketClass);
                }

                /** Name of associated or partner company for the service. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** Arrival details. */
                public Builder setArrival(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Arrival
                        arrival) {
                  this.arrival = arrival;
                  return this;
                }

                /** Name of transportation company. */
                public Builder setCarrierName(String carrierName) {
                  this.carrierName = carrierName;
                  return this;
                }

                /** Currency. */
                public Builder setCurrency(String currency) {
                  this.currency = currency;
                  return this;
                }

                /** Departure details. */
                public Builder setDeparture(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Departure
                        departure) {
                  this.departure = departure;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#extraParams}
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
                 * Add an element to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addInsurance(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Insurance
                        element) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.add(element);
                  return this;
                }

                /**
                 * Add all elements to `insurances` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#insurances}
                 * for the field documentation.
                 */
                public Builder addAllInsurance(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.TrainReservationDetail.Insurance>
                        elements) {
                  if (this.insurances == null) {
                    this.insurances = new ArrayList<>();
                  }
                  this.insurances.addAll(elements);
                  return this;
                }

                /**
                 * Add an element to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addPassenger(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Passenger
                        element) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.add(element);
                  return this;
                }

                /**
                 * Add all elements to `passengers` list. A list is initialized for the first
                 * `add/addAll` call, and subsequent calls adds additional elements to the original
                 * list. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail#passengers}
                 * for the field documentation.
                 */
                public Builder addAllPassenger(
                    List<
                            OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                                .SupplementaryPurchaseData.TrainReservationDetail.Passenger>
                        elements) {
                  if (this.passengers == null) {
                    this.passengers = new ArrayList<>();
                  }
                  this.passengers.addAll(elements);
                  return this;
                }

                /** Price in cents. */
                public Builder setPrice(Long price) {
                  this.price = price;
                  return this;
                }

                /** Ticket class. */
                public Builder setTicketClass(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.TicketClass
                        ticketClass) {
                  this.ticketClass = ticketClass;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Arrival {
                /** Address of the arrival location. */
                @SerializedName("address")
                Address address;

                /** Identifier name or reference for the arrival location. */
                @SerializedName("arrival_location")
                String arrivalLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Arrival(
                    Address address, String arrivalLocation, Map<String, Object> extraParams) {
                  this.address = address;
                  this.arrivalLocation = arrivalLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private String arrivalLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Arrival
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.TrainReservationDetail.Arrival(
                        this.address, this.arrivalLocation, this.extraParams);
                  }

                  /** Address of the arrival location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail.Arrival.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Identifier name or reference for the arrival location. */
                  public Builder setArrivalLocation(String arrivalLocation) {
                    this.arrivalLocation = arrivalLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Arrival#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Arrival#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Arrival.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Arrival.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Arrival.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Arrival.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Departure {
                /** Address of the departure location. */
                @SerializedName("address")
                Address address;

                /** Timestamp of departure. */
                @SerializedName("departs_at")
                Long departsAt;

                /** Identifier name or reference for the origin location. */
                @SerializedName("departure_location")
                String departureLocation;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                private Departure(
                    Address address,
                    Long departsAt,
                    String departureLocation,
                    Map<String, Object> extraParams) {
                  this.address = address;
                  this.departsAt = departsAt;
                  this.departureLocation = departureLocation;
                  this.extraParams = extraParams;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Address address;

                  private Long departsAt;

                  private String departureLocation;

                  private Map<String, Object> extraParams;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Departure
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.TrainReservationDetail.Departure(
                        this.address, this.departsAt, this.departureLocation, this.extraParams);
                  }

                  /** Address of the departure location. */
                  public Builder setAddress(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail.Departure.Address
                          address) {
                    this.address = address;
                    return this;
                  }

                  /** Timestamp of departure. */
                  public Builder setDepartsAt(Long departsAt) {
                    this.departsAt = departsAt;
                    return this;
                  }

                  /** Identifier name or reference for the origin location. */
                  public Builder setDepartureLocation(String departureLocation) {
                    this.departureLocation = departureLocation;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Departure#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Departure#extraParams}
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

                @Getter
                @EqualsAndHashCode(callSuper = false)
                public static class Address {
                  /** The city or town. */
                  @SerializedName("city")
                  String city;

                  /** The country in ISO 3166-1 alpha-2 format. */
                  @SerializedName("country")
                  String country;

                  /**
                   * Map of extra parameters for custom features not available in this client
                   * library. The content in this map is not serialized under this field's
                   * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                   * the key is a root-level field (serialized) name in this param object.
                   * Effectively, this map is flattened to its parent instance.
                   */
                  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                  Map<String, Object> extraParams;

                  /** The postal code formatted according to country. */
                  @SerializedName("postal_code")
                  String postalCode;

                  /** The state, county, province, or region formatted according to country. */
                  @SerializedName("region")
                  String region;

                  /** Line 1 of the street address. */
                  @SerializedName("street_address")
                  String streetAddress;

                  /** Line 2 of the street address. */
                  @SerializedName("street_address2")
                  String streetAddress2;

                  private Address(
                      String city,
                      String country,
                      Map<String, Object> extraParams,
                      String postalCode,
                      String region,
                      String streetAddress,
                      String streetAddress2) {
                    this.city = city;
                    this.country = country;
                    this.extraParams = extraParams;
                    this.postalCode = postalCode;
                    this.region = region;
                    this.streetAddress = streetAddress;
                    this.streetAddress2 = streetAddress2;
                  }

                  public static Builder builder() {
                    return new Builder();
                  }

                  public static class Builder {
                    private String city;

                    private String country;

                    private Map<String, Object> extraParams;

                    private String postalCode;

                    private String region;

                    private String streetAddress;

                    private String streetAddress2;

                    /** Finalize and obtain parameter instance from this builder. */
                    public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.TrainReservationDetail.Departure.Address
                        build() {
                      return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Departure.Address(
                          this.city,
                          this.country,
                          this.extraParams,
                          this.postalCode,
                          this.region,
                          this.streetAddress,
                          this.streetAddress2);
                    }

                    /** The city or town. */
                    public Builder setCity(String city) {
                      this.city = city;
                      return this;
                    }

                    /** The country in ISO 3166-1 alpha-2 format. */
                    public Builder setCountry(String country) {
                      this.country = country;
                      return this;
                    }

                    /**
                     * Add a key/value pair to `extraParams` map. A map is initialized for the first
                     * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                     * original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Departure.Address#extraParams}
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
                     * Add all map key/value pairs to `extraParams` map. A map is initialized for
                     * the first `put/putAll` call, and subsequent calls add additional key/value
                     * pairs to the original map. See {@link
                     * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Departure.Address#extraParams}
                     * for the field documentation.
                     */
                    public Builder putAllExtraParam(Map<String, Object> map) {
                      if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                      }
                      this.extraParams.putAll(map);
                      return this;
                    }

                    /** The postal code formatted according to country. */
                    public Builder setPostalCode(String postalCode) {
                      this.postalCode = postalCode;
                      return this;
                    }

                    /** The state, county, province, or region formatted according to country. */
                    public Builder setRegion(String region) {
                      this.region = region;
                      return this;
                    }

                    /** Line 1 of the street address. */
                    public Builder setStreetAddress(String streetAddress) {
                      this.streetAddress = streetAddress;
                      return this;
                    }

                    /** Line 2 of the street address. */
                    public Builder setStreetAddress2(String streetAddress2) {
                      this.streetAddress2 = streetAddress2;
                      return this;
                    }
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Insurance {
                /** Insurance currency. */
                @SerializedName("currency")
                String currency;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** Name of the company providing the insurance. */
                @SerializedName("insurance_company_name")
                String insuranceCompanyName;

                /** Type of insurance. */
                @SerializedName("insurance_type")
                InsuranceType insuranceType;

                /** Price of insurance in cents. */
                @SerializedName("price")
                Long price;

                private Insurance(
                    String currency,
                    Map<String, Object> extraParams,
                    String insuranceCompanyName,
                    InsuranceType insuranceType,
                    Long price) {
                  this.currency = currency;
                  this.extraParams = extraParams;
                  this.insuranceCompanyName = insuranceCompanyName;
                  this.insuranceType = insuranceType;
                  this.price = price;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private String currency;

                  private Map<String, Object> extraParams;

                  private String insuranceCompanyName;

                  private InsuranceType insuranceType;

                  private Long price;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Insurance
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.TrainReservationDetail.Insurance(
                        this.currency,
                        this.extraParams,
                        this.insuranceCompanyName,
                        this.insuranceType,
                        this.price);
                  }

                  /** Insurance currency. */
                  public Builder setCurrency(String currency) {
                    this.currency = currency;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Insurance#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Insurance#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** Name of the company providing the insurance. */
                  public Builder setInsuranceCompanyName(String insuranceCompanyName) {
                    this.insuranceCompanyName = insuranceCompanyName;
                    return this;
                  }

                  /** Type of insurance. */
                  public Builder setInsuranceType(
                      OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                              .SupplementaryPurchaseData.TrainReservationDetail.Insurance
                              .InsuranceType
                          insuranceType) {
                    this.insuranceType = insuranceType;
                    return this;
                  }

                  /** Price of insurance in cents. */
                  public Builder setPrice(Long price) {
                    this.price = price;
                    return this;
                  }
                }

                public enum InsuranceType implements ApiRequestParams.EnumParam {
                  @SerializedName("baggage")
                  BAGGAGE("baggage"),

                  @SerializedName("bankruptcy")
                  BANKRUPTCY("bankruptcy"),

                  @SerializedName("cancelation")
                  CANCELATION("cancelation"),

                  @SerializedName("emergency")
                  EMERGENCY("emergency"),

                  @SerializedName("medical")
                  MEDICAL("medical");

                  @Getter(onMethod_ = {@Override})
                  private final String value;

                  InsuranceType(String value) {
                    this.value = value;
                  }
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Passenger {
                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The family name of the person. */
                @SerializedName("family_name")
                String familyName;

                /** The given name of the person. */
                @SerializedName("given_name")
                String givenName;

                private Passenger(
                    Map<String, Object> extraParams, String familyName, String givenName) {
                  this.extraParams = extraParams;
                  this.familyName = familyName;
                  this.givenName = givenName;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Map<String, Object> extraParams;

                  private String familyName;

                  private String givenName;

                  /** Finalize and obtain parameter instance from this builder. */
                  public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                          .SupplementaryPurchaseData.TrainReservationDetail.Passenger
                      build() {
                    return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.TrainReservationDetail.Passenger(
                        this.extraParams, this.familyName, this.givenName);
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Passenger#extraParams}
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
                   * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                   * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                   * the original map. See {@link
                   * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.TrainReservationDetail.Passenger#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The family name of the person. */
                  public Builder setFamilyName(String familyName) {
                    this.familyName = familyName;
                    return this;
                  }

                  /** The given name of the person. */
                  public Builder setGivenName(String givenName) {
                    this.givenName = givenName;
                    return this;
                  }
                }
              }

              public enum TicketClass implements ApiRequestParams.EnumParam {
                @SerializedName("business")
                BUSINESS("business"),

                @SerializedName("economy")
                ECONOMY("economy"),

                @SerializedName("first_class")
                FIRST_CLASS("first_class"),

                @SerializedName("premium_economy")
                PREMIUM_ECONOMY("premium_economy");

                @Getter(onMethod_ = {@Override})
                private final String value;

                TicketClass(String value) {
                  this.value = value;
                }
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Voucher {
              /** Name of associated or partner company for this voucher. */
              @SerializedName("affiliate_name")
              String affiliateName;

              /** The voucher validity end time. */
              @SerializedName("ends_at")
              Long endsAt;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The voucher validity start time. */
              @SerializedName("starts_at")
              Long startsAt;

              /** The issuer or provider of this voucher. */
              @SerializedName("voucher_company")
              String voucherCompany;

              /** The name or reference to identify the voucher. */
              @SerializedName("voucher_name")
              String voucherName;

              /** The type of this voucher. */
              @SerializedName("voucher_type")
              VoucherType voucherType;

              private Voucher(
                  String affiliateName,
                  Long endsAt,
                  Map<String, Object> extraParams,
                  Long startsAt,
                  String voucherCompany,
                  String voucherName,
                  VoucherType voucherType) {
                this.affiliateName = affiliateName;
                this.endsAt = endsAt;
                this.extraParams = extraParams;
                this.startsAt = startsAt;
                this.voucherCompany = voucherCompany;
                this.voucherName = voucherName;
                this.voucherType = voucherType;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private String affiliateName;

                private Long endsAt;

                private Map<String, Object> extraParams;

                private Long startsAt;

                private String voucherCompany;

                private String voucherName;

                private VoucherType voucherType;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                        .SupplementaryPurchaseData.Voucher
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                      .SupplementaryPurchaseData.Voucher(
                      this.affiliateName,
                      this.endsAt,
                      this.extraParams,
                      this.startsAt,
                      this.voucherCompany,
                      this.voucherName,
                      this.voucherType);
                }

                /** Name of associated or partner company for this voucher. */
                public Builder setAffiliateName(String affiliateName) {
                  this.affiliateName = affiliateName;
                  return this;
                }

                /** The voucher validity end time. */
                public Builder setEndsAt(Long endsAt) {
                  this.endsAt = endsAt;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.Voucher#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna.SupplementaryPurchaseData.Voucher#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The voucher validity start time. */
                public Builder setStartsAt(Long startsAt) {
                  this.startsAt = startsAt;
                  return this;
                }

                /** The issuer or provider of this voucher. */
                public Builder setVoucherCompany(String voucherCompany) {
                  this.voucherCompany = voucherCompany;
                  return this;
                }

                /** The name or reference to identify the voucher. */
                public Builder setVoucherName(String voucherName) {
                  this.voucherName = voucherName;
                  return this;
                }

                /** The type of this voucher. */
                public Builder setVoucherType(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Klarna
                            .SupplementaryPurchaseData.Voucher.VoucherType
                        voucherType) {
                  this.voucherType = voucherType;
                  return this;
                }
              }

              public enum VoucherType implements ApiRequestParams.EnumParam {
                @SerializedName("digital_product")
                DIGITAL_PRODUCT("digital_product"),

                @SerializedName("discount")
                DISCOUNT("discount"),

                @SerializedName("gift_card")
                GIFT_CARD("gift_card"),

                @SerializedName("physical_product")
                PHYSICAL_PRODUCT("physical_product"),

                @SerializedName("services")
                SERVICES("services");

                @Getter(onMethod_ = {@Override})
                private final String value;

                VoucherType(String value) {
                  this.value = value;
                }
              }
            }
          }

          public enum CaptureMethod implements ApiRequestParams.EnumParam {
            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            CaptureMethod(String value) {
              this.value = value;
            }
          }

          public enum PreferredLocale implements ApiRequestParams.EnumParam {
            @SerializedName("cs-CZ")
            CS_CZ("cs-CZ"),

            @SerializedName("da-DK")
            DA_DK("da-DK"),

            @SerializedName("de-AT")
            DE_AT("de-AT"),

            @SerializedName("de-CH")
            DE_CH("de-CH"),

            @SerializedName("de-DE")
            DE_DE("de-DE"),

            @SerializedName("el-GR")
            EL_GR("el-GR"),

            @SerializedName("en-AT")
            EN_AT("en-AT"),

            @SerializedName("en-AU")
            EN_AU("en-AU"),

            @SerializedName("en-BE")
            EN_BE("en-BE"),

            @SerializedName("en-CA")
            EN_CA("en-CA"),

            @SerializedName("en-CH")
            EN_CH("en-CH"),

            @SerializedName("en-CZ")
            EN_CZ("en-CZ"),

            @SerializedName("en-DE")
            EN_DE("en-DE"),

            @SerializedName("en-DK")
            EN_DK("en-DK"),

            @SerializedName("en-ES")
            EN_ES("en-ES"),

            @SerializedName("en-FI")
            EN_FI("en-FI"),

            @SerializedName("en-FR")
            EN_FR("en-FR"),

            @SerializedName("en-GB")
            EN_GB("en-GB"),

            @SerializedName("en-GR")
            EN_GR("en-GR"),

            @SerializedName("en-IE")
            EN_IE("en-IE"),

            @SerializedName("en-IT")
            EN_IT("en-IT"),

            @SerializedName("en-NL")
            EN_NL("en-NL"),

            @SerializedName("en-NO")
            EN_NO("en-NO"),

            @SerializedName("en-NZ")
            EN_NZ("en-NZ"),

            @SerializedName("en-PL")
            EN_PL("en-PL"),

            @SerializedName("en-PT")
            EN_PT("en-PT"),

            @SerializedName("en-RO")
            EN_RO("en-RO"),

            @SerializedName("en-SE")
            EN_SE("en-SE"),

            @SerializedName("en-US")
            EN_US("en-US"),

            @SerializedName("es-ES")
            ES_ES("es-ES"),

            @SerializedName("es-US")
            ES_US("es-US"),

            @SerializedName("fi-FI")
            FI_FI("fi-FI"),

            @SerializedName("fr-BE")
            FR_BE("fr-BE"),

            @SerializedName("fr-CA")
            FR_CA("fr-CA"),

            @SerializedName("fr-CH")
            FR_CH("fr-CH"),

            @SerializedName("fr-FR")
            FR_FR("fr-FR"),

            @SerializedName("it-CH")
            IT_CH("it-CH"),

            @SerializedName("it-IT")
            IT_IT("it-IT"),

            @SerializedName("nb-NO")
            NB_NO("nb-NO"),

            @SerializedName("nl-BE")
            NL_BE("nl-BE"),

            @SerializedName("nl-NL")
            NL_NL("nl-NL"),

            @SerializedName("pl-PL")
            PL_PL("pl-PL"),

            @SerializedName("pt-PT")
            PT_PT("pt-PT"),

            @SerializedName("ro-RO")
            RO_RO("ro-RO"),

            @SerializedName("sv-FI")
            SV_FI("sv-FI"),

            @SerializedName("sv-SE")
            SV_SE("sv-SE");

            @Getter(onMethod_ = {@Override})
            private final String value;

            PreferredLocale(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session"),

            @SerializedName("on_session")
            ON_SESSION("on_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Link {
          /**
           * Controls when the funds are captured from the customer's account.
           *
           * <p>If provided, this parameter overrides the behavior of the top-level <a
           * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
           * for this payment method type when finalizing the payment with this payment method type.
           *
           * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
           * value for this parameter unsets the stored value for this payment method type.
           */
          @SerializedName("capture_method")
          ApiRequestParams.EnumParam captureMethod;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** [Deprecated] This is a legacy parameter that no longer has any function. */
          @SerializedName("persistent_token")
          @Deprecated
          String persistentToken;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          private Link(
              ApiRequestParams.EnumParam captureMethod,
              Map<String, Object> extraParams,
              String persistentToken,
              ApiRequestParams.EnumParam setupFutureUsage) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.persistentToken = persistentToken;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private ApiRequestParams.EnumParam captureMethod;

            private Map<String, Object> extraParams;

            private String persistentToken;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link(
                  this.captureMethod,
                  this.extraParams,
                  this.persistentToken,
                  this.setupFutureUsage);
            }

            /**
             * Controls when the funds are captured from the customer's account.
             *
             * <p>If provided, this parameter overrides the behavior of the top-level <a
             * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
             * for this payment method type when finalizing the payment with this payment method
             * type.
             *
             * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
             * value for this parameter unsets the stored value for this payment method type.
             */
            public Builder setCaptureMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link.CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Controls when the funds are captured from the customer's account.
             *
             * <p>If provided, this parameter overrides the behavior of the top-level <a
             * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
             * for this payment method type when finalizing the payment with this payment method
             * type.
             *
             * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
             * value for this parameter unsets the stored value for this payment method type.
             */
            public Builder setCaptureMethod(EmptyParam captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** [Deprecated] This is a legacy parameter that no longer has any function. */
            @Deprecated
            public Builder setPersistentToken(String persistentToken) {
              this.persistentToken = persistentToken;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Link.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum CaptureMethod implements ApiRequestParams.EnumParam {
            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            CaptureMethod(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Oxxo {
          /**
           * The number of calendar days before an OXXO voucher expires. For example, if you create
           * an OXXO voucher on Monday and you set expires_after_days to 2, the OXXO invoice will
           * expire on Wednesday at 23:59 America/Mexico_City time.
           */
          @SerializedName("expires_after_days")
          Long expiresAfterDays;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          private Oxxo(
              Long expiresAfterDays,
              Map<String, Object> extraParams,
              SetupFutureUsage setupFutureUsage) {
            this.expiresAfterDays = expiresAfterDays;
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long expiresAfterDays;

            private Map<String, Object> extraParams;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo(
                  this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
            }

            /**
             * The number of calendar days before an OXXO voucher expires. For example, if you
             * create an OXXO voucher on Monday and you set expires_after_days to 2, the OXXO
             * invoice will expire on Wednesday at 23:59 America/Mexico_City time.
             */
            public Builder setExpiresAfterDays(Long expiresAfterDays) {
              this.expiresAfterDays = expiresAfterDays;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo#extraParams} for the
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
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Oxxo.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class P24 {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          /** Confirm that the payer has accepted the P24 terms and conditions. */
          @SerializedName("tos_shown_and_accepted")
          Boolean tosShownAndAccepted;

          private P24(
              Map<String, Object> extraParams,
              SetupFutureUsage setupFutureUsage,
              Boolean tosShownAndAccepted) {
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
            this.tosShownAndAccepted = tosShownAndAccepted;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private SetupFutureUsage setupFutureUsage;

            private Boolean tosShownAndAccepted;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24 build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24(
                  this.extraParams, this.setupFutureUsage, this.tosShownAndAccepted);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24#extraParams} for the
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
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.P24.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /** Confirm that the payer has accepted the P24 terms and conditions. */
            public Builder setTosShownAndAccepted(Boolean tosShownAndAccepted) {
              this.tosShownAndAccepted = tosShownAndAccepted;
              return this;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Paypal {
          /** Controls when the funds will be captured from the customer's account. */
          @SerializedName("capture_method")
          ApiRequestParams.EnumParam captureMethod;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The line items purchased by the customer. */
          @SerializedName("line_items")
          List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem> lineItems;

          /**
           * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred
           * locale</a> of the PayPal checkout page that the customer is redirected to.
           */
          @SerializedName("preferred_locale")
          PreferredLocale preferredLocale;

          /**
           * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
           * invoice ID. This must be a globally unique ID if you have configured in your PayPal
           * settings to block multiple payments per invoice ID.
           */
          @SerializedName("reference")
          String reference;

          /**
           * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
           * invoice ID. This must be a globally unique ID if you have configured in your PayPal
           * settings to block multiple payments per invoice ID.
           */
          @SerializedName("reference_id")
          String referenceId;

          /**
           * The risk correlation ID for an on-session payment using a saved PayPal payment method.
           */
          @SerializedName("risk_correlation_id")
          String riskCorrelationId;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          /**
           * The Stripe connected account IDs of the sellers on the platform for this transaction
           * (optional). Only allowed when <a
           * href="https://stripe.com/docs/connect/separate-charges-and-transfers">separate charges
           * and transfers</a> are used.
           */
          @SerializedName("subsellers")
          List<String> subsellers;

          private Paypal(
              ApiRequestParams.EnumParam captureMethod,
              Map<String, Object> extraParams,
              List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem>
                  lineItems,
              PreferredLocale preferredLocale,
              String reference,
              String referenceId,
              String riskCorrelationId,
              ApiRequestParams.EnumParam setupFutureUsage,
              List<String> subsellers) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.lineItems = lineItems;
            this.preferredLocale = preferredLocale;
            this.reference = reference;
            this.referenceId = referenceId;
            this.riskCorrelationId = riskCorrelationId;
            this.setupFutureUsage = setupFutureUsage;
            this.subsellers = subsellers;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private ApiRequestParams.EnumParam captureMethod;

            private Map<String, Object> extraParams;

            private List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem>
                lineItems;

            private PreferredLocale preferredLocale;

            private String reference;

            private String referenceId;

            private String riskCorrelationId;

            private ApiRequestParams.EnumParam setupFutureUsage;

            private List<String> subsellers;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal(
                  this.captureMethod,
                  this.extraParams,
                  this.lineItems,
                  this.preferredLocale,
                  this.reference,
                  this.referenceId,
                  this.riskCorrelationId,
                  this.setupFutureUsage,
                  this.subsellers);
            }

            /** Controls when the funds will be captured from the customer's account. */
            public Builder setCaptureMethod(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /** Controls when the funds will be captured from the customer's account. */
            public Builder setCaptureMethod(EmptyParam captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#extraParams} for the
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
             * Add an element to `lineItems` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#lineItems} for the
             * field documentation.
             */
            public Builder addLineItem(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem element) {
              if (this.lineItems == null) {
                this.lineItems = new ArrayList<>();
              }
              this.lineItems.add(element);
              return this;
            }

            /**
             * Add all elements to `lineItems` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#lineItems} for the
             * field documentation.
             */
            public Builder addAllLineItem(
                List<OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem>
                    elements) {
              if (this.lineItems == null) {
                this.lineItems = new ArrayList<>();
              }
              this.lineItems.addAll(elements);
              return this;
            }

            /**
             * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred
             * locale</a> of the PayPal checkout page that the customer is redirected to.
             */
            public Builder setPreferredLocale(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.PreferredLocale
                    preferredLocale) {
              this.preferredLocale = preferredLocale;
              return this;
            }

            /**
             * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
             * invoice ID. This must be a globally unique ID if you have configured in your PayPal
             * settings to block multiple payments per invoice ID.
             */
            public Builder setReference(String reference) {
              this.reference = reference;
              return this;
            }

            /**
             * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
             * invoice ID. This must be a globally unique ID if you have configured in your PayPal
             * settings to block multiple payments per invoice ID.
             */
            public Builder setReferenceId(String referenceId) {
              this.referenceId = referenceId;
              return this;
            }

            /**
             * The risk correlation ID for an on-session payment using a saved PayPal payment
             * method.
             */
            public Builder setRiskCorrelationId(String riskCorrelationId) {
              this.riskCorrelationId = riskCorrelationId;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Add an element to `subsellers` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#subsellers} for the
             * field documentation.
             */
            public Builder addSubseller(String element) {
              if (this.subsellers == null) {
                this.subsellers = new ArrayList<>();
              }
              this.subsellers.add(element);
              return this;
            }

            /**
             * Add all elements to `subsellers` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal#subsellers} for the
             * field documentation.
             */
            public Builder addAllSubseller(List<String> elements) {
              if (this.subsellers == null) {
                this.subsellers = new ArrayList<>();
              }
              this.subsellers.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class LineItem {
            /** Type of the line item. */
            @SerializedName("category")
            Category category;

            /** Description of the line item. */
            @SerializedName("description")
            String description;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> Descriptive name of the line item. */
            @SerializedName("name")
            String name;

            /** <strong>Required.</strong> Quantity of the line item. Must be a positive number. */
            @SerializedName("quantity")
            Long quantity;

            /** Client facing stock keeping unit, article number or similar. */
            @SerializedName("sku")
            String sku;

            /** The Stripe account ID of the connected account that sells the item. */
            @SerializedName("sold_by")
            String soldBy;

            /** The tax information for the line item. */
            @SerializedName("tax")
            Tax tax;

            /**
             * <strong>Required.</strong> Price for a single unit of the line item in minor units.
             * Cannot be a negative number.
             */
            @SerializedName("unit_amount")
            Long unitAmount;

            private LineItem(
                Category category,
                String description,
                Map<String, Object> extraParams,
                String name,
                Long quantity,
                String sku,
                String soldBy,
                Tax tax,
                Long unitAmount) {
              this.category = category;
              this.description = description;
              this.extraParams = extraParams;
              this.name = name;
              this.quantity = quantity;
              this.sku = sku;
              this.soldBy = soldBy;
              this.tax = tax;
              this.unitAmount = unitAmount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Category category;

              private String description;

              private Map<String, Object> extraParams;

              private String name;

              private Long quantity;

              private String sku;

              private String soldBy;

              private Tax tax;

              private Long unitAmount;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem(
                    this.category,
                    this.description,
                    this.extraParams,
                    this.name,
                    this.quantity,
                    this.sku,
                    this.soldBy,
                    this.tax,
                    this.unitAmount);
              }

              /** Type of the line item. */
              public Builder setCategory(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Category
                      category) {
                this.category = category;
                return this;
              }

              /** Description of the line item. */
              public Builder setDescription(String description) {
                this.description = description;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> Descriptive name of the line item. */
              public Builder setName(String name) {
                this.name = name;
                return this;
              }

              /**
               * <strong>Required.</strong> Quantity of the line item. Must be a positive number.
               */
              public Builder setQuantity(Long quantity) {
                this.quantity = quantity;
                return this;
              }

              /** Client facing stock keeping unit, article number or similar. */
              public Builder setSku(String sku) {
                this.sku = sku;
                return this;
              }

              /** The Stripe account ID of the connected account that sells the item. */
              public Builder setSoldBy(String soldBy) {
                this.soldBy = soldBy;
                return this;
              }

              /** The tax information for the line item. */
              public Builder setTax(
                  OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Tax tax) {
                this.tax = tax;
                return this;
              }

              /**
               * <strong>Required.</strong> Price for a single unit of the line item in minor units.
               * Cannot be a negative number.
               */
              public Builder setUnitAmount(Long unitAmount) {
                this.unitAmount = unitAmount;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Tax {
              /**
               * <strong>Required.</strong> The tax for a single unit of the line item in minor
               * units. Cannot be a negative number.
               */
              @SerializedName("amount")
              Long amount;

              /** <strong>Required.</strong> The tax behavior for the line item. */
              @SerializedName("behavior")
              Behavior behavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private Tax(Long amount, Behavior behavior, Map<String, Object> extraParams) {
                this.amount = amount;
                this.behavior = behavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Long amount;

                private Behavior behavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Tax
                    build() {
                  return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem
                      .Tax(this.amount, this.behavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The tax for a single unit of the line item in minor
                 * units. Cannot be a negative number.
                 */
                public Builder setAmount(Long amount) {
                  this.amount = amount;
                  return this;
                }

                /** <strong>Required.</strong> The tax behavior for the line item. */
                public Builder setBehavior(
                    OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Tax
                            .Behavior
                        behavior) {
                  this.behavior = behavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Tax#extraParams}
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
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Paypal.LineItem.Tax#extraParams}
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

              public enum Behavior implements ApiRequestParams.EnumParam {
                @SerializedName("exclusive")
                EXCLUSIVE("exclusive"),

                @SerializedName("inclusive")
                INCLUSIVE("inclusive");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Behavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Category implements ApiRequestParams.EnumParam {
              @SerializedName("digital_goods")
              DIGITAL_GOODS("digital_goods"),

              @SerializedName("donation")
              DONATION("donation"),

              @SerializedName("physical_goods")
              PHYSICAL_GOODS("physical_goods");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Category(String value) {
                this.value = value;
              }
            }
          }

          public enum CaptureMethod implements ApiRequestParams.EnumParam {
            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            CaptureMethod(String value) {
              this.value = value;
            }
          }

          public enum PreferredLocale implements ApiRequestParams.EnumParam {
            @SerializedName("cs-CZ")
            CS_CZ("cs-CZ"),

            @SerializedName("da-DK")
            DA_DK("da-DK"),

            @SerializedName("de-AT")
            DE_AT("de-AT"),

            @SerializedName("de-DE")
            DE_DE("de-DE"),

            @SerializedName("de-LU")
            DE_LU("de-LU"),

            @SerializedName("el-GR")
            EL_GR("el-GR"),

            @SerializedName("en-GB")
            EN_GB("en-GB"),

            @SerializedName("en-US")
            EN_US("en-US"),

            @SerializedName("es-ES")
            ES_ES("es-ES"),

            @SerializedName("fi-FI")
            FI_FI("fi-FI"),

            @SerializedName("fr-BE")
            FR_BE("fr-BE"),

            @SerializedName("fr-FR")
            FR_FR("fr-FR"),

            @SerializedName("fr-LU")
            FR_LU("fr-LU"),

            @SerializedName("hu-HU")
            HU_HU("hu-HU"),

            @SerializedName("it-IT")
            IT_IT("it-IT"),

            @SerializedName("nl-BE")
            NL_BE("nl-BE"),

            @SerializedName("nl-NL")
            NL_NL("nl-NL"),

            @SerializedName("pl-PL")
            PL_PL("pl-PL"),

            @SerializedName("pt-PT")
            PT_PT("pt-PT"),

            @SerializedName("sk-SK")
            SK_SK("sk-SK"),

            @SerializedName("sv-SE")
            SV_SE("sv-SE");

            @Getter(onMethod_ = {@Override})
            private final String value;

            PreferredLocale(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaDebit {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Additional fields for Mandate creation. */
          @SerializedName("mandate_options")
          MandateOptions mandateOptions;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          /**
           * Controls when Stripe will attempt to debit the funds from the customer's account. The
           * date must be a string in YYYY-MM-DD format. The date must be in the future and between
           * 3 and 15 calendar days from now.
           */
          @SerializedName("target_date")
          String targetDate;

          private SepaDebit(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              ApiRequestParams.EnumParam setupFutureUsage,
              String targetDate) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.setupFutureUsage = setupFutureUsage;
            this.targetDate = targetDate;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private ApiRequestParams.EnumParam setupFutureUsage;

            private String targetDate;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit(
                  this.extraParams, this.mandateOptions, this.setupFutureUsage, this.targetDate);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Additional fields for Mandate creation. */
            public Builder setMandateOptions(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions
                    mandateOptions) {
              this.mandateOptions = mandateOptions;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Controls when Stripe will attempt to debit the funds from the customer's account. The
             * date must be a string in YYYY-MM-DD format. The date must be in the future and
             * between 3 and 15 calendar days from now.
             */
            public Builder setTargetDate(String targetDate) {
              this.targetDate = targetDate;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MandateOptions {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * Prefix used to generate the Mandate reference. Must be at most 12 characters long.
             * Must consist of only uppercase letters, numbers, spaces, or the following special
             * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
             */
            @SerializedName("reference_prefix")
            Object referencePrefix;

            private MandateOptions(Map<String, Object> extraParams, Object referencePrefix) {
              this.extraParams = extraParams;
              this.referencePrefix = referencePrefix;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Object referencePrefix;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit
                      .MandateOptions
                  build() {
                return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit
                    .MandateOptions(this.extraParams, this.referencePrefix);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderCreateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
               * Prefix used to generate the Mandate reference. Must be at most 12 characters long.
               * Must consist of only uppercase letters, numbers, spaces, or the following special
               * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
               */
              public Builder setReferencePrefix(String referencePrefix) {
                this.referencePrefix = referencePrefix;
                return this;
              }

              /**
               * Prefix used to generate the Mandate reference. Must be at most 12 characters long.
               * Must consist of only uppercase letters, numbers, spaces, or the following special
               * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
               */
              public Builder setReferencePrefix(EmptyParam referencePrefix) {
                this.referencePrefix = referencePrefix;
                return this;
              }
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session"),

            @SerializedName("on_session")
            ON_SESSION("on_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Sofort {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Language shown to the payer on redirect. */
          @SerializedName("preferred_language")
          ApiRequestParams.EnumParam preferredLanguage;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          ApiRequestParams.EnumParam setupFutureUsage;

          private Sofort(
              Map<String, Object> extraParams,
              ApiRequestParams.EnumParam preferredLanguage,
              ApiRequestParams.EnumParam setupFutureUsage) {
            this.extraParams = extraParams;
            this.preferredLanguage = preferredLanguage;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ApiRequestParams.EnumParam preferredLanguage;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort(
                  this.extraParams, this.preferredLanguage, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Language shown to the payer on redirect. */
            public Builder setPreferredLanguage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort.PreferredLanguage
                    preferredLanguage) {
              this.preferredLanguage = preferredLanguage;
              return this;
            }

            /** Language shown to the payer on redirect. */
            public Builder setPreferredLanguage(EmptyParam preferredLanguage) {
              this.preferredLanguage = preferredLanguage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.Sofort.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }

            /**
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum PreferredLanguage implements ApiRequestParams.EnumParam {
            @SerializedName("de")
            DE("de"),

            @SerializedName("en")
            EN("en"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("pl")
            PL("pl");

            @Getter(onMethod_ = {@Override})
            private final String value;

            PreferredLanguage(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none"),

            @SerializedName("off_session")
            OFF_SESSION("off_session");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class WechatPay {
          /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
          @SerializedName("app_id")
          String appId;

          /** The client type that the end customer will pay from. */
          @SerializedName("client")
          Client client;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Indicates that you intend to make future payments with this PaymentIntent's payment
           * method.
           *
           * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
           * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
           * the Customer after the PaymentIntent is confirmed and the customer completes any
           * required actions. If you don't provide a Customer, you can still <a
           * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
           * Customer after the transaction completes.
           *
           * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
           * creates and attaches a <a
           * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
           * payment method representing the card to the Customer instead.
           *
           * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
           * comply with regional legislation and network rules, such as <a
           * href="https://stripe.com/strong-customer-authentication">SCA</a>.
           *
           * <p>If you've already set {@code setup_future_usage} and you're performing a request
           * using a publishable key, you can only update the value from {@code on_session} to
           * {@code off_session}.
           */
          @SerializedName("setup_future_usage")
          SetupFutureUsage setupFutureUsage;

          private WechatPay(
              String appId,
              Client client,
              Map<String, Object> extraParams,
              SetupFutureUsage setupFutureUsage) {
            this.appId = appId;
            this.client = client;
            this.extraParams = extraParams;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String appId;

            private Client client;

            private Map<String, Object> extraParams;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay build() {
              return new OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay(
                  this.appId, this.client, this.extraParams, this.setupFutureUsage);
            }

            /**
             * The app ID registered with WeChat Pay. Only required when client is ios or android.
             */
            public Builder setAppId(String appId) {
              this.appId = appId;
              return this;
            }

            /** The client type that the end customer will pay from. */
            public Builder setClient(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay.Client client) {
              this.client = client;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay#extraParams} for
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
             * Indicates that you intend to make future payments with this PaymentIntent's payment
             * method.
             *
             * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
             * href="https://stripe.com/payments/save-during-payment">attach the payment method</a>
             * to the Customer after the PaymentIntent is confirmed and the customer completes any
             * required actions. If you don't provide a Customer, you can still <a
             * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to
             * a Customer after the transaction completes.
             *
             * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
             * creates and attaches a <a
             * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
             * payment method representing the card to the Customer instead.
             *
             * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
             * comply with regional legislation and network rules, such as <a
             * href="https://stripe.com/strong-customer-authentication">SCA</a>.
             *
             * <p>If you've already set {@code setup_future_usage} and you're performing a request
             * using a publishable key, you can only update the value from {@code on_session} to
             * {@code off_session}.
             */
            public Builder setSetupFutureUsage(
                OrderCreateParams.Payment.Settings.PaymentMethodOptions.WechatPay.SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          public enum Client implements ApiRequestParams.EnumParam {
            @SerializedName("android")
            ANDROID("android"),

            @SerializedName("ios")
            IOS("ios"),

            @SerializedName("web")
            WEB("web");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Client(String value) {
              this.value = value;
            }
          }

          public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
            @SerializedName("none")
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class TransferData {
        /**
         * The amount that will be transferred automatically when the order is paid. If no amount is
         * set, the full amount is transferred. There cannot be any line items with recurring prices
         * when using this field.
         */
        @SerializedName("amount")
        Long amount;

        /** <strong>Required.</strong> ID of the Connected account receiving the transfer. */
        @SerializedName("destination")
        String destination;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
          this.amount = amount;
          this.destination = destination;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String destination;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderCreateParams.Payment.Settings.TransferData build() {
            return new OrderCreateParams.Payment.Settings.TransferData(
                this.amount, this.destination, this.extraParams);
          }

          /**
           * The amount that will be transferred automatically when the order is paid. If no amount
           * is set, the full amount is transferred. There cannot be any line items with recurring
           * prices when using this field.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** <strong>Required.</strong> ID of the Connected account receiving the transfer. */
          public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderCreateParams.Payment.Settings.TransferData#extraParams} for the
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
           * map. See {@link OrderCreateParams.Payment.Settings.TransferData#extraParams} for the
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

      public enum PaymentMethodType implements ApiRequestParams.EnumParam {
        @SerializedName("acss_debit")
        ACSS_DEBIT("acss_debit"),

        @SerializedName("afterpay_clearpay")
        AFTERPAY_CLEARPAY("afterpay_clearpay"),

        @SerializedName("alipay")
        ALIPAY("alipay"),

        @SerializedName("au_becs_debit")
        AU_BECS_DEBIT("au_becs_debit"),

        @SerializedName("bacs_debit")
        BACS_DEBIT("bacs_debit"),

        @SerializedName("bancontact")
        BANCONTACT("bancontact"),

        @SerializedName("card")
        CARD("card"),

        @SerializedName("customer_balance")
        CUSTOMER_BALANCE("customer_balance"),

        @SerializedName("eps")
        EPS("eps"),

        @SerializedName("fpx")
        FPX("fpx"),

        @SerializedName("giropay")
        GIROPAY("giropay"),

        @SerializedName("grabpay")
        GRABPAY("grabpay"),

        @SerializedName("ideal")
        IDEAL("ideal"),

        @SerializedName("klarna")
        KLARNA("klarna"),

        @SerializedName("link")
        LINK("link"),

        @SerializedName("oxxo")
        OXXO("oxxo"),

        @SerializedName("p24")
        P24("p24"),

        @SerializedName("paypal")
        PAYPAL("paypal"),

        @SerializedName("sepa_debit")
        SEPA_DEBIT("sepa_debit"),

        @SerializedName("sofort")
        SOFORT("sofort"),

        @SerializedName("wechat_pay")
        WECHAT_PAY("wechat_pay");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PaymentMethodType(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingCost {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the shipping rate to use for this order. */
    @SerializedName("shipping_rate")
    String shippingRate;

    /** Parameters to create a new ad-hoc shipping rate for this order. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingCost(
        Map<String, Object> extraParams, String shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.ShippingCost build() {
        return new OrderCreateParams.ShippingCost(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.ShippingCost#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.ShippingCost#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the shipping rate to use for this order. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to create a new ad-hoc shipping rate for this order. */
      public Builder setShippingRateData(
          OrderCreateParams.ShippingCost.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingRateData {
      /**
       * The estimated range for how long shipping will take, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("delivery_estimate")
      DeliveryEstimate deliveryEstimate;

      /**
       * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
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

      /**
       * Describes a fixed amount to charge for shipping. Must be present if type is {@code
       * fixed_amount}.
       */
      @SerializedName("fixed_amount")
      FixedAmount fixedAmount;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
       * code is {@code txcd_92010001}.
       */
      @SerializedName("tax_code")
      String taxCode;

      /** The type of calculation to use on the shipping rate. */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          String displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          String taxCode,
          Type type) {
        this.deliveryEstimate = deliveryEstimate;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.fixedAmount = fixedAmount;
        this.metadata = metadata;
        this.taxBehavior = taxBehavior;
        this.taxCode = taxCode;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeliveryEstimate deliveryEstimate;

        private String displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private String taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.ShippingCost.ShippingRateData build() {
          return new OrderCreateParams.ShippingCost.ShippingRateData(
              this.deliveryEstimate,
              this.displayName,
              this.extraParams,
              this.fixedAmount,
              this.metadata,
              this.taxBehavior,
              this.taxCode,
              this.type);
        }

        /**
         * The estimated range for how long shipping will take, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDeliveryEstimate(
            OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate deliveryEstimate) {
          this.deliveryEstimate = deliveryEstimate;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * map. See {@link OrderCreateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * Describes a fixed amount to charge for shipping. Must be present if type is {@code
         * fixed_amount}.
         */
        public Builder setFixedAmount(
            OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * OrderCreateParams.ShippingCost.ShippingRateData#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.ShippingCost.ShippingRateData#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
         * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        public Builder setTaxBehavior(
            OrderCreateParams.ShippingCost.ShippingRateData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(String taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** The type of calculation to use on the shipping rate. */
        public Builder setType(OrderCreateParams.ShippingCost.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DeliveryEstimate {
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
         * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
         * infinite.
         */
        @SerializedName("maximum")
        Maximum maximum;

        /** The lower bound of the estimated range. If empty, represents no lower bound. */
        @SerializedName("minimum")
        Minimum minimum;

        private DeliveryEstimate(
            Map<String, Object> extraParams, Maximum maximum, Minimum minimum) {
          this.extraParams = extraParams;
          this.maximum = maximum;
          this.minimum = minimum;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Maximum maximum;

          private Minimum minimum;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate build() {
            return new OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
           * infinite.
           */
          public Builder setMaximum(
              OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Maximum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Maximum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Minimum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Minimum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                OrderCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class FixedAmount {
        /**
         * <strong>Required.</strong> A non-negative integer in cents representing how much to
         * charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
            currencyOptions;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private FixedAmount(
            Long amount,
            String currency,
            Map<String, OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
                currencyOptions,
            Map<String, Object> extraParams) {
          this.amount = amount;
          this.currency = currency;
          this.currencyOptions = currencyOptions;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Map<
                  String,
                  OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount build() {
            return new OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount(
                this.amount, this.currency, this.currencyOptions, this.extraParams);
          }

          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption value) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the
           * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
           * original map. See {@link
           * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
                  map) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the field
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
           * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the field
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
        public static class CurrencyOption {
          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          private CurrencyOption(
              Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.taxBehavior = taxBehavior;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private TaxBehavior taxBehavior;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption(
                  this.amount, this.extraParams, this.taxBehavior);
            }

            /**
             * <strong>Required.</strong> A non-negative integer in cents representing how much to
             * charge.
             */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes.
             * One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
             */
            public Builder setTaxBehavior(
                OrderCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                        .TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
            }
          }

          public enum TaxBehavior implements ApiRequestParams.EnumParam {
            @SerializedName("exclusive")
            EXCLUSIVE("exclusive"),

            @SerializedName("inclusive")
            INCLUSIVE("inclusive"),

            @SerializedName("unspecified")
            UNSPECIFIED("unspecified");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TaxBehavior(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("fixed_amount")
        FIXED_AMOUNT("fixed_amount");

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
  public static class ShippingDetails {
    /** <strong>Required.</strong> The shipping address for the order. */
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

    /** <strong>Required.</strong> The name of the recipient of the order. */
    @SerializedName("name")
    String name;

    /** The phone number (including extension) for the recipient of the order. */
    @SerializedName("phone")
    Object phone;

    private ShippingDetails(
        Address address, Map<String, Object> extraParams, String name, Object phone) {
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

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.ShippingDetails build() {
        return new OrderCreateParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> The shipping address for the order. */
      public Builder setAddress(OrderCreateParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.ShippingDetails#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.ShippingDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The name of the recipient of the order. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The phone number (including extension) for the recipient of the order. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** The phone number (including extension) for the recipient of the order. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
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
        public OrderCreateParams.ShippingDetails.Address build() {
          return new OrderCreateParams.ShippingDetails.Address(
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
         * map. See {@link OrderCreateParams.ShippingDetails.Address#extraParams} for the field
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
         * map. See {@link OrderCreateParams.ShippingDetails.Address#extraParams} for the field
         * documentation.
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

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
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
  public static class TaxDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The purchaser's tax exemption status. One of {@code none}, {@code exempt}, or {@code
     * reverse}.
     */
    @SerializedName("tax_exempt")
    ApiRequestParams.EnumParam taxExempt;

    /** The purchaser's tax IDs to be used for this order. */
    @SerializedName("tax_ids")
    List<OrderCreateParams.TaxDetails.TaxId> taxIds;

    private TaxDetails(
        Map<String, Object> extraParams,
        ApiRequestParams.EnumParam taxExempt,
        List<OrderCreateParams.TaxDetails.TaxId> taxIds) {
      this.extraParams = extraParams;
      this.taxExempt = taxExempt;
      this.taxIds = taxIds;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private ApiRequestParams.EnumParam taxExempt;

      private List<OrderCreateParams.TaxDetails.TaxId> taxIds;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.TaxDetails build() {
        return new OrderCreateParams.TaxDetails(this.extraParams, this.taxExempt, this.taxIds);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.TaxDetails#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.TaxDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The purchaser's tax exemption status. One of {@code none}, {@code exempt}, or {@code
       * reverse}.
       */
      public Builder setTaxExempt(OrderCreateParams.TaxDetails.TaxExempt taxExempt) {
        this.taxExempt = taxExempt;
        return this;
      }

      /**
       * The purchaser's tax exemption status. One of {@code none}, {@code exempt}, or {@code
       * reverse}.
       */
      public Builder setTaxExempt(EmptyParam taxExempt) {
        this.taxExempt = taxExempt;
        return this;
      }

      /**
       * Add an element to `taxIds` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.TaxDetails#taxIds} for the field documentation.
       */
      public Builder addTaxId(OrderCreateParams.TaxDetails.TaxId element) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.add(element);
        return this;
      }

      /**
       * Add all elements to `taxIds` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderCreateParams.TaxDetails#taxIds} for the field documentation.
       */
      public Builder addAllTaxId(List<OrderCreateParams.TaxDetails.TaxId> elements) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.addAll(elements);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
       * {@code al_tin}, {@code am_tin}, {@code ao_tin}, {@code ar_cuit}, {@code au_abn}, {@code
       * au_arn}, {@code aw_tin}, {@code az_tin}, {@code ba_tin}, {@code bb_tin}, {@code bd_bin},
       * {@code bf_ifu}, {@code bg_uic}, {@code bh_vat}, {@code bj_ifu}, {@code bo_tin}, {@code
       * br_cnpj}, {@code br_cpf}, {@code bs_tin}, {@code by_tin}, {@code ca_bn}, {@code
       * ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst},
       * {@code cd_nif}, {@code ch_uid}, {@code ch_vat}, {@code cl_tin}, {@code cm_niu}, {@code
       * cn_tin}, {@code co_nit}, {@code cr_tin}, {@code cv_nif}, {@code de_stn}, {@code do_rcn},
       * {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code et_tin}, {@code eu_oss_vat}, {@code
       * eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code gn_nif}, {@code hk_br}, {@code hr_oib},
       * {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code
       * jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kg_tin}, {@code kh_tin},
       * {@code kr_brn}, {@code kz_bin}, {@code la_tin}, {@code li_uid}, {@code li_vat}, {@code
       * ma_vat}, {@code md_vat}, {@code me_pib}, {@code mk_vat}, {@code mr_nif}, {@code mx_rfc},
       * {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat}, {@code
       * no_voec}, {@code np_pan}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin},
       * {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code
       * sg_gst}, {@code sg_uen}, {@code si_tin}, {@code sn_ninea}, {@code sr_fin}, {@code sv_nit},
       * {@code th_vat}, {@code tj_tin}, {@code tr_tin}, {@code tw_vat}, {@code tz_vat}, {@code
       * ua_vat}, {@code ug_tin}, {@code us_ein}, {@code uy_ruc}, {@code uz_tin}, {@code uz_vat},
       * {@code ve_rif}, {@code vn_tin}, {@code za_vat}, {@code zm_tin}, or {@code zw_tin}
       */
      @SerializedName("type")
      Type type;

      /** <strong>Required.</strong> Value of the tax ID. */
      @SerializedName("value")
      String value;

      private TaxId(Map<String, Object> extraParams, Type type, String value) {
        this.extraParams = extraParams;
        this.type = type;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        private String value;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderCreateParams.TaxDetails.TaxId build() {
          return new OrderCreateParams.TaxDetails.TaxId(this.extraParams, this.type, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderCreateParams.TaxDetails.TaxId#extraParams} for the field
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
         * map. See {@link OrderCreateParams.TaxDetails.TaxId#extraParams} for the field
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
         * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
         * {@code al_tin}, {@code am_tin}, {@code ao_tin}, {@code ar_cuit}, {@code au_abn}, {@code
         * au_arn}, {@code aw_tin}, {@code az_tin}, {@code ba_tin}, {@code bb_tin}, {@code bd_bin},
         * {@code bf_ifu}, {@code bg_uic}, {@code bh_vat}, {@code bj_ifu}, {@code bo_tin}, {@code
         * br_cnpj}, {@code br_cpf}, {@code bs_tin}, {@code by_tin}, {@code ca_bn}, {@code
         * ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst},
         * {@code cd_nif}, {@code ch_uid}, {@code ch_vat}, {@code cl_tin}, {@code cm_niu}, {@code
         * cn_tin}, {@code co_nit}, {@code cr_tin}, {@code cv_nif}, {@code de_stn}, {@code do_rcn},
         * {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code et_tin}, {@code eu_oss_vat},
         * {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code gn_nif}, {@code hk_br}, {@code
         * hr_oib}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat},
         * {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kg_tin}, {@code
         * kh_tin}, {@code kr_brn}, {@code kz_bin}, {@code la_tin}, {@code li_uid}, {@code li_vat},
         * {@code ma_vat}, {@code md_vat}, {@code me_pib}, {@code mk_vat}, {@code mr_nif}, {@code
         * mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat},
         * {@code no_voec}, {@code np_pan}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code
         * ph_tin}, {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat},
         * {@code sg_gst}, {@code sg_uen}, {@code si_tin}, {@code sn_ninea}, {@code sr_fin}, {@code
         * sv_nit}, {@code th_vat}, {@code tj_tin}, {@code tr_tin}, {@code tw_vat}, {@code tz_vat},
         * {@code ua_vat}, {@code ug_tin}, {@code us_ein}, {@code uy_ruc}, {@code uz_tin}, {@code
         * uz_vat}, {@code ve_rif}, {@code vn_tin}, {@code za_vat}, {@code zm_tin}, or {@code
         * zw_tin}
         */
        public Builder setType(OrderCreateParams.TaxDetails.TaxId.Type type) {
          this.type = type;
          return this;
        }

        /** <strong>Required.</strong> Value of the tax ID. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ad_nrt")
        AD_NRT("ad_nrt"),

        @SerializedName("ae_trn")
        AE_TRN("ae_trn"),

        @SerializedName("al_tin")
        AL_TIN("al_tin"),

        @SerializedName("am_tin")
        AM_TIN("am_tin"),

        @SerializedName("ao_tin")
        AO_TIN("ao_tin"),

        @SerializedName("ar_cuit")
        AR_CUIT("ar_cuit"),

        @SerializedName("au_abn")
        AU_ABN("au_abn"),

        @SerializedName("au_arn")
        AU_ARN("au_arn"),

        @SerializedName("aw_tin")
        AW_TIN("aw_tin"),

        @SerializedName("az_tin")
        AZ_TIN("az_tin"),

        @SerializedName("ba_tin")
        BA_TIN("ba_tin"),

        @SerializedName("bb_tin")
        BB_TIN("bb_tin"),

        @SerializedName("bd_bin")
        BD_BIN("bd_bin"),

        @SerializedName("bf_ifu")
        BF_IFU("bf_ifu"),

        @SerializedName("bg_uic")
        BG_UIC("bg_uic"),

        @SerializedName("bh_vat")
        BH_VAT("bh_vat"),

        @SerializedName("bj_ifu")
        BJ_IFU("bj_ifu"),

        @SerializedName("bo_tin")
        BO_TIN("bo_tin"),

        @SerializedName("br_cnpj")
        BR_CNPJ("br_cnpj"),

        @SerializedName("br_cpf")
        BR_CPF("br_cpf"),

        @SerializedName("bs_tin")
        BS_TIN("bs_tin"),

        @SerializedName("by_tin")
        BY_TIN("by_tin"),

        @SerializedName("ca_bn")
        CA_BN("ca_bn"),

        @SerializedName("ca_gst_hst")
        CA_GST_HST("ca_gst_hst"),

        @SerializedName("ca_pst_bc")
        CA_PST_BC("ca_pst_bc"),

        @SerializedName("ca_pst_mb")
        CA_PST_MB("ca_pst_mb"),

        @SerializedName("ca_pst_sk")
        CA_PST_SK("ca_pst_sk"),

        @SerializedName("ca_qst")
        CA_QST("ca_qst"),

        @SerializedName("cd_nif")
        CD_NIF("cd_nif"),

        @SerializedName("ch_uid")
        CH_UID("ch_uid"),

        @SerializedName("ch_vat")
        CH_VAT("ch_vat"),

        @SerializedName("cl_tin")
        CL_TIN("cl_tin"),

        @SerializedName("cm_niu")
        CM_NIU("cm_niu"),

        @SerializedName("cn_tin")
        CN_TIN("cn_tin"),

        @SerializedName("co_nit")
        CO_NIT("co_nit"),

        @SerializedName("cr_tin")
        CR_TIN("cr_tin"),

        @SerializedName("cv_nif")
        CV_NIF("cv_nif"),

        @SerializedName("de_stn")
        DE_STN("de_stn"),

        @SerializedName("do_rcn")
        DO_RCN("do_rcn"),

        @SerializedName("ec_ruc")
        EC_RUC("ec_ruc"),

        @SerializedName("eg_tin")
        EG_TIN("eg_tin"),

        @SerializedName("es_cif")
        ES_CIF("es_cif"),

        @SerializedName("et_tin")
        ET_TIN("et_tin"),

        @SerializedName("eu_oss_vat")
        EU_OSS_VAT("eu_oss_vat"),

        @SerializedName("eu_vat")
        EU_VAT("eu_vat"),

        @SerializedName("gb_vat")
        GB_VAT("gb_vat"),

        @SerializedName("ge_vat")
        GE_VAT("ge_vat"),

        @SerializedName("gn_nif")
        GN_NIF("gn_nif"),

        @SerializedName("hk_br")
        HK_BR("hk_br"),

        @SerializedName("hr_oib")
        HR_OIB("hr_oib"),

        @SerializedName("hu_tin")
        HU_TIN("hu_tin"),

        @SerializedName("id_npwp")
        ID_NPWP("id_npwp"),

        @SerializedName("il_vat")
        IL_VAT("il_vat"),

        @SerializedName("in_gst")
        IN_GST("in_gst"),

        @SerializedName("is_vat")
        IS_VAT("is_vat"),

        @SerializedName("jp_cn")
        JP_CN("jp_cn"),

        @SerializedName("jp_rn")
        JP_RN("jp_rn"),

        @SerializedName("jp_trn")
        JP_TRN("jp_trn"),

        @SerializedName("ke_pin")
        KE_PIN("ke_pin"),

        @SerializedName("kg_tin")
        KG_TIN("kg_tin"),

        @SerializedName("kh_tin")
        KH_TIN("kh_tin"),

        @SerializedName("kr_brn")
        KR_BRN("kr_brn"),

        @SerializedName("kz_bin")
        KZ_BIN("kz_bin"),

        @SerializedName("la_tin")
        LA_TIN("la_tin"),

        @SerializedName("li_uid")
        LI_UID("li_uid"),

        @SerializedName("li_vat")
        LI_VAT("li_vat"),

        @SerializedName("ma_vat")
        MA_VAT("ma_vat"),

        @SerializedName("md_vat")
        MD_VAT("md_vat"),

        @SerializedName("me_pib")
        ME_PIB("me_pib"),

        @SerializedName("mk_vat")
        MK_VAT("mk_vat"),

        @SerializedName("mr_nif")
        MR_NIF("mr_nif"),

        @SerializedName("mx_rfc")
        MX_RFC("mx_rfc"),

        @SerializedName("my_frp")
        MY_FRP("my_frp"),

        @SerializedName("my_itn")
        MY_ITN("my_itn"),

        @SerializedName("my_sst")
        MY_SST("my_sst"),

        @SerializedName("ng_tin")
        NG_TIN("ng_tin"),

        @SerializedName("no_vat")
        NO_VAT("no_vat"),

        @SerializedName("no_voec")
        NO_VOEC("no_voec"),

        @SerializedName("np_pan")
        NP_PAN("np_pan"),

        @SerializedName("nz_gst")
        NZ_GST("nz_gst"),

        @SerializedName("om_vat")
        OM_VAT("om_vat"),

        @SerializedName("pe_ruc")
        PE_RUC("pe_ruc"),

        @SerializedName("ph_tin")
        PH_TIN("ph_tin"),

        @SerializedName("ro_tin")
        RO_TIN("ro_tin"),

        @SerializedName("rs_pib")
        RS_PIB("rs_pib"),

        @SerializedName("ru_inn")
        RU_INN("ru_inn"),

        @SerializedName("ru_kpp")
        RU_KPP("ru_kpp"),

        @SerializedName("sa_vat")
        SA_VAT("sa_vat"),

        @SerializedName("sg_gst")
        SG_GST("sg_gst"),

        @SerializedName("sg_uen")
        SG_UEN("sg_uen"),

        @SerializedName("si_tin")
        SI_TIN("si_tin"),

        @SerializedName("sn_ninea")
        SN_NINEA("sn_ninea"),

        @SerializedName("sr_fin")
        SR_FIN("sr_fin"),

        @SerializedName("sv_nit")
        SV_NIT("sv_nit"),

        @SerializedName("th_vat")
        TH_VAT("th_vat"),

        @SerializedName("tj_tin")
        TJ_TIN("tj_tin"),

        @SerializedName("tr_tin")
        TR_TIN("tr_tin"),

        @SerializedName("tw_vat")
        TW_VAT("tw_vat"),

        @SerializedName("tz_vat")
        TZ_VAT("tz_vat"),

        @SerializedName("ua_vat")
        UA_VAT("ua_vat"),

        @SerializedName("ug_tin")
        UG_TIN("ug_tin"),

        @SerializedName("us_ein")
        US_EIN("us_ein"),

        @SerializedName("uy_ruc")
        UY_RUC("uy_ruc"),

        @SerializedName("uz_tin")
        UZ_TIN("uz_tin"),

        @SerializedName("uz_vat")
        UZ_VAT("uz_vat"),

        @SerializedName("ve_rif")
        VE_RIF("ve_rif"),

        @SerializedName("vn_tin")
        VN_TIN("vn_tin"),

        @SerializedName("za_vat")
        ZA_VAT("za_vat"),

        @SerializedName("zm_tin")
        ZM_TIN("zm_tin"),

        @SerializedName("zw_tin")
        ZW_TIN("zw_tin");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum TaxExempt implements ApiRequestParams.EnumParam {
      @SerializedName("exempt")
      EXEMPT("exempt"),

      @SerializedName("none")
      NONE("none"),

      @SerializedName("reverse")
      REVERSE("reverse");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxExempt(String value) {
        this.value = value;
      }
    }
  }
}
