// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.Transaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.TransactionListParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Transactions that match the provided filters. */
  public StripeCollection<Transaction> list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Transactions that match the provided filters. */
  public StripeCollection<Transaction> list(RequestOptions options) throws StripeException {
    return list((TransactionListParams) null, options);
  }
  /** Returns a list of Transactions that match the provided filters. */
  public StripeCollection<Transaction> list() throws StripeException {
    return list((TransactionListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Transactions that match the provided filters. */
  public StripeCollection<Transaction> list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Transaction>>() {}.getType());
  }
  /** Retrieves the details of a Transaction by ID. */
  public Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of a Transaction by ID. */
  public Transaction retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Transaction.class);
  }
}
