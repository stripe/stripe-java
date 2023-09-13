package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class PromotionCodeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/promotion_codes/co_123");
    final PromotionCode resource = ApiResource.GSON.fromJson(data, PromotionCode.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "customer",
    };
    final String data = getFixture("/v1/promotion_codes/co_123", expansions);
    final PromotionCode resource = ApiResource.GSON.fromJson(data, PromotionCode.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    final Customer customer = resource.getCustomerObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertEquals(resource.getCustomer(), customer.getId());
  }
}
