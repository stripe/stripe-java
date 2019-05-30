package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.jupiter.api.Test;

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

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String orderItemsData =
        getResourceAsString("/api_fixtures/order_item_parent_expansions.json");
    Type type = new TypeToken<List<OrderItem>>() {}.getType();
    final List<OrderItem> orderItemList = ApiResource.GSON.fromJson(orderItemsData, type);
    for (int i = 0; i < orderItemList.size(); i++) {
      final OrderItem orderItem = orderItemList.get(i);
      assertNotNull(orderItem);
      assertEquals("order_item", orderItem.getObject());

      // only SKU can be expanded
      if (orderItem.getParent() != null && orderItem.getParent().startsWith("sku_")) {
        assertNotNull(orderItem.getParentObject());
        Sku sku = orderItem.getParentObject();
        assertEquals(orderItem.getParent(), sku.getId());
      } else {
        assertNull(orderItem.getParentObject());
      }
    }
  }
}
