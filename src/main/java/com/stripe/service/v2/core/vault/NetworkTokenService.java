// File generated from our OpenAPI spec
package com.stripe.service.v2.core.vault;

import com.stripe.exception.BlockedByStripeException;
import com.stripe.exception.CannotProceedException;
import com.stripe.exception.MerchantNotGatedException;
import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.vault.NetworkToken;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.vault.NetworkTokenCreateFromCredentialParams;
import com.stripe.param.v2.core.vault.NetworkTokenCreateParams;
import com.stripe.param.v2.core.vault.NetworkTokenGenerateCryptogramParams;

public final class NetworkTokenService extends ApiService {
  public NetworkTokenService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates or returns a NetworkToken from raw card data for POST /v2/core/vault/network_tokens.
   */
  public NetworkToken create(NetworkTokenCreateParams params)
      throws StripeException, CannotProceedException, BlockedByStripeException,
          MerchantNotGatedException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates or returns a NetworkToken from raw card data for POST /v2/core/vault/network_tokens.
   */
  public NetworkToken create(NetworkTokenCreateParams params, RequestOptions options)
      throws StripeException, CannotProceedException, BlockedByStripeException,
          MerchantNotGatedException {
    String path = "/v2/core/vault/network_tokens";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, NetworkToken.class);
  }
  /**
   * Creates or returns a NetworkToken from an existing card reference for POST
   * /v2/core/vault/network_tokens/create_from_credential.
   */
  public NetworkToken createFromCredential(NetworkTokenCreateFromCredentialParams params)
      throws StripeException, CannotProceedException, BlockedByStripeException {
    return createFromCredential(params, (RequestOptions) null);
  }
  /**
   * Creates or returns a NetworkToken from an existing card reference for POST
   * /v2/core/vault/network_tokens/create_from_credential.
   */
  public NetworkToken createFromCredential(
      NetworkTokenCreateFromCredentialParams params, RequestOptions options)
      throws StripeException, CannotProceedException, BlockedByStripeException {
    String path = "/v2/core/vault/network_tokens/create_from_credential";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, NetworkToken.class);
  }
  /** Retrieves the persisted NetworkToken projection for GET /v2/core/vault/network_tokens/:id. */
  public NetworkToken retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the persisted NetworkToken projection for GET /v2/core/vault/network_tokens/:id. */
  public NetworkToken retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/vault/network_tokens/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, NetworkToken.class);
  }
  /**
   * Generates a single-use cryptogram for POST
   * /v2/core/vault/network_tokens/:id/generate_cryptogram. Every successful call generates a new
   * cryptogram, and retrying can generate another cryptogram. The cryptogram is returned only in
   * this response and is never persisted.
   */
  public NetworkToken generateCryptogram(String id, NetworkTokenGenerateCryptogramParams params)
      throws StripeException, RateLimitException, CannotProceedException {
    return generateCryptogram(id, params, (RequestOptions) null);
  }
  /**
   * Generates a single-use cryptogram for POST
   * /v2/core/vault/network_tokens/:id/generate_cryptogram. Every successful call generates a new
   * cryptogram, and retrying can generate another cryptogram. The cryptogram is returned only in
   * this response and is never persisted.
   */
  public NetworkToken generateCryptogram(String id, RequestOptions options)
      throws StripeException, RateLimitException, CannotProceedException {
    return generateCryptogram(id, (NetworkTokenGenerateCryptogramParams) null, options);
  }
  /**
   * Generates a single-use cryptogram for POST
   * /v2/core/vault/network_tokens/:id/generate_cryptogram. Every successful call generates a new
   * cryptogram, and retrying can generate another cryptogram. The cryptogram is returned only in
   * this response and is never persisted.
   */
  public NetworkToken generateCryptogram(String id)
      throws StripeException, RateLimitException, CannotProceedException {
    return generateCryptogram(
        id, (NetworkTokenGenerateCryptogramParams) null, (RequestOptions) null);
  }
  /**
   * Generates a single-use cryptogram for POST
   * /v2/core/vault/network_tokens/:id/generate_cryptogram. Every successful call generates a new
   * cryptogram, and retrying can generate another cryptogram. The cryptogram is returned only in
   * this response and is never persisted.
   */
  public NetworkToken generateCryptogram(
      String id, NetworkTokenGenerateCryptogramParams params, RequestOptions options)
      throws StripeException, RateLimitException, CannotProceedException {
    String path =
        String.format(
            "/v2/core/vault/network_tokens/%s/generate_cryptogram", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, NetworkToken.class);
  }
}
