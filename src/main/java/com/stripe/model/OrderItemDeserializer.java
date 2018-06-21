package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class OrderItemDeserializer implements JsonDeserializer<OrderItem> {

  @SuppressWarnings("rawtypes")
  static final Map<String, Class> parentObjMap = new HashMap<String, Class>();

  static {
    parentObjMap.put("discount", Discount.class);
    parentObjMap.put("sku", Sku.class);
  }

  @Override
  @SuppressWarnings("unchecked")
  public OrderItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    if (json.isJsonNull()) {
      return null;
    }

    if (!json.isJsonObject()) {
      throw new JsonParseException("OrderItem type was not an object, which is problematic.");
    }

    JsonObject oiAsJsonObject = json.getAsJsonObject();

    JsonElement parent = oiAsJsonObject.get("parent");

    oiAsJsonObject.remove("parent");

    Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create();

    OrderItem orderItem = gson.fromJson(json, typeOfT);

    String parentId = null;

    if (parent.isJsonPrimitive()) {
      JsonPrimitive parentJsonPrimitive = parent.getAsJsonPrimitive();
      if (!parentJsonPrimitive.isString()) {
        throw new JsonParseException(
            "parent field on an order item was a primitive non-string type.");
      }
      parentId = parentJsonPrimitive.getAsString();
    } else if (parent.isJsonObject()) {
      JsonObject parentJsonObject = parent.getAsJsonObject();
      JsonElement parentIdEl = parentJsonObject.get("id");
      parentId = parentIdEl != null ? parentIdEl.getAsString() : null;
      JsonElement val = parentJsonObject.get("object");
      if (val != null) {
        String type = val.getAsString();
        Class<? extends HasId> parentObjClass = parentObjMap.get(type);
        if (parentObjClass != null) {
          HasId parentObj = context.deserialize(parent, parentObjClass);
          orderItem.setParentObject(parentObj);
        }
      }
    } else if (!parent.isJsonNull()) {
      throw new JsonParseException(
          "parent field on an order item was a non-primitive, non-object type.");
    }

    orderItem.setParent(parentId);

    return orderItem;
  }
}
