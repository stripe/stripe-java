package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Event extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String account;
  String apiVersion;
  Long created;
  EventData data;
  Boolean livemode;
  Long pendingWebhooks;
  EventRequest request;
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
   *   StripeObject stripeObject = deserializer.getObject();
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

  // <editor-fold desc="list">
  /**
   * List all events.
   */
  public static EventCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all events.
   */
  public static EventCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Event.class), params, EventCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an event.
   */
  public static Event retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve an event.
   */
  public static Event retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve an event.
   */
  public static Event retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Event.class, id), params, Event.class, options);
  }
  // </editor-fold>
}
