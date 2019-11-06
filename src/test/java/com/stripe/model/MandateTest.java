package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class MandateTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/mandates/mandate_123");
    final Mandate resource = ApiResource.GSON.fromJson(data, Mandate.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {"payment_method"};

    final String data = getFixture("/v1/mandates/mandate_123", expansions);

    final Mandate resource = ApiResource.GSON.fromJson(data, Mandate.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    final PaymentMethod pm = resource.getPaymentMethodObject();
    assertNotNull(pm);
    assertNotNull(pm.getId());
    assertEquals(resource.getPaymentMethod(), pm.getId());
  }
}
