package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* source and source_transaction objects have a `type` attribute with a string
 * value, and another attribute whose name is the value of `type` and whose value
 * is a Map<String, String>, that we call `typeData` in the Java library.
 * This custom deserializer is used to properly deserialize this attribute.
 */
public class SourceTypeDataDeserializer<T extends HasSourceTypeData>
    implements JsonDeserializer<T> {

  private void populateMapFromJsonObject(Map<String, String> objMap, JsonObject jsonObject) {
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement val = entry.getValue();
      String value;
      if (!val.isJsonNull()) {
        value = entry.getValue().getAsString();
        objMap.put(key, value);
      }
    }
  }

  /**
   * Deserializes the type-specific data of a {@link Source} or {@link SourceTransaction} object.
   */
  @Override
  public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {
    if (json.isJsonNull()) {
      return null;
    }

    if (!json.isJsonObject()) {
      throw new JsonParseException("type was not an object, which is problematic.");
    }

    JsonObject jsonObject = json.getAsJsonObject();

    // Get the `type` out of the response.
    String type = jsonObject.getAsJsonPrimitive("type").getAsString();

    // Populate the `typeData` from the `type` property.
    Map<String, String> typeData = new HashMap<String, String>();
    populateMapFromJsonObject(typeData, jsonObject.getAsJsonObject(type));

    // Remove the `type` property.
    jsonObject.remove(type);

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    T parsedData = gson.fromJson(json, typeOfT);

    parsedData.setTypeData(typeData);

    return parsedData;
  }
}
