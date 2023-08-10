// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.stripe.exception.StripeException;
import com.stripe.model.financialconnections.Session;
import com.stripe.net.ApiMode;
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Session.class,
            options,
            ApiMode.V1);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String session, SessionRetrieveParams params) throws StripeException {
    return retrieve(session, params, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (SessionRetrieveParams) null, options);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String session) throws StripeException {
    return retrieve(session, (SessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a Financial Connections {@code Session}. */
  public Session retrieve(String session, SessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/financial_connections/sessions/%s", ApiResource.urlEncodeId(session));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Session.class,
            options,
            ApiMode.V1);
  }
}
