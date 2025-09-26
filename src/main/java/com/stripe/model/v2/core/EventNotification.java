package com.stripe.model.v2.core;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.stripe.StripeClient;
import com.stripe.events.UnknownEventNotification;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.EventNotificationClassLookup;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.StripeResponse;
import java.time.Instant;
import lombok.AccessLevel;
import lombok.Getter;

/**
 * `EventNotification` represents the common properties for json that's delivered from an Event
 * Destination. A concrete child of `EventNotification` will be returned from
 * `StripeClient.parseEventNotificaion()`. You will likely want to cast that object to a more
 * specific child of `EventNotification`, like `PushedV1BillingMeterErrorReportTriggeredEvent`
 */
@Getter
public abstract class EventNotification {
  /**
   * For more details about Request, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  public static class Request {
    /** ID of the API request that caused the event. */
    @SerializedName("id")
    String id;

    /** The idempotency key transmitted during the request. */
    @SerializedName("idempotency_key")
    String idempotencyKey;
  }

  @Getter
  public static class Reason {
    /** Information on the API request that instigated the event. */
    @SerializedName("request")
    Request request;

    /**
     * Event reason type.
     *
     * <p>Equal to {@code request}.
     */
    @SerializedName("type")
    String type;
  }

  /** Unique identifier for the event. */
  @SerializedName("id")
  public String id;

  /** The type of the event. */
  @SerializedName("type")
  public String type;

  /** Time at which the object was created. */
  @SerializedName("created")
  public Instant created;

  /** Livemode indicates if the event is from a production(true) or test(false) account. */
  @SerializedName("livemode")
  public Boolean livemode;

  /** [Optional] Authentication context needed to fetch the event or related object. */
  @SerializedName("context")
  public String context;

  /** [Optional] Reason for the event. */
  @SerializedName("reason")
  public Reason reason;

  @Getter(AccessLevel.NONE)
  protected transient StripeClient client;

  /**
   * Helper for constructing an Event Notification. Doesn't perform signature validation, so you
   * should use {@link com.stripe.StripeClient#parseEventNotification} instead for initial handling.
   * This is useful in unit tests and working with EventNotifications that you've already validated
   * the authenticity of.
   */
  public static EventNotification fromJson(String payload, StripeClient client) {
    // don't love the double json parse here, but I don't think we can avoid it?
    JsonObject jsonObject = ApiResource.GSON.fromJson(payload, JsonObject.class).getAsJsonObject();

    Class<? extends EventNotification> cls =
        EventNotificationClassLookup.eventClassLookup.get(jsonObject.get("type").getAsString());
    if (cls == null) {
      cls = UnknownEventNotification.class;
    }

    EventNotification e = ApiResource.GSON.fromJson(payload, cls);
    e.client = client;
    return e;
  }

  private RawRequestOptions getRequestOptions() {
    if (context == null) {
      return null;
    }
    return new RawRequestOptions.RawRequestOptionsBuilder().setStripeContext(context).build();
  }

  /* retrieves the full payload for an event. Protected because individual push classes use it, but type it correctly */
  protected Event fetchEvent() throws StripeException {
    StripeResponse response =
        client.rawRequest(
            RequestMethod.GET, String.format("/v2/core/events/%s", id), null, getRequestOptions());

    return (Event) client.deserialize(response.body(), ApiMode.V2);
  }

  /** Retrieves the object associated with the event. */
  protected StripeObject fetchRelatedObject(RelatedObject relatedObject) throws StripeException {
    if (relatedObject == null) {
      // used by UnknownEventNotification, so be a little defensive
      return null;
    }

    String relativeUrl = relatedObject.getUrl();

    StripeResponse response =
        client.rawRequest(RequestMethod.GET, relativeUrl, null, getRequestOptions());

    return client.deserialize(response.body(), ApiMode.getMode(relativeUrl));
  }
}
