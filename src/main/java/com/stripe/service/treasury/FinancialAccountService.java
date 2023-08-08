// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.FinancialAccount;
import com.stripe.model.treasury.FinancialAccountFeatures;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.FinancialAccountCreateParams;
import com.stripe.param.treasury.FinancialAccountListParams;
import com.stripe.param.treasury.FinancialAccountRetrieveFeaturesParams;
import com.stripe.param.treasury.FinancialAccountRetrieveParams;
import com.stripe.param.treasury.FinancialAccountUpdateFeaturesParams;
import com.stripe.param.treasury.FinancialAccountUpdateParams;

public final class FinancialAccountService extends ApiService {
  public FinancialAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public FinancialAccount create(FinancialAccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public FinancialAccount create(FinancialAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String url = "/v1/treasury/financial_accounts";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            FinancialAccount.class,
            options,
            ApiMode.V1);
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
    String url = "/v1/treasury/financial_accounts";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<FinancialAccount>>() {}.getType(),
            options,
            ApiMode.V1);
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
    String url =
        String.format(
            "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            FinancialAccount.class,
            options,
            ApiMode.V1);
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
    String url =
        String.format(
            "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            FinancialAccount.class,
            options,
            ApiMode.V1);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(
      String financialAccount, FinancialAccountUpdateFeaturesParams params) throws StripeException {
    return updateFeatures(financialAccount, params, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(String financialAccount, RequestOptions options)
      throws StripeException {
    return updateFeatures(financialAccount, (FinancialAccountUpdateFeaturesParams) null, options);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(String financialAccount) throws StripeException {
    return updateFeatures(
        financialAccount, (FinancialAccountUpdateFeaturesParams) null, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(
      String financialAccount, FinancialAccountUpdateFeaturesParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "/v1/treasury/financial_accounts/%s/features",
            ApiResource.urlEncodeId(financialAccount));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            FinancialAccountFeatures.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(
      String financialAccount, FinancialAccountRetrieveFeaturesParams params)
      throws StripeException {
    return retrieveFeatures(financialAccount, params, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(String financialAccount, RequestOptions options)
      throws StripeException {
    return retrieveFeatures(
        financialAccount, (FinancialAccountRetrieveFeaturesParams) null, options);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(String financialAccount) throws StripeException {
    return retrieveFeatures(
        financialAccount, (FinancialAccountRetrieveFeaturesParams) null, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(
      String financialAccount,
      FinancialAccountRetrieveFeaturesParams params,
      RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "/v1/treasury/financial_accounts/%s/features",
            ApiResource.urlEncodeId(financialAccount));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            FinancialAccountFeatures.class,
            options,
            ApiMode.V1);
  }
}
