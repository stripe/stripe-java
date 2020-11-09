// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import lombok.Getter;

/**
 * Creates type adapter for interface {@code PaymentSource} able to deserialize raw JSON to subtype
 * implementation based on discriminator field {@code object}.
 */
public class PaymentSourceTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!PaymentSource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<com.stripe.model.PaymentSource> paymentSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.PaymentSource.class));
    final TypeAdapter<com.stripe.model.Account> accountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Account.class));
    final TypeAdapter<com.stripe.model.AlipayAccount> alipayAccountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.AlipayAccount.class));
    final TypeAdapter<com.stripe.model.BankAccount> bankAccountAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.BankAccount.class));
    final TypeAdapter<com.stripe.model.BitcoinReceiver> bitcoinReceiverAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.BitcoinReceiver.class));
    final TypeAdapter<com.stripe.model.Card> cardAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Card.class));
    final TypeAdapter<com.stripe.model.Source> sourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Source.class));

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
            if ("account".equals(objectType)) {
              objectResult = accountAdapter.fromJsonTree(object);
            } else if ("alipay_account".equals(objectType)) {
              objectResult = alipayAccountAdapter.fromJsonTree(object);
            } else if ("bank_account".equals(objectType)) {
              objectResult = bankAccountAdapter.fromJsonTree(object);
            } else if ("bitcoin_receiver".equals(objectType)) {
              objectResult = bitcoinReceiverAdapter.fromJsonTree(object);
            } else if ("card".equals(objectType)) {
              objectResult = cardAdapter.fromJsonTree(object);
            } else if ("source".equals(objectType)) {
              objectResult = sourceAdapter.fromJsonTree(object);
            } else {
              String id = object.getAsJsonPrimitive("id").getAsString();
              objectResult = new UnknownSubType(id, objectType, object.toString());
            }
            return objectResult;
          }
        };
    return (TypeAdapter<T>) resultCustomTypeAdapter.nullSafe();
  }

  /**
   * Unknown subtype of {@link com.stripe.model.PaymentSource}. If this class is the outcome of
   * deserialization, please contact support@stripe.com for assistance and provide the id and object
   * value. Do not integrate with this object, but raise an exception and log its content instead.
   */
  public static class UnknownSubType extends StripeObject implements PaymentSource {
    String id;
    @Getter String object;
    @Getter String rawJson;

    private UnknownSubType(String id, String object, String rawJson) {
      this.id = id;
      this.object = object;
      this.rawJson = rawJson;
    }

    @Override
    public String getId() {
      return this.id;
    }
  }
}
