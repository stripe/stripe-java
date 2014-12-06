package com.stripe.model;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class FeeRefundCollectionDeserializer implements JsonDeserializer<FeeRefundCollection> {

	public static final Type REFUND_LIST_TYPE = new TypeToken<List<FeeRefund>>() {}.getType();

	public FeeRefundCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
		throws JsonParseException {
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

		// API versions 2014-07-26 and earlier render application fee refunds as an array instead of an object
		if (json.isJsonArray()) {
			List<FeeRefund> refunds = gson.fromJson(json, REFUND_LIST_TYPE);
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
