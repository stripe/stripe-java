package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class EventRequestDeserializer implements JsonDeserializer<EventRequest> {

  /**
   * Deserializes the JSON payload contained in an event's {@code request} attribute into an {@link
   * EventRequest} instance.
   */
  @Override
  public EventRequest deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    Gson gson =
        new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    // API versions 2017-05-25 and earlier render `request` as a string
    // instead of a JSON object
    if (json.isJsonPrimitive()) {
      EventRequest request = new EventRequest();
      request.setId(json.getAsString());
      return request;
    } else {
      return gson.fromJson(json, typeOfT);
    }
  }
}
