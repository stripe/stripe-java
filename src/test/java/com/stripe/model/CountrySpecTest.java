package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.CountrySpec;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class CountrySpecTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/country_specs/us");
    final CountrySpec resource = ApiResource.GSON.fromJson(data, CountrySpec.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
