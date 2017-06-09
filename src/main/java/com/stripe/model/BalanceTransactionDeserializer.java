package com.stripe.model;

import java.lang.reflect.Type;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

public class BalanceTransactionDeserializer implements JsonDeserializer<BalanceTransaction> {

	@Override
	public BalanceTransaction deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
				.create();
		
		if (json.isJsonNull()) {
			return null;
		}

		if (!json.isJsonObject()) {
			throw new JsonParseException("BalanceTransaction type was not an object, which is problematic.");
		}
		
		JsonObject btAsJsonObject = json.getAsJsonObject();

		JsonElement source = btAsJsonObject.get("source");
		
		btAsJsonObject.remove("source");

		BalanceTransaction balanceTransaction = gson.fromJson(json, typeOfT);
		
		String sourceId = null;

		if (source.isJsonPrimitive()) {
			JsonPrimitive sourceJsonPrimitive = source.getAsJsonPrimitive();
			if (!sourceJsonPrimitive.isString()) {
				throw new JsonParseException("Source field on a balance transaction was a primitive non-string type.");
			}
			sourceId = sourceJsonPrimitive.getAsString();
		} else if (source.isJsonObject()) {
			JsonObject sourceJsonObject = source.getAsJsonObject();
			JsonElement sourceIdEl = sourceJsonObject.get("id");
			sourceId = sourceIdEl != null ? sourceIdEl.getAsString() : null;
			JsonElement val = sourceJsonObject.get("object");
			if (val != null) {
				Class<? extends HasId> sourceObjClass = null;
				if ("charge".equals(val.getAsString())) {
					sourceObjClass = Charge.class;
				} else if ("transfer".equals(val.getAsString())) {
					sourceObjClass = Transfer.class;
				} else if ("refund".equals(val.getAsString())) {
					sourceObjClass = Refund.class;
				}
				// TODO support other source types (?)
				if (sourceObjClass != null) {
					HasId sourceObj = context.deserialize(source, sourceObjClass);
					balanceTransaction.setSourceObject(sourceObj);
				}
			}
		} else if (!source.isJsonNull()) {
			throw new JsonParseException("Source field on a balance transaction was a non-primitive, non-object type.");
		}
		
		balanceTransaction.setSource(sourceId);

		return balanceTransaction;
	}

}
