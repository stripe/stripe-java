package com.stripe.model.issuing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class CardholderTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/issuing/cardholders/ich_123");
    final Cardholder cardholder = ApiResource.GSON.fromJson(data, Cardholder.class);

    assertNotNull(cardholder);
    assertNotNull(cardholder.getId());
    assertEquals("issuing.cardholder", cardholder.getObject());
  }
}
