// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Order;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.OrderCancelParams;
import com.stripe.param.OrderCreateParams;
import com.stripe.param.OrderListParams;
import com.stripe.param.OrderReopenParams;
import com.stripe.param.OrderRetrieveParams;
import com.stripe.param.OrderSubmitParams;
import com.stripe.param.OrderUpdateParams;

public final class OrderService extends ApiService {
  public OrderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(OrderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(RequestOptions options) throws StripeException {
    return list((OrderListParams) null, options);
  }
  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list() throws StripeException {
    return list((OrderListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of your orders. The orders are returned sorted by creation date, with the most
   * recently created orders appearing first.
   */
  public StripeCollection<Order> list(OrderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/orders";
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
  /** Creates a new {@code open} order object. */
  public Order create(OrderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code open} order object. */
  public Order create(OrderCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/orders";
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
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public Order retrieve(String id, OrderRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public Order retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (OrderRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public Order retrieve(String id) throws StripeException {
    return retrieve(id, (OrderRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing order. Supply the unique order ID from either an order
   * creation request or the order list, and Stripe will return the corresponding order information.
   */
  public Order retrieve(String id, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(id));
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
  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(String id, OrderUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(String id, RequestOptions options) throws StripeException {
    return update(id, (OrderUpdateParams) null, options);
  }
  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(String id) throws StripeException {
    return update(id, (OrderUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specific order by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Order update(String id, OrderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s", ApiResource.urlEncodeId(id));
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
  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(String id, OrderCancelParams params) throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (OrderCancelParams) null, options);
  }
  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(String id) throws StripeException {
    return cancel(id, (OrderCancelParams) null, (RequestOptions) null);
  }
  /** Cancels the order as well as the payment intent if one is attached. */
  public Order cancel(String id, OrderCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s/cancel", ApiResource.urlEncodeId(id));
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
  /** Reopens a {@code submitted} order. */
  public Order reopen(String id, OrderReopenParams params) throws StripeException {
    return reopen(id, params, (RequestOptions) null);
  }
  /** Reopens a {@code submitted} order. */
  public Order reopen(String id, RequestOptions options) throws StripeException {
    return reopen(id, (OrderReopenParams) null, options);
  }
  /** Reopens a {@code submitted} order. */
  public Order reopen(String id) throws StripeException {
    return reopen(id, (OrderReopenParams) null, (RequestOptions) null);
  }
  /** Reopens a {@code submitted} order. */
  public Order reopen(String id, OrderReopenParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s/reopen", ApiResource.urlEncodeId(id));
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
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(String id, OrderSubmitParams params) throws StripeException {
    return submit(id, params, (RequestOptions) null);
  }
  /**
   * Submitting an Order transitions the status to {@code processing} and creates a PaymentIntent
   * object so the order can be paid. If the Order has an {@code amount_total} of 0, no
   * PaymentIntent object will be created. Once the order is submitted, its contents cannot be
   * changed, unless the <a href="https://stripe.com/docs/api#reopen_order">reopen</a> method is
   * called.
   */
  public Order submit(String id, OrderSubmitParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/orders/%s/submit", ApiResource.urlEncodeId(id));
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

  public com.stripe.service.OrderLineItemService lineItems() {
    return new com.stripe.service.OrderLineItemService(this.getResponseGetter());
  }
}
