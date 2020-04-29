package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class PriceTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/prices/price_123");
    final Price price = ApiResource.GSON.fromJson(data, Price.class);
    assertNotNull(price);
    assertNotNull(price.getId());
    assertEquals("price", price.getObject());
    assertNull(price.getProductObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "product",
    };
    final String data = getFixture("/v1/prices/price_123", expansions);
    final Price price = ApiResource.GSON.fromJson(data, Price.class);
    assertNotNull(price);
    final Product product = price.getProductObject();
    assertNotNull(product);
    assertNotNull(product.getId());
    assertEquals(price.getProduct(), product.getId());
  }
}
