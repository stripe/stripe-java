package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTest extends BaseStripeTest {
  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  @Test
  public void testDeserializeWithExpansions() throws IOException {
    String json = resource("order.json");
    Order order = APIResource.GSON.fromJson(json, Order.class);
    assertEquals("or_19vkqsKCFFPkgtRh6Aarx5QP", order.getId());
    assertEquals("ch_19vnSwKCFFPkgtRhG35bOkiG", order.getChargeObject().getId());
  }

  @Test
  public void testCreate() throws StripeException {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("currency", "usd");
    List<Object> itemsList = new ArrayList<Object>();
    Map<String, Object> item1Params = new HashMap<String, Object>();
    item1Params.put("type", "sku");
    item1Params.put("parent", "sku_test");
    itemsList.add(item1Params);
    params.put("items", itemsList);
    Map<String, Object> shippingParams = new HashMap<String, Object>();
    shippingParams.put("name", "Natalie Martin");
    Map<String, Object> addressParams = new HashMap<String, Object>();
    addressParams.put("line1", "1234 Main Street");
    addressParams.put("city", "San Francisco");
    addressParams.put("state", "CA");
    addressParams.put("country", "US");
    addressParams.put("postal_code", "94111");
    shippingParams.put("address", addressParams);
    params.put("shipping", shippingParams);
    params.put("email", "natalie.martin@example.com");

    Order.create(params);

    verifyPost(Order.class, "https://api.stripe.com/v1/orders", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testRetrieve() throws StripeException {
    Order.retrieve("or_test_retrieve");

    verifyGet(Order.class, "https://api.stripe.com/v1/orders/or_test_retrieve");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testRetrieveWithExpand() throws StripeException {
    List<String> expandList = new ArrayList<String>();
    expandList.add("charge");
    expandList.add("customer");

    Map<String, Object> params = new HashMap<String, Object>();
    params.put("expand", expandList);

    Order.retrieve("or_test_retrieve", params, null);

    verifyGet(Order.class, "https://api.stripe.com/v1/orders/or_test_retrieve", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testUpdate() throws StripeException {
    Order order = new Order();
    order.setId("or_test_update");

    Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("order_id", "6735");
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);
    order.update(params);

    verifyPost(Order.class, "https://api.stripe.com/v1/orders/or_test_update", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testList() throws StripeException {
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 3);

    Order.list(params);

    verifyGet(OrderCollection.class, "https://api.stripe.com/v1/orders", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testPay() throws StripeException, IOException {
    Order order = new Order();
    order.setId("or_test_pay");

    Map<String, Object> params = new HashMap<String, Object>();
    params.put("source", "tok_foo");
    order.pay(params);

    verifyPost(Order.class, "https://api.stripe.com/v1/orders/or_test_pay/pay", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testDeserializeExpansions() throws StripeException, IOException {
    String json = resource("order_expansions.json");
    Order order = APIResource.GSON.fromJson(json, Order.class);
    assertEquals("or_1ATvaEKCFFPkgtRhFtMgtnLF", order.getId());

    OrderItem item = order.getItems().get(0);
    SKU parent = (SKU) item.getParentObjectAs();
    assertNotNull(parent);
    assertEquals("silence_mp3", parent.getId());
  }
}
