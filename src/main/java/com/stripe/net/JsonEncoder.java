package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Map;

final class JsonEncoder {
  private static final Gson BODY_GSON =
      new GsonBuilder()
          .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
          .serializeNulls()
          .create();

  public static HttpContent createHttpContent(Map<String, Object> params) throws IOException {
    return HttpContent.buildJsonContent(BODY_GSON.toJson(params));
  }
}
