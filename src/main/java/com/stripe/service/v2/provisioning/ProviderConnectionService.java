// File generated from our OpenAPI spec
package com.stripe.service.v2.provisioning;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.provisioning.ProviderConnection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.provisioning.ProviderConnectionListParams;

public final class ProviderConnectionService extends ApiService {
  public ProviderConnectionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists the provider connections for the account. */
  public StripeCollection<ProviderConnection> list(ProviderConnectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists the provider connections for the account. */
  public StripeCollection<ProviderConnection> list(RequestOptions options) throws StripeException {
    return list((ProviderConnectionListParams) null, options);
  }
  /** Lists the provider connections for the account. */
  public StripeCollection<ProviderConnection> list() throws StripeException {
    return list((ProviderConnectionListParams) null, (RequestOptions) null);
  }
  /** Lists the provider connections for the account. */
  public StripeCollection<ProviderConnection> list(
      ProviderConnectionListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/provisioning/provider_connections";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ProviderConnection>>() {}.getType());
  }
  /** Unlinks a provider connection so it can no longer be used to create resources. */
  public ProviderConnection unlink(String id) throws StripeException {
    return unlink(id, (RequestOptions) null);
  }
  /** Unlinks a provider connection so it can no longer be used to create resources. */
  public ProviderConnection unlink(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/provisioning/provider_connections/%s/unlink", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ProviderConnection.class);
  }
}
