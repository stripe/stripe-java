// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.extend.ObjectDefinitionVersion;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2ExtendObjectDefinitionVersionCreatedEvent extends Event {
  /** Data for the v2.extend.object_definition_version.created event. */
  @SerializedName("data")
  V2ExtendObjectDefinitionVersionCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The singular API name of the object definition. */
    @SerializedName("api_name_singular")
    String apiNameSingular;
    /** The ID of the parent object definition. */
    @SerializedName("object_definition")
    String objectDefinition;
    /**
     * The semantic version of the created object definition version, in {@code major.minor.patch}
     * format.
     */
    @SerializedName("version")
    String version;
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public ObjectDefinitionVersion fetchRelatedObject() throws StripeException {
    return (ObjectDefinitionVersion) super.fetchRelatedObject(this.relatedObject);
  }
}
