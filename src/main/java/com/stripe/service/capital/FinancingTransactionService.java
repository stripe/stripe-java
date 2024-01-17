// File generated from our OpenAPI spec
package com.stripe.service.capital;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.capital.FinancingTransaction;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingTransactionListParams;
import com.stripe.param.capital.FinancingTransactionRetrieveParams;

public final class FinancingTransactionService extends ApiService {
  public FinancingTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public StripeCollection<FinancingTransaction> list(FinancingTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public StripeCollection<FinancingTransaction> list(RequestOptions options)
      throws StripeException {
    return list((FinancingTransactionListParams) null, options);
  }
  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public StripeCollection<FinancingTransaction> list() throws StripeException {
    return list((FinancingTransactionListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public StripeCollection<FinancingTransaction> list(
      FinancingTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<FinancingTransaction>>() {}.getType());
  }
  /** Retrieves a financing transaction for a financing offer. */
  public FinancingTransaction retrieve(
      String financingTransaction, FinancingTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(financingTransaction, params, (RequestOptions) null);
  }
  /** Retrieves a financing transaction for a financing offer. */
  public FinancingTransaction retrieve(String financingTransaction, RequestOptions options)
      throws StripeException {
    return retrieve(financingTransaction, (FinancingTransactionRetrieveParams) null, options);
  }
  /** Retrieves a financing transaction for a financing offer. */
  public FinancingTransaction retrieve(String financingTransaction) throws StripeException {
    return retrieve(
        financingTransaction, (FinancingTransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a financing transaction for a financing offer. */
  public FinancingTransaction retrieve(
      String financingTransaction,
      FinancingTransactionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_transactions/%s", ApiResource.urlEncodeId(financingTransaction));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, FinancingTransaction.class);
  }
}
