package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class EphemeralKeyDeserializer implements JsonDeserializer<EphemeralKey> {
  /** Deserializes an ephemeral_key JSON payload into an {@link EphemeralKey} object. */
  @Override
  public EphemeralKey deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    Gson gson =
        new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    EphemeralKey result = gson.fromJson(json, EphemeralKey.class);
    result.setRawJson(json.getAsJsonObject().toString());
    return result;
  }
}
