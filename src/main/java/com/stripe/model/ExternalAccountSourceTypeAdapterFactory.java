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

public class ExternalAccountSourceTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!ExternalAccountSource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<ExternalAccountSource> externalAccountSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(ExternalAccountSource.class));
    final TypeAdapter<BankAccount> bankAccountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(BankAccount.class));
    final TypeAdapter<Card> cardAdapter = gson.getDelegateAdapter(this, TypeToken.get(Card.class));

    TypeAdapter<ExternalAccountSource> resultCustomTypeAdapter =
        new TypeAdapter<ExternalAccountSource>() {
          @Override
          public void write(JsonWriter out, ExternalAccountSource value) throws IOException {
            externalAccountSourceAdapter.write(out, value);
          }

          @Override
          public ExternalAccountSource read(JsonReader in) throws IOException {
            JsonObject object = jsonElementAdapter.read(in).getAsJsonObject();
            ExternalAccountSource objectResult;
            String objectType = object.getAsJsonPrimitive(discriminator).getAsString();
            if (objectType.equals("bank_account")) {
              objectResult = bankAccountAdapter.fromJsonTree(object);
            } else if (objectType.equals("card")) {
              objectResult = cardAdapter.fromJsonTree(object);
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
