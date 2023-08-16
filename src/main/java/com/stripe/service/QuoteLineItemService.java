// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
  public StripeCollection<LineItem> list(String quote, QuoteLineItemListParams params)
      throws StripeException {
    return list(quote, params, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String quote, RequestOptions options)
      throws StripeException {
    return list(quote, (QuoteLineItemListParams) null, options);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String quote) throws StripeException {
    return list(quote, (QuoteLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String quote, QuoteLineItemListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(quote));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<LineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
