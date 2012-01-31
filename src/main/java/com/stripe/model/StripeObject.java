package com.stripe.model;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class StripeObject {
	
	public static final Gson prettyPrintGson = new GsonBuilder().
		setPrettyPrinting().
		serializeNulls().
		setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).
		registerTypeAdapter(EventData.class, new EventDataDeserializer()).
		create();
	
	@Override public String toString() {
		return String.format(
			"<%s@%s id=%s> JSON: %s",
			this.getClass().getName(),
			System.identityHashCode(this),
			this.getIdString(),
			prettyPrintGson.toJson(this));
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
}