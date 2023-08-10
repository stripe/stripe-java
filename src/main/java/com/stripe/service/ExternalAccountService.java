// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ExternalAccount;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ExternalAccountCreateParams;
import com.stripe.param.ExternalAccountListParams;
import com.stripe.param.ExternalAccountRetrieveParams;
import com.stripe.param.ExternalAccountUpdateParams;

public final class ExternalAccountService extends ApiService {
  public ExternalAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String account, ExternalAccountListParams params)
      throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String account, RequestOptions options)
      throws StripeException {
    return list(account, (ExternalAccountListParams) null, options);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(String account) throws StripeException {
    return list(account, (ExternalAccountListParams) null, (RequestOptions) null);
  }
  /** List external accounts for an account. */
  public StripeCollection<ExternalAccount> list(
      String account, ExternalAccountListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<ExternalAccount>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(String account, ExternalAccountCreateParams params)
      throws StripeException {
    return create(account, params, (RequestOptions) null);
  }
  /** Create an external account for a given account. */
  public ExternalAccount create(
      String account, ExternalAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/accounts/%s/external_accounts", ApiResource.urlEncodeId(account));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String account, String id, ExternalAccountRetrieveParams params)
      throws StripeException {
    return retrieve(account, id, params, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String account, String id, RequestOptions options)
      throws StripeException {
    return retrieve(account, id, (ExternalAccountRetrieveParams) null, options);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String account, String id) throws StripeException {
    return retrieve(account, id, (ExternalAccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String account, String id, ExternalAccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates the metadata, account holder name, account holder type of a bank account belonging to a
   * <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and optionally
   * sets it as the default for its currency. Other bank account details are not editable by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   */
  public ExternalAccount update(String account, String id, ExternalAccountUpdateParams params)
      throws StripeException {
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
    return update(account, id, (ExternalAccountUpdateParams) null, options);
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
    return update(account, id, (ExternalAccountUpdateParams) null, (RequestOptions) null);
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
      String account, String id, ExternalAccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/external_accounts/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            ExternalAccount.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            null,
            ExternalAccount.class,
            options,
            ApiMode.V1);
  }
}
