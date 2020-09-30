package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.SetupAttempt;
import com.stripe.model.SetupAttemptCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SetupAttemptTest extends BaseStripeTest {
  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("setup_intent", "seti_123");

    final SetupAttemptCollection setupAttempts = SetupAttempt.list(params);

    assertNotNull(setupAttempts);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/setup_attempts"), params);
  }
}
