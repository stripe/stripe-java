package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import org.junit.Test;

public class LoginLinkTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/login_link.json");
    final LoginLink link = APIResource.GSON.fromJson(data, LoginLink.class);
    assertNotNull(link);
    assertNotNull(link.getUrl());
  }
}
