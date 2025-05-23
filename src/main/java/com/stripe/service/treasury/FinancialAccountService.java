// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.FinancialAccount;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.FinancialAccountCloseParams;
import com.stripe.param.treasury.FinancialAccountCreateParams;
import com.stripe.param.treasury.FinancialAccountListParams;
import com.stripe.param.treasury.FinancialAccountRetrieveParams;
import com.stripe.param.treasury.FinancialAccountUpdateParams;

public final class FinancialAccountService extends ApiService {
  public FinancialAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of FinancialAccounts. */
  public StripeCollection<FinancialAccount> list(FinancialAccountListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of FinancialAccounts. */
  public StripeCollection<FinancialAccount> list(RequestOptions options) throws StripeException {
    return list((FinancialAccountListParams) null, options);
  }
  /** Returns a list of FinancialAccounts. */
  public StripeCollection<FinancialAccount> list() throws StripeException {
    return list((FinancialAccountListParams) null, (RequestOptions) null);
  }
  /** Returns a list of FinancialAccounts. */
  public StripeCollection<FinancialAccount> list(
      FinancialAccountListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/financial_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FinancialAccount>>() {}.getType());
  }
  /**
   * Creates a new FinancialAccount. Each connected account can have up to three FinancialAccounts
   * by default.
   */
  public FinancialAccount create(FinancialAccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new FinancialAccount. Each connected account can have up to three FinancialAccounts
   * by default.
   */
  public FinancialAccount create(FinancialAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/financial_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
  /** Retrieves the details of a FinancialAccount. */
  public FinancialAccount retrieve(String financialAccount, FinancialAccountRetrieveParams params)
      throws StripeException {
    return retrieve(financialAccount, params, (RequestOptions) null);
  }
  /** Retrieves the details of a FinancialAccount. */
  public FinancialAccount retrieve(String financialAccount, RequestOptions options)
      throws StripeException {
    return retrieve(financialAccount, (FinancialAccountRetrieveParams) null, options);
  }
  /** Retrieves the details of a FinancialAccount. */
  public FinancialAccount retrieve(String financialAccount) throws StripeException {
    return retrieve(financialAccount, (FinancialAccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a FinancialAccount. */
  public FinancialAccount retrieve(
      String financialAccount, FinancialAccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(String financialAccount, FinancialAccountUpdateParams params)
      throws StripeException {
    return update(financialAccount, params, (RequestOptions) null);
  }
  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(String financialAccount, RequestOptions options)
      throws StripeException {
    return update(financialAccount, (FinancialAccountUpdateParams) null, options);
  }
  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(String financialAccount) throws StripeException {
    return update(financialAccount, (FinancialAccountUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(
      String financialAccount, FinancialAccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }
  /**
   * Closes a FinancialAccount. A FinancialAccount can only be closed if it has a zero balance, has
   * no pending InboundTransfers, and has canceled all attached Issuing cards.
   */
  public FinancialAccount close(String financialAccount, FinancialAccountCloseParams params)
      throws StripeException {
    return close(financialAccount, params, (RequestOptions) null);
  }
  /**
   * Closes a FinancialAccount. A FinancialAccount can only be closed if it has a zero balance, has
   * no pending InboundTransfers, and has canceled all attached Issuing cards.
   */
  public FinancialAccount close(String financialAccount, RequestOptions options)
      throws StripeException {
    return close(financialAccount, (FinancialAccountCloseParams) null, options);
  }
  /**
   * Closes a FinancialAccount. A FinancialAccount can only be closed if it has a zero balance, has
   * no pending InboundTransfers, and has canceled all attached Issuing cards.
   */
  public FinancialAccount close(String financialAccount) throws StripeException {
    return close(financialAccount, (FinancialAccountCloseParams) null, (RequestOptions) null);
  }
  /**
   * Closes a FinancialAccount. A FinancialAccount can only be closed if it has a zero balance, has
   * no pending InboundTransfers, and has canceled all attached Issuing cards.
   */
  public FinancialAccount close(
      String financialAccount, FinancialAccountCloseParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/financial_accounts/%s/close", ApiResource.urlEncodeId(financialAccount));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccount.class);
  }

  public com.stripe.service.treasury.FinancialAccountFeaturesService features() {
    return new com.stripe.service.treasury.FinancialAccountFeaturesService(
        this.getResponseGetter());
  }
}
