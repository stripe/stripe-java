package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class StripeRawJsonObjectDeserializer implements JsonDeserializer<StripeRawJsonObject> {
  /** Deserializes a JSON payload into a {@link StripeRawJsonObject} object. */
  @Override
  public StripeRawJsonObject deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    StripeRawJsonObject object = new StripeRawJsonObject();
    object.json = json.getAsJsonObject();
    return object;
  }
}
