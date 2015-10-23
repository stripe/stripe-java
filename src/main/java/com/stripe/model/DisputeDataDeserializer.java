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

public class DisputeDataDeserializer implements JsonDeserializer<Dispute> {
	public Dispute deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
				.create();
		if (json.isJsonNull()) {
			return null;
		}

		if (!json.isJsonObject()) {
			throw new JsonParseException("Dispute type was not an object, which is problematic.");
		}
		// API Versions 2014-12-TODO and earlier use a string for evidence, and we've renamed that to evidenceString.
		JsonObject disputeAsJsonObject = json.getAsJsonObject();

		JsonElement rawEvidence = disputeAsJsonObject.get("evidence");

		String evidenceString = null;
		EvidenceSubObject evidenceSubObject = null;

		if (rawEvidence.isJsonPrimitive()) {
			JsonPrimitive evidenceJsonPrimitive = rawEvidence.getAsJsonPrimitive();
			if (!evidenceJsonPrimitive.isString()) {
				throw new JsonParseException("Evidence field on a dispute was a primitive non-string type.");
			}
			evidenceString = evidenceJsonPrimitive.getAsString();
		} else if (rawEvidence.isJsonObject()) {
			JsonObject evidenceJsonObject = rawEvidence.getAsJsonObject();
			evidenceSubObject = gson.fromJson(evidenceJsonObject, EvidenceSubObject.class);
		} else if (!rawEvidence.isJsonNull()) {
			throw new JsonParseException("Evidence field on a dispute was a non-primitive, non-object type.");
		}
		disputeAsJsonObject.remove("evidence");
		Dispute parsedData = gson.fromJson(json, typeOfT);
		parsedData.setEvidence(evidenceString);
		parsedData.setEvidenceSubObject(evidenceSubObject);

		return parsedData;
	}
}
