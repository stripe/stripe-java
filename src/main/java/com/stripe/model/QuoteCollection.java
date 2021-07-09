// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.QuoteCollectionListParams;
import java.util.Map;

public class QuoteCollection extends StripeCollection<Quote> {
  /**
   * When retrieving a quote, there is an includable <strong>upfront.line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of upfront line items.
   */
  public LineItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <strong>upfront.line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of upfront line items.
   */
  public LineItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /**
   * When retrieving a quote, there is an includable <strong>upfront.line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of upfront line items.
   */
  public LineItemCollection list(QuoteCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <strong>upfront.line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of upfront line items.
   */
  public LineItemCollection list(QuoteCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }
}
