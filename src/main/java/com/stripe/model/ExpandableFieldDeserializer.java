package com.stripe.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

public class ExpandableFieldDeserializer implements JsonDeserializer<ExpandableField> {
	public ExpandableField deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		if (json.isJsonNull()) {
			return null;
		}

		ExpandableField expandableField;

		// Check if json is a String ID. If so, the field has not been expanded, so we only need to serialize a String
		// and create a new ExpandableField with the String id only.
		if (json.isJsonPrimitive()) {
			JsonPrimitive jsonPrimitive = json.getAsJsonPrimitive();
			if (jsonPrimitive.isString()) {
				expandableField = new ExpandableField(jsonPrimitive.getAsString(), null);
				return expandableField;
			}
			else {
				throw new JsonParseException("ExpandableField is a non-string primitive type.");
			}
		}
		// Check if json is an expanded Object. If so, the field has been expanded, so we need to serialize it into the
		// proper typeOfT, and create an ExpandableField with both the String id and this serialized object.
		else if (json.isJsonObject()) {
			// Get the `id` out of the response
			JsonObject fieldAsJsonObject = json.getAsJsonObject();
			String id = fieldAsJsonObject.getAsJsonPrimitive("id").getAsString();
			// We need to get the type inside the generic ExpandableField to make sure fromJson correctly serializes
			// the JsonObject:
			Type clazz = ((ParameterizedType) typeOfT).getActualTypeArguments()[0];
			HasId hasIdObj = (HasId) context.deserialize(json, clazz);
			// =======================================================
			// BEGIN :: Handle type specific expandable properties
			// =======================================================
			if (hasIdObj instanceof BalanceTransactionSourceObject) {
				JsonElement val = fieldAsJsonObject.get("object");
				if (val != null) {
					if ("charge".equals(val.getAsString())) {
						Charge charge = context.deserialize(json, Charge.class);
						((BalanceTransactionSourceObject) hasIdObj).setCharge(charge);
					} else if ("transfer".equals(val.getAsString())) {
						Transfer transfer = context.deserialize(json, Transfer.class);
						((BalanceTransactionSourceObject) hasIdObj).setTransfer(transfer);
					} else if ("refund".equals(val.getAsString())) {
						Refund refund = context.deserialize(json, Refund.class);
						((BalanceTransactionSourceObject) hasIdObj).setRefund(refund);
					}
				}
			}
			// =======================================================
			// TODO support other expandable properties/types (?)
			// =======================================================
			// END :: Handle type specific expandable properties
			// =======================================================
			expandableField = new ExpandableField(id, hasIdObj);
			return expandableField;
		}

		// If json is neither a String nor an Object, error. (We expect all expandable objects to fit the known
		// string-or-object design. If one doesn't, then something may have changed in the API and this code may need to be updated.)
		throw new JsonParseException("ExpandableField is a non-object, non-primitive type.");
	}
}