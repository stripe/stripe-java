// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.extend.ObjectDefinition;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2ExtendObjectDefinitionCreatedEvent extends Event {
  /** Data for the v2.extend.object_definition.created event. */
  @SerializedName("data")
  V2ExtendObjectDefinitionCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The singular API name of the object definition. */
    @SerializedName("api_name_singular")
    String apiNameSingular;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ObjectDefinition fetchRelatedObject() throws StripeException {
    return (ObjectDefinition) super.fetchRelatedObject(this.relatedObject);
  }
}
