// File generated from our OpenAPI spec
package com.stripe.model.climate;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.climate.OrderCancelParams;
import com.stripe.param.climate.OrderCreateParams;
import com.stripe.param.climate.OrderListParams;
import com.stripe.param.climate.OrderRetrieveParams;
import com.stripe.param.climate.OrderUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Orders represent your intent to purchase a particular Climate product. When you create an order,
 * the payment is deducted from your merchant balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Order extends ApiResource implements HasId, MetadataStore<Order> {
  /**
   * Total amount of <a href="https://frontierclimate.com/">Frontier</a>'s service fees in the
   * currency's smallest unit.
   */
  @SerializedName("amount_fees")
  Long amountFees;

  /** Total amount of the carbon removal in the currency's smallest unit. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total amount of the order including fees in the currency's smallest unit. */
  @SerializedName("amount_total")
  Long amountTotal;

  @SerializedName("beneficiary")
  Beneficiary beneficiary;

  /** Time at which the order was canceled. Measured in seconds since the Unix epoch. */
  @SerializedName("canceled_at")
  Long canceledAt;

  /**
   * Reason for the cancellation of this order.
   *
   * <p>One of {@code expired}, {@code product_unavailable}, or {@code requested}.
   */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /** For delivered orders, a URL to a delivery certificate for the order. */
  @SerializedName("certificate")
  String certificate;

  /** Time at which the order was confirmed. Measured in seconds since the Unix epoch. */
  @SerializedName("confirmed_at")
  Long confirmedAt;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase, representing the currency for this order.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Time at which the order's expected_delivery_year was delayed. Measured in seconds since the
   * Unix epoch.
   */
  @SerializedName("delayed_at")
  Long delayedAt;

  /** Time at which the order was delivered. Measured in seconds since the Unix epoch. */
  @SerializedName("delivered_at")
  Long deliveredAt;

  /** Details about the delivery of carbon removal for this order. */
  @SerializedName("delivery_details")
  List<Order.DeliveryDetail> deliveryDetails;

  /** The year this order is expected to be delivered. */
  @SerializedName("expected_delivery_year")
  Long expectedDeliveryYear;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Quantity of carbon removal that is included in this order. */
  @SerializedName("metric_tons")
  BigDecimal metricTons;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code climate.order}.
   */
  @SerializedName("object")
  String object;

  /** Unique ID for the Climate {@code Product} this order is purchasing. */
  @SerializedName("product")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Product> product;

  /**
   * Time at which the order's product was substituted for a different product. Measured in seconds
   * since the Unix epoch.
   */
  @SerializedName("product_substituted_at")
  Long productSubstitutedAt;

  /**
   * The current status of this order.
   *
   * <p>One of {@code awaiting_funds}, {@code canceled}, {@code confirmed}, {@code delivered}, or
   * {@code open}.
   */
  @SerializedName("status")
  String status;

  /** Get ID of expandable {@code product} object. */
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String id) {
    this.product = ApiResource.setExpandableFieldId(id, this.product);
  }

  /** Get expanded {@code product}. */
  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product expandableObject) {
    this.product = new ExpandableField<Product>(expandableObject.getId(), expandableObject);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/climate/orders/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(OrderCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(OrderCancelParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/climate/orders/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public static Order create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public static Order create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/orders";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public static Order create(OrderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public static Order create(OrderCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/orders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/orders";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OrderCollection.class);
  }

  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(OrderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public static OrderCollection list(OrderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/orders";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OrderCollection.class);
  }

  /** Retrieves the details of a Climate order object with the given ID. */
  public static Order retrieve(String order) throws StripeException {
    return retrieve(order, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Climate order object with the given ID. */
  public static Order retrieve(String order, RequestOptions options) throws StripeException {
    return retrieve(order, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Climate order object with the given ID. */
  public static Order retrieve(String order, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(order));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Order.class);
  }

  /** Retrieves the details of a Climate order object with the given ID. */
  public static Order retrieve(String order, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(order));
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

  /** Updates the specified order by setting the values of the parameters passed. */
  @Override
  public Order update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the specified order by setting the values of the parameters passed. */
  @Override
  public Order update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Order.class);
  }

  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(OrderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(OrderUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Order.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Beneficiary extends StripeObject {
    /** Publicly displayable name for the end beneficiary of carbon removal. */
    @SerializedName("public_name")
    String publicName;
  }

  /** The delivery of a specified quantity of carbon for an order. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryDetail extends StripeObject {
    /** Time at which the delivery occurred. Measured in seconds since the Unix epoch. */
    @SerializedName("delivered_at")
    Long deliveredAt;

    /** Specific location of this delivery. */
    @SerializedName("location")
    Location location;

    /** Quantity of carbon removal supplied by this delivery. */
    @SerializedName("metric_tons")
    String metricTons;

    /** Once retired, a URL to the registry entry for the tons from this delivery. */
    @SerializedName("registry_url")
    String registryUrl;

    /** A supplier of carbon removal. */
    @SerializedName("supplier")
    Supplier supplier;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Location extends StripeObject {
      /** The city where the supplier is located. */
      @SerializedName("city")
      String city;

      /** Two-letter ISO code representing the country where the supplier is located. */
      @SerializedName("country")
      String country;

      /** The geographic latitude where the supplier is located. */
      @SerializedName("latitude")
      BigDecimal latitude;

      /** The geographic longitude where the supplier is located. */
      @SerializedName("longitude")
      BigDecimal longitude;

      /** The state/county/province/region where the supplier is located. */
      @SerializedName("region")
      String region;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(beneficiary, responseGetter);
    trySetResponseGetter(product, responseGetter);
  }
}
