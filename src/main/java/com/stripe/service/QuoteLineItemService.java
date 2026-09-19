// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuoteLineItemListParams;

public final class QuoteLineItemService extends ApiService {
  public QuoteLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id, QuoteLineItemListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id, RequestOptions options) throws StripeException {
    return list(id, (QuoteLineItemListParams) null, options);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String id) throws StripeException {
    return list(id, (QuoteLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String id, QuoteLineItemListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<LineItem>>() {}.getType());
  }
}
