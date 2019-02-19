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

public class PersonVerificationDeserializer implements JsonDeserializer<Person.Verification> {
  /**
   * Deserializes a person.verification JSON payload into a {@link Person.Verification} object.
   */
  @Override
  public Person.Verification deserialize(JsonElement json, Type typeOfT,
      JsonDeserializationContext context) throws JsonParseException {
    Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
        .create();
    if (json.isJsonNull()) {
      return null;
    }

    if (!json.isJsonObject()) {
      throw new JsonParseException(
          "Person.Verification type was not an object, which is problematic.");
    }
    // Before API version 2019-02-19, `document` was an expandable file, i.e. either a string (a
    // file ID) or a File object. From API version 2019-02-19 on, `document` is a
    // `Person.VerificationDocument`.
    JsonObject verificationAsJsonObject = json.getAsJsonObject();

    JsonElement rawDocument = verificationAsJsonObject.get("document");

    String documentString = null;
    File documentFile = null;
    Person.VerificationDocument documentSubObject = null;

    if (rawDocument.isJsonPrimitive()) {
      JsonPrimitive documentJsonPrimitive = rawDocument.getAsJsonPrimitive();
      if (!documentJsonPrimitive.isString()) {
        throw new JsonParseException(
            "document field on a Person.Verification was a primitive non-string type.");
      }
      // document is a string, i.e. an old-style unexpanded document
      documentString = documentJsonPrimitive.getAsString();
    } else if (rawDocument.isJsonObject()) {
      JsonObject documentJsonObject = rawDocument.getAsJsonObject();
      if (documentJsonObject.has("object")) {
        // document is a JSON object and has an `object` key, so it's an old-style expanded File
        // object
        documentFile = gson.fromJson(documentJsonObject, File.class);
      } else {
        // document is a JSON object and doesn't have an `object` key, so it's a new-style
        // Person.VerificationDocument object
        documentSubObject = gson.fromJson(documentJsonObject, Person.VerificationDocument.class);
      }
    } else if (!rawDocument.isJsonNull()) {
      throw new JsonParseException(
          "document field on a Person.Verification was a non-primitive, non-object type.");
    }
    verificationAsJsonObject.remove("document");
    Person.Verification parsedData = gson.fromJson(json, typeOfT);
    if (documentFile != null) {
      setDocumentFile(parsedData, documentFile);
    } else {
      setDocumentString(parsedData, documentString);
    }
    parsedData.setDocumentSubObject(documentSubObject);

    return parsedData;
  }

  @SuppressWarnings("deprecation")
  private static void setDocumentString(Person.Verification verification, String documentString) {
    verification.setDocument(documentString);
  }

  @SuppressWarnings("deprecation")
  private static void setDocumentFile(Person.Verification verification, File documentFile) {
    verification.setDocumentObject(documentFile);
  }
}
