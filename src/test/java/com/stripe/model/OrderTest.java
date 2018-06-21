package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class OrderTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/orders/or_123");
    final Order order = ApiResource.GSON.fromJson(data, Order.class);
    assertNotNull(order);
    assertNotNull(order.getId());
    assertEquals("order", order.getObject());
  }
}
