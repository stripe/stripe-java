// File generated from our OpenAPI spec
package com.stripe.service.delegatedcheckout;

import com.stripe.exception.StripeException;
import com.stripe.model.delegatedcheckout.Order;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.OrderRetrieveParams;

public final class OrderService extends ApiService {
  public OrderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a delegated checkout order. */
  public Order retrieve(String orderId, OrderRetrieveParams params) throws StripeException {
    return retrieve(orderId, params, (RequestOptions) null);
  }
  /** Retrieves a delegated checkout order. */
  public Order retrieve(String orderId, RequestOptions options) throws StripeException {
    return retrieve(orderId, (OrderRetrieveParams) null, options);
  }
  /** Retrieves a delegated checkout order. */
  public Order retrieve(String orderId) throws StripeException {
    return retrieve(orderId, (OrderRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a delegated checkout order. */
  public Order retrieve(String orderId, OrderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/delegated_checkout/orders/%s", ApiResource.urlEncodeId(orderId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Order.class);
  }
}
