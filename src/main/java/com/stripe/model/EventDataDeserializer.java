package com.stripe.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.stripe.net.ApiResource;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EventDataDeserializer implements JsonDeserializer<EventData> {

  private Object deserializeJsonPrimitive(JsonPrimitive element) {
    if (element.isBoolean()) {
      return element.getAsBoolean();
    } else if (element.isNumber()) {
      return element.getAsNumber();
    } else {
      return element.getAsString();
    }
  }

  private Object[] deserializeJsonArray(JsonArray arr) {
    Object[] elems = new Object[arr.size()];
    Iterator<JsonElement> elemIter = arr.iterator();
    int i = 0;
    while (elemIter.hasNext()) {
      JsonElement elem = elemIter.next();
      elems[i++] = deserializeJsonElement(elem);
    }
    return elems;
  }

  private Object deserializeJsonElement(JsonElement element) {
    if (element.isJsonNull()) {
      return null;
    } else if (element.isJsonObject()) {
      Map<String, Object> valueMap = new HashMap<>();
      populateMapFromJsonObject(valueMap, element.getAsJsonObject());
      return valueMap;
    } else if (element.isJsonPrimitive()) {
      return deserializeJsonPrimitive(element.getAsJsonPrimitive());
    } else if (element.isJsonArray()) {
      return deserializeJsonArray(element.getAsJsonArray());
    } else {
      System.err.println("Unknown JSON element type for element " + element + ". "
          + "If you're seeing this messaage, it's probably a bug in the Stripe Java "
          + "library. Please contact us by email at support@stripe.com.");
      return null;
    }
  }

  private void populateMapFromJsonObject(Map<String, Object> objMap, JsonObject jsonObject) {
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement element = entry.getValue();
      objMap.put(key, deserializeJsonElement(element));
    }
  }

  /**
   * Deserializes the JSON payload contained in an event's {@code data} attribute into an
   * {@link EventData} instance.
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
          Map<String, Object> previousAttributes = new HashMap<>();
          populateMapFromJsonObject(previousAttributes, element.getAsJsonObject());
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
   * @return JSON data to be deserialized to super class {@code StripeObject}
   */
  static StripeObject deserializeStripeObject(JsonObject eventDataObjectJson) {
    String type = eventDataObjectJson.getAsJsonObject().get("object").getAsString();
    Class<? extends StripeObject> cl = EventDataClassLookup.findClass(type);
    return ApiResource.GSON.fromJson(
        eventDataObjectJson, cl != null ? cl : StripeRawJsonObject.class);
  }
}
