// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Token;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.TokenListParams;
import com.stripe.param.issuing.TokenRetrieveParams;
import com.stripe.param.issuing.TokenUpdateParams;

public final class TokenService extends ApiService {
  public TokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists all Issuing {@code Token} objects for a given card. */
  public StripeCollection<Token> list(TokenListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists all Issuing {@code Token} objects for a given card. */
  public StripeCollection<Token> list(TokenListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/tokens";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Token>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Retrieves an Issuing {@code Token} object. */
  public Token retrieve(String token, TokenRetrieveParams params) throws StripeException {
    return retrieve(token, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Token} object. */
  public Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (TokenRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code Token} object. */
  public Token retrieve(String token) throws StripeException {
    return retrieve(token, (TokenRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code Token} object. */
  public Token retrieve(String token, TokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(token));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Token.class,
            options,
            ApiMode.V1);
  }
  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(String token, TokenUpdateParams params) throws StripeException {
    return update(token, params, (RequestOptions) null);
  }
  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(String token, TokenUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(token));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Token.class,
            options,
            ApiMode.V1);
  }
}
