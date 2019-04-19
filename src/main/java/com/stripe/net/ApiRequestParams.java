package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.param.common.HasExtraParams;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Super class to all api request params objects. This common abstraction is internally used in
 * {@link ApiResource#request(ApiResource.RequestMethod, String, ApiRequestParams, Class,
 * RequestOptions)}. It also exposes a convenient method converting the typed parameter into
 * the legacy support of untyped {@code Map<String, Object>} param.
 */
public abstract class ApiRequestParams {
  /**
   * Interface implemented by all enum parameter to get the actual string value that Stripe API
   * expects. Internally, it used in custom serialization
   * {@link ApiRequestParams.HasEmptyEnumTypeAdapterFactory} converting empty string enum to null.
   */
  public interface EnumParam {
    String getValue();
  }

  transient protected Map<String, String> extraParams;

  private static final Gson GSON = new GsonBuilder()
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .registerTypeAdapterFactory(new HasExtraParamsTypeAdapterFactory())
      .registerTypeAdapterFactory(new HasEmptyEnumTypeAdapterFactory())
      .create();

  private static final UntypedMapDeserializer UNTYPED_MAP_DESERIALIZER =
      new UntypedMapDeserializer();

  private static class HasEmptyEnumTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!EnumParam.class.isAssignableFrom(type.getRawType())) {
        return null;
      }

      TypeAdapter<EnumParam> paramEnum = new TypeAdapter<EnumParam>() {
        @Override
        public void write(JsonWriter out, EnumParam value) throws IOException {
          if (value.getValue().equals("")) {
            // need to restore serialize null setting
            // not to affect other fields
            boolean previousSetting = out.getSerializeNulls();
            out.setSerializeNulls(true);
            out.nullValue();
            out.setSerializeNulls(previousSetting);
          } else {
            out.value(value.getValue());
          }
        }

        @Override
        public EnumParam read(JsonReader in) {
          throw new UnsupportedOperationException(
              "No deserialization is expected from this private type adapter for enum param.");
        }
      };
      return (TypeAdapter<T>) paramEnum.nullSafe();
    }
  }

  /**
   * Type Adapter to handle deserializing extra params. The main goal is to flatten field
   * that contains extra params.
   */
  private static class HasExtraParamsTypeAdapterFactory implements TypeAdapterFactory {
    public Map<String, Object> deserializeJsonObject(JsonWriter jsonWriter,
                                                     JsonObject jsonObject) throws IOException {
      Map<String, Object> objMap = new HashMap<>();
      jsonWriter.beginObject();
      for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
        String key = entry.getKey();
        jsonWriter.name(key);
        JsonElement element = entry.getValue();
        writeJsonElement(jsonWriter, element);
      }
      jsonWriter.endObject();
      return objMap;
    }

    private void writeJsonElement(JsonWriter jsonWriter, JsonElement element) throws IOException {
      if (element.isJsonNull()) {
        // this is needed because the json delegated at this point would only have null
        // due to empty enum
        boolean oldSerializedNull = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(true);
        jsonWriter.nullValue();
        jsonWriter.setSerializeNulls(oldSerializedNull);
      } else if (element.isJsonObject()) {
        deserializeJsonObject(jsonWriter, element.getAsJsonObject());
      } else if (element.isJsonPrimitive()) {
        writeJsonPrimitive(jsonWriter, element.getAsJsonPrimitive());
      } else if (element.isJsonArray()) {
        writeJsonArray(jsonWriter, element.getAsJsonArray());
      } else {
        System.err.println("Unknown JSON element type for element " + element + ". "
            + "If you're seeing this message, it's probably a bug in the Stripe Java "
            + "library. Please contact us by email at support@stripe.com.");
      }
    }

    private void writeJsonPrimitive(JsonWriter jsonWriter, JsonPrimitive element) throws
        IOException {
      if (element.isBoolean()) {
        jsonWriter.value(element.getAsBoolean());
      } else if (element.isNumber()) {
        jsonWriter.value(element.getAsNumber());
      } else {
        jsonWriter.value(element.getAsString());
      }
    }

    private void writeJsonArray(JsonWriter jsonWriter, JsonArray arr) throws IOException {
      jsonWriter.beginArray();
      Iterator<JsonElement> elemIter = arr.iterator();
      while (elemIter.hasNext()) {
        writeJsonElement(jsonWriter, elemIter.next());
      }
      jsonWriter.endArray();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!HasExtraParams.class.isAssignableFrom(type.getRawType())) {
        return null;
      }

      // we actually want delegator of the subtype of `HasExtraParams`
      final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
      TypeAdapter<T> extraParams = new TypeAdapter<T>() {
        @Override
        public void write(JsonWriter out, T value) throws IOException {

          // we need raw object of the params instead of completing writing out
          // in `delegate.write(out, value)` because the JSON will be closed.
          // we don't use the given `gson` because that will be self-referential, trying to
          // deserialize the value with this type-adapter

          // we don't use `delegate.toJsonTree(value)` because we don't have control of that writer
          JsonTreeWriter treeWriter = jsonWriter();
          delegate.write(treeWriter, value);
          JsonObject jsonElement = treeWriter.get().getAsJsonObject();

          // if it has extra params, we further populate this json element
          if (value instanceof HasExtraParams) {
            HasExtraParams hasExtraParams = (HasExtraParams) value;
            if (hasExtraParams.getExtraParam() != null) {
              Map<String, String> extraParams = hasExtraParams.getExtraParam();
              extraParams.entrySet().forEach(e ->
                  jsonElement.addProperty(e.getKey(), e.getValue()));
            }
          } else {
            throw new IllegalStateException("Only type with ");
          }

          // now that `jsonElement` has flattened extra params,
          // we have to encode back json to the original writer
          deserializeJsonObject(out, jsonElement);
        }

        @Override
        public T read(JsonReader in) {
          throw new UnsupportedOperationException(
              "No deserialization is expected from this private type adapter for .");
        }
      };
      return extraParams.nullSafe();
    }
  }

  /**
   * Convenient method to convert this typed request params into an untyped map. This map is
   * composed of {@code Map<String, Object>}, {@code List<Object>}, and basic Java data types.
   * This allows you to test building the request params and verify compatibility with your
   * prior integrations using the untyped params map
   * {@link ApiResource#request(ApiResource.RequestMethod, String, Map, Class, RequestOptions)}.
   *
   * <p>The peculiarity of this conversion is that `EMPTY` {@link EnumParam} with raw
   * value of empty string will be converted to null. This is compatible with the existing
   * contract enforcing no empty string in the untyped map params.
   *
   * <p>Because of the translation from `EMPTY` enum to null, deserializing this map back to a
   * request instance is lossy. The null value will not be converted back to the `EMPTY` enum.
   */
  public Map<String, Object> toMap() {
    JsonTreeWriter writer = jsonWriter();
    GSON.toJson(this, this.getClass(), writer);
    return UNTYPED_MAP_DESERIALIZER.deserialize(writer.get().getAsJsonObject());
  }

  private static JsonTreeWriter jsonWriter() {
    JsonTreeWriter writer = new JsonTreeWriter();
    writer.setSerializeNulls(false);
    return writer;
  }
}

