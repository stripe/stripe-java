package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class OrderUpdateParams extends ApiRequestParams {
  /**
   * A coupon code that represents a discount to be applied to this order. Must be one-time duration
   * and in same currency as the order. An order can have multiple coupons.
   */
  @SerializedName("coupon")
  Object coupon;

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
   * A set of key-value pairs that you can attach to a product object. It can be useful for storing
   * additional information about the order in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The shipping method to select for fulfilling this order. If specified, must be one of the `id`s
   * of a shipping method in the `shipping_methods` array. If specified, will overwrite the existing
   * selected shipping method, updating `items` as necessary.
   */
  @SerializedName("selected_shipping_method")
  Object selectedShippingMethod;

  /** Tracking information once the order has been fulfilled. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * Current order status. One of `created`, `paid`, `canceled`, `fulfilled`, or `returned`. More
   * detail in the [Orders
   * Guide](https://stripe.com/docs/orders/guide#understanding-order-statuses).
   */
  @SerializedName("status")
  Status status;

  private OrderUpdateParams(
      Object coupon,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Object selectedShippingMethod,
      Shipping shipping,
      Status status) {
    this.coupon = coupon;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.selectedShippingMethod = selectedShippingMethod;
    this.shipping = shipping;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object coupon;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Object selectedShippingMethod;

    private Shipping shipping;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderUpdateParams build() {
      return new OrderUpdateParams(
          this.coupon,
          this.expand,
          this.extraParams,
          this.metadata,
          this.selectedShippingMethod,
          this.shipping,
          this.status);
    }

    /**
     * A coupon code that represents a discount to be applied to this order. Must be one-time
     * duration and in same currency as the order. An order can have multiple coupons.
     */
    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * A coupon code that represents a discount to be applied to this order. Must be one-time
     * duration and in same currency as the order. An order can have multiple coupons.
     */
    public Builder setCoupon(EmptyParam coupon) {
      this.coupon = coupon;
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

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OrderUpdateParams#metadata} for the field documentation.
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
     * See {@link OrderUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The shipping method to select for fulfilling this order. If specified, must be one of the
     * `id`s of a shipping method in the `shipping_methods` array. If specified, will overwrite the
     * existing selected shipping method, updating `items` as necessary.
     */
    public Builder setSelectedShippingMethod(String selectedShippingMethod) {
      this.selectedShippingMethod = selectedShippingMethod;
      return this;
    }

    /**
     * The shipping method to select for fulfilling this order. If specified, must be one of the
     * `id`s of a shipping method in the `shipping_methods` array. If specified, will overwrite the
     * existing selected shipping method, updating `items` as necessary.
     */
    public Builder setSelectedShippingMethod(EmptyParam selectedShippingMethod) {
      this.selectedShippingMethod = selectedShippingMethod;
      return this;
    }

    /** Tracking information once the order has been fulfilled. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * Current order status. One of `created`, `paid`, `canceled`, `fulfilled`, or `returned`. More
     * detail in the [Orders
     * Guide](https://stripe.com/docs/orders/guide#understanding-order-statuses).
     */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  public static class Shipping {
    /** The name of the carrier like `USPS`, `UPS`, or `FedEx`. */
    @SerializedName("carrier")
    Object carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The tracking number provided by the carrier. */
    @SerializedName("tracking_number")
    Object trackingNumber;

    private Shipping(Object carrier, Map<String, Object> extraParams, Object trackingNumber) {
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object carrier;

      private Map<String, Object> extraParams;

      private Object trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(this.carrier, this.extraParams, this.trackingNumber);
      }

      /** The name of the carrier like `USPS`, `UPS`, or `FedEx`. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /** The name of the carrier like `USPS`, `UPS`, or `FedEx`. */
      public Builder setCarrier(EmptyParam carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderUpdateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link OrderUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The tracking number provided by the carrier. */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }

      /** The tracking number provided by the carrier. */
      public Builder setTrackingNumber(EmptyParam trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("created")
    CREATED("created"),

    @SerializedName("fulfilled")
    FULFILLED("fulfilled"),

    @SerializedName("paid")
    PAID("paid"),

    @SerializedName("returned")
    RETURNED("returned");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
