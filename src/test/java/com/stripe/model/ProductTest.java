package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ProductTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/products/prod_123");
    final Product product = ApiResource.GSON.fromJson(data, Product.class);
    assertNotNull(product);
    assertNotNull(product.getId());
    assertEquals("product", product.getObject());
  }
}
