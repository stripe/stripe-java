// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.ConnectionToken;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ConnectionTokenCreateParams;

public final class ConnectionTokenService extends ApiService {
  public ConnectionTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public ConnectionToken create(ConnectionTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public ConnectionToken create(RequestOptions options) throws StripeException {
    return create((ConnectionTokenCreateParams) null, options);
  }
  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public ConnectionToken create() throws StripeException {
    return create((ConnectionTokenCreateParams) null, (RequestOptions) null);
  }
  /**
   * To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token
   * from Stripe, proxied through your server. On your backend, add an endpoint that creates and
   * returns a connection token.
   */
  public ConnectionToken create(ConnectionTokenCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/connection_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, ConnectionToken.class);
  }
}
