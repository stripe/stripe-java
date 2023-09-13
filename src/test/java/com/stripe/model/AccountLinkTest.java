package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class AccountLinkTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/account_link.json");
    final AccountLink resource = ApiResource.GSON.fromJson(data, AccountLink.class);
    assertNotNull(resource);
    assertEquals("account_link", resource.getObject());
  }
}
