package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.stripe.net.ApiResource;
import com.stripe.net.UntypedMapDeserializer;
import java.lang.reflect.Type;
import java.util.Map;

public class EventDataDeserializer implements JsonDeserializer<EventData> {

  private static final UntypedMapDeserializer UNTYPED_MAP_DESERIALIZER =
      new UntypedMapDeserializer();

  /**
   * Deserializes the JSON payload contained in an event's {@code data} attribute into an {@link
   * EventData} instance.
   */
  @Override
  public EventData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    EventData eventData = new EventData();
    JsonObject jsonObject = json.getAsJsonObject();
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement element = entry.getValue();
      if ("previous_attributes".equals(key)) {
        if (element.isJsonNull()) {
          eventData.setPreviousAttributes(null);
        } else if (element.isJsonObject()) {
          Map<String, Object> previousAttributes =
              UNTYPED_MAP_DESERIALIZER.deserialize(element.getAsJsonObject());
          eventData.setPreviousAttributes(previousAttributes);
        }
      } else if ("object".equals(key)) {
        eventData.setObject(entry.getValue().getAsJsonObject());
      }
    }
    return eventData;
  }

  /**
   * Deserialize JSON into super class {@code StripeObject} where the underlying concrete class
   * corresponds to type specified in root-level {@code object} field of the JSON input.
   *
   * <p>Note that the expected JSON input is data at the {@code object} value, as a sibling to
   * {@code previousAttributes}, and not the discriminator field containing a string.
   *
   * @return JSON data to be deserialized to super class {@code StripeObject}
   */
  static StripeObject deserializeStripeObject(JsonObject eventDataObjectJson) {
    String type = eventDataObjectJson.getAsJsonObject().get("object").getAsString();
    Class<? extends StripeObject> cl = EventDataClassLookup.findClass(type);
    return ApiResource.GSON.fromJson(
        eventDataObjectJson, cl != null ? cl : StripeRawJsonObject.class);
  }
}
