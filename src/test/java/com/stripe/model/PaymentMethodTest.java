package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class PaymentMethodTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/payment_methods/pm_123");
    final PaymentMethod resource = ApiResource.GSON.fromJson(data, PaymentMethod.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
