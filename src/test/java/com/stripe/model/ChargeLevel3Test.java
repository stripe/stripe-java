package com.stripe.model;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ChargeLevel3Test extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/charge_level3.json");
    final ChargeLevel3 object = ApiResource.GSON.fromJson(data, ChargeLevel3.class);
    assertEquals("1234", object.getMerchantReference());
    assertEquals(2, object.getLineItems().size());
  }
}
