// File generated from our OpenAPI spec
package com.stripe.service.threedsecure;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.threedsecure.Authentication;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.threedsecure.AuthenticationCancelParams;
import com.stripe.param.threedsecure.AuthenticationCreateParams;
import com.stripe.param.threedsecure.AuthenticationListParams;
import com.stripe.param.threedsecure.AuthenticationRetrieveParams;
import com.stripe.param.threedsecure.AuthenticationSubmitParams;

public final class AuthenticationService extends ApiService {
  public AuthenticationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of 3D Secure Authentications. */
  public StripeCollection<Authentication> list(AuthenticationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of 3D Secure Authentications. */
  public StripeCollection<Authentication> list(RequestOptions options) throws StripeException {
    return list((AuthenticationListParams) null, options);
  }
  /** Returns a list of 3D Secure Authentications. */
  public StripeCollection<Authentication> list() throws StripeException {
    return list((AuthenticationListParams) null, (RequestOptions) null);
  }
  /** Returns a list of 3D Secure Authentications. */
  public StripeCollection<Authentication> list(
      AuthenticationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Authentication>>() {}.getType());
  }
  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication create(AuthenticationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication create(AuthenticationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authentication.class);
  }
  /** This endpoint retrieves a 3DS Authentication. */
  public Authentication retrieve(String authentication, AuthenticationRetrieveParams params)
      throws StripeException {
    return retrieve(authentication, params, (RequestOptions) null);
  }
  /** This endpoint retrieves a 3DS Authentication. */
  public Authentication retrieve(String authentication, RequestOptions options)
      throws StripeException {
    return retrieve(authentication, (AuthenticationRetrieveParams) null, options);
  }
  /** This endpoint retrieves a 3DS Authentication. */
  public Authentication retrieve(String authentication) throws StripeException {
    return retrieve(authentication, (AuthenticationRetrieveParams) null, (RequestOptions) null);
  }
  /** This endpoint retrieves a 3DS Authentication. */
  public Authentication retrieve(
      String authentication, AuthenticationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s", ApiResource.urlEncodeId(authentication));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authentication.class);
  }
  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(String authentication, AuthenticationCancelParams params)
      throws StripeException {
    return cancel(authentication, params, (RequestOptions) null);
  }
  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(String authentication, RequestOptions options)
      throws StripeException {
    return cancel(authentication, (AuthenticationCancelParams) null, options);
  }
  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(String authentication) throws StripeException {
    return cancel(authentication, (AuthenticationCancelParams) null, (RequestOptions) null);
  }
  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(
      String authentication, AuthenticationCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/cancel",
            ApiResource.urlEncodeId(authentication));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authentication.class);
  }
  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(String authentication, AuthenticationSubmitParams params)
      throws StripeException {
    return submit(authentication, params, (RequestOptions) null);
  }
  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(String authentication, RequestOptions options)
      throws StripeException {
    return submit(authentication, (AuthenticationSubmitParams) null, options);
  }
  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(String authentication) throws StripeException {
    return submit(authentication, (AuthenticationSubmitParams) null, (RequestOptions) null);
  }
  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(
      String authentication, AuthenticationSubmitParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/submit",
            ApiResource.urlEncodeId(authentication));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authentication.class);
  }
}
