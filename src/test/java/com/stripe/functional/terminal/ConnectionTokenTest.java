package com.stripe.functional.terminal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.terminal.ConnectionToken;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ConnectionTokenTest extends BaseStripeTest {
  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();

    final ConnectionToken connectionToken = ConnectionToken.create(params);

    assertNotNull(connectionToken);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/terminal/connection_tokens"), params);
  }
}
