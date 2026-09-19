// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.FinancialAccountFeatures;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.FinancialAccountFeaturesRetrieveParams;
import com.stripe.param.treasury.FinancialAccountFeaturesUpdateParams;

public final class FinancialAccountFeaturesService extends ApiService {
  public FinancialAccountFeaturesService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures update(String id, FinancialAccountFeaturesUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures update(String id, RequestOptions options) throws StripeException {
    return update(id, (FinancialAccountFeaturesUpdateParams) null, options);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures update(String id) throws StripeException {
    return update(id, (FinancialAccountFeaturesUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures update(
      String id, FinancialAccountFeaturesUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/financial_accounts/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccountFeatures.class);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieve(String id, FinancialAccountFeaturesRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (FinancialAccountFeaturesRetrieveParams) null, options);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieve(String id) throws StripeException {
    return retrieve(id, (FinancialAccountFeaturesRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieve(
      String id, FinancialAccountFeaturesRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/financial_accounts/%s/features", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccountFeatures.class);
  }
}
