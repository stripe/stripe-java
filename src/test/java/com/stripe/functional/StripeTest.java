package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import org.junit.jupiter.api.Test;

public class StripeTest extends BaseStripeTest {

  @Test
  public void testAddBetaVersion() {
    Stripe.addBetaVersion("super_cool_beta", "v1");
    assertEquals(Stripe.stripeVersion, Stripe.API_VERSION + "; super_cool_beta=v1");
    assertThrows(
        RuntimeException.class,
        () -> {
          Stripe.addBetaVersion("super_cool_beta", "v1");
        });
  }
}
