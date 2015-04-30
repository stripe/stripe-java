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
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class PaymentSourceDeserializer implements JsonDeserializer<PaymentSource> {
    private static final String SOURCE_OBJECT_PROP = "object";

    private static Map<String, Class<?>> typeToClazz;

    public static Map<String, Class<?>> getTypeToClazz() {
        if (PaymentSourceDeserializer.typeToClazz == null) {
            HashMap<String, Class<?>> mapping = new HashMap<String, Class<?>>();
            mapping.put("bitcoin_receiver", BitcoinReceiver.class);
            mapping.put("card", Card.class);
            mapping.put("alipay_account", AlipayAccount.class);
            PaymentSourceDeserializer.setTypeToClazz(mapping);
        }

        return PaymentSourceDeserializer.typeToClazz;
    }

    public static void setTypeToClazz(Map<String, Class<?>> mapping) {
        PaymentSourceDeserializer.typeToClazz = mapping;
    }

    @Override
    public PaymentSource deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        String sourceObject = json.getAsJsonObject().getAsJsonPrimitive(SOURCE_OBJECT_PROP).getAsString();
        Class<?> clazz = PaymentSourceDeserializer.getTypeToClazz().get(sourceObject);

        if (clazz == null) {
            clazz = ConcretePaymentSource.class;
        }

        return (PaymentSource) context.deserialize(json, clazz);
    }
}
