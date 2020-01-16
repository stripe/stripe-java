package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.stripe.net.ApiResource;
import com.stripe.net.StripeResponse;
import java.lang.reflect.Field;

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
          ApiResource.GSON.fromJson(this.getLastResponse().body(), JsonObject.class);
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
}
