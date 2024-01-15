// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.SourceTransaction;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SourceTransactionListParams;

public final class SourceTransactionService extends ApiService {
  public SourceTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(String source, SourceTransactionListParams params)
      throws StripeException {
    return list(source, params, (RequestOptions) null);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(String source, RequestOptions options)
      throws StripeException {
    return list(source, (SourceTransactionListParams) null, options);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(String source) throws StripeException {
    return list(source, (SourceTransactionListParams) null, (RequestOptions) null);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(
      String source, SourceTransactionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/sources/%s/source_transactions", ApiResource.urlEncodeId(source));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<SourceTransaction>>() {}.getType());
  }
}
