package com.stripe.model.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class OAuthErrorTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/oauth_fixtures/error_invalid_client.json");
    final OAuthError error = ApiResource.GSON.fromJson(data, OAuthError.class);
    assertNotNull(error);
    assertEquals("invalid_client", error.getError());
    assertEquals(
        "No authentication was provided. Send your secret API key using the Authorization "
            + "header, or as a client_secret POST parameter.",
        error.getErrorDescription());
  }
}
