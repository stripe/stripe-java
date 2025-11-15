// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyExistsException;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.NonZeroBalanceException;
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
import com.stripe.param.v2.moneymanagement.FinancialAccountCloseParams;
import com.stripe.param.v2.moneymanagement.FinancialAccountCreateParams;
import com.stripe.param.v2.moneymanagement.FinancialAccountListParams;
import com.stripe.param.v2.moneymanagement.FinancialAccountUpdateParams;

public final class FinancialAccountService extends ApiService {
  public FinancialAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists FinancialAccounts in this compartment. */
  public StripeCollection<FinancialAccount> list(FinancialAccountListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists FinancialAccounts in this compartment. */
  public StripeCollection<FinancialAccount> list(RequestOptions options) throws StripeException {
    return list((FinancialAccountListParams) null, options);
  }
  /** Lists FinancialAccounts in this compartment. */
  public StripeCollection<FinancialAccount> list() throws StripeException {
    return list((FinancialAccountListParams) null, (RequestOptions) null);
  }
  /** Lists FinancialAccounts in this compartment. */
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
  /** Creates a new FinancialAccount. */
  public FinancialAccount create(FinancialAccountCreateParams params)
      throws StripeException, AlreadyExistsException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new FinancialAccount. */
  public FinancialAccount create(FinancialAccountCreateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException, FeatureNotEnabledException {
    String path = "/v2/money_management/financial_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing FinancialAccount. */
  public FinancialAccount retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/financial_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, FinancialAccount.class);
  }
  /** Updates an existing FinancialAccount. */
  public FinancialAccount update(String id, FinancialAccountUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an existing FinancialAccount. */
  public FinancialAccount update(String id, RequestOptions options) throws StripeException {
    return update(id, (FinancialAccountUpdateParams) null, options);
  }
  /** Updates an existing FinancialAccount. */
  public FinancialAccount update(String id) throws StripeException {
    return update(id, (FinancialAccountUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing FinancialAccount. */
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
  /** Closes a FinancialAccount with or without forwarding settings. */
  public FinancialAccount close(String id, FinancialAccountCloseParams params)
      throws StripeException, NonZeroBalanceException {
    return close(id, params, (RequestOptions) null);
  }
  /** Closes a FinancialAccount with or without forwarding settings. */
  public FinancialAccount close(String id, RequestOptions options)
      throws StripeException, NonZeroBalanceException {
    return close(id, (FinancialAccountCloseParams) null, options);
  }
  /** Closes a FinancialAccount with or without forwarding settings. */
  public FinancialAccount close(String id) throws StripeException, NonZeroBalanceException {
    return close(id, (FinancialAccountCloseParams) null, (RequestOptions) null);
  }
  /** Closes a FinancialAccount with or without forwarding settings. */
  public FinancialAccount close(
      String id, FinancialAccountCloseParams params, RequestOptions options)
      throws StripeException, NonZeroBalanceException {
    String path =
        String.format(
            "/v2/money_management/financial_accounts/%s/close", ApiResource.urlEncodeId(id));
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
