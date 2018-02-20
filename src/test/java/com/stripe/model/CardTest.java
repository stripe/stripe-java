package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import org.junit.Test;

public class CardTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/customers/cus_123/cards/card_123");
    final Card resource = APIResource.GSON.fromJson(data, Card.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
