package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class PaymentIntentSourceTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!PaymentIntentSource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<PaymentIntentSource> paymentIntentSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(PaymentIntentSource.class));
    final TypeAdapter<Card> cardAdapter = gson.getDelegateAdapter(this, TypeToken.get(Card.class));
    final TypeAdapter<PaymentMethod> paymentMethodAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(PaymentMethod.class));
    final TypeAdapter<Source> sourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Source.class));

    TypeAdapter<PaymentIntentSource> resultCustomTypeAdapter =
        new TypeAdapter<PaymentIntentSource>() {
          @Override
          public void write(JsonWriter out, PaymentIntentSource value) throws IOException {
            paymentIntentSourceAdapter.write(out, value);
          }

          @Override
          public PaymentIntentSource read(JsonReader in) throws IOException {
            JsonObject object = jsonElementAdapter.read(in).getAsJsonObject();
            PaymentIntentSource objectResult;
            String objectType = object.getAsJsonPrimitive(discriminator).getAsString();
            if (objectType.equals("card")) {
              objectResult = cardAdapter.fromJsonTree(object);
            } else if (objectType.equals("payment_method")) {
              objectResult = paymentMethodAdapter.fromJsonTree(object);
            } else if (objectType.equals("source")) {
              objectResult = sourceAdapter.fromJsonTree(object);
            } else {
              throw new JsonParseException(
                  String.format(
                      "Unexpected object type `%s` for json object %s", objectType, object));
            }
            return objectResult;
          }
        };
    return (TypeAdapter<T>) resultCustomTypeAdapter.nullSafe();
  }
}
