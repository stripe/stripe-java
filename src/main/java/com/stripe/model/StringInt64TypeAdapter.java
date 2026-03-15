package com.stripe.model;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class StringInt64TypeAdapter extends TypeAdapter<Long> {
  /** Serializes Long values as JSON strings and deserializes string-encoded integers. */
  @Override
  public void write(JsonWriter out, Long value) throws IOException {
    if (value == null) {
      out.nullValue();
      return;
    }

    out.value(value.toString());
  }

  @Override
  public Long read(JsonReader in) throws IOException {
    JsonToken token = in.peek();
    if (token == JsonToken.NULL) {
      in.nextNull();
      return null;
    }

    return Long.valueOf(in.nextString());
  }
}
