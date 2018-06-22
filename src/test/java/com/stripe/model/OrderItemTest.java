package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class OrderItemTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String orderData = getFixture("/v1/orders/or_123");
    final String itemsData = getDataAt(orderData, "items");
    final String itemData = getDataAt(itemsData, 0);
    final OrderItem orderItem = ApiResource.GSON.fromJson(itemData, OrderItem.class);
    assertNotNull(orderItem);
    assertEquals("order_item", orderItem.getObject());
  }
}
