// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.ConfirmationToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ConfirmationTokenRetrieveParams;

public final class ConfirmationTokenService extends ApiService {
  public ConfirmationTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves an existing ConfirmationToken object. */
  public ConfirmationToken retrieve(
      String confirmationToken, ConfirmationTokenRetrieveParams params) throws StripeException {
    return retrieve(confirmationToken, params, (RequestOptions) null);
  }
  /** Retrieves an existing ConfirmationToken object. */
  public ConfirmationToken retrieve(String confirmationToken, RequestOptions options)
      throws StripeException {
    return retrieve(confirmationToken, (ConfirmationTokenRetrieveParams) null, options);
  }
  /** Retrieves an existing ConfirmationToken object. */
  public ConfirmationToken retrieve(String confirmationToken) throws StripeException {
    return retrieve(
        confirmationToken, (ConfirmationTokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing ConfirmationToken object. */
  public ConfirmationToken retrieve(
      String confirmationToken, ConfirmationTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/confirmation_tokens/%s", ApiResource.urlEncodeId(confirmationToken));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ConfirmationToken.class);
  }
}
