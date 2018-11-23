package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.stripe.net.ApiResource;

import java.lang.reflect.Type;
import java.util.HashMap;
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
    if (json.isJsonNull()) {
      return null;
    }

    if (!json.isJsonObject()) {
      throw new JsonParseException(
          "Next source action was not an object, which is problematic.");
    }

    JsonObject actionAsJsonObject = json.getAsJsonObject();
    JsonElement valueJson = actionAsJsonObject.get("value");
    actionAsJsonObject.remove("value");

    Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create();
    PaymentIntentSourceAction sourceAction = gson.fromJson(json, PaymentIntentSourceAction.class);

    // For legacy reasons we still want to support deserialization of the `value` hash if any.
    String type = actionAsJsonObject.get("type").getAsString();
    Class<? extends PaymentIntentSourceActionValue> cl = objectMap.get(type);
    if (cl != null) {
      PaymentIntentSourceActionValue value = ApiResource.GSON.fromJson(valueJson, cl);
      sourceAction.setValue(value);
    }
    return sourceAction;
  }
}
