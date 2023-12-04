// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceTransactionListParams;
import com.stripe.param.BalanceTransactionRetrieveParams;

public final class BalanceTransactionService extends ApiService {
  public BalanceTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public StripeCollection<BalanceTransaction> list(BalanceTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public StripeCollection<BalanceTransaction> list(RequestOptions options) throws StripeException {
    return list((BalanceTransactionListParams) null, options);
  }
  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public StripeCollection<BalanceTransaction> list() throws StripeException {
    return list((BalanceTransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public StripeCollection<BalanceTransaction> list(
      BalanceTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/balance_transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<BalanceTransaction>>() {}.getType());
  }
  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public BalanceTransaction retrieve(String id, BalanceTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public BalanceTransaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (BalanceTransactionRetrieveParams) null, options);
  }
  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public BalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (BalanceTransactionRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public BalanceTransaction retrieve(
      String id, BalanceTransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/balance_transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, BalanceTransaction.class);
  }
}
