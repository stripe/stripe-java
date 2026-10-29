// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.FinancialAccount;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.FinancialAccountListParams;
import com.stripe.param.v2.moneymanagement.FinancialAccountRetrieveParams;
import com.stripe.param.v2.moneymanagement.FinancialAccountUpdateParams;

public final class FinancialAccountService extends ApiService {
  public FinancialAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of FinancialAccounts in your account that match the provided filters. */
  public StripeCollection<FinancialAccount> list(FinancialAccountListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of FinancialAccounts in your account that match the provided filters. */
  public StripeCollection<FinancialAccount> list(RequestOptions options) throws StripeException {
    return list((FinancialAccountListParams) null, options);
  }
  /** Returns a list of FinancialAccounts in your account that match the provided filters. */
  public StripeCollection<FinancialAccount> list() throws StripeException {
    return list((FinancialAccountListParams) null, (RequestOptions) null);
  }
  /** Returns a list of FinancialAccounts in your account that match the provided filters. */
  public StripeCollection<FinancialAccount> list(
      FinancialAccountListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/financial_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FinancialAccount>>() {}.getType());
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(String id, FinancialAccountRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FinancialAccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(String id) throws StripeException {
    return retrieve(id, (FinancialAccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(
      String id, FinancialAccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/money_management/financial_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
  /** Updates an existing FinancialAccount using the provided parameters. */
  public FinancialAccount update(String id, FinancialAccountUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an existing FinancialAccount using the provided parameters. */
  public FinancialAccount update(String id, RequestOptions options) throws StripeException {
    return update(id, (FinancialAccountUpdateParams) null, options);
  }
  /** Updates an existing FinancialAccount using the provided parameters. */
  public FinancialAccount update(String id) throws StripeException {
    return update(id, (FinancialAccountUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing FinancialAccount using the provided parameters. */
  public FinancialAccount update(
      String id, FinancialAccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/money_management/financial_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
}
