package com.stripe.functional.billingportal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Session;
import com.stripe.net.ApiResource;
import com.stripe.param.billingportal.SessionCreateParams;
import org.junit.jupiter.api.Test;

public class SessionTest extends BaseStripeTest {
  public static final String SESSION_ID = "bps_123";

  @Test
  public void testCreate() throws StripeException {

    SessionCreateParams params =
        SessionCreateParams.builder()
            .setCustomer("cus_123")
            .setReturnUrl("https://stripe.com/return")
            .build();

    final Session session = Session.create(params);

    assertNotNull(session);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/billing_portal/sessions"),
        params.toMap());
  }
}
