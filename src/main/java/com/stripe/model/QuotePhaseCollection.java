// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.QuotePhaseCollectionListParams;
import java.util.Map;

public class QuotePhaseCollection extends StripeCollection<QuotePhase> {
  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuotePhaseCollection.class, options);
  }

  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(QuotePhaseCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(QuotePhaseCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuotePhaseCollection.class, options);
  }
}
