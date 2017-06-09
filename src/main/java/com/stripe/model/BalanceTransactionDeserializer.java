package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class BalanceTransactionDeserializer implements JsonDeserializer<BalanceTransaction> {

	@SuppressWarnings("rawtypes")
	static final Map<String, Class> sourceObjMap = new HashMap<String, Class>();
	static {
		sourceObjMap.put("application_fee", ApplicationFee.class);
		sourceObjMap.put("charge", Charge.class);
		sourceObjMap.put("dispute", Dispute.class);
		sourceObjMap.put("fee_refund", FeeRefund.class);
		sourceObjMap.put("payout", Payout.class);
		sourceObjMap.put("refund", Refund.class);
		sourceObjMap.put("transfer", Transfer.class);
		sourceObjMap.put("transfer_reversal", Reversal.class);
	}

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
				String type = val.getAsString();
				Class<? extends HasId> sourceObjClass = sourceObjMap.get(type);
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
