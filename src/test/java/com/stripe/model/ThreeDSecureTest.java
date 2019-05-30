package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ThreeDSecureTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/3d_secure/tds_123");
    final ThreeDSecure threeDSecure = ApiResource.GSON.fromJson(data, ThreeDSecure.class);
    assertNotNull(threeDSecure);
    assertNotNull(threeDSecure.getId());
    assertEquals("three_d_secure", threeDSecure.getObject());
  }
}
