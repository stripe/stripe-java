// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Transaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.TransactionListParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public StripeCollection<Transaction> list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public StripeCollection<Transaction> list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/transactions";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Transaction>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
