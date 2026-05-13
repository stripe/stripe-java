// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.financialaccounts;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.FinancialAccountStatement;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.financialaccounts.StatementListParams;
import com.stripe.param.v2.moneymanagement.financialaccounts.StatementRetrieveParams;

public final class StatementService extends ApiService {
  public StatementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of statements for a Financial Account. */
  public StripeCollection<FinancialAccountStatement> list(
      String financialAccountId, StatementListParams params) throws StripeException {
    return list(financialAccountId, params, (RequestOptions) null);
  }
  /** Returns a list of statements for a Financial Account. */
  public StripeCollection<FinancialAccountStatement> list(
      String financialAccountId, RequestOptions options) throws StripeException {
    return list(financialAccountId, (StatementListParams) null, options);
  }
  /** Returns a list of statements for a Financial Account. */
  public StripeCollection<FinancialAccountStatement> list(String financialAccountId)
      throws StripeException {
    return list(financialAccountId, (StatementListParams) null, (RequestOptions) null);
  }
  /** Returns a list of statements for a Financial Account. */
  public StripeCollection<FinancialAccountStatement> list(
      String financialAccountId, StatementListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/financial_accounts/%s/statements",
            ApiResource.urlEncodeId(financialAccountId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<FinancialAccountStatement>>() {}.getType());
  }
  /** Retrieves the details of a Financial Account Statement. */
  public FinancialAccountStatement retrieve(
      String financialAccountId, String id, StatementRetrieveParams params) throws StripeException {
    return retrieve(financialAccountId, id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Account Statement. */
  public FinancialAccountStatement retrieve(
      String financialAccountId, String id, RequestOptions options) throws StripeException {
    return retrieve(financialAccountId, id, (StatementRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Account Statement. */
  public FinancialAccountStatement retrieve(String financialAccountId, String id)
      throws StripeException {
    return retrieve(financialAccountId, id, (StatementRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Account Statement. */
  public FinancialAccountStatement retrieve(
      String financialAccountId, String id, StatementRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/financial_accounts/%s/statements/%s",
            ApiResource.urlEncodeId(financialAccountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccountStatement.class);
  }
}
