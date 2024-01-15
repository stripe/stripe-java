// File generated from our OpenAPI spec
package com.stripe.service.billingportal;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billingportal.Configuration;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billingportal.ConfigurationCreateParams;
import com.stripe.param.billingportal.ConfigurationListParams;
import com.stripe.param.billingportal.ConfigurationRetrieveParams;
import com.stripe.param.billingportal.ConfigurationUpdateParams;

public final class ConfigurationService extends ApiService {
  public ConfigurationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public StripeCollection<Configuration> list(ConfigurationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public StripeCollection<Configuration> list(RequestOptions options) throws StripeException {
    return list((ConfigurationListParams) null, options);
  }
  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public StripeCollection<Configuration> list() throws StripeException {
    return list((ConfigurationListParams) null, (RequestOptions) null);
  }
  /** Returns a list of configurations that describe the functionality of the customer portal. */
  public StripeCollection<Configuration> list(
      ConfigurationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing_portal/configurations";
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
        .request(request, new TypeToken<StripeCollection<Configuration>>() {}.getType());
  }
  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public Configuration create(ConfigurationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a configuration that describes the functionality and behavior of a PortalSession. */
  public Configuration create(ConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing_portal/configurations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Configuration.class);
  }
  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public Configuration retrieve(String configuration, ConfigurationRetrieveParams params)
      throws StripeException {
    return retrieve(configuration, params, (RequestOptions) null);
  }
  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public Configuration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (ConfigurationRetrieveParams) null, options);
  }
  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public Configuration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (ConfigurationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a configuration that describes the functionality of the customer portal. */
  public Configuration retrieve(
      String configuration, ConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Configuration.class);
  }
  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(String configuration, ConfigurationUpdateParams params)
      throws StripeException {
    return update(configuration, params, (RequestOptions) null);
  }
  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(String configuration, RequestOptions options) throws StripeException {
    return update(configuration, (ConfigurationUpdateParams) null, options);
  }
  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(String configuration) throws StripeException {
    return update(configuration, (ConfigurationUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a configuration that describes the functionality of the customer portal. */
  public Configuration update(
      String configuration, ConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing_portal/configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Configuration.class);
  }
}
