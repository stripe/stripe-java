package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PersonTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/accounts/acct_123/persons/person_123");
    final Person resource = ApiResource.GSON.fromJson(data, Person.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
