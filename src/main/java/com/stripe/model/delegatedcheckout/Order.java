// File generated from our OpenAPI spec
package com.stripe.model.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.OrderRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An order represents the post-checkout lifecycle of a delegated checkout purchase. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Order extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The latest order event for this order. */
  @SerializedName("latest_order_event")
  OrderEvent latestOrderEvent;

  /** The line items in this order. */
  @SerializedName("line_items")
  List<Order.LineItem> lineItems;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code delegated_checkout.order}.
   */
  @SerializedName("object")
  String object;

  /** The permalink URL for this order. */
  @SerializedName("permalink_url")
  String permalinkUrl;

  /** The requested session associated with this order. */
  @SerializedName("requested_session")
  String requestedSession;

  /** The seller reference for this order. */
  @SerializedName("seller_reference")
  String sellerReference;

  /** The totals for this order. */
  @SerializedName("totals")
  Totals totals;

  /** Retrieves a delegated checkout order. */
  public static Order retrieve(String orderId) throws StripeException {
    return retrieve(orderId, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a delegated checkout order. */
  public static Order retrieve(String orderId, RequestOptions options) throws StripeException {
    return retrieve(orderId, (Map<String, Object>) null, options);
  }

  /** Retrieves a delegated checkout order. */
  public static Order retrieve(String orderId, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/delegated_checkout/orders/%s", ApiResource.urlEncodeId(orderId));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /** Retrieves a delegated checkout order. */
  public static Order retrieve(String orderId, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/delegated_checkout/orders/%s", ApiResource.urlEncodeId(orderId));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * For more details about LineItem, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItem extends StripeObject {
    /** The order line item key. */
    @SerializedName("key")
    String key;

    @SerializedName("product_details")
    ProductDetails productDetails;

    @SerializedName("quantity")
    Quantity quantity;

    /** The SKU ID of the line item. */
    @SerializedName("sku_id")
    String skuId;

    /** The totals for this line item. */
    @SerializedName("totals")
    Totals totals;

    /** The line item unit amount. */
    @SerializedName("unit_amount")
    Long unitAmount;

    /**
     * For more details about ProductDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProductDetails extends StripeObject {
      /** The item description. */
      @SerializedName("description")
      String description;

      /** The item images. */
      @SerializedName("images")
      List<String> images;

      /** The item title. */
      @SerializedName("title")
      String title;
    }

    /**
     * For more details about Quantity, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Quantity extends StripeObject {
      /** The current quantity. */
      @SerializedName("current")
      Long current;

      /** The ordered quantity. */
      @SerializedName("ordered")
      Long ordered;

      /** The shipped quantity. */
      @SerializedName("shipped")
      Long shipped;
    }

    /**
     * For more details about Totals, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Totals extends StripeObject {
      /** The base amount for the line item. */
      @SerializedName("base_amount")
      Long baseAmount;

      /** The discount amount for the line item. */
      @SerializedName("discount")
      Long discount;

      /** The subtotal amount for the line item. */
      @SerializedName("subtotal")
      Long subtotal;

      /** The tax amount for the line item. */
      @SerializedName("tax")
      Long tax;

      /** The total amount for the line item. */
      @SerializedName("total")
      Long total;
    }
  }

  /**
   * For more details about Totals, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Totals extends StripeObject {
    /** The discount amount for the order. */
    @SerializedName("discount")
    Long discount;

    /** The fulfillment amount for the order. */
    @SerializedName("fulfillment")
    Long fulfillment;

    /** The subtotal amount for the order. */
    @SerializedName("subtotal")
    Long subtotal;

    /** The tax amount for the order. */
    @SerializedName("tax")
    Long tax;

    /** The total amount for the order. */
    @SerializedName("total")
    Long total;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(latestOrderEvent, responseGetter);
    trySetResponseGetter(totals, responseGetter);
  }
}
