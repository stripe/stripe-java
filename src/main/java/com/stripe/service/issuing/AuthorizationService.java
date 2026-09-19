// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Authorization;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.AuthorizationApproveParams;
import com.stripe.param.issuing.AuthorizationDeclineParams;
import com.stripe.param.issuing.AuthorizationListParams;
import com.stripe.param.issuing.AuthorizationRetrieveParams;
import com.stripe.param.issuing.AuthorizationUpdateParams;

public final class AuthorizationService extends ApiService {
  public AuthorizationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Authorization> list(AuthorizationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Authorization> list(RequestOptions options) throws StripeException {
    return list((AuthorizationListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Authorization> list() throws StripeException {
    return list((AuthorizationListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<Authorization> list(
      AuthorizationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/authorizations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Authorization>>() {}.getType());
  }
  /** Retrieves an Issuing {@code Authorization} object. */
  public Authorization retrieve(String id, AuthorizationRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Authorization} object. */
  public Authorization retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AuthorizationRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Authorization} object. */
  public Authorization retrieve(String id) throws StripeException {
    return retrieve(id, (AuthorizationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Authorization} object. */
  public Authorization retrieve(
      String id, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
  }
  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(String id, AuthorizationUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(String id, RequestOptions options) throws StripeException {
    return update(id, (AuthorizationUpdateParams) null, options);
  }
  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(String id) throws StripeException {
    return update(id, (AuthorizationUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(String id, AuthorizationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
  }
  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  public Authorization approve(String id, AuthorizationApproveParams params)
      throws StripeException {
    return approve(id, params, (RequestOptions) null);
  }
  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  public Authorization approve(String id, RequestOptions options) throws StripeException {
    return approve(id, (AuthorizationApproveParams) null, options);
  }
  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  public Authorization approve(String id) throws StripeException {
    return approve(id, (AuthorizationApproveParams) null, (RequestOptions) null);
  }
  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  public Authorization approve(String id, AuthorizationApproveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
  }
  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  public Authorization decline(String id, AuthorizationDeclineParams params)
      throws StripeException {
    return decline(id, params, (RequestOptions) null);
  }
  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  public Authorization decline(String id, RequestOptions options) throws StripeException {
    return decline(id, (AuthorizationDeclineParams) null, options);
  }
  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  public Authorization decline(String id) throws StripeException {
    return decline(id, (AuthorizationDeclineParams) null, (RequestOptions) null);
  }
  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  public Authorization decline(String id, AuthorizationDeclineParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
  }
}
