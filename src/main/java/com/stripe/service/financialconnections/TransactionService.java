// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Transaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.TransactionListParams;
import com.stripe.param.financialconnections.TransactionRetrieveParams;

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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Transaction>>() {}.getType());
  }
  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public Transaction retrieve(String transaction, TransactionRetrieveParams params)
      throws StripeException {
    return retrieve(transaction, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public Transaction retrieve(String transaction, RequestOptions options) throws StripeException {
    return retrieve(transaction, (TransactionRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (TransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/transactions/%s", ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Transaction.class);
  }
}
