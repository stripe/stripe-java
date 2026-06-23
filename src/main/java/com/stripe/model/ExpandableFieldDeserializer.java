package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ExpandableFieldDeserializer implements JsonDeserializer<ExpandableField<?>> {
  /**
   * Deserializes an expandable field JSON payload (i.e. either a string with just the ID, or a full
   * JSON object) into an {@link ExpandableField} object.
   */
  @Override
  public ExpandableField<?> deserialize(
      JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    if (json.isJsonNull()) {
      return null;
    }

    ExpandableField<?> expandableField;

    // Check if json is a String ID. If so, the field has not been expanded, so we only need to
    // serialize a String and create a new ExpandableField with the String id only.
    if (json.isJsonPrimitive()) {
      JsonPrimitive jsonPrimitive = json.getAsJsonPrimitive();
      if (jsonPrimitive.isString()) {
        expandableField = new ExpandableField<>(jsonPrimitive.getAsString(), null);
        return expandableField;
      } else {
        throw new JsonParseException("ExpandableField is a non-string primitive type.");
      }
      // Check if json is an expanded Object. If so, the field has been expanded, so we need to
      // serialize it into the proper typeOfT, and create an ExpandableField with both the String id
      // and this serialized object.
    } else if (json.isJsonObject()) {
      // Get the `id` out of the response
      JsonObject fieldAsJsonObject = json.getAsJsonObject();
      String id = fieldAsJsonObject.getAsJsonPrimitive("id").getAsString();
      // We need to get the type inside the generic ExpandableField to make sure fromJson correctly
      // serializes the JsonObject:
      Type clazz = ((ParameterizedType) typeOfT).getActualTypeArguments()[0];
      expandableField = new ExpandableField<>(id, (HasId) context.deserialize(json, clazz));
      return expandableField;
    }

    // If json is neither a String nor an Object, error. (We expect all expandable objects to fit
    // the known string-or-object design. If one doesn't, then something may have changed in the API
    // and this code may need to be updated.)
    throw new JsonParseException("ExpandableField is a non-object, non-primitive type.");
  }
}
