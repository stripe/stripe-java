// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.FinancialAccountFeatures;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.FinancialAccountFeaturesCreateParams;
import com.stripe.param.treasury.FinancialAccountFeaturesListParams;

public final class FinancialAccountFeaturesService extends ApiService {
  public FinancialAccountFeaturesService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures create(
      String financialAccount, FinancialAccountFeaturesCreateParams params) throws StripeException {
    return create(financialAccount, params, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures create(String financialAccount, RequestOptions options)
      throws StripeException {
    return create(financialAccount, (FinancialAccountFeaturesCreateParams) null, options);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures create(String financialAccount) throws StripeException {
    return create(
        financialAccount, (FinancialAccountFeaturesCreateParams) null, (RequestOptions) null);
  }
  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures create(
      String financialAccount, FinancialAccountFeaturesCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/financial_accounts/%s/features",
            ApiResource.urlEncodeId(financialAccount));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, FinancialAccountFeatures.class);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures list(
      String financialAccount, FinancialAccountFeaturesListParams params) throws StripeException {
    return list(financialAccount, params, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures list(String financialAccount, RequestOptions options)
      throws StripeException {
    return list(financialAccount, (FinancialAccountFeaturesListParams) null, options);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures list(String financialAccount) throws StripeException {
    return list(financialAccount, (FinancialAccountFeaturesListParams) null, (RequestOptions) null);
  }
  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures list(
      String financialAccount, FinancialAccountFeaturesListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/financial_accounts/%s/features",
            ApiResource.urlEncodeId(financialAccount));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, FinancialAccountFeatures.class);
  }
}
