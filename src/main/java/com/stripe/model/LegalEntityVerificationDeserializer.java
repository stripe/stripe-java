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

public class LegalEntityVerificationDeserializer implements JsonDeserializer<LegalEntity.Verification> {
	public LegalEntity.Verification deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
				.registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
				.registerTypeAdapter(Source.class, new SourceTypeDataDeserializer<Source>())
				.registerTypeAdapterFactory(new ExternalAccountTypeAdapterFactory())
				.create();
		if (json.isJsonNull()) {
			return null;
		}

		if (!json.isJsonObject()) {
			throw new JsonParseException("Verification type was not an object, which is problematic.");
		}
		// API Versions 2018-02-TODO and earlier use a string for document and document_back.
		JsonObject verificationAsJsonObject = json.getAsJsonObject();

		JsonElement rawDocument = verificationAsJsonObject.get("document");
		JsonElement rawDocumentBack = verificationAsJsonObject.get("documentBack");

		String documentString = null;
		String documentBackString = null;
		LegalEntity.DocumentSubObject documentSubObject = null;

		if (rawDocument.isJsonPrimitive()) {
			JsonPrimitive documentJsonPrimitive = rawDocument.getAsJsonPrimitive();
			if (!documentJsonPrimitive.isString()) {
				throw new JsonParseException("Document field on a verification was a primitive non-string type.");
			}
			documentString = documentJsonPrimitive.getAsString();
			JsonPrimitive documentBackJsonPrimitive = rawDocumentBack.getAsJsonPrimitive();
			if (!documentBackJsonPrimitive.isString()) {
			    throw new JsonParseException("DocumenntBack field on a verification was a primitive non-string type.");
			}
			documentBackString = documentBackJsonPrimitive.getAsString();
		} else if (rawDocument.isJsonObject()) {
			JsonObject documentJsonObject = rawDocument.getAsJsonObject();
			documentSubObject = gson.fromJson(documentJsonObject, LegalEntity.DocumentSubObject.class);
		} else if (!rawDocument.isJsonNull()) {
		    throw new JsonParseException("Document field on a dispute was a non-primitive, non-object type.");
		}
		verificationAsJsonObject.remove("document");
		verificationAsJsonObject.remove("documentBack");
		LegalEntity.Verification parsedData = gson.fromJson(json, typeOfT);
		parsedData.setDocument(documentString);
		parsedData.setDocumentBack(documentBackString);
		parsedData.setDocumentSubObject(documentSubObject);
		
		return parsedData;
	}
}
