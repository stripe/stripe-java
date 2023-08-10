// File generated from our OpenAPI spec
package com.stripe.service.apps;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.apps.Secret;
import com.stripe.net.ApiMode;
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

  /** Finds a secret in the secret store by name and scope. */
  public Secret find(SecretFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }
  /** Finds a secret in the secret store by name and scope. */
  public Secret find(SecretFindParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apps/secrets/find";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Secret.class,
            options,
            ApiMode.V1);
  }
  /** Create or replace a secret in the secret store. */
  public Secret create(SecretCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create or replace a secret in the secret store. */
  public Secret create(SecretCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apps/secrets";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Secret.class,
            options,
            ApiMode.V1);
  }
  /** List all secrets stored on the given scope. */
  public StripeCollection<Secret> list(SecretListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all secrets stored on the given scope. */
  public StripeCollection<Secret> list(SecretListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<Secret>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Deletes a secret from the secret store by name and scope. */
  public Secret deleteWhere(SecretDeleteWhereParams params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }
  /** Deletes a secret from the secret store by name and scope. */
  public Secret deleteWhere(SecretDeleteWhereParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/delete";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Secret.class,
            options,
            ApiMode.V1);
  }
}
