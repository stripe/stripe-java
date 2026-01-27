// File generated from our OpenAPI spec
package com.stripe.service.financialconnections;

import com.stripe.exception.StripeException;
import com.stripe.model.financialconnections.Authorization;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.AuthorizationRetrieveParams;

public final class AuthorizationService extends ApiService {
  public AuthorizationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public Authorization retrieve(String authorization, AuthorizationRetrieveParams params)
      throws StripeException {
    return retrieve(authorization, params, (RequestOptions) null);
  }
  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public Authorization retrieve(String authorization, RequestOptions options)
      throws StripeException {
    return retrieve(authorization, (AuthorizationRetrieveParams) null, options);
  }
  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public Authorization retrieve(String authorization) throws StripeException {
    return retrieve(authorization, (AuthorizationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an Financial Connections {@code Authorization}. */
  public Authorization retrieve(
      String authorization, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/authorizations/%s", ApiResource.urlEncodeId(authorization));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Authorization.class);
  }
}
