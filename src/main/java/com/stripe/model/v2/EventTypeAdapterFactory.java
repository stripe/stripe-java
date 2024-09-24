package com.stripe.model.v2;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.model.ThinEvent;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class EventTypeAdapterFactory implements TypeAdapterFactory {
  @Override
  public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
    if (type == null) {
      return null;
    }

    if (!ThinEvent.class.equals(type.getRawType())) {
      return null;
    }

    final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<R> fallbackAdapter = gson.getDelegateAdapter(this, type);
    final Map<String, TypeAdapter<?>> eventAdapters = new LinkedHashMap<>();

    for (Map.Entry<String, Class<? extends ThinEvent>> entry :
        EventDataClassLookup.eventClassLookup.entrySet()) {
      TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
      eventAdapters.put(entry.getKey(), delegate);
    }

    return new TypeAdapter<R>() {
      @Override
      @SuppressWarnings("unchecked")
      public R read(JsonReader in) throws IOException {
        JsonElement jsonElement = elementAdapter.read(in);
        JsonElement typeElement = jsonElement.getAsJsonObject().get("type");

        TypeAdapter<R> selectedAdapter = null;

        if (typeElement != null && !typeElement.isJsonNull()) {
          String eventType = typeElement.getAsString();
          selectedAdapter = (TypeAdapter<R>) eventAdapters.get(eventType);
        }

        if (selectedAdapter == null) {
          selectedAdapter = fallbackAdapter;
        }

        return selectedAdapter.fromJsonTree(jsonElement);
      }

      @Override
      public void write(JsonWriter out, R value) throws IOException {
        throw new UnsupportedOperationException();
      }
    }.nullSafe();
  }
}
