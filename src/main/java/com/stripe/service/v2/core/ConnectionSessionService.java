// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.ConnectionSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.ConnectionSessionCreateParams;

public final class ConnectionSessionService extends ApiService {
  public ConnectionSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a new ConnectionSession. */
  public ConnectionSession create(ConnectionSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a new ConnectionSession. */
  public ConnectionSession create(ConnectionSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/connection_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ConnectionSession.class);
  }
  /** Retrieve a ConnectionSession. */
  public ConnectionSession retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a ConnectionSession. */
  public ConnectionSession retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/connection_sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ConnectionSession.class);
  }
}
