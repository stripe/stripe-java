package com.stripe.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class StripeRawJsonObjectSerializer implements JsonSerializer<StripeRawJsonObject> {
  @Override
  public JsonElement serialize(
      StripeRawJsonObject src, Type typeOfSrc, JsonSerializationContext context) {
    if (src.json != null) {
      return src.json;
    }
    return JsonNull.INSTANCE;
  }
}
