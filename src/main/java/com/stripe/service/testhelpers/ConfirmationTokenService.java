// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.ConfirmationToken;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ConfirmationTokenCreateParams;

public final class ConfirmationTokenService extends ApiService {
  public ConfirmationTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a test mode Confirmation Token server side for your integration tests. */
  public ConfirmationToken create(ConfirmationTokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a test mode Confirmation Token server side for your integration tests. */
  public ConfirmationToken create(RequestOptions options) throws StripeException {
    return create((ConfirmationTokenCreateParams) null, options);
  }
  /** Creates a test mode Confirmation Token server side for your integration tests. */
  public ConfirmationToken create() throws StripeException {
    return create((ConfirmationTokenCreateParams) null, (RequestOptions) null);
  }
  /** Creates a test mode Confirmation Token server side for your integration tests. */
  public ConfirmationToken create(ConfirmationTokenCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/confirmation_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ConfirmationToken.class);
  }
}
