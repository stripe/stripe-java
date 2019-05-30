package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ExchangeRateTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/exchange_rates/usd");
    final ExchangeRate resource = ApiResource.GSON.fromJson(data, ExchangeRate.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
