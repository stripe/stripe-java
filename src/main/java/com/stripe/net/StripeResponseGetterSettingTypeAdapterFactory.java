package com.stripe.net;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.model.*;
import java.io.IOException;

class StripeResponseGetterSettingTypeAdapterFactory implements TypeAdapterFactory {
  @Override
  public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
    final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);

    return new TypeAdapter<T>() {

      @Override
      public void write(JsonWriter out, T value) throws IOException {
        delegate.write(out, value);
      }

      @Override
      public T read(JsonReader in) throws IOException {
        T obj = delegate.read(in);
        if (obj instanceof StripeActiveObject) {
          ((StripeActiveObject) obj).setResponseGetter(ApiResource.getGlobalResponseGetter());
        }
        return obj;
      }
    };
  }
}
