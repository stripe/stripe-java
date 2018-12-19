package com.stripe.model.checkout;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.checkout.Session;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class SessionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString(
        "/api_fixtures/checkout/session.json");
    final Session resource = ApiResource.GSON.fromJson(data, Session.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
