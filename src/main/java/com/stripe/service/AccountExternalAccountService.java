// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ExternalAccount;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
  public ExternalAccount delete(String account, String id) throws StripeException {
    return delete(account, id, (RequestOptions) null);
  }
  /** Delete a specified external account for a given account. */
  public ExternalAccount delete(String account, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, ExternalAccount.class);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String account, String id, AccountExternalAccountRetrieveParams params)
      throws StripeException {
    return retrieve(account, id, params, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String account, String id, RequestOptions options)
      throws StripeException {
    return retrieve(account, id, (AccountExternalAccountRetrieveParams) null, options);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String account, String id) throws StripeException {
    return retrieve(
        account, id, (AccountExternalAccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String account,
      String id,
      AccountExternalAccountRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ExternalAccount.class);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and optionally
   * sets it as the default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(
      String account, String id, AccountExternalAccountUpdateParams params) throws StripeException {
    return update(account, id, params, (RequestOptions) null);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and optionally
   * sets it as the default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(String account, String id, RequestOptions options)
      throws StripeException {
    return update(account, id, (AccountExternalAccountUpdateParams) null, options);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and optionally
   * sets it as the default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(String account, String id) throws StripeException {
    return update(account, id, (AccountExternalAccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and optionally
   * sets it as the default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(
      String account, String id, AccountExternalAccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ExternalAccount.class);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(
      String account, AccountExternalAccountListParams params) throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String account, RequestOptions options)
      throws StripeException {
    return list(account, (AccountExternalAccountListParams) null, options);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String account) throws StripeException {
    return list(account, (AccountExternalAccountListParams) null, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(
      String account, AccountExternalAccountListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<ExternalAccount>>() {}.getType());
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(String account, AccountExternalAccountCreateParams params)
      throws StripeException {
    return create(account, params, (RequestOptions) null);
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(
      String account, AccountExternalAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ExternalAccount.class);
  }
}
