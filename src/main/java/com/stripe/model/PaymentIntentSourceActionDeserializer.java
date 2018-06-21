package com.stripe.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.stripe.net.ApiResource;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PaymentIntentSourceActionDeserializer implements
    JsonDeserializer<PaymentIntentSourceAction> {

  static final Map<String, Class<? extends PaymentIntentSourceActionValue>> objectMap =
      new HashMap<String, Class<? extends PaymentIntentSourceActionValue>>();

  static {
    objectMap.put("authorize_with_url", PaymentIntentSourceActionValueAuthorizeWithUrl.class);
  }

  /**
   * Deserializes the JSON payload contained in a next_source_action attribute into a
   * {@link PaymentIntentSourceAction} instance.
   */
  @Override
  public PaymentIntentSourceAction deserialize(JsonElement json, Type typeOfT,
      JsonDeserializationContext context)
      throws JsonParseException {
    PaymentIntentSourceAction sourceAction = new PaymentIntentSourceAction();
    JsonObject jsonObject = json.getAsJsonObject();
    String type = jsonObject.get("type").getAsString();
    sourceAction.setType(type);
    Class<? extends PaymentIntentSourceActionValue> cl = objectMap.get(type);
    if (cl != null) {
      PaymentIntentSourceActionValue value = ApiResource.GSON.fromJson(jsonObject.get("value"), cl);
      sourceAction.setValue(value);
    }
    return sourceAction;
  }
}
