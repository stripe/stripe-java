// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountCreateParams;
import com.stripe.param.AccountListParams;
import com.stripe.param.AccountRejectParams;
import com.stripe.param.AccountRetrieveParams;
import com.stripe.param.AccountUpdateParams;

public final class AccountService extends ApiService {
  public AccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the details of an account. */
  public Account retrieve(AccountRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(RequestOptions options) throws StripeException {
    return retrieve((AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an account. */
  public Account retrieve() throws StripeException {
    return retrieve((AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an account. */
  public Account retrieve(AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account";
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
  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For Custom accounts, you can update any information on the account. For other accounts, you
   * can update all information until that account has started to go through Connect Onboarding.
   * Once you create an <a href="https://stripe.com/docs/api/account_links">Account Link</a> for a
   * Standard or Express account, some parameters can no longer be changed. These are marked as
   * <strong>Custom Only</strong> or <strong>Custom and Express</strong> below.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, AccountUpdateParams params) throws StripeException {
    return update(account, params, (RequestOptions) null);
  }
  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For Custom accounts, you can update any information on the account. For other accounts, you
   * can update all information until that account has started to go through Connect Onboarding.
   * Once you create an <a href="https://stripe.com/docs/api/account_links">Account Link</a> for a
   * Standard or Express account, some parameters can no longer be changed. These are marked as
   * <strong>Custom Only</strong> or <strong>Custom and Express</strong> below.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, RequestOptions options) throws StripeException {
    return update(account, (AccountUpdateParams) null, options);
  }
  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For Custom accounts, you can update any information on the account. For other accounts, you
   * can update all information until that account has started to go through Connect Onboarding.
   * Once you create an <a href="https://stripe.com/docs/api/account_links">Account Link</a> for a
   * Standard or Express account, some parameters can no longer be changed. These are marked as
   * <strong>Custom Only</strong> or <strong>Custom and Express</strong> below.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account) throws StripeException {
    return update(account, (AccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a <a href="https://stripe.com/docs/connect/accounts">connected account</a> by setting
   * the values of the parameters passed. Any parameters not provided are left unchanged.
   *
   * <p>For Custom accounts, you can update any information on the account. For other accounts, you
   * can update all information until that account has started to go through Connect Onboarding.
   * Once you create an <a href="https://stripe.com/docs/api/account_links">Account Link</a> for a
   * Standard or Express account, some parameters can no longer be changed. These are marked as
   * <strong>Custom Only</strong> or <strong>Custom and Express</strong> below.
   *
   * <p>To update your own account, use the <a
   * href="https://dashboard.stripe.com/account">Dashboard</a>. Refer to our <a
   * href="https://stripe.com/docs/connect/updating-accounts">Connect</a> documentation to learn
   * more about updating accounts.
   */
  public Account update(String account, AccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
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
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(String account) throws StripeException {
    return delete(account, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you can delete accounts you manage.
   *
   * <p>Accounts created using test-mode keys can be deleted at any time. Standard accounts created
   * using live-mode keys cannot be deleted. Custom or Express accounts created using live-mode keys
   * can only be deleted once all balances are zero.
   *
   * <p>If you want to delete your own account, use the <a
   * href="https://dashboard.stripe.com/account">account information tab in your account
   * settings</a> instead.
   */
  public Account delete(String account, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            null,
            Account.class,
            options,
            ApiMode.V1);
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
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(String account, AccountRejectParams params) throws StripeException {
    return reject(account, params, (RequestOptions) null);
  }
  /**
   * With <a href="https://stripe.com/docs/connect">Connect</a>, you may flag accounts as
   * suspicious.
   *
   * <p>Test-mode Custom and Express accounts can be rejected at any time. Accounts created using
   * live-mode keys may only be rejected once all balances are zero.
   */
  public Account reject(String account, AccountRejectParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/reject", ApiResource.urlEncodeId(account));
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

  public com.stripe.service.CapabilityService capabilities() {
    return new com.stripe.service.CapabilityService(this.getResponseGetter());
  }

  public com.stripe.service.ExternalAccountService externalAccounts() {
    return new com.stripe.service.ExternalAccountService(this.getResponseGetter());
  }

  public com.stripe.service.LoginLinkService loginLinks() {
    return new com.stripe.service.LoginLinkService(this.getResponseGetter());
  }

  public com.stripe.service.PersonService persons() {
    return new com.stripe.service.PersonService(this.getResponseGetter());
  }
}
