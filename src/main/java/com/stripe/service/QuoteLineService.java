// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.QuoteLine;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuoteLineListParams;

public final class QuoteLineService extends ApiService {
  public QuoteLineService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public StripeCollection<QuoteLine> list(String quote, QuoteLineListParams params)
      throws StripeException {
    return list(quote, params, (RequestOptions) null);
  }
  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public StripeCollection<QuoteLine> list(String quote, RequestOptions options)
      throws StripeException {
    return list(quote, (QuoteLineListParams) null, options);
  }
  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public StripeCollection<QuoteLine> list(String quote) throws StripeException {
    return list(quote, (QuoteLineListParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public StripeCollection<QuoteLine> list(
      String quote, QuoteLineListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/lines", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<QuoteLine>>() {}.getType());
  }
}
