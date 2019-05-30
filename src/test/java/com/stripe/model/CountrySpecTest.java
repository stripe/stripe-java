package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class CountrySpecTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/country_specs/us");
    final CountrySpec resource = ApiResource.GSON.fromJson(data, CountrySpec.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
