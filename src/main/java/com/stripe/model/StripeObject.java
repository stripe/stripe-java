package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.stripe.net.ApiResource;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class StripeObject implements StripeObjectInterface {
  public static final Gson PRETTY_PRINT_GSON =
      new GsonBuilder()
          .setPrettyPrinting()
          .serializeNulls()
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .registerTypeAdapter(ExpandableField.class, new ExpandableFieldSerializer())
          .create();

  private transient StripeResponse lastResponse;

  private transient JsonObject rawJsonObject;

  @Override
  public String toString() {
    return String.format(
        "<%s@%s id=%s> JSON: %s",
        this.getClass().getName(),
        System.identityHashCode(this),
        this.getIdString(),
        PRETTY_PRINT_GSON.toJson(this));
  }

  @Override
  public StripeResponse getLastResponse() {
    return lastResponse;
  }

  @Override
  public void setLastResponse(StripeResponse response) {
    this.lastResponse = response;
  }

  /**
   * Returns the raw JsonObject exposed by the Gson library. This can be used to access properties
   * that are not directly exposed by Stripe's Java library.
   *
   * <p>Note: You should always prefer using the standard property accessors whenever possible.
   * Because this method exposes Gson's underlying API, it is not considered fully stable. Stripe's
   * Java library might move off Gson in the future and this method would be removed or change
   * significantly.
   *
   * @return The raw JsonObject.
   */
  public JsonObject getRawJsonObject() {
    // Lazily initialize this the first time the getter is called.
    if ((this.rawJsonObject == null) && (this.getLastResponse() != null)) {
      this.rawJsonObject =
          ApiResource.INTERNAL_GSON.fromJson(this.getLastResponse().body(), JsonObject.class);
    }

    return this.rawJsonObject;
  }

  public String toJson() {
    return PRETTY_PRINT_GSON.toJson(this);
  }

  private Object getIdString() {
    try {
      Field idField = this.getClass().getDeclaredField("id");
      return idField.get(this);
    } catch (SecurityException e) {
      return "";
    } catch (NoSuchFieldException e) {
      return "";
    } catch (IllegalArgumentException e) {
      return "";
    } catch (IllegalAccessException e) {
      return "";
    }
  }

  protected static boolean equals(Object a, Object b) {
    return a == null ? b == null : a.equals(b);
  }

  /**
   * Deserialize JSON into super class {@code StripeObject} where the underlying concrete class
   * corresponds to type specified in root-level {@code object} field of the JSON input.
   *
   * <p>Note that the expected JSON input is data at the {@code object} value, as a sibling to
   * {@code previousAttributes}, and not the discriminator field containing a string.
   *
   * @return JSON data to be deserialized to super class {@code StripeObject}
   */
  public static StripeObject deserializeStripeObject(JsonObject eventDataObjectJson) {
    return deserializeStripeObject(eventDataObjectJson, ApiResource.getGlobalResponseGetter());
  }

  static StripeObject deserializeStripeObject(
      JsonObject eventDataObjectJson, StripeResponseGetter responseGetter) {
    String type = eventDataObjectJson.getAsJsonObject().get("object").getAsString();
    Class<? extends StripeObject> cl = EventDataClassLookup.classLookup.get(type);
    StripeObject object =
        ApiResource.deserializeStripeObject(
            eventDataObjectJson, cl != null ? cl : StripeRawJsonObject.class, responseGetter);
    return object;
  }

  public static StripeObject deserializeStripeObject(
      String payload, StripeResponseGetter responseGetter) {
    JsonObject jsonObject = ApiResource.GSON.fromJson(payload, JsonObject.class).getAsJsonObject();
    return deserializeStripeObject(jsonObject, responseGetter);
  }

  public static StripeObject deserializeStripeObject(
      JsonObject payload, Type type, StripeResponseGetter responseGetter) {
    StripeObject object = ApiResource.INTERNAL_GSON.fromJson(payload, type);

    if (object instanceof StripeActiveObject) {
      ((StripeActiveObject) object).setResponseGetter(responseGetter);
    }

    return object;
  }

  @SuppressWarnings("unchecked")
  public static <T> T deserializeStripeObject(
      String payload, Class<T> type, StripeResponseGetter responseGetter) {
    return (T) deserializeStripeObject(payload, (Type) type, responseGetter);
  }

  public static StripeObject deserializeStripeObject(
      String payload, Type type, StripeResponseGetter responseGetter) {
    StripeObject object = ApiResource.INTERNAL_GSON.fromJson(payload, type);

    if (object instanceof StripeActiveObject) {
      ((StripeActiveObject) object).setResponseGetter(responseGetter);
    }

    return object;
  }
}
