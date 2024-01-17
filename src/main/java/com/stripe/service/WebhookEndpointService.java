// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.WebhookEndpoint;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.WebhookEndpointCreateParams;
import com.stripe.param.WebhookEndpointListParams;
import com.stripe.param.WebhookEndpointRetrieveParams;
import com.stripe.param.WebhookEndpointUpdateParams;

public final class WebhookEndpointService extends ApiService {
  public WebhookEndpointService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(String webhookEndpoint) throws StripeException {
    return delete(webhookEndpoint, (RequestOptions) null);
  }
  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(String webhookEndpoint, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(webhookEndpoint));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, WebhookEndpoint.class);
  }
  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(String webhookEndpoint, WebhookEndpointRetrieveParams params)
      throws StripeException {
    return retrieve(webhookEndpoint, params, (RequestOptions) null);
  }
  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(String webhookEndpoint, RequestOptions options)
      throws StripeException {
    return retrieve(webhookEndpoint, (WebhookEndpointRetrieveParams) null, options);
  }
  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(String webhookEndpoint) throws StripeException {
    return retrieve(webhookEndpoint, (WebhookEndpointRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the webhook endpoint with the given ID. */
  public WebhookEndpoint retrieve(
      String webhookEndpoint, WebhookEndpointRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(webhookEndpoint));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, WebhookEndpoint.class);
  }
  /**
   * Updates the webhook endpoint. You may edit the {@code url}, the list of {@code enabled_events},
   * and the status of your endpoint.
   */
  public WebhookEndpoint update(String webhookEndpoint, WebhookEndpointUpdateParams params)
      throws StripeException {
    return update(webhookEndpoint, params, (RequestOptions) null);
  }
  /**
   * Updates the webhook endpoint. You may edit the {@code url}, the list of {@code enabled_events},
   * and the status of your endpoint.
   */
  public WebhookEndpoint update(String webhookEndpoint, RequestOptions options)
      throws StripeException {
    return update(webhookEndpoint, (WebhookEndpointUpdateParams) null, options);
  }
  /**
   * Updates the webhook endpoint. You may edit the {@code url}, the list of {@code enabled_events},
   * and the status of your endpoint.
   */
  public WebhookEndpoint update(String webhookEndpoint) throws StripeException {
    return update(webhookEndpoint, (WebhookEndpointUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the webhook endpoint. You may edit the {@code url}, the list of {@code enabled_events},
   * and the status of your endpoint.
   */
  public WebhookEndpoint update(
      String webhookEndpoint, WebhookEndpointUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(webhookEndpoint));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, WebhookEndpoint.class);
  }
  /** Returns a list of your webhook endpoints. */
  public StripeCollection<WebhookEndpoint> list(WebhookEndpointListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your webhook endpoints. */
  public StripeCollection<WebhookEndpoint> list(RequestOptions options) throws StripeException {
    return list((WebhookEndpointListParams) null, options);
  }
  /** Returns a list of your webhook endpoints. */
  public StripeCollection<WebhookEndpoint> list() throws StripeException {
    return list((WebhookEndpointListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your webhook endpoints. */
  public StripeCollection<WebhookEndpoint> list(
      WebhookEndpointListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/webhook_endpoints";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<WebhookEndpoint>>() {}.getType());
  }
  /**
   * A webhook endpoint must have a {@code url} and a list of {@code enabled_events}. You may
   * optionally specify the Boolean {@code connect} parameter. If set to true, then a Connect
   * webhook endpoint that notifies the specified {@code url} about events from all connected
   * accounts is created; otherwise an account webhook endpoint that notifies the specified {@code
   * url} only about events from your account is created. You can also create webhook endpoints in
   * the <a href="https://dashboard.stripe.com/account/webhooks">webhooks settings</a> section of
   * the Dashboard.
   */
  public WebhookEndpoint create(WebhookEndpointCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * A webhook endpoint must have a {@code url} and a list of {@code enabled_events}. You may
   * optionally specify the Boolean {@code connect} parameter. If set to true, then a Connect
   * webhook endpoint that notifies the specified {@code url} about events from all connected
   * accounts is created; otherwise an account webhook endpoint that notifies the specified {@code
   * url} only about events from your account is created. You can also create webhook endpoints in
   * the <a href="https://dashboard.stripe.com/account/webhooks">webhooks settings</a> section of
   * the Dashboard.
   */
  public WebhookEndpoint create(WebhookEndpointCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/webhook_endpoints";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, WebhookEndpoint.class);
  }
}
