// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.Account;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.AccountCloseParams;
import com.stripe.param.v2.core.AccountCreateParams;
import com.stripe.param.v2.core.AccountListParams;
import com.stripe.param.v2.core.AccountRetrieveParams;
import com.stripe.param.v2.core.AccountUpdateParams;

public final class AccountService extends ApiService {
  public AccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of Accounts. */
  public StripeCollection<Account> list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of Accounts. */
  public StripeCollection<Account> list(RequestOptions options) throws StripeException {
    return list((AccountListParams) null, options);
  }
  /** Returns a list of Accounts. */
  public StripeCollection<Account> list() throws StripeException {
    return list((AccountListParams) null, (RequestOptions) null);
  }
  /** Returns a list of Accounts. */
  public StripeCollection<Account> list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/accounts";
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
   * An Account is a representation of a company, individual or other entity that a user interacts
   * with. Accounts contain identifying information about the entity, and configurations that store
   * the features an account has access to. An account can be configured as any or all of the
   * following configurations: Customer, Merchant and/or Recipient.
   */
  public Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * An Account is a representation of a company, individual or other entity that a user interacts
   * with. Accounts contain identifying information about the entity, and configurations that store
   * the features an account has access to. An account can be configured as any or all of the
   * following configurations: Customer, Merchant and/or Recipient.
   */
  public Account create(RequestOptions options) throws StripeException {
    return create((AccountCreateParams) null, options);
  }
  /**
   * An Account is a representation of a company, individual or other entity that a user interacts
   * with. Accounts contain identifying information about the entity, and configurations that store
   * the features an account has access to. An account can be configured as any or all of the
   * following configurations: Customer, Merchant and/or Recipient.
   */
  public Account create() throws StripeException {
    return create((AccountCreateParams) null, (RequestOptions) null);
  }
  /**
   * An Account is a representation of a company, individual or other entity that a user interacts
   * with. Accounts contain identifying information about the entity, and configurations that store
   * the features an account has access to. An account can be configured as any or all of the
   * following configurations: Customer, Merchant and/or Recipient.
   */
  public Account create(AccountCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/core/accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, AccountRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Updates the details of an Account. */
  public Account update(String id, AccountUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the details of an Account. */
  public Account update(String id, RequestOptions options) throws StripeException {
    return update(id, (AccountUpdateParams) null, options);
  }
  /** Updates the details of an Account. */
  public Account update(String id) throws StripeException {
    return update(id, (AccountUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the details of an Account. */
  public Account update(String id, AccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/accounts/%s", ApiResource.urlEncodeId(id));
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
   * Removes access to the Account and its associated resources. Closed Accounts can no longer be
   * operated on, but limited information can still be retrieved through the API in order to be able
   * to track their history.
   */
  public Account close(String id, AccountCloseParams params) throws StripeException {
    return close(id, params, (RequestOptions) null);
  }
  /**
   * Removes access to the Account and its associated resources. Closed Accounts can no longer be
   * operated on, but limited information can still be retrieved through the API in order to be able
   * to track their history.
   */
  public Account close(String id, RequestOptions options) throws StripeException {
    return close(id, (AccountCloseParams) null, options);
  }
  /**
   * Removes access to the Account and its associated resources. Closed Accounts can no longer be
   * operated on, but limited information can still be retrieved through the API in order to be able
   * to track their history.
   */
  public Account close(String id) throws StripeException {
    return close(id, (AccountCloseParams) null, (RequestOptions) null);
  }
  /**
   * Removes access to the Account and its associated resources. Closed Accounts can no longer be
   * operated on, but limited information can still be retrieved through the API in order to be able
   * to track their history.
   */
  public Account close(String id, AccountCloseParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/accounts/%s/close", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }

  public com.stripe.service.v2.core.accounts.PersonTokenService personTokens() {
    return new com.stripe.service.v2.core.accounts.PersonTokenService(this.getResponseGetter());
  }

  public com.stripe.service.v2.core.accounts.PersonService persons() {
    return new com.stripe.service.v2.core.accounts.PersonService(this.getResponseGetter());
  }
}
