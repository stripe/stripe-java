package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.stripe.net.StripeResponse;

import java.lang.reflect.Field;

public abstract class StripeObject {

  public static final Gson PRETTY_PRINT_GSON = new GsonBuilder()
      .setPrettyPrinting()
      .serializeNulls()
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .registerTypeAdapter(ExpandableField.class, new ExpandableFieldSerializer())
      .create();

  @Override
  public String toString() {
    return String.format(
        "<%s@%s id=%s> JSON: %s",
        this.getClass().getName(),
        System.identityHashCode(this),
        this.getIdString(),
        PRETTY_PRINT_GSON.toJson(this));
  }

  public StripeResponse getLastResponse() {
    return lastResponse;
  }

  public void setLastResponse(StripeResponse response) {
    this.lastResponse = response;
  }

  public String toJson() {
    return PRETTY_PRINT_GSON.toJson(this);
  }

  private transient StripeResponse lastResponse;

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
