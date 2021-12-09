// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.EventListParams;
import com.stripe.param.EventRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  /** The connected account that originated the event. */
  @SerializedName("account")
  String account;

  /**
   * The Stripe API version used to render {@code data}. <em>Note: This property is populated only
   * for events on or after October 31, 2014</em>.
   */
  @SerializedName("api_version")
  String apiVersion;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  @SerializedName("data")
  EventData data;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code event}.
   */
  @SerializedName("object")
  String object;

  /**
   * Number of webhooks that have yet to be successfully delivered (i.e., to return a 20x response)
   * to the URLs you've specified.
   */
  @SerializedName("pending_webhooks")
  Long pendingWebhooks;

  /** Information on the API request that instigated the event. */
  @SerializedName("request")
  EventRequest request;

  /** Description of the event (e.g., {@code invoice.created} or {@code charge.refunded}). */
  @SerializedName("type")
  String type;

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> <code>api_version</code>
   * attribute (not according to your current Stripe API version or <code>Stripe-Version</code>
   * header).
   */
  public static EventCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> <code>api_version</code>
   * attribute (not according to your current Stripe API version or <code>Stripe-Version</code>
   * header).
   */
  public static EventCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/events");
    return ApiResource.requestCollection(url, params, EventCollection.class, options);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> <code>api_version</code>
   * attribute (not according to your current Stripe API version or <code>Stripe-Version</code>
   * header).
   */
  public static EventCollection list(EventListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in <a
   * href="https://stripe.com/docs/api/events/object">event object</a> <code>api_version</code>
   * attribute (not according to your current Stripe API version or <code>Stripe-Version</code>
   * header).
   */
  public static EventCollection list(EventListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/events");
    return ApiResource.requestCollection(url, params, EventCollection.class, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/events/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Event.class, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, EventRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/events/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Event.class, options);
  }

  /**
   * Get deserialization helper to handle failure due to schema incompatibility. When event API
   * version matches that of the library's pinned version, the following integration pattern is
   * safe.
   *
   * <pre>
   *   Event event = getEvent(); // either from webhook or event endpoint
   *   EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();
   *   Optional&lt;StripeObject&gt; stripeObject = deserializer.getObject();
   * </pre>
   *
   * You can ensure that webhook events has the same API version by creating webhook endpoint
   * specifying api version](https://stripe.com/docs/api/webhook_endpoints/create) as {@link
   * com.stripe.Stripe#API_VERSION}. For reading from old webhook endpoints or old events with
   * potential schema incompatibility, see {@link EventDataObjectDeserializer#deserialize()} and
   * {@link EventDataObjectDeserializer#deserializeUnsafe()}.
   */
  public EventDataObjectDeserializer getDataObjectDeserializer() {
    return new EventDataObjectDeserializer(apiVersion, type, data.object);
  }
}
