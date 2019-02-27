package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class WebhookEndpoint extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String apiVersion;
  String application;
  Boolean connect;
  Long created;
  Boolean deleted;
  List<String> enabledEvents;
  Boolean livemode;
  String secret;
  String status;
  String url;

  // <editor-fold desc="create">
  /**
   * Create a webhook endpoint.
   */
  public static WebhookEndpoint create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a webhook endpoint.
   */
  public static WebhookEndpoint create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(WebhookEndpoint.class), params,
        WebhookEndpoint.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a webhook endpoint.
   */
  public WebhookEndpoint delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a webhook endpoint.
   */
  public WebhookEndpoint delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(WebhookEndpoint.class, this.id), null,
        WebhookEndpoint.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all coupons.
   */
  public static WebhookEndpointCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all coupons.
   */
  public static WebhookEndpointCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(WebhookEndpoint.class), params,
        WebhookEndpointCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a webhook endpoint.
   */
  public static WebhookEndpoint retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a webhook endpoint.
   */
  public static WebhookEndpoint retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a webhook endpoint.
   */
  public static WebhookEndpoint retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(WebhookEndpoint.class, id), params,
        WebhookEndpoint.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a webhook endpoint.
   */
  public WebhookEndpoint update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a webhook endpoint.
   */
  public WebhookEndpoint update(Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(WebhookEndpoint.class, this.id), params,
        WebhookEndpoint.class, options);
  }
  // </editor-fold>
}
