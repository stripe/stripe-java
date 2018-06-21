package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class TokenTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/tokens/tok_123");
    final Token token = ApiResource.GSON.fromJson(data, Token.class);
    assertNotNull(token);
    assertNotNull(token.getId());
    assertEquals("token", token.getObject());
  }
}
