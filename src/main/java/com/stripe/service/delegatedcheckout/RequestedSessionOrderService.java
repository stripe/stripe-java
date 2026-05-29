// File generated from our OpenAPI spec
package com.stripe.service.delegatedcheckout;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.delegatedcheckout.Order;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.RequestedSessionOrderListParams;

public final class RequestedSessionOrderService extends ApiService {
  public RequestedSessionOrderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists orders for a delegated checkout requested session. */
  public StripeCollection<Order> list(
      String requestedSession, RequestedSessionOrderListParams params) throws StripeException {
    return list(requestedSession, params, (RequestOptions) null);
  }
  /** Lists orders for a delegated checkout requested session. */
  public StripeCollection<Order> list(String requestedSession, RequestOptions options)
      throws StripeException {
    return list(requestedSession, (RequestedSessionOrderListParams) null, options);
  }
  /** Lists orders for a delegated checkout requested session. */
  public StripeCollection<Order> list(String requestedSession) throws StripeException {
    return list(requestedSession, (RequestedSessionOrderListParams) null, (RequestOptions) null);
  }
  /** Lists orders for a delegated checkout requested session. */
  public StripeCollection<Order> list(
      String requestedSession, RequestedSessionOrderListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/orders",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Order>>() {}.getType());
  }
}
