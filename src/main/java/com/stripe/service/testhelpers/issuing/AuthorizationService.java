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
import com.stripe.param.issuing.AuthorizationRespondParams;
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
  public Authorization capture(String id, AuthorizationCaptureParams params)
      throws StripeException {
    return capture(id, params, (RequestOptions) null);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String id, RequestOptions options) throws StripeException {
    return capture(id, (AuthorizationCaptureParams) null, options);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String id) throws StripeException {
    return capture(id, (AuthorizationCaptureParams) null, (RequestOptions) null);
  }
  /** Capture a test-mode authorization. */
  public Authorization capture(String id, AuthorizationCaptureParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/capture", ApiResource.urlEncodeId(id));
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
  public Authorization expire(String id, AuthorizationExpireParams params) throws StripeException {
    return expire(id, params, (RequestOptions) null);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String id, RequestOptions options) throws StripeException {
    return expire(id, (AuthorizationExpireParams) null, options);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String id) throws StripeException {
    return expire(id, (AuthorizationExpireParams) null, (RequestOptions) null);
  }
  /** Expire a test-mode Authorization. */
  public Authorization expire(String id, AuthorizationExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/expire", ApiResource.urlEncodeId(id));
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
  public Authorization finalizeAmount(String id, AuthorizationFinalizeAmountParams params)
      throws StripeException {
    return finalizeAmount(id, params, (RequestOptions) null);
  }
  /**
   * Finalize the amount on an Authorization prior to capture, when the initial authorization was
   * for an estimated amount.
   */
  public Authorization finalizeAmount(
      String id, AuthorizationFinalizeAmountParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/finalize_amount",
            ApiResource.urlEncodeId(id));
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
   * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
   * confirmation of fraud or a correction of legitimacy.
   */
  public Authorization respond(String id, AuthorizationRespondParams params)
      throws StripeException {
    return respond(id, params, (RequestOptions) null);
  }
  /**
   * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
   * confirmation of fraud or a correction of legitimacy.
   */
  public Authorization respond(String id, AuthorizationRespondParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/fraud_challenges/respond",
            ApiResource.urlEncodeId(id));
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
  public Authorization increment(String id, AuthorizationIncrementParams params)
      throws StripeException {
    return increment(id, params, (RequestOptions) null);
  }
  /** Increment a test-mode Authorization. */
  public Authorization increment(
      String id, AuthorizationIncrementParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/increment", ApiResource.urlEncodeId(id));
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
  public Authorization reverse(String id, AuthorizationReverseParams params)
      throws StripeException {
    return reverse(id, params, (RequestOptions) null);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String id, RequestOptions options) throws StripeException {
    return reverse(id, (AuthorizationReverseParams) null, options);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String id) throws StripeException {
    return reverse(id, (AuthorizationReverseParams) null, (RequestOptions) null);
  }
  /** Reverse a test-mode Authorization. */
  public Authorization reverse(String id, AuthorizationReverseParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/authorizations/%s/reverse", ApiResource.urlEncodeId(id));
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
