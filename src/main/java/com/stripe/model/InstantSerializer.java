package com.stripe.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.time.Instant;

public class InstantSerializer implements JsonSerializer<Instant> {
  /** Serializes an Instant into a JSON string in ISO 8601 format. */
  @Override
  public JsonElement serialize(Instant src, Type typeOfSrc, JsonSerializationContext context) {
    if (src != null) {
      return new JsonPrimitive(src.toString());
    }
    return null;
  }
}
