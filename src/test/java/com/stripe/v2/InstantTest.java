package com.stripe.v2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.net.ApiResource;
import java.time.Instant;
import org.junit.jupiter.api.Test;

public class InstantTest {
  @Test
  public void testDeserialize() {
    final Instant instant =
        ApiResource.GSON.fromJson("\"2023-03-01T22:08:48.920Z\"", Instant.class);
    assertNotNull(instant);
    assertEquals(Instant.parse("2023-03-01T22:08:48.920Z"), instant);
  }

  @Test
  public void testDeserializeNull() {
    final Instant instant = ApiResource.GSON.fromJson("null", Instant.class);
    assertNull(instant);
  }

  @Test
  public void testSerialize() {
    final String instantJson =
        ApiResource.GSON.toJson(Instant.parse("2023-03-01T22:08:48.920Z"), Instant.class);
    assertEquals("\"2023-03-01T22:08:48.920Z\"", instantJson);
  }

  @Test
  public void testSerializeNull() {
    final String instantJson = ApiResource.GSON.toJson(null, Instant.class);
    assertEquals("null", instantJson);
  }
}
