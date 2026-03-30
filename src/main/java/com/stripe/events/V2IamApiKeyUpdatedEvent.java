// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2IamApiKeyUpdatedEvent extends Event {
  /** Data for the v2.iam.api_key.updated event. */
  @SerializedName("data")
  V2IamApiKeyUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** ID of the updated key. */
    @SerializedName("api_key")
    String apiKey;
  }
}
