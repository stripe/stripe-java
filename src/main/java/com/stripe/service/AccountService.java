// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountCreateParams;
import com.stripe.param.AccountListParams;
import com.stripe.param.AccountRejectParams;
import com.stripe.param.AccountRetrieveCurrentParams;
import com.stripe.param.AccountRetrieveParams;
import com.stripe.param.AccountUpdateParams;

public final class AccountService extends ApiService {
  public AccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts where Stripe is responsible for negative account balances cannot be
   * deleted, which includes Standard accounts. Live-mode accounts where your platform is liable for
   * negative account balances, which includes Custom and Express accounts, can be deleted when all
   * <a href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(String account) throws StripeException {
    return delete(account, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Test-mode accounts can be deleted at any time.
   *
   * <p>Live-mode accounts where Stripe is responsible for negative account balances cannot be
   * deleted, which includes Standard accounts. Live-mode accounts where your platform is liable for
   * negative account balances, which includes Custom and Express accounts, can be deleted when all
   * <a href="https://stripe.com/api/balance/balance_object">balances</a> are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(String account, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Account.class);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(String account, AccountRetrieveParams params) throws StripeException {
    return retrieve(account, params, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(String account, RequestOptions options) throws StripeException {
    return retrieve(account, (AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(String account) throws StripeException {
    return retrieve(account, (AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(String account, AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
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
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, AccountUpdateParams params) throws StripeException {
    return update(account, params, (RequestOptions) null);
  }
  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, RequestOptions options) throws StripeException {
    return update(account, (AccountUpdateParams) null, options);
  }
  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account) throws StripeException {
    return update(account, (AccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a <a href="https://stripe.com/connect/accounts">connected account</a> by setting the
   * values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts, you can update any information on the
   * account.
   *
   * <p>For accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code stripe}, which includes Standard and Express accounts, you can update all information
   * until you create an <a href="https://stripe.com/api/account_links">Account Link</a> or <a
   * href="https://stripe.com/api/account_sessions">Account Session</a> to start Connect onboarding,
   * after which some properties can no longer be updated.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/settings/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, AccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Retrieves the details of an account. */
  public Account retrieveCurrent(AccountRetrieveCurrentParams params) throws StripeException {
    return retrieveCurrent(params, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieveCurrent(RequestOptions options) throws StripeException {
    return retrieveCurrent((AccountRetrieveCurrentParams) null, options);
  }
  /** Retrieves the details of an account. */
  public Account retrieveCurrent() throws StripeException {
    return retrieveCurrent((AccountRetrieveCurrentParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieveCurrent(AccountRetrieveCurrentParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account";
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
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public StripeCollection<Account> list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public StripeCollection<Account> list(RequestOptions options) throws StripeException {
    return list((AccountListParams) null, options);
  }
  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public StripeCollection<Account> list() throws StripeException {
    return list((AccountListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of accounts connected to your platform via <a
   * href="https://stripe.com/docs/connect">Connect</a>. If you’re not a platform, the list is
   * empty.
   */
  public StripeCollection<Account> list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Account>>() {}.getType());
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public Account create(RequestOptions options) throws StripeException {
    return create((AccountCreateParams) null, options);
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public Account create() throws StripeException {
    return create((AccountCreateParams) null, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can create Stripe accounts for
   * your users. To do this, you’ll first need to <a
   * href="https://dashboard.stripe.com/account/applications/settings">register your platform</a>.
   *
   * <p>If you’ve already collected information for your connected accounts, you <a
   * href="https://stripe.com/docs/connect/best-practices#onboarding">can prefill that
   * information</a> when creating the account. Connect Onboarding won’t ask for the prefilled
   * information during account onboarding. You can prefill any information on the account.
   */
  public Account create(AccountCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/accounts";
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
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(String account, AccountRejectParams params) throws StripeException {
    return reject(account, params, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/connect">Connect</a>, you can reject accounts that you have
   * flagged as suspicious.
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes
   * Custom and Express accounts, can be rejected. Test-mode accounts can be rejected at any time.
   * Live-mode accounts can only be rejected after all balances are zero.
   */
  public Account reject(String account, AccountRejectParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }

  public com.stripe.service.AccountCapabilityService capabilities() {
    return new com.stripe.service.AccountCapabilityService(this.getResponseGetter());
  }

  public com.stripe.service.AccountExternalAccountService externalAccounts() {
    return new com.stripe.service.AccountExternalAccountService(this.getResponseGetter());
  }

  public com.stripe.service.AccountLoginLinkService loginLinks() {
    return new com.stripe.service.AccountLoginLinkService(this.getResponseGetter());
  }

  public com.stripe.service.AccountPersonService persons() {
    return new com.stripe.service.AccountPersonService(this.getResponseGetter());
  }
}
