package com.stripe.model.terminal;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class LocationTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/terminal/locations/loc_123");
    final Location location = ApiResource.GSON.fromJson(data, Location.class);

    assertNotNull(location);
  }
}
