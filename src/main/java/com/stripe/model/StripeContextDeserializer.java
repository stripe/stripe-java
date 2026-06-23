package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.stripe.StripeContext;
import java.lang.reflect.Type;

public class StripeContextDeserializer implements JsonDeserializer<StripeContext> {

  @Override
  public StripeContext deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    if (json == null || json.isJsonNull()) {
      return null;
    }

    String contextString = json.getAsString().trim();
    if (contextString.isEmpty()) {
      return null;
    }
    return StripeContext.parse(contextString);
  }
}
