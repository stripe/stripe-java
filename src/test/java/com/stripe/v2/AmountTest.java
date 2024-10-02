package com.stripe.v2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class AmountTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final Amount amount =
        ApiResource.GSON.fromJson("{\"value\": 10, \"currency\": \"USD\"}", Amount.class);
    assertNotNull(amount);
    assertEquals(10, amount.getValue());
    assertEquals("USD", amount.getCurrency());
  }

  @Test
  public void testDeserializeExtra() throws Exception {
    final Amount amount =
        ApiResource.GSON.fromJson(
            "{\"value\": 10, \"currency\": \"USD\", \"extra\": 42}", Amount.class);
    assertNotNull(amount);
    assertEquals(10, amount.getValue());
    assertEquals("USD", amount.getCurrency());
  }

  @Test
  public void testSerialize() throws Exception {
    final String amountJson = ApiResource.GSON.toJson(new Amount(10, "USD"), Amount.class);
    assertEquals("{\"value\":10,\"currency\":\"USD\"}", amountJson);
  }
}
