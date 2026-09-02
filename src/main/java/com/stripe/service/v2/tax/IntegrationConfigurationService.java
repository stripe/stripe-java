// File generated from our OpenAPI spec
package com.stripe.service.v2.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.tax.IntegrationConfiguration;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.tax.IntegrationConfigurationUpdateParams;

public final class IntegrationConfigurationService extends ApiService {
  public IntegrationConfigurationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve the tax integration configuration for this account. */
  public IntegrationConfiguration retrieve() throws StripeException {
    return retrieve((RequestOptions) null);
  }
  /** Retrieve the tax integration configuration for this account. */
  public IntegrationConfiguration retrieve(RequestOptions options) throws StripeException {
    String path = "/v2/tax/integration_configurations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, IntegrationConfiguration.class);
  }
  /** Update the tax integration configuration for this account. */
  public IntegrationConfiguration update(IntegrationConfigurationUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }
  /** Update the tax integration configuration for this account. */
  public IntegrationConfiguration update(RequestOptions options) throws StripeException {
    return update((IntegrationConfigurationUpdateParams) null, options);
  }
  /** Update the tax integration configuration for this account. */
  public IntegrationConfiguration update() throws StripeException {
    return update((IntegrationConfigurationUpdateParams) null, (RequestOptions) null);
  }
  /** Update the tax integration configuration for this account. */
  public IntegrationConfiguration update(
      IntegrationConfigurationUpdateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/tax/integration_configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, IntegrationConfiguration.class);
  }
}
