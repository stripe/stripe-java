// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OrderCreateParams extends ApiRequestParams {
  /**
   * A coupon code that represents a discount to be applied to this order. Must be one-time duration
   * and in same currency as the order.
   */
  @SerializedName("coupon")
  String coupon;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of an existing customer to use for this order. If provided, the customer email and
   * shipping address will be used to create the order. Subsequently, the customer will also be
   * charged to pay the order. If `email` or `shipping` are also provided, they will override the
   * values retrieved from the customer object.
   */
  @SerializedName("customer")
  String customer;

  /** The email address of the customer placing the order. */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** List of items constituting the order. An order can have up to 25 items. */
  @SerializedName("items")
  List<Item> items;

  /**
   * A set of key-value pairs that you can attach to an order object. Limited to 500 characters.
   * Metadata can be useful for storing additional information about the order in a structured
   * format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Shipping address for the order. Required if any of the SKUs are for products that have
   * `shippable` set to true.
   */
  @SerializedName("shipping")
  Shipping shipping;

  private OrderCreateParams(
      String coupon,
      String currency,
      String customer,
      String email,
      List<String> expand,
      List<Item> items,
      Map<String, String> metadata,
      Shipping shipping) {
    this.coupon = coupon;
    this.currency = currency;
    this.customer = customer;
    this.email = email;
    this.expand = expand;
    this.items = items;
    this.metadata = metadata;
    this.shipping = shipping;
  }

  public static Builder builder() {
    return new com.stripe.param.OrderCreateParams.Builder();
  }

  public static class Builder {
    private String coupon;

    private String currency;

    private String customer;

    private String email;

    private List<String> expand;

    private List<Item> items;

    private Map<String, String> metadata;

    private Shipping shipping;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderCreateParams build() {
      return new OrderCreateParams(
          this.coupon,
          this.currency,
          this.customer,
          this.email,
          this.expand,
          this.items,
          this.metadata,
          this.shipping);
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
     * Add all elements to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#items} for the field documentation.
     */
    public Builder addAllItem(List<Item> elements) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.addAll(elements);
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
     * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#items} for the field documentation.
     */
    public Builder addItem(Item element) {
      if (this.items == null) {
        this.items = new ArrayList<>();
      }
      this.items.add(element);
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
     * A coupon code that represents a discount to be applied to this order. Must be one-time
     * duration and in same currency as the order.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The ID of an existing customer to use for this order. If provided, the customer email and
     * shipping address will be used to create the order. Subsequently, the customer will also be
     * charged to pay the order. If `email` or `shipping` are also provided, they will override the
     * values retrieved from the customer object.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The email address of the customer placing the order. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Shipping address for the order. Required if any of the SKUs are for products that have
     * `shippable` set to true.
     */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }
  }

  @Getter
  public static class Item {
    @SerializedName("amount")
    Long amount;

    @SerializedName("currency")
    String currency;

    @SerializedName("description")
    String description;

    /** The ID of the SKU being ordered. */
    @SerializedName("parent")
    String parent;

    /**
     * The quantity of this order item. When type is `sku`, this is the number of instances of the
     * SKU to be ordered.
     */
    @SerializedName("quantity")
    Long quantity;

    @SerializedName("type")
    Type type;

    private Item(
        Long amount, String currency, String description, String parent, Long quantity, Type type) {
      this.amount = amount;
      this.currency = currency;
      this.description = description;
      this.parent = parent;
      this.quantity = quantity;
      this.type = type;
    }

    public static Builder builder() {
      return new com.stripe.param.OrderCreateParams.Item.Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private String description;

      private String parent;

      private Long quantity;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public Item build() {
        return new Item(
            this.amount, this.currency, this.description, this.parent, this.quantity, this.type);
      }

      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /** The ID of the SKU being ordered. */
      public Builder setParent(String parent) {
        this.parent = parent;
        return this;
      }

      /**
       * The quantity of this order item. When type is `sku`, this is the number of instances of the
       * SKU to be ordered.
       */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      public Builder setType(Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("discount")
      DISCOUNT("discount"),

      @SerializedName("shipping")
      SHIPPING("shipping"),

      @SerializedName("sku")
      SKU("sku"),

      @SerializedName("tax")
      TAX("tax");

      @Getter private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Shipping {
    /** Customer shipping address. */
    @SerializedName("address")
    Address address;

    /** Customer name. */
    @SerializedName("name")
    String name;

    /** Customer phone (including extension). */
    @SerializedName("phone")
    String phone;

    private Shipping(Address address, String name, String phone) {
      this.address = address;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new com.stripe.param.OrderCreateParams.Shipping.Builder();
    }

    public static class Builder {
      private Address address;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(this.address, this.name, this.phone);
      }

      /** Customer shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** Customer name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Customer phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new com.stripe.param.OrderCreateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}
