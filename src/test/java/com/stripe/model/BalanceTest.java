package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Balance;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class BalanceTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/balance");
    final Balance resource = ApiResource.GSON.fromJson(data, Balance.class);
    assertNotNull(resource);
  }
}
