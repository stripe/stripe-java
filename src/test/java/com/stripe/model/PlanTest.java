package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PlanTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/plans/gold");
    final Plan plan = ApiResource.GSON.fromJson(data, Plan.class);
    assertNotNull(plan);
    assertNotNull(plan.getId());
    assertEquals("plan", plan.getObject());
    assertNull(plan.getProductObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "product",
    };
    final String data = getFixture("/v1/plans/gold", expansions);
    final Plan plan = ApiResource.GSON.fromJson(data, Plan.class);
    assertNotNull(plan);
    final Product product = plan.getProductObject();
    assertNotNull(product);
    assertNotNull(product.getId());
    assertEquals(plan.getProduct(), product.getId());
  }
}
