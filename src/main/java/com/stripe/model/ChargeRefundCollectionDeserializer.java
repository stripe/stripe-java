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

public class ChargeRefundCollectionDeserializer implements JsonDeserializer<ChargeRefundCollection> {

	public ChargeRefundCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
		throws JsonParseException {
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

		// API versions 2014-05-19 and earlier render charge refunds as an array instead of an object
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
