package com.stripe.model.billingportal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ConfigurationTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/billingportal/configuration.json");
    final Configuration session = ApiResource.GSON.fromJson(data, Configuration.class);

    assertNotNull(session);
    assertNotNull(session.getId());
    assertEquals("billing_portal.configuration", session.getObject());
  }
}
