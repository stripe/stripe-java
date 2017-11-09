package com.stripe.model;

import com.google.gson.*;

import java.lang.reflect.Type;

import com.stripe.model.StripeObject;

public class ExpandableFieldSerializer implements JsonSerializer<ExpandableField> {
	public JsonElement serialize(ExpandableField src, Type typeOfSrc, JsonSerializationContext context) {
		if (src.isExpanded()) {
			return context.serialize(src.getExpanded());
		} else {
			return new JsonPrimitive(src.getId());
		}
	}
}
