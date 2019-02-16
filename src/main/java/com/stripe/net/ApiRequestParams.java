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

public abstract class ApiRequestParams {

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

  public Map<String, Object> toMap() {
    JsonObject json = GSON.toJsonTree(this).getAsJsonObject();
    return UNTYPED_MAP_DESERIALIZER.deserialize(json);
  }
}

