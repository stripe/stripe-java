package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class SetupAttemptTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    // Keep the fixture to have `action` deserialize properly
    final SetupAttempt resource =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/setup_attempt.json"), SetupAttempt.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
