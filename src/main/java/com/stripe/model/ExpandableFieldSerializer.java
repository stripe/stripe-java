package com.stripe.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ExpandableFieldSerializer implements JsonSerializer<ExpandableField<?>> {
  /** Serializes an expandable attribute into a JSON string. */
  @Override
  public JsonElement serialize(
      ExpandableField<?> src, Type typeOfSrc, JsonSerializationContext context) {
    if (src.isExpanded()) {
      return context.serialize(src.getExpanded());
    } else if (src.getId() != null) {
      return new JsonPrimitive(src.getId());
    } else {
      return null;
    }
  }
}
