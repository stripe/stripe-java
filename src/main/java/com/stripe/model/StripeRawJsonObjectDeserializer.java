package com.stripe.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class StripeRawJsonObjectDeserializer implements JsonDeserializer<StripeRawJsonObject> {
	public StripeRawJsonObject deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		StripeRawJsonObject object = new StripeRawJsonObject();
		object.json = json.getAsJsonObject();
		return object;
	}

}
