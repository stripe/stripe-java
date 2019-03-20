package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.jupiter.api.Test;

public class ChargeLevel3Test extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/charge_level3.json");
    final Charge.Level3 object = ApiResource.GSON.fromJson(data, Charge.Level3.class);
    assertEquals("1234", object.getMerchantReference());
    assertEquals(2, object.getLineItems().size());
  }
}
