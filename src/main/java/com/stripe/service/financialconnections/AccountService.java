// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.financialconnections.Account;
import com.stripe.net.ApiMode;
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
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Account>>() {}.getType());
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Account.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Account.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Account.class);
  }
  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account subscribe(String account, AccountSubscribeParams params) throws StripeException {
    return subscribe(account, params, (RequestOptions) null);
  }
  /**
   * Subscribes to periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account subscribe(String account, AccountSubscribeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/subscribe", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Account.class);
  }
  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account unsubscribe(String account, AccountUnsubscribeParams params)
      throws StripeException {
    return unsubscribe(account, params, (RequestOptions) null);
  }
  /**
   * Unsubscribes from periodic refreshes of data associated with a Financial Connections {@code
   * Account}.
   */
  public Account unsubscribe(
      String account, AccountUnsubscribeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/unsubscribe", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, Account.class);
  }

  public com.stripe.service.financialconnections.AccountOwnerService owners() {
    return new com.stripe.service.financialconnections.AccountOwnerService(
        this.getResponseGetter());
  }
}
