// File generated from our OpenAPI spec
package com.stripe.service.climate;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.climate.Order;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.climate.OrderCancelParams;
import com.stripe.param.climate.OrderCreateParams;
import com.stripe.param.climate.OrderListParams;
import com.stripe.param.climate.OrderRetrieveParams;
import com.stripe.param.climate.OrderUpdateParams;

public final class OrderService extends ApiService {
  public OrderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(OrderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(RequestOptions options) throws StripeException {
    return list((OrderListParams) null, options);
  }
  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list() throws StripeException {
    return list((OrderListParams) null, (RequestOptions) null);
  }
  /**
   * Lists all Climate order objects. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(OrderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/climate/orders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Order>>() {}.getType());
  }
  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public Order create(OrderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a Climate order object for a given Climate product. The order will be processed
   * immediately after creation and payment will be deducted your Stripe balance.
   */
  public Order create(OrderCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/climate/orders";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Order.class);
  }
  /** Retrieves the details of a Climate order object with the given ID. */
  public Order retrieve(String order, OrderRetrieveParams params) throws StripeException {
    return retrieve(order, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Climate order object with the given ID. */
  public Order retrieve(String order, RequestOptions options) throws StripeException {
    return retrieve(order, (OrderRetrieveParams) null, options);
  }
  /** Retrieves the details of a Climate order object with the given ID. */
  public Order retrieve(String order) throws StripeException {
    return retrieve(order, (OrderRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Climate order object with the given ID. */
  public Order retrieve(String order, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(order));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Order.class);
  }
  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(String order, OrderUpdateParams params) throws StripeException {
    return update(order, params, (RequestOptions) null);
  }
  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(String order, RequestOptions options) throws StripeException {
    return update(order, (OrderUpdateParams) null, options);
  }
  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(String order) throws StripeException {
    return update(order, (OrderUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the specified order by setting the values of the parameters passed. */
  public Order update(String order, OrderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/orders/%s", ApiResource.urlEncodeId(order));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Order.class);
  }
  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(String order, OrderCancelParams params) throws StripeException {
    return cancel(order, params, (RequestOptions) null);
  }
  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(String order, RequestOptions options) throws StripeException {
    return cancel(order, (OrderCancelParams) null, options);
  }
  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(String order) throws StripeException {
    return cancel(order, (OrderCancelParams) null, (RequestOptions) null);
  }
  /**
   * Cancels a Climate order. You can cancel an order within 24 hours of creation. Stripe refunds
   * the reservation {@code amount_subtotal}, but not the {@code amount_fees} for user-triggered
   * cancellations. Frontier might cancel reservations if suppliers fail to deliver. If Frontier
   * cancels the reservation, Stripe provides 90 days advance notice and refunds the {@code
   * amount_total}.
   */
  public Order cancel(String order, OrderCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/climate/orders/%s/cancel", ApiResource.urlEncodeId(order));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Order.class);
  }
}
