// File generated from our OpenAPI spec
package com.stripe.service.delegatedcheckout;

import com.stripe.exception.StripeException;
import com.stripe.model.delegatedcheckout.RequestedSession;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.RequestedSessionConfirmParams;
import com.stripe.param.delegatedcheckout.RequestedSessionCreateParams;
import com.stripe.param.delegatedcheckout.RequestedSessionExpireParams;
import com.stripe.param.delegatedcheckout.RequestedSessionRetrieveParams;
import com.stripe.param.delegatedcheckout.RequestedSessionUpdateParams;

public final class RequestedSessionService extends ApiService {
  public RequestedSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a requested session. */
  public RequestedSession retrieve(String requestedSession, RequestedSessionRetrieveParams params)
      throws StripeException {
    return retrieve(requestedSession, params, (RequestOptions) null);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(String requestedSession, RequestOptions options)
      throws StripeException {
    return retrieve(requestedSession, (RequestedSessionRetrieveParams) null, options);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(String requestedSession) throws StripeException {
    return retrieve(requestedSession, (RequestedSessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(
      String requestedSession, RequestedSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }
  /** Updates a requested session. */
  public RequestedSession update(String requestedSession, RequestedSessionUpdateParams params)
      throws StripeException {
    return update(requestedSession, params, (RequestOptions) null);
  }
  /** Updates a requested session. */
  public RequestedSession update(String requestedSession, RequestOptions options)
      throws StripeException {
    return update(requestedSession, (RequestedSessionUpdateParams) null, options);
  }
  /** Updates a requested session. */
  public RequestedSession update(String requestedSession) throws StripeException {
    return update(requestedSession, (RequestedSessionUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a requested session. */
  public RequestedSession update(
      String requestedSession, RequestedSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }
  /** Creates a requested session. */
  public RequestedSession create(RequestedSessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a requested session. */
  public RequestedSession create(RequestOptions options) throws StripeException {
    return create((RequestedSessionCreateParams) null, options);
  }
  /** Creates a requested session. */
  public RequestedSession create() throws StripeException {
    return create((RequestedSessionCreateParams) null, (RequestOptions) null);
  }
  /** Creates a requested session. */
  public RequestedSession create(RequestedSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/delegated_checkout/requested_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(String requestedSession, RequestedSessionConfirmParams params)
      throws StripeException {
    return confirm(requestedSession, params, (RequestOptions) null);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(String requestedSession, RequestOptions options)
      throws StripeException {
    return confirm(requestedSession, (RequestedSessionConfirmParams) null, options);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(String requestedSession) throws StripeException {
    return confirm(requestedSession, (RequestedSessionConfirmParams) null, (RequestOptions) null);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(
      String requestedSession, RequestedSessionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }
  /** Expires a requested session. */
  public RequestedSession expire(String requestedSession, RequestedSessionExpireParams params)
      throws StripeException {
    return expire(requestedSession, params, (RequestOptions) null);
  }
  /** Expires a requested session. */
  public RequestedSession expire(String requestedSession, RequestOptions options)
      throws StripeException {
    return expire(requestedSession, (RequestedSessionExpireParams) null, options);
  }
  /** Expires a requested session. */
  public RequestedSession expire(String requestedSession) throws StripeException {
    return expire(requestedSession, (RequestedSessionExpireParams) null, (RequestOptions) null);
  }
  /** Expires a requested session. */
  public RequestedSession expire(
      String requestedSession, RequestedSessionExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }
}
