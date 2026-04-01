// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.core.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2IamApiKeyPermissionsUpdatedEvent extends Event {
  /** Data for the v2.iam.api_key.permissions_updated event. */
  @SerializedName("data")
  V2IamApiKeyPermissionsUpdatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** ID of the key whose permissions were updated. */
    @SerializedName("api_key")
    String apiKey;
  }
}
