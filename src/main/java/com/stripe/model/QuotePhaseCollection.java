// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
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
    String path = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            QuotePhaseCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(QuotePhaseCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of quote phases. */
  public QuotePhaseCollection list(QuotePhaseCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            QuotePhaseCollection.class,
            options,
            ApiMode.V1);
  }
}
