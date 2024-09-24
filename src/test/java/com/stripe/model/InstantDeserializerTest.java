package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.time.Instant;
import org.junit.jupiter.api.Test;

public class InstantDeserializerTest extends BaseStripeTest {

  private static Gson gson = ApiResource.GSON;

  @Test
  public void deserializeNull() {
    final String json = gson.toJson(null);
    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final Instant out = gson.fromJson(json, new TypeToken<Instant>() {}.getType());
    assertNull(out);
  }

  @Test
  public void deserializeString() {
    final String json = gson.toJson("2022-02-15T00:27:45.330Z");
    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final Instant out = gson.fromJson(json, new TypeToken<Instant>() {}.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), out);
  }
}
