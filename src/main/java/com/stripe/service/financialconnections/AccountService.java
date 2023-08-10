// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Account;
import com.stripe.model.financialconnections.AccountOwner;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.AccountDisconnectParams;
import com.stripe.param.financialconnections.AccountListOwnersParams;
import com.stripe.param.financialconnections.AccountListParams;
import com.stripe.param.financialconnections.AccountRefreshParams;
import com.stripe.param.financialconnections.AccountRetrieveParams;

public final class AccountService extends ApiService {
  public AccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Financial Connections {@code Account} objects. */
  public StripeCollection<Account> list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Financial Connections {@code Account} objects. */
  public StripeCollection<Account> list(RequestOptions options) throws StripeException {
    return list((AccountListParams) null, options);
  }
  /** Returns a list of Financial Connections {@code Account} objects. */
  public StripeCollection<Account> list() throws StripeException {
    return list((AccountListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Financial Connections {@code Account} objects. */
  public StripeCollection<Account> list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/accounts";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Account>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Retrieves the details of an Financial Connections {@code Account}. */
  public Account retrieve(String account, AccountRetrieveParams params) throws StripeException {
    return retrieve(account, params, (RequestOptions) null);
  }
  /** Retrieves the details of an Financial Connections {@code Account}. */
  public Account retrieve(String account, RequestOptions options) throws StripeException {
    return retrieve(account, (AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an Financial Connections {@code Account}. */
  public Account retrieve(String account) throws StripeException {
    return retrieve(account, (AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an Financial Connections {@code Account}. */
  public Account retrieve(String account, AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/accounts/%s", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Account.class,
            options,
            ApiMode.V1);
  }
  /** Lists all owners for a given {@code Account}. */
  public StripeCollection<AccountOwner> listOwners(String account, AccountListOwnersParams params)
      throws StripeException {
    return listOwners(account, params, (RequestOptions) null);
  }
  /** Lists all owners for a given {@code Account}. */
  public StripeCollection<AccountOwner> listOwners(
      String account, AccountListOwnersParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/owners", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<AccountOwner>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public Account refresh(String account, AccountRefreshParams params) throws StripeException {
    return refresh(account, params, (RequestOptions) null);
  }
  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public Account refresh(String account, AccountRefreshParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/refresh", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Account.class,
            options,
            ApiMode.V1);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String account, AccountDisconnectParams params) throws StripeException {
    return disconnect(account, params, (RequestOptions) null);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String account, RequestOptions options) throws StripeException {
    return disconnect(account, (AccountDisconnectParams) null, options);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String account) throws StripeException {
    return disconnect(account, (AccountDisconnectParams) null, (RequestOptions) null);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String account, AccountDisconnectParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/disconnect", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Account.class,
            options,
            ApiMode.V1);
  }
}
