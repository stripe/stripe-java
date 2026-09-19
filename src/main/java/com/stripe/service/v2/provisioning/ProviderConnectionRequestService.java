// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.provisioning.ProviderConnectionRequest;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.ProviderConnectionRequestCreateParams;
import com.stripe.param.v2.provisioning.ProviderConnectionRequestSubmitInformationParams;

public final class ProviderConnectionRequestService extends ApiService {
  public ProviderConnectionRequestService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a new provider connection. */
  public ProviderConnectionRequest create(ProviderConnectionRequestCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new provider connection. */
  public ProviderConnectionRequest create(
      ProviderConnectionRequestCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/provider_connection_requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ProviderConnectionRequest.class);
  }
  /** Retrieves a provider connection. */
  public ProviderConnectionRequest retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a provider connection. */
  public ProviderConnectionRequest retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/provisioning/provider_connection_requests/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ProviderConnectionRequest.class);
  }
  /** Submits additional information requested by the provider for a provider connection. */
  public ProviderConnectionRequest submitInformation(
      String id, ProviderConnectionRequestSubmitInformationParams params) throws StripeException {
    return submitInformation(id, params, (RequestOptions) null);
  }
  /** Submits additional information requested by the provider for a provider connection. */
  public ProviderConnectionRequest submitInformation(
      String id, ProviderConnectionRequestSubmitInformationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/provisioning/provider_connection_requests/%s/submit_information",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ProviderConnectionRequest.class);
  }
}
