package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Mandate;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class MandateTest extends BaseStripeTest {
  public static final String MANDATE_ID = "mandate_123";

  @Test
  public void testRetrieve() throws StripeException {
    final Mandate schedule = Mandate.retrieve(MANDATE_ID);

    assertNotNull(schedule);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/mandates/%s", MANDATE_ID));
  }
}
