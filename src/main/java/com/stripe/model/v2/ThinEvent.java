package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.Event.RelatedObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiResource.RequestMethod;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.StripeResponse;
import java.time.Instant;
import lombok.AccessLevel;
import lombok.Getter;

/**
 * ThinEvent represents the json that's delivered from an Event Destination. It's a basic class with
 * no additional methods or properties. Use it to check basic information about a delivered event.
 * If you want more details, use the `.pull()` to fetch the full event object.
 */
@Getter
public abstract class ThinEvent {

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
  public com.stripe.model.v2.Event.Reason reason;

  @Getter(AccessLevel.NONE)
  protected transient StripeClient client;

  /**
   * Helper for constructing a ThinEvent. Not needed for production code (`StripeClient` calls it
   * directly) but useful in testing.
   */
  public static ThinEvent fromJson(String payload, StripeClient client) {
    ThinEvent e = ApiResource.GSON.fromJson(payload, ThinEvent.class);
    e.client = client;
    return e;
  }

  private RawRequestOptions getOptions() {
    if (context == null) {
      return null;
    }
    return new RawRequestOptions.RawRequestOptionsBuilder().setStripeAccount(context).build();
  }

  /* retrieves the full payload for an event. Protected because individual push classes use it, but type it correctly */
  protected StripeObject pull() throws StripeException {
    StripeResponse response =
        client.rawRequest(
            RequestMethod.GET, String.format("/v2/core/events/%s", id), null, getOptions());

    return client.deserialize(response.body(), ApiMode.V2);
  }

  /** Retrieves the object associated with the event. */
  protected StripeObject fetchRelatedObject(RelatedObject relatedObject) throws StripeException {
    if (relatedObject == null) {
      // should ever hit this, because only events with related objects will get this method. But
      // you never know!
      return null;
    }

    String relativeUrl = relatedObject.getUrl();

    StripeResponse response = client.rawRequest(RequestMethod.GET, relativeUrl, null, getOptions());

    return client.deserialize(response.body(), ApiMode.getMode(relativeUrl));
  }
}
