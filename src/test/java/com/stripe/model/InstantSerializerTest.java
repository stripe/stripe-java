package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.time.Instant;
import org.junit.jupiter.api.Test;

public class InstantSerializerTest extends BaseStripeTest {

  private static Gson gson = ApiResource.GSON;

  private static class TestTopLevelObject extends StripeObject {
    @SuppressWarnings("unused")
    Instant nested;
  }

  @Test
  public void serializeInstant() {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = Instant.parse("2022-02-15T00:27:45.330Z");

    final String expected = "{\n  \"nested\": \"2022-02-15T00:27:45.330Z\"\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeNull() {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = null;

    final String expected = "{\n  \"nested\": null\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeDeserialize() {
    final TestTopLevelObject object = new TestTopLevelObject();
    final Instant instant = Instant.parse("2022-02-15T00:27:45.330Z");
    object.nested = Instant.parse("2022-02-15T00:27:45.330Z");

    final String json = object.toJson();

    // Gson also uses TypeTokens internally to get around Type Erasure for generic types, simulate
    // that here:
    final TestTopLevelObject out =
        gson.fromJson(json, new TypeToken<TestTopLevelObject>() {}.getType());
    assertEquals(instant, out.nested);
  }
}
