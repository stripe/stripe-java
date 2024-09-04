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
import com.stripe.param.QuotePhaseLineItemListParams;

public final class QuotePhaseLineItemService extends ApiService {
  public QuotePhaseLineItemService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String quotePhase, QuotePhaseLineItemListParams params)
      throws StripeException {
    return list(quotePhase, params, (RequestOptions) null);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String quotePhase, RequestOptions options)
      throws StripeException {
    return list(quotePhase, (QuotePhaseLineItemListParams) null, options);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(String quotePhase) throws StripeException {
    return list(quotePhase, (QuotePhaseLineItemListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> list(
      String quotePhase, QuotePhaseLineItemListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/quote_phases/%s/line_items", ApiResource.urlEncodeId(quotePhase));
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
