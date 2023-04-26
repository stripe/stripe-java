package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.stripe.net.UntypedMapDeserializer;
import java.lang.reflect.Type;
import java.util.Map;

public class EventDataDeserializer implements JsonDeserializer<Event.Data> {

  private static final UntypedMapDeserializer UNTYPED_MAP_DESERIALIZER =
      new UntypedMapDeserializer();

  /**
   * Deserializes the JSON payload contained in an event's {@code data} attribute into an {@link
   * Event.Data} instance.
   */
  @Override
  public Event.Data deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    Event.Data eventData = new Event.Data();
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
}
