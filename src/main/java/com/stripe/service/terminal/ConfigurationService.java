// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.terminal.Configuration;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ConfigurationCreateParams;
import com.stripe.param.terminal.ConfigurationListParams;
import com.stripe.param.terminal.ConfigurationRetrieveParams;
import com.stripe.param.terminal.ConfigurationUpdateParams;

public final class ConfigurationService extends ApiService {
  public ConfigurationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a {@code Configuration} object. */
  public Configuration delete(String configuration) throws StripeException {
    return delete(configuration, (RequestOptions) null);
  }
  /** Deletes a {@code Configuration} object. */
  public Configuration delete(String configuration, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, Configuration.class);
  }
  /** Retrieves a {@code Configuration} object. */
  public Configuration retrieve(String configuration, ConfigurationRetrieveParams params)
      throws StripeException {
    return retrieve(configuration, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Configuration} object. */
  public Configuration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (ConfigurationRetrieveParams) null, options);
  }
  /** Retrieves a {@code Configuration} object. */
  public Configuration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (ConfigurationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Configuration} object. */
  public Configuration retrieve(
      String configuration, ConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Configuration.class);
  }
  /** Updates a new {@code Configuration} object. */
  public Configuration update(String configuration, ConfigurationUpdateParams params)
      throws StripeException {
    return update(configuration, params, (RequestOptions) null);
  }
  /** Updates a new {@code Configuration} object. */
  public Configuration update(String configuration, RequestOptions options) throws StripeException {
    return update(configuration, (ConfigurationUpdateParams) null, options);
  }
  /** Updates a new {@code Configuration} object. */
  public Configuration update(String configuration) throws StripeException {
    return update(configuration, (ConfigurationUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a new {@code Configuration} object. */
  public Configuration update(
      String configuration, ConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Configuration.class);
  }
  /** Returns a list of {@code Configuration} objects. */
  public StripeCollection<Configuration> list(ConfigurationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of {@code Configuration} objects. */
  public StripeCollection<Configuration> list(RequestOptions options) throws StripeException {
    return list((ConfigurationListParams) null, options);
  }
  /** Returns a list of {@code Configuration} objects. */
  public StripeCollection<Configuration> list() throws StripeException {
    return list((ConfigurationListParams) null, (RequestOptions) null);
  }
  /** Returns a list of {@code Configuration} objects. */
  public StripeCollection<Configuration> list(
      ConfigurationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Configuration>>() {}.getType());
  }
  /** Creates a new {@code Configuration} object. */
  public Configuration create(ConfigurationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code Configuration} object. */
  public Configuration create(RequestOptions options) throws StripeException {
    return create((ConfigurationCreateParams) null, options);
  }
  /** Creates a new {@code Configuration} object. */
  public Configuration create() throws StripeException {
    return create((ConfigurationCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new {@code Configuration} object. */
  public Configuration create(ConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Configuration.class);
  }
}
