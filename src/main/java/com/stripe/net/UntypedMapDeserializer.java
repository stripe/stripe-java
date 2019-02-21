package com.stripe.net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class UntypedMapDeserializer {
  /**
   * Deserialize JSON into untyped map.
   * {@code JsonArray} is represented as {@code List<Object>}.
   * {@code JsonObject} is represented as {@code Map<String, Object>}.
   * {@code JsonPrimitive} is represented as String, Number, or Boolean.
   *
   * @param jsonObject  JSON to convert into untyped map
   * @return untyped map without dependency on JSON representation.
   */
  public Map<String, Object> deserialize(JsonObject jsonObject) {
    Map<String, Object> objMap = new HashMap<>();
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement element = entry.getValue();
      // JsonElement is super class of all JSON standard types:
      // array, null, primitive, and object
      objMap.put(key, deserializeJsonElement(element));
    }
    return objMap;
  }

  private Object deserializeJsonElement(JsonElement element) {
    if (element.isJsonNull()) {
      return null;
    } else if (element.isJsonObject()) {
      return deserialize(element.getAsJsonObject());
    } else if (element.isJsonPrimitive()) {
      return deserializeJsonPrimitive(element.getAsJsonPrimitive());
    } else if (element.isJsonArray()) {
      return deserializeJsonArray(element.getAsJsonArray());
    } else {
      System.err.println("Unknown JSON element type for element " + element + ". "
          + "If you're seeing this message, it's probably a bug in the Stripe Java "
          + "library. Please contact us by email at support@stripe.com.");
      return null;
    }
  }

  private Object deserializeJsonPrimitive(JsonPrimitive element) {
    if (element.isBoolean()) {
      return element.getAsBoolean();
    } else if (element.isNumber()) {
      return element.getAsNumber();
    } else {
      return element.getAsString();
    }
  }

  private List<Object> deserializeJsonArray(JsonArray arr) {
    List<Object> elems = new ArrayList<>(arr.size());
    Iterator<JsonElement> elemIter = arr.iterator();
    while (elemIter.hasNext()) {
      JsonElement elem = elemIter.next();
      elems.add(deserializeJsonElement(elem));
    }
    return elems;
  }
}
