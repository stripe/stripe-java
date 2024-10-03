package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.time.Instant;
import lombok.Getter;

/**
 * ThinEvent represents the json that's delivered from an Event Destination. It's a basic class with
 * no additional methods or properties. Use it to check basic information about a delivered event.
 * If you want more details, use `stripeClient.v2().core().events().retrieve(thin_event.id)` to
 * fetch the full event object.
 */
@Getter
public class ThinEvent {
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

  /** [Optional] Object containing the reference to API resource relevant to the event. */
  @SerializedName("related_object")
  public ThinEventRelatedObject relatedObject;

  /** [Optional] Reason for the event. */
  @SerializedName("reason")
  public com.stripe.model.v2.Event.Reason reason;
}
