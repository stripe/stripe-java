// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2IamApiKeyRotatedEvent extends Event {
  /** Data for the v2.iam.api_key.rotated event. */
  @SerializedName("data")
  V2IamApiKeyRotatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** ID of the new key that was created due to rotation. */
    @SerializedName("new_api_key")
    String newApiKey;
  }
}
