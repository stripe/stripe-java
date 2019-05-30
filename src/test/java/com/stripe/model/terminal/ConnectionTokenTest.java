package com.stripe.model.terminal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ConnectionTokenTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/terminal/connection_token.json");
    final ConnectionToken connectionToken = ApiResource.GSON.fromJson(data, ConnectionToken.class);
    assertNotNull(connectionToken);
    assertNotNull(connectionToken.getSecret());
  }
}
