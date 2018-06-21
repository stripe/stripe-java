package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Payout;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PayoutTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/payouts/po_123");
    final Payout resource = ApiResource.GSON.fromJson(data, Payout.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
