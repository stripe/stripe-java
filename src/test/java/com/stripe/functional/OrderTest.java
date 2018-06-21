package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Order;
import com.stripe.model.OrderCollection;
import com.stripe.model.OrderReturn;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class OrderTest extends BaseStripeTest {
  public static final String ORDER_ID = "or_123";

  private Order getOrderFixture() throws StripeException {
    final Order order = Order.retrieve(ORDER_ID);
    resetNetworkSpy();
    return order;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("currency", "usd");

    final Order order = Order.create(params);

    assertNotNull(order);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/orders",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Order order = Order.retrieve(ORDER_ID);

    assertNotNull(order);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/orders/%s", ORDER_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Order order = getOrderFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("status", "fulfilled");

    final Order updatedOrder = order.update(params);

    assertNotNull(updatedOrder);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/orders/%s", order.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final OrderCollection orders = Order.list(params);

    assertNotNull(orders);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/orders",
        params
    );
  }

  @Test
  public void testPay() throws StripeException {
    final Order order = Order.retrieve(ORDER_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final Order paidOrder = order.pay(params);

    assertNotNull(paidOrder);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/orders/%s/pay", order.getId()),
        params
    );
  }

  @Test
  public void testReturn() throws StripeException {
    final Order order = Order.retrieve(ORDER_ID);

    final OrderReturn orderReturn = order.returnOrder(null);

    assertNotNull(orderReturn);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/orders/%s/returns", order.getId()),
        null
    );
  }
}
