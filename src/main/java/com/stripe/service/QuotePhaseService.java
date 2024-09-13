// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.QuotePhase;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuotePhaseListLineItemsParams;
import com.stripe.param.QuotePhaseRetrieveParams;

public final class QuotePhaseService extends ApiService {
  public QuotePhaseService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase, QuotePhaseRetrieveParams params)
      throws StripeException {
    return retrieve(quotePhase, params, (RequestOptions) null);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase, RequestOptions options) throws StripeException {
    return retrieve(quotePhase, (QuotePhaseRetrieveParams) null, options);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(String quotePhase) throws StripeException {
    return retrieve(quotePhase, (QuotePhaseRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the quote phase with the given ID. */
  public QuotePhase retrieve(
      String quotePhase, QuotePhaseRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quote_phases/%s", ApiResource.urlEncodeId(quotePhase));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, QuotePhase.class);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(
      String quotePhase, QuotePhaseListLineItemsParams params) throws StripeException {
    return listLineItems(quotePhase, params, (RequestOptions) null);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(String quotePhase, RequestOptions options)
      throws StripeException {
    return listLineItems(quotePhase, (QuotePhaseListLineItemsParams) null, options);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(String quotePhase) throws StripeException {
    return listLineItems(quotePhase, (QuotePhaseListLineItemsParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a quote phase, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(
      String quotePhase, QuotePhaseListLineItemsParams params, RequestOptions options)
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
