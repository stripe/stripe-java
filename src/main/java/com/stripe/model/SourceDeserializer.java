package com.stripe.model;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.HashMap;

public class SourceDeserializer implements JsonDeserializer<Source> {

	private void populateMapFromJSONObject(Map<String, String> objMap, JsonObject jsonObject) {
		for (Map.Entry<String, JsonElement> entry: jsonObject.entrySet()) {
			String key = entry.getKey();
			JsonElement val = entry.getValue();
			String value;
			if (!val.isJsonNull()) {
				value = entry.getValue().getAsString();
				objMap.put(key, value);
			}
		}
	}

	public Source deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

		if (json.isJsonNull()) {
			return null;
		}

		if (!json.isJsonObject()) {
			throw new JsonParseException("Source type was not an object, which is problematic.");
		}

		JsonObject sourceAsJsonObject = json.getAsJsonObject();

		// Get the `type` out of the response.
		String type = sourceAsJsonObject.getAsJsonPrimitive("type").getAsString();

		// Populate the `typeData` from the `type` property.
		Map<String, String> typeData = new HashMap<String, String>();
		populateMapFromJSONObject(typeData, sourceAsJsonObject.getAsJsonObject(type));

		// Remove the `type` property.
		sourceAsJsonObject.remove(type);
		Source parsedData = gson.fromJson(json, typeOfT);
		parsedData.setTypeData(typeData);

		return parsedData;
	}
}

