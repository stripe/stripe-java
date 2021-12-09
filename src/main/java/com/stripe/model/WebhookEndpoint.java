// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.WebhookEndpointCreateParams;
import com.stripe.param.WebhookEndpointListParams;
import com.stripe.param.WebhookEndpointRetrieveParams;
import com.stripe.param.WebhookEndpointUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class WebhookEndpoint extends ApiResource implements HasId, MetadataStore<WebhookEndpoint> {
  /** The API version events are rendered as for this webhook endpoint. */
  @SerializedName("api_version")
  String apiVersion;

  /** The ID of the associated Connect application. */
  @SerializedName("application")
  String application;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** An optional description of what the webhook is used for. */
  @SerializedName("description")
  String description;

  /**
   * The list of events to enable for this endpoint. {@code ['*']} indicates that all events are
   * enabled, except those that require explicit selection.
   */
  @SerializedName("enabled_events")
  List<String> enabledEvents;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code webhook_endpoint}.
   */
  @SerializedName("object")
  String object;

  /**
   * The endpoint's secret, used to generate <a
   * href="https://stripe.com/docs/webhooks/signatures">webhook signatures</a>. Only returned at
   * creation.
   */
  @SerializedName("secret")
  String secret;

  /** The status of the webhook. It can be {@code enabled} or {@code disabled}. */
  @SerializedName("status")
  String status;

  /** The URL of the webhook endpoint. */
  @SerializedName("url")
  String url;

  /** Returns a list of your webhook endpoints. */
  public static WebhookEndpointCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your webhook endpoints. */
  public static WebhookEndpointCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/webhook_endpoints");
    return ApiResource.requestCollection(url, params, WebhookEndpointCollection.class, options);
  }

  /** Returns a list of your webhook endpoints. */
  public static WebhookEndpointCollection list(WebhookEndpointListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your webhook endpoints. */
  public static WebhookEndpointCollection list(
      WebhookEndpointListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/webhook_endpoints");
    return ApiResource.requestCollection(url, params, WebhookEndpointCollection.class, options);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public static WebhookEndpoint retrieve(String webhookEndpoint) throws StripeException {
    return retrieve(webhookEndpoint, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public static WebhookEndpoint retrieve(String webhookEndpoint, RequestOptions options)
      throws StripeException {
    return retrieve(webhookEndpoint, (Map<String, Object>) null, options);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public static WebhookEndpoint retrieve(
      String webhookEndpoint, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(webhookEndpoint)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, WebhookEndpoint.class, options);
  }

  /** Retrieves the webhook endpoint with the given ID. */
  public static WebhookEndpoint retrieve(
      String webhookEndpoint, WebhookEndpointRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(webhookEndpoint)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, WebhookEndpoint.class, options);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public static WebhookEndpoint create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public static WebhookEndpoint create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/webhook_endpoints");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public static WebhookEndpoint create(WebhookEndpointCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A webhook endpoint must have a <code>url</code> and a list of <code>enabled_events</code>. You
   * may optionally specify the Boolean <code>connect</code> parameter. If set to true, then a
   * Connect webhook endpoint that notifies the specified <code>url</code> about events from all
   * connected accounts is created; otherwise an account webhook endpoint that notifies the
   * specified <code>url</code> only about events from your account is created. You can also create
   * webhook endpoints in the <a href="https://dashboard.stripe.com/account/webhooks">webhooks
   * settings</a> section of the Dashboard.
   */
  public static WebhookEndpoint create(WebhookEndpointCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/webhook_endpoints");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  @Override
  public WebhookEndpoint update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  @Override
  public WebhookEndpoint update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  public WebhookEndpoint update(WebhookEndpointUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the webhook endpoint. You may edit the <code>url</code>, the list of <code>
   * enabled_events</code>, and the status of your endpoint.
   */
  public WebhookEndpoint update(WebhookEndpointUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, WebhookEndpoint.class, options);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * You can also delete webhook endpoints via the <a
   * href="https://dashboard.stripe.com/account/webhooks">webhook endpoint management</a> page of
   * the Stripe dashboard.
   */
  public WebhookEndpoint delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/webhook_endpoints/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, WebhookEndpoint.class, options);
  }
}
