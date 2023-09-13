package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class LineItemTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/line_item.json");
    final LineItem lineItem = ApiResource.GSON.fromJson(data, LineItem.class);
    assertNotNull(lineItem);
    assertNotNull(lineItem.getId());
    assertEquals("item", lineItem.getObject());
    assertEquals("price", lineItem.getPrice().getObject());
  }
}
