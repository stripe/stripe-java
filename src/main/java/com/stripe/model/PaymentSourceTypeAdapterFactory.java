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

public class PaymentSourceTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!PaymentSource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<PaymentSource> paymentSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(PaymentSource.class));
    final TypeAdapter<Account> accountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Account.class));
    final TypeAdapter<AlipayAccount> alipayAccountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(AlipayAccount.class));
    final TypeAdapter<BankAccount> bankAccountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(BankAccount.class));
    final TypeAdapter<BitcoinReceiver> bitcoinReceiverAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(BitcoinReceiver.class));
    final TypeAdapter<Card> cardAdapter = gson.getDelegateAdapter(this, TypeToken.get(Card.class));
    final TypeAdapter<Source> sourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Source.class));

    TypeAdapter<PaymentSource> resultCustomTypeAdapter =
        new TypeAdapter<PaymentSource>() {
          @Override
          public void write(JsonWriter out, PaymentSource value) throws IOException {
            paymentSourceAdapter.write(out, value);
          }

          @Override
          public PaymentSource read(JsonReader in) throws IOException {
            JsonObject object = jsonElementAdapter.read(in).getAsJsonObject();
            PaymentSource objectResult;
            String objectType = object.getAsJsonPrimitive(discriminator).getAsString();
            if (objectType.equals("account")) {
              objectResult = accountAdapter.fromJsonTree(object);
            } else if (objectType.equals("alipay_account")) {
              objectResult = alipayAccountAdapter.fromJsonTree(object);
            } else if (objectType.equals("bank_account")) {
              objectResult = bankAccountAdapter.fromJsonTree(object);
            } else if (objectType.equals("bitcoin_receiver")) {
              objectResult = bitcoinReceiverAdapter.fromJsonTree(object);
            } else if (objectType.equals("card")) {
              objectResult = cardAdapter.fromJsonTree(object);
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
