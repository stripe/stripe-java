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
import lombok.Getter;

@Getter
public class OrderUpdateParams extends ApiRequestParams {
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
   * The credits to apply to the order, only {@code gift_card} currently supported. Pass the empty
   * string {@code ""} to unset this field.
   */
  @SerializedName("credits")
  Object credits;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  Object currency;

  /** The customer associated with this order. */
  @SerializedName("customer")
  Object customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  Object description;

  /**
   * The coupons, promotion codes, and/or discounts to apply to the order. Pass the empty string
   * {@code ""} to unset this field.
   */
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
  Object ipAddress;

  /**
   * A list of line items the customer is ordering. Each line item includes information about the
   * product, the quantity, and the resulting cost.
   */
  @SerializedName("line_items")
  List<OrderUpdateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

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

  private OrderUpdateParams(
      AutomaticTax automaticTax,
      Object billingDetails,
      Object credits,
      Object currency,
      Object customer,
      Object description,
      Object discounts,
      List<String> expand,
      Map<String, Object> extraParams,
      Object ipAddress,
      List<OrderUpdateParams.LineItem> lineItems,
      Object metadata,
      Payment payment,
      Object shippingCost,
      Object shippingDetails,
      TaxDetails taxDetails) {
    this.automaticTax = automaticTax;
    this.billingDetails = billingDetails;
    this.credits = credits;
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

    private Object credits;

    private Object currency;

    private Object customer;

    private Object description;

    private Object discounts;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object ipAddress;

    private List<OrderUpdateParams.LineItem> lineItems;

    private Object metadata;

    private Payment payment;

    private Object shippingCost;

    private Object shippingDetails;

    private TaxDetails taxDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderUpdateParams build() {
      return new OrderUpdateParams(
          this.automaticTax,
          this.billingDetails,
          this.credits,
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
    public Builder setAutomaticTax(OrderUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Billing details for the customer. If a customer is provided, this will be automatically
     * populated with values from that customer if override values are not provided.
     */
    public Builder setBillingDetails(OrderUpdateParams.BillingDetails billingDetails) {
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
     * Add an element to `credits` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#credits} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCredit(OrderUpdateParams.Credit element) {
      if (this.credits == null || this.credits instanceof EmptyParam) {
        this.credits = new ArrayList<OrderUpdateParams.Credit>();
      }
      ((List<OrderUpdateParams.Credit>) this.credits).add(element);
      return this;
    }

    /**
     * Add all elements to `credits` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#credits} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCredit(List<OrderUpdateParams.Credit> elements) {
      if (this.credits == null || this.credits instanceof EmptyParam) {
        this.credits = new ArrayList<OrderUpdateParams.Credit>();
      }
      ((List<OrderUpdateParams.Credit>) this.credits).addAll(elements);
      return this;
    }

    /**
     * The credits to apply to the order, only {@code gift_card} currently supported. Pass the empty
     * string {@code ""} to unset this field.
     */
    public Builder setCredits(EmptyParam credits) {
      this.credits = credits;
      return this;
    }

    /**
     * The credits to apply to the order, only {@code gift_card} currently supported. Pass the empty
     * string {@code ""} to unset this field.
     */
    public Builder setCredits(List<OrderUpdateParams.Credit> credits) {
      this.credits = credits;
      return this;
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
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(EmptyParam currency) {
      this.currency = currency;
      return this;
    }

    /** The customer associated with this order. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The customer associated with this order. */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(OrderUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<OrderUpdateParams.Discount>();
      }
      ((List<OrderUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<OrderUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<OrderUpdateParams.Discount>();
      }
      ((List<OrderUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons, promotion codes, and/or discounts to apply to the order. Pass the empty string
     * {@code ""} to unset this field.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons, promotion codes, and/or discounts to apply to the order. Pass the empty string
     * {@code ""} to unset this field.
     */
    public Builder setDiscounts(List<OrderUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#expand} for the field documentation.
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
     * OrderUpdateParams#expand} for the field documentation.
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
     * OrderUpdateParams#extraParams} for the field documentation.
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
     * See {@link OrderUpdateParams#extraParams} for the field documentation.
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

    /** The IP address of the purchaser for this order. */
    public Builder setIpAddress(EmptyParam ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(OrderUpdateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OrderUpdateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<OrderUpdateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OrderUpdateParams#metadata} for the field documentation.
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
     * See {@link OrderUpdateParams#metadata} for the field documentation.
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

    /** Payment information associated with the order, including payment settings. */
    public Builder setPayment(OrderUpdateParams.Payment payment) {
      this.payment = payment;
      return this;
    }

    /** Settings for the customer cost of shipping for this order. */
    public Builder setShippingCost(OrderUpdateParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /** Settings for the customer cost of shipping for this order. */
    public Builder setShippingCost(EmptyParam shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /** Shipping details for the order. */
    public Builder setShippingDetails(OrderUpdateParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /** Shipping details for the order. */
    public Builder setShippingDetails(EmptyParam shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /** Additional tax details about the purchaser to be used for this order. */
    public Builder setTaxDetails(OrderUpdateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }
  }

  @Getter
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
      public OrderUpdateParams.AutomaticTax build() {
        return new OrderUpdateParams.AutomaticTax(this.enabled, this.extraParams);
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
       * OrderUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class BillingDetails {
    /** The billing address provided by the customer. */
    @SerializedName("address")
    Address address;

    /** The billing email provided by the customer. */
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

    /** The billing name provided by the customer. */
    @SerializedName("name")
    Object name;

    /** The billing phone number provided by the customer. */
    @SerializedName("phone")
    Object phone;

    private BillingDetails(
        Address address, Object email, Map<String, Object> extraParams, Object name, Object phone) {
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
      public OrderUpdateParams.BillingDetails build() {
        return new OrderUpdateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** The billing address provided by the customer. */
      public Builder setAddress(OrderUpdateParams.BillingDetails.Address address) {
        this.address = address;
        return this;
      }

      /** The billing email provided by the customer. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** The billing email provided by the customer. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.BillingDetails#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.BillingDetails#extraParams} for the field documentation.
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

      /** The billing name provided by the customer. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** The billing phone number provided by the customer. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** The billing phone number provided by the customer. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
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
        public OrderUpdateParams.BillingDetails.Address build() {
          return new OrderUpdateParams.BillingDetails.Address(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.BillingDetails.Address#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.BillingDetails.Address#extraParams} for the field
         * documentation.
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class Credit {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The gift card to apply to the order. */
    @SerializedName("gift_card")
    Object giftCard;

    /**
     * <strong>Required.</strong> The type of credit to apply to the order, only {@code gift_card}
     * currently supported.
     */
    @SerializedName("type")
    Type type;

    private Credit(Map<String, Object> extraParams, Object giftCard, Type type) {
      this.extraParams = extraParams;
      this.giftCard = giftCard;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object giftCard;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.Credit build() {
        return new OrderUpdateParams.Credit(this.extraParams, this.giftCard, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.Credit#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.Credit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The gift card to apply to the order. */
      public Builder setGiftCard(String giftCard) {
        this.giftCard = giftCard;
        return this;
      }

      /** The gift card to apply to the order. */
      public Builder setGiftCard(EmptyParam giftCard) {
        this.giftCard = giftCard;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of credit to apply to the order, only {@code gift_card}
       * currently supported.
       */
      public Builder setType(OrderUpdateParams.Credit.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("gift_card")
      GIFT_CARD("gift_card");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    Object coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    Object discount;

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
    Object promotionCode;

    private Discount(
        Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private Map<String, Object> extraParams;

      private Object promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.Discount build() {
        return new OrderUpdateParams.Discount(
            this.coupon, this.discount, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(EmptyParam coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(EmptyParam discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.Discount#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.Discount#extraParams} for the field documentation.
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

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(EmptyParam promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }
  }

  @Getter
  public static class LineItem {
    /** The description for the line item. Will default to the name of the associated product. */
    @SerializedName("description")
    Object description;

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

    /** The ID of an existing line item on the order. */
    @SerializedName("id")
    Object id;

    /**
     * The ID of a <a href="https://stripe.com/docs/api/prices">Price</a> to add to the Order.
     *
     * <p>The {@code price} parameter is an alternative to using the {@code product} parameter. If
     * each of your products are sold at a single price, you can set {@code Product.default_price}
     * and then pass the {@code product} parameter when creating a line item. If your products are
     * sold at several possible prices, use the {@code price} parameter to explicitly specify which
     * one to use.
     */
    @SerializedName("price")
    Object price;

    /**
     * Data used to generate a new Price object inline.
     *
     * <p>The {@code price_data} parameter is an alternative to using the {@code product} or {@code
     * price} parameters. If you create products upfront and configure a {@code
     * Product.default_price}, pass the {@code product} parameter when creating a line item. If you
     * prefer not to define products upfront, or if you charge variable prices, pass the {@code
     * price_data} parameter to describe the price for this line item.
     *
     * <p>Each time you pass {@code price_data} we create a Price for the product. This Price is
     * hidden in both the Dashboard and API lists and cannot be reused.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /**
     * The ID of a <a href="https://stripe.com/docs/api/products">Product</a> to add to the Order.
     *
     * <p>The product must have a {@code default_price} specified. Otherwise, specify the price by
     * passing the {@code price} or {@code price_data} parameter.
     */
    @SerializedName("product")
    Object product;

    /**
     * Defines a Product inline and adds it to the Order.
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
        Object description,
        Object discounts,
        Map<String, Object> extraParams,
        Object id,
        Object price,
        PriceData priceData,
        Object product,
        ProductData productData,
        Long quantity,
        Object taxRates) {
      this.description = description;
      this.discounts = discounts;
      this.extraParams = extraParams;
      this.id = id;
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
      private Object description;

      private Object discounts;

      private Map<String, Object> extraParams;

      private Object id;

      private Object price;

      private PriceData priceData;

      private Object product;

      private ProductData productData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.LineItem build() {
        return new OrderUpdateParams.LineItem(
            this.description,
            this.discounts,
            this.extraParams,
            this.id,
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

      /** The description for the line item. Will default to the name of the associated product. */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderUpdateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(OrderUpdateParams.LineItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<OrderUpdateParams.LineItem.Discount>();
        }
        ((List<OrderUpdateParams.LineItem.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * OrderUpdateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(List<OrderUpdateParams.LineItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<OrderUpdateParams.LineItem.Discount>();
        }
        ((List<OrderUpdateParams.LineItem.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(List<OrderUpdateParams.LineItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of an existing line item on the order. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The ID of an existing line item on the order. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /**
       * The ID of a <a href="https://stripe.com/docs/api/prices">Price</a> to add to the Order.
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
       * The ID of a <a href="https://stripe.com/docs/api/prices">Price</a> to add to the Order.
       *
       * <p>The {@code price} parameter is an alternative to using the {@code product} parameter. If
       * each of your products are sold at a single price, you can set {@code Product.default_price}
       * and then pass the {@code product} parameter when creating a line item. If your products are
       * sold at several possible prices, use the {@code price} parameter to explicitly specify
       * which one to use.
       */
      public Builder setPrice(EmptyParam price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new Price object inline.
       *
       * <p>The {@code price_data} parameter is an alternative to using the {@code product} or
       * {@code price} parameters. If you create products upfront and configure a {@code
       * Product.default_price}, pass the {@code product} parameter when creating a line item. If
       * you prefer not to define products upfront, or if you charge variable prices, pass the
       * {@code price_data} parameter to describe the price for this line item.
       *
       * <p>Each time you pass {@code price_data} we create a Price for the product. This Price is
       * hidden in both the Dashboard and API lists and cannot be reused.
       */
      public Builder setPriceData(OrderUpdateParams.LineItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /**
       * The ID of a <a href="https://stripe.com/docs/api/products">Product</a> to add to the Order.
       *
       * <p>The product must have a {@code default_price} specified. Otherwise, specify the price by
       * passing the {@code price} or {@code price_data} parameter.
       */
      public Builder setProduct(String product) {
        this.product = product;
        return this;
      }

      /**
       * The ID of a <a href="https://stripe.com/docs/api/products">Product</a> to add to the Order.
       *
       * <p>The product must have a {@code default_price} specified. Otherwise, specify the price by
       * passing the {@code price} or {@code price_data} parameter.
       */
      public Builder setProduct(EmptyParam product) {
        this.product = product;
        return this;
      }

      /**
       * Defines a Product inline and adds it to the Order.
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
      public Builder setProductData(OrderUpdateParams.LineItem.ProductData productData) {
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
       * OrderUpdateParams.LineItem#taxRates} for the field documentation.
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
       * OrderUpdateParams.LineItem#taxRates} for the field documentation.
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
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      Object coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      Object discount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
        this.coupon = coupon;
        this.discount = discount;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.LineItem.Discount build() {
          return new OrderUpdateParams.LineItem.Discount(
              this.coupon, this.discount, this.extraParams);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(EmptyParam coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(EmptyParam discount) {
          this.discount = discount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.LineItem.Discount#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.LineItem.Discount#extraParams} for the field
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
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * ID of the product this price belongs to.
       *
       * <p>Use this to implement a variable-pricing model in your integration. This is required if
       * {@code product_data} is not specified.
       */
      @SerializedName("product")
      Object product;

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
      Object unitAmountDecimal;

      private PriceData(
          Object currency,
          Map<String, Object> extraParams,
          Object product,
          TaxBehavior taxBehavior,
          Long unitAmount,
          Object unitAmountDecimal) {
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
        private Object currency;

        private Map<String, Object> extraParams;

        private Object product;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private Object unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.LineItem.PriceData build() {
          return new OrderUpdateParams.LineItem.PriceData(
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
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.LineItem.PriceData#extraParams} for the field
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
         * ID of the product this price belongs to.
         *
         * <p>Use this to implement a variable-pricing model in your integration. This is required
         * if {@code product_data} is not specified.
         */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * ID of the product this price belongs to.
         *
         * <p>Use this to implement a variable-pricing model in your integration. This is required
         * if {@code product_data} is not specified.
         */
        public Builder setProduct(EmptyParam product) {
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
            OrderUpdateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
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

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
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
      Object id;

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
      Object name;

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
          Object id,
          Object images,
          Object metadata,
          Object name,
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

        private Object id;

        private Object images;

        private Object metadata;

        private Object name;

        private Object packageDimensions;

        private Boolean shippable;

        private Object taxCode;

        private Object url;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.LineItem.ProductData build() {
          return new OrderUpdateParams.LineItem.ProductData(
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
         * map. See {@link OrderUpdateParams.LineItem.ProductData#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.LineItem.ProductData#extraParams} for the field
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
         * <strong>Required.</strong> A unique identifier for this product.
         *
         * <p>{@code product_data} automatically creates a Product with this ID. If a Product with
         * the same ID already exists, then {@code product_data} re-uses it to avoid duplicates. If
         * any of the fields in the existing Product are different from the values in {@code
         * product_data}, {@code product_data} updates the existing Product with the new
         * information. So set {@code product_data[id]} to the same string every time you sell the
         * same product, but don't re-use the same string for different products.
         */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /**
         * Add an element to `images` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * OrderUpdateParams.LineItem.ProductData#images} for the field documentation.
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
         * OrderUpdateParams.LineItem.ProductData#images} for the field documentation.
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
         * OrderUpdateParams.LineItem.ProductData#metadata} for the field documentation.
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
         * map. See {@link OrderUpdateParams.LineItem.ProductData#metadata} for the field
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

        /**
         * <strong>Required.</strong> The product's name, meant to be displayable to the customer.
         */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /** The dimensions of this product for shipping purposes. */
        public Builder setPackageDimensions(
            OrderUpdateParams.LineItem.ProductData.PackageDimensions packageDimensions) {
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
          public OrderUpdateParams.LineItem.ProductData.PackageDimensions build() {
            return new OrderUpdateParams.LineItem.ProductData.PackageDimensions(
                this.extraParams, this.height, this.length, this.weight, this.width);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderUpdateParams.LineItem.ProductData.PackageDimensions#extraParams}
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
           * map. See {@link OrderUpdateParams.LineItem.ProductData.PackageDimensions#extraParams}
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
      public OrderUpdateParams.Payment build() {
        return new OrderUpdateParams.Payment(this.extraParams, this.settings);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.Payment#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.Payment#extraParams} for the field documentation.
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
      public Builder setSettings(OrderUpdateParams.Payment.Settings settings) {
        this.settings = settings;
        return this;
      }
    }

    @Getter
    public static class Settings {
      /**
       * The amount of the application fee (if any) that will be requested to be applied to the
       * payment and transferred to the application owner's Stripe account.
       */
      @SerializedName("application_fee_amount")
      Object applicationFeeAmount;

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
      List<OrderUpdateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes;

      /** The URL to redirect the customer to after they authenticate their payment. */
      @SerializedName("return_url")
      Object returnUrl;

      /**
       * For non-card charges, you can use this value as the complete description that appears on
       * your customers' statements. Must contain at least one letter, maximum 22 characters.
       */
      @SerializedName("statement_descriptor")
      Object statementDescriptor;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on
       * the account to form the complete statement descriptor. Maximum 22 characters for the
       * concatenated descriptor.
       */
      @SerializedName("statement_descriptor_suffix")
      Object statementDescriptorSuffix;

      /** Provides configuration for completing a transfer for the order after it is paid. */
      @SerializedName("transfer_data")
      Object transferData;

      private Settings(
          Object applicationFeeAmount,
          Map<String, Object> extraParams,
          PaymentMethodOptions paymentMethodOptions,
          List<OrderUpdateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes,
          Object returnUrl,
          Object statementDescriptor,
          Object statementDescriptorSuffix,
          Object transferData) {
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
        private Object applicationFeeAmount;

        private Map<String, Object> extraParams;

        private PaymentMethodOptions paymentMethodOptions;

        private List<OrderUpdateParams.Payment.Settings.PaymentMethodType> paymentMethodTypes;

        private Object returnUrl;

        private Object statementDescriptor;

        private Object statementDescriptorSuffix;

        private Object transferData;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.Payment.Settings build() {
          return new OrderUpdateParams.Payment.Settings(
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
         * The amount of the application fee (if any) that will be requested to be applied to the
         * payment and transferred to the application owner's Stripe account.
         */
        public Builder setApplicationFeeAmount(EmptyParam applicationFeeAmount) {
          this.applicationFeeAmount = applicationFeeAmount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.Payment.Settings#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.Payment.Settings#extraParams} for the field
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
            OrderUpdateParams.Payment.Settings.PaymentMethodOptions paymentMethodOptions) {
          this.paymentMethodOptions = paymentMethodOptions;
          return this;
        }

        /**
         * Add an element to `paymentMethodTypes` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link OrderUpdateParams.Payment.Settings#paymentMethodTypes} for the field
         * documentation.
         */
        public Builder addPaymentMethodType(
            OrderUpdateParams.Payment.Settings.PaymentMethodType element) {
          if (this.paymentMethodTypes == null) {
            this.paymentMethodTypes = new ArrayList<>();
          }
          this.paymentMethodTypes.add(element);
          return this;
        }

        /**
         * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link OrderUpdateParams.Payment.Settings#paymentMethodTypes} for the field
         * documentation.
         */
        public Builder addAllPaymentMethodType(
            List<OrderUpdateParams.Payment.Settings.PaymentMethodType> elements) {
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

        /** The URL to redirect the customer to after they authenticate their payment. */
        public Builder setReturnUrl(EmptyParam returnUrl) {
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
         * For non-card charges, you can use this value as the complete description that appears on
         * your customers' statements. Must contain at least one letter, maximum 22 characters.
         */
        public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
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

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on
         * the account to form the complete statement descriptor. Maximum 22 characters for the
         * concatenated descriptor.
         */
        public Builder setStatementDescriptorSuffix(EmptyParam statementDescriptorSuffix) {
          this.statementDescriptorSuffix = statementDescriptorSuffix;
          return this;
        }

        /** Provides configuration for completing a transfer for the order after it is paid. */
        public Builder setTransferData(
            OrderUpdateParams.Payment.Settings.TransferData transferData) {
          this.transferData = transferData;
          return this;
        }

        /** Provides configuration for completing a transfer for the order after it is paid. */
        public Builder setTransferData(EmptyParam transferData) {
          this.transferData = transferData;
          return this;
        }
      }

      @Getter
      public static class PaymentMethodOptions {
        /**
         * If paying by {@code acss_debit}, this sub-hash contains details about the ACSS Debit
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("acss_debit")
        Object acssDebit;

        /**
         * If paying by {@code afterpay_clearpay}, this sub-hash contains details about the
         * AfterpayClearpay payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("afterpay_clearpay")
        Object afterpayClearpay;

        /**
         * If paying by {@code alipay}, this sub-hash contains details about the Alipay payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("alipay")
        Object alipay;

        /**
         * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("bancontact")
        Object bancontact;

        /**
         * If paying by {@code card}, this sub-hash contains details about the Card payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("card")
        Object card;

        /**
         * If paying by {@code customer_balance}, this sub-hash contains details about the Customer
         * Balance payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("customer_balance")
        Object customerBalance;

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
        Object ideal;

        /**
         * If paying by {@code klarna}, this sub-hash contains details about the Klarna payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("klarna")
        Object klarna;

        /**
         * If paying by {@code link}, this sub-hash contains details about the Link payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("link")
        Object link;

        /**
         * If paying by {@code oxxo}, this sub-hash contains details about the OXXO payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("oxxo")
        Object oxxo;

        /**
         * If paying by {@code p24}, this sub-hash contains details about the P24 payment method
         * options to pass to the order's PaymentIntent.
         */
        @SerializedName("p24")
        Object p24;

        /**
         * If paying by {@code paypal}, this sub-hash contains details about the PayPal payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("paypal")
        Object paypal;

        /**
         * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Debit
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("sepa_debit")
        Object sepaDebit;

        /**
         * If paying by {@code sofort}, this sub-hash contains details about the Sofort payment
         * method options to pass to the order's PaymentIntent.
         */
        @SerializedName("sofort")
        Object sofort;

        /**
         * If paying by {@code wechat_pay}, this sub-hash contains details about the WeChat Pay
         * payment method options to pass to the order's PaymentIntent.
         */
        @SerializedName("wechat_pay")
        Object wechatPay;

        private PaymentMethodOptions(
            Object acssDebit,
            Object afterpayClearpay,
            Object alipay,
            Object bancontact,
            Object card,
            Object customerBalance,
            Map<String, Object> extraParams,
            Object ideal,
            Object klarna,
            Object link,
            Object oxxo,
            Object p24,
            Object paypal,
            Object sepaDebit,
            Object sofort,
            Object wechatPay) {
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
          private Object acssDebit;

          private Object afterpayClearpay;

          private Object alipay;

          private Object bancontact;

          private Object card;

          private Object customerBalance;

          private Map<String, Object> extraParams;

          private Object ideal;

          private Object klarna;

          private Object link;

          private Object oxxo;

          private Object p24;

          private Object paypal;

          private Object sepaDebit;

          private Object sofort;

          private Object wechatPay;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderUpdateParams.Payment.Settings.PaymentMethodOptions build() {
            return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions(
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
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit acssDebit) {
            this.acssDebit = acssDebit;
            return this;
          }

          /**
           * If paying by {@code acss_debit}, this sub-hash contains details about the ACSS Debit
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setAcssDebit(EmptyParam acssDebit) {
            this.acssDebit = acssDebit;
            return this;
          }

          /**
           * If paying by {@code afterpay_clearpay}, this sub-hash contains details about the
           * AfterpayClearpay payment method options to pass to the order's PaymentIntent.
           */
          public Builder setAfterpayClearpay(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                  afterpayClearpay) {
            this.afterpayClearpay = afterpayClearpay;
            return this;
          }

          /**
           * If paying by {@code afterpay_clearpay}, this sub-hash contains details about the
           * AfterpayClearpay payment method options to pass to the order's PaymentIntent.
           */
          public Builder setAfterpayClearpay(EmptyParam afterpayClearpay) {
            this.afterpayClearpay = afterpayClearpay;
            return this;
          }

          /**
           * If paying by {@code alipay}, this sub-hash contains details about the Alipay payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setAlipay(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay alipay) {
            this.alipay = alipay;
            return this;
          }

          /**
           * If paying by {@code alipay}, this sub-hash contains details about the Alipay payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setAlipay(EmptyParam alipay) {
            this.alipay = alipay;
            return this;
          }

          /**
           * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setBancontact(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact bancontact) {
            this.bancontact = bancontact;
            return this;
          }

          /**
           * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setBancontact(EmptyParam bancontact) {
            this.bancontact = bancontact;
            return this;
          }

          /**
           * If paying by {@code card}, this sub-hash contains details about the Card payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setCard(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card card) {
            this.card = card;
            return this;
          }

          /**
           * If paying by {@code card}, this sub-hash contains details about the Card payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setCard(EmptyParam card) {
            this.card = card;
            return this;
          }

          /**
           * If paying by {@code customer_balance}, this sub-hash contains details about the
           * Customer Balance payment method options to pass to the order's PaymentIntent.
           */
          public Builder setCustomerBalance(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                  customerBalance) {
            this.customerBalance = customerBalance;
            return this;
          }

          /**
           * If paying by {@code customer_balance}, this sub-hash contains details about the
           * Customer Balance payment method options to pass to the order's PaymentIntent.
           */
          public Builder setCustomerBalance(EmptyParam customerBalance) {
            this.customerBalance = customerBalance;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderUpdateParams.Payment.Settings.PaymentMethodOptions#extraParams}
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
           * map. See {@link OrderUpdateParams.Payment.Settings.PaymentMethodOptions#extraParams}
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
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal ideal) {
            this.ideal = ideal;
            return this;
          }

          /**
           * If paying by {@code ideal}, this sub-hash contains details about the iDEAL payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setIdeal(EmptyParam ideal) {
            this.ideal = ideal;
            return this;
          }

          /**
           * If paying by {@code klarna}, this sub-hash contains details about the Klarna payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setKlarna(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna klarna) {
            this.klarna = klarna;
            return this;
          }

          /**
           * If paying by {@code klarna}, this sub-hash contains details about the Klarna payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setKlarna(EmptyParam klarna) {
            this.klarna = klarna;
            return this;
          }

          /**
           * If paying by {@code link}, this sub-hash contains details about the Link payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setLink(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link link) {
            this.link = link;
            return this;
          }

          /**
           * If paying by {@code link}, this sub-hash contains details about the Link payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setLink(EmptyParam link) {
            this.link = link;
            return this;
          }

          /**
           * If paying by {@code oxxo}, this sub-hash contains details about the OXXO payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setOxxo(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo oxxo) {
            this.oxxo = oxxo;
            return this;
          }

          /**
           * If paying by {@code oxxo}, this sub-hash contains details about the OXXO payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setOxxo(EmptyParam oxxo) {
            this.oxxo = oxxo;
            return this;
          }

          /**
           * If paying by {@code p24}, this sub-hash contains details about the P24 payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setP24(OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24 p24) {
            this.p24 = p24;
            return this;
          }

          /**
           * If paying by {@code p24}, this sub-hash contains details about the P24 payment method
           * options to pass to the order's PaymentIntent.
           */
          public Builder setP24(EmptyParam p24) {
            this.p24 = p24;
            return this;
          }

          /**
           * If paying by {@code paypal}, this sub-hash contains details about the PayPal payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setPaypal(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal paypal) {
            this.paypal = paypal;
            return this;
          }

          /**
           * If paying by {@code paypal}, this sub-hash contains details about the PayPal payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setPaypal(EmptyParam paypal) {
            this.paypal = paypal;
            return this;
          }

          /**
           * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Debit
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setSepaDebit(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
          }

          /**
           * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Debit
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setSepaDebit(EmptyParam sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
          }

          /**
           * If paying by {@code sofort}, this sub-hash contains details about the Sofort payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setSofort(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort sofort) {
            this.sofort = sofort;
            return this;
          }

          /**
           * If paying by {@code sofort}, this sub-hash contains details about the Sofort payment
           * method options to pass to the order's PaymentIntent.
           */
          public Builder setSofort(EmptyParam sofort) {
            this.sofort = sofort;
            return this;
          }

          /**
           * If paying by {@code wechat_pay}, this sub-hash contains details about the WeChat Pay
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setWechatPay(
              OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay wechatPay) {
            this.wechatPay = wechatPay;
            return this;
          }

          /**
           * If paying by {@code wechat_pay}, this sub-hash contains details about the WeChat Pay
           * payment method options to pass to the order's PaymentIntent.
           */
          public Builder setWechatPay(EmptyParam wechatPay) {
            this.wechatPay = wechatPay;
            return this;
          }
        }

        @Getter
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

          /** Bank account verification method. */
          @SerializedName("verification_method")
          VerificationMethod verificationMethod;

          private AcssDebit(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              ApiRequestParams.EnumParam setupFutureUsage,
              VerificationMethod verificationMethod) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.setupFutureUsage = setupFutureUsage;
            this.verificationMethod = verificationMethod;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private ApiRequestParams.EnumParam setupFutureUsage;

            private VerificationMethod verificationMethod;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit(
                  this.extraParams,
                  this.mandateOptions,
                  this.setupFutureUsage,
                  this.verificationMethod);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit#extraParams} for
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit#extraParams} for
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.SetupFutureUsage
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

            /** Bank account verification method. */
            public Builder setVerificationMethod(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.VerificationMethod
                    verificationMethod) {
              this.verificationMethod = verificationMethod;
              return this;
            }
          }

          @Getter
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
            Object intervalDescription;

            /** Payment schedule for the mandate. */
            @SerializedName("payment_schedule")
            PaymentSchedule paymentSchedule;

            /** Transaction type of the mandate. */
            @SerializedName("transaction_type")
            TransactionType transactionType;

            private MandateOptions(
                Object customMandateUrl,
                Map<String, Object> extraParams,
                Object intervalDescription,
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

              private Object intervalDescription;

              private PaymentSchedule paymentSchedule;

              private TransactionType transactionType;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit
                      .MandateOptions
                  build() {
                return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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

              /**
               * Description of the mandate interval. Only required if 'payment_schedule' parameter
               * is 'interval' or 'combined'.
               */
              public Builder setIntervalDescription(EmptyParam intervalDescription) {
                this.intervalDescription = intervalDescription;
                return this;
              }

              /** Payment schedule for the mandate. */
              public Builder setPaymentSchedule(
                  OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
                          .PaymentSchedule
                      paymentSchedule) {
                this.paymentSchedule = paymentSchedule;
                return this;
              }

              /** Transaction type of the mandate. */
              public Builder setTransactionType(
                  OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AcssDebit.MandateOptions
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
          Object reference;

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
              Object reference,
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

            private Object reference;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay(
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
                        .CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay#extraParams}
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay#extraParams}
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
             * An internal identifier or reference this payment corresponds to. The identifier is
             * limited to 128 characters and may contain only letters, digits, underscores,
             * backslashes and dashes.
             */
            public Builder setReference(EmptyParam reference) {
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.AfterpayClearpay
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay(
                  this.extraParams, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Alipay.SetupFutureUsage
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact(
                  this.extraParams, this.preferredLanguage, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact#extraParams} for
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact#extraParams} for
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact.PreferredLanguage
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Bancontact.SetupFutureUsage
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card(
                  this.captureMethod, this.extraParams, this.setupFutureUsage);
            }

            /** Controls when the funds will be captured from the customer's account. */
            public Builder setCaptureMethod(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card.CaptureMethod
                    captureMethod) {
              this.captureMethod = captureMethod;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Card.SetupFutureUsage
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance(
                  this.bankTransfer, this.extraParams, this.fundingType, this.setupFutureUsage);
            }

            /**
             * Configuration for the bank transfer funding type, if the {@code funding_type} is set
             * to {@code bank_transfer}.
             */
            public Builder setBankTransfer(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer
                    bankTransfer) {
              this.bankTransfer = bankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance#extraParams}
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance#extraParams}
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.FundingType
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                        .SetupFutureUsage
                    setupFutureUsage) {
              this.setupFutureUsage = setupFutureUsage;
              return this;
            }
          }

          @Getter
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
                    OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
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
                        OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
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
                      OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.RequestedAddressType>
                  requestedAddressTypes;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer
                  build() {
                return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer(
                    this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
              }

              /** Configuration for the eu_bank_transfer funding type. */
              public Builder setEuBankTransfer(
                  OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.EuBankTransfer
                      euBankTransfer) {
                this.euBankTransfer = euBankTransfer;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
               * for the field documentation.
               */
              public Builder addRequestedAddressType(
                  OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
               * for the field documentation.
               */
              public Builder addAllRequestedAddressType(
                  List<
                          OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
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
                  OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class EuBankTransfer {
              /**
               * <strong>Required.</strong> The desired country code of the bank account
               * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
               * FR}, {@code IE}, or {@code NL}.
               */
              @SerializedName("country")
              Object country;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private EuBankTransfer(Object country, Map<String, Object> extraParams) {
                this.country = country;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Object country;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
                        .BankTransfer.EuBankTransfer
                    build() {
                  return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance
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
                 * <strong>Required.</strong> The desired country code of the bank account
                 * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
                 * FR}, {@code IE}, or {@code NL}.
                 */
                public Builder setCountry(EmptyParam country) {
                  this.country = country;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
                 * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal(
                  this.extraParams, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Ideal.SetupFutureUsage
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

          private Klarna(
              ApiRequestParams.EnumParam captureMethod,
              Map<String, Object> extraParams,
              PreferredLocale preferredLocale,
              SetupFutureUsage setupFutureUsage) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
            this.preferredLocale = preferredLocale;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private ApiRequestParams.EnumParam captureMethod;

            private Map<String, Object> extraParams;

            private PreferredLocale preferredLocale;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna(
                  this.captureMethod,
                  this.extraParams,
                  this.preferredLocale,
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna.CaptureMethod
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna#extraParams} for the
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
             * Preferred language of the Klarna authorization page that the customer is redirected
             * to.
             */
            public Builder setPreferredLocale(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna.PreferredLocale
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Klarna.SetupFutureUsage
                    setupFutureUsage) {
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
            NONE("none");

            @Getter(onMethod_ = {@Override})
            private final String value;

            SetupFutureUsage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
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
          Object persistentToken;

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
              Object persistentToken,
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

            private Object persistentToken;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link(
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link.CaptureMethod
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link#extraParams} for the
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

            /** [Deprecated] This is a legacy parameter that no longer has any function. */
            @Deprecated
            public Builder setPersistentToken(EmptyParam persistentToken) {
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Link.SetupFutureUsage
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo(
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Oxxo.SetupFutureUsage
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24 build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24(
                  this.extraParams, this.setupFutureUsage, this.tosShownAndAccepted);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.P24.SetupFutureUsage
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
          Object reference;

          /**
           * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
           * invoice ID. This must be a globally unique ID if you have configured in your PayPal
           * settings to block multiple payments per invoice ID.
           */
          @SerializedName("reference_id")
          Object referenceId;

          /**
           * The risk correlation ID for an on-session payment using a saved PayPal payment method.
           */
          @SerializedName("risk_correlation_id")
          Object riskCorrelationId;

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
              PreferredLocale preferredLocale,
              Object reference,
              Object referenceId,
              Object riskCorrelationId,
              ApiRequestParams.EnumParam setupFutureUsage,
              List<String> subsellers) {
            this.captureMethod = captureMethod;
            this.extraParams = extraParams;
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

            private PreferredLocale preferredLocale;

            private Object reference;

            private Object referenceId;

            private Object riskCorrelationId;

            private ApiRequestParams.EnumParam setupFutureUsage;

            private List<String> subsellers;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal(
                  this.captureMethod,
                  this.extraParams,
                  this.preferredLocale,
                  this.reference,
                  this.referenceId,
                  this.riskCorrelationId,
                  this.setupFutureUsage,
                  this.subsellers);
            }

            /** Controls when the funds will be captured from the customer's account. */
            public Builder setCaptureMethod(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal.CaptureMethod
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal#extraParams} for the
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
             * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred
             * locale</a> of the PayPal checkout page that the customer is redirected to.
             */
            public Builder setPreferredLocale(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal.PreferredLocale
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
            public Builder setReference(EmptyParam reference) {
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
             * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
             * invoice ID. This must be a globally unique ID if you have configured in your PayPal
             * settings to block multiple payments per invoice ID.
             */
            public Builder setReferenceId(EmptyParam referenceId) {
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
             * The risk correlation ID for an on-session payment using a saved PayPal payment
             * method.
             */
            public Builder setRiskCorrelationId(EmptyParam riskCorrelationId) {
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal.SetupFutureUsage
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal#subsellers} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Paypal#subsellers} for the
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

          private SepaDebit(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              ApiRequestParams.EnumParam setupFutureUsage) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.setupFutureUsage = setupFutureUsage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private ApiRequestParams.EnumParam setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit(
                  this.extraParams, this.mandateOptions, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit#extraParams} for
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit#extraParams} for
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.SetupFutureUsage
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

          @Getter
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

            private MandateOptions(Map<String, Object> extraParams) {
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit
                      .MandateOptions
                  build() {
                return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit
                    .MandateOptions(this.extraParams);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
               * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort(
                  this.extraParams, this.preferredLanguage, this.setupFutureUsage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort#extraParams} for the
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort#extraParams} for the
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort.PreferredLanguage
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.Sofort.SetupFutureUsage
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
        public static class WechatPay {
          /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
          @SerializedName("app_id")
          Object appId;

          /** <strong>Required.</strong> The client type that the end customer will pay from */
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
              Object appId,
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
            private Object appId;

            private Client client;

            private Map<String, Object> extraParams;

            private SetupFutureUsage setupFutureUsage;

            /** Finalize and obtain parameter instance from this builder. */
            public OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay build() {
              return new OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay(
                  this.appId, this.client, this.extraParams, this.setupFutureUsage);
            }

            /**
             * The app ID registered with WeChat Pay. Only required when client is ios or android.
             */
            public Builder setAppId(String appId) {
              this.appId = appId;
              return this;
            }

            /**
             * The app ID registered with WeChat Pay. Only required when client is ios or android.
             */
            public Builder setAppId(EmptyParam appId) {
              this.appId = appId;
              return this;
            }

            /** <strong>Required.</strong> The client type that the end customer will pay from */
            public Builder setClient(
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay.Client client) {
              this.client = client;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay#extraParams} for
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
             * OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay#extraParams} for
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
                OrderUpdateParams.Payment.Settings.PaymentMethodOptions.WechatPay.SetupFutureUsage
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
        Object destination;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TransferData(Long amount, Object destination, Map<String, Object> extraParams) {
          this.amount = amount;
          this.destination = destination;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object destination;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderUpdateParams.Payment.Settings.TransferData build() {
            return new OrderUpdateParams.Payment.Settings.TransferData(
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

          /** <strong>Required.</strong> ID of the Connected account receiving the transfer. */
          public Builder setDestination(EmptyParam destination) {
            this.destination = destination;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link OrderUpdateParams.Payment.Settings.TransferData#extraParams} for the
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
           * map. See {@link OrderUpdateParams.Payment.Settings.TransferData#extraParams} for the
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
    Object shippingRate;

    /** Parameters to create a new ad-hoc shipping rate for this order. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingCost(
        Map<String, Object> extraParams, Object shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.ShippingCost build() {
        return new OrderUpdateParams.ShippingCost(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.ShippingCost#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.ShippingCost#extraParams} for the field documentation.
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

      /** The ID of the shipping rate to use for this order. */
      public Builder setShippingRate(EmptyParam shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to create a new ad-hoc shipping rate for this order. */
      public Builder setShippingRateData(
          OrderUpdateParams.ShippingCost.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
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
      Object displayName;

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
      Object taxCode;

      /** The type of calculation to use on the shipping rate. */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          Object displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          Object taxCode,
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

        private Object displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private Object taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.ShippingCost.ShippingRateData build() {
          return new OrderUpdateParams.ShippingCost.ShippingRateData(
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
            OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate deliveryEstimate) {
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
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(EmptyParam displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * map. See {@link OrderUpdateParams.ShippingCost.ShippingRateData#extraParams} for the
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
            OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * OrderUpdateParams.ShippingCost.ShippingRateData#metadata} for the field documentation.
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
         * map. See {@link OrderUpdateParams.ShippingCost.ShippingRateData#metadata} for the field
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
            OrderUpdateParams.ShippingCost.ShippingRateData.TaxBehavior taxBehavior) {
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

        /**
         * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(EmptyParam taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** The type of calculation to use on the shipping rate. */
        public Builder setType(OrderUpdateParams.ShippingCost.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
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
          public OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate build() {
            return new OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
              OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
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
            public OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
             * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
                OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum.Unit
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
            public OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
             * OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
                OrderUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum.Unit
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
        Object currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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
            Object currency,
            Map<String, OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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

          private Object currency;

          private Map<
                  String,
                  OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount build() {
            return new OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount(
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
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption value) {
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
           * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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
           * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the field
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
           * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the field
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
            public OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption(
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
             * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
                OrderUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
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
    Object name;

    /** The phone number (including extension) for the recipient of the order. */
    @SerializedName("phone")
    Object phone;

    private ShippingDetails(
        Address address, Map<String, Object> extraParams, Object name, Object phone) {
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

      private Object name;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.ShippingDetails build() {
        return new OrderUpdateParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> The shipping address for the order. */
      public Builder setAddress(OrderUpdateParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.ShippingDetails#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.ShippingDetails#extraParams} for the field documentation.
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

      /** <strong>Required.</strong> The name of the recipient of the order. */
      public Builder setName(EmptyParam name) {
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
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
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
        public OrderUpdateParams.ShippingDetails.Address build() {
          return new OrderUpdateParams.ShippingDetails.Address(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.ShippingDetails.Address#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.ShippingDetails.Address#extraParams} for the field
         * documentation.
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
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
    List<OrderUpdateParams.TaxDetails.TaxId> taxIds;

    private TaxDetails(
        Map<String, Object> extraParams,
        ApiRequestParams.EnumParam taxExempt,
        List<OrderUpdateParams.TaxDetails.TaxId> taxIds) {
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

      private List<OrderUpdateParams.TaxDetails.TaxId> taxIds;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderUpdateParams.TaxDetails build() {
        return new OrderUpdateParams.TaxDetails(this.extraParams, this.taxExempt, this.taxIds);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.TaxDetails#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.TaxDetails#extraParams} for the field documentation.
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
      public Builder setTaxExempt(OrderUpdateParams.TaxDetails.TaxExempt taxExempt) {
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
       * OrderUpdateParams.TaxDetails#taxIds} for the field documentation.
       */
      public Builder addTaxId(OrderUpdateParams.TaxDetails.TaxId element) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.add(element);
        return this;
      }

      /**
       * Add all elements to `taxIds` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * OrderUpdateParams.TaxDetails#taxIds} for the field documentation.
       */
      public Builder addAllTaxId(List<OrderUpdateParams.TaxDetails.TaxId> elements) {
        if (this.taxIds == null) {
          this.taxIds = new ArrayList<>();
        }
        this.taxIds.addAll(elements);
        return this;
      }
    }

    @Getter
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
       * {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bh_vat}, {@code
       * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code
       * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code ch_uid}, {@code
       * ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code co_nit}, {@code cr_tin}, {@code de_stn},
       * {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code eu_oss_vat}, {@code
       * eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code hk_br}, {@code hu_tin}, {@code id_npwp},
       * {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code jp_cn}, {@code jp_rn}, {@code
       * jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code kz_bin}, {@code li_uid}, {@code mx_rfc},
       * {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat}, {@code
       * no_voec}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin}, {@code ro_tin},
       * {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code
       * sg_uen}, {@code si_tin}, {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat},
       * {@code ua_vat}, {@code us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code
       * za_vat}
       */
      @SerializedName("type")
      Type type;

      /** <strong>Required.</strong> Value of the tax ID. */
      @SerializedName("value")
      Object value;

      private TaxId(Map<String, Object> extraParams, Type type, Object value) {
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

        private Object value;

        /** Finalize and obtain parameter instance from this builder. */
        public OrderUpdateParams.TaxDetails.TaxId build() {
          return new OrderUpdateParams.TaxDetails.TaxId(this.extraParams, this.type, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OrderUpdateParams.TaxDetails.TaxId#extraParams} for the field
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
         * map. See {@link OrderUpdateParams.TaxDetails.TaxId#extraParams} for the field
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
         * {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bh_vat}, {@code
         * bo_tin}, {@code br_cnpj}, {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code
         * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code ch_uid}, {@code
         * ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code co_nit}, {@code cr_tin}, {@code de_stn},
         * {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code eu_oss_vat},
         * {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code hk_br}, {@code hu_tin}, {@code
         * id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code jp_cn}, {@code jp_rn},
         * {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code kz_bin}, {@code li_uid}, {@code
         * mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code ng_tin}, {@code no_vat},
         * {@code no_voec}, {@code nz_gst}, {@code om_vat}, {@code pe_ruc}, {@code ph_tin}, {@code
         * ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst},
         * {@code sg_uen}, {@code si_tin}, {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code
         * tw_vat}, {@code ua_vat}, {@code us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin},
         * or {@code za_vat}
         */
        public Builder setType(OrderUpdateParams.TaxDetails.TaxId.Type type) {
          this.type = type;
          return this;
        }

        /** <strong>Required.</strong> Value of the tax ID. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }

        /** <strong>Required.</strong> Value of the tax ID. */
        public Builder setValue(EmptyParam value) {
          this.value = value;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ad_nrt")
        AD_NRT("ad_nrt"),

        @SerializedName("ae_trn")
        AE_TRN("ae_trn"),

        @SerializedName("ar_cuit")
        AR_CUIT("ar_cuit"),

        @SerializedName("au_abn")
        AU_ABN("au_abn"),

        @SerializedName("au_arn")
        AU_ARN("au_arn"),

        @SerializedName("bg_uic")
        BG_UIC("bg_uic"),

        @SerializedName("bh_vat")
        BH_VAT("bh_vat"),

        @SerializedName("bo_tin")
        BO_TIN("bo_tin"),

        @SerializedName("br_cnpj")
        BR_CNPJ("br_cnpj"),

        @SerializedName("br_cpf")
        BR_CPF("br_cpf"),

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

        @SerializedName("ch_uid")
        CH_UID("ch_uid"),

        @SerializedName("ch_vat")
        CH_VAT("ch_vat"),

        @SerializedName("cl_tin")
        CL_TIN("cl_tin"),

        @SerializedName("cn_tin")
        CN_TIN("cn_tin"),

        @SerializedName("co_nit")
        CO_NIT("co_nit"),

        @SerializedName("cr_tin")
        CR_TIN("cr_tin"),

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

        @SerializedName("eu_oss_vat")
        EU_OSS_VAT("eu_oss_vat"),

        @SerializedName("eu_vat")
        EU_VAT("eu_vat"),

        @SerializedName("gb_vat")
        GB_VAT("gb_vat"),

        @SerializedName("ge_vat")
        GE_VAT("ge_vat"),

        @SerializedName("hk_br")
        HK_BR("hk_br"),

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

        @SerializedName("kr_brn")
        KR_BRN("kr_brn"),

        @SerializedName("kz_bin")
        KZ_BIN("kz_bin"),

        @SerializedName("li_uid")
        LI_UID("li_uid"),

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

        @SerializedName("sv_nit")
        SV_NIT("sv_nit"),

        @SerializedName("th_vat")
        TH_VAT("th_vat"),

        @SerializedName("tr_tin")
        TR_TIN("tr_tin"),

        @SerializedName("tw_vat")
        TW_VAT("tw_vat"),

        @SerializedName("ua_vat")
        UA_VAT("ua_vat"),

        @SerializedName("us_ein")
        US_EIN("us_ein"),

        @SerializedName("uy_ruc")
        UY_RUC("uy_ruc"),

        @SerializedName("ve_rif")
        VE_RIF("ve_rif"),

        @SerializedName("vn_tin")
        VN_TIN("vn_tin"),

        @SerializedName("za_vat")
        ZA_VAT("za_vat");

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
