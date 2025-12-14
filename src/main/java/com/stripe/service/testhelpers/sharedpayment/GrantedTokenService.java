// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.sharedpayment;

import com.stripe.exception.StripeException;
import com.stripe.model.sharedpayment.GrantedToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sharedpayment.GrantedTokenCreateParams;
import com.stripe.param.sharedpayment.GrantedTokenUpdateParams;

public final class GrantedTokenService extends ApiService {
  public GrantedTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
   * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken create(GrantedTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
   * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken create(GrantedTokenCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/shared_payment/granted_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GrantedToken.class);
  }
  /**
   * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
   * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken update(String sharedPaymentGrantedToken, GrantedTokenUpdateParams params)
      throws StripeException {
    return update(sharedPaymentGrantedToken, params, (RequestOptions) null);
  }
  /**
   * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
   * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken update(String sharedPaymentGrantedToken, RequestOptions options)
      throws StripeException {
    return update(sharedPaymentGrantedToken, (GrantedTokenUpdateParams) null, options);
  }
  /**
   * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
   * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken update(String sharedPaymentGrantedToken) throws StripeException {
    return update(
        sharedPaymentGrantedToken, (GrantedTokenUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
   * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
   */
  public GrantedToken update(
      String sharedPaymentGrantedToken, GrantedTokenUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/shared_payment/granted_tokens/%s/revoke",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GrantedToken.class);
  }
}
