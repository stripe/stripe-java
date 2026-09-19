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
  public RequestedSession retrieve(String id, RequestedSessionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (RequestedSessionRetrieveParams) null, options);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(String id) throws StripeException {
    return retrieve(id, (RequestedSessionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a requested session. */
  public RequestedSession retrieve(
      String id, RequestedSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(id));
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
  public RequestedSession update(String id, RequestedSessionUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a requested session. */
  public RequestedSession update(String id, RequestOptions options) throws StripeException {
    return update(id, (RequestedSessionUpdateParams) null, options);
  }
  /** Updates a requested session. */
  public RequestedSession update(String id) throws StripeException {
    return update(id, (RequestedSessionUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a requested session. */
  public RequestedSession update(
      String id, RequestedSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(id));
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
  public RequestedSession confirm(String id, RequestedSessionConfirmParams params)
      throws StripeException {
    return confirm(id, params, (RequestOptions) null);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(String id, RequestOptions options) throws StripeException {
    return confirm(id, (RequestedSessionConfirmParams) null, options);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(String id) throws StripeException {
    return confirm(id, (RequestedSessionConfirmParams) null, (RequestOptions) null);
  }
  /** Confirms a requested session. */
  public RequestedSession confirm(
      String id, RequestedSessionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm", ApiResource.urlEncodeId(id));
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
  public RequestedSession expire(String id, RequestedSessionExpireParams params)
      throws StripeException {
    return expire(id, params, (RequestOptions) null);
  }
  /** Expires a requested session. */
  public RequestedSession expire(String id, RequestOptions options) throws StripeException {
    return expire(id, (RequestedSessionExpireParams) null, options);
  }
  /** Expires a requested session. */
  public RequestedSession expire(String id) throws StripeException {
    return expire(id, (RequestedSessionExpireParams) null, (RequestOptions) null);
  }
  /** Expires a requested session. */
  public RequestedSession expire(
      String id, RequestedSessionExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RequestedSession.class);
  }

  public com.stripe.service.delegatedcheckout.RequestedSessionOrderService orders() {
    return new com.stripe.service.delegatedcheckout.RequestedSessionOrderService(
        this.getResponseGetter());
  }
}
