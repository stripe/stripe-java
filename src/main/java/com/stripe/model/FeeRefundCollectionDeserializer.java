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

public class FeeRefundCollectionDeserializer implements JsonDeserializer<FeeRefundCollection> {

	public FeeRefundCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
		throws JsonParseException {
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

		// API versions 2014-07-26 and earlier render application fee refunds as an array instead of an object
		if (json.isJsonArray()) {
			Type refundListType = new TypeToken<List<FeeRefund>>() {}.getType();
			List<FeeRefund> refunds = gson.fromJson(json, refundListType);
			FeeRefundCollection collection = new FeeRefundCollection();
			collection.setData(refunds);
			collection.setHasMore(false);
			collection.setTotalCount(refunds.size());
			return collection;
		}
		else {
			return gson.fromJson(json, typeOfT);
		}
	}
}
