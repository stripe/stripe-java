// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.OrderLineItemListParams;

public final class OrderLineItemService extends ApiService {
  public OrderLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id, OrderLineItemListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id, RequestOptions options) throws StripeException {
    return list(id, (OrderLineItemListParams) null, options);
  }
  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id) throws StripeException {
    return list(id, (OrderLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving an order, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String id, OrderLineItemListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/orders/%s/line_items", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<LineItem>>() {}.getType());
  }
}
