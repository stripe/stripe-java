package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class EphemeralKeyTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/ephemeral_key.json");
    final EphemeralKey resource = ApiResource.GSON.fromJson(json, EphemeralKey.class);
    assertNotNull(resource);
    assertEquals("ephkey_123", resource.getId());
    assertEquals("ephemeral_key", resource.getObject());
  }

  @Test
  public void testRawJson() {
    final String jsonString = "{\"foo\":5,\"bar\":[\"baz\",null]}";
    final EphemeralKey key = ApiResource.GSON.fromJson(jsonString, EphemeralKey.class);
    assertEquals(jsonString, key.getRawJson());
  }
}
