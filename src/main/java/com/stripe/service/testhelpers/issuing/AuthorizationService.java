// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Authorization;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.AuthorizationCaptureParams;
import com.stripe.param.issuing.AuthorizationCreateParams;
import com.stripe.param.issuing.AuthorizationExpireParams;
import com.stripe.param.issuing.AuthorizationFinalizeAmountParams;
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
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
   * Finalize the amount on an Authorization prior to capture, when the initial authorization was
   * for an estimated amount.
   */
  public Authorization finalizeAmount(
      String authorization, AuthorizationFinalizeAmountParams params) throws StripeException {
    return finalizeAmount(authorization, params, (RequestOptions) null);
  }
  /**
   * Finalize the amount on an Authorization prior to capture, when the initial authorization was
   * for an estimated amount.
   */
  public Authorization finalizeAmount(
      String authorization, AuthorizationFinalizeAmountParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/finalize_amount",
            ApiResource.urlEncodeId(authorization));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
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
