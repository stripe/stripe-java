package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
  public interface Enum {
    String getValue();
  }

  private static final Gson GSON = new GsonBuilder()
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .registerTypeAdapterFactory(new HasEmptyEnumTypeAdapterFactory())
      .create();

  private static final UntypedMapDeserializer UNTYPED_MAP_DESERIALIZER =
      new UntypedMapDeserializer();

  private static class HasEmptyEnumTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Enum.class.isAssignableFrom(type.getRawType())) {
        return null;
      }

      TypeAdapter<Enum> paramEnum = new TypeAdapter<Enum>() {
        @Override
        public void write(JsonWriter out, Enum value) throws IOException {
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
        public Enum read(JsonReader in) {
          throw new UnsupportedOperationException(
              "No deserialization is expected from this private type adapter for enum param.");
        }
      };
      return (TypeAdapter<T>) paramEnum.nullSafe();
    }
  }

  /**
   * Convenient method to convert this typed request params into an untyped map. This map is
   * composed of {@code Map<String, Object>}, {@code List<Object>}, and basic Java data types.
   * This allows you to test building the request params and verify compatibility with your
   * prior integrations using the untyped params map
   * {@link ApiResource#request(ApiResource.RequestMethod, String, Map, Class, RequestOptions)}.
   *
   * <p>The peculiarity of this conversion is that `EMPTY` {@link ApiRequestParams.Enum} with raw
   * value of empty string will be converted to null. This is compatible with the existing
   * contract enforcing no empty string in the untyped map params.
   *
   * <p>Because of the translation from `EMPTY` enum to null, deserializing this map back to a
   * request instance is lossy. The null value will not be converted back to the `EMPTY` enum.
   */
  public Map<String, Object> toMap() {
    JsonObject json = GSON.toJsonTree(this).getAsJsonObject();
    return UNTYPED_MAP_DESERIALIZER.deserialize(json);
  }
}

