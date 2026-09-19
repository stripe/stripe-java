// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ExternalAccount;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountExternalAccountCreateParams;
import com.stripe.param.AccountExternalAccountListParams;
import com.stripe.param.AccountExternalAccountRetrieveParams;
import com.stripe.param.AccountExternalAccountUpdateParams;

public final class AccountExternalAccountService extends ApiService {
  public AccountExternalAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Delete a specified external account for a given account. */
  public ExternalAccount delete(String accountId, String id) throws StripeException {
    return delete(accountId, id, (RequestOptions) null);
  }
  /** Delete a specified external account for a given account. */
  public ExternalAccount delete(String accountId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, ExternalAccount.class);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String accountId, String id, AccountExternalAccountRetrieveParams params)
      throws StripeException {
    return retrieve(accountId, id, params, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String accountId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(accountId, id, (AccountExternalAccountRetrieveParams) null, options);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String accountId, String id) throws StripeException {
    return retrieve(
        accountId, id, (AccountExternalAccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String accountId,
      String id,
      AccountExternalAccountRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ExternalAccount.class);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.
   *
   * <p>You can only update bank accounts when <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code application}, which includes <a
   * href="https://stripe.com/connect/custom-accounts">Custom accounts</a>.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(
      String accountId, String id, AccountExternalAccountUpdateParams params)
      throws StripeException {
    return update(accountId, id, params, (RequestOptions) null);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.
   *
   * <p>You can only update bank accounts when <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code application}, which includes <a
   * href="https://stripe.com/connect/custom-accounts">Custom accounts</a>.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(String accountId, String id, RequestOptions options)
      throws StripeException {
    return update(accountId, id, (AccountExternalAccountUpdateParams) null, options);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.
   *
   * <p>You can only update bank accounts when <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code application}, which includes <a
   * href="https://stripe.com/connect/custom-accounts">Custom accounts</a>.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(String accountId, String id) throws StripeException {
    return update(accountId, id, (AccountExternalAccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.
   *
   * <p>You can only update bank accounts when <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collection</a>
   * is {@code application}, which includes <a
   * href="https://stripe.com/connect/custom-accounts">Custom accounts</a>.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(
      String accountId,
      String id,
      AccountExternalAccountUpdateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ExternalAccount.class);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String id, AccountExternalAccountListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (AccountExternalAccountListParams) null, options);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String id) throws StripeException {
    return list(id, (AccountExternalAccountListParams) null, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(
      String id, AccountExternalAccountListParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ExternalAccount>>() {}.getType());
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(String id, AccountExternalAccountCreateParams params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(
      String id, AccountExternalAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ExternalAccount.class);
  }
}
