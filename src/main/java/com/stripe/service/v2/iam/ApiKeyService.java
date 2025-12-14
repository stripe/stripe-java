// File generated from our OpenAPI spec
package com.stripe.service.v2.iam;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.iam.ApiKey;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.iam.ApiKeyCreateParams;
import com.stripe.param.v2.iam.ApiKeyListParams;
import com.stripe.param.v2.iam.ApiKeyRotateParams;
import com.stripe.param.v2.iam.ApiKeyUpdateParams;

public final class ApiKeyService extends ApiService {
  public ApiKeyService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all API keys of an account. */
  public StripeCollection<ApiKey> list(ApiKeyListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all API keys of an account. */
  public StripeCollection<ApiKey> list(RequestOptions options) throws StripeException {
    return list((ApiKeyListParams) null, options);
  }
  /** List all API keys of an account. */
  public StripeCollection<ApiKey> list() throws StripeException {
    return list((ApiKeyListParams) null, (RequestOptions) null);
  }
  /** List all API keys of an account. */
  public StripeCollection<ApiKey> list(ApiKeyListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/iam/api_keys";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ApiKey>>() {}.getType());
  }
  /** Create an API key. */
  public ApiKey create(ApiKeyCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create an API key. */
  public ApiKey create(ApiKeyCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/iam/api_keys";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ApiKey.class);
  }
  /** Retrieve an API key. */
  public ApiKey retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an API key. */
  public ApiKey retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/iam/api_keys/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ApiKey.class);
  }
  /** Update an API key. */
  public ApiKey update(String id, ApiKeyUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update an API key. */
  public ApiKey update(String id, RequestOptions options) throws StripeException {
    return update(id, (ApiKeyUpdateParams) null, options);
  }
  /** Update an API key. */
  public ApiKey update(String id) throws StripeException {
    return update(id, (ApiKeyUpdateParams) null, (RequestOptions) null);
  }
  /** Update an API key. */
  public ApiKey update(String id, ApiKeyUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/iam/api_keys/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ApiKey.class);
  }
  /** Expire an API key. */
  public ApiKey expire(String id) throws StripeException {
    return expire(id, (RequestOptions) null);
  }
  /** Expire an API key. */
  public ApiKey expire(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/iam/api_keys/%s/expire", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ApiKey.class);
  }
  /** Rotate an API key. */
  public ApiKey rotate(String id, ApiKeyRotateParams params) throws StripeException {
    return rotate(id, params, (RequestOptions) null);
  }
  /** Rotate an API key. */
  public ApiKey rotate(String id, RequestOptions options) throws StripeException {
    return rotate(id, (ApiKeyRotateParams) null, options);
  }
  /** Rotate an API key. */
  public ApiKey rotate(String id) throws StripeException {
    return rotate(id, (ApiKeyRotateParams) null, (RequestOptions) null);
  }
  /** Rotate an API key. */
  public ApiKey rotate(String id, ApiKeyRotateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/iam/api_keys/%s/rotate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ApiKey.class);
  }
}
