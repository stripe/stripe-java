// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.SourceTransaction;
import com.stripe.model.StripeCollection;
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
  public StripeCollection<SourceTransaction> list(String id, SourceTransactionListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (SourceTransactionListParams) null, options);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(String id) throws StripeException {
    return list(id, (SourceTransactionListParams) null, (RequestOptions) null);
  }
  /** List source transactions for a given source. */
  public StripeCollection<SourceTransaction> list(
      String id, SourceTransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s/source_transactions", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<SourceTransaction>>() {}.getType());
  }
}
