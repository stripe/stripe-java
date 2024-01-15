// File generated from our OpenAPI spec
package com.stripe.service.apps;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.apps.Secret;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.apps.SecretCreateParams;
import com.stripe.param.apps.SecretDeleteWhereParams;
import com.stripe.param.apps.SecretFindParams;
import com.stripe.param.apps.SecretListParams;

public final class SecretService extends ApiService {
  public SecretService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all secrets stored on the given scope. */
  public StripeCollection<Secret> list(SecretListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all secrets stored on the given scope. */
  public StripeCollection<Secret> list(SecretListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Secret>>() {}.getType());
  }
  /** Create or replace a secret in the secret store. */
  public Secret create(SecretCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create or replace a secret in the secret store. */
  public Secret create(SecretCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apps/secrets";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Secret.class);
  }
  /** Finds a secret in the secret store by name and scope. */
  public Secret find(SecretFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }
  /** Finds a secret in the secret store by name and scope. */
  public Secret find(SecretFindParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apps/secrets/find";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Secret.class);
  }
  /** Deletes a secret from the secret store by name and scope. */
  public Secret deleteWhere(SecretDeleteWhereParams params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }
  /** Deletes a secret from the secret store by name and scope. */
  public Secret deleteWhere(SecretDeleteWhereParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/delete";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Secret.class);
  }
}
