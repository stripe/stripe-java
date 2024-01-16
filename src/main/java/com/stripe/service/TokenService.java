// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Token;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TokenCreateParams;
import com.stripe.param.TokenRetrieveParams;

public final class TokenService extends ApiService {
  public TokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the token with the given ID. */
  public Token retrieve(String token, TokenRetrieveParams params) throws StripeException {
    return retrieve(token, params, (RequestOptions) null);
  }
  /** Retrieves the token with the given ID. */
  public Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (TokenRetrieveParams) null, options);
  }
  /** Retrieves the token with the given ID. */
  public Token retrieve(String token) throws StripeException {
    return retrieve(token, (TokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the token with the given ID. */
  public Token retrieve(String token, TokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Token.class);
  }
  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any API method in place of a bank account dictionary. You can only use this token once. To
   * do so, attach it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public Token create(TokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any API method in place of a bank account dictionary. You can only use this token once. To
   * do so, attach it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public Token create(RequestOptions options) throws StripeException {
    return create((TokenCreateParams) null, options);
  }
  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any API method in place of a bank account dictionary. You can only use this token once. To
   * do so, attach it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public Token create() throws StripeException {
    return create((TokenCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any API method in place of a bank account dictionary. You can only use this token once. To
   * do so, attach it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public Token create(TokenCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Token.class);
  }
}
