package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

final class JsonEncoder {
  /**
   * Serializes BigDecimal as a JSON string (e.g., "25.5") rather than a JSON number (25.5). All
   * BigDecimal fields in the Stripe API use format: decimal, and the V2 API expects them as strings
   * on the wire.
   */
  private static final TypeAdapter<BigDecimal> BIG_DECIMAL_STRING_ADAPTER =
      new TypeAdapter<BigDecimal>() {
        @Override
        public void write(JsonWriter out, BigDecimal value) throws IOException {
          if (value == null) {
            out.nullValue();
          } else {
            out.value(value.toPlainString());
          }
        }

        @Override
        public BigDecimal read(JsonReader in) throws IOException {
          return new BigDecimal(in.nextString());
        }
      };

  private static final Gson BODY_GSON =
      new GsonBuilder()
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .serializeNulls()
          .registerTypeAdapter(BigDecimal.class, BIG_DECIMAL_STRING_ADAPTER)
          .create();

  public static HttpContent createHttpContent(Map<String, Object> params) throws IOException {
    if (params == null) {
      params = new HashMap<String, Object>();
    }
    return HttpContent.buildJsonContent(BODY_GSON.toJson(params));
  }
}
