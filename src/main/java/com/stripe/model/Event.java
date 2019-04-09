package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.EventListParams;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  /** For Connect webhook events, the identifier of the account that emitted the event. */
  @SerializedName("account")
  String account;

  /**
   * The Stripe API version used to render {@code data}. <i>Note: This property is populated only
   * for events on or after October 31, 2014.</i>
   */
  @SerializedName("api_version")
  String apiVersion;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Object containing data associated with the event. */
  @SerializedName("data")
  EventData data;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if
   * the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /**
   * Number of webhooks that have yet to be successfully delivered (i.e., to return a 20x
   * response) to the URLs you’ve specified.
   */
  @SerializedName("pending_webhooks")
  Long pendingWebhooks;

  /** Information on the API request that instigated the event. */
  @SerializedName("request")
  EventRequest request;

  /**
   * Description of the event (e.g., {@code invoice.created} or {@code charge.refunded}).
   */
  @SerializedName("type")
  String type;

  /**
   * Legacy; use `account` instead (https://stripe.com/docs/upgrades#2017-05-25)
   */
  @Deprecated
  String userId;

  /**
   * Get deserialization helper to handle failure due to schema incompatibility.
   * When event API version matches that of the library's pinned version,
   * the following integration pattern is safe.
   * <pre>
   *   Event event = getEvent(); // either from webhook or event endpoint
   *   EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();
   *   Optional&lt;StripeObject&gt; stripeObject = deserializer.getObject();
   * </pre>
   * You can ensure that webhook events has the same API version by creating
   * webhook endpoint specifying api version](https://stripe.com/docs/api/webhook_endpoints/create)
   * as {@link com.stripe.Stripe#API_VERSION}.
   * For reading from old webhook endpoints or old events with potential schema
   * incompatibility, see {@link EventDataObjectDeserializer#deserialize()} and
   * {@link EventDataObjectDeserializer#deserializeUnsafe()}.
   */
  public EventDataObjectDeserializer getDataObjectDeserializer() {
    return new EventDataObjectDeserializer(apiVersion, type, data.object);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in
   * <a href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version}
   * attribute (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in
   * <a href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version}
   * attribute (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(EventListParams params) throws StripeException {
    return list(params, null);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in
   * <a href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version}
   * attribute (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Event.class), params, EventCollection.class, options);
  }

  /**
   * List events, going back up to 30 days. Each event data is rendered according to Stripe API
   * version at its creation time, specified in
   * <a href="https://stripe.com/docs/api/events/object">event object</a> {@code api_version}
   * attribute (not according to your current Stripe API version or {@code Stripe-Version} header).
   */
  public static EventCollection list(EventListParams params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Event.class), params, EventCollection.class, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieves the details of an event. Supply the unique identifier of the event, which you might
   * have received in a webhook.
   */
  public static Event retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Event.class, id), params, Event.class, options);
  }
}
