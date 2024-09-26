// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.CreditBalanceTransaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.CreditBalanceTransactionListParams;
import com.stripe.param.billing.CreditBalanceTransactionRetrieveParams;

public final class CreditBalanceTransactionService extends ApiService {
  public CreditBalanceTransactionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of credit balance transactions. */
  public StripeCollection<CreditBalanceTransaction> list(CreditBalanceTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of credit balance transactions. */
  public StripeCollection<CreditBalanceTransaction> list(
      CreditBalanceTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/credit_balance_transactions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CreditBalanceTransaction>>() {}.getType());
  }
  /** Retrieves a credit balance transaction. */
  public CreditBalanceTransaction retrieve(String id, CreditBalanceTransactionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a credit balance transaction. */
  public CreditBalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (CreditBalanceTransactionRetrieveParams) null, options);
  }
  /** Retrieves a credit balance transaction. */
  public CreditBalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (CreditBalanceTransactionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a credit balance transaction. */
  public CreditBalanceTransaction retrieve(
      String id, CreditBalanceTransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/credit_balance_transactions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CreditBalanceTransaction.class);
  }
}
