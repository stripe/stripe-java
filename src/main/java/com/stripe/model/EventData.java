
package com.stripe.model;

import com.google.gson.JsonElement;
import com.stripe.net.ApiResource;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventData extends StripeObject {
  JsonElement object;
  Map<String, Object> previousAttributes;

  @Deprecated
  public StripeObject getObject() {
    String type = object.getAsJsonObject().get("object").getAsString();
    Class<? extends StripeObject> cl = EventDataClassLookup.findClass(type);
    return ApiResource.GSON.fromJson(
        object, cl != null ? cl : StripeRawJsonObject.class);
  }
}