// File generated from our OpenAPI spec
package com.stripe.service.sharedpayment;

import com.stripe.exception.StripeException;
import com.stripe.model.sharedpayment.IssuedToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sharedpayment.IssuedTokenCreateParams;
import com.stripe.param.sharedpayment.IssuedTokenRetrieveParams;
import com.stripe.param.sharedpayment.IssuedTokenRevokeParams;

public final class IssuedTokenService extends ApiService {
  public IssuedTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an existing SharedPaymentIssuedToken object. */
  public IssuedToken retrieve(String sharedPaymentIssuedToken, IssuedTokenRetrieveParams params)
      throws StripeException {
    return retrieve(sharedPaymentIssuedToken, params, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentIssuedToken object. */
  public IssuedToken retrieve(String sharedPaymentIssuedToken, RequestOptions options)
      throws StripeException {
    return retrieve(sharedPaymentIssuedToken, (IssuedTokenRetrieveParams) null, options);
  }
  /** Retrieves an existing SharedPaymentIssuedToken object. */
  public IssuedToken retrieve(String sharedPaymentIssuedToken) throws StripeException {
    return retrieve(
        sharedPaymentIssuedToken, (IssuedTokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentIssuedToken object. */
  public IssuedToken retrieve(
      String sharedPaymentIssuedToken, IssuedTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/issued_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentIssuedToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, IssuedToken.class);
  }
  /** Creates a new SharedPaymentIssuedToken object. */
  public IssuedToken create(IssuedTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new SharedPaymentIssuedToken object. */
  public IssuedToken create(IssuedTokenCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/shared_payment/issued_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, IssuedToken.class);
  }
  /** Revokes a SharedPaymentIssuedToken. */
  public IssuedToken revoke(String sharedPaymentIssuedToken, IssuedTokenRevokeParams params)
      throws StripeException {
    return revoke(sharedPaymentIssuedToken, params, (RequestOptions) null);
  }
  /** Revokes a SharedPaymentIssuedToken. */
  public IssuedToken revoke(String sharedPaymentIssuedToken, RequestOptions options)
      throws StripeException {
    return revoke(sharedPaymentIssuedToken, (IssuedTokenRevokeParams) null, options);
  }
  /** Revokes a SharedPaymentIssuedToken. */
  public IssuedToken revoke(String sharedPaymentIssuedToken) throws StripeException {
    return revoke(sharedPaymentIssuedToken, (IssuedTokenRevokeParams) null, (RequestOptions) null);
  }
  /** Revokes a SharedPaymentIssuedToken. */
  public IssuedToken revoke(
      String sharedPaymentIssuedToken, IssuedTokenRevokeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/issued_tokens/%s/revoke",
            ApiResource.urlEncodeId(sharedPaymentIssuedToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, IssuedToken.class);
  }
}
