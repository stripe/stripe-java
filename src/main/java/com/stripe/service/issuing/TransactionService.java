// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Transaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.TransactionListParams;
import com.stripe.param.issuing.TransactionRetrieveParams;
import com.stripe.param.issuing.TransactionUpdateParams;

public final class TransactionService extends ApiService {
  public TransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Transaction> list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Transaction> list(RequestOptions options) throws StripeException {
    return list((TransactionListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Transaction> list() throws StripeException {
    return list((TransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Transaction> list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Transaction>>() {}.getType());
  }
  /** Retrieves an Issuing {@code Transaction} object. */
  public Transaction retrieve(String id, TransactionRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Transaction} object. */
  public Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Transaction} object. */
  public Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (TransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Transaction} object. */
  public Transaction retrieve(String id, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(String id, TransactionUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(String id, RequestOptions options) throws StripeException {
    return update(id, (TransactionUpdateParams) null, options);
  }
  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(String id) throws StripeException {
    return update(id, (TransactionUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(String id, TransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Transaction.class);
  }
}
