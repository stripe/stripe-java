package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class PaymentSourceDeserializer implements JsonDeserializer<PaymentSource> {
  private static final String SOURCE_OBJECT_PROP = "object";

  @Override
  public PaymentSource deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
    throws JsonParseException {

    String sourceObject = json.getAsJsonObject().getAsJsonPrimitive(SOURCE_OBJECT_PROP).getAsString();
    Class<?> clazz;
    if (sourceObject.equals("bitcoin_receiver")) {
      clazz = BitcoinReceiver.class;
    } else if (sourceObject.equals("card")) {
      clazz = Card.class;
    } else {
      clazz = PaymentSource.class;
    }

    return (PaymentSource) context.deserialize(json, clazz);
  }
}
