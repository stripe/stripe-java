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
 * Creates type adapter for interface {@code
 * PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions} able to deserialize raw
 * JSON to subtype implementation based on discriminator field {@code object}.
 */
public
class PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptionsTypeAdapterFactory
    implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions.class
        .isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<
            com.stripe.model.PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions>
        paymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptionsAdapter =
            gson.getDelegateAdapter(
                this,
                TypeToken.get(
                    com.stripe.model
                        .PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions
                        .class));
    final TypeAdapter<com.stripe.model.checkout.Session.PaymentMethodOptionsForPayment>
        checkoutPaymentMethodOptionsForPaymentAdapter =
            gson.getDelegateAdapter(
                this,
                TypeToken.get(
                    com.stripe.model.checkout.Session.PaymentMethodOptionsForPayment.class));
    final TypeAdapter<com.stripe.model.checkout.Session.PaymentMethodOptionsForSetup>
        checkoutPaymentMethodOptionsForSetupAdapter =
            gson.getDelegateAdapter(
                this,
                TypeToken.get(
                    com.stripe.model.checkout.Session.PaymentMethodOptionsForSetup.class));

    TypeAdapter<PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions>
        resultCustomTypeAdapter =
            new TypeAdapter<
                PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions>() {
              @Override
              public void write(
                  JsonWriter out,
                  PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions value)
                  throws IOException {
                paymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptionsAdapter.write(
                    out, value);
              }

              @Override
              public PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions read(
                  JsonReader in) throws IOException {
                JsonObject object = jsonElementAdapter.read(in).getAsJsonObject();
                PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions objectResult;
                String objectType = object.getAsJsonPrimitive(discriminator).getAsString();
                if ("checkout_session_payment_method_options_for_payment".equals(objectType)) {
                  objectResult = checkoutPaymentMethodOptionsForPaymentAdapter.fromJsonTree(object);
                } else if ("checkout_session_payment_method_options_for_setup".equals(objectType)) {
                  objectResult = checkoutPaymentMethodOptionsForSetupAdapter.fromJsonTree(object);
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
   * Unknown subtype of {@link
   * com.stripe.model.PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions}. If
   * this class is the outcome of deserialization, please contact support@stripe.com for assistance
   * and provide the id and object value. Do not integrate with this object, but raise an exception
   * and log its content instead.
   */
  public static class UnknownSubType extends StripeObject
      implements PaymentPagesCheckoutSessionCheckoutSessionResourcePaymentMethodOptions {
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
