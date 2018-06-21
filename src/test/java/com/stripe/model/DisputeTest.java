package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class DisputeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/disputes/dp_123");
    final Dispute dispute = ApiResource.GSON.fromJson(data, Dispute.class);
    assertNotNull(dispute);
    assertNotNull(dispute.getId());
    assertEquals("dispute", dispute.getObject());
    assertNull(dispute.getChargeObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "charge",
    };
    final String data = getFixture("/v1/disputes/dp_123", expansions);
    final Dispute dispute = ApiResource.GSON.fromJson(data, Dispute.class);
    assertNotNull(dispute);
    final Charge charge = dispute.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(dispute.getCharge(), charge.getId());
  }
}
