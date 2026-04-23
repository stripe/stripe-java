// File generated from our OpenAPI spec
package com.stripe.service.sharedpayment;

import com.stripe.exception.StripeException;
import com.stripe.model.sharedpayment.GrantedToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sharedpayment.GrantedTokenRetrieveParams;

public final class GrantedTokenService extends ApiService {
  public GrantedTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String sharedPaymentGrantedToken, GrantedTokenRetrieveParams params)
      throws StripeException {
    return retrieve(sharedPaymentGrantedToken, params, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String sharedPaymentGrantedToken, RequestOptions options)
      throws StripeException {
    return retrieve(sharedPaymentGrantedToken, (GrantedTokenRetrieveParams) null, options);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String sharedPaymentGrantedToken) throws StripeException {
    return retrieve(
        sharedPaymentGrantedToken, (GrantedTokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(
      String sharedPaymentGrantedToken, GrantedTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/granted_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GrantedToken.class);
  }
}
