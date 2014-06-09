package com.stripe.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;

import com.stripe.net.APIResource;

public class ChargeRefundCollectionDeserializer implements JsonDeserializer<ChargeRefundCollection> {

	public ChargeRefundCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
		throws JsonParseException {
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

		// Before Version 2014-06-01, refunds was a JSON array instead of a sublist
		if (json.isJsonArray()) {
			Type refundListType = new TypeToken<List<Refund>>() {}.getType();
			List<Refund> refunds = gson.fromJson(json, refundListType);
			ChargeRefundCollection collection = new ChargeRefundCollection();
			collection.setData(refunds);
			collection.setHasMore(false);
			collection.setTotalCount(refunds.size());
			return collection;
		}

		return gson.fromJson(json, typeOfT);
	}
}
