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
  public GrantedToken retrieve(String id, GrantedTokenRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (GrantedTokenRetrieveParams) null, options);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String id) throws StripeException {
    return retrieve(id, (GrantedTokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public GrantedToken retrieve(String id, GrantedTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/shared_payment/granted_tokens/%s", ApiResource.urlEncodeId(id));
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
