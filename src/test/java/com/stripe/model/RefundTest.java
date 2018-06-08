package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Refund;
import com.stripe.net.APIResource;

import org.junit.Test;

public class RefundTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/refunds/re_123");
    final Refund refund = APIResource.GSON.fromJson(data, Refund.class);
    assertNotNull(refund);
    assertNotNull(refund.getId());
    assertEquals("refund", refund.getObject());
  }
}
