package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.CheckoutSession;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class CheckoutSessionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString(
        "/api_fixtures/checkout_session.json");
    final CheckoutSession resource = ApiResource.GSON.fromJson(data, CheckoutSession.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
