// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.stripe.exception.StripeException;
import com.stripe.model.financialconnections.Session;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.SessionCreateParams;
import com.stripe.param.financialconnections.SessionRetrieveParams;

public final class SessionService extends ApiService {
  public SessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String id, SessionRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (SessionRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String id) throws StripeException {
    return retrieve(id, (SessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String id, SessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }
  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To launch the Financial Connections authorization flow, create a {@code Session}. The session’s
   * {@code client_secret} can be used to launch the flow using Stripe.js.
   */
  public Session create(SessionCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/financial_connections/sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Session.class);
  }
}
