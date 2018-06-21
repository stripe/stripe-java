package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class OrderReturnTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/order_returns/orret_123");
    final OrderReturn orderReturn = ApiResource.GSON.fromJson(data, OrderReturn.class);
    assertNotNull(orderReturn);
    assertNotNull(orderReturn.getId());
    assertEquals("order_return", orderReturn.getObject());
    assertNull(orderReturn.getOrderObject());
    assertNull(orderReturn.getRefundObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "order",
      "refund",
    };
    final String data = getFixture("/v1/order_returns/orret_123", expansions);
    final OrderReturn orderReturn = ApiResource.GSON.fromJson(data, OrderReturn.class);
    assertNotNull(orderReturn);
    final Order order = orderReturn.getOrderObject();
    assertNotNull(order);
    assertNotNull(order.getId());
    assertEquals(orderReturn.getOrder(), order.getId());
    final Refund refund = orderReturn.getRefundObject();
    assertNotNull(refund);
    assertNotNull(refund.getId());
    assertEquals(orderReturn.getRefund(), refund.getId());
  }
}
