// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Authorization;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.AuthorizationCaptureParams;
import com.stripe.param.issuing.AuthorizationCreateParams;
import com.stripe.param.issuing.AuthorizationExpireParams;
import com.stripe.param.issuing.AuthorizationIncrementParams;
import com.stripe.param.issuing.AuthorizationReverseParams;

public final class AuthorizationService extends ApiService {
  public AuthorizationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create a test-mode authorization. */
  public Authorization create(AuthorizationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a test-mode authorization. */
  public Authorization create(AuthorizationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/issuing/authorizations";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }
  /** Increment a test-mode Authorization. */
  public Authorization increment(String authorization, AuthorizationIncrementParams params)
      throws StripeException {
    return increment(authorization, params, (RequestOptions) null);
  }
  /** Increment a test-mode Authorization. */
  public Authorization increment(
      String authorization, AuthorizationIncrementParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/increment",
            ApiResource.urlEncodeId(authorization));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String authorization, AuthorizationReverseParams params)
      throws StripeException {
    return reverse(authorization, params, (RequestOptions) null);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String authorization, RequestOptions options)
      throws StripeException {
    return reverse(authorization, (AuthorizationReverseParams) null, options);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String authorization) throws StripeException {
    return reverse(authorization, (AuthorizationReverseParams) null, (RequestOptions) null);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(
      String authorization, AuthorizationReverseParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/reverse",
            ApiResource.urlEncodeId(authorization));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String authorization, AuthorizationExpireParams params)
      throws StripeException {
    return expire(authorization, params, (RequestOptions) null);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String authorization, RequestOptions options) throws StripeException {
    return expire(authorization, (AuthorizationExpireParams) null, options);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String authorization) throws StripeException {
    return expire(authorization, (AuthorizationExpireParams) null, (RequestOptions) null);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(
      String authorization, AuthorizationExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/expire",
            ApiResource.urlEncodeId(authorization));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String authorization, AuthorizationCaptureParams params)
      throws StripeException {
    return capture(authorization, params, (RequestOptions) null);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String authorization, RequestOptions options)
      throws StripeException {
    return capture(authorization, (AuthorizationCaptureParams) null, options);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String authorization) throws StripeException {
    return capture(authorization, (AuthorizationCaptureParams) null, (RequestOptions) null);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(
      String authorization, AuthorizationCaptureParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/capture",
            ApiResource.urlEncodeId(authorization));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }
}
