// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.Transaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.TransactionListParams;
import com.stripe.param.treasury.TransactionRetrieveParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of Transaction objects. */
  public StripeCollection<Transaction> list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of Transaction objects. */
  public StripeCollection<Transaction> list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Transaction>>() {}.getType());
  }
  /** Retrieves the details of an existing Transaction. */
  public Transaction retrieve(String id, TransactionRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing Transaction. */
  public Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing Transaction. */
  public Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing Transaction. */
  public Transaction retrieve(String id, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
}
