// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Account;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.AccountDisconnectParams;
import com.stripe.param.financialconnections.AccountListParams;
import com.stripe.param.financialconnections.AccountRefreshParams;
import com.stripe.param.financialconnections.AccountRetrieveParams;
import com.stripe.param.financialconnections.AccountSubscribeParams;
import com.stripe.param.financialconnections.AccountUnsubscribeParams;

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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Account>>() {}.getType());
  }
  /** Retrieves the details of a Financial Connections {@code Account}. */
  public Account retrieve(String id, AccountRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Account}. */
  public Account retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Account}. */
  public Account retrieve(String id) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Account}. */
  public Account retrieve(String id, AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String id, AccountDisconnectParams params) throws StripeException {
    return disconnect(id, params, (RequestOptions) null);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String id, RequestOptions options) throws StripeException {
    return disconnect(id, (AccountDisconnectParams) null, options);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String id) throws StripeException {
    return disconnect(id, (AccountDisconnectParams) null, (RequestOptions) null);
  }
  /**
   * Disables your access to a Financial Connections {@code Account}. You will no longer be able to
   * access data associated with the account (e.g. balances, transactions).
   */
  public Account disconnect(String id, AccountDisconnectParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/disconnect", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public Account refresh(String id, AccountRefreshParams params) throws StripeException {
    return refresh(id, params, (RequestOptions) null);
  }
  /** Refreshes the data associated with a Financial Connections {@code Account}. */
  public Account refresh(String id, AccountRefreshParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/accounts/%s/refresh", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}. When the account status is active, data is typically refreshed once a day.
   */
  public Account subscribe(String id, AccountSubscribeParams params) throws StripeException {
    return subscribe(id, params, (RequestOptions) null);
  }
  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}. When the account status is active, data is typically refreshed once a day.
   */
  public Account subscribe(String id, AccountSubscribeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/subscribe", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account unsubscribe(String id, AccountUnsubscribeParams params) throws StripeException {
    return unsubscribe(id, params, (RequestOptions) null);
  }
  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account unsubscribe(String id, AccountUnsubscribeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/unsubscribe", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }

  public com.stripe.service.financialconnections.AccountInferredBalanceService inferredBalances() {
    return new com.stripe.service.financialconnections.AccountInferredBalanceService(
        this.getResponseGetter());
  }

  public com.stripe.service.financialconnections.AccountOwnerService owners() {
    return new com.stripe.service.financialconnections.AccountOwnerService(
        this.getResponseGetter());
  }
}
