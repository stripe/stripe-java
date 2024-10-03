package com.stripe.model;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.time.Instant;

public class InstantDeserializer implements JsonDeserializer<Instant>, JsonSerializer<Instant> {
  /** Deserializes an timestamp JSON payload into an {@link java.time.Instant} object. */
  @Override
  public Instant deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    if (json.isJsonNull()) {
      return null;
    }

    if (json.isJsonPrimitive()) {
      JsonPrimitive jsonPrimitive = json.getAsJsonPrimitive();
      if (jsonPrimitive.isString()) {
        return Instant.parse(jsonPrimitive.getAsString());
      }

      throw new JsonParseException("Instant is a non-string primitive type.");
    }

    throw new JsonParseException("Instant is a non-primitive type.");
  }

  @Override
  public JsonElement serialize(Instant src, Type typeOfSrc, JsonSerializationContext context) {
    return new JsonPrimitive(src.toString());
  }
}
