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
import com.stripe.param.QuoteComputedUpfrontLineItemsListParams;

public final class QuoteComputedUpfrontLineItemsService extends ApiService {
  public QuoteComputedUpfrontLineItemsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public StripeCollection<LineItem> list(
      String quote, QuoteComputedUpfrontLineItemsListParams params) throws StripeException {
    return list(quote, params, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public StripeCollection<LineItem> list(String quote, RequestOptions options)
      throws StripeException {
    return list(quote, (QuoteComputedUpfrontLineItemsListParams) null, options);
  }
  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public StripeCollection<LineItem> list(String quote) throws StripeException {
    return list(quote, (QuoteComputedUpfrontLineItemsListParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public StripeCollection<LineItem> list(
      String quote, QuoteComputedUpfrontLineItemsListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/quotes/%s/computed_upfront_line_items", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<LineItem>>() {}.getType());
  }
}
